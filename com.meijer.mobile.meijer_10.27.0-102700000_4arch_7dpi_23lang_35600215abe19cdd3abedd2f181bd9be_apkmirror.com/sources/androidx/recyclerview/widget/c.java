package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f58067a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f58068b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f<T> f58069c;

    public static final class a<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final Object f58070d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private static Executor f58071e;

        /* renamed from: a, reason: collision with root package name */
        private Executor f58072a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f58073b;

        /* renamed from: c, reason: collision with root package name */
        private final h.f<T> f58074c;

        public c<T> a() {
            if (this.f58073b == null) {
                synchronized (f58070d) {
                    try {
                        if (f58071e == null) {
                            f58071e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f58073b = f58071e;
            }
            return new c<>(this.f58072a, this.f58073b, this.f58074c);
        }

        public a(h.f<T> fVar) {
            this.f58074c = fVar;
        }
    }

    public Executor a() {
        return this.f58068b;
    }

    public h.f<T> b() {
        return this.f58069c;
    }

    public Executor c() {
        return this.f58067a;
    }

    c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f58067a = executor;
        this.f58068b = executor2;
        this.f58069c = fVar;
    }
}
