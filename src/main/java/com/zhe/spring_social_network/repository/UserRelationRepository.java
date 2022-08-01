package com.zhe.spring_social_network.repository;

import com.zhe.spring_social_network.model.entities.UserRelation;
import com.zhe.spring_social_network.model.enums.UserRelations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRelationRepository extends JpaRepository<UserRelation, Long> {
    @Modifying
    @Query(value = "UPDATE UserRelation u SET u.relation = :relation where u.id = :id")
    void changeUserRelation(@Param("id") Long id, @Param("relation") UserRelations relation);

}
