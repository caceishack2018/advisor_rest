
package org.hackathon.packapp.containerbank.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Simple domain object representing a list of advisors. Mostly here to be used for the 'advisors' {@link
 * org.springframework.web.servlet.view.xml.MarshallingView}.
 *
 * @author Wavestone
 */

public class Advisors {

    public Advisors(List<Advisor> advisors) {
		super();
		this.advisors = advisors;
	}


	public Advisors() {
		// TODO Auto-generated constructor stub
	}


	private List<Advisor> advisors;

   
    public List<Advisor> getAdvisors() {
		return advisors;
	}


	public void setAdvisors(List<Advisor> advisors) {
		this.advisors = advisors;
	}


	public List<Advisor> getAdvisorList() {
        if (advisors == null) {
            advisors = new ArrayList<>();
        }
        return advisors;
    }

}
