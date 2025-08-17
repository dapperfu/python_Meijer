package xe;

/* loaded from: classes4.dex */
final class n extends j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f169569b;

    n(t tVar) {
        this.f169569b = tVar;
    }

    @Override // xe.j
    public final void a() {
        t tVar = this.f169569b;
        if (tVar.f169587m != null) {
            tVar.f169576b.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f169569b;
            tVar2.f169575a.unbindService(tVar2.f169586l);
            this.f169569b.f169581g = false;
            this.f169569b.f169587m = null;
            this.f169569b.f169586l = null;
        }
        this.f169569b.t();
    }
}
