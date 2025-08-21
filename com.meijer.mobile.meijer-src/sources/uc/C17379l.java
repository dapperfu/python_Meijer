package uc;

import android.content.Context;
import gv.InterfaceC14411a;
import vc.InterfaceC17653b;

/* renamed from: uc.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17379l implements InterfaceC17653b<C17378k> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f163901a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<C17376i> f163902b;

    public static C17379l a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<C17376i> interfaceC14411a2) {
        return new C17379l(interfaceC14411a, interfaceC14411a2);
    }

    public static C17378k c(Context context, Object obj) {
        return new C17378k(context, (C17376i) obj);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C17378k get() {
        return c(this.f163901a.get(), this.f163902b.get());
    }

    public C17379l(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<C17376i> interfaceC14411a2) {
        this.f163901a = interfaceC14411a;
        this.f163902b = interfaceC14411a2;
    }
}
