package su.nsk.iae.post.generator.common;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("all")
public class TaskData {
  private String name;
  
  private String programCall;
  
  private List<String> inVars = new LinkedList<String>();
  
  private List<String> outVars = new LinkedList<String>();
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setProgramCall(final String programCall) {
    this.programCall = programCall;
  }
  
  public String getProgramCall() {
    return this.programCall;
  }
  
  public List<String> getInVars() {
    return this.inVars;
  }
  
  public List<String> getOutVars() {
    return this.outVars;
  }
}
