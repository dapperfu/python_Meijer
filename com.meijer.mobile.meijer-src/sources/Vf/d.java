package Vf;

import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class d implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final a f39900a;

    public static d a(a aVar) {
        return new d(aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Lf.e get() {
        return c(this.f39900a);
    }

    public d(a aVar) {
        this.f39900a = aVar;
    }

    public static Lf.e c(a aVar) {
        return (Lf.e) C18225c.d(aVar.c());
    }
}
