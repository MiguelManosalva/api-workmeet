package hware.workmeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import hware.workmeet.model.Reunion;

public interface IReunionRepo extends  JpaRepository<Reunion, Integer> {

}
