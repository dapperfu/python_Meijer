package jd;

/* loaded from: classes4.dex */
final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f140247a;

    F(G g10) {
        this.f140247a = g10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H h10 = this.f140247a.f140248a;
        h10.f140250b.disconnect(h10.f140250b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
