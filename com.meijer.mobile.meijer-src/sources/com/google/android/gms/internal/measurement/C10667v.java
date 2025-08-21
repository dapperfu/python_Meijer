package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10667v implements InterfaceC10623q {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C10667v;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
        return InterfaceC10623q.f83182i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q f(String str, U1 u12, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Boolean zze() {
        return Boolean.FALSE;
    }
}
