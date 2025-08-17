package w6;

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
    Future<Pair<String, Long>> f165856d;

    /* renamed from: e, reason: collision with root package name */
    public int f165857e;

    /* renamed from: f, reason: collision with root package name */
    public long f165858f;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<C17775B> f165854b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    AtomicBoolean f165855c = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    final b f165853a = new b(this, 0);

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
        long f165860a;

        /* renamed from: b, reason: collision with root package name */
        private int f165861b;

        private b() {
            this.f165861b = -1;
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            try {
                W w10 = W.this;
                w10.f165858f++;
                if (obj == null || w10.f165854b.size() >= 50 || W.this.f165855c.get()) {
                    return;
                }
                C17775B c17775b = (C17775B) obj;
                C17775B c17775b2 = new C17775B(c17775b.f165733a - this.f165860a, c17775b.f165734b, c17775b.f165735c, c17775b.f165736d);
                int i10 = this.f165861b;
                int i11 = c17775b.f165735c;
                if (i10 != i11) {
                    W.this.f165857e = 0;
                    this.f165861b = i11;
                }
                W w11 = W.this;
                int i12 = w11.f165857e;
                if (i12 < 9) {
                    w11.f165857e = i12 + 1;
                    w11.f165854b.add(c17775b2);
                }
                this.f165860a = c17775b.f165733a;
                if (W.this.f165854b.size() >= 50) {
                    W w12 = W.this;
                    Future<Pair<String, Long>> future = w12.f165856d;
                    if (future == null || future.isCancelled() || w12.f165856d.isDone()) {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                        w12.f165856d = executorServiceNewFixedThreadPool.submit(w12.new a());
                        executorServiceNewFixedThreadPool.shutdown();
                    }
                }
            } catch (Exception e10) {
                r.d("TextChangeManager", "Exception in processing text change event", e10);
                C17774A.a(e10);
            }
        }

        /* synthetic */ b(W w10, byte b10) {
            this();
        }
    }

    private void d() {
        Future<Pair<String, Long>> future = this.f165856d;
        if (future != null) {
            if (!future.isCancelled() && !this.f165856d.isDone()) {
                this.f165856d.cancel(true);
            }
            this.f165856d = null;
        }
    }

    public final void a() {
        this.f165853a.f165860a = SystemClock.uptimeMillis();
        this.f165857e = 0;
        this.f165858f = 0L;
        this.f165854b.clear();
        d();
    }

    public final Pair<String, Long> b() throws ExecutionException, InterruptedException {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        try {
            Future<Pair<String, Long>> future2 = this.f165856d;
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
            if (pair != null || (future = this.f165856d) == null) {
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
            C17774A.a(e14);
            return pair;
        }
    }

    final Pair<String, Long> c() throws Exception {
        long jB = 0;
        String str = "";
        if (this.f165854b.size() == 0) {
            return new Pair<>("", 0L);
        }
        if (!this.f165855c.compareAndSet(false, true)) {
            return null;
        }
        Iterator<C17775B> it = this.f165854b.iterator();
        while (it.hasNext()) {
            C17775B next = it.next();
            String str2 = next.f165734b + "," + Long.valueOf(next.f165733a) + "," + next.f165735c;
            if (next.f165736d) {
                str2 = str2 + ",1";
            }
            str = str + (str2 + ";");
            jB += next.f165733a + S.b(next.f165734b) + next.f165735c;
            SystemClock.uptimeMillis();
            String str3 = C17800w.f165953b;
            this.f165854b.size();
        }
        this.f165855c.set(false);
        return new Pair<>(str, Long.valueOf(jB));
    }

    W() {
        a();
    }
}
