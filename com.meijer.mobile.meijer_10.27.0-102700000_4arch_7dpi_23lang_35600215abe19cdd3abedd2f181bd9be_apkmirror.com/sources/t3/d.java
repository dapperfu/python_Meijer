package t3;

import android.os.Handler;
import d3.C13466a;
import f3.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface d {

    public interface a {

        /* renamed from: t3.d$a$a, reason: collision with other inner class name */
        public static final class C2528a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C2529a> f161367a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: t3.d$a$a$a, reason: collision with other inner class name */
            static final class C2529a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f161368a;

                /* renamed from: b, reason: collision with root package name */
                private final a f161369b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f161370c;

                public void d() {
                    this.f161370c = true;
                }

                public C2529a(Handler handler, a aVar) {
                    this.f161368a = handler;
                    this.f161369b = aVar;
                }
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                Iterator<C2529a> it = this.f161367a.iterator();
                while (it.hasNext()) {
                    final C2529a next = it.next();
                    if (next.f161370c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        next.f161368a.post(new Runnable() { // from class: t3.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                next.f161369b.s(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                Iterator<C2529a> it = this.f161367a.iterator();
                while (it.hasNext()) {
                    C2529a next = it.next();
                    if (next.f161369b == aVar) {
                        next.d();
                        this.f161367a.remove(next);
                    }
                }
            }

            public void b(Handler handler, a aVar) {
                C13466a.e(handler);
                C13466a.e(aVar);
                d(aVar);
                this.f161367a.add(new C2529a(handler, aVar));
            }
        }

        void s(int i10, long j10, long j11);
    }

    o c();

    void e(a aVar);

    void f(Handler handler, a aVar);
}
