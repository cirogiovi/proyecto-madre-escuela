package com.escuela.ms_aulas.mapper;

import com.escuela.ms_aulas.controller.dto.AulaDto;
import com.escuela.ms_aulas.domain.Aula;
import org.springframework.stereotype.Component;

@Component
public class AulaMapperImpl implements AulaMapper {

    @Override
    public AulaDto toDto(Aula entity) {
        if (entity == null) {
            return null;
        }

        AulaDto dto = new AulaDto();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setUbicacion(entity.getUbicacion());
        dto.setCapacidad(entity.getCapacidad());
        dto.setActiva(entity.getActiva());

        return dto;
    }

    @Override
    public Aula toEntity(AulaDto dto) {
        if (dto == null) {
            return null;
        }

        Aula entity = new Aula();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setUbicacion(dto.getUbicacion());
        entity.setCapacidad(dto.getCapacidad());
        entity.setActiva(dto.getActiva());

        return entity;
    }
}