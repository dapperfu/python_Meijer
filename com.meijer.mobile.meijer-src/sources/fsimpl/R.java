package fsimpl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;
import com.fullstory.FSRuntimeConfigEditor;
import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAnchor;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSlotTable;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSlotWriter;
import com.fullstory.instrumentation.webview.WebViewTracker;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.io.IOException;
import java.lang.Thread;
import java.net.URLConnection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes15.dex */
public class R {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f132663a;

    /* renamed from: b, reason: collision with root package name */
    private C14093at f132664b;

    /* renamed from: c, reason: collision with root package name */
    private C14240m f132665c;

    /* renamed from: d, reason: collision with root package name */
    private final Application f132666d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f132667e;

    /* renamed from: f, reason: collision with root package name */
    private final C14138ck f132668f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f132669g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f132670h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f132671i;

    /* renamed from: j, reason: collision with root package name */
    private F f132672j;

    /* renamed from: k, reason: collision with root package name */
    private Runnable f132673k;

    /* renamed from: l, reason: collision with root package name */
    private Supplier f132674l;

    /* renamed from: m, reason: collision with root package name */
    private final aL f132675m;

    /* renamed from: n, reason: collision with root package name */
    private final bD f132676n;

    /* renamed from: o, reason: collision with root package name */
    private final bA f132677o;

    /* renamed from: p, reason: collision with root package name */
    private final C14152cy f132678p;

    /* renamed from: q, reason: collision with root package name */
    private final bS f132679q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f132680r;

    /* renamed from: s, reason: collision with root package name */
    private final U f132681s;

    /* renamed from: t, reason: collision with root package name */
    private Y f132682t;

    /* renamed from: u, reason: collision with root package name */
    private C14208fa f132683u;
    private WebViewTracker webViewTracker;

    public R(Application application, Context context, C14138ck c14138ck, C14145cr c14145cr, boolean z10) {
        AtomicReference atomicReference = new AtomicReference();
        this.f132663a = atomicReference;
        this.f132669g = false;
        this.f132671i = new Object();
        this.f132676n = new bD();
        this.f132680r = new AtomicReference();
        this.f132681s = new U() { // from class: fsimpl.R$$ExternalSyntheticLambda2
            @Override // fsimpl.U
            public final void onFinalBundle() {
                this.f$0.g();
            }
        };
        this.f132682t = null;
        this.f132666d = application;
        this.f132667e = context;
        this.f132668f = c14138ck;
        this.f132670h = !c14138ck.t();
        aL aLVar = new aL(c14138ck.I());
        this.f132675m = aLVar;
        this.f132677o = new bA();
        this.f132678p = new C14152cy(aLVar);
        this.f132679q = new bS();
        this.f132683u = new C14208fa(atomicReference);
        try {
            a(application, context, c14145cr, z10);
        } catch (Throwable th2) {
            dI.a(-32768, "Unable to initialize FS", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Activity a(C14145cr c14145cr) {
        C14228fu.a("Getting current activity.", new Object[0]);
        List resumed = c14145cr.getResumed();
        if (resumed.isEmpty()) {
            return null;
        }
        return (Activity) resumed.get(resumed.size() - 1);
    }

    private void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C14094au) {
            return;
        }
        C14094au c14094au = new C14094au(this);
        c14094au.a(defaultUncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(c14094au);
    }

    private void a(Application application, Context context, final C14145cr c14145cr, boolean z10) {
        a();
        X x10 = new X(context);
        C14090aq c14090aq = new C14090aq(this.f132668f);
        E e10 = new E(context.getCacheDir());
        this.f132665c = new C14240m(context, this.f132668f);
        aB aBVar = new aB();
        aBVar.a(new S(this));
        this.f132664b = new C14093at(this.f132668f);
        new C14186ef(e10).a();
        final RustInterface rustInterface = new RustInterface();
        C14195eo c14195eo = new C14195eo(e10, 10, 7, 3, new C14188eh(rustInterface));
        c14195eo.a();
        this.f132672j = new F(this.f132668f, rustInterface, this.f132680r, this.f132675m);
        V v10 = new V(context, rustInterface);
        WebViewTracker webViewTracker = new WebViewTracker(rustInterface, this.f132668f.R(), this.f132668f.U());
        this.webViewTracker = webViewTracker;
        final C14085al c14085al = new C14085al(rustInterface, context, this.f132668f, c14090aq, new C14089ap(context, this.f132668f, c14195eo, e10, aBVar, this.f132665c, rustInterface, this.f132664b, v10, webViewTracker, this.f132675m, this.f132676n, this.f132677o, this.f132672j, z10), x10, e10, this.webViewTracker, c14195eo, z10, this.f132679q, this.f132681s);
        c14195eo.a(new eG() { // from class: fsimpl.R$$ExternalSyntheticLambda5
            @Override // fsimpl.eG
            public final void notify(String str, String str2, IOException iOException, boolean z11) {
                this.f$0.a(c14085al, rustInterface, str, str2, iOException, z11);
            }
        });
        rustInterface.a(c14085al);
        this.f132663a.set(rustInterface);
        this.f132673k = new T(this, application, c14145cr);
        this.f132674l = new Supplier() { // from class: fsimpl.R$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                return R.a(c14145cr);
            }
        };
        if (this.f132668f.O()) {
            Y y10 = new Y();
            this.f132682t = y10;
            application.registerActivityLifecycleCallbacks(y10);
        }
    }

    private void a(final G g10, final View view, final boolean z10, final boolean z11, final boolean z12) {
        if (view == null) {
            return;
        }
        fZ.b(new Runnable() { // from class: fsimpl.R$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                R.a(z10, z12, g10, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C14085al c14085al, RustInterface rustInterface, String str, String str2, IOException iOException, boolean z10) {
        if (this.f132669g && c14085al.f132875a && z10) {
            Log.i("Graceful shutdown: submitted final bundle, shutting down.");
            this.f132672j.a();
            return;
        }
        String strB = rustInterface.b();
        if (strB == null || str == null || !strB.contains(str) || !(iOException instanceof C14193em)) {
            return;
        }
        C14193em c14193em = (C14193em) iOException;
        if (c14193em.b()) {
            Log.w(String.format("Received Unexpected HTTP Status: %d - shutting down SDK", Integer.valueOf(c14193em.f133410a)));
            rustInterface.d();
        }
    }

    private void a(short s10, FS.LogLevel logLevel, String str) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            rustInterface.a(s10, logLevel.name().toLowerCase(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, boolean z11, G g10, View view, boolean z12) {
        if (z10) {
            if (z11) {
                g10.c(view);
                return;
            } else {
                g10.d(view);
                return;
            }
        }
        if (z12) {
            g10.a(view);
        } else {
            g10.b(view);
        }
    }

    private boolean a(List list) {
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            EnumC14146cs enumC14146cs = (EnumC14146cs) it.next();
            if (enumC14146cs == EnumC14146cs.PREVIEW_MODE) {
                b();
                z10 = true;
            } else {
                Log.e("Unhandled setting encountered when applying configuration changes: " + enumC14146cs.f133252b);
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!fZ.a()) {
            fZ.b(new Runnable() { // from class: fsimpl.R$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b();
                }
            });
            return;
        }
        if (this.f132668f.O()) {
            if (this.f132682t == null) {
                Y y10 = new Y();
                this.f132682t = y10;
                y10.onActivityResumed((Activity) this.f132674l.get());
                this.f132666d.registerActivityLifecycleCallbacks(this.f132682t);
                return;
            }
            return;
        }
        Y y11 = this.f132682t;
        if (y11 != null) {
            this.f132666d.unregisterActivityLifecycleCallbacks(y11);
            this.f132682t.onActivityPaused((Activity) this.f132674l.get());
            this.f132682t = null;
        }
    }

    private G c() {
        C14240m c14240m = this.f132665c;
        if (c14240m == null) {
            return null;
        }
        return c14240m.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        C14229fv.a(new Runnable() { // from class: fsimpl.R$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        C14221fn.a(this.f132667e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Activity f() {
        return this.f132672j.getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        U u10 = (U) this.f132680r.getAndSet(null);
        if (u10 != null) {
            u10.onFinalBundle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void __sendInternalMessage(java.lang.String r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.lang.String r0 = "is_web_view_initialized"
            boolean r0 = r8.equals(r0)
            java.lang.String r1 = "setResult"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            com.fullstory.instrumentation.webview.WebViewTracker r0 = r7.webViewTracker
            if (r0 == 0) goto L7d
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r4 = r9[r3]
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            boolean r0 = r0.b(r4)
            r9 = r9[r2]     // Catch: java.lang.Exception -> L36
            java.lang.Class r4 = r9.getClass()     // Catch: java.lang.Exception -> L36
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L36
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r3] = r6     // Catch: java.lang.Exception -> L36
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r1, r5)     // Catch: java.lang.Exception -> L36
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L36
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L36
            r2[r3] = r0     // Catch: java.lang.Exception -> L36
            r1.invoke(r9, r2)     // Catch: java.lang.Exception -> L36
            goto L7d
        L36:
            r9 = move-exception
            java.lang.String r0 = "is_web_view_initialized failed"
            goto L7a
        L3a:
            java.lang.String r0 = "graceful_shutdown"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L45
            r7.f132669g = r2
            goto L7d
        L45:
            java.lang.String r0 = "get_consent_status"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L7d
            fsimpl.ar r0 = r7.getCurrentSessionKnobs()
            if (r0 == 0) goto L58
            boolean r0 = r0.e()
            goto L59
        L58:
            r0 = 0
        L59:
            java.lang.Object[] r9 = (java.lang.Object[]) r9     // Catch: java.lang.Exception -> L77
            r9 = r9[r3]     // Catch: java.lang.Exception -> L77
            java.lang.Class r4 = r9.getClass()     // Catch: java.lang.Exception -> L77
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L77
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r3] = r6     // Catch: java.lang.Exception -> L77
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r1, r5)     // Catch: java.lang.Exception -> L77
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L77
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L77
            r2[r3] = r0     // Catch: java.lang.Exception -> L77
            r1.invoke(r9, r2)     // Catch: java.lang.Exception -> L77
            goto L7d
        L77:
            r9 = move-exception
            java.lang.String r0 = "get_consent_status failed"
        L7a:
            com.fullstory.util.Log.e(r0, r9)
        L7d:
            java.util.concurrent.atomic.AtomicReference r9 = r7.f132663a
            java.lang.Object r9 = r9.get()
            com.fullstory.rust.RustInterface r9 = (com.fullstory.rust.RustInterface) r9
            if (r9 == 0) goto L8a
            r9.e(r8)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.R.__sendInternalMessage(java.lang.String, java.lang.Object):void");
    }

    void a(Thread thread, Throwable th2) {
        fX fXVarA = fU.a(th2);
        if (fXVarA != null) {
            FS.log(FS.LogLevel.ERROR, fXVarA.f133492a);
        }
        if (this.f132672j != null) {
            this.f132672j.a(fXVarA == null ? new String[0] : fXVarA.f133493b);
        }
    }

    public void addClass(View view, String str) {
        this.f132675m.c(view, str);
    }

    public void addClasses(View view, Collection collection) {
        this.f132675m.a(view, collection);
    }

    public void addPopupMenuClass(Object obj, String str) {
        this.f132678p.a(obj, str);
    }

    public void anonymize() {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            rustInterface.a(new C14212fe());
        }
    }

    public void associateDrawable(Drawable drawable, int i10) {
        if (drawable instanceof VectorDrawable) {
            C14107bg.a(drawable, i10);
        }
    }

    public boolean bitmap_isRecycled(Bitmap bitmap) {
        return this.f132679q.d(bitmap);
    }

    public void bitmap_recycle(Bitmap bitmap) {
        this.f132679q.c(bitmap);
    }

    public void compose_click(Object obj, boolean z10) {
        C14240m c14240m;
        G gA;
        C14185ee c14185eeA;
        FSComposeLayoutNode fSComposeLayoutNodeA;
        if (!(obj instanceof FSComposeModifier) || (c14240m = this.f132665c) == null || (gA = c14240m.a()) == null || (c14185eeA = this.f132675m.a()) == null || (fSComposeLayoutNodeA = c14185eeA.a((FSComposeModifier) obj)) == null) {
            return;
        }
        gA.a(fSComposeLayoutNodeA, z10);
    }

    public int compose_getGroupSize(Object obj, Object obj2) {
        try {
            FSComposeSlotTable fSComposeSlotTable = (FSComposeSlotTable) obj;
            return fSComposeSlotTable._fsGetGroupSize(fSComposeSlotTable._fsGetGroups(), ((FSComposeAnchor) obj2)._fsGetLocation());
        } catch (Throwable th2) {
            Bootstrap.fail(-32768, "Could not determine size of Compose SlotTable insertion.");
            return 0;
        }
    }

    public void compose_nodeChanged(Object obj) {
        C14185ee c14185eeA;
        if ((obj instanceof FSComposeLayoutNode) && (c14185eeA = this.f132675m.a()) != null) {
            c14185eeA.a((FSComposeLayoutNode) obj);
        }
    }

    public void compose_onSlotsInserted(Object obj, int i10) {
        try {
            this.f132676n.a((FSComposeSlotWriter) obj, i10);
        } catch (Throwable th2) {
            Bootstrap.fail(-32768, "Encountered failure trying to update Compose selectors: " + th2.getMessage());
        }
    }

    public void consent(boolean z10) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            rustInterface.a(new C14213ff(z10));
        }
    }

    public void disableInjection(WebView webView) {
        WebViewTracker.d(webView);
    }

    public void endPage(UUID uuid) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pageName", "");
        rustInterface.a(new C14217fj(EnumC14220fm.PAGE, map, true, uuid));
    }

    public void event(String str, Map map) {
        if (str == null) {
            Log.w("Dropping custom event with NULL name, properties:" + map);
            return;
        }
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            rustInterface.a(new C14214fg(str, map));
        }
    }

    public void finishStartup() {
        Runnable runnable = this.f132673k;
        if (runnable != null) {
            runnable.run();
            this.f132673k = null;
        }
        this.f132674l = new Supplier() { // from class: fsimpl.R$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.f();
            }
        };
        runOnUiThread(new Runnable() { // from class: fsimpl.R$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    public void flutterEvent(Map map) {
        try {
            this.f132683u.a(map);
        } catch (ClassCastException | IllegalArgumentException e10) {
            Log.e("Flutter event of type %d could not be serialized", e10);
            for (String str : map.keySet()) {
                Log.e(String.format("Flutter event property key: %s, value: %s", str, map.get(str).toString()));
            }
        }
    }

    public View.AccessibilityDelegate getAccessibilityDelegate(View view) {
        C14240m c14240m = this.f132665c;
        return c14240m == null ? view.getAccessibilityDelegate() : c14240m.c(view);
    }

    public String getCurrentSession() {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            return rustInterface.b();
        }
        return null;
    }

    public C14091ar getCurrentSessionKnobs() {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface == null) {
            return null;
        }
        return rustInterface.a();
    }

    public String getCurrentSessionURL(boolean z10) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            return rustInterface.a(z10);
        }
        return null;
    }

    public Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        return defaultUncaughtExceptionHandler instanceof C14094au ? ((C14094au) defaultUncaughtExceptionHandler).a() : Thread.getDefaultUncaughtExceptionHandler();
    }

    public WebViewClient getWebViewClient(WebView webView) {
        WebViewTracker webViewTracker = this.webViewTracker;
        return webViewTracker == null ? webView.getWebViewClient() : webViewTracker.e(webView);
    }

    public boolean isPreviewMode(boolean z10) {
        return this.f132668f.a(z10);
    }

    public boolean isRecordingDispatchDraw(Object obj, Canvas canvas) {
        if (!(obj instanceof ViewGroup) || !(canvas instanceof C14082ai)) {
            return false;
        }
        ((C14082ai) canvas).a((ViewGroup) obj);
        return true;
    }

    public boolean isRecordingDraw(Object obj, Canvas canvas) {
        if (!(obj instanceof View) || !(canvas instanceof C14082ai)) {
            return false;
        }
        View view = (View) obj;
        AbstractC14235h.a(view, canvas);
        if (!(obj instanceof FSDispatchDraw)) {
            return true;
        }
        AbstractC14235h.b(view, canvas);
        return true;
    }

    public boolean isRecordingDrawChild(Object obj, Canvas canvas, View view, long j10) {
        if (!(obj instanceof ViewGroup) || !(canvas instanceof C14082ai)) {
            return false;
        }
        ((C14082ai) canvas).a(view);
        return true;
    }

    public void log(FS.LogLevel logLevel, String str) {
        if (Log.isLoggable(logLevel)) {
            a((short) 1, logLevel, str);
        }
    }

    public void logcat(FS.LogLevel logLevel, String str, String str2, Throwable th2) {
        if (Log.isLogcatLoggable(logLevel)) {
            if (str2 != null) {
                str = str + ": " + str2;
            }
            a((short) 2, logLevel, str);
        }
    }

    public void okhttp_addInterceptors(Object obj) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface == null) {
            return;
        }
        bO.a(rustInterface, obj);
    }

    public void pageView(UUID uuid, String str, Map map) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface == null) {
            return;
        }
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("pageName", str);
        rustInterface.a(new C14217fj(EnumC14220fm.PAGE, map2, false, uuid));
    }

    public void reactNative_exec_onFsPressForward(Object obj, int i10, boolean z10, boolean z11, boolean z12) {
        G gC = c();
        if (gC == null) {
            return;
        }
        a(gC, C14118br.a(obj, i10), z10, z11, z12);
    }

    public void reactNative_exec_onFsPressForward_direct(View view, boolean z10, boolean z11, boolean z12) {
        G gC = c();
        if (gC == null) {
            return;
        }
        a(gC, view, z10, z11, z12);
    }

    public synchronized boolean reconfigure(FSRuntimeConfigEditor.Applier applier) {
        try {
            List listA = this.f132668f.a(this.f132667e, applier);
            synchronized (this.f132671i) {
                if (this.f132670h) {
                    return false;
                }
                if (!a(listA)) {
                    return false;
                }
                shutdown();
                restart();
                return true;
            }
        } catch (Throwable th2) {
            Log.e("Unexpected exception attempting to reconfigure Fullstory", th2);
            return false;
        }
    }

    public void removeAllClasses(View view) {
        this.f132675m.a(view);
    }

    public void removeAttribute(View view, String str) {
        this.f132675m.b(view, str);
    }

    public void removeClass(View view, String str) {
        this.f132675m.d(view, str);
    }

    public void removeClasses(View view, Collection collection) {
        this.f132675m.b(view, collection);
    }

    public void removePopupMenuClass(Object obj, String str) {
        this.f132678p.b(obj, str);
    }

    public void resetIdleTimer() {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            rustInterface.h();
        }
    }

    public void restart() {
        synchronized (this.f132671i) {
            RustInterface rustInterface = (RustInterface) this.f132663a.get();
            if (rustInterface != null) {
                rustInterface.e();
            }
            this.f132670h = false;
        }
    }

    public void runOnUiThread(Runnable runnable) {
        fZ.b(runnable);
    }

    public void setAccessibilityDelegate(View view, View.AccessibilityDelegate accessibilityDelegate) {
        C14240m c14240m = this.f132665c;
        if (c14240m == null) {
            view.setAccessibilityDelegate(accessibilityDelegate);
        } else {
            c14240m.a(view, accessibilityDelegate);
        }
    }

    public void setAttribute(View view, String str, String str2) {
        this.f132675m.a(view, str, str2);
    }

    public void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C14094au) {
            ((C14094au) defaultUncaughtExceptionHandler).a(uncaughtExceptionHandler);
        } else {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public void setTagName(View view, String str) {
        this.f132675m.a(view, str);
    }

    public void setWebViewClient(WebView webView, WebViewClient webViewClient) {
        WebViewTracker webViewTracker = this.webViewTracker;
        if (webViewTracker == null) {
            webView.setWebViewClient(webViewClient);
        } else {
            webViewTracker.a(webView, webViewClient);
        }
    }

    public void shutdown() {
        synchronized (this.f132671i) {
            RustInterface rustInterface = (RustInterface) this.f132663a.get();
            if (rustInterface != null) {
                rustInterface.d();
            }
            this.f132670h = true;
        }
    }

    public void trackWebView(WebView webView) {
        WebViewTracker webViewTracker = this.webViewTracker;
        if (webViewTracker == null) {
            return;
        }
        webViewTracker.c(webView);
    }

    public void trackWindow(Window window) {
        aA.a(window);
    }

    public void typefaceCreateDerived(Typeface typeface, Typeface typeface2, int i10) {
        Log.i("Derived typeface " + typeface2 + " from " + typeface2 + "/style = " + i10);
        this.f132664b.a(typeface2, typeface);
    }

    public void typefaceCreateFromAsset(Typeface typeface, String str) {
        Log.i("Loaded typeface " + typeface + " from " + str);
        this.f132664b.a(typeface, str);
    }

    public void updatePageProperties(UUID uuid, Map map) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface == null) {
            return;
        }
        rustInterface.a(new C14217fj(EnumC14220fm.PAGE, map, false, uuid));
    }

    public void updateUser(String str, Map map) {
        HashMap map2;
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        if (rustInterface != null) {
            String strD = fY.d(str);
            if (strD != null) {
                map2 = map == null ? new HashMap() : new HashMap(map);
                map2.put("uid", strD);
            } else {
                map2 = null;
            }
            EnumC14220fm enumC14220fm = EnumC14220fm.USER;
            if (map2 != null) {
                map = map2;
            }
            rustInterface.a(new C14217fj(enumC14220fm, map));
        }
    }

    public URLConnection urlconnection_wrapInstance(URLConnection uRLConnection) {
        RustInterface rustInterface = (RustInterface) this.f132663a.get();
        return rustInterface == null ? uRLConnection : bN.a(rustInterface, uRLConnection);
    }
}
