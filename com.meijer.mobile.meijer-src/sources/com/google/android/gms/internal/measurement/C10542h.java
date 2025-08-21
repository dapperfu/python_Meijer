package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10542h implements InterfaceC10623q {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10623q f83034a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83035b;

    public C10542h() {
        this.f83034a = InterfaceC10623q.f83182i3;
        this.f83035b = "return";
    }

    public final InterfaceC10623q a() {
        return this.f83034a;
    }

    public final String b() {
        return this.f83035b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10542h)) {
            return false;
        }
        C10542h c10542h = (C10542h) obj;
        return this.f83035b.equals(c10542h.f83035b) && this.f83034a.equals(c10542h.f83034a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Iterator zzf() {
        return null;
    }

    public C10542h(String str) {
        this.f83034a = InterfaceC10623q.f83182i3;
        this.f83035b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q f(String str, U1 u12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return (this.f83035b.hashCode() * 31) + this.f83034a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
        return new C10542h(this.f83035b, this.f83034a.zzt());
    }

    public C10542h(String str, InterfaceC10623q interfaceC10623q) {
        this.f83034a = interfaceC10623q;
        this.f83035b = str;
    }
}
