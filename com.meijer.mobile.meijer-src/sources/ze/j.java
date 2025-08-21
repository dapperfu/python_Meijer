package ze;

import Vd.C5517k;

/* loaded from: classes4.dex */
public abstract class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C5517k f172712a;

    j() {
        this.f172712a = null;
    }

    protected abstract void a();

    public j(C5517k c5517k) {
        this.f172712a = c5517k;
    }

    final C5517k b() {
        return this.f172712a;
    }

    public final void c(Exception exc) {
        C5517k c5517k = this.f172712a;
        if (c5517k != null) {
            c5517k.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }
}
