package com.fullstory.instrumentation;

import android.app.Application;
import android.content.Context;
import com.fullstory.FSReason;
import com.fullstory.FSStatusListener;
import com.fullstory.Reason;
import com.fullstory.instrumentation.init.Initialization;
import com.fullstory.util.Log;
import fsimpl.A;
import fsimpl.C13966ar;
import fsimpl.R;
import fsimpl.fZ;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class Bootstrap {

    /* renamed from: c, reason: collision with root package name */
    private static FSStatusListener f64332c;

    /* renamed from: a, reason: collision with root package name */
    private static final A f64330a = new A();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f64331b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f64333d = new Object();

    static void a() {
        a(false, new Runnable() { // from class: com.fullstory.instrumentation.Bootstrap$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Bootstrap.e();
            }
        });
    }

    static void a(Application application, Context context) {
        synchronized (f64331b) {
            A a10 = f64330a;
            if (!a10.f131359a || a10.f131360b) {
                return;
            }
            try {
                b(application, context);
            } catch (Throwable th2) {
                fail(-32768, "Failed to initialize: " + th2.getMessage());
            }
            f64330a.f131359a = false;
        }
    }

    private static void a(FSReason fSReason) {
        A a10 = f64330a;
        a10.f131360b = true;
        a10.f131362d = fSReason;
        a10.f131364f = null;
        a10.f131365g = null;
    }

    private static void a(final FSStatusListener fSStatusListener, final FSReason fSReason) {
        if (fSStatusListener == null) {
            return;
        }
        fZ.a(new Runnable() { // from class: com.fullstory.instrumentation.Bootstrap$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Bootstrap.d(fSStatusListener, fSReason);
            }
        });
    }

    static void a(Runnable runnable) {
        synchronized (f64331b) {
            A a10 = f64330a;
            if (a10.f131360b) {
                return;
            }
            if (a10.f131364f != null || a10.f131365g == null) {
                runnable.run();
            } else {
                a10.f131365g.add(runnable);
            }
        }
    }

    private static void a(boolean z10, Runnable runnable) {
        synchronized (f64331b) {
            A a10 = f64330a;
            if (a10.f131360b) {
                return;
            }
            if (a10.f131364f != null || a10.f131365g == null) {
                runnable.run();
            } else {
                a10.f131363e = z10;
            }
        }
    }

    static void b() {
        a(true, new Runnable() { // from class: com.fullstory.instrumentation.Bootstrap$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Bootstrap.d();
            }
        });
    }

    private static void b(Application application, Context context) {
        synchronized (f64331b) {
            new Initialization().init(application, context);
        }
    }

    private static void b(final FSStatusListener fSStatusListener, final FSReason fSReason) {
        if (fSStatusListener == null) {
            return;
        }
        fZ.a(new Runnable() { // from class: com.fullstory.instrumentation.Bootstrap$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Bootstrap.c(fSStatusListener, fSReason);
            }
        });
    }

    private static FSStatusListener c() {
        FSStatusListener fSStatusListener;
        synchronized (f64333d) {
            fSStatusListener = f64332c;
        }
        return fSStatusListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(FSStatusListener fSStatusListener, FSReason fSReason) {
        try {
            fSStatusListener.onFSDisabled(fSReason);
        } catch (Throwable th2) {
            Log.e("Exception executing FSStatusListener.onFSDisabled callback", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d() {
        impl().restart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(FSStatusListener fSStatusListener, FSReason fSReason) {
        try {
            fSStatusListener.onFSError(fSReason);
        } catch (Throwable th2) {
            Log.e("Exception executing FSStatusListener.onFSError callback", th2);
        }
    }

    public static void disable(int i10, String str) {
        Log.alwaysWarn("Disabling FS. " + str);
        Reason reason = new Reason(i10, str);
        synchronized (f64331b) {
            if (f64330a.f131360b) {
                return;
            }
            a(reason);
            b(c(), reason);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e() {
        impl().shutdown();
    }

    public static void fail(final int i10, final String str) {
        StringBuilder sb2;
        if (!fZ.a()) {
            fZ.c(new Runnable() { // from class: com.fullstory.instrumentation.Bootstrap$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Bootstrap.fail(i10, str);
                }
            });
            return;
        }
        Reason reason = new Reason(i10, str);
        synchronized (f64331b) {
            A a10 = f64330a;
            if (a10.f131360b) {
                return;
            }
            R r10 = a10.f131364f;
            a(reason);
            a10.f131361c = true;
            if (r10 != null) {
                sb2 = new StringBuilder();
                Log.e(sb2.append("Shutting down due to unexpected failure. (").append(i10).append(") ").append(str).toString());
                r10.shutdown();
            } else {
                sb2 = new StringBuilder();
                Log.e(sb2.append("FS initialization failure. FS will not start. (").append(i10).append(") ").append(str).toString());
            }
            a(c(), reason);
        }
    }

    public static C13966ar getCurrentSessionKnobs() {
        R rImpl = impl();
        if (rImpl == null) {
            return null;
        }
        return rImpl.getCurrentSessionKnobs();
    }

    static R impl() {
        R r10;
        synchronized (f64331b) {
            r10 = f64330a.f131364f;
        }
        return r10;
    }

    public static void maybeNotifyListener(FSStatusListener fSStatusListener) {
        boolean z10;
        boolean z11;
        FSReason fSReason;
        synchronized (f64331b) {
            A a10 = f64330a;
            z10 = a10.f131360b;
            z11 = a10.f131361c;
            fSReason = a10.f131362d;
        }
        if (z11) {
            a(fSStatusListener, fSReason);
        } else if (z10) {
            b(fSStatusListener, fSReason);
        }
    }

    public static void setStatusListener(FSStatusListener fSStatusListener) {
        synchronized (f64333d) {
            f64332c = fSStatusListener;
        }
        maybeNotifyListener(fSStatusListener);
    }

    public static void success(R r10) {
        synchronized (f64331b) {
            A a10 = f64330a;
            if (a10.f131360b) {
                return;
            }
            a10.f131364f = r10;
            List list = a10.f131365g;
            a10.f131365g = null;
            boolean z10 = a10.f131363e;
            if (!z10) {
                r10.shutdown();
            }
            if (list != null && list.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((Runnable) it.next()).run();
                    } catch (Throwable th2) {
                        Log.e("Failed to run deferred runnable");
                    }
                }
            }
            r10.finishStartup();
        }
    }
}
