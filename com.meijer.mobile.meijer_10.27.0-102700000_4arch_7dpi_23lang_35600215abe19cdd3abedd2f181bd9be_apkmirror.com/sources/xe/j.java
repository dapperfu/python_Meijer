package xe;

import Td.C5233k;

/* loaded from: classes4.dex */
public abstract class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C5233k f169563a;

    j() {
        this.f169563a = null;
    }

    protected abstract void a();

    public j(C5233k c5233k) {
        this.f169563a = c5233k;
    }

    final C5233k b() {
        return this.f169563a;
    }

    public final void c(Exception exc) {
        C5233k c5233k = this.f169563a;
        if (c5233k != null) {
            c5233k.d(exc);
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
