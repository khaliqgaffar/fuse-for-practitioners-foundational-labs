package org.globex.globex;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Company")
public class Company {

    private String name;
    private String geo;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
