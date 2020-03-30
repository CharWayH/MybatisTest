package com.charwayh.dao;

import com.charwayh.domain.Team;

import java.util.List;

public interface TeamDao {
    /**
     * 查询所有队伍
     * @return
     */
    List<Team> findAll();

    /**
     * 添加队伍
     * @param team
     */
    void addTeam(Team team);

    /**
     *  更新队伍信息
     * @param team
     */
    void updateTeam(Team team);

    /**
     * @根据id删除球队
     * @param tid
     */
    void deleteTeam(int tid);

    /**
     * @根据id删除球队
     * @param tid
     */
    Team findTeamById(int tid);

    /**
     * 根据城市查询球队
     * @param name
     * @return
     */
    List<Team> findTeamByCiy(String name);

    /**
     * 总球队数
     * @return
     */
    int totalTeam();
}

