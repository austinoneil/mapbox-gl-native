package com.mapbox.mapboxsdk.style.functions;

import android.support.annotation.NonNull;
import android.support.annotation.Size;

/**
 * TODO
 */
public class PropertyFunction<V, T> extends Function<V, T> {

  public final String property;

  /**
   * Identity function
   *
   * @param property the input property
   */
  PropertyFunction(String property) {
    this(property, IDENTITY, null, null);
  }

  @SafeVarargs
  PropertyFunction(String property, @NonNull @Size(min = 1) Stop<V, T>... stops) {
    this(property, null, null, stops);
  }

  @SafeVarargs
  PropertyFunction(String property, float base, @NonNull @Size(min = 1) Stop<V, T>... stops) {
    this(property, null, base, stops);
  }

  @SafeVarargs
  PropertyFunction(String property, @Function.TYPE String type, @NonNull @Size(min = 1) Stop<V, T>... stops) {
    this(property, type, null, stops);
  }

  private PropertyFunction(String property, String type, Float base, Stop<V, T>[] stops) {
    super(type, base, stops);
    this.property = property;
  }
}
