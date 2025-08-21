package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10596n implements InterfaceC10623q, InterfaceC10587m {

    /* renamed from: a, reason: collision with root package name */
    final Map f83118a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final boolean S(String str) {
        return this.f83118a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final InterfaceC10623q X(String str) {
        Map map = this.f83118a;
        return map.containsKey(str) ? (InterfaceC10623q) map.get(str) : InterfaceC10623q.f83182i3;
    }

    public final List b() {
        return new ArrayList(this.f83118a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final void e(String str, InterfaceC10623q interfaceC10623q) {
        if (interfaceC10623q == null) {
            this.f83118a.remove(str);
        } else {
            this.f83118a.put(str, interfaceC10623q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10596n) {
            return this.f83118a.equals(((C10596n) obj).f83118a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public InterfaceC10623q f(String str, U1 u12, List list) {
        return "toString".equals(str) ? new C10658u(toString()) : InterfaceC10587m.a(this, new C10658u(str), u12, list);
    }

    public final int hashCode() {
        return this.f83118a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f83118a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
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
        return InterfaceC10587m.h(this.f83118a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
        C10596n c10596n = new C10596n();
        for (Map.Entry entry : this.f83118a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC10587m) {
                c10596n.f83118a.put((String) entry.getKey(), (InterfaceC10623q) entry.getValue());
            } else {
                c10596n.f83118a.put((String) entry.getKey(), ((InterfaceC10623q) entry.getValue()).zzt());
            }
        }
        return c10596n;
    }
}
