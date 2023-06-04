package com.miniProject.aeonService.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.miniProject.aeonService.dto.KaryawanDTO;
import com.miniProject.aeonService.model.Karyawan;
import com.miniProject.aeonService.service.IKaryawanService;
import com.miniProject.aeonService.repository.KaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class KaryawanService implements IKaryawanService {
	
	@Autowired
	private KaryawanRepository karyawanRepository;
	
	public void IKaryawanService(KaryawanRepository karyawanRepository) {
		this.karyawanRepository = karyawanRepository;
	}
	
	@Override
	public Optional<Karyawan> findById(Long id) {
		// TODO Auto-generated method stub
		return karyawanRepository.findById(id);
	}
	
	public void createOrUpdateKaryawan(KaryawanDTO karyawanDTO) {
		Karyawan karyawan = convertDtoToModel (karyawanDTO);
		karyawanRepository.save(karyawan);
	}
	

	public List<KaryawanDTO> getAllKaryawan(){
		List<Karyawan> List = karyawanRepository.findAll();
		List<KaryawanDTO> userList = List.stream()
				.map(KaryawanDTO::new)
				.collect(Collectors.toCollection(ArrayList::new));
		return userList;
	}
	
	private Karyawan convertDtoToModel(KaryawanDTO userDTO) {
		// TODO Auto-generated method stub
		Karyawan karyawan = new Karyawan();
		if (userDTO.getId() != 0) {
			karyawan.setId(userDTO.getId());
		}
		karyawan.setId(userDTO.getId());
		karyawan.setNama(userDTO.getNama());
		return karyawan;
	}

	private KaryawanDTO convertModelToDTO(Karyawan karyawan) {
		// TODO Auto-generated method stub
		KaryawanDTO karyawanDTO = new KaryawanDTO();
		karyawanDTO.setId(karyawan.getId());
		karyawanDTO.setNama(karyawan.getNama());
		return karyawanDTO;
	}
	public KaryawanDTO editKaryawan(Long id) {
		Karyawan karyawan = karyawanRepository.getReferenceById(id);
		return convertModelToDTO(karyawan);
	}


}
