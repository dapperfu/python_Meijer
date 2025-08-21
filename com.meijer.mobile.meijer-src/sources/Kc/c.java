package Kc;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes4.dex */
final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<a> f16555a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16556b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f16557c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f16558d = false;

    private final void a() {
        a aVar = this.f16555a.get();
        if (aVar != null) {
            aVar.f();
            this.f16558d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f16557c.await(this.f16556b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }

    public c(a aVar, long j10) {
        this.f16555a = new WeakReference<>(aVar);
        this.f16556b = j10;
        start();
    }
}
