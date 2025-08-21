package x6;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class W {

    /* renamed from: d, reason: collision with root package name */
    Future<Pair<String, Long>> f170501d;

    /* renamed from: e, reason: collision with root package name */
    public int f170502e;

    /* renamed from: f, reason: collision with root package name */
    public long f170503f;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<C18096B> f170499b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    AtomicBoolean f170500c = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    final b f170498a = new b(this, 0);

    class a implements Callable<Pair<String, Long>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<String, Long> call() throws Exception {
            return W.this.c();
        }
    }

    class b implements Observer {

        /* renamed from: a, reason: collision with root package name */
        long f170505a;

        /* renamed from: b, reason: collision with root package name */
        private int f170506b;

        private b() {
            this.f170506b = -1;
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            try {
                W w10 = W.this;
                w10.f170503f++;
                if (obj == null || w10.f170499b.size() >= 50 || W.this.f170500c.get()) {
                    return;
                }
                C18096B c18096b = (C18096B) obj;
                C18096B c18096b2 = new C18096B(c18096b.f170378a - this.f170505a, c18096b.f170379b, c18096b.f170380c, c18096b.f170381d);
                int i10 = this.f170506b;
                int i11 = c18096b.f170380c;
                if (i10 != i11) {
                    W.this.f170502e = 0;
                    this.f170506b = i11;
                }
                W w11 = W.this;
                int i12 = w11.f170502e;
                if (i12 < 9) {
                    w11.f170502e = i12 + 1;
                    w11.f170499b.add(c18096b2);
                }
                this.f170505a = c18096b.f170378a;
                if (W.this.f170499b.size() >= 50) {
                    W w12 = W.this;
                    Future<Pair<String, Long>> future = w12.f170501d;
                    if (future == null || future.isCancelled() || w12.f170501d.isDone()) {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                        w12.f170501d = executorServiceNewFixedThreadPool.submit(w12.new a());
                        executorServiceNewFixedThreadPool.shutdown();
                    }
                }
            } catch (Exception e10) {
                r.d("TextChangeManager", "Exception in processing text change event", e10);
                C18095A.a(e10);
            }
        }

        /* synthetic */ b(W w10, byte b10) {
            this();
        }
    }

    private void d() {
        Future<Pair<String, Long>> future = this.f170501d;
        if (future != null) {
            if (!future.isCancelled() && !this.f170501d.isDone()) {
                this.f170501d.cancel(true);
            }
            this.f170501d = null;
        }
    }

    public final void a() {
        this.f170498a.f170505a = SystemClock.uptimeMillis();
        this.f170502e = 0;
        this.f170503f = 0L;
        this.f170499b.clear();
        d();
    }

    public final Pair<String, Long> b() throws ExecutionException, InterruptedException {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        try {
            Future<Pair<String, Long>> future2 = this.f170501d;
            if (future2 != null) {
                try {
                    try {
                        pair = future2.get();
                    } catch (InterruptedException e10) {
                        r.d("TextChangeManager", "Failed to get Text data: " + e10.getMessage(), new Throwable[0]);
                    }
                } catch (ExecutionException e11) {
                    r.d("TextChangeManager", "Failed to get Text data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (pair != null) {
                return pair;
            }
            pair = c();
            if (pair != null || (future = this.f170501d) == null) {
                return pair;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                r.d("TextChangeManager", "Failed to get Text data: " + e12.getMessage(), new Throwable[0]);
                return pair;
            } catch (ExecutionException e13) {
                r.d("TextChangeManager", "Failed to get Text data: " + e13.getMessage(), new Throwable[0]);
                return pair;
            }
        } catch (Exception e14) {
            r.d("TextChangeManager", "Exception in processing text event", e14);
            C18095A.a(e14);
            return pair;
        }
    }

    final Pair<String, Long> c() throws Exception {
        long jB = 0;
        String str = "";
        if (this.f170499b.size() == 0) {
            return new Pair<>("", 0L);
        }
        if (!this.f170500c.compareAndSet(false, true)) {
            return null;
        }
        Iterator<C18096B> it = this.f170499b.iterator();
        while (it.hasNext()) {
            C18096B next = it.next();
            String str2 = next.f170379b + "," + Long.valueOf(next.f170378a) + "," + next.f170380c;
            if (next.f170381d) {
                str2 = str2 + ",1";
            }
            str = str + (str2 + ";");
            jB += next.f170378a + S.b(next.f170379b) + next.f170380c;
            SystemClock.uptimeMillis();
            String str3 = C18127w.f170598b;
            this.f170499b.size();
        }
        this.f170500c.set(false);
        return new Pair<>(str, Long.valueOf(jB));
    }

    W() {
        a();
    }
}
