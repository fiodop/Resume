package com.resume.repository

import com.resume.model.entity.HRInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HRInfoRepository : JpaRepository<HRInfo, Int>{

}