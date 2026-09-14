package com.escuela.ms_aulas.mapper;

public interface IMapper<D, E> {
    
    D toDto(E entity);
    
    E toEntity(D dto);
}