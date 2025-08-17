package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.InterfaceC11304m;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    private static final r f88225b = new r();

    /* renamed from: c, reason: collision with root package name */
    private static final b f88226c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<InterfaceC11304m> f88227a = new AtomicReference<>();

    private static class b implements InterfaceC11304m {
        private b() {
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11304m
        public InterfaceC11304m.a a(InterfaceC11299h interfaceC11299h, C11303l c11303l, String str, String str2) {
            return n.f88219a;
        }
    }

    public static r b() {
        return f88225b;
    }

    public InterfaceC11304m a() {
        InterfaceC11304m interfaceC11304m = this.f88227a.get();
        return interfaceC11304m == null ? f88226c : interfaceC11304m;
    }
}
