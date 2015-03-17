package br.ajackson.persistencia;

import java.util.List;

public interface DAO<Type, pk_type> {

	public Type find(pk_type id);
	
	public void insert(Type t);
	
	public void update(Type t);
	
	public void delete(Type t);
	
	public List<Type> findAll();
	
}
