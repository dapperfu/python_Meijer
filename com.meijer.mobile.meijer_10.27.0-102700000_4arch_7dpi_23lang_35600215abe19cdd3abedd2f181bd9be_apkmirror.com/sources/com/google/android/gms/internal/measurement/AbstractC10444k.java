package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10444k implements InterfaceC10498q, InterfaceC10462m {

    /* renamed from: a, reason: collision with root package name */
    protected final String f82227a;

    /* renamed from: b, reason: collision with root package name */
    protected final Map f82228b = new HashMap();

    public abstract InterfaceC10498q b(U1 u12, List list);

    public final String c() {
        return this.f82227a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        return this.f82227a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public InterfaceC10498q zzt() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final boolean S(String str) {
        return this.f82228b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final InterfaceC10498q W(String str) {
        Map map = this.f82228b;
        return map.containsKey(str) ? (InterfaceC10498q) map.get(str) : InterfaceC10498q.f82342i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final void e(String str, InterfaceC10498q interfaceC10498q) {
        if (interfaceC10498q == null) {
            this.f82228b.remove(str);
        } else {
            this.f82228b.put(str, interfaceC10498q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10444k)) {
            return false;
        }
        AbstractC10444k abstractC10444k = (AbstractC10444k) obj;
        String str = this.f82227a;
        if (str != null) {
            return str.equals(abstractC10444k.f82227a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q f(String str, U1 u12, List list) {
        return "toString".equals(str) ? new C10533u(this.f82227a) : InterfaceC10462m.a(this, new C10533u(str), u12, list);
    }

    public final int hashCode() {
        String str = this.f82227a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Iterator zzf() {
        return InterfaceC10462m.h(this.f82228b);
    }

    public AbstractC10444k(String str) {
        this.f82227a = str;
    }
}
