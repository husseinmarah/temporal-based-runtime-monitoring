/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.constraint.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyDslSwitch<Adapter> modelSwitch =
    new MyDslSwitch<Adapter>()
    {
      @Override
      public Adapter casePatternModel(PatternModel object)
      {
        return createPatternModelAdapter();
      }
      @Override
      public Adapter caseQueryInitialization(QueryInitialization object)
      {
        return createQueryInitializationAdapter();
      }
      @Override
      public Adapter casePatternInitialization(PatternInitialization object)
      {
        return createPatternInitializationAdapter();
      }
      @Override
      public Adapter caseComplexInitialization(ComplexInitialization object)
      {
        return createComplexInitializationAdapter();
      }
      @Override
      public Adapter caseComplexPatternStatements(ComplexPatternStatements object)
      {
        return createComplexPatternStatementsAdapter();
      }
      @Override
      public Adapter caseComplexPatternType(ComplexPatternType object)
      {
        return createComplexPatternTypeAdapter();
      }
      @Override
      public Adapter caseComplexPatternOptions(ComplexPatternOptions object)
      {
        return createComplexPatternOptionsAdapter();
      }
      @Override
      public Adapter caseInputStatement(InputStatement object)
      {
        return createInputStatementAdapter();
      }
      @Override
      public Adapter casePatternStatement(PatternStatement object)
      {
        return createPatternStatementAdapter();
      }
      @Override
      public Adapter casePatternType(PatternType object)
      {
        return createPatternTypeAdapter();
      }
      @Override
      public Adapter casePatternOptions(PatternOptions object)
      {
        return createPatternOptionsAdapter();
      }
      @Override
      public Adapter caseOccurenceAtTime(OccurenceAtTime object)
      {
        return createOccurenceAtTimeAdapter();
      }
      @Override
      public Adapter caseOccurenceAtLeast(OccurenceAtLeast object)
      {
        return createOccurenceAtLeastAdapter();
      }
      @Override
      public Adapter caseOccurenceAtMost(OccurenceAtMost object)
      {
        return createOccurenceAtMostAdapter();
      }
      @Override
      public Adapter caseOccurenceAtNotSpecificTime(OccurenceAtNotSpecificTime object)
      {
        return createOccurenceAtNotSpecificTimeAdapter();
      }
      @Override
      public Adapter caseTimer(Timer object)
      {
        return createTimerAdapter();
      }
      @Override
      public Adapter caseMaxDuration(MaxDuration object)
      {
        return createMaxDurationAdapter();
      }
      @Override
      public Adapter caseMinDuration(MinDuration object)
      {
        return createMinDurationAdapter();
      }
      @Override
      public Adapter caseTimeWindow(TimeWindow object)
      {
        return createTimeWindowAdapter();
      }
      @Override
      public Adapter caseValueOptions(ValueOptions object)
      {
        return createValueOptionsAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseTextLiteral(TextLiteral object)
      {
        return createTextLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.PatternModel <em>Pattern Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.PatternModel
   * @generated
   */
  public Adapter createPatternModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.QueryInitialization <em>Query Initialization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.QueryInitialization
   * @generated
   */
  public Adapter createQueryInitializationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.PatternInitialization <em>Pattern Initialization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.PatternInitialization
   * @generated
   */
  public Adapter createPatternInitializationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.ComplexInitialization <em>Complex Initialization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.ComplexInitialization
   * @generated
   */
  public Adapter createComplexInitializationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.ComplexPatternStatements <em>Complex Pattern Statements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.ComplexPatternStatements
   * @generated
   */
  public Adapter createComplexPatternStatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.ComplexPatternType <em>Complex Pattern Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.ComplexPatternType
   * @generated
   */
  public Adapter createComplexPatternTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.ComplexPatternOptions <em>Complex Pattern Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.ComplexPatternOptions
   * @generated
   */
  public Adapter createComplexPatternOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.InputStatement <em>Input Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.InputStatement
   * @generated
   */
  public Adapter createInputStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.PatternStatement <em>Pattern Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.PatternStatement
   * @generated
   */
  public Adapter createPatternStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.PatternType <em>Pattern Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.PatternType
   * @generated
   */
  public Adapter createPatternTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.PatternOptions <em>Pattern Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.PatternOptions
   * @generated
   */
  public Adapter createPatternOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.OccurenceAtTime <em>Occurence At Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.OccurenceAtTime
   * @generated
   */
  public Adapter createOccurenceAtTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.OccurenceAtLeast <em>Occurence At Least</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.OccurenceAtLeast
   * @generated
   */
  public Adapter createOccurenceAtLeastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.OccurenceAtMost <em>Occurence At Most</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.OccurenceAtMost
   * @generated
   */
  public Adapter createOccurenceAtMostAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.OccurenceAtNotSpecificTime <em>Occurence At Not Specific Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.OccurenceAtNotSpecificTime
   * @generated
   */
  public Adapter createOccurenceAtNotSpecificTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.Timer <em>Timer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.Timer
   * @generated
   */
  public Adapter createTimerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.MaxDuration <em>Max Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.MaxDuration
   * @generated
   */
  public Adapter createMaxDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.MinDuration <em>Min Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.MinDuration
   * @generated
   */
  public Adapter createMinDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.TimeWindow <em>Time Window</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.TimeWindow
   * @generated
   */
  public Adapter createTimeWindowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.ValueOptions <em>Value Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.ValueOptions
   * @generated
   */
  public Adapter createValueOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.constraint.mydsl.myDsl.TextLiteral <em>Text Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.constraint.mydsl.myDsl.TextLiteral
   * @generated
   */
  public Adapter createTextLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MyDslAdapterFactory
