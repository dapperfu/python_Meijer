package com.google.android.gms.internal.measurement;

import com.google.maps.android.BuildConfig;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10605o implements InterfaceC10623q {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C10605o;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        return BuildConfig.TRAVIS;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
        return InterfaceC10623q.f83183j3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q f(String str, U1 u12, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Double zzd() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Boolean zze() {
        return Boolean.FALSE;
    }
}
