package Sd;

import Gd.h;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.t;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f33558r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f33559s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f33560t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile e f33561u = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f33562a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f33563b;

    /* renamed from: c, reason: collision with root package name */
    private int f33564c;

    /* renamed from: d, reason: collision with root package name */
    private Future<?> f33565d;

    /* renamed from: e, reason: collision with root package name */
    private long f33566e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<f> f33567f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33568g;

    /* renamed from: h, reason: collision with root package name */
    private int f33569h;

    /* renamed from: i, reason: collision with root package name */
    Gd.b f33570i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.util.f f33571j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f33572k;

    /* renamed from: l, reason: collision with root package name */
    private final String f33573l;

    /* renamed from: m, reason: collision with root package name */
    private final String f33574m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f33575n;

    /* renamed from: o, reason: collision with root package name */
    private final Map<String, d> f33576o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f33577p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f33578q;

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f33562a) {
            try {
                if (aVar.b()) {
                    FS.log_e("WakeLock", String.valueOf(aVar.f33573l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f33564c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String f(String str) {
        if (this.f33568g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f33567f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f33567f);
        this.f33567f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f33562a) {
            try {
                if (b()) {
                    if (this.f33568g) {
                        int i11 = this.f33564c - 1;
                        this.f33564c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f33564c = 0;
                    }
                    g();
                    Iterator<d> it = this.f33576o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f33580a = 0;
                    }
                    this.f33576o.clear();
                    Future<?> future = this.f33565d;
                    if (future != null) {
                        future.cancel(false);
                        this.f33565d = null;
                        this.f33566e = 0L;
                    }
                    this.f33569h = 0;
                    if (this.f33563b.isHeld()) {
                        try {
                            try {
                                this.f33563b.release();
                                if (this.f33570i != null) {
                                    this.f33570i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                FS.log_e("WakeLock", String.valueOf(this.f33573l).concat(" failed to release!"), e10);
                                if (this.f33570i != null) {
                                    this.f33570i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f33570i != null) {
                                this.f33570i = null;
                            }
                            throw th2;
                        }
                    } else {
                        FS.log_e("WakeLock", String.valueOf(this.f33573l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void a(long j10) {
        this.f33577p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f33558r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f33562a) {
            try {
                if (!b()) {
                    this.f33570i = Gd.b.a(false, null);
                    this.f33563b.acquire();
                    this.f33571j.c();
                }
                this.f33564c++;
                this.f33569h++;
                f(null);
                d dVar = this.f33576o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f33576o.put(null, dVar);
                }
                dVar.f33580a++;
                long jC = this.f33571j.c();
                long j11 = Long.MAX_VALUE - jC > jMax ? jC + jMax : Long.MAX_VALUE;
                if (j11 > this.f33566e) {
                    this.f33566e = j11;
                    Future<?> future = this.f33565d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f33565d = this.f33578q.schedule(new Runnable() { // from class: Sd.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f33579a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f33562a) {
            z10 = this.f33564c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f33577p.decrementAndGet() < 0) {
            FS.log_e("WakeLock", String.valueOf(this.f33573l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f33562a) {
            try {
                f(null);
                if (this.f33576o.containsKey(null)) {
                    d dVar = this.f33576o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f33580a - 1;
                        dVar.f33580a = i10;
                        if (i10 == 0) {
                            this.f33576o.remove(null);
                        }
                    }
                } else {
                    FS.log_w("WakeLock", String.valueOf(this.f33573l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f33562a) {
            this.f33568g = z10;
        }
    }

    public a(Context context, int i10, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f33562a = new Object();
        this.f33564c = 0;
        this.f33567f = new HashSet();
        this.f33568g = true;
        this.f33571j = i.d();
        this.f33576o = new HashMap();
        this.f33577p = new AtomicInteger(0);
        r.m(context, "WakeLock: context must not be null");
        r.g(str, "WakeLock: wakeLockName must not be empty");
        this.f33575n = context.getApplicationContext();
        this.f33574m = str;
        this.f33570i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                str2 = "*gcore*:".concat(strValueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f33573l = str2;
        } else {
            this.f33573l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
            this.f33563b = wakeLockNewWakeLock;
            if (t.c(context)) {
                WorkSource workSourceB = t.b(context, com.google.android.gms.common.util.r.a(packageName) ? context.getPackageName() : packageName);
                this.f33572k = workSourceB;
                if (workSourceB != null) {
                    i(wakeLockNewWakeLock, workSourceB);
                }
            }
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f33559s;
            if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                synchronized (f33560t) {
                    try {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = f33559s;
                        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                            h.a();
                            scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f33559s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f33578q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }
}
