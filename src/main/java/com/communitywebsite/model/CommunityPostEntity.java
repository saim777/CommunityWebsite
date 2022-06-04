package com.communitywebsite.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "community_post")
@Builder
public class CommunityPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateAndTime;

    private String title;

    private String body;

    private String category;

    private String userName;

    /*@ManyToOne(
            fetch = FetchType.EAGER,
            cascade =CascadeType.ALL,
            optional = false
    )
    @JoinColumn(name = "user_id")
    private UserEntity user;*/
}
