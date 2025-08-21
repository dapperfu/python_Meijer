package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
final class V0 {

    /* renamed from: c, reason: collision with root package name */
    private static final V0 f82047c = new V0();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10407b1 f82048a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, InterfaceC10404a1<?>> f82049b = new ConcurrentHashMap();

    private V0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        InterfaceC10407b1 interfaceC10407b1C = null;
        for (int i10 = 0; i10 <= 0; i10++) {
            interfaceC10407b1C = c(strArr[0]);
            if (interfaceC10407b1C != null) {
                break;
            }
        }
        this.f82048a = interfaceC10407b1C == null ? new C10474y0() : interfaceC10407b1C;
    }

    public static V0 a() {
        return f82047c;
    }

    private static InterfaceC10407b1 c(String str) {
        try {
            return (InterfaceC10407b1) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> InterfaceC10404a1<T> b(Class<T> cls) {
        C10424h0.e(cls, "messageType");
        InterfaceC10404a1<T> interfaceC10404a1A = (InterfaceC10404a1) this.f82049b.get(cls);
        if (interfaceC10404a1A == null) {
            interfaceC10404a1A = this.f82048a.a(cls);
            C10424h0.e(cls, "messageType");
            C10424h0.e(interfaceC10404a1A, "schema");
            InterfaceC10404a1<T> interfaceC10404a1 = (InterfaceC10404a1) this.f82049b.putIfAbsent(cls, interfaceC10404a1A);
            if (interfaceC10404a1 != null) {
                return interfaceC10404a1;
            }
        }
        return interfaceC10404a1A;
    }

    public final <T> InterfaceC10404a1<T> d(T t10) {
        return b(t10.getClass());
    }
}
