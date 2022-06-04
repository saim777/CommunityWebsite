package com.communitywebsite.repository;

import com.communitywebsite.model.CommunityPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommunityPostRepository extends JpaRepository<CommunityPostEntity,Long> {
}
