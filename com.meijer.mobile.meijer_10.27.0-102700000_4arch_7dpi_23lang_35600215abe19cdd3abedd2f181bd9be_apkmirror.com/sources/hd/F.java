package hd;

/* loaded from: classes4.dex */
final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f134558a;

    F(G g10) {
        this.f134558a = g10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H h10 = this.f134558a.f134559a;
        h10.f134561b.disconnect(h10.f134561b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
