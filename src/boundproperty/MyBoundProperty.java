/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author nemishappy
 */
public class MyBoundProperty implements Serializable {
    
    public static final String DATA_PROPERTY = "data";
    
    private String data;
    
    private PropertyChangeSupport propertySupport;
    
    public MyBoundProperty() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getReport() {
        return data;
    }
    
    public void setReport(String value) {
        String oldValue = data;
        data = value;
        propertySupport.firePropertyChange(DATA_PROPERTY, oldValue, data);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
