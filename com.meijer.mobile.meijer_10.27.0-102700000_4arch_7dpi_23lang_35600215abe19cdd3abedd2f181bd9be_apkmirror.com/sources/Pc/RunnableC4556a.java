package Pc;

/* renamed from: Pc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC4556a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f25128a;

    RunnableC4556a(B b10) {
        this.f25128a = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25128a.f25077b = Thread.currentThread();
        this.f25128a.a();
    }
}
