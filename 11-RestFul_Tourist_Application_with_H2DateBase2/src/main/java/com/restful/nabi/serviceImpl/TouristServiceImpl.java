package com.restful.nabi.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.nabi.exception.TouristNotFoundException;
import com.restful.nabi.model.Tourist;
import com.restful.nabi.repo.TouristRepo;
import com.restful.nabi.service.TouristService;

@Service
public class TouristServiceImpl implements TouristService {

	@Autowired
	private TouristRepo  touristRepo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		int tourId = touristRepo.save(tourist).getTid();
		return "Tourist is Register having the Id Value ::"+tourId;
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> list= touristRepo.findAll();
		list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public Tourist fetchTouristById(Integer tid)throws TouristNotFoundException {
		return touristRepo.findById(tid)
		.orElseThrow(()->new TouristNotFoundException
				(tid+"Not Found Tourist"));
	}

	@Override
	public String updateTourist(Tourist tourist) throws TouristNotFoundException {
		Optional<Tourist> optional= touristRepo.findById(tourist.getTid());
		if (optional.isPresent()) {
			return "ID  "+ tourist.getTid()+"   Tourist Details Updated";
		} else {
			throw new TouristNotFoundException(tourist.getTid()+"  Tourist Not Found");
		}
				
	}

	@Override
	public String deltedTourist(Integer tid) throws TouristNotFoundException {
		Optional<Tourist> optional= touristRepo.findById(tid);
		if (optional.isPresent()) {
			touristRepo.delete(optional.get());
			return tid+"   Tourist Recoded Deleted . .";
		} else {
			throw new TouristNotFoundException(tid+"  Tourist is Not Found .");
		}
		
	}

}
