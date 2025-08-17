package com.google.firebase.sessions;

import B2.InterfaceC2943h;
import android.content.Context;
import com.google.firebase.sessions.b;
import hg.F;
import hg.SessionData;
import jg.InterfaceC14891b;
import kotlin.coroutines.CoroutineContext;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class e implements InterfaceC14891b<InterfaceC2943h<SessionData>> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f89373a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<CoroutineContext> f89374b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<F> f89375c;

    public static e a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<CoroutineContext> interfaceC15323a2, InterfaceC15323a<F> interfaceC15323a3) {
        return new e(interfaceC15323a, interfaceC15323a2, interfaceC15323a3);
    }

    public static InterfaceC2943h<SessionData> c(Context context, CoroutineContext coroutineContext, F f10) {
        return (InterfaceC2943h) jg.d.d(b.InterfaceC1287b.INSTANCE.l(context, coroutineContext, f10));
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2943h<SessionData> get() {
        return c(this.f89373a.get(), this.f89374b.get(), this.f89375c.get());
    }

    public e(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<CoroutineContext> interfaceC15323a2, InterfaceC15323a<F> interfaceC15323a3) {
        this.f89373a = interfaceC15323a;
        this.f89374b = interfaceC15323a2;
        this.f89375c = interfaceC15323a3;
    }
}
