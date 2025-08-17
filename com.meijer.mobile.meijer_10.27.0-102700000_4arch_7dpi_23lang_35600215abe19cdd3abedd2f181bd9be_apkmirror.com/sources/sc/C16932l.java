package sc;

import android.content.Context;
import kv.InterfaceC15323a;
import tc.InterfaceC17078b;

/* renamed from: sc.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16932l implements InterfaceC17078b<C16931k> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f160415a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<C16929i> f160416b;

    public static C16932l a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<C16929i> interfaceC15323a2) {
        return new C16932l(interfaceC15323a, interfaceC15323a2);
    }

    public static C16931k c(Context context, Object obj) {
        return new C16931k(context, (C16929i) obj);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C16931k get() {
        return c(this.f160415a.get(), this.f160416b.get());
    }

    public C16932l(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<C16929i> interfaceC15323a2) {
        this.f160415a = interfaceC15323a;
        this.f160416b = interfaceC15323a2;
    }
}
