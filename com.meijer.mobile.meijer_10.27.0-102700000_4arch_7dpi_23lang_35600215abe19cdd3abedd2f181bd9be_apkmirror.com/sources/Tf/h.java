package Tf;

import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
public final class h implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final a f34971a;

    public static h a(a aVar) {
        return new h(aVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public If.b<InterfaceC16286j> get() {
        return c(this.f34971a);
    }

    public h(a aVar) {
        this.f34971a = aVar;
    }

    public static If.b<InterfaceC16286j> c(a aVar) {
        return (If.b) Bu.c.d(aVar.g());
    }
}
