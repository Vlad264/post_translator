package su.nsk.iae.post.generator.common.vars.data;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class VarData {
  private final String name;
  
  private final String type;
  
  private final String value;
  
  private final boolean isConst;
  
  public VarData(final String name, final String type, final String value, final boolean isConst) {
    super();
    this.name = name;
    this.type = type;
    this.value = value;
    this.isConst = isConst;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.name== null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.type== null) ? 0 : this.type.hashCode());
    result = prime * result + ((this.value== null) ? 0 : this.value.hashCode());
    return prime * result + (this.isConst ? 1231 : 1237);
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    VarData other = (VarData) obj;
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    if (this.type == null) {
      if (other.type != null)
        return false;
    } else if (!this.type.equals(other.type))
      return false;
    if (this.value == null) {
      if (other.value != null)
        return false;
    } else if (!this.value.equals(other.value))
      return false;
    if (other.isConst != this.isConst)
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("name", this.name);
    b.add("type", this.type);
    b.add("value", this.value);
    b.add("isConst", this.isConst);
    return b.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  @Pure
  public String getValue() {
    return this.value;
  }
  
  @Pure
  public boolean isConst() {
    return this.isConst;
  }
}
