package com.zhe.spring_social_network.model.entities;

import com.zhe.spring_social_network.model.enums.UserRelations;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="userrelations")
public class UserRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "requester", referencedColumnName = "id")
    User requester;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "requestee", referencedColumnName = "id")
    User requestee;

    @Column(name="relation")
    UserRelations relation;

}
