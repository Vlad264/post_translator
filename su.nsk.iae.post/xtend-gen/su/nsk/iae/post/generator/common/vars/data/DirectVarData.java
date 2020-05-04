package su.nsk.iae.post.generator.common.vars.data;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class DirectVarData {
  public enum Type {
    INPUT,
    
    OUTPUT,
    
    MEMORY;
  }
  
  private DirectVarData.Type type;
  
  private int size;
  
  private List<Integer> address;
  
  public DirectVarData(final String directStr) {
    String str = directStr.substring(1);
    this.parseType(str);
    str = str.substring(1);
    this.parseSize(str);
    str = str.substring(1);
    this.parseAddress(str);
  }
  
  public DirectVarData(final DirectVarData.Type type, final int size, final List<Integer> address) {
    this.type = type;
    this.size = size;
    this.address = address;
  }
  
  public void setType(final DirectVarData.Type type) {
    this.type = type;
  }
  
  public DirectVarData.Type getType() {
    return this.type;
  }
  
  public void setSize(final int size) {
    this.size = size;
  }
  
  public int getSize() {
    return this.size;
  }
  
  public void setAddress(final List<Integer> address) {
    this.address = address;
  }
  
  public List<Integer> getAddress() {
    return this.address;
  }
  
  private void parseType(final String str) {
    boolean _matched = false;
    boolean _startsWith = str.startsWith("I");
    if (_startsWith) {
      _matched=true;
      this.type = DirectVarData.Type.INPUT;
    }
    if (!_matched) {
      boolean _startsWith_1 = str.startsWith("Q");
      if (_startsWith_1) {
        _matched=true;
        this.type = DirectVarData.Type.OUTPUT;
      }
    }
    if (!_matched) {
      boolean _startsWith_2 = str.startsWith("M");
      if (_startsWith_2) {
        _matched=true;
        this.type = DirectVarData.Type.MEMORY;
      }
    }
  }
  
  private void parseSize(final String str) {
    boolean _matched = false;
    boolean _startsWith = str.startsWith("X");
    if (_startsWith) {
      _matched=true;
      this.size = 1;
    }
    if (!_matched) {
      boolean _startsWith_1 = str.startsWith("B");
      if (_startsWith_1) {
        _matched=true;
        this.size = 8;
      }
    }
    if (!_matched) {
      boolean _startsWith_2 = str.startsWith("W");
      if (_startsWith_2) {
        _matched=true;
        this.size = 16;
      }
    }
    if (!_matched) {
      boolean _startsWith_3 = str.startsWith("D");
      if (_startsWith_3) {
        _matched=true;
        this.size = 32;
      }
    }
    if (!_matched) {
      boolean _startsWith_4 = str.startsWith("L");
      if (_startsWith_4) {
        _matched=true;
        this.size = 64;
      }
    }
  }
  
  private void parseAddress(final String str) {
    final String[] arr = str.split("\\.");
    ArrayList<Integer> _arrayList = new ArrayList<Integer>();
    this.address = _arrayList;
    for (final String s : arr) {
      this.address.add(Integer.valueOf(s));
    }
  }
}
