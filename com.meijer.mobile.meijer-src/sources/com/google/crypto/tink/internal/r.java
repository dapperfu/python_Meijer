package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.InterfaceC11429m;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    private static final r f89065b = new r();

    /* renamed from: c, reason: collision with root package name */
    private static final b f89066c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<InterfaceC11429m> f89067a = new AtomicReference<>();

    private static class b implements InterfaceC11429m {
        private b() {
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11429m
        public InterfaceC11429m.a a(InterfaceC11424h interfaceC11424h, C11428l c11428l, String str, String str2) {
            return n.f89059a;
        }
    }

    public static r b() {
        return f89065b;
    }

    public InterfaceC11429m a() {
        InterfaceC11429m interfaceC11429m = this.f89067a.get();
        return interfaceC11429m == null ? f89066c : interfaceC11429m;
    }
}
