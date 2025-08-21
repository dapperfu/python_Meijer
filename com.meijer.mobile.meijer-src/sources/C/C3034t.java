package C;

import C.C3035u;
import C.a0;
import F.InterfaceC3287w;
import F.InterfaceC3288x;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.concurrent.futures.c;
import j2.C14928h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import q.InterfaceC16578a;

/* renamed from: C.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3034t {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f3955o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final SparseArray<Integer> f3956p = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    final F.B f3957a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3958b;

    /* renamed from: c, reason: collision with root package name */
    private final C3035u f3959c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f3960d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f3961e;

    /* renamed from: f, reason: collision with root package name */
    private final HandlerThread f3962f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3288x f3963g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC3287w f3964h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.camera.core.impl.E f3965i;

    /* renamed from: j, reason: collision with root package name */
    private final a0 f3966j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f3967k;

    /* renamed from: l, reason: collision with root package name */
    private a f3968l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.q<Void> f3969m;

    /* renamed from: n, reason: collision with root package name */
    private final Integer f3970n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C.t$a */
    enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C3034t(Context context, C3035u.b bVar) {
        this(context, bVar, new F.j0());
    }

    C3034t(Context context, C3035u.b bVar, InterfaceC16578a<Context, F.h0> interfaceC16578a) {
        this.f3957a = new F.B();
        this.f3958b = new Object();
        this.f3968l = a.UNINITIALIZED;
        this.f3969m = I.n.p(null);
        if (bVar != null) {
            this.f3959c = bVar.getCameraXConfig();
        } else {
            C3035u.b bVarG = g(context);
            if (bVarG == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f3959c = bVarG.getCameraXConfig();
        }
        p(context, this.f3959c.e0(), interfaceC16578a);
        Executor executorZ = this.f3959c.Z(null);
        Handler handlerF0 = this.f3959c.f0(null);
        this.f3960d = executorZ == null ? new ExecutorC3027l() : executorZ;
        if (handlerF0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f3962f = handlerThread;
            handlerThread.start();
            this.f3961e = C14928h.a(handlerThread.getLooper());
        } else {
            this.f3962f = null;
            this.f3961e = handlerF0;
        }
        Integer num = (Integer) this.f3959c.h(C3035u.f3982O, null);
        this.f3970n = num;
        j(num);
        this.f3966j = new a0.a(this.f3959c.c0()).a();
        this.f3967k = l(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003f, B:9:0x0059, B:11:0x0063, B:18:0x0072, B:20:0x0081, B:21:0x0084, B:24:0x008e, B:25:0x009a, B:26:0x009b, B:27:0x00a7, B:28:0x00a8, B:29:0x00b4, B:30:0x00b5, B:34:0x00ce, B:35:0x0103, B:36:0x0105, B:39:0x010b, B:41:0x0111, B:42:0x0118, B:44:0x011c, B:45:0x0148, B:47:0x014c, B:48:0x0150, B:54:0x015f, B:37:0x0106, B:38:0x010a), top: B:58:0x0015, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(final C.C3034t r14, android.content.Context r15, final java.util.concurrent.Executor r16, final int r17, final androidx.concurrent.futures.c.a r18, final long r19) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C3034t.a(C.t, android.content.Context, java.util.concurrent.Executor, int, androidx.concurrent.futures.c$a, long):void");
    }

    public static /* synthetic */ Object b(C3034t c3034t, Context context, c.a aVar) {
        c3034t.k(c3034t.f3960d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    private static C3035u.b g(Context context) {
        ComponentCallbacks2 componentCallbacks2B = G.e.b(context);
        if (componentCallbacks2B instanceof C3035u.b) {
            return (C3035u.b) componentCallbacks2B;
        }
        try {
            Context contextA = G.e.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C3035u.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            P.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            P.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e11) {
            e = e11;
            P.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            P.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            P.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            P.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            P.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e16) {
            e = e16;
            P.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void j(Integer num) {
        synchronized (f3955o) {
            try {
                if (num == null) {
                    return;
                }
                o2.i.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f3956p;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(final Executor executor, final long j10, final int i10, final Context context, final c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: C.r
            @Override // java.lang.Runnable
            public final void run() {
                C3034t.a(this.f3935a, context, executor, i10, aVar, j10);
            }
        });
    }

    private com.google.common.util.concurrent.q<Void> l(final Context context) {
        com.google.common.util.concurrent.q<Void> qVarA;
        synchronized (this.f3958b) {
            o2.i.j(this.f3968l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f3968l = a.INITIALIZING;
            qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: C.q
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return C3034t.b(this.f3926a, context, aVar);
                }
            });
        }
        return qVarA;
    }

    private void m() {
        synchronized (this.f3958b) {
            this.f3968l = a.INITIALIZED;
        }
    }

    private static void o() {
        SparseArray<Integer> sparseArray = f3956p;
        if (sparseArray.size() == 0) {
            P.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            P.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            P.j(4);
        } else if (sparseArray.get(5) != null) {
            P.j(5);
        } else if (sparseArray.get(6) != null) {
            P.j(6);
        }
    }

    private static void p(Context context, F.h0 h0Var, InterfaceC16578a<Context, F.h0> interfaceC16578a) {
        if (h0Var != null) {
            P.a("CameraX", "QuirkSettings from CameraXConfig: " + h0Var);
        } else {
            h0Var = interfaceC16578a.apply(context);
            P.a("CameraX", "QuirkSettings from app metadata: " + h0Var);
        }
        if (h0Var == null) {
            h0Var = F.i0.f8728b;
            P.a("CameraX", "QuirkSettings by default: " + h0Var);
        }
        F.i0.b().d(h0Var);
    }

    public InterfaceC3287w d() {
        InterfaceC3287w interfaceC3287w = this.f3964h;
        if (interfaceC3287w != null) {
            return interfaceC3287w;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public InterfaceC3288x e() {
        InterfaceC3288x interfaceC3288x = this.f3963g;
        if (interfaceC3288x != null) {
            return interfaceC3288x;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public F.B f() {
        return this.f3957a;
    }

    public androidx.camera.core.impl.E h() {
        androidx.camera.core.impl.E e10 = this.f3965i;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public com.google.common.util.concurrent.q<Void> i() {
        return this.f3967k;
    }

    private void n(a0.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iA;
        if (H4.a.h()) {
            if (bVar != null) {
                iA = bVar.a();
            } else {
                iA = -1;
            }
            H4.a.j("CX:CameraProvider-RetryStatus", iA);
        }
    }
}
