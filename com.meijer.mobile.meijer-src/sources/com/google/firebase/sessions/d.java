package com.google.firebase.sessions;

import B2.InterfaceC2911h;
import android.content.Context;
import com.google.firebase.sessions.b;
import gv.InterfaceC14411a;
import kotlin.coroutines.CoroutineContext;
import lg.InterfaceC15490b;
import mg.SessionConfigs;

/* loaded from: classes8.dex */
public final class d implements InterfaceC15490b<InterfaceC2911h<SessionConfigs>> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f90213a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<CoroutineContext> f90214b;

    public static d a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<CoroutineContext> interfaceC14411a2) {
        return new d(interfaceC14411a, interfaceC14411a2);
    }

    public static InterfaceC2911h<SessionConfigs> c(Context context, CoroutineContext coroutineContext) {
        return (InterfaceC2911h) lg.d.d(b.InterfaceC1296b.INSTANCE.i(context, coroutineContext));
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2911h<SessionConfigs> get() {
        return c(this.f90213a.get(), this.f90214b.get());
    }

    public d(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<CoroutineContext> interfaceC14411a2) {
        this.f90213a = interfaceC14411a;
        this.f90214b = interfaceC14411a2;
    }
}
