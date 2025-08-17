package net.zetetic.database.sqlcipher;

import com.fullstory.FS;

/* loaded from: classes13.dex */
public final class CloseGuard {

    /* renamed from: b, reason: collision with root package name */
    private static final CloseGuard f151244b = new CloseGuard();

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f151245c = true;

    /* renamed from: d, reason: collision with root package name */
    private static volatile Reporter f151246d = new DefaultReporter();

    /* renamed from: a, reason: collision with root package name */
    private Throwable f151247a;

    public interface Reporter {
        void a(String str, Throwable th2);
    }

    public void a() {
        this.f151247a = null;
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
        return !f151245c ? f151244b : new CloseGuard();
    }

    public void c(String str) {
        if (str == null) {
            throw new NullPointerException("closer == null");
        }
        if (this == f151244b || !f151245c) {
            return;
        }
        this.f151247a = new Throwable("Explicit termination method '" + str + "' not called");
    }

    public void d() {
        if (this.f151247a == null || !f151245c) {
            return;
        }
        f151246d.a("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.f151247a);
    }

    private CloseGuard() {
    }
}
