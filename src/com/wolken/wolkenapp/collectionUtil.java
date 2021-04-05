package com.wolken.wolkenapp;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.wolken.wolkenapp.DTO.Games;
import com.wolken.wolkenapp.DTO.BookDTO;

public class collectionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Games dto=new Games("offline");
		dto.setName("NFS");
		dto.setNoOfPlayers(3);
		dto.setRating(3.0);
	String nana="nani";
	//List<String> words=List.Of("rat","cat");
	List<BookDTO> collection=new ArrayList<BookDTO>();
	List<BookDTO> collection1=new LinkedList<BookDTO>();
	//collection.add(dto);
	//collection.add(nana);
	collection.add(new BookDTO(123,"yana","dn","edition","sl",89,"story"));
	collection.add(new BookDTO(124,"abc","as","edi","karv",99,"crime"));
	collection.add(new BookDTO(12,"jhu","kn","etion","kl",79,"tory"));
	for(Object obj:collection) {
		System.out.println("1"+obj);
	}
	//collection.add(2);
	//collection.add(3);
	collection1.addAll(collection);
	collection.removeAll(collection);
	Iterator<BookDTO> itr=collection1.iterator();
	while(itr.hasNext()) {
		//Integer obj=(Integer)itr.next();
		Object obj=itr.next();
		System.out.println(obj);
		System.out.println("****");
		
		
		
	}
	
	
System.out.println(collection1.remove(0));
System.out.println("****");
	while(itr.hasNext()) {
		Object obj=itr.next();
		System.out.println(obj);
		
	}
	
	
	
	
		

	}
	

}
