package com.miniProject.aeonService.service;

import com.miniProject.aeonService.dto.KaryawanDTO;
import com.miniProject.aeonService.model.Karyawan;

import java.util.List;
import java.util.Optional;


public interface IKaryawanService {
	
	public void createOrUpdateKaryawan(KaryawanDTO empDTO);
	
	public List<KaryawanDTO> getAllKaryawan();
	
	Optional<Karyawan> findById(Long id);
	public KaryawanDTO editKaryawan(Long id);
	
	void deleteKaryawan(Long id);

}
