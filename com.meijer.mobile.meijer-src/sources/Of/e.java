package Of;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f23715d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f23716e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final h f23717a = h.c();

    /* renamed from: b, reason: collision with root package name */
    private long f23718b;

    /* renamed from: c, reason: collision with root package name */
    private int f23719c;

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f23719c) + this.f23717a.e(), f23716e);
        }
        return f23715d;
    }

    private synchronized void e() {
        this.f23719c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f23719c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.google.firebase.installations.h r0 = r4.f23717a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f23718b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Of.e.b():boolean");
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f23719c++;
        this.f23718b = this.f23717a.a() + a(i10);
    }

    private static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    e() {
    }
}
