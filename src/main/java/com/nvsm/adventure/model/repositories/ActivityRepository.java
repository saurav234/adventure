package com.nvsm.adventure.model.repositories;

import com.nvsm.adventure.model.BaseActivity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<BaseActivity, Long> {

}
