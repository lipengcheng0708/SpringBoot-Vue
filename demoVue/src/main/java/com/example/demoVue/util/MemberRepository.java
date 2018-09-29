package com.example.demoVue.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: Gosin
 * @Date: 2018-09-28 8:33
 */
public interface MemberRepository extends JpaRepository<Member, String>, JpaSpecificationExecutor<Member> {

}
