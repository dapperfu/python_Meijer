package x6;

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

/* renamed from: x6.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18104J implements Observer {

    /* renamed from: a, reason: collision with root package name */
    C18103I f170475a;

    /* renamed from: b, reason: collision with root package name */
    boolean f170476b;

    /* renamed from: c, reason: collision with root package name */
    long f170477c;

    /* renamed from: f, reason: collision with root package name */
    Future<C18123s<Pair<String, String>, Long, Long>> f170480f;

    /* renamed from: h, reason: collision with root package name */
    boolean f170482h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC18113h f170483i;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<C18102H> f170478d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<Pair<Integer, Long>> f170479e = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    AtomicBoolean f170481g = new AtomicBoolean(false);

    /* renamed from: x6.J$a */
    class a implements Callable<C18123s<Pair<String, String>, Long, Long>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C18123s<Pair<String, String>, Long, Long> call() throws Exception {
            return C18104J.this.f();
        }
    }

    public final String d() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<Pair<Integer, Long>> it = this.f170479e.iterator();
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
            C18095A.a(e10);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C18123s<Pair<String, String>, Long, Long> f() {
        int i10;
        long j10;
        float f10;
        if (this.f170478d.size() <= 1) {
            return new C18123s<>(new Pair("", ""), 0L, 0L);
        }
        if (!this.f170481g.compareAndSet(false, true)) {
            return null;
        }
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                int iC = (int) C18122q.c(this.f170478d.size());
                float[] fArr = new float[iC];
                float[] fArr2 = new float[iC];
                float[] fArr3 = new float[iC];
                float[] fArr4 = new float[iC];
                i10 = 1;
                int i11 = 0;
                try {
                    long j11 = this.f170477c;
                    Iterator<C18102H> it = this.f170478d.iterator();
                    int i12 = 0;
                    while (true) {
                        Iterator<C18102H> it2 = it;
                        if (!it.hasNext()) {
                            j10 = jUptimeMillis;
                            f10 = 0.0f;
                            break;
                        }
                        f10 = 0.0f;
                        C18102H next = it2.next();
                        int i13 = i12;
                        long j12 = j11;
                        float[] fArr5 = new float[9];
                        j10 = jUptimeMillis;
                        if (SensorManager.getRotationMatrix(fArr5, new float[9], next.f170454a, next.f170455b)) {
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
                            long jMax = Math.max(0L, next.f170456c - j12);
                            if (next.f170458e && i13 != 0) {
                                long jMax2 = Math.max(0L, next.f170459f);
                                this.f170479e.add(new Pair<>(Integer.valueOf(i13), Long.valueOf(next.f170456c - j12)));
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
                        j11 = next.f170456c;
                        i12 = i13 + 1;
                        if (i12 >= iC) {
                            break;
                        }
                        it = it2;
                        jUptimeMillis = j10;
                        i11 = 0;
                    }
                    Pair<String, Long> pairC = C18119n.c(fArr, 0.6f);
                    Pair<String, Long> pairC2 = C18119n.c(fArr2, 0.6f);
                    Pair<String, Long> pairC3 = C18119n.c(fArr3, 0.6f);
                    Pair pair = new Pair(((String) pairC.first) + ":" + ((String) pairC2.first) + ":" + ((String) pairC3.first), C18119n.c(fArr4, f10).first);
                    long jLongValue = ((Long) pairC.second).longValue() + ((Long) pairC2.second).longValue() + ((Long) pairC3.second).longValue();
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - j10;
                    r.c("OrientationManager", "Orientation Event Count: " + iC + q2.f93563c + this.f170478d.size(), new Throwable[0]);
                    StringBuilder sb2 = new StringBuilder("Orientation SDCalc-Time: ");
                    sb2.append(jUptimeMillis2);
                    sb2.append("ms");
                    r.c("OrientationManager", sb2.toString(), new Throwable[0]);
                    C18123s<Pair<String, String>, Long, Long> c18123s = new C18123s<>(pair, Long.valueOf(jLongValue), Long.valueOf(iC));
                    this.f170481g.set(false);
                    return c18123s;
                } catch (Exception e10) {
                    e = e10;
                    Throwable[] thArr = new Throwable[i10];
                    thArr[0] = e;
                    r.d("OrientationManager", "Exception in getting orientation events", thArr);
                    C18095A.a(e);
                    this.f170481g.set(false);
                    return new C18123s<>(new Pair("", ""), 0L, 0L);
                }
            } catch (Throwable th2) {
                this.f170481g.set(false);
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            i10 = 1;
        }
    }

    public final void b() throws Exception {
        this.f170475a.a();
        this.f170475a.deleteObservers();
    }

    public final long c() {
        return this.f170478d.size();
    }

    public final C18123s<Pair<String, String>, Long, Long> e() {
        Future<C18123s<Pair<String, String>, Long, Long>> future;
        C18123s<Pair<String, String>, Long, Long> c18123s = new C18123s<>(new Pair("", ""), 0L, 0L);
        try {
            Future<C18123s<Pair<String, String>, Long, Long>> future2 = this.f170480f;
            if (future2 != null) {
                try {
                    c18123s = future2.get();
                } catch (InterruptedException e10) {
                    r.d("OrientationManager", "Failed to get orientation data: " + e10.getMessage(), new Throwable[0]);
                } catch (ExecutionException e11) {
                    r.d("OrientationManager", "Failed to get orientation data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (c18123s != null) {
                return c18123s;
            }
            b();
            c18123s = f();
            if (c18123s != null || (future = this.f170480f) == null) {
                return c18123s;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                r.d("OrientationManager", "Failed to get orientation data: " + e12.getMessage(), new Throwable[0]);
                return c18123s;
            } catch (ExecutionException e13) {
                r.d("OrientationManager", "Failed to get orientation data: " + e13.getMessage(), new Throwable[0]);
                return c18123s;
            }
        } catch (Exception e14) {
            r.e("OrientationManager", "Exception in OrientationManager", e14);
            C18095A.a(e14);
            return c18123s;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (this.f170478d.size() < 128) {
                if (this.f170478d.size() >= 32 && !this.f170482h) {
                    this.f170482h = true;
                    this.f170483i.i();
                }
                this.f170478d.add((C18102H) obj);
                return;
            }
            b();
            Future<C18123s<Pair<String, String>, Long, Long>> future = this.f170480f;
            if (future != null && !future.isCancelled() && !this.f170480f.isDone()) {
                return;
            }
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
            this.f170480f = executorServiceNewFixedThreadPool.submit(new a());
            executorServiceNewFixedThreadPool.shutdown();
        } catch (Exception e10) {
            r.d("OrientationManager", "Exception in processing orientation event", e10);
            C18095A.a(e10);
        }
    }

    public C18104J(Application application, InterfaceC18113h interfaceC18113h) {
        r.c("OrientationManager", "Initializing orientation manager", new Throwable[0]);
        this.f170477c = SystemClock.uptimeMillis();
        this.f170475a = new C18103I(application);
        this.f170483i = interfaceC18113h;
    }
}
