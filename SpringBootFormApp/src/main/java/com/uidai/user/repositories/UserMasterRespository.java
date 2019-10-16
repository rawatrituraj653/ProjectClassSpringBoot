package com.uidai.user.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uidai.user.entity.UserEntity;
/**
 * This is Repository which is extending property from Jpa Repository.
 * @author Rituraj
 */
@Repository
public interface UserMasterRespository extends JpaRepository<UserEntity, Serializable>{

}
