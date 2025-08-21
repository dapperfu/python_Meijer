package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.m6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10594m6 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f83115a;

    AbstractC10594m6(Unsafe unsafe) {
        this.f83115a = unsafe;
    }

    public abstract void a(Object obj, long j10, byte b10);

    public abstract boolean b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract float d(Object obj, long j10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract double f(Object obj, long j10);

    public abstract void g(Object obj, long j10, double d10);
}
