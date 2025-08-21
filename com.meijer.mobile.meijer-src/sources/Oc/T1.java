package Oc;

/* loaded from: classes4.dex */
public final class T1 extends J {

    /* renamed from: a, reason: collision with root package name */
    private final Gc.d f23344a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23345b;

    @Override // Oc.K
    public final void k0(W0 w02) {
        Gc.d dVar = this.f23344a;
        if (dVar != null) {
            dVar.a(w02.T());
        }
    }

    @Override // Oc.K
    public final void zzc() {
        Object obj;
        Gc.d dVar = this.f23344a;
        if (dVar == null || (obj = this.f23345b) == null) {
            return;
        }
        dVar.b(obj);
    }

    public T1(Gc.d dVar, Object obj) {
        this.f23344a = dVar;
        this.f23345b = obj;
    }
}
