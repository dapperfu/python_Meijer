package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10471n implements InterfaceC10498q, InterfaceC10462m {

    /* renamed from: a, reason: collision with root package name */
    final Map f82278a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final boolean S(String str) {
        return this.f82278a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final InterfaceC10498q W(String str) {
        Map map = this.f82278a;
        return map.containsKey(str) ? (InterfaceC10498q) map.get(str) : InterfaceC10498q.f82342i3;
    }

    public final List b() {
        return new ArrayList(this.f82278a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final void e(String str, InterfaceC10498q interfaceC10498q) {
        if (interfaceC10498q == null) {
            this.f82278a.remove(str);
        } else {
            this.f82278a.put(str, interfaceC10498q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10471n) {
            return this.f82278a.equals(((C10471n) obj).f82278a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public InterfaceC10498q f(String str, U1 u12, List list) {
        return "toString".equals(str) ? new C10533u(toString()) : InterfaceC10462m.a(this, new C10533u(str), u12, list);
    }

    public final int hashCode() {
        return this.f82278a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f82278a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
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
        return InterfaceC10462m.h(this.f82278a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        C10471n c10471n = new C10471n();
        for (Map.Entry entry : this.f82278a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC10462m) {
                c10471n.f82278a.put((String) entry.getKey(), (InterfaceC10498q) entry.getValue());
            } else {
                c10471n.f82278a.put((String) entry.getKey(), ((InterfaceC10498q) entry.getValue()).zzt());
            }
        }
        return c10471n;
    }
}
