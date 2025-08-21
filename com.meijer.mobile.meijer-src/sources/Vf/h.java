package Vf;

import rc.InterfaceC16890j;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class h implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final a f39904a;

    public static h a(a aVar) {
        return new h(aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Kf.b<InterfaceC16890j> get() {
        return c(this.f39904a);
    }

    public h(a aVar) {
        this.f39904a = aVar;
    }

    public static Kf.b<InterfaceC16890j> c(a aVar) {
        return (Kf.b) C18225c.d(aVar.g());
    }
}
