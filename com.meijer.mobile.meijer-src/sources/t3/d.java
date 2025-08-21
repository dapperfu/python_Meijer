package t3;

import android.os.Handler;
import d3.C13599a;
import f3.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface d {

    public interface a {

        /* renamed from: t3.d$a$a, reason: collision with other inner class name */
        public static final class C2547a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C2548a> f162177a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: t3.d$a$a$a, reason: collision with other inner class name */
            static final class C2548a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f162178a;

                /* renamed from: b, reason: collision with root package name */
                private final a f162179b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f162180c;

                public void d() {
                    this.f162180c = true;
                }

                public C2548a(Handler handler, a aVar) {
                    this.f162178a = handler;
                    this.f162179b = aVar;
                }
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                Iterator<C2548a> it = this.f162177a.iterator();
                while (it.hasNext()) {
                    final C2548a next = it.next();
                    if (next.f162180c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        next.f162178a.post(new Runnable() { // from class: t3.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                next.f162179b.s(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                Iterator<C2548a> it = this.f162177a.iterator();
                while (it.hasNext()) {
                    C2548a next = it.next();
                    if (next.f162179b == aVar) {
                        next.d();
                        this.f162177a.remove(next);
                    }
                }
            }

            public void b(Handler handler, a aVar) {
                C13599a.e(handler);
                C13599a.e(aVar);
                d(aVar);
                this.f162177a.add(new C2548a(handler, aVar));
            }
        }

        void s(int i10, long j10, long j11);
    }

    o c();

    void e(a aVar);

    void f(Handler handler, a aVar);
}
