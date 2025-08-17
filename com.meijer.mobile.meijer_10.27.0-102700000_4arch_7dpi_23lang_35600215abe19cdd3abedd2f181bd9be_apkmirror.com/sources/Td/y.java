package Td;

/* loaded from: classes6.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f34957a;

    y(z zVar) {
        this.f34957a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34957a.f34959b) {
            try {
                z zVar = this.f34957a;
                if (zVar.f34960c != null) {
                    zVar.f34960c.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
