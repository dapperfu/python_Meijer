package x6;

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

/* renamed from: x6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18110e implements Observer {

    /* renamed from: b, reason: collision with root package name */
    public int f170522b;

    /* renamed from: c, reason: collision with root package name */
    public int f170523c;

    /* renamed from: g, reason: collision with root package name */
    Future<Pair<String, Long>> f170527g;

    /* renamed from: i, reason: collision with root package name */
    long f170529i;

    /* renamed from: a, reason: collision with root package name */
    long f170521a = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f170524d = 0;

    /* renamed from: e, reason: collision with root package name */
    String f170525e = "";

    /* renamed from: f, reason: collision with root package name */
    ArrayList<C18116k> f170526f = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f170528h = new AtomicBoolean(false);

    /* renamed from: x6.e$a */
    class a implements Callable<Pair<String, Long>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<String, Long> call() throws Exception {
            return C18110e.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<String, Long> c() {
        if (this.f170526f.size() == 0) {
            return new Pair<>("", 0L);
        }
        if (!this.f170528h.compareAndSet(false, true)) {
            return null;
        }
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                Iterator<C18116k> it = this.f170526f.iterator();
                while (it.hasNext()) {
                    C18116k next = it.next();
                    this.f170525e += (next.f170580a + "," + next.f170586g + ",0,0," + next.f170582c + ",1," + next.f170585f + ",-1;");
                    this.f170529i += next.f170586g + next.f170580a;
                }
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                r.c("TouchManager", "Touch Event Count: " + this.f170526f.size() + " (move: " + this.f170522b + ", updown: " + this.f170523c + ")", new Throwable[0]);
                StringBuilder sb2 = new StringBuilder("Touch SDCalc-Time: ");
                sb2.append(jUptimeMillis2);
                sb2.append("ms");
                r.c("TouchManager", sb2.toString(), new Throwable[0]);
                Pair<String, Long> pair = new Pair<>(this.f170525e, Long.valueOf(this.f170529i));
                this.f170528h.set(false);
                return pair;
            } catch (Exception e10) {
                r.d("TouchManager", "Exception in getting touch events", e10);
                C18095A.a(e10);
                this.f170528h.set(false);
                return new Pair<>("", 0L);
            }
        } catch (Throwable th2) {
            this.f170528h.set(false);
            throw th2;
        }
    }

    public final Pair<String, Long> a() throws ExecutionException, InterruptedException {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        Future<Pair<String, Long>> future2 = this.f170527g;
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
        if (pairC != null || (future = this.f170527g) == null) {
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
                if (this.f170528h.get()) {
                    return;
                }
                this.f170524d++;
                C18111f c18111f = (C18111f) obj;
                int pointerCount = c18111f.f170531a.getPointerCount();
                int i10 = c18111f.f170533c;
                if (i10 != 1 || this.f170522b >= 50) {
                    if (i10 == 1 || this.f170523c >= 50) {
                        return;
                    }
                }
                if (i10 == 1) {
                    for (int i11 = 0; i11 < pointerCount; i11++) {
                        if (this.f170522b < 50) {
                            this.f170526f.add(new C18116k(c18111f.f170532b, c18111f.f170531a.getEventTime() - this.f170521a, c18111f.f170533c, pointerCount, c18111f.f170531a.getToolType(i11)));
                            this.f170522b++;
                        }
                    }
                }
                if (c18111f.f170533c != 1) {
                    int i12 = c18111f.f170532b;
                    long eventTime = c18111f.f170531a.getEventTime() - this.f170521a;
                    int i13 = c18111f.f170533c;
                    MotionEvent motionEvent = c18111f.f170531a;
                    this.f170526f.add(new C18116k(i12, eventTime, i13, pointerCount, motionEvent.getToolType(motionEvent.getActionIndex())));
                    this.f170523c++;
                }
                if (this.f170522b >= 50 && this.f170523c >= 50 && ((future = this.f170527g) == null || future.isCancelled() || this.f170527g.isDone())) {
                    ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                    this.f170527g = executorServiceNewFixedThreadPool.submit(new a());
                    executorServiceNewFixedThreadPool.shutdown();
                }
                this.f170521a = c18111f.f170531a.getEventTime();
            } catch (Exception e10) {
                r.d("TouchManager", "Exception in processing touch event", e10);
                C18095A.a(e10);
            }
        }
    }

    C18110e() {
    }
}
