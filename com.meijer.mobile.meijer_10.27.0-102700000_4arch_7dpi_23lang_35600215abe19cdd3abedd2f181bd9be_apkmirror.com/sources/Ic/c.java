package Ic;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes4.dex */
final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<a> f13809a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13810b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f13811c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f13812d = false;

    private final void a() {
        a aVar = this.f13809a.get();
        if (aVar != null) {
            aVar.f();
            this.f13812d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f13811c.await(this.f13810b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }

    public c(a aVar, long j10) {
        this.f13809a = new WeakReference<>(aVar);
        this.f13810b = j10;
        start();
    }
}
