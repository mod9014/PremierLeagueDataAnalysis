package com.epl.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epl.team.service.TeamServiceImpl;
import com.epl.vo.Stadium;
import com.epl.vo.Team;


@RestController
public class TeamRestController {
	@Autowired private TeamServiceImpl teamService;
	
	@PostMapping("/getStadiumList")
	public List<Stadium> getStadiumList(){
		List<Stadium> list = teamService.getStadiumList();
		return list;
	}
	
	@PostMapping("/getTeamList")
	public List<Team> getTeamList(){
		List<Team> list = teamService.getTeamList();
		System.out.println("list:"+list);
		return list;
	}
	
}