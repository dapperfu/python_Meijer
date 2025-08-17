package w6;

import android.app.Application;
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

/* renamed from: w6.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17778E implements Observer {

    /* renamed from: a, reason: collision with root package name */
    C17777D f165779a;

    /* renamed from: b, reason: collision with root package name */
    boolean f165780b;

    /* renamed from: c, reason: collision with root package name */
    long f165781c;

    /* renamed from: e, reason: collision with root package name */
    Future<C17796s<Pair<String, String>, Long, Long>> f165783e;

    /* renamed from: h, reason: collision with root package name */
    boolean f165786h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC17786h f165787i;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<F> f165782d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    AtomicBoolean f165784f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    ArrayList<Pair<Integer, Long>> f165785g = new ArrayList<>();

    /* renamed from: w6.E$a */
    class a implements Callable<C17796s<Pair<String, String>, Long, Long>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C17796s<Pair<String, String>, Long, Long> call() throws Exception {
            return C17778E.this.f();
        }
    }

    public final String d() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<Pair<Integer, Long>> it = this.f165785g.iterator();
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
            r.e("MotionManager", "Exception in getBackgroundEvent", e10);
            C17774A.a(e10);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public C17796s<Pair<String, String>, Long, Long> f() throws Throwable {
        C17778E c17778e;
        String str;
        Long l10;
        String str2;
        float[] fArr;
        float[] fArr2;
        String str3;
        Iterator<F> it;
        F next;
        int i10;
        C17778E c17778e2 = this;
        String str4 = "MotionManager";
        C17778E c17778e3 = 0;
        Long l11 = 0L;
        String str5 = ":";
        if (c17778e2.f165782d.size() <= 1) {
            return new C17796s<>(new Pair("", ""), l11, l11);
        }
        try {
            if (!c17778e2.f165784f.compareAndSet(false, true)) {
                return null;
            }
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                int iC = (int) C17795q.c(c17778e2.f165782d.size());
                float[] fArr3 = new float[iC];
                float[] fArr4 = new float[iC];
                float[] fArr5 = new float[iC];
                float[] fArr6 = new float[iC];
                float[] fArr7 = new float[iC];
                float[] fArr8 = new float[iC];
                float[] fArr9 = new float[iC];
                float[] fArr10 = new float[iC];
                float[] fArr11 = new float[iC];
                float[] fArr12 = new float[iC];
                long j10 = c17778e2.f165781c;
                Iterator<F> it2 = c17778e2.f165782d.iterator();
                int i11 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        str2 = str4;
                        fArr = fArr9;
                        fArr2 = fArr10;
                        l10 = l11;
                        str3 = str5;
                        break;
                    }
                    try {
                        try {
                            it = it2;
                            next = it2.next();
                            i10 = i11;
                            fArr3[i10] = next.f165792d;
                            fArr4[i10] = next.f165793e;
                            fArr5[i10] = next.f165794f;
                            fArr6[i10] = next.f165789a;
                            fArr7[i10] = next.f165790b;
                            fArr8[i10] = next.f165791c;
                            fArr9[i10] = next.f165795g;
                            fArr10[i10] = next.f165796h;
                            fArr11[i10] = next.f165797i;
                            fArr2 = fArr10;
                            l10 = l11;
                        } catch (Throwable th2) {
                            th = th2;
                            c17778e3 = this;
                            c17778e3.f165784f.set(false);
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str2 = str4;
                        l10 = l11;
                    }
                    try {
                        str2 = str4;
                        fArr = fArr9;
                        try {
                            long jMax = Math.max(0L, next.f165798j - j10);
                            if (!next.f165800l || i10 == 0) {
                                str3 = str5;
                            } else {
                                long jMax2 = Math.max(0L, next.f165801m);
                                str3 = str5;
                                c17778e2.f165785g.add(new Pair<>(Integer.valueOf(i10), Long.valueOf(next.f165798j - j10)));
                                jMax = jMax2;
                            }
                            fArr12[i10] = jMax;
                            SystemClock.uptimeMillis();
                            float f10 = fArr3[i10];
                            float f11 = fArr4[i10];
                            float f12 = fArr5[i10];
                            float f13 = fArr6[i10];
                            float f14 = fArr7[i10];
                            float f15 = fArr8[i10];
                            float f16 = fArr[i10];
                            float f17 = fArr2[i10];
                            float f18 = fArr11[i10];
                            long j11 = next.f165798j;
                            int i12 = i10 + 1;
                            if (i12 >= iC) {
                                break;
                            }
                            j10 = j11;
                            str5 = str3;
                            l11 = l10;
                            it2 = it;
                            fArr10 = fArr2;
                            fArr9 = fArr;
                            c17778e2 = this;
                            i11 = i12;
                            str4 = str2;
                        } catch (Exception e11) {
                            e = e11;
                            c17778e = this;
                            str = str2;
                            r.d(str, "Exception in getting motion events", e);
                            C17774A.a(e);
                            c17778e.f165784f.set(false);
                            return new C17796s<>(new Pair("", ""), l10, l10);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str2 = str4;
                        c17778e = this;
                        str = str2;
                        r.d(str, "Exception in getting motion events", e);
                        C17774A.a(e);
                        c17778e.f165784f.set(false);
                        return new C17796s<>(new Pair("", ""), l10, l10);
                    }
                }
                Pair<String, Long> pairC = C17792n.c(fArr3, 0.6f);
                Pair<String, Long> pairC2 = C17792n.c(fArr4, 0.6f);
                Pair<String, Long> pairC3 = C17792n.c(fArr5, 0.6f);
                Pair<String, Long> pairC4 = C17792n.c(fArr6, 0.6f);
                Pair<String, Long> pairC5 = C17792n.c(fArr7, 0.6f);
                Pair<String, Long> pairC6 = C17792n.c(fArr8, 0.6f);
                Pair<String, Long> pairC7 = C17792n.c(fArr, 0.6f);
                Pair<String, Long> pairC8 = C17792n.c(fArr2, 0.6f);
                Pair<String, Long> pairC9 = C17792n.c(fArr11, 0.6f);
                Pair pair = new Pair(((String) pairC.first) + str3 + ((String) pairC2.first) + str3 + ((String) pairC3.first) + str3 + ((String) pairC4.first) + str3 + ((String) pairC5.first) + str3 + ((String) pairC6.first) + str3 + ((String) pairC7.first) + str3 + ((String) pairC8.first) + str3 + ((String) pairC9.first), C17792n.c(fArr12, 0.0f).first);
                long jLongValue = ((Long) pairC.second).longValue() + ((Long) pairC2.second).longValue() + ((Long) pairC3.second).longValue() + ((Long) pairC4.second).longValue() + ((Long) pairC5.second).longValue() + ((Long) pairC6.second).longValue() + ((Long) pairC7.second).longValue() + ((Long) pairC8.second).longValue() + ((Long) pairC9.second).longValue();
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                StringBuilder sb2 = new StringBuilder("Motion Event Count: ");
                sb2.append(iC);
                sb2.append(q2.f92724c);
                c17778e = this;
                try {
                    sb2.append(c17778e.f165782d.size());
                    str = str2;
                } catch (Exception e13) {
                    e = e13;
                    str = str2;
                    r.d(str, "Exception in getting motion events", e);
                    C17774A.a(e);
                    c17778e.f165784f.set(false);
                    return new C17796s<>(new Pair("", ""), l10, l10);
                }
                try {
                    r.c(str, sb2.toString(), new Throwable[0]);
                    r.c(str, "Motion SDCalc-Time: " + jUptimeMillis2 + "ms", new Throwable[0]);
                    C17796s<Pair<String, String>, Long, Long> c17796s = new C17796s<>(pair, Long.valueOf(jLongValue), Long.valueOf((long) iC));
                    c17778e.f165784f.set(false);
                    return c17796s;
                } catch (Exception e14) {
                    e = e14;
                    r.d(str, "Exception in getting motion events", e);
                    C17774A.a(e);
                    c17778e.f165784f.set(false);
                    return new C17796s<>(new Pair("", ""), l10, l10);
                }
            } catch (Exception e15) {
                e = e15;
                c17778e = c17778e2;
                str = str4;
                l10 = l11;
            } catch (Throwable th3) {
                th = th3;
                c17778e3 = c17778e2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void b() throws Exception {
        this.f165779a.a();
        this.f165779a.deleteObservers();
    }

    public final long c() {
        return this.f165782d.size();
    }

    public final C17796s<Pair<String, String>, Long, Long> e() {
        Future<C17796s<Pair<String, String>, Long, Long>> future;
        C17796s<Pair<String, String>, Long, Long> c17796s = new C17796s<>(new Pair("", ""), 0L, 0L);
        try {
            Future<C17796s<Pair<String, String>, Long, Long>> future2 = this.f165783e;
            if (future2 != null) {
                try {
                    c17796s = future2.get();
                } catch (InterruptedException e10) {
                    r.d("MotionManager", "Failed to get motion data: " + e10.getMessage(), new Throwable[0]);
                } catch (ExecutionException e11) {
                    r.d("MotionManager", "Failed to get motion data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (c17796s != null) {
                return c17796s;
            }
            b();
            c17796s = f();
            if (c17796s != null || (future = this.f165783e) == null) {
                return c17796s;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                r.d("MotionManager", "Failed to get motion data: " + e12.getMessage(), new Throwable[0]);
                return c17796s;
            } catch (ExecutionException e13) {
                r.d("MotionManager", "Failed to get motion data: " + e13.getMessage(), new Throwable[0]);
                return c17796s;
            }
        } catch (Exception e14) {
            r.e("MotionManager", "Exception in MotionManager", e14);
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
            if (this.f165782d.size() < 128) {
                if (this.f165782d.size() >= 32 && !this.f165786h) {
                    this.f165786h = true;
                    this.f165787i.i();
                }
                this.f165782d.add((F) obj);
                return;
            }
            b();
            Future<C17796s<Pair<String, String>, Long, Long>> future = this.f165783e;
            if (future != null && !future.isCancelled() && !this.f165783e.isDone()) {
                return;
            }
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
            this.f165783e = executorServiceNewFixedThreadPool.submit(new a());
            executorServiceNewFixedThreadPool.shutdown();
        } catch (Exception e10) {
            r.d("MotionManager", "Exception in processing motion event", e10);
            C17774A.a(e10);
        }
    }

    public C17778E(Application application, InterfaceC17786h interfaceC17786h) {
        r.c("MotionManager", "Initializing motion manager", new Throwable[0]);
        this.f165781c = SystemClock.uptimeMillis();
        this.f165779a = new C17777D(application);
        this.f165787i = interfaceC17786h;
    }
}
