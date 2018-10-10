
package org.hackathon.packapp.containerbank.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


/**
 * Simple JavaBean domain object adds a name property to <code>BaseEntity</code>. Used as a base class for objects
 * needing these properties.
 *
 * @author Wavestone
 */
@MappedSuperclass
public class NamedEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return this.name;
    }

    public NamedEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NamedEntity(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public NamedEntity(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
