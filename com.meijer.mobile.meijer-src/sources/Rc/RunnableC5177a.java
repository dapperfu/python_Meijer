package Rc;

/* renamed from: Rc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC5177a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f32342a;

    RunnableC5177a(B b10) {
        this.f32342a = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32342a.f32291b = Thread.currentThread();
        this.f32342a.a();
    }
}
