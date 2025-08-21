package of;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import nf.g;

/* renamed from: of.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16121c implements InterfaceC16120b, InterfaceC16119a {

    /* renamed from: a, reason: collision with root package name */
    private final C16123e f153862a;

    /* renamed from: b, reason: collision with root package name */
    private final int f153863b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f153864c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f153866e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f153865d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f153867f = false;

    @Override // of.InterfaceC16120b
    public void N0(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f153866e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // of.InterfaceC16119a
    public void a(String str, Bundle bundle) {
        synchronized (this.f153865d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f153866e = new CountDownLatch(1);
                this.f153867f = false;
                this.f153862a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f153866e.await(this.f153863b, this.f153864c)) {
                        this.f153867f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f153866e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C16121c(C16123e c16123e, int i10, TimeUnit timeUnit) {
        this.f153862a = c16123e;
        this.f153863b = i10;
        this.f153864c = timeUnit;
    }
}
