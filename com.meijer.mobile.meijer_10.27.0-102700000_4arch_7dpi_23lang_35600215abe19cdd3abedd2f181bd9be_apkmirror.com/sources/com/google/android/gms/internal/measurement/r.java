package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class r implements InterfaceC10498q {

    /* renamed from: a, reason: collision with root package name */
    private final String f82356a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f82357b;

    public final String a() {
        return this.f82356a;
    }

    public final ArrayList b() {
        return this.f82357b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.f82356a;
        if (str == null ? rVar.f82356a == null : str.equals(rVar.f82356a)) {
            return this.f82357b.equals(rVar.f82357b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q f(String str, U1 u12, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f82356a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f82357b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public r(String str, List list) {
        this.f82356a = str;
        ArrayList arrayList = new ArrayList();
        this.f82357b = arrayList;
        arrayList.addAll(list);
    }
}
