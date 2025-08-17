package com.google.firebase.sessions;

import B2.InterfaceC2943h;
import android.content.Context;
import com.google.firebase.sessions.b;
import jg.InterfaceC14891b;
import kg.SessionConfigs;
import kotlin.coroutines.CoroutineContext;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class d implements InterfaceC14891b<InterfaceC2943h<SessionConfigs>> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f89371a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<CoroutineContext> f89372b;

    public static d a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<CoroutineContext> interfaceC15323a2) {
        return new d(interfaceC15323a, interfaceC15323a2);
    }

    public static InterfaceC2943h<SessionConfigs> c(Context context, CoroutineContext coroutineContext) {
        return (InterfaceC2943h) jg.d.d(b.InterfaceC1287b.INSTANCE.i(context, coroutineContext));
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2943h<SessionConfigs> get() {
        return c(this.f89371a.get(), this.f89372b.get());
    }

    public d(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<CoroutineContext> interfaceC15323a2) {
        this.f89371a = interfaceC15323a;
        this.f89372b = interfaceC15323a2;
    }
}
