package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class r implements InterfaceC10623q {

    /* renamed from: a, reason: collision with root package name */
    private final String f83196a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f83197b;

    public final String a() {
        return this.f83196a;
    }

    public final ArrayList b() {
        return this.f83197b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
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
        String str = this.f83196a;
        if (str == null ? rVar.f83196a == null : str.equals(rVar.f83196a)) {
            return this.f83197b.equals(rVar.f83197b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q f(String str, U1 u12, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f83196a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f83197b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public r(String str, List list) {
        this.f83196a = str;
        ArrayList arrayList = new ArrayList();
        this.f83197b = arrayList;
        arrayList.addAll(list);
    }
}
