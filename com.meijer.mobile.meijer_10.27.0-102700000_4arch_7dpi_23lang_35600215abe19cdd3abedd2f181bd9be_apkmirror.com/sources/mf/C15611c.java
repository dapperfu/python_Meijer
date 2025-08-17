package mf;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import lf.g;

/* renamed from: mf.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C15611c implements InterfaceC15610b, InterfaceC15609a {

    /* renamed from: a, reason: collision with root package name */
    private final C15613e f150075a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150076b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f150077c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f150079e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f150078d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f150080f = false;

    @Override // mf.InterfaceC15610b
    public void N0(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f150079e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // mf.InterfaceC15609a
    public void a(String str, Bundle bundle) {
        synchronized (this.f150078d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f150079e = new CountDownLatch(1);
                this.f150080f = false;
                this.f150075a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f150079e.await(this.f150076b, this.f150077c)) {
                        this.f150080f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f150079e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C15611c(C15613e c15613e, int i10, TimeUnit timeUnit) {
        this.f150075a = c15613e;
        this.f150076b = i10;
        this.f150077c = timeUnit;
    }
}
