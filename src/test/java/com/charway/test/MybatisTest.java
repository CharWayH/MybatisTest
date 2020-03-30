package com.charway.test;

import com.charwayh.dao.TeamDao;
import com.charwayh.domain.Team;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    TeamDao dao;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        dao = session.getMapper(TeamDao.class);
    }
    @After
    public void destory() throws IOException {
        session.commit();
        session.close();
        in.close();
    }


    @Test
   public void testFindAll() {
        TeamDao dao = session.getMapper(TeamDao.class);
        List<Team> teams = dao.findAll();
        for(Team team:teams){
            System.out.println(team);
        }
    }

    @Test
    public void testAddTeam(){
        Team team = new Team();
        team.setTeamName("巴塞罗那");
        team.settEnglishName("basa");
        team.setLeagueName("西甲");
        team.setCity("巴塞罗那");
        dao.addTeam(team);
    }


    @Test
    public void testUpdateTeam(){
        Team team = new Team();
        team.setTid(84);
        team.setTeamName("巴塞罗那");
        team.settEnglishName("Barcelona");
        team.setLeagueName("西甲");
        team.setCity("巴塞罗那");
        dao.updateTeam(team);
    }

    @Test
    public void testDeleteTeam(){
        dao.deleteTeam(84);
    }

    @Test
    public void testTeamById(){
        Team team = dao.findTeamById(2);
        System.out.println(team);
    }

    @Test
    public void testTeamByCity(){
        List<Team> teams = dao.findTeamByCiy("%伦敦%");
        System.out.println(teams.toArray().length);
        for (Team team : teams) {
            System.out.println(team);
        }
    }

    @Test
    public void testTotalTeam(){
        int teamNum = dao.totalTeam();
        System.out.println("球队总数为：" + teamNum);
    }
}
