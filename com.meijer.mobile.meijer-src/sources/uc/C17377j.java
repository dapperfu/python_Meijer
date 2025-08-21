package uc;

import android.content.Context;
import gv.InterfaceC14411a;
import vc.InterfaceC17653b;

/* renamed from: uc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17377j implements InterfaceC17653b<C17376i> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f163893a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f163894b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f163895c;

    public static C17377j a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<Dc.a> interfaceC14411a2, InterfaceC14411a<Dc.a> interfaceC14411a3) {
        return new C17377j(interfaceC14411a, interfaceC14411a2, interfaceC14411a3);
    }

    public static C17376i c(Context context, Dc.a aVar, Dc.a aVar2) {
        return new C17376i(context, aVar, aVar2);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C17376i get() {
        return c(this.f163893a.get(), this.f163894b.get(), this.f163895c.get());
    }

    public C17377j(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<Dc.a> interfaceC14411a2, InterfaceC14411a<Dc.a> interfaceC14411a3) {
        this.f163893a = interfaceC14411a;
        this.f163894b = interfaceC14411a2;
        this.f163895c = interfaceC14411a3;
    }
}
