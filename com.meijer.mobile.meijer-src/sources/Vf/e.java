package Vf;

import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class e implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final a f39901a;

    public static e a(a aVar) {
        return new e(aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Kf.b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f39901a);
    }

    public e(a aVar) {
        this.f39901a = aVar;
    }

    public static Kf.b<com.google.firebase.remoteconfig.c> c(a aVar) {
        return (Kf.b) C18225c.d(aVar.d());
    }
}
