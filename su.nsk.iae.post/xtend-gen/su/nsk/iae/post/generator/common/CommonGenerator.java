package su.nsk.iae.post.generator.common;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import su.nsk.iae.post.poST.Constant;
import su.nsk.iae.post.poST.IntegerLiteral;
import su.nsk.iae.post.poST.RealLiteral;
import su.nsk.iae.post.poST.SignedInteger;
import su.nsk.iae.post.poST.TimeLiteral;

@SuppressWarnings("all")
public abstract class CommonGenerator {
  protected String generateGlobalTimeName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("___global_time");
    return _builder.toString();
  }
  
  protected String getValue(final Constant value) {
    if ((value == null)) {
      return null;
    }
    if ((value instanceof IntegerLiteral)) {
      return this.getSignedInt(((IntegerLiteral)value).getValue());
    }
    if ((value instanceof RealLiteral)) {
      return NodeModelUtils.getNode(value).getText().trim();
    }
    if ((value instanceof TimeLiteral)) {
      return String.valueOf(CommonGenerator.getTimeAsMilliseconds(((TimeLiteral)value).getInterval()));
    }
    final String b = NodeModelUtils.getNode(value).getText().trim().toLowerCase();
    boolean _equals = Objects.equal(b, "true");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("1");
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("0");
    return _builder_1.toString();
  }
  
  protected String getSignedInt(final SignedInteger sInt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isISig = sInt.isISig();
      if (_isISig) {
        _builder.append("-");
      }
    }
    String _valueOf = String.valueOf(sInt.getValue());
    _builder.append(_valueOf);
    return _builder.toString();
  }
  
  protected static long getTimeAsMilliseconds(final String interval) {
    return 0;
  }
  
  protected String getCType(final String type) {
    if (type != null) {
      switch (type) {
        case "SINT":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("int");
          return _builder.toString();
        case "INT":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("int");
          return _builder_1.toString();
        case "DINT":
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("int");
          return _builder_2.toString();
        case "LINT":
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("int");
          return _builder_3.toString();
        case "USINT":
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("unsigned int");
          return _builder_4.toString();
        case "UINT":
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("unsigned int");
          return _builder_5.toString();
        case "UDINT":
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("unsigned int");
          return _builder_6.toString();
        case "ULINT":
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("unsigned int");
          return _builder_7.toString();
        case "REAL":
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("float");
          return _builder_8.toString();
        case "LREAL":
          StringConcatenation _builder_9 = new StringConcatenation();
          _builder_9.append("double");
          return _builder_9.toString();
        case "BOOL":
          StringConcatenation _builder_10 = new StringConcatenation();
          _builder_10.append("bool");
          return _builder_10.toString();
        case "BYTE":
          StringConcatenation _builder_11 = new StringConcatenation();
          _builder_11.append("byte");
          return _builder_11.toString();
        case "WORD":
          StringConcatenation _builder_12 = new StringConcatenation();
          _builder_12.append("byte");
          return _builder_12.toString();
        case "DWORD":
          StringConcatenation _builder_13 = new StringConcatenation();
          _builder_13.append("byte");
          return _builder_13.toString();
        case "LWORD":
          StringConcatenation _builder_14 = new StringConcatenation();
          _builder_14.append("byte");
          return _builder_14.toString();
        case "STRING":
          StringConcatenation _builder_15 = new StringConcatenation();
          _builder_15.append("char*");
          return _builder_15.toString();
        case "WSTRING":
          StringConcatenation _builder_16 = new StringConcatenation();
          _builder_16.append("char*");
          return _builder_16.toString();
      }
    }
    return null;
  }
}
