package com.nt.service;

import com.nt.bo.CricketerAvgBo;
import com.nt.dao.CricketerAvgDaoImpl;
import com.nt.dto.CricketerAvgDto;

public class CricketerAvgServiceImpl implements CricketerAvgService {
	CricketerAvgBo bo=new CricketerAvgBo();
	private CricketerAvgDaoImpl dao;
	
	
	public CricketerAvgServiceImpl(CricketerAvgDaoImpl dao) {
		
		this.dao = dao;
	}


	public String calculateAvg(CricketerAvgDto dto) throws Exception
	{
		float battingavg=(dto.getRunsscored()/dto.getGotout());
		float bowlingavg=(dto.getRunsgiven()/dto.getWicketstaken());
		bo.setBattingavg(battingavg);
		bo.setBowlingavg(bowlingavg);
		bo.setName(dto.getName());
		bo.setRunsscored(dto.getRunsscored());
		bo.setGotout(dto.getGotout());
		bo.setRunsgiven(dto.getRunsgiven());
		bo.setWicketstaken(dto.getWicketstaken());
		int count=dao.insert(bo);
		if(count==0)
			return "record failed to insert for:"+dto.getName()+"with battingavg:"+battingavg+"and with bowlingavg:"+bowlingavg;
		else
			return "record succesfully inserted for:"+dto.getName()+" with battingavg:"+battingavg+" and with bowlingavg:"+bowlingavg;
		
	}

}