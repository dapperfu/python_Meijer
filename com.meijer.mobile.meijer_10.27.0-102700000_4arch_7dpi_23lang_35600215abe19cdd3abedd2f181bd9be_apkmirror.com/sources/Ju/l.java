package Ju;

import Ju.j;
import Ju.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class l {

    private static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f16150b = Logger.getLogger(b.class.getName());

        /* renamed from: a, reason: collision with root package name */
        private boolean f16151a;

        private b() {
        }

        @Override // Ju.k
        public k a(j.b bVar, long j10) {
            if (j10 < 0) {
                this.f16151a = true;
            }
            return this;
        }

        @Override // Ju.k
        public void b(Ku.f fVar) {
            Iu.c.c(fVar, "tags");
            if (this.f16151a) {
                f16150b.log(Level.WARNING, "Dropping values, value to record must be non-negative.");
            }
        }
    }

    private static final class c extends n {

        /* renamed from: a, reason: collision with root package name */
        private final q f16152a;

        private c() {
            this.f16152a = l.d();
        }

        @Override // Ju.n
        public q b() {
            return this.f16152a;
        }

        @Override // Ju.n
        public o a() {
            return l.a();
        }
    }

    private static final class e extends q {

        /* renamed from: c, reason: collision with root package name */
        private static final Hu.c f16154c = Hu.c.b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        private final Map<p.c, p> f16155a;

        /* renamed from: b, reason: collision with root package name */
        private volatile Set<p> f16156b;

        private e() {
            this.f16155a = new HashMap();
        }

        @Override // Ju.q
        public void a(p pVar) {
            Iu.c.c(pVar, "newView");
            synchronized (this.f16155a) {
                try {
                    this.f16156b = null;
                    p pVar2 = this.f16155a.get(pVar.g());
                    Iu.c.a(pVar2 == null || pVar.equals(pVar2), "A different view with the same name already exists.");
                    if (pVar2 == null) {
                        this.f16155a.put(pVar.g(), pVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class d extends o {

        /* renamed from: a, reason: collision with root package name */
        static final o f16153a = new d();

        private d() {
        }

        @Override // Ju.o
        public k a() {
            return l.b();
        }
    }

    static o a() {
        return d.f16153a;
    }

    static k b() {
        return new b();
    }

    static n c() {
        return new c();
    }

    static q d() {
        return new e();
    }
}
