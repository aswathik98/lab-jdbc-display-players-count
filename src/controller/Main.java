package controller;

import java.sql.Connection;
import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;
import utility.ConnectionManager;

public class Main{
	
	public static void main(String[] args) throws Exception {
		ConnectionManager cm = new ConnectionManager();
		Connection conn = cm.getConnection();
		
SkillDAO skilldao = new SkillDAO();
		
		TreeMap<Integer,Skill> map = new TreeMap<Integer,Skill>();
		map=skilldao.skillCount();
		System.out.println("Skill"+"\t"+"Players");
		
		for(Entry<Integer,Skill> e: map.entrySet())
		{
			int  count=e.getKey();
			Skill skill=e.getValue();
			System.out.println(skill.getSkillName() + "\t" + count);
		}	
	}
}
