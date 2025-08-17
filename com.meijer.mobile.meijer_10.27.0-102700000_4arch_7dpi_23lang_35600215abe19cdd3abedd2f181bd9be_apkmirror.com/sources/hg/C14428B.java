package hg;

import android.content.Context;
import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* renamed from: hg.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14428B implements InterfaceC14891b<C14427A> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f134729a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Z> f134730b;

    public static C14428B a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<Z> interfaceC15323a2) {
        return new C14428B(interfaceC15323a, interfaceC15323a2);
    }

    public static C14427A c(Context context, Z z10) {
        return new C14427A(context, z10);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C14427A get() {
        return c(this.f134729a.get(), this.f134730b.get());
    }

    public C14428B(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<Z> interfaceC15323a2) {
        this.f134729a = interfaceC15323a;
        this.f134730b = interfaceC15323a2;
    }
}
