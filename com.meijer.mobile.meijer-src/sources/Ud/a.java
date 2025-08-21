package Ud;

import Id.h;
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
    private static final long f37434r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f37435s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f37436t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile e f37437u = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f37438a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f37439b;

    /* renamed from: c, reason: collision with root package name */
    private int f37440c;

    /* renamed from: d, reason: collision with root package name */
    private Future<?> f37441d;

    /* renamed from: e, reason: collision with root package name */
    private long f37442e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<f> f37443f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37444g;

    /* renamed from: h, reason: collision with root package name */
    private int f37445h;

    /* renamed from: i, reason: collision with root package name */
    Id.b f37446i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.util.f f37447j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f37448k;

    /* renamed from: l, reason: collision with root package name */
    private final String f37449l;

    /* renamed from: m, reason: collision with root package name */
    private final String f37450m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f37451n;

    /* renamed from: o, reason: collision with root package name */
    private final Map<String, d> f37452o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f37453p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f37454q;

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f37438a) {
            try {
                if (aVar.b()) {
                    FS.log_e("WakeLock", String.valueOf(aVar.f37449l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f37440c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String f(String str) {
        if (this.f37444g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f37443f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f37443f);
        this.f37443f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f37438a) {
            try {
                if (b()) {
                    if (this.f37444g) {
                        int i11 = this.f37440c - 1;
                        this.f37440c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f37440c = 0;
                    }
                    g();
                    Iterator<d> it = this.f37452o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f37456a = 0;
                    }
                    this.f37452o.clear();
                    Future<?> future = this.f37441d;
                    if (future != null) {
                        future.cancel(false);
                        this.f37441d = null;
                        this.f37442e = 0L;
                    }
                    this.f37445h = 0;
                    if (this.f37439b.isHeld()) {
                        try {
                            try {
                                this.f37439b.release();
                                if (this.f37446i != null) {
                                    this.f37446i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                FS.log_e("WakeLock", String.valueOf(this.f37449l).concat(" failed to release!"), e10);
                                if (this.f37446i != null) {
                                    this.f37446i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f37446i != null) {
                                this.f37446i = null;
                            }
                            throw th2;
                        }
                    } else {
                        FS.log_e("WakeLock", String.valueOf(this.f37449l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void a(long j10) {
        this.f37453p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f37434r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f37438a) {
            try {
                if (!b()) {
                    this.f37446i = Id.b.a(false, null);
                    this.f37439b.acquire();
                    this.f37447j.c();
                }
                this.f37440c++;
                this.f37445h++;
                f(null);
                d dVar = this.f37452o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f37452o.put(null, dVar);
                }
                dVar.f37456a++;
                long jC = this.f37447j.c();
                long j11 = Long.MAX_VALUE - jC > jMax ? jC + jMax : Long.MAX_VALUE;
                if (j11 > this.f37442e) {
                    this.f37442e = j11;
                    Future<?> future = this.f37441d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f37441d = this.f37454q.schedule(new Runnable() { // from class: Ud.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f37455a);
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
        synchronized (this.f37438a) {
            z10 = this.f37440c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f37453p.decrementAndGet() < 0) {
            FS.log_e("WakeLock", String.valueOf(this.f37449l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f37438a) {
            try {
                f(null);
                if (this.f37452o.containsKey(null)) {
                    d dVar = this.f37452o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f37456a - 1;
                        dVar.f37456a = i10;
                        if (i10 == 0) {
                            this.f37452o.remove(null);
                        }
                    }
                } else {
                    FS.log_w("WakeLock", String.valueOf(this.f37449l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f37438a) {
            this.f37444g = z10;
        }
    }

    public a(Context context, int i10, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f37438a = new Object();
        this.f37440c = 0;
        this.f37443f = new HashSet();
        this.f37444g = true;
        this.f37447j = i.d();
        this.f37452o = new HashMap();
        this.f37453p = new AtomicInteger(0);
        r.m(context, "WakeLock: context must not be null");
        r.g(str, "WakeLock: wakeLockName must not be empty");
        this.f37451n = context.getApplicationContext();
        this.f37450m = str;
        this.f37446i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                str2 = "*gcore*:".concat(strValueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f37449l = str2;
        } else {
            this.f37449l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
            this.f37439b = wakeLockNewWakeLock;
            if (t.c(context)) {
                WorkSource workSourceB = t.b(context, com.google.android.gms.common.util.r.a(packageName) ? context.getPackageName() : packageName);
                this.f37448k = workSourceB;
                if (workSourceB != null) {
                    i(wakeLockNewWakeLock, workSourceB);
                }
            }
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f37435s;
            if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                synchronized (f37436t) {
                    try {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = f37435s;
                        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                            h.a();
                            scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f37435s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f37454q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
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
