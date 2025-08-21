package net.zetetic.database.sqlcipher;

import com.fullstory.FS;

/* loaded from: classes14.dex */
public final class CloseGuard {

    /* renamed from: b, reason: collision with root package name */
    private static final CloseGuard f152253b = new CloseGuard();

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f152254c = true;

    /* renamed from: d, reason: collision with root package name */
    private static volatile Reporter f152255d = new DefaultReporter();

    /* renamed from: a, reason: collision with root package name */
    private Throwable f152256a;

    public interface Reporter {
        void a(String str, Throwable th2);
    }

    public void a() {
        this.f152256a = null;
    }

    private static final class DefaultReporter implements Reporter {
        private DefaultReporter() {
        }

        @Override // net.zetetic.database.sqlcipher.CloseGuard.Reporter
        public void a(String str, Throwable th2) {
            FS.log_w(str, th2);
        }
    }

    public static CloseGuard b() {
        return !f152254c ? f152253b : new CloseGuard();
    }

    public void c(String str) {
        if (str == null) {
            throw new NullPointerException("closer == null");
        }
        if (this == f152253b || !f152254c) {
            return;
        }
        this.f152256a = new Throwable("Explicit termination method '" + str + "' not called");
    }

    public void d() {
        if (this.f152256a == null || !f152254c) {
            return;
        }
        f152255d.a("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.f152256a);
    }

    private CloseGuard() {
    }
}
