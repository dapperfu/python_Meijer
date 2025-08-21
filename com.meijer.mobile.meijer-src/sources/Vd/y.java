package Vd;

/* loaded from: classes6.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f39890a;

    y(z zVar) {
        this.f39890a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39890a.f39892b) {
            try {
                z zVar = this.f39890a;
                if (zVar.f39893c != null) {
                    zVar.f39893c.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
