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
public final class C7436Wp {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f72003a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f72004b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f72005c = null;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f72006d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f72007e = new AtomicInteger(-1);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f72008f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f72009g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentMap f72010h = new ConcurrentHashMap(9);

    /* renamed from: i, reason: collision with root package name */
    private final Object f72011i;

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
        if (!((Boolean) Oc.A.c().a(C8784lf.f77384v0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) Oc.A.c().a(C8784lf.f77398w0)).intValue()) {
            return false;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77412x0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object s(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!x(context, "com.google.android.gms.measurement.AppMeasurement", this.f72008f, true)) {
            return null;
        }
        try {
            return t(context, str).invoke(this.f72008f.get(), null);
        } catch (Exception unused) {
            w(str, true);
            return null;
        }
    }

    private final Method t(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = (Method) this.f72010h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.f72010h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final void u(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f72008f, true)) {
            Method declaredMethod = (Method) this.f72010h.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f72010h.put(str2, declaredMethod);
                } catch (Exception unused) {
                    w(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f72008f.get(), str);
                Rc.p0.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
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
                Sc.p.e("Invalid event ID: ".concat(String.valueOf(str2)), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f72008f, true)) {
                Method declaredMethod = (Method) this.f72010h.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f72010h.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        w("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f72008f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    private final void w(String str, boolean z10) {
        if (this.f72006d.get()) {
            return;
        }
        Sc.p.g("Invoke Firebase method " + str + " error.");
        if (z10) {
            Sc.p.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f72006d.set(true);
        }
    }

    private final boolean x(Context context, String str, AtomicReference atomicReference, boolean z10) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            C7337Tp.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            w("getInstance", z10);
            return false;
        }
    }

    public final String c(Context context) {
        if (p(context) && x(context, "com.google.android.gms.measurement.AppMeasurement", this.f72008f, true)) {
            try {
                String str = (String) t(context, "getCurrentScreenName").invoke(this.f72008f.get(), null);
                if (str == null) {
                    str = (String) t(context, "getCurrentScreenClass").invoke(this.f72008f.get(), null);
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

    public final void m(Context context, Oc.Y1 y12) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76727A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f72011i) {
            }
        }
    }

    @Deprecated
    public final void o(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (p(context) && (context instanceof Activity) && x(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f72009g, false)) {
            Method declaredMethod = (Method) this.f72010h.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.f72010h.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    w("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f72009g.get(), (Activity) context, str, context.getPackageName());
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
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77272n0
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f72006d
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77426y0
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f72007e
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            Oc.C4447y.b()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = Sc.g.u(r5, r0)
            if (r0 != 0) goto L59
            Oc.C4447y.b()
            boolean r5 = Sc.g.v(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            Sc.p.g(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f72007e
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f72007e
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f72007e
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7436Wp.p(android.content.Context):boolean");
    }

    public C7436Wp() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.f72011i = new Object();
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
        long jLongValue = ((Long) Oc.A.c().a(C8784lf.f77356t0)).longValue();
        if (jLongValue < 0) {
            return (String) s("getAppInstanceId", context);
        }
        if (this.f72003a.get() == null) {
            if (com.google.android.gms.common.util.e.a()) {
                threadPoolExecutor = C6948Id0.a().b(((Integer) Oc.A.c().a(C8784lf.f77370u0)).intValue(), new ThreadFactoryC7403Vp(this), 2);
            } else {
                AbstractC7718bf abstractC7718bf = C8784lf.f77370u0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) Oc.A.c().a(abstractC7718bf)).intValue(), ((Integer) Oc.A.c().a(abstractC7718bf)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC7403Vp(this));
            }
            C7337Tp.a(this.f72003a, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.f72003a.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.Up
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f71541a.e(context);
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
        synchronized (this.f72004b) {
            try {
                String str = this.f72005c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) s("getGmpAppId", context);
                this.f72005c = str2;
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
        Rc.p0.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i10);
    }

    public final void n(Context context, Oc.L1 l12) {
        AbstractC7469Xp.d(context).b().c(l12);
        if (((Boolean) Oc.A.c().a(C8784lf.f76727A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f72011i) {
            }
        }
    }
}
