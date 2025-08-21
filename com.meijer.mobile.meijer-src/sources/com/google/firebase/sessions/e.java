package com.google.firebase.sessions;

import B2.InterfaceC2911h;
import android.content.Context;
import com.google.firebase.sessions.b;
import gv.InterfaceC14411a;
import jg.F;
import jg.SessionData;
import kotlin.coroutines.CoroutineContext;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class e implements InterfaceC15490b<InterfaceC2911h<SessionData>> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f90215a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<CoroutineContext> f90216b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<F> f90217c;

    public static e a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<CoroutineContext> interfaceC14411a2, InterfaceC14411a<F> interfaceC14411a3) {
        return new e(interfaceC14411a, interfaceC14411a2, interfaceC14411a3);
    }

    public static InterfaceC2911h<SessionData> c(Context context, CoroutineContext coroutineContext, F f10) {
        return (InterfaceC2911h) lg.d.d(b.InterfaceC1296b.INSTANCE.l(context, coroutineContext, f10));
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2911h<SessionData> get() {
        return c(this.f90215a.get(), this.f90216b.get(), this.f90217c.get());
    }

    public e(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<CoroutineContext> interfaceC14411a2, InterfaceC14411a<F> interfaceC14411a3) {
        this.f90215a = interfaceC14411a;
        this.f90216b = interfaceC14411a2;
        this.f90217c = interfaceC14411a3;
    }
}
