package com.google.android.gms.internal.measurement;

import com.google.maps.android.BuildConfig;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10480o implements InterfaceC10498q {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C10480o;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        return BuildConfig.TRAVIS;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        return InterfaceC10498q.f82343j3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q f(String str, U1 u12, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Double zzd() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Boolean zze() {
        return Boolean.FALSE;
    }
}
