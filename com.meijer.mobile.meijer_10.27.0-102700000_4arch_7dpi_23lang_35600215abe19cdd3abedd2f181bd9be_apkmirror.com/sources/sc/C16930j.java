package sc;

import android.content.Context;
import kv.InterfaceC15323a;
import tc.InterfaceC17078b;

/* renamed from: sc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16930j implements InterfaceC17078b<C16929i> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f160407a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f160408b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f160409c;

    public static C16930j a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<Bc.a> interfaceC15323a2, InterfaceC15323a<Bc.a> interfaceC15323a3) {
        return new C16930j(interfaceC15323a, interfaceC15323a2, interfaceC15323a3);
    }

    public static C16929i c(Context context, Bc.a aVar, Bc.a aVar2) {
        return new C16929i(context, aVar, aVar2);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C16929i get() {
        return c(this.f160407a.get(), this.f160408b.get(), this.f160409c.get());
    }

    public C16930j(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<Bc.a> interfaceC15323a2, InterfaceC15323a<Bc.a> interfaceC15323a3) {
        this.f160407a = interfaceC15323a;
        this.f160408b = interfaceC15323a2;
        this.f160409c = interfaceC15323a3;
    }
}
