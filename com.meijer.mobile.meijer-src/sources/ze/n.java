package ze;

/* loaded from: classes4.dex */
final class n extends j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f172718b;

    n(t tVar) {
        this.f172718b = tVar;
    }

    @Override // ze.j
    public final void a() {
        t tVar = this.f172718b;
        if (tVar.f172736m != null) {
            tVar.f172725b.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f172718b;
            tVar2.f172724a.unbindService(tVar2.f172735l);
            this.f172718b.f172730g = false;
            this.f172718b.f172736m = null;
            this.f172718b.f172735l = null;
        }
        this.f172718b.t();
    }
}
