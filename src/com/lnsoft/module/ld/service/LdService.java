package com.lnsoft.module.ld.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebService;
@WebService
public interface LdService {

	ArrayList<String> readFileBydate(String date);

	// 对外
	void insertLdVisit(HashMap<String, Object> visitMap);

	HashMap<String, Object> queryLdVisitAll(Integer page, Integer rows);

}
