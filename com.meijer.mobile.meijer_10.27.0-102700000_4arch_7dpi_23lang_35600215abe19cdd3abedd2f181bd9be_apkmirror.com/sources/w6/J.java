package w6;

import android.app.Application;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.util.Pair;
import com.medallia.digital.mobilesdk.q2;
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
public final class J implements Observer {

    /* renamed from: a, reason: collision with root package name */
    I f165830a;

    /* renamed from: b, reason: collision with root package name */
    boolean f165831b;

    /* renamed from: c, reason: collision with root package name */
    long f165832c;

    /* renamed from: f, reason: collision with root package name */
    Future<C17796s<Pair<String, String>, Long, Long>> f165835f;

    /* renamed from: h, reason: collision with root package name */
    boolean f165837h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC17786h f165838i;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<H> f165833d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<Pair<Integer, Long>> f165834e = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    AtomicBoolean f165836g = new AtomicBoolean(false);

    class a implements Callable<C17796s<Pair<String, String>, Long, Long>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C17796s<Pair<String, String>, Long, Long> call() throws Exception {
            return J.this.f();
        }
    }

    public final String d() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<Pair<Integer, Long>> it = this.f165834e.iterator();
            while (it.hasNext()) {
                Pair<Integer, Long> next = it.next();
                sb2.append(next.first);
                sb2.append(",");
                sb2.append(next.second);
                sb2.append(";");
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Exception e10) {
            r.e("OrientationManager", "Exception in getBackgroundEvent", e10);
            C17774A.a(e10);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C17796s<Pair<String, String>, Long, Long> f() {
        int i10;
        long j10;
        float f10;
        if (this.f165833d.size() <= 1) {
            return new C17796s<>(new Pair("", ""), 0L, 0L);
        }
        if (!this.f165836g.compareAndSet(false, true)) {
            return null;
        }
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                int iC = (int) C17795q.c(this.f165833d.size());
                float[] fArr = new float[iC];
                float[] fArr2 = new float[iC];
                float[] fArr3 = new float[iC];
                float[] fArr4 = new float[iC];
                i10 = 1;
                int i11 = 0;
                try {
                    long j11 = this.f165832c;
                    Iterator<H> it = this.f165833d.iterator();
                    int i12 = 0;
                    while (true) {
                        Iterator<H> it2 = it;
                        if (!it.hasNext()) {
                            j10 = jUptimeMillis;
                            f10 = 0.0f;
                            break;
                        }
                        f10 = 0.0f;
                        H next = it2.next();
                        int i13 = i12;
                        long j12 = j11;
                        float[] fArr5 = new float[9];
                        j10 = jUptimeMillis;
                        if (SensorManager.getRotationMatrix(fArr5, new float[9], next.f165809a, next.f165810b)) {
                            SensorManager.getOrientation(fArr5, new float[3]);
                            float degrees = (float) Math.toDegrees(r4[i11]);
                            float degrees2 = (float) Math.toDegrees(r4[1]);
                            float degrees3 = (float) Math.toDegrees(r4[2]);
                            float f11 = degrees * (-1.0f);
                            if (f11 < 0.0f) {
                                f11 += 360.0f;
                            }
                            fArr[i13] = f11;
                            fArr2[i13] = degrees2 * (-1.0f);
                            fArr3[i13] = degrees3;
                            long jMax = Math.max(0L, next.f165811c - j12);
                            if (next.f165813e && i13 != 0) {
                                long jMax2 = Math.max(0L, next.f165814f);
                                this.f165834e.add(new Pair<>(Integer.valueOf(i13), Long.valueOf(next.f165811c - j12)));
                                jMax = jMax2;
                            }
                            fArr4[i13] = jMax;
                            SystemClock.uptimeMillis();
                            float f12 = fArr[i13];
                            float f13 = fArr2[i13];
                            float f14 = fArr3[i13];
                        } else {
                            fArr[i13] = 0.0f;
                            fArr2[i13] = 0.0f;
                            fArr3[i13] = 0.0f;
                            r.d("OrientationManager", "Failed to get rotation matrix", new Throwable[i11]);
                        }
                        j11 = next.f165811c;
                        i12 = i13 + 1;
                        if (i12 >= iC) {
                            break;
                        }
                        it = it2;
                        jUptimeMillis = j10;
                        i11 = 0;
                    }
                    Pair<String, Long> pairC = C17792n.c(fArr, 0.6f);
                    Pair<String, Long> pairC2 = C17792n.c(fArr2, 0.6f);
                    Pair<String, Long> pairC3 = C17792n.c(fArr3, 0.6f);
                    Pair pair = new Pair(((String) pairC.first) + ":" + ((String) pairC2.first) + ":" + ((String) pairC3.first), C17792n.c(fArr4, f10).first);
                    long jLongValue = ((Long) pairC.second).longValue() + ((Long) pairC2.second).longValue() + ((Long) pairC3.second).longValue();
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - j10;
                    r.c("OrientationManager", "Orientation Event Count: " + iC + q2.f92724c + this.f165833d.size(), new Throwable[0]);
                    StringBuilder sb2 = new StringBuilder("Orientation SDCalc-Time: ");
                    sb2.append(jUptimeMillis2);
                    sb2.append("ms");
                    r.c("OrientationManager", sb2.toString(), new Throwable[0]);
                    C17796s<Pair<String, String>, Long, Long> c17796s = new C17796s<>(pair, Long.valueOf(jLongValue), Long.valueOf(iC));
                    this.f165836g.set(false);
                    return c17796s;
                } catch (Exception e10) {
                    e = e10;
                    Throwable[] thArr = new Throwable[i10];
                    thArr[0] = e;
                    r.d("OrientationManager", "Exception in getting orientation events", thArr);
                    C17774A.a(e);
                    this.f165836g.set(false);
                    return new C17796s<>(new Pair("", ""), 0L, 0L);
                }
            } catch (Throwable th2) {
                this.f165836g.set(false);
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            i10 = 1;
        }
    }

    public final void b() throws Exception {
        this.f165830a.a();
        this.f165830a.deleteObservers();
    }

    public final long c() {
        return this.f165833d.size();
    }

    public final C17796s<Pair<String, String>, Long, Long> e() {
        Future<C17796s<Pair<String, String>, Long, Long>> future;
        C17796s<Pair<String, String>, Long, Long> c17796s = new C17796s<>(new Pair("", ""), 0L, 0L);
        try {
            Future<C17796s<Pair<String, String>, Long, Long>> future2 = this.f165835f;
            if (future2 != null) {
                try {
                    c17796s = future2.get();
                } catch (InterruptedException e10) {
                    r.d("OrientationManager", "Failed to get orientation data: " + e10.getMessage(), new Throwable[0]);
                } catch (ExecutionException e11) {
                    r.d("OrientationManager", "Failed to get orientation data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (c17796s != null) {
                return c17796s;
            }
            b();
            c17796s = f();
            if (c17796s != null || (future = this.f165835f) == null) {
                return c17796s;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                r.d("OrientationManager", "Failed to get orientation data: " + e12.getMessage(), new Throwable[0]);
                return c17796s;
            } catch (ExecutionException e13) {
                r.d("OrientationManager", "Failed to get orientation data: " + e13.getMessage(), new Throwable[0]);
                return c17796s;
            }
        } catch (Exception e14) {
            r.e("OrientationManager", "Exception in OrientationManager", e14);
            C17774A.a(e14);
            return c17796s;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (this.f165833d.size() < 128) {
                if (this.f165833d.size() >= 32 && !this.f165837h) {
                    this.f165837h = true;
                    this.f165838i.i();
                }
                this.f165833d.add((H) obj);
                return;
            }
            b();
            Future<C17796s<Pair<String, String>, Long, Long>> future = this.f165835f;
            if (future != null && !future.isCancelled() && !this.f165835f.isDone()) {
                return;
            }
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
            this.f165835f = executorServiceNewFixedThreadPool.submit(new a());
            executorServiceNewFixedThreadPool.shutdown();
        } catch (Exception e10) {
            r.d("OrientationManager", "Exception in processing orientation event", e10);
            C17774A.a(e10);
        }
    }

    public J(Application application, InterfaceC17786h interfaceC17786h) {
        r.c("OrientationManager", "Initializing orientation manager", new Throwable[0]);
        this.f165832c = SystemClock.uptimeMillis();
        this.f165830a = new I(application);
        this.f165838i = interfaceC17786h;
    }
}
