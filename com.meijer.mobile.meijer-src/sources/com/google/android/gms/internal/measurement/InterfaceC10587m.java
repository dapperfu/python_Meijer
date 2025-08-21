package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC10587m {
    boolean S(String str);

    InterfaceC10623q X(String str);

    void e(String str, InterfaceC10623q interfaceC10623q);

    static InterfaceC10623q a(InterfaceC10587m interfaceC10587m, InterfaceC10623q interfaceC10623q, U1 u12, List list) {
        if (interfaceC10587m.S(interfaceC10623q.zzc())) {
            InterfaceC10623q interfaceC10623qX = interfaceC10587m.X(interfaceC10623q.zzc());
            if (interfaceC10623qX instanceof AbstractC10569k) {
                return ((AbstractC10569k) interfaceC10623qX).b(u12, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC10623q.zzc()));
        }
        if ("hasOwnProperty".equals(interfaceC10623q.zzc())) {
            C10670v2.a("hasOwnProperty", 1, list);
            if (interfaceC10587m.S(u12.a((InterfaceC10623q) list.get(0)).zzc())) {
                return InterfaceC10623q.f83187n3;
            }
            return InterfaceC10623q.f83188o3;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC10623q.zzc()));
    }

    static Iterator h(Map map) {
        return new C10578l(map.keySet().iterator());
    }
}
