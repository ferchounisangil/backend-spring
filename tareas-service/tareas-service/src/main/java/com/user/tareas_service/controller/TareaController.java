package com.user.tareas_service.controller;

import com.user.tareas_service.model.Tarea;
import com.user.tareas_service.service.TareaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tareas")
@RequiredArgsConstructor
public class TareaController {
    private final TareaService tareaService;

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareaService.crearTarea(tarea);
    }

    @GetMapping("/{id}")
    public Optional<Tarea> obtenerTarea(@PathVariable Long id) {
        return tareaService.obtenerTarea(id);
    }

    @GetMapping
    public List<Tarea> listarTareas() {
        return tareaService.listarTareas();
    }

    @GetMapping("/completadas/{estado}")
    public List<Tarea> listarTareasPorEstado(@PathVariable Boolean estado) {
        return tareaService.listarTareasPorEstado(estado);
    }

    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }

}
