package w6;

import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
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

/* renamed from: w6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17783e implements Observer {

    /* renamed from: b, reason: collision with root package name */
    public int f165877b;

    /* renamed from: c, reason: collision with root package name */
    public int f165878c;

    /* renamed from: g, reason: collision with root package name */
    Future<Pair<String, Long>> f165882g;

    /* renamed from: i, reason: collision with root package name */
    long f165884i;

    /* renamed from: a, reason: collision with root package name */
    long f165876a = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f165879d = 0;

    /* renamed from: e, reason: collision with root package name */
    String f165880e = "";

    /* renamed from: f, reason: collision with root package name */
    ArrayList<C17789k> f165881f = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f165883h = new AtomicBoolean(false);

    /* renamed from: w6.e$a */
    class a implements Callable<Pair<String, Long>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<String, Long> call() throws Exception {
            return C17783e.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<String, Long> c() {
        if (this.f165881f.size() == 0) {
            return new Pair<>("", 0L);
        }
        if (!this.f165883h.compareAndSet(false, true)) {
            return null;
        }
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                Iterator<C17789k> it = this.f165881f.iterator();
                while (it.hasNext()) {
                    C17789k next = it.next();
                    this.f165880e += (next.f165935a + "," + next.f165941g + ",0,0," + next.f165937c + ",1," + next.f165940f + ",-1;");
                    this.f165884i += next.f165941g + next.f165935a;
                }
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                r.c("TouchManager", "Touch Event Count: " + this.f165881f.size() + " (move: " + this.f165877b + ", updown: " + this.f165878c + ")", new Throwable[0]);
                StringBuilder sb2 = new StringBuilder("Touch SDCalc-Time: ");
                sb2.append(jUptimeMillis2);
                sb2.append("ms");
                r.c("TouchManager", sb2.toString(), new Throwable[0]);
                Pair<String, Long> pair = new Pair<>(this.f165880e, Long.valueOf(this.f165884i));
                this.f165883h.set(false);
                return pair;
            } catch (Exception e10) {
                r.d("TouchManager", "Exception in getting touch events", e10);
                C17774A.a(e10);
                this.f165883h.set(false);
                return new Pair<>("", 0L);
            }
        } catch (Throwable th2) {
            this.f165883h.set(false);
            throw th2;
        }
    }

    public final Pair<String, Long> a() throws ExecutionException, InterruptedException {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        Future<Pair<String, Long>> future2 = this.f165882g;
        if (future2 != null) {
            try {
                pair = future2.get();
            } catch (InterruptedException e10) {
                r.d("TouchManager", "Failed to get touch data: " + e10.getMessage(), new Throwable[0]);
            } catch (ExecutionException e11) {
                r.d("TouchManager", "Failed to get touch data: " + e11.getMessage(), new Throwable[0]);
            }
        }
        if (pair != null) {
            return pair;
        }
        Pair<String, Long> pairC = c();
        if (pairC != null || (future = this.f165882g) == null) {
            return pairC;
        }
        try {
            return future.get();
        } catch (InterruptedException e12) {
            r.d("TouchManager", "Failed to get touch data: " + e12.getMessage(), new Throwable[0]);
            return pairC;
        } catch (ExecutionException e13) {
            r.d("TouchManager", "Failed to get touch data: " + e13.getMessage(), new Throwable[0]);
            return pairC;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        Future<Pair<String, Long>> future;
        if (obj != null) {
            try {
                if (this.f165883h.get()) {
                    return;
                }
                this.f165879d++;
                C17784f c17784f = (C17784f) obj;
                int pointerCount = c17784f.f165886a.getPointerCount();
                int i10 = c17784f.f165888c;
                if (i10 != 1 || this.f165877b >= 50) {
                    if (i10 == 1 || this.f165878c >= 50) {
                        return;
                    }
                }
                if (i10 == 1) {
                    for (int i11 = 0; i11 < pointerCount; i11++) {
                        if (this.f165877b < 50) {
                            this.f165881f.add(new C17789k(c17784f.f165887b, c17784f.f165886a.getEventTime() - this.f165876a, c17784f.f165888c, pointerCount, c17784f.f165886a.getToolType(i11)));
                            this.f165877b++;
                        }
                    }
                }
                if (c17784f.f165888c != 1) {
                    int i12 = c17784f.f165887b;
                    long eventTime = c17784f.f165886a.getEventTime() - this.f165876a;
                    int i13 = c17784f.f165888c;
                    MotionEvent motionEvent = c17784f.f165886a;
                    this.f165881f.add(new C17789k(i12, eventTime, i13, pointerCount, motionEvent.getToolType(motionEvent.getActionIndex())));
                    this.f165878c++;
                }
                if (this.f165877b >= 50 && this.f165878c >= 50 && ((future = this.f165882g) == null || future.isCancelled() || this.f165882g.isDone())) {
                    ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                    this.f165882g = executorServiceNewFixedThreadPool.submit(new a());
                    executorServiceNewFixedThreadPool.shutdown();
                }
                this.f165876a = c17784f.f165886a.getEventTime();
            } catch (Exception e10) {
                r.d("TouchManager", "Exception in processing touch event", e10);
                C17774A.a(e10);
            }
        }
    }

    C17783e() {
    }
}
