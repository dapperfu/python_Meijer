package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f58291a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f58292b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f<T> f58293c;

    public static final class a<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final Object f58294d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private static Executor f58295e;

        /* renamed from: a, reason: collision with root package name */
        private Executor f58296a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f58297b;

        /* renamed from: c, reason: collision with root package name */
        private final h.f<T> f58298c;

        public c<T> a() {
            if (this.f58297b == null) {
                synchronized (f58294d) {
                    try {
                        if (f58295e == null) {
                            f58295e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f58297b = f58295e;
            }
            return new c<>(this.f58296a, this.f58297b, this.f58298c);
        }

        public a(h.f<T> fVar) {
            this.f58298c = fVar;
        }
    }

    public Executor a() {
        return this.f58292b;
    }

    public h.f<T> b() {
        return this.f58293c;
    }

    public Executor c() {
        return this.f58291a;
    }

    c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f58291a = executor;
        this.f58292b = executor2;
        this.f58293c = fVar;
    }
}
