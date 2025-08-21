package x6;

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

/* renamed from: x6.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18099E implements Observer {

    /* renamed from: a, reason: collision with root package name */
    C18098D f170424a;

    /* renamed from: b, reason: collision with root package name */
    boolean f170425b;

    /* renamed from: c, reason: collision with root package name */
    long f170426c;

    /* renamed from: e, reason: collision with root package name */
    Future<C18123s<Pair<String, String>, Long, Long>> f170428e;

    /* renamed from: h, reason: collision with root package name */
    boolean f170431h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC18113h f170432i;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<C18100F> f170427d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    AtomicBoolean f170429f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    ArrayList<Pair<Integer, Long>> f170430g = new ArrayList<>();

    /* renamed from: x6.E$a */
    class a implements Callable<C18123s<Pair<String, String>, Long, Long>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C18123s<Pair<String, String>, Long, Long> call() throws Exception {
            return C18099E.this.f();
        }
    }

    public final String d() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<Pair<Integer, Long>> it = this.f170430g.iterator();
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
            C18095A.a(e10);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public C18123s<Pair<String, String>, Long, Long> f() throws Throwable {
        C18099E c18099e;
        String str;
        Long l10;
        String str2;
        float[] fArr;
        float[] fArr2;
        String str3;
        Iterator<C18100F> it;
        C18100F next;
        int i10;
        C18099E c18099e2 = this;
        String str4 = "MotionManager";
        C18099E c18099e3 = 0;
        Long l11 = 0L;
        String str5 = ":";
        if (c18099e2.f170427d.size() <= 1) {
            return new C18123s<>(new Pair("", ""), l11, l11);
        }
        try {
            if (!c18099e2.f170429f.compareAndSet(false, true)) {
                return null;
            }
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                int iC = (int) C18122q.c(c18099e2.f170427d.size());
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
                long j10 = c18099e2.f170426c;
                Iterator<C18100F> it2 = c18099e2.f170427d.iterator();
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
                            fArr3[i10] = next.f170437d;
                            fArr4[i10] = next.f170438e;
                            fArr5[i10] = next.f170439f;
                            fArr6[i10] = next.f170434a;
                            fArr7[i10] = next.f170435b;
                            fArr8[i10] = next.f170436c;
                            fArr9[i10] = next.f170440g;
                            fArr10[i10] = next.f170441h;
                            fArr11[i10] = next.f170442i;
                            fArr2 = fArr10;
                            l10 = l11;
                        } catch (Throwable th2) {
                            th = th2;
                            c18099e3 = this;
                            c18099e3.f170429f.set(false);
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
                            long jMax = Math.max(0L, next.f170443j - j10);
                            if (!next.f170445l || i10 == 0) {
                                str3 = str5;
                            } else {
                                long jMax2 = Math.max(0L, next.f170446m);
                                str3 = str5;
                                c18099e2.f170430g.add(new Pair<>(Integer.valueOf(i10), Long.valueOf(next.f170443j - j10)));
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
                            long j11 = next.f170443j;
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
                            c18099e2 = this;
                            i11 = i12;
                            str4 = str2;
                        } catch (Exception e11) {
                            e = e11;
                            c18099e = this;
                            str = str2;
                            r.d(str, "Exception in getting motion events", e);
                            C18095A.a(e);
                            c18099e.f170429f.set(false);
                            return new C18123s<>(new Pair("", ""), l10, l10);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str2 = str4;
                        c18099e = this;
                        str = str2;
                        r.d(str, "Exception in getting motion events", e);
                        C18095A.a(e);
                        c18099e.f170429f.set(false);
                        return new C18123s<>(new Pair("", ""), l10, l10);
                    }
                }
                Pair<String, Long> pairC = C18119n.c(fArr3, 0.6f);
                Pair<String, Long> pairC2 = C18119n.c(fArr4, 0.6f);
                Pair<String, Long> pairC3 = C18119n.c(fArr5, 0.6f);
                Pair<String, Long> pairC4 = C18119n.c(fArr6, 0.6f);
                Pair<String, Long> pairC5 = C18119n.c(fArr7, 0.6f);
                Pair<String, Long> pairC6 = C18119n.c(fArr8, 0.6f);
                Pair<String, Long> pairC7 = C18119n.c(fArr, 0.6f);
                Pair<String, Long> pairC8 = C18119n.c(fArr2, 0.6f);
                Pair<String, Long> pairC9 = C18119n.c(fArr11, 0.6f);
                Pair pair = new Pair(((String) pairC.first) + str3 + ((String) pairC2.first) + str3 + ((String) pairC3.first) + str3 + ((String) pairC4.first) + str3 + ((String) pairC5.first) + str3 + ((String) pairC6.first) + str3 + ((String) pairC7.first) + str3 + ((String) pairC8.first) + str3 + ((String) pairC9.first), C18119n.c(fArr12, 0.0f).first);
                long jLongValue = ((Long) pairC.second).longValue() + ((Long) pairC2.second).longValue() + ((Long) pairC3.second).longValue() + ((Long) pairC4.second).longValue() + ((Long) pairC5.second).longValue() + ((Long) pairC6.second).longValue() + ((Long) pairC7.second).longValue() + ((Long) pairC8.second).longValue() + ((Long) pairC9.second).longValue();
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                StringBuilder sb2 = new StringBuilder("Motion Event Count: ");
                sb2.append(iC);
                sb2.append(q2.f93563c);
                c18099e = this;
                try {
                    sb2.append(c18099e.f170427d.size());
                    str = str2;
                } catch (Exception e13) {
                    e = e13;
                    str = str2;
                    r.d(str, "Exception in getting motion events", e);
                    C18095A.a(e);
                    c18099e.f170429f.set(false);
                    return new C18123s<>(new Pair("", ""), l10, l10);
                }
                try {
                    r.c(str, sb2.toString(), new Throwable[0]);
                    r.c(str, "Motion SDCalc-Time: " + jUptimeMillis2 + "ms", new Throwable[0]);
                    C18123s<Pair<String, String>, Long, Long> c18123s = new C18123s<>(pair, Long.valueOf(jLongValue), Long.valueOf((long) iC));
                    c18099e.f170429f.set(false);
                    return c18123s;
                } catch (Exception e14) {
                    e = e14;
                    r.d(str, "Exception in getting motion events", e);
                    C18095A.a(e);
                    c18099e.f170429f.set(false);
                    return new C18123s<>(new Pair("", ""), l10, l10);
                }
            } catch (Exception e15) {
                e = e15;
                c18099e = c18099e2;
                str = str4;
                l10 = l11;
            } catch (Throwable th3) {
                th = th3;
                c18099e3 = c18099e2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void b() throws Exception {
        this.f170424a.a();
        this.f170424a.deleteObservers();
    }

    public final long c() {
        return this.f170427d.size();
    }

    public final C18123s<Pair<String, String>, Long, Long> e() {
        Future<C18123s<Pair<String, String>, Long, Long>> future;
        C18123s<Pair<String, String>, Long, Long> c18123s = new C18123s<>(new Pair("", ""), 0L, 0L);
        try {
            Future<C18123s<Pair<String, String>, Long, Long>> future2 = this.f170428e;
            if (future2 != null) {
                try {
                    c18123s = future2.get();
                } catch (InterruptedException e10) {
                    r.d("MotionManager", "Failed to get motion data: " + e10.getMessage(), new Throwable[0]);
                } catch (ExecutionException e11) {
                    r.d("MotionManager", "Failed to get motion data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (c18123s != null) {
                return c18123s;
            }
            b();
            c18123s = f();
            if (c18123s != null || (future = this.f170428e) == null) {
                return c18123s;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                r.d("MotionManager", "Failed to get motion data: " + e12.getMessage(), new Throwable[0]);
                return c18123s;
            } catch (ExecutionException e13) {
                r.d("MotionManager", "Failed to get motion data: " + e13.getMessage(), new Throwable[0]);
                return c18123s;
            }
        } catch (Exception e14) {
            r.e("MotionManager", "Exception in MotionManager", e14);
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
            if (this.f170427d.size() < 128) {
                if (this.f170427d.size() >= 32 && !this.f170431h) {
                    this.f170431h = true;
                    this.f170432i.i();
                }
                this.f170427d.add((C18100F) obj);
                return;
            }
            b();
            Future<C18123s<Pair<String, String>, Long, Long>> future = this.f170428e;
            if (future != null && !future.isCancelled() && !this.f170428e.isDone()) {
                return;
            }
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
            this.f170428e = executorServiceNewFixedThreadPool.submit(new a());
            executorServiceNewFixedThreadPool.shutdown();
        } catch (Exception e10) {
            r.d("MotionManager", "Exception in processing motion event", e10);
            C18095A.a(e10);
        }
    }

    public C18099E(Application application, InterfaceC18113h interfaceC18113h) {
        r.c("MotionManager", "Initializing motion manager", new Throwable[0]);
        this.f170426c = SystemClock.uptimeMillis();
        this.f170424a = new C18098D(application);
        this.f170432i = interfaceC18113h;
    }
}
