package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10533g implements InterfaceC10623q {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f83026a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10533g) && this.f83026a == ((C10533g) obj).f83026a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Double zzd() {
        return Double.valueOf(true != this.f83026a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q f(String str, U1 u12, List list) {
        if ("toString".equals(str)) {
            return new C10658u(Boolean.toString(this.f83026a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f83026a), str));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f83026a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f83026a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        return Boolean.toString(this.f83026a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Boolean zze() {
        return Boolean.valueOf(this.f83026a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
        return new C10533g(Boolean.valueOf(this.f83026a));
    }

    public C10533g(Boolean bool) {
        boolean zBooleanValue;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        this.f83026a = zBooleanValue;
    }
}
