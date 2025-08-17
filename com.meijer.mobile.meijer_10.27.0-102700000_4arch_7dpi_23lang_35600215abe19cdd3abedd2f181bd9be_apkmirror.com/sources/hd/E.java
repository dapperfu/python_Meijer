package hd;

/* loaded from: classes4.dex */
final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f134556a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f134557b;

    E(H h10, int i10) {
        this.f134557b = h10;
        this.f134556a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f134557b.i(this.f134556a);
    }
}
