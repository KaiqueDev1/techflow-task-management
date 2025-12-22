package com.techflow.taskmanager.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    @Enumerated(EnumType.STRING)
    private TaskPriority prioridade;
    private LocalDateTime criadoEm;

    @PrePersist
    protected void onCreate() {
        this.criadoEm = LocalDateTime.now()
    }

    public Long getId() {return id;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo}
    public String getDescricao() {return descricao;}
    public void getDescricao(String descricao) {this.descricao = descricao;}
    public TaskStatus getStatus() {return status;}
    public void setStatus(TaskStatus status) {this.status = status;}
    public TaskPriority getPrioridade() { return prioridade; }
    public void setPrioridade(TaskPriority prioridade) { this.prioridade = prioridade; }
    public LocalDateTime getCriadoEm() { return criadoEm; }
}
