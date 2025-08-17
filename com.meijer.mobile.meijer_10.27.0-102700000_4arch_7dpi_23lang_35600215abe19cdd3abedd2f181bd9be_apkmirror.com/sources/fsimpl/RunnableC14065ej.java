package fsimpl;

/* renamed from: fsimpl.ej, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class RunnableC14065ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14064ei f132151a;

    RunnableC14065ej(C14064ei c14064ei) {
        this.f132151a = c14064ei;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f132151a.d();
        } catch (InterruptedException e10) {
        }
    }
}
