/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Greedy Quantifiers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getGreedyQuantifiers()
 * @model
 * @generated
 */
public enum GreedyQuantifiers implements Enumerator
{
  /**
   * The '<em><b>Once</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONCE_VALUE
   * @generated
   * @ordered
   */
  ONCE(0, "Once", "Once"),

  /**
   * The '<em><b>Zero Or More</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZERO_OR_MORE_VALUE
   * @generated
   * @ordered
   */
  ZERO_OR_MORE(1, "ZeroOrMore", "ZeroOrMore"),

  /**
   * The '<em><b>One Or More</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_OR_MORE_VALUE
   * @generated
   * @ordered
   */
  ONE_OR_MORE(2, "OneOrMore", "OneOrMore"),

  /**
   * The '<em><b>Zero Or One</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZERO_OR_ONE_VALUE
   * @generated
   * @ordered
   */
  ZERO_OR_ONE(3, "ZeroOrOne", "ZeroOrOne");

  /**
   * The '<em><b>Once</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONCE
   * @model name="Once"
   * @generated
   * @ordered
   */
  public static final int ONCE_VALUE = 0;

  /**
   * The '<em><b>Zero Or More</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZERO_OR_MORE
   * @model name="ZeroOrMore"
   * @generated
   * @ordered
   */
  public static final int ZERO_OR_MORE_VALUE = 1;

  /**
   * The '<em><b>One Or More</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_OR_MORE
   * @model name="OneOrMore"
   * @generated
   * @ordered
   */
  public static final int ONE_OR_MORE_VALUE = 2;

  /**
   * The '<em><b>Zero Or One</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZERO_OR_ONE
   * @model name="ZeroOrOne"
   * @generated
   * @ordered
   */
  public static final int ZERO_OR_ONE_VALUE = 3;

  /**
   * An array of all the '<em><b>Greedy Quantifiers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final GreedyQuantifiers[] VALUES_ARRAY =
    new GreedyQuantifiers[]
    {
      ONCE,
      ZERO_OR_MORE,
      ONE_OR_MORE,
      ZERO_OR_ONE,
    };

  /**
   * A public read-only list of all the '<em><b>Greedy Quantifiers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<GreedyQuantifiers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Greedy Quantifiers</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GreedyQuantifiers get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GreedyQuantifiers result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Greedy Quantifiers</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GreedyQuantifiers getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GreedyQuantifiers result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Greedy Quantifiers</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static GreedyQuantifiers get(int value)
  {
    switch (value)
    {
      case ONCE_VALUE: return ONCE;
      case ZERO_OR_MORE_VALUE: return ZERO_OR_MORE;
      case ONE_OR_MORE_VALUE: return ONE_OR_MORE;
      case ZERO_OR_ONE_VALUE: return ZERO_OR_ONE;
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
  private GreedyQuantifiers(int value, String name, String literal)
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
  
} //GreedyQuantifiers
