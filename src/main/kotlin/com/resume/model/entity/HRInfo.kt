package com.resume.model.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hr_info_table")
data class HRInfo(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private val id : Int,
    private val feedbackMethod :String,
    private val message : String
) {

}