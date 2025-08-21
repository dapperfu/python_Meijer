package x8;

/* renamed from: x8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18135c implements K7.g {

    /* renamed from: a, reason: collision with root package name */
    private final w8.e f170639a;

    /* renamed from: b, reason: collision with root package name */
    private final w8.f f170640b;

    @Override // K7.g
    public void a(X7.b bVar) {
        if (bVar == null) {
            return;
        }
        bVar.r(this.f170640b.a());
    }

    @Override // K7.g
    public void b(X7.b bVar) {
        if (bVar == null) {
            return;
        }
        bVar.p(this.f170639a.a());
    }

    public C18135c(w8.e eVar, w8.f fVar) {
        this.f170639a = eVar;
        this.f170640b = fVar;
    }
}
