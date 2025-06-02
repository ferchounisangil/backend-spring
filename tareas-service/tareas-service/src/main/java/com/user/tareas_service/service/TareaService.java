package com.user.tareas_service.service;

import com.user.tareas_service.model.Tarea;
import com.user.tareas_service.repository.TareaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TareaService {

    private final TareaRepository tareaRepository;

    public Tarea crearTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public Optional<Tarea> obtenerTarea(Long id) {
        return tareaRepository.findById(id);
    }

    public List<Tarea> listarTareas() {
        return tareaRepository.findAll();
    }

    public List<Tarea> listarTareasPorEstado(Boolean completado) {
        return tareaRepository.findByCompletado(completado);
    }

    public Tarea actualizarTarea(Long id, Tarea tarea) {
        tarea.setId(id);
        return tareaRepository.save(tarea);
    }

    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }

}
