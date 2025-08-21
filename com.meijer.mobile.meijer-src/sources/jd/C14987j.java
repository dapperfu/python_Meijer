package jd;

import android.os.Looper;
import java.util.concurrent.Executor;
import rd.ExecutorC16892a;

/* renamed from: jd.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14987j<L> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f140340a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f140341b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f140342c;

    /* renamed from: jd.j$a */
    public static final class a<L> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f140343a;

        /* renamed from: b, reason: collision with root package name */
        private final String f140344b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f140343a == aVar.f140343a && this.f140344b.equals(aVar.f140344b);
        }

        public String a() {
            return this.f140344b + "@" + System.identityHashCode(this.f140343a);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f140343a) * 31) + this.f140344b.hashCode();
        }

        a(L l10, String str) {
            this.f140343a = l10;
            this.f140344b = str;
        }
    }

    /* renamed from: jd.j$b */
    public interface b<L> {
        void a(L l10);

        void b();
    }

    C14987j(Looper looper, L l10, String str) {
        this.f140340a = new ExecutorC16892a(looper);
        this.f140341b = com.google.android.gms.common.internal.r.m(l10, "Listener must not be null");
        this.f140342c = new a(l10, com.google.android.gms.common.internal.r.f(str));
    }

    public void a() {
        this.f140341b = null;
        this.f140342c = null;
    }

    public a<L> b() {
        return this.f140342c;
    }

    public void c(final b<? super L> bVar) {
        com.google.android.gms.common.internal.r.m(bVar, "Notifier must not be null");
        this.f140340a.execute(new Runnable() { // from class: jd.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f140275a.d(bVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void d(b bVar) {
        Object obj = this.f140341b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }

    C14987j(Executor executor, L l10, String str) {
        this.f140340a = (Executor) com.google.android.gms.common.internal.r.m(executor, "Executor must not be null");
        this.f140341b = com.google.android.gms.common.internal.r.m(l10, "Listener must not be null");
        this.f140342c = new a(l10, com.google.android.gms.common.internal.r.f(str));
    }
}
