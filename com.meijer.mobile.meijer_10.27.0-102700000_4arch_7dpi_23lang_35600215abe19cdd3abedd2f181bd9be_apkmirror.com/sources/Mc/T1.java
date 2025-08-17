package Mc;

/* loaded from: classes4.dex */
public final class T1 extends J {

    /* renamed from: a, reason: collision with root package name */
    private final Ec.d f19157a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f19158b;

    @Override // Mc.K
    public final void M0(W0 w02) {
        Ec.d dVar = this.f19157a;
        if (dVar != null) {
            dVar.a(w02.T());
        }
    }

    @Override // Mc.K
    public final void zzc() {
        Object obj;
        Ec.d dVar = this.f19157a;
        if (dVar == null || (obj = this.f19158b) == null) {
            return;
        }
        dVar.b(obj);
    }

    public T1(Ec.d dVar, Object obj) {
        this.f19157a = dVar;
        this.f19158b = obj;
    }
}
