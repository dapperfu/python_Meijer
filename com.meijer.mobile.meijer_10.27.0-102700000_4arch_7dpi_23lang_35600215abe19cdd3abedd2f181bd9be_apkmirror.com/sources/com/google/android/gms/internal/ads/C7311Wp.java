package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Wp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7311Wp {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f71163a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f71164b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f71165c = null;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f71166d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f71167e = new AtomicInteger(-1);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f71168f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f71169g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentMap f71170h = new ConcurrentHashMap(9);

    /* renamed from: i, reason: collision with root package name */
    private final Object f71171i;

    public static final Bundle q(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean r(Context context) throws ClassNotFoundException {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76544v0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) Mc.A.c().a(C8659lf.f76558w0)).intValue()) {
            return false;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76572x0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object s(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!x(context, "com.google.android.gms.measurement.AppMeasurement", this.f71168f, true)) {
            return null;
        }
        try {
            return t(context, str).invoke(this.f71168f.get(), null);
        } catch (Exception unused) {
            w(str, true);
            return null;
        }
    }

    private final Method t(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = (Method) this.f71170h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.f71170h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final void u(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f71168f, true)) {
            Method declaredMethod = (Method) this.f71170h.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f71170h.put(str2, declaredMethod);
                } catch (Exception unused) {
                    w(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f71168f.get(), str);
                Pc.p0.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                w(str2, false);
            }
        }
    }

    private final void v(Context context, String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (p(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                Qc.p.e("Invalid event ID: ".concat(String.valueOf(str2)), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f71168f, true)) {
                Method declaredMethod = (Method) this.f71170h.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f71170h.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        w("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f71168f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    private final void w(String str, boolean z10) {
        if (this.f71166d.get()) {
            return;
        }
        Qc.p.g("Invoke Firebase method " + str + " error.");
        if (z10) {
            Qc.p.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f71166d.set(true);
        }
    }

    private final boolean x(Context context, String str, AtomicReference atomicReference, boolean z10) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            C7212Tp.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            w("getInstance", z10);
            return false;
        }
    }

    public final String c(Context context) {
        if (p(context) && x(context, "com.google.android.gms.measurement.AppMeasurement", this.f71168f, true)) {
            try {
                String str = (String) t(context, "getCurrentScreenName").invoke(this.f71168f.get(), null);
                if (str == null) {
                    str = (String) t(context, "getCurrentScreenClass").invoke(this.f71168f.get(), null);
                }
                return str == null ? "" : str;
            } catch (Exception unused) {
                w("getCurrentScreenName", false);
            }
        }
        return "";
    }

    final /* synthetic */ String e(Context context) throws Exception {
        return (String) s("getAppInstanceId", context);
    }

    public final void h(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v(context, "_aa", str, null);
    }

    public final void i(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v(context, "_aq", str, null);
    }

    public final void m(Context context, Mc.Y1 y12) {
        if (((Boolean) Mc.A.c().a(C8659lf.f75887A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f71171i) {
            }
        }
    }

    @Deprecated
    public final void o(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (p(context) && (context instanceof Activity) && x(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f71169g, false)) {
            Method declaredMethod = (Method) this.f71170h.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.f71170h.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    w("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f71169g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                w("setCurrentScreen", false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76432n0
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f71166d
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76586y0
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f71167e
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            Mc.C4169y.b()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = Qc.g.u(r5, r0)
            if (r0 != 0) goto L59
            Mc.C4169y.b()
            boolean r5 = Qc.g.v(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            Qc.p.g(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f71167e
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f71167e
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f71167e
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7311Wp.p(android.content.Context):boolean");
    }

    public C7311Wp() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.f71171i = new Object();
    }

    public final String a(Context context) {
        Object objS;
        if (p(context) && (objS = s("generateEventId", context)) != null) {
            return objS.toString();
        }
        return null;
    }

    public final String b(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!p(context)) {
            return null;
        }
        long jLongValue = ((Long) Mc.A.c().a(C8659lf.f76516t0)).longValue();
        if (jLongValue < 0) {
            return (String) s("getAppInstanceId", context);
        }
        if (this.f71163a.get() == null) {
            if (com.google.android.gms.common.util.e.a()) {
                threadPoolExecutor = C6823Id0.a().b(((Integer) Mc.A.c().a(C8659lf.f76530u0)).intValue(), new ThreadFactoryC7278Vp(this), 2);
            } else {
                AbstractC7593bf abstractC7593bf = C8659lf.f76530u0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) Mc.A.c().a(abstractC7593bf)).intValue(), ((Integer) Mc.A.c().a(abstractC7593bf)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC7278Vp(this));
            }
            C7212Tp.a(this.f71163a, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.f71163a.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.Up
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f70701a.e(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String d(Context context) {
        if (!p(context)) {
            return null;
        }
        synchronized (this.f71164b) {
            try {
                String str = this.f71165c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) s("getGmpAppId", context);
                this.f71165c = str2;
                return str2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!p(context)) {
            return;
        }
        u(context, str, "beginAdUnitExposure");
    }

    public final void g(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!p(context)) {
            return;
        }
        u(context, str, "endAdUnitExposure");
    }

    public final void j(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v(context, "_ac", str, q(map));
    }

    public final void k(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v(context, "_ai", str, q(map));
    }

    public final void l(Context context, String str, String str2, String str3, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!p(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i10);
        v(context, "_ar", str, bundle);
        Pc.p0.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i10);
    }

    public final void n(Context context, Mc.L1 l12) {
        AbstractC7344Xp.d(context).b().c(l12);
        if (((Boolean) Mc.A.c().a(C8659lf.f75887A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f71171i) {
            }
        }
    }
}
