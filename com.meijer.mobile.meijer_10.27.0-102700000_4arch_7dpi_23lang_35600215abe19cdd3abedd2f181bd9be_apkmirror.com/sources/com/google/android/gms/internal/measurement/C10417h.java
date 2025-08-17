package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10417h implements InterfaceC10498q {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10498q f82194a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82195b;

    public C10417h() {
        this.f82194a = InterfaceC10498q.f82342i3;
        this.f82195b = "return";
    }

    public final InterfaceC10498q a() {
        return this.f82194a;
    }

    public final String b() {
        return this.f82195b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10417h)) {
            return false;
        }
        C10417h c10417h = (C10417h) obj;
        return this.f82195b.equals(c10417h.f82195b) && this.f82194a.equals(c10417h.f82194a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Iterator zzf() {
        return null;
    }

    public C10417h(String str) {
        this.f82194a = InterfaceC10498q.f82342i3;
        this.f82195b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q f(String str, U1 u12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return (this.f82195b.hashCode() * 31) + this.f82194a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        return new C10417h(this.f82195b, this.f82194a.zzt());
    }

    public C10417h(String str, InterfaceC10498q interfaceC10498q) {
        this.f82194a = interfaceC10498q;
        this.f82195b = str;
    }
}
