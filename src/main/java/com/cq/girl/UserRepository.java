package com.cq.girl;

import com.cq.girl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer>{
}
