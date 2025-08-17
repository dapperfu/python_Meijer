package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC10462m {
    boolean S(String str);

    InterfaceC10498q W(String str);

    void e(String str, InterfaceC10498q interfaceC10498q);

    static InterfaceC10498q a(InterfaceC10462m interfaceC10462m, InterfaceC10498q interfaceC10498q, U1 u12, List list) {
        if (interfaceC10462m.S(interfaceC10498q.zzc())) {
            InterfaceC10498q interfaceC10498qW = interfaceC10462m.W(interfaceC10498q.zzc());
            if (interfaceC10498qW instanceof AbstractC10444k) {
                return ((AbstractC10444k) interfaceC10498qW).b(u12, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC10498q.zzc()));
        }
        if ("hasOwnProperty".equals(interfaceC10498q.zzc())) {
            C10545v2.a("hasOwnProperty", 1, list);
            if (interfaceC10462m.S(u12.a((InterfaceC10498q) list.get(0)).zzc())) {
                return InterfaceC10498q.f82347n3;
            }
            return InterfaceC10498q.f82348o3;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC10498q.zzc()));
    }

    static Iterator h(Map map) {
        return new C10453l(map.keySet().iterator());
    }
}
