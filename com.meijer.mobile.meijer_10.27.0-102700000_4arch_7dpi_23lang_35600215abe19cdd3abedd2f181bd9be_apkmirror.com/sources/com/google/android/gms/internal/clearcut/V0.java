package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
final class V0 {

    /* renamed from: c, reason: collision with root package name */
    private static final V0 f81207c = new V0();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10282b1 f81208a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, InterfaceC10279a1<?>> f81209b = new ConcurrentHashMap();

    private V0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        InterfaceC10282b1 interfaceC10282b1C = null;
        for (int i10 = 0; i10 <= 0; i10++) {
            interfaceC10282b1C = c(strArr[0]);
            if (interfaceC10282b1C != null) {
                break;
            }
        }
        this.f81208a = interfaceC10282b1C == null ? new C10349y0() : interfaceC10282b1C;
    }

    public static V0 a() {
        return f81207c;
    }

    private static InterfaceC10282b1 c(String str) {
        try {
            return (InterfaceC10282b1) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> InterfaceC10279a1<T> b(Class<T> cls) {
        C10299h0.e(cls, "messageType");
        InterfaceC10279a1<T> interfaceC10279a1A = (InterfaceC10279a1) this.f81209b.get(cls);
        if (interfaceC10279a1A == null) {
            interfaceC10279a1A = this.f81208a.a(cls);
            C10299h0.e(cls, "messageType");
            C10299h0.e(interfaceC10279a1A, "schema");
            InterfaceC10279a1<T> interfaceC10279a1 = (InterfaceC10279a1) this.f81209b.putIfAbsent(cls, interfaceC10279a1A);
            if (interfaceC10279a1 != null) {
                return interfaceC10279a1;
            }
        }
        return interfaceC10279a1A;
    }

    public final <T> InterfaceC10279a1<T> d(T t10) {
        return b(t10.getClass());
    }
}
