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
    String str = interval.replaceAll("ms", "q");
    int res = 0;
    boolean _contains = str.contains("d");
    if (_contains) {
      int _res = res;
      Integer _valueOf = Integer.valueOf(str.substring(0, str.indexOf("d")));
      int _multiply = ((_valueOf).intValue() * 86400000);
      res = (_res + _multiply);
      int _indexOf = str.indexOf("d");
      int _plus = (_indexOf + 1);
      str = str.substring(_plus);
    }
    boolean _contains_1 = str.contains("h");
    if (_contains_1) {
      int _res_1 = res;
      Integer _valueOf_1 = Integer.valueOf(str.substring(0, str.indexOf("h")));
      int _multiply_1 = ((_valueOf_1).intValue() * 3600000);
      res = (_res_1 + _multiply_1);
      int _indexOf_1 = str.indexOf("h");
      int _plus_1 = (_indexOf_1 + 1);
      str = str.substring(_plus_1);
    }
    boolean _contains_2 = str.contains("m");
    if (_contains_2) {
      int _res_2 = res;
      Integer _valueOf_2 = Integer.valueOf(str.substring(0, str.indexOf("m")));
      int _multiply_2 = ((_valueOf_2).intValue() * 60000);
      res = (_res_2 + _multiply_2);
      int _indexOf_2 = str.indexOf("m");
      int _plus_2 = (_indexOf_2 + 1);
      str = str.substring(_plus_2);
    }
    boolean _contains_3 = str.contains("s");
    if (_contains_3) {
      int _res_3 = res;
      Integer _valueOf_3 = Integer.valueOf(str.substring(0, str.indexOf("s")));
      int _multiply_3 = ((_valueOf_3).intValue() * 1000);
      res = (_res_3 + _multiply_3);
      int _indexOf_3 = str.indexOf("s");
      int _plus_3 = (_indexOf_3 + 1);
      str = str.substring(_plus_3);
    }
    boolean _contains_4 = str.contains("q");
    if (_contains_4) {
      int _res_4 = res;
      Integer _valueOf_4 = Integer.valueOf(str.substring(0, str.indexOf("q")));
      res = (_res_4 + (_valueOf_4).intValue());
    }
    return res;
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
