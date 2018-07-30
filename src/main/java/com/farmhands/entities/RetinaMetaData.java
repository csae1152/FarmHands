package com.farmhands.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;



/**
 *
 * @author Helmut
 */
@Entity
@Data
public class RetinaMetaData implements Serializable {

    @Id
    private Long id;
    
    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
