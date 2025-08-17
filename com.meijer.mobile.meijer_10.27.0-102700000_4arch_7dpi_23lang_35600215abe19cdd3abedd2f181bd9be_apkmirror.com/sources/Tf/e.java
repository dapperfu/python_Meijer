package Tf;

/* loaded from: classes7.dex */
public final class e implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final a f34968a;

    public static e a(a aVar) {
        return new e(aVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public If.b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f34968a);
    }

    public e(a aVar) {
        this.f34968a = aVar;
    }

    public static If.b<com.google.firebase.remoteconfig.c> c(a aVar) {
        return (If.b) Bu.c.d(aVar.d());
    }
}
