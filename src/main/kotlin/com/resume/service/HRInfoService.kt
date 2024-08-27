package com.resume.service

import com.resume.model.entity.HRInfo
import com.resume.repository.HRInfoRepository
import org.springframework.stereotype.Service

@Service
class HRInfoService(private val hrInfoRepository: HRInfoRepository) {
    fun save(hrInfo: HRInfo) {
        hrInfoRepository.save(hrInfo)
    }

}