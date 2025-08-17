package hd;

import android.os.Looper;
import java.util.concurrent.Executor;
import pd.ExecutorC16288a;

/* renamed from: hd.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14409j<L> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f134651a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f134652b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f134653c;

    /* renamed from: hd.j$a */
    public static final class a<L> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f134654a;

        /* renamed from: b, reason: collision with root package name */
        private final String f134655b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f134654a == aVar.f134654a && this.f134655b.equals(aVar.f134655b);
        }

        public String a() {
            return this.f134655b + "@" + System.identityHashCode(this.f134654a);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f134654a) * 31) + this.f134655b.hashCode();
        }

        a(L l10, String str) {
            this.f134654a = l10;
            this.f134655b = str;
        }
    }

    /* renamed from: hd.j$b */
    public interface b<L> {
        void a(L l10);

        void b();
    }

    C14409j(Looper looper, L l10, String str) {
        this.f134651a = new ExecutorC16288a(looper);
        this.f134652b = com.google.android.gms.common.internal.r.m(l10, "Listener must not be null");
        this.f134653c = new a(l10, com.google.android.gms.common.internal.r.f(str));
    }

    public void a() {
        this.f134652b = null;
        this.f134653c = null;
    }

    public a<L> b() {
        return this.f134653c;
    }

    public void c(final b<? super L> bVar) {
        com.google.android.gms.common.internal.r.m(bVar, "Notifier must not be null");
        this.f134651a.execute(new Runnable() { // from class: hd.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f134586a.d(bVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void d(b bVar) {
        Object obj = this.f134652b;
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

    C14409j(Executor executor, L l10, String str) {
        this.f134651a = (Executor) com.google.android.gms.common.internal.r.m(executor, "Executor must not be null");
        this.f134652b = com.google.android.gms.common.internal.r.m(l10, "Listener must not be null");
        this.f134653c = new a(l10, com.google.android.gms.common.internal.r.f(str));
    }
}
