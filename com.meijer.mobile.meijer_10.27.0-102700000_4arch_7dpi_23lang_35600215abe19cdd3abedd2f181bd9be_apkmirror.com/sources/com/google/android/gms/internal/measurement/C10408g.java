package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10408g implements InterfaceC10498q {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f82186a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10408g) && this.f82186a == ((C10408g) obj).f82186a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Double zzd() {
        return Double.valueOf(true != this.f82186a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q f(String str, U1 u12, List list) {
        if ("toString".equals(str)) {
            return new C10533u(Boolean.toString(this.f82186a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f82186a), str));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f82186a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f82186a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        return Boolean.toString(this.f82186a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Boolean zze() {
        return Boolean.valueOf(this.f82186a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        return new C10408g(Boolean.valueOf(this.f82186a));
    }

    public C10408g(Boolean bool) {
        boolean zBooleanValue;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        this.f82186a = zBooleanValue;
    }
}
