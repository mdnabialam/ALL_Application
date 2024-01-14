package com.springboot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.springboot.model.FriendList;
import com.springboot.repository.FriendRepository;

@SpringBootApplication
public class Application {

	

	public static void main(String[] args) {
		ConfigurableApplicationContext c =	SpringApplication.run(Application.class, args);
		FriendRepository friendRepository= c.getBean(FriendRepository.class);
		/*
		FriendList friendList= new FriendList();
		friendList.setFId(101);
		friendList.setFname("Tahir");
		friendList.setAge(25);
		friendList.setEmail("tahir@gmail.com");
		friendList.setHomecity("Patna");
		friendRepository.save(friendList);
		System.out.println("Success Added Friend List");
		*/
		/*
		 * private Integer fId;
	private String Fname;
	private String email;
	private Integer age;
	private String homecity;
	
		 */
		
		FriendList f1= new FriendList(106,"akram","akram@gmail.com",23,"Japan");
		FriendList f2= new FriendList(107,"NABI","nabi@gmail.com",25,"IND");
		FriendList f3= new FriendList(108,"RAJIK","rajik@gmail.com",21,"MADINA");
		FriendList f4= new FriendList(109,"Jishan","jishan@gmail.com",20,"MAKKA");
		
		friendRepository.saveAll(Arrays.asList(f1,f2,f3,f4));
		System.out.println("Success Addes Friend in List ");		
		
			
			  Optional<FriendList> byId = friendRepository.findById(102);
			  if (byId.isPresent()) {
				System.out.println(byId.get());
			}
		
			  
		Iterable<FriendList> allById = friendRepository.findAllById(Arrays.asList(103,101,105));
		allById.forEach(friend ->{
			System.out.println(friend);
		});
		
		Iterable<FriendList> all = friendRepository.findAll();
		all.forEach(friend ->{
			System.out.println(friend);
		});
		
		
		long count = friendRepository.count();
		System.out.println("Totel Friends of Number "+count);
		
		//friendRepository.deleteById(105);
		
		Iterable<FriendList> all1 = friendRepository.findAll();
		all1.forEach(friend ->{
			System.out.println(friend);
		});
		
		System.out.println("+++++++++++++++++++++++++++++");
		List<FriendList> friendLists=(List<FriendList>) friendRepository.findAll();
		List<FriendList> fri= friendRepository.findAll(Sort.by("age").ascending());
		
		fri.forEach(fri1 ->{
			System.out.println(fri1);
		});
		
			friendLists.forEach(friend ->{
				System.out.println(friend);
			});
		
			
			System.out.println("====== Pagination ======");
			
			int pagesize=2;
			int pageno=3;
			
			PageRequest pageRequest= PageRequest.of(pageno-1, pagesize);
			org.springframework.data.domain.Page<FriendList> page= friendRepository.findAll(pageRequest);
			int totelpage = page.getTotalPages();
			System.out.println("Totel Number Page : "+totelpage);
			
			List<FriendList> friendLists2= page.getContent();
			friendLists2.forEach( friend ->{
				System.out.println(friend);
			});
			
			
		
		List<FriendList>  newlist = friendRepository.findAll(Sort.by("age","homecity").descending());
		newlist.forEach(frie ->{
			System.out.println(frie);
		});
			
	}

}
