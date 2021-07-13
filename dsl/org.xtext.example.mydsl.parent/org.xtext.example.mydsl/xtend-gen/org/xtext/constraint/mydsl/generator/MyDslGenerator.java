/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.generator;

import at.jku.se.mosumo.dronology.constraint.esper.Constraint;
import at.jku.se.mosumo.dronology.constraint.esper.EsperEngine;
import at.jku.se.mosumo.dronology.constraint.esper.EsperPackage;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.constraint.mydsl.myDsl.ComparisonOperator;
import org.xtext.constraint.mydsl.myDsl.ComplexInitialization;
import org.xtext.constraint.mydsl.myDsl.ComplexPatternOptions;
import org.xtext.constraint.mydsl.myDsl.ComplexPatternType;
import org.xtext.constraint.mydsl.myDsl.InputStatement;
import org.xtext.constraint.mydsl.myDsl.NumberLiteral;
import org.xtext.constraint.mydsl.myDsl.OccurenceAtLeast;
import org.xtext.constraint.mydsl.myDsl.OccurenceAtMost;
import org.xtext.constraint.mydsl.myDsl.OccurenceAtNotSpecificTime;
import org.xtext.constraint.mydsl.myDsl.PatternInitialization;
import org.xtext.constraint.mydsl.myDsl.PatternOptions;
import org.xtext.constraint.mydsl.myDsl.QueryInitialization;
import org.xtext.constraint.mydsl.myDsl.StringLiteral;
import org.xtext.constraint.mydsl.myDsl.TextLiteral;
import org.xtext.constraint.mydsl.myDsl.TimeUnit;
import org.xtext.constraint.mydsl.myDsl.TimeWindow;
import org.xtext.constraint.mydsl.myDsl.ValueOptions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  public Resource initEMF() {
    EPackage.Registry.INSTANCE.put(EsperPackage.eINSTANCE.getNsURI(), EsperPackage.eINSTANCE);
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    final ResourceSet rset = new ResourceSetImpl();
    final Resource rs = rset.getResource(
      URI.createURI("file:///C:/Users/Hussein/eclipse-workspace-dsl-demo/org.xtext.example.mydsl.parent/at.jku.se.mosumo.dronology.constraint.esper/model/EsperEngine3.xmi"), 
      true);
    return rs;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Resource rs = this.initEMF();
    final Iterable<EsperEngine> root2 = Iterables.<EsperEngine>filter(IteratorExtensions.<EObject>toIterable(rs.getAllContents()), EsperEngine.class);
    Iterable<PatternInitialization> _filter = Iterables.<PatternInitialization>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), PatternInitialization.class);
    for (final PatternInitialization root : _filter) {
      if ((root != null)) {
        String _name = root.getName();
        String _plus = (_name + ".java");
        fsa.generateFile(_plus, MyDslGenerator.compileRealTimeConstraint(root, root2));
      }
    }
    Iterable<QueryInitialization> _filter_1 = Iterables.<QueryInitialization>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), QueryInitialization.class);
    for (final QueryInitialization root_1 : _filter_1) {
      if ((root_1 != null)) {
        String _name_1 = root_1.getName();
        String _plus_1 = (_name_1 + ".java");
        fsa.generateFile(_plus_1, MyDslGenerator.compileSimpleConstraint(root_1, root2));
      }
    }
    Iterable<ComplexInitialization> _filter_2 = Iterables.<ComplexInitialization>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), ComplexInitialization.class);
    for (final ComplexInitialization root_2 : _filter_2) {
      if ((root_2 != null)) {
        String _name_2 = root_2.getName();
        String _plus_2 = (_name_2 + ".java");
        fsa.generateFile(_plus_2, MyDslGenerator.compileComplexConstraint(root_2, root2));
      }
    }
  }
  
  public static CharSequence compile(final EsperEngine pattern) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Constraint> _constraint = pattern.getConstraint();
      for(final Constraint element : _constraint) {
        String _firstUpper = StringExtensions.toFirstUpper(element.getEvent().getName());
        _builder.append(_firstUpper);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence compileSimpleConstraint(final QueryInitialization query, final Iterable<EsperEngine> esperEngine) {
    StringConcatenation _builder = new StringConcatenation();
    String eventName = "";
    _builder.newLineIfNotEmpty();
    {
      for(final EsperEngine element : esperEngine) {
        {
          EList<Constraint> _constraint = element.getConstraint();
          for(final Constraint e : _constraint) {
            {
              String _name = e.getName();
              String _name_1 = query.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              if (_equals) {
                _builder.append("/* ..");
                String _firstUpper = StringExtensions.toFirstUpper(e.getEvent().getName());
                String _plus = (_firstUpper + "Event");
                String _eventName = eventName = _plus;
                _builder.append(_eventName);
                _builder.append(".. */");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EObject _eContainer = query.eContainer();
      boolean _tripleNotEquals = (_eContainer != null);
      if (_tripleNotEquals) {
        final ValueOptions inputValue = query.getInputStatements().getValue();
        _builder.newLineIfNotEmpty();
        _builder.append("select * from ");
        _builder.append(eventName);
        _builder.append("(");
        String _property = query.getInputStatements().getProperty();
        _builder.append(_property);
        _builder.append(" ");
        ComparisonOperator _comparisonOperator = query.getInputStatements().getComparisonOperator();
        _builder.append(_comparisonOperator);
        _builder.append(" ");
        {
          NumberLiteral _numberLiteral = inputValue.getNumberLiteral();
          boolean _tripleNotEquals_1 = (_numberLiteral != null);
          if (_tripleNotEquals_1) {
            int _value = inputValue.getNumberLiteral().getValue();
            _builder.append(_value);
          }
        }
        {
          StringLiteral _stringLiteral = inputValue.getStringLiteral();
          boolean _tripleNotEquals_2 = (_stringLiteral != null);
          if (_tripleNotEquals_2) {
            String _value_1 = inputValue.getStringLiteral().getValue();
            _builder.append(_value_1);
          }
        }
        {
          TextLiteral _textLiteral = inputValue.getTextLiteral();
          boolean _tripleNotEquals_3 = (_textLiteral != null);
          if (_tripleNotEquals_3) {
            String _value_2 = inputValue.getTextLiteral().getValue();
            _builder.append(_value_2);
          }
        }
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        {
          TimeWindow _timeWindow = query.getTimeWindow();
          boolean _tripleNotEquals_4 = (_timeWindow != null);
          if (_tripleNotEquals_4) {
            _builder.append("#time(");
            int _time = query.getTimeWindow().getTime();
            _builder.append(_time);
            _builder.append(" ");
            TimeUnit _timeUnit = query.getTimeWindow().getTimeUnit();
            _builder.append(_timeUnit);
            _builder.append(")\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence compileComplexConstraint(final ComplexInitialization complex, final Iterable<EsperEngine> esperEngine) {
    StringConcatenation _builder = new StringConcatenation();
    String eventName = "";
    _builder.newLineIfNotEmpty();
    int eventCounter = 1;
    _builder.newLineIfNotEmpty();
    final ComplexPatternType patternStatement = complex.getComplexPatternStatements().getComplexPatternType();
    _builder.newLineIfNotEmpty();
    {
      for(final EsperEngine element : esperEngine) {
        {
          EList<Constraint> _constraint = element.getConstraint();
          for(final Constraint e : _constraint) {
            {
              String _name = e.getName();
              String _name_1 = complex.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              if (_equals) {
                _builder.append("/* ..");
                String _firstUpper = StringExtensions.toFirstUpper(e.getEvent().getName());
                String _plus = (_firstUpper + "Event");
                String _eventName = eventName = _plus;
                _builder.append(_eventName);
                _builder.append(".. */");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EObject _eContainer = complex.eContainer();
      boolean _tripleNotEquals = (_eContainer != null);
      if (_tripleNotEquals) {
        _builder.append("select * from ");
        _builder.append(eventName);
        {
          TimeWindow _timeWindow = complex.getTimeWindow();
          boolean _tripleNotEquals_1 = (_timeWindow != null);
          if (_tripleNotEquals_1) {
            _builder.append("#time(");
            int _time = complex.getTimeWindow().getTime();
            _builder.append(_time);
            _builder.append(" ");
            TimeUnit _timeUnit = complex.getTimeWindow().getTimeUnit();
            _builder.append(_timeUnit);
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("match_recognize (");
        _builder.newLine();
        _builder.append("measures ");
        {
          EList<InputStatement> _inputStatements = complex.getInputStatements();
          boolean _hasElements = false;
          for(final InputStatement element_1 : _inputStatements) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _name_2 = element_1.getName();
            _builder.append(_name_2);
            _builder.append(" as ");
            String _property = element_1.getProperty();
            _builder.append(_property);
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("pattern ( ");
        String _name_3 = patternStatement.getFirstEvent().getName();
        _builder.append(_name_3);
        {
          String _string = patternStatement.getGreedyQuantifiers().toString();
          boolean _equals_1 = Objects.equal(_string, "ZeroOrMore");
          if (_equals_1) {
            _builder.append("* ");
          }
        }
        {
          String _string_1 = patternStatement.getGreedyQuantifiers().toString();
          boolean _equals_2 = Objects.equal(_string_1, "OneOrMore");
          if (_equals_2) {
            _builder.append("+ ");
          }
        }
        {
          String _string_2 = patternStatement.getGreedyQuantifiers().toString();
          boolean _equals_3 = Objects.equal(_string_2, "ZeroOrOne");
          if (_equals_3) {
            _builder.append("? ");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          EList<ComplexPatternOptions> _complexPatternOptions = patternStatement.getComplexPatternOptions();
          for(final ComplexPatternOptions element_2 : _complexPatternOptions) {
            String _name_4 = element_2.getSeceondEvent().getName();
            _builder.append(_name_4);
            {
              String _string_3 = element_2.getGreedyQuantifiers().toString();
              boolean _equals_4 = Objects.equal(_string_3, "ZeroOrMore");
              if (_equals_4) {
                _builder.append("* ");
              }
            }
            {
              String _string_4 = element_2.getGreedyQuantifiers().toString();
              boolean _equals_5 = Objects.equal(_string_4, "OneOrMore");
              if (_equals_5) {
                _builder.append("+ ");
              }
            }
            {
              String _string_5 = element_2.getGreedyQuantifiers().toString();
              boolean _equals_6 = Objects.equal(_string_5, "ZeroOrOne");
              if (_equals_6) {
                _builder.append("? ");
              }
            }
          }
        }
        _builder.append(" )");
        _builder.newLineIfNotEmpty();
        _builder.append("define");
        _builder.newLine();
        {
          EList<InputStatement> _inputStatements_1 = complex.getInputStatements();
          boolean _hasElements_1 = false;
          for(final InputStatement element_3 : _inputStatements_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            final ValueOptions inputValue = element_3.getValue();
            _builder.newLineIfNotEmpty();
            String _name_5 = element_3.getName();
            _builder.append(_name_5);
            _builder.append(" as ");
            String _name_6 = element_3.getName();
            _builder.append(_name_6);
            _builder.append(".");
            String _property_1 = element_3.getProperty();
            _builder.append(_property_1);
            _builder.append(" ");
            ComparisonOperator _comparisonOperator = element_3.getComparisonOperator();
            _builder.append(_comparisonOperator);
            _builder.append(" ");
            {
              NumberLiteral _numberLiteral = inputValue.getNumberLiteral();
              boolean _tripleNotEquals_2 = (_numberLiteral != null);
              if (_tripleNotEquals_2) {
                int _value = inputValue.getNumberLiteral().getValue();
                _builder.append(_value);
              }
            }
            {
              StringLiteral _stringLiteral = inputValue.getStringLiteral();
              boolean _tripleNotEquals_3 = (_stringLiteral != null);
              if (_tripleNotEquals_3) {
                String _value_1 = inputValue.getStringLiteral().getValue();
                _builder.append(_value_1);
              }
            }
            {
              TextLiteral _textLiteral = inputValue.getTextLiteral();
              boolean _tripleNotEquals_4 = (_textLiteral != null);
              if (_tripleNotEquals_4) {
                String _value_2 = inputValue.getTextLiteral().getValue();
                _builder.append(_value_2);
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append(" )");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence compileRealTimeConstraint(final PatternInitialization pattern, final Iterable<EsperEngine> esperEngine) {
    StringConcatenation _builder = new StringConcatenation();
    int i = 0;
    _builder.newLineIfNotEmpty();
    String eventName = "";
    _builder.newLineIfNotEmpty();
    {
      for(final EsperEngine element : esperEngine) {
        {
          EList<Constraint> _constraint = element.getConstraint();
          for(final Constraint e : _constraint) {
            {
              String _name = e.getName();
              String _name_1 = pattern.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              if (_equals) {
                _builder.append("/* ..");
                String _firstUpper = StringExtensions.toFirstUpper(e.getEvent().getName());
                String _plus = (_firstUpper + "Event");
                String _eventName = eventName = _plus;
                _builder.append(_eventName);
                _builder.append(".. */");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    final InputStatement firstEvent = pattern.getPatternStatements().getPatternType().getFirstEvent();
    _builder.newLineIfNotEmpty();
    {
      EObject _eContainer = pattern.eContainer();
      boolean _tripleNotEquals = (_eContainer != null);
      if (_tripleNotEquals) {
        _builder.append("select * from pattern [");
        _builder.newLine();
        _builder.append("every ");
        _builder.newLine();
        String _name_2 = firstEvent.getName();
        _builder.append(_name_2);
        _builder.append(" = ");
        _builder.append(eventName);
        _builder.append(" (");
        String _property = firstEvent.getProperty();
        _builder.append(_property);
        _builder.append(" ");
        ComparisonOperator _comparisonOperator = firstEvent.getComparisonOperator();
        _builder.append(_comparisonOperator);
        _builder.append(" ");
        {
          NumberLiteral _numberLiteral = firstEvent.getValue().getNumberLiteral();
          boolean _tripleNotEquals_1 = (_numberLiteral != null);
          if (_tripleNotEquals_1) {
            int _value = firstEvent.getValue().getNumberLiteral().getValue();
            _builder.append(_value);
          }
        }
        {
          StringLiteral _stringLiteral = firstEvent.getValue().getStringLiteral();
          boolean _tripleNotEquals_2 = (_stringLiteral != null);
          if (_tripleNotEquals_2) {
            String _value_1 = firstEvent.getValue().getStringLiteral().getValue();
            _builder.append(_value_1);
          }
        }
        {
          TextLiteral _textLiteral = firstEvent.getValue().getTextLiteral();
          boolean _tripleNotEquals_3 = (_textLiteral != null);
          if (_tripleNotEquals_3) {
            String _value_2 = firstEvent.getValue().getTextLiteral().getValue();
            _builder.append(_value_2);
          }
        }
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("-> ");
        _builder.newLine();
        {
          EList<PatternOptions> _patternOptions = pattern.getPatternStatements().getPatternType().getPatternOptions();
          boolean _hasElements = false;
          for(final PatternOptions inputs : _patternOptions) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate("\n ->", "");
            }
            final OccurenceAtLeast atLeast = inputs.getOccurenceAtLeast();
            _builder.newLineIfNotEmpty();
            final OccurenceAtMost atMost = inputs.getOccurenceAtMost();
            _builder.newLineIfNotEmpty();
            final OccurenceAtNotSpecificTime atNotSpecific = inputs.getOccurenceAtNotSpecificTime();
            _builder.newLineIfNotEmpty();
            {
              if ((atLeast != null)) {
                _builder.append("timer:interval(");
                int _time = atLeast.getMinDuration().getTime();
                _builder.append(_time);
                _builder.append(" ");
                TimeUnit _timeUnit = atLeast.getMinDuration().getTimeUnit();
                _builder.append(_timeUnit);
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("->");
                _builder.newLine();
                String _name_3 = atLeast.getSeceondEvent().getName();
                _builder.append(_name_3);
                _builder.append("\t= ");
                _builder.append(eventName);
                _builder.append(" (");
                String _property_1 = atLeast.getSeceondEvent().getProperty();
                _builder.append(_property_1);
                _builder.append(" ");
                ComparisonOperator _comparisonOperator_1 = atLeast.getSeceondEvent().getComparisonOperator();
                _builder.append(_comparisonOperator_1);
                {
                  NumberLiteral _numberLiteral_1 = atLeast.getSeceondEvent().getValue().getNumberLiteral();
                  boolean _tripleNotEquals_4 = (_numberLiteral_1 != null);
                  if (_tripleNotEquals_4) {
                    int _value_3 = atLeast.getSeceondEvent().getValue().getNumberLiteral().getValue();
                    _builder.append(_value_3);
                  }
                }
                {
                  StringLiteral _stringLiteral_1 = atLeast.getSeceondEvent().getValue().getStringLiteral();
                  boolean _tripleNotEquals_5 = (_stringLiteral_1 != null);
                  if (_tripleNotEquals_5) {
                    String _value_4 = atLeast.getSeceondEvent().getValue().getStringLiteral().getValue();
                    _builder.append(_value_4);
                  }
                }
                {
                  TextLiteral _textLiteral_1 = atLeast.getSeceondEvent().getValue().getTextLiteral();
                  boolean _tripleNotEquals_6 = (_textLiteral_1 != null);
                  if (_tripleNotEquals_6) {
                    String _value_5 = atLeast.getSeceondEvent().getValue().getTextLiteral().getValue();
                    _builder.append(_value_5);
                  }
                }
                _builder.append(" )");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              if ((atMost != null)) {
                String _name_4 = atMost.getSeceondEvent().getName();
                _builder.append(_name_4);
                _builder.append(" = ");
                _builder.append(eventName);
                _builder.append(" (");
                String _property_2 = atMost.getSeceondEvent().getProperty();
                _builder.append(_property_2);
                _builder.append(" ");
                ComparisonOperator _comparisonOperator_2 = atMost.getSeceondEvent().getComparisonOperator();
                _builder.append(_comparisonOperator_2);
                _builder.append(" ");
                {
                  NumberLiteral _numberLiteral_2 = atMost.getSeceondEvent().getValue().getNumberLiteral();
                  boolean _tripleNotEquals_7 = (_numberLiteral_2 != null);
                  if (_tripleNotEquals_7) {
                    int _value_6 = atMost.getSeceondEvent().getValue().getNumberLiteral().getValue();
                    _builder.append(_value_6);
                  }
                }
                {
                  StringLiteral _stringLiteral_2 = atMost.getSeceondEvent().getValue().getStringLiteral();
                  boolean _tripleNotEquals_8 = (_stringLiteral_2 != null);
                  if (_tripleNotEquals_8) {
                    String _value_7 = atMost.getSeceondEvent().getValue().getStringLiteral().getValue();
                    _builder.append(_value_7);
                  }
                }
                {
                  TextLiteral _textLiteral_2 = atMost.getSeceondEvent().getValue().getTextLiteral();
                  boolean _tripleNotEquals_9 = (_textLiteral_2 != null);
                  if (_tripleNotEquals_9) {
                    String _value_8 = atMost.getSeceondEvent().getValue().getTextLiteral().getValue();
                    _builder.append(_value_8);
                  }
                }
                _builder.append(" )");
                _builder.newLineIfNotEmpty();
                _builder.append("where timer:within(");
                int _time_1 = atMost.getMaxDuration().getTime();
                _builder.append(_time_1);
                _builder.append(" ");
                TimeUnit _timeUnit_1 = atMost.getMaxDuration().getTimeUnit();
                _builder.append(_timeUnit_1);
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              if ((atNotSpecific != null)) {
                String _name_5 = atNotSpecific.getSeceondEvent().getName();
                _builder.append(_name_5);
                _builder.append(" = ");
                _builder.append(eventName);
                _builder.append(" (");
                String _property_3 = atNotSpecific.getSeceondEvent().getProperty();
                _builder.append(_property_3);
                _builder.append(" ");
                ComparisonOperator _comparisonOperator_3 = atNotSpecific.getSeceondEvent().getComparisonOperator();
                _builder.append(_comparisonOperator_3);
                _builder.append(" ");
                {
                  NumberLiteral _numberLiteral_3 = atNotSpecific.getSeceondEvent().getValue().getNumberLiteral();
                  boolean _tripleNotEquals_10 = (_numberLiteral_3 != null);
                  if (_tripleNotEquals_10) {
                    int _value_9 = atNotSpecific.getSeceondEvent().getValue().getNumberLiteral().getValue();
                    _builder.append(_value_9);
                  }
                }
                {
                  StringLiteral _stringLiteral_3 = atNotSpecific.getSeceondEvent().getValue().getStringLiteral();
                  boolean _tripleNotEquals_11 = (_stringLiteral_3 != null);
                  if (_tripleNotEquals_11) {
                    String _value_10 = atNotSpecific.getSeceondEvent().getValue().getStringLiteral().getValue();
                    _builder.append(_value_10);
                  }
                }
                {
                  TextLiteral _textLiteral_3 = atNotSpecific.getSeceondEvent().getValue().getTextLiteral();
                  boolean _tripleNotEquals_12 = (_textLiteral_3 != null);
                  if (_tripleNotEquals_12) {
                    String _value_11 = atNotSpecific.getSeceondEvent().getValue().getTextLiteral().getValue();
                    _builder.append(_value_11);
                  }
                }
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t\t");
          }
        }
        _builder.append(" ]");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}