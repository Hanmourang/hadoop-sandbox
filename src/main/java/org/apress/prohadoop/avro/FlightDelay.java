/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apress.prohadoop.avro;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FlightDelay extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlightDelay\",\"namespace\":\"org.apress.org.apress.prohadoop.avro\",\"fields\":[{\"name\":\"year\",\"type\":\"int\"},{\"name\":\"month\",\"type\":\"int\"},{\"name\":\"date\",\"type\":\"int\"},{\"name\":\"dayOfWeek\",\"type\":\"int\"},{\"name\":\"depDelay\",\"type\":[\"int\",\"null\"]},{\"name\":\"arrDelay\",\"type\":[\"int\",\"null\"]},{\"name\":\"origin\",\"type\":\"string\"},{\"name\":\"destination\",\"type\":\"string\"},{\"name\":\"carrier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int year;
  @Deprecated public int month;
  @Deprecated public int date;
  @Deprecated public int dayOfWeek;
  @Deprecated public Integer depDelay;
  @Deprecated public Integer arrDelay;
  @Deprecated public CharSequence origin;
  @Deprecated public CharSequence destination;
  @Deprecated public CharSequence carrier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FlightDelay() {}

  /**
   * All-args constructor.
   */
  public FlightDelay(Integer year, Integer month, Integer date, Integer dayOfWeek, Integer depDelay, Integer arrDelay, CharSequence origin, CharSequence destination, CharSequence carrier) {
    this.year = year;
    this.month = month;
    this.date = date;
    this.dayOfWeek = dayOfWeek;
    this.depDelay = depDelay;
    this.arrDelay = arrDelay;
    this.origin = origin;
    this.destination = destination;
    this.carrier = carrier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return year;
    case 1: return month;
    case 2: return date;
    case 3: return dayOfWeek;
    case 4: return depDelay;
    case 5: return arrDelay;
    case 6: return origin;
    case 7: return destination;
    case 8: return carrier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: year = (Integer)value$; break;
    case 1: month = (Integer)value$; break;
    case 2: date = (Integer)value$; break;
    case 3: dayOfWeek = (Integer)value$; break;
    case 4: depDelay = (Integer)value$; break;
    case 5: arrDelay = (Integer)value$; break;
    case 6: origin = (CharSequence)value$; break;
    case 7: destination = (CharSequence)value$; break;
    case 8: carrier = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'year' field.
   */
  public Integer getYear() {
    return year;
  }

  /**
   * Sets the value of the 'year' field.
   * @param value the value to set.
   */
  public void setYear(Integer value) {
    this.year = value;
  }

  /**
   * Gets the value of the 'month' field.
   */
  public Integer getMonth() {
    return month;
  }

  /**
   * Sets the value of the 'month' field.
   * @param value the value to set.
   */
  public void setMonth(Integer value) {
    this.month = value;
  }

  /**
   * Gets the value of the 'date' field.
   */
  public Integer getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(Integer value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'dayOfWeek' field.
   */
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }

  /**
   * Sets the value of the 'dayOfWeek' field.
   * @param value the value to set.
   */
  public void setDayOfWeek(Integer value) {
    this.dayOfWeek = value;
  }

  /**
   * Gets the value of the 'depDelay' field.
   */
  public Integer getDepDelay() {
    return depDelay;
  }

  /**
   * Sets the value of the 'depDelay' field.
   * @param value the value to set.
   */
  public void setDepDelay(Integer value) {
    this.depDelay = value;
  }

  /**
   * Gets the value of the 'arrDelay' field.
   */
  public Integer getArrDelay() {
    return arrDelay;
  }

  /**
   * Sets the value of the 'arrDelay' field.
   * @param value the value to set.
   */
  public void setArrDelay(Integer value) {
    this.arrDelay = value;
  }

  /**
   * Gets the value of the 'origin' field.
   */
  public CharSequence getOrigin() {
    return origin;
  }

  /**
   * Sets the value of the 'origin' field.
   * @param value the value to set.
   */
  public void setOrigin(CharSequence value) {
    this.origin = value;
  }

  /**
   * Gets the value of the 'destination' field.
   */
  public CharSequence getDestination() {
    return destination;
  }

  /**
   * Sets the value of the 'destination' field.
   * @param value the value to set.
   */
  public void setDestination(CharSequence value) {
    this.destination = value;
  }

  /**
   * Gets the value of the 'carrier' field.
   */
  public CharSequence getCarrier() {
    return carrier;
  }

  /**
   * Sets the value of the 'carrier' field.
   * @param value the value to set.
   */
  public void setCarrier(CharSequence value) {
    this.carrier = value;
  }

  /** Creates a new FlightDelay RecordBuilder */
  public static org.apress.prohadoop.avro.FlightDelay.Builder newBuilder() {
    return new org.apress.prohadoop.avro.FlightDelay.Builder();
  }

  /** Creates a new FlightDelay RecordBuilder by copying an existing Builder */
  public static org.apress.prohadoop.avro.FlightDelay.Builder newBuilder(org.apress.prohadoop.avro.FlightDelay.Builder other) {
    return new org.apress.prohadoop.avro.FlightDelay.Builder(other);
  }

  /** Creates a new FlightDelay RecordBuilder by copying an existing FlightDelay instance */
  public static org.apress.prohadoop.avro.FlightDelay.Builder newBuilder(org.apress.prohadoop.avro.FlightDelay other) {
    return new org.apress.prohadoop.avro.FlightDelay.Builder(other);
  }

  /**
   * RecordBuilder for FlightDelay instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlightDelay>
    implements org.apache.avro.data.RecordBuilder<FlightDelay> {

    private int year;
    private int month;
    private int date;
    private int dayOfWeek;
    private Integer depDelay;
    private Integer arrDelay;
    private CharSequence origin;
    private CharSequence destination;
    private CharSequence carrier;

    /** Creates a new Builder */
    private Builder() {
      super(org.apress.prohadoop.avro.FlightDelay.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apress.prohadoop.avro.FlightDelay.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.year)) {
        this.year = data().deepCopy(fields()[0].schema(), other.year);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.month)) {
        this.month = data().deepCopy(fields()[1].schema(), other.month);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.dayOfWeek)) {
        this.dayOfWeek = data().deepCopy(fields()[3].schema(), other.dayOfWeek);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.depDelay)) {
        this.depDelay = data().deepCopy(fields()[4].schema(), other.depDelay);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.arrDelay)) {
        this.arrDelay = data().deepCopy(fields()[5].schema(), other.arrDelay);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.origin)) {
        this.origin = data().deepCopy(fields()[6].schema(), other.origin);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.destination)) {
        this.destination = data().deepCopy(fields()[7].schema(), other.destination);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.carrier)) {
        this.carrier = data().deepCopy(fields()[8].schema(), other.carrier);
        fieldSetFlags()[8] = true;
      }
    }

    /** Creates a Builder by copying an existing FlightDelay instance */
    private Builder(org.apress.prohadoop.avro.FlightDelay other) {
            super(org.apress.prohadoop.avro.FlightDelay.SCHEMA$);
      if (isValidValue(fields()[0], other.year)) {
        this.year = data().deepCopy(fields()[0].schema(), other.year);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.month)) {
        this.month = data().deepCopy(fields()[1].schema(), other.month);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.dayOfWeek)) {
        this.dayOfWeek = data().deepCopy(fields()[3].schema(), other.dayOfWeek);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.depDelay)) {
        this.depDelay = data().deepCopy(fields()[4].schema(), other.depDelay);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.arrDelay)) {
        this.arrDelay = data().deepCopy(fields()[5].schema(), other.arrDelay);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.origin)) {
        this.origin = data().deepCopy(fields()[6].schema(), other.origin);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.destination)) {
        this.destination = data().deepCopy(fields()[7].schema(), other.destination);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.carrier)) {
        this.carrier = data().deepCopy(fields()[8].schema(), other.carrier);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'year' field */
    public Integer getYear() {
      return year;
    }

    /** Sets the value of the 'year' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setYear(int value) {
      validate(fields()[0], value);
      this.year = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'year' field has been set */
    public boolean hasYear() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'year' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearYear() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'month' field */
    public Integer getMonth() {
      return month;
    }

    /** Sets the value of the 'month' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setMonth(int value) {
      validate(fields()[1], value);
      this.month = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'month' field has been set */
    public boolean hasMonth() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'month' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearMonth() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'date' field */
    public Integer getDate() {
      return date;
    }

    /** Sets the value of the 'date' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setDate(int value) {
      validate(fields()[2], value);
      this.date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'date' field has been set */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'date' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearDate() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'dayOfWeek' field */
    public Integer getDayOfWeek() {
      return dayOfWeek;
    }

    /** Sets the value of the 'dayOfWeek' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setDayOfWeek(int value) {
      validate(fields()[3], value);
      this.dayOfWeek = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'dayOfWeek' field has been set */
    public boolean hasDayOfWeek() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'dayOfWeek' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearDayOfWeek() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'depDelay' field */
    public Integer getDepDelay() {
      return depDelay;
    }

    /** Sets the value of the 'depDelay' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setDepDelay(Integer value) {
      validate(fields()[4], value);
      this.depDelay = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /** Checks whether the 'depDelay' field has been set */
    public boolean hasDepDelay() {
      return fieldSetFlags()[4];
    }

    /** Clears the value of the 'depDelay' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearDepDelay() {
      depDelay = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'arrDelay' field */
    public Integer getArrDelay() {
      return arrDelay;
    }

    /** Sets the value of the 'arrDelay' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setArrDelay(Integer value) {
      validate(fields()[5], value);
      this.arrDelay = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /** Checks whether the 'arrDelay' field has been set */
    public boolean hasArrDelay() {
      return fieldSetFlags()[5];
    }

    /** Clears the value of the 'arrDelay' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearArrDelay() {
      arrDelay = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'origin' field */
    public CharSequence getOrigin() {
      return origin;
    }

    /** Sets the value of the 'origin' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setOrigin(CharSequence value) {
      validate(fields()[6], value);
      this.origin = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /** Checks whether the 'origin' field has been set */
    public boolean hasOrigin() {
      return fieldSetFlags()[6];
    }

    /** Clears the value of the 'origin' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearOrigin() {
      origin = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'destination' field */
    public CharSequence getDestination() {
      return destination;
    }

    /** Sets the value of the 'destination' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setDestination(CharSequence value) {
      validate(fields()[7], value);
      this.destination = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /** Checks whether the 'destination' field has been set */
    public boolean hasDestination() {
      return fieldSetFlags()[7];
    }

    /** Clears the value of the 'destination' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearDestination() {
      destination = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'carrier' field */
    public CharSequence getCarrier() {
      return carrier;
    }

    /** Sets the value of the 'carrier' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder setCarrier(CharSequence value) {
      validate(fields()[8], value);
      this.carrier = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /** Checks whether the 'carrier' field has been set */
    public boolean hasCarrier() {
      return fieldSetFlags()[8];
    }

    /** Clears the value of the 'carrier' field */
    public org.apress.prohadoop.avro.FlightDelay.Builder clearCarrier() {
      carrier = null;
      fieldSetFlags()[8] = false;
      return this;
    }


    public FlightDelay build() {
      try {
        FlightDelay record = new FlightDelay();
        record.year = fieldSetFlags()[0] ? this.year : (Integer) defaultValue(fields()[0]);
        record.month = fieldSetFlags()[1] ? this.month : (Integer) defaultValue(fields()[1]);
        record.date = fieldSetFlags()[2] ? this.date : (Integer) defaultValue(fields()[2]);
        record.dayOfWeek = fieldSetFlags()[3] ? this.dayOfWeek : (Integer) defaultValue(fields()[3]);
        record.depDelay = fieldSetFlags()[4] ? this.depDelay : (Integer) defaultValue(fields()[4]);
        record.arrDelay = fieldSetFlags()[5] ? this.arrDelay : (Integer) defaultValue(fields()[5]);
        record.origin = fieldSetFlags()[6] ? this.origin : (CharSequence) defaultValue(fields()[6]);
        record.destination = fieldSetFlags()[7] ? this.destination : (CharSequence) defaultValue(fields()[7]);
        record.carrier = fieldSetFlags()[8] ? this.carrier : (CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}