package fsimpl;

/* renamed from: fsimpl.ej, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class RunnableC14190ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14189ei f133401a;

    RunnableC14190ej(C14189ei c14189ei) {
        this.f133401a = c14189ei;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f133401a.d();
        } catch (InterruptedException e10) {
        }
    }
}
