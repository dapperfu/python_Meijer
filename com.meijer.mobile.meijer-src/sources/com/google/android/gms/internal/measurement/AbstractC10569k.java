package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10569k implements InterfaceC10623q, InterfaceC10587m {

    /* renamed from: a, reason: collision with root package name */
    protected final String f83067a;

    /* renamed from: b, reason: collision with root package name */
    protected final Map f83068b = new HashMap();

    public abstract InterfaceC10623q b(U1 u12, List list);

    public final String c() {
        return this.f83067a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        return this.f83067a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public InterfaceC10623q zzt() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final boolean S(String str) {
        return this.f83068b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final InterfaceC10623q X(String str) {
        Map map = this.f83068b;
        return map.containsKey(str) ? (InterfaceC10623q) map.get(str) : InterfaceC10623q.f83182i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final void e(String str, InterfaceC10623q interfaceC10623q) {
        if (interfaceC10623q == null) {
            this.f83068b.remove(str);
        } else {
            this.f83068b.put(str, interfaceC10623q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10569k)) {
            return false;
        }
        AbstractC10569k abstractC10569k = (AbstractC10569k) obj;
        String str = this.f83067a;
        if (str != null) {
            return str.equals(abstractC10569k.f83067a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q f(String str, U1 u12, List list) {
        return "toString".equals(str) ? new C10658u(this.f83067a) : InterfaceC10587m.a(this, new C10658u(str), u12, list);
    }

    public final int hashCode() {
        String str = this.f83067a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Iterator zzf() {
        return InterfaceC10587m.h(this.f83068b);
    }

    public AbstractC10569k(String str) {
        this.f83067a = str;
    }
}
