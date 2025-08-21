package jg;

import android.content.Context;
import gv.InterfaceC14411a;
import lg.InterfaceC15490b;

/* renamed from: jg.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15006B implements InterfaceC15490b<C15005A> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f140424a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Z> f140425b;

    public static C15006B a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<Z> interfaceC14411a2) {
        return new C15006B(interfaceC14411a, interfaceC14411a2);
    }

    public static C15005A c(Context context, Z z10) {
        return new C15005A(context, z10);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15005A get() {
        return c(this.f140424a.get(), this.f140425b.get());
    }

    public C15006B(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<Z> interfaceC14411a2) {
        this.f140424a = interfaceC14411a;
        this.f140425b = interfaceC14411a2;
    }
}
