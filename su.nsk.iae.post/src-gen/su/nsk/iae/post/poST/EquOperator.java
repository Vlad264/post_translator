/**
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.poST;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Equ Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see su.nsk.iae.post.poST.PoSTPackage#getEquOperator()
 * @model
 * @generated
 */
public enum EquOperator implements Enumerator
{
  /**
   * The '<em><b>LESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_VALUE
   * @generated
   * @ordered
   */
  LESS(0, "LESS", "<"),

  /**
   * The '<em><b>GREATER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_VALUE
   * @generated
   * @ordered
   */
  GREATER(1, "GREATER", ">"),

  /**
   * The '<em><b>LESS EQU</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_EQU_VALUE
   * @generated
   * @ordered
   */
  LESS_EQU(2, "LESS_EQU", "<="),

  /**
   * The '<em><b>GREATER EQU</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_EQU_VALUE
   * @generated
   * @ordered
   */
  GREATER_EQU(3, "GREATER_EQU", ">=");

  /**
   * The '<em><b>LESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS
   * @model literal="&lt;"
   * @generated
   * @ordered
   */
  public static final int LESS_VALUE = 0;

  /**
   * The '<em><b>GREATER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER
   * @model literal="&gt;"
   * @generated
   * @ordered
   */
  public static final int GREATER_VALUE = 1;

  /**
   * The '<em><b>LESS EQU</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_EQU
   * @model literal="&lt;="
   * @generated
   * @ordered
   */
  public static final int LESS_EQU_VALUE = 2;

  /**
   * The '<em><b>GREATER EQU</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_EQU
   * @model literal="&gt;="
   * @generated
   * @ordered
   */
  public static final int GREATER_EQU_VALUE = 3;

  /**
   * An array of all the '<em><b>Equ Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EquOperator[] VALUES_ARRAY =
    new EquOperator[]
    {
      LESS,
      GREATER,
      LESS_EQU,
      GREATER_EQU,
    };

  /**
   * A public read-only list of all the '<em><b>Equ Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EquOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Equ Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EquOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EquOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Equ Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EquOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EquOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Equ Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EquOperator get(int value)
  {
    switch (value)
    {
      case LESS_VALUE: return LESS;
      case GREATER_VALUE: return GREATER;
      case LESS_EQU_VALUE: return LESS_EQU;
      case GREATER_EQU_VALUE: return GREATER_EQU;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EquOperator(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EquOperator
