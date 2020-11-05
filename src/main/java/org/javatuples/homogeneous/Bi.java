package org.javatuples.homogeneous;

import java.util.function.Supplier;

import org.javatuples.Pair;

public class Bi<T> extends Pair<T,T> implements IBi<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8165935734858816483L;

	public Bi(T value0, T value1) {
		super(value0, value1);
	}
	public static <T> Bi<T> of(T value0, T value1){
		return new Bi<>(value0, value1);
	}
	public static <T> Bi<T> of(T value0, T value1, boolean swap){
		return swap ? new Bi<>(value1, value0) : new Bi<>(value0, value1);
	}
	
	public static <T> Bi<T> of(Supplier<T> value0, Supplier<T> value1){
		return of(value0.get(), value1.get());
	}
	public static <T> Bi<T> of(Supplier<T> value0, Supplier<T> value1, boolean swap){
		return of(value0.get(), value1.get(), swap);
	}

 }
