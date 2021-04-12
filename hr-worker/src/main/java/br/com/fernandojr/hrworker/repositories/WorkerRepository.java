package br.com.fernandojr.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernandojr.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
