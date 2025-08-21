package jd;

/* loaded from: classes4.dex */
final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f140245a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f140246b;

    E(H h10, int i10) {
        this.f140246b = h10;
        this.f140245a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f140246b.i(this.f140245a);
    }
}
