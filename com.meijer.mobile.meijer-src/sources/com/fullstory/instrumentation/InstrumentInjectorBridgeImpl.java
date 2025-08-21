package com.fullstory.instrumentation;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EdgeEffect;
import com.fullstory.FS;
import com.fullstory.FSBuildConfig;
import com.fullstory.FSOnReadyListener;
import com.fullstory.FSPage;
import com.fullstory.FSReason;
import com.fullstory.FSRuntimeConfig;
import com.fullstory.FSRuntimeConfigEditor;
import com.fullstory.FSSessionData;
import com.fullstory.FSStatusListener;
import com.fullstory.Reason;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer;
import com.fullstory.util.Log;
import fsimpl.C14082ai;
import fsimpl.C14099az;
import fsimpl.C14118br;
import fsimpl.J;
import fsimpl.K;
import fsimpl.P;
import fsimpl.Q;
import fsimpl.R;
import fsimpl.aA;
import fsimpl.fK;
import fsimpl.fZ;
import java.lang.Thread;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes15.dex */
public class InstrumentInjectorBridgeImpl implements InstrumentInjectorBridge {

    /* renamed from: a, reason: collision with root package name */
    private static final String f65174a = FSBuildConfig.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private static final String f65175b = FSRuntimeConfig.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList f65176c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static FSReason f65177d;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(View view) {
        return String.format("FS.excludeWithoutConsent(view: %s)", fK.d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(WebView webView) {
        return String.format("FS.disableInjection(webView: %s)", fK.d(webView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(FSOnReadyListener fSOnReadyListener) {
        return String.format("FS.setReadyListener(listener: %s)", fK.b(fSOnReadyListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(FSRuntimeConfigEditor.Applier applier) {
        return String.format("%s.reconfigure(configurator: %s)", f65175b, fK.b(applier));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(Object obj) {
        return String.format("FS.excludePopupMenuWithoutConsent(popupMenu: %s)", fK.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str, FSPage fSPage) {
        return String.format("FS.page(pageName: %s) => %s", fK.c(str), fK.b(fSPage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str, Map map, FSPage fSPage) {
        return String.format("FS.page(pageName: %s, properties: %s) => %s", fK.c(str), fK.a(map), fK.b(fSPage));
    }

    private String a(boolean z10) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            return rImpl.getCurrentSessionURL(z10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(boolean z10, String str) {
        return String.format("FS.getCurrentSessionURL(now: %b) => %s", Boolean.valueOf(z10), fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(boolean z10, boolean z11) {
        return String.format("%s.isPreviewMode() => %b", b(z10), Boolean.valueOf(z11));
    }

    private void a() {
        a(b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Typeface typeface, Typeface typeface2, int i10) {
        Bootstrap.impl().typefaceCreateDerived(typeface, typeface2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Typeface typeface, String str) {
        Bootstrap.impl().typefaceCreateFromAsset(typeface, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Drawable drawable, int i10) {
        Bootstrap.impl().associateDrawable(drawable, i10);
    }

    private void a(final View view, final String str) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.d(view, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(View view, String str, String str2) {
        Bootstrap.impl().setAttribute(view, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(View view, Collection collection) {
        Bootstrap.impl().removeClasses(view, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(View view, boolean z10, boolean z11, boolean z12) {
        Bootstrap.impl().reactNative_exec_onFsPressForward_direct(view, z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(FS.LogLevel logLevel, String str) {
        Bootstrap.impl().log(logLevel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(FS.LogLevel logLevel, String str, String str2, Throwable th2) {
        Bootstrap.impl().logcat(logLevel, str, str2, th2);
    }

    private void a(FSStatusListener fSStatusListener) {
        if (fSStatusListener == null) {
            return;
        }
        a(new FSStatusListener[]{fSStatusListener});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Object obj, int i10, boolean z10, boolean z11, boolean z12) {
        Bootstrap.impl().reactNative_exec_onFsPressForward(obj, i10, z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Object obj, String str) {
        Bootstrap.impl().removePopupMenuClass(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, Object obj) {
        Bootstrap.impl().__sendInternalMessage(str, obj);
    }

    private void a(final String str, final Map map) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.e(str, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map) {
        Bootstrap.impl().flutterEvent(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(UUID uuid) {
        Bootstrap.impl().endPage(uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(UUID uuid, String str, Map map) {
        Bootstrap.impl().pageView(uuid, str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(UUID uuid, Map map) {
        Bootstrap.impl().updatePageProperties(uuid, map);
    }

    private void a(FSStatusListener[] fSStatusListenerArr) {
        if (fSStatusListenerArr == null || fSStatusListenerArr.length == 0) {
            return;
        }
        if (Bootstrap.impl() == null) {
            Log.d("Not invoking FSOnReadyListener#onReady due to null InstrumentInjectorImpl");
            return;
        }
        String strA = a(false);
        FSReason fSReason = f65177d;
        if (a(strA)) {
            a(fSStatusListenerArr, new FSSessionData(strA));
        } else if (fSReason != null) {
            c(fSStatusListenerArr, fSReason);
        }
    }

    private static void a(final FSStatusListener[] fSStatusListenerArr, final FSSessionData fSSessionData) {
        fZ.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda59
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.b(fSStatusListenerArr, fSSessionData);
            }
        });
    }

    private static boolean a(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(View view) {
        return String.format("FS.exclude(view: %s)", fK.d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(View view, String str, String str2) {
        return String.format("FS.setAttribute(view: %s, attributeName: %s, attributeValue: %s)", fK.d(view), fK.c(str), fK.c(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(View view, Collection collection) {
        return String.format("FS.removeClasses(view: %s, classNames: %s)", fK.d(view), fK.a(collection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(FS.LogLevel logLevel, String str) {
        return String.format("FS.log(level: %s, message: %s)", logLevel, fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(FSStatusListener fSStatusListener) {
        return String.format("FS.unregisterStatusListener(listener: %s)", fK.b(fSStatusListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(Object obj) {
        return String.format("FS.excludePopupMenu(popupMenu: %s)", fK.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(Object obj, String str) {
        return String.format("FS.removePopupMenuClass(popupMenu: %s, className: %s)", fK.b(obj), fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(String str) {
        return String.format("FS.getCurrentSessionURL() => %s", fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(Map map) {
        return String.format("FS.flutterEvent(properties: %s)", fK.a(map));
    }

    private static String b(boolean z10) {
        return z10 ? f65174a : f65175b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(View view, String str) {
        Bootstrap.impl().removeClass(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, Map map) {
        Bootstrap.impl().event(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(FSStatusListener[] fSStatusListenerArr, FSSessionData fSSessionData) {
        for (FSStatusListener fSStatusListener : fSStatusListenerArr) {
            try {
                fSStatusListener.onSession(fSSessionData);
            } catch (Throwable th2) {
                Log.e("Exception executing FSStatusListener.onSession callback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FSStatusListener[] b() {
        FSStatusListener[] fSStatusListenerArr;
        ArrayList arrayList = f65176c;
        synchronized (arrayList) {
            fSStatusListenerArr = (FSStatusListener[]) arrayList.toArray(new FSStatusListener[0]);
        }
        return fSStatusListenerArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(View view) {
        return String.format("FS.maskWithoutConsent(view: %s)", fK.d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(View view, String str) {
        return String.format("FS.removeClass(view: %s, className: %s)", fK.d(view), fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(FSStatusListener fSStatusListener) {
        return String.format("FS.registerStatusListener(listener: %s)", fK.b(fSStatusListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(Object obj) {
        return String.format("FS.maskPopupMenuWithoutConsent(popupMenu: %s)", fK.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(String str) {
        return String.format("FS.getCurrentSession() => %s", fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(String str, Map map) {
        return String.format("FS.event(name: %s, properties: %s)", fK.c(str), fK.a(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(Map map) {
        return String.format("FS.setUserVars(userVars: %s)", fK.a(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(View view, Collection collection) {
        Bootstrap.impl().addClasses(view, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Object obj, String str) {
        Bootstrap.impl().addPopupMenuClass(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z10) {
        Bootstrap.impl().consent(z10);
    }

    private static void c(final FSStatusListener[] fSStatusListenerArr, final FSReason fSReason) {
        fZ.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.h(fSStatusListenerArr, fSReason);
            }
        });
    }

    private static boolean c() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(View view) {
        return String.format("FS.mask(view: %s)", fK.d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(View view, Collection collection) {
        return String.format("FS.addClasses(view: %s, classNames: %s)", fK.d(view), fK.a(collection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(Object obj) {
        return String.format("FS.maskPopupMenu(popupMenu: %s)", fK.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(Object obj, String str) {
        return String.format("FS.addPopupMenuClass(popupMenu: %s, className: %s)", fK.b(obj), fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(String str) {
        return String.format("FS.identify(uid: %s)", fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(String str, Map map) {
        return String.format("FS.identify(uid: %s, userVars: %s)", fK.c(str), fK.a(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(boolean z10) {
        return String.format("FS.consent(consented: %b)", Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d() {
        Bootstrap.impl().resetIdleTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(View view, String str) {
        Bootstrap.impl().addClass(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final FSStatusListener[] fSStatusListenerArr, final FSReason fSReason) {
        fZ.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.g(fSStatusListenerArr, fSReason);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(FSStatusListener fSStatusListener) {
        return fSStatusListener instanceof Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e() {
        return "FS.resetIdleTimer()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(View view) {
        return String.format("FS.unmaskWithConsent(view: %s)", fK.d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(View view, String str) {
        return String.format("FS.addClass(view: %s, className: %s)", fK.d(view), fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Object obj) {
        return String.format("FS.unmaskPopupMenuWithConsent(popupMenu: %s)", fK.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(String str, Map map) {
        Bootstrap.impl().updateUser(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final FSStatusListener[] fSStatusListenerArr, final FSReason fSReason) {
        fZ.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.f(fSStatusListenerArr, fSReason);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f() {
        return "FS.restart()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(View view) {
        return String.format("FS.unmask(view: %s)", fK.d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Object obj) {
        return String.format("FS.unmaskPopupMenu(popupMenu: %s)", fK.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(View view, String str) {
        Bootstrap.impl().removeAttribute(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(FSStatusListener[] fSStatusListenerArr, FSReason fSReason) {
        for (FSStatusListener fSStatusListener : fSStatusListenerArr) {
            try {
                fSStatusListener.onFSDisabled(fSReason);
            } catch (Throwable th2) {
                Log.e("Exception executing FSStatusListener.onFSDisabled callback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "FS.shutdown()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(View view, String str) {
        return String.format("FS.removeAttribute(view: %s, attributeName: %s)", fK.d(view), fK.c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(View view) {
        Bootstrap.impl().removeAllClasses(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(FSStatusListener[] fSStatusListenerArr, FSReason fSReason) {
        for (FSStatusListener fSStatusListener : fSStatusListenerArr) {
            try {
                fSStatusListener.onFSError(fSReason);
            } catch (Throwable th2) {
                Log.e("Exception executing FSStatusListener.onFSError callback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(View view) {
        return String.format("FS.removeAllClasses(view: %s)", fK.d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h() {
        Bootstrap.impl().anonymize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(View view, String str) {
        Bootstrap.impl().setTagName(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(FSStatusListener[] fSStatusListenerArr, FSReason fSReason) {
        for (FSStatusListener fSStatusListener : fSStatusListenerArr) {
            try {
                fSStatusListener.onSessionDisabled(fSReason);
            } catch (Throwable th2) {
                Log.e("Exception executing FSStatusListener.onSessionDisabled callback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i() {
        return "FS.anonymize()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i(View view, String str) {
        return String.format("FS.setTagName(view: %s, tagName: %s)", fK.d(view), fK.c(str));
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void __endPage(final UUID uuid) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(uuid);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void __pageView(final UUID uuid, final String str, final Map map) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(uuid, str, map);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void __sendInternalMessage(final String str, final Object obj) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda54
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(str, obj);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void __updatePageProperties(final UUID uuid, final Map map) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda71
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(uuid, map);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void addClass(final View view, final String str) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda52
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.e(view, str);
            }
        });
        a(view, str);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void addClasses(final View view, final Collection collection) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda46
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.d(view, collection);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.c(view, collection);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void addPopupMenuClass(final Object obj, final String str) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda18
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.d(obj, str);
            }
        });
        addPopupMenuClassImpl(obj, str);
    }

    public void addPopupMenuClassImpl(final Object obj, final String str) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.c(obj, str);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void anonymize() {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda40
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.i();
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.h();
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void associateDrawable(final Drawable drawable, final int i10) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(drawable, i10);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean bitmap_isRecycled(Bitmap bitmap) {
        R rImpl = Bootstrap.impl();
        return rImpl == null ? bitmap.isRecycled() : rImpl.bitmap_isRecycled(bitmap);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void bitmap_recycle(Bitmap bitmap) {
        R rImpl = Bootstrap.impl();
        if (rImpl == null) {
            bitmap.recycle();
        } else {
            rImpl.bitmap_recycle(bitmap);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void clearSession() {
        f65177d = null;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void compose_click(Object obj, boolean z10) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.compose_click(obj, z10);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public int compose_getGroupSize(Object obj, Object obj2) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            return rImpl.compose_getGroupSize(obj, obj2);
        }
        return 0;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void compose_nodeChanged(Object obj) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.compose_nodeChanged(obj);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void compose_onSlotsInserted(Object obj, int i10) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.compose_onSlotsInserted(obj, i10);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean compose_shouldDraw(Object obj, Object obj2, Canvas canvas, Object obj3, boolean z10) {
        if (canvas instanceof C14082ai) {
            return C14099az.a(obj, (C14082ai) canvas, obj3, z10);
        }
        return true;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean compose_shouldDrawAndroidView(Object obj, View view, Canvas canvas) {
        if (!(canvas instanceof C14082ai)) {
            return true;
        }
        C14099az.a(obj, view, (C14082ai) canvas);
        return false;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean compose_shouldDrawLayer(Object obj, Object obj2, Canvas canvas, Object obj3, boolean z10) {
        if (!(canvas instanceof C14082ai)) {
            return true;
        }
        if (!(obj instanceof FSComposeRenderNodeLayer)) {
            return false;
        }
        C14099az.a((FSComposeRenderNodeLayer) obj, obj2, obj3, z10);
        return false;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean compose_shouldObserveReads(Canvas canvas) {
        return !(canvas instanceof C14082ai);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void consent(final boolean z10) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda9
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.d(z10);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.c(z10);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void disableInjection(final WebView webView) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda13
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(webView);
            }
        });
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.disableInjection(webView);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void event(final String str, final Map map) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda34
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.c(str, map);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.b(str, map);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void exclude(final View view) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda67
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(view);
            }
        });
        a(view, FS.EXCLUDE_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void excludePopupMenu(final Object obj) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda27
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(obj);
            }
        });
        addPopupMenuClassImpl(obj, FS.EXCLUDE_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void excludePopupMenuWithoutConsent(final Object obj) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(obj);
            }
        });
        addPopupMenuClassImpl(obj, FS.EXCLUDE_WITHOUT_CONSENT_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void excludeWithoutConsent(final View view) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda55
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(view);
            }
        });
        a(view, FS.EXCLUDE_WITHOUT_CONSENT_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void flutterEvent(final Map map) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(map);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(map);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public View.AccessibilityDelegate getAccessibilityDelegate(View view) {
        R rImpl = Bootstrap.impl();
        return rImpl != null ? rImpl.getAccessibilityDelegate(view) : view.getAccessibilityDelegate();
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public String getCurrentSession() {
        R rImpl = Bootstrap.impl();
        final String currentSession = rImpl != null ? rImpl.getCurrentSession() : null;
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda57
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.c(currentSession);
            }
        });
        return currentSession;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public String getCurrentSessionURL() {
        final String strA = a(false);
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda56
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(strA);
            }
        });
        return strA;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public String getCurrentSessionURL(final boolean z10) {
        final String strA = a(z10);
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(z10, strA);
            }
        });
        return strA;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
        R rImpl = Bootstrap.impl();
        return rImpl != null ? rImpl.getDefaultUncaughtExceptionHandler() : Thread.getDefaultUncaughtExceptionHandler();
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public WebViewClient getWebViewClient(WebView webView) {
        R rImpl = Bootstrap.impl();
        return rImpl != null ? rImpl.getWebViewClient(webView) : webView.getWebViewClient();
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public Window.Callback getWindowCallback(Window window) {
        return aA.b(window);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void gotSession() {
        a();
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void identify(final String str) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda58
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.d(str);
            }
        });
        a(str, (Map) null);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void identify(final String str, final Map map) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda39
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.d(str, map);
            }
        });
        a(str, map);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void init(Application application, Context context) {
        CurrentPlatform.init(context);
        Bootstrap.setStatusListener(new P(this));
        Bootstrap.a(application, context);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean isFullStoryCanvas(Canvas canvas) {
        return canvas instanceof C14082ai;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean isPreviewMode(final boolean z10) {
        R rImpl = Bootstrap.impl();
        final boolean z11 = rImpl != null && rImpl.isPreviewMode(z10);
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda5
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(z10, z11);
            }
        });
        return z11;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean isRecordingDispatchDraw(Object obj, Canvas canvas) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            return rImpl.isRecordingDispatchDraw(obj, canvas);
        }
        return false;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean isRecordingDraw(Object obj, Canvas canvas) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            return rImpl.isRecordingDraw(obj, canvas);
        }
        return false;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean isRecordingDrawChild(Object obj, Canvas canvas, View view, long j10) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            return rImpl.isRecordingDrawChild(obj, canvas, view, j10);
        }
        return false;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void log(final FS.LogLevel logLevel, final String str) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda11
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(logLevel, str);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(logLevel, str);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void logcat(final FS.LogLevel logLevel, final String str, final String str2, final Throwable th2) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda68
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(logLevel, str, str2, th2);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void mask(final View view) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda26
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.d(view);
            }
        });
        a(view, FS.MASK_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void maskPopupMenu(final Object obj) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda51
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.d(obj);
            }
        });
        addPopupMenuClassImpl(obj, FS.MASK_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void maskPopupMenuWithoutConsent(final Object obj) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda42
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.c(obj);
            }
        });
        addPopupMenuClassImpl(obj, FS.MASK_WITHOUT_CONSENT_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void maskWithoutConsent(final View view) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda65
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.c(view);
            }
        });
        a(view, FS.MASK_WITHOUT_CONSENT_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public EdgeEffect maybeWrapEdgeEffect(EdgeEffect edgeEffect, Context context) {
        return c() ? new J(context) : edgeEffect;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public EdgeEffect maybeWrapEdgeEffect(EdgeEffect edgeEffect, Context context, AttributeSet attributeSet) {
        return c() ? new J(context, attributeSet) : edgeEffect;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void noSession(int i10, String str) {
        if (i10 > 0) {
            str = i10 + ": " + str;
        }
        f65177d = new Reason(i10, str);
        a();
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void okhttp_addInterceptors(Object obj) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.okhttp_addInterceptors(obj);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public FSPage page(final String str) {
        final K k10 = new K(str, null);
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(str, k10);
            }
        });
        return k10;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public FSPage page(final String str, final Map map) {
        final K k10 = new K(str, map);
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda22
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(str, map, k10);
            }
        });
        return k10;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void reactNative_exec_onFsPressForward(final Object obj, final int i10, final boolean z10, final boolean z11, final boolean z12) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(obj, i10, z10, z11, z12);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void reactNative_exec_onFsPressForward_direct(final View view, final boolean z10, final boolean z11, final boolean z12) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(view, z10, z11, z12);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void reactNative_trackNativeViewHierarchyManager(Object obj) {
        C14118br.a(obj);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public boolean reconfigure(final FSRuntimeConfigEditor.Applier applier) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda19
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(applier);
            }
        });
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            return rImpl.reconfigure(applier);
        }
        return false;
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void registerStatusListener(final FSStatusListener fSStatusListener) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda72
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.c(fSStatusListener);
            }
        });
        if (fSStatusListener == null) {
            return;
        }
        ArrayList arrayList = f65176c;
        synchronized (arrayList) {
            if (!arrayList.contains(fSStatusListener)) {
                arrayList.add(fSStatusListener);
            }
        }
        a(fSStatusListener);
        Bootstrap.maybeNotifyListener(fSStatusListener);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void removeAllClasses(final View view) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda37
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.h(view);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.g(view);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void removeAttribute(final View view, final String str) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda44
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.g(view, str);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.f(view, str);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void removeClass(final View view, final String str) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda62
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.c(view, str);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.b(view, str);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void removeClasses(final View view, final Collection collection) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda20
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(view, collection);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(view, collection);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void removePopupMenuClass(final Object obj, final String str) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(obj, str);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(obj, str);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void resetIdleTimer() {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda74
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.e();
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.d();
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void restart() {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda31
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.f();
            }
        });
        Bootstrap.b();
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setAccessibilityDelegate(View view, View.AccessibilityDelegate accessibilityDelegate) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.setAccessibilityDelegate(view, accessibilityDelegate);
        } else {
            view.setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setAttribute(final View view, final String str, final String str2) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda49
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(view, str, str2);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(view, str, str2);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        } else {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setReadyListener(final FSOnReadyListener fSOnReadyListener) {
        Q q10;
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda69
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.a(fSOnReadyListener);
            }
        });
        ArrayList arrayList = f65176c;
        synchronized (arrayList) {
            arrayList.removeIf(new Predicate() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda70
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return InstrumentInjectorBridgeImpl.d((FSStatusListener) obj);
                }
            });
            q10 = null;
            Object[] objArr = 0;
            if (fSOnReadyListener != null) {
                Q q11 = new Q(fSOnReadyListener);
                arrayList.add(q11);
                q10 = q11;
            }
        }
        a((FSStatusListener) q10);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setTagName(final View view, final String str) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda28
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.i(view, str);
            }
        });
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.h(view, str);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setUserVars(final Map map) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda73
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.c(map);
            }
        });
        a((String) null, map);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setWebViewClient(WebView webView, WebViewClient webViewClient) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.setWebViewClient(webView, webViewClient);
        } else {
            webView.setWebViewClient(webViewClient);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void setWindowCallback(Window window, Window.Callback callback) {
        if (Bootstrap.impl() == null) {
            window.setCallback(callback);
        } else {
            aA.a(window, callback);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void shutdown() {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda25
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.g();
            }
        });
        Bootstrap.a();
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void trackWebView(WebView webView) {
        R rImpl = Bootstrap.impl();
        if (rImpl != null) {
            rImpl.trackWebView(webView);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void typefaceCreateDerived(final Typeface typeface, final Typeface typeface2, final int i10) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda66
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(typeface, typeface2, i10);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void typefaceCreateFromAsset(final Typeface typeface, final String str) {
        Bootstrap.a(new Runnable() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                InstrumentInjectorBridgeImpl.a(typeface, str);
            }
        });
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void unmask(final View view) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda32
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.f(view);
            }
        });
        a(view, FS.UNMASK_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void unmaskPopupMenu(final Object obj) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda60
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.f(obj);
            }
        });
        addPopupMenuClassImpl(obj, FS.UNMASK_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void unmaskPopupMenuWithConsent(final Object obj) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda64
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.e(obj);
            }
        });
        addPopupMenuClassImpl(obj, FS.UNMASK_WITH_CONSENT_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void unmaskWithConsent(final View view) {
        fK.b(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda53
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.e(view);
            }
        });
        a(view, FS.UNMASK_WITH_CONSENT_CLASS);
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public void unregisterStatusListener(final FSStatusListener fSStatusListener) {
        fK.a(new Supplier() { // from class: com.fullstory.instrumentation.InstrumentInjectorBridgeImpl$$ExternalSyntheticLambda23
            @Override // java.util.function.Supplier
            public final Object get() {
                return InstrumentInjectorBridgeImpl.b(fSStatusListener);
            }
        });
        ArrayList arrayList = f65176c;
        synchronized (arrayList) {
            arrayList.remove(fSStatusListener);
        }
    }

    @Override // com.fullstory.instrumentation.InstrumentInjectorBridge
    public URLConnection urlconnection_wrapInstance(URLConnection uRLConnection) {
        R rImpl = Bootstrap.impl();
        return rImpl == null ? uRLConnection : rImpl.urlconnection_wrapInstance(uRLConnection);
    }
}
