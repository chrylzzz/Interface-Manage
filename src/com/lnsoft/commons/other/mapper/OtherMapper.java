package com.lnsoft.commons.other.mapper;

import org.springframework.stereotype.Component;

@Component
public interface OtherMapper {

	int queryCountByEMS();

	int queryCountByPMS();

	int queryCountByDDJC();

	int queryCountByLD();

	int queryCountByGZLB();

	int queryCountByQXZHYJ();

	int queryCountBySBDZJC();

}
