package com.lala.springredditclone.model;


import javax.persistence.*;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long userId;
	

}
