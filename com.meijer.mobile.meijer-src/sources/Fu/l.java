package Fu;

import Fu.j;
import Fu.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
final class l {

    private static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f10949b = Logger.getLogger(b.class.getName());

        /* renamed from: a, reason: collision with root package name */
        private boolean f10950a;

        private b() {
        }

        @Override // Fu.k
        public k a(j.b bVar, long j10) {
            if (j10 < 0) {
                this.f10950a = true;
            }
            return this;
        }

        @Override // Fu.k
        public void b(Gu.f fVar) {
            Eu.c.c(fVar, "tags");
            if (this.f10950a) {
                f10949b.log(Level.WARNING, "Dropping values, value to record must be non-negative.");
            }
        }
    }

    private static final class c extends n {

        /* renamed from: a, reason: collision with root package name */
        private final q f10951a;

        private c() {
            this.f10951a = l.d();
        }

        @Override // Fu.n
        public q b() {
            return this.f10951a;
        }

        @Override // Fu.n
        public o a() {
            return l.a();
        }
    }

    private static final class e extends q {

        /* renamed from: c, reason: collision with root package name */
        private static final Du.c f10953c = Du.c.b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        private final Map<p.c, p> f10954a;

        /* renamed from: b, reason: collision with root package name */
        private volatile Set<p> f10955b;

        private e() {
            this.f10954a = new HashMap();
        }

        @Override // Fu.q
        public void a(p pVar) {
            Eu.c.c(pVar, "newView");
            synchronized (this.f10954a) {
                try {
                    this.f10955b = null;
                    p pVar2 = this.f10954a.get(pVar.g());
                    Eu.c.a(pVar2 == null || pVar.equals(pVar2), "A different view with the same name already exists.");
                    if (pVar2 == null) {
                        this.f10954a.put(pVar.g(), pVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class d extends o {

        /* renamed from: a, reason: collision with root package name */
        static final o f10952a = new d();

        private d() {
        }

        @Override // Fu.o
        public k a() {
            return l.b();
        }
    }

    static o a() {
        return d.f10952a;
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
