package com.fullstory;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
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
import android.widget.ImageView;
import com.fullstory.FSRuntimeConfigEditor;
import com.fullstory.instrumentation.InstrumentInjectorBridge;
import com.fullstory.util.Log;
import fsstub.a;
import fsstub.b;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class FS {
    public static final String EXCLUDE_CLASS = "fs-exclude";
    public static final String EXCLUDE_WITHOUT_CONSENT_CLASS = "fs-exclude-without-consent";
    public static final String MASK_CLASS = "fs-mask";
    public static final String MASK_WITHOUT_CONSENT_CLASS = "fs-mask-without-consent";
    public static final String OMIT_CLASS = "fs-omit";
    public static final String OMIT_WITHOUT_CONSENT_CLASS = "fs-omit-without-consent";
    public static final String UNMASK_CLASS = "fs-unmask";
    public static final String UNMASK_WITH_CONSENT_CLASS = "fs-unmask-with-consent";
    public static final String WATCH_CLASS = "fs-watch";
    public static final String WATCH_WITH_CONSENT_CLASS = "fs-watch-with-consent";

    /* renamed from: a, reason: collision with root package name */
    private static final InstrumentInjectorBridge f64327a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f64328b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f64329c;

    public enum LogLevel {
        OFF,
        LOG,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    static {
        boolean z10 = Build.VERSION.SDK_INT >= 18;
        f64329c = z10;
        f64327a = b.a();
        Field declaredField = null;
        if (!z10) {
            try {
                declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                declaredField.setAccessible(true);
            } catch (Throwable th2) {
            }
        }
        f64328b = declaredField;
    }

    private FS() {
    }

    public static Drawable Resources_getDrawable(Context context, int i10) {
        Drawable drawable = context.getDrawable(i10);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.associateDrawable(drawable, i10);
        }
        return drawable;
    }

    public static Drawable Resources_getDrawable(Resources resources, int i10) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i10);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.associateDrawable(drawable, i10);
        }
        return drawable;
    }

    public static Drawable Resources_getDrawable(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i10, theme);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.associateDrawable(drawable, i10);
        }
        return drawable;
    }

    public static Drawable Resources_getDrawableForDensity(Resources resources, int i10, int i11) throws Resources.NotFoundException {
        Drawable drawableForDensity = resources.getDrawableForDensity(i10, i11);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.associateDrawable(drawableForDensity, i10);
        }
        return drawableForDensity;
    }

    public static Drawable Resources_getDrawableForDensity(Resources resources, int i10, int i11, Resources.Theme theme) {
        Drawable drawableForDensity = resources.getDrawableForDensity(i10, i11, theme);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.associateDrawable(drawableForDensity, i10);
        }
        return drawableForDensity;
    }

    public static void Resources_setImageResource(ImageView imageView, int i10) {
        imageView.setImageResource(i10);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.associateDrawable(imageView.getDrawable(), i10);
        }
    }

    public static void __clearSession() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.clearSession();
        }
    }

    public static void __endPage(UUID uuid) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.__endPage(uuid);
        }
    }

    static void __flutterEvent(Map map) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.flutterEvent(map);
        }
    }

    public static void __gotSession() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.gotSession();
        }
    }

    public static void __internal(String str, Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.__sendInternalMessage(str, obj);
        }
    }

    public static boolean __isPreviewMode() {
        return __isPreviewMode(false);
    }

    public static boolean __isPreviewMode(boolean z10) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.isPreviewMode(z10);
        }
        return false;
    }

    public static void __noSession(int i10, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.noSession(i10, str);
        }
    }

    public static void __pageView(UUID uuid, String str, Map map) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.__pageView(uuid, str, map);
        }
    }

    public static boolean __reconfigure(FSRuntimeConfigEditor.Applier applier) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.reconfigure(applier);
        }
        return false;
    }

    public static void __updatePageProperties(UUID uuid, Map map) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.__updatePageProperties(uuid, map);
        }
    }

    private static int a(int i10, LogLevel logLevel, String str, String str2, Throwable th2) {
        InstrumentInjectorBridge instrumentInjectorBridge;
        if (i10 > 0 && (instrumentInjectorBridge = f64327a) != null) {
            instrumentInjectorBridge.logcat(logLevel, str, str2, th2);
        }
        return i10;
    }

    private static View.AccessibilityDelegate a(View view) {
        if (f64329c) {
            return view.getAccessibilityDelegate();
        }
        Field field = f64328b;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable th2) {
            return null;
        }
    }

    public static void addClass(View view, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.addClass(view, str);
        }
    }

    public static void addClasses(View view, Collection collection) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.addClasses(view, collection);
        }
    }

    public static void addPopupMenuClass(Object obj, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.addPopupMenuClass(obj, str);
        }
    }

    public static void anonymize() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.anonymize();
        }
    }

    public static boolean bitmap_isRecycled(Bitmap bitmap) {
        InstrumentInjectorBridge instrumentInjectorBridge;
        return (bitmap == null || (instrumentInjectorBridge = f64327a) == null) ? bitmap.isRecycled() : instrumentInjectorBridge.bitmap_isRecycled(bitmap);
    }

    public static void bitmap_recycle(Bitmap bitmap) {
        InstrumentInjectorBridge instrumentInjectorBridge;
        if (bitmap == null || (instrumentInjectorBridge = f64327a) == null) {
            bitmap.recycle();
        } else {
            instrumentInjectorBridge.bitmap_recycle(bitmap);
        }
    }

    public static void compose_click(Object obj, boolean z10) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.compose_click(obj, z10);
        }
    }

    public static int compose_getGroupSize(Object obj, Object obj2) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.compose_getGroupSize(obj, obj2);
        }
        return 0;
    }

    public static void compose_nodeChanged(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.compose_nodeChanged(obj);
        }
    }

    public static void compose_onSlotsInserted(Object obj, int i10) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.compose_onSlotsInserted(obj, i10);
        }
    }

    public static boolean compose_shouldDraw(Object obj, Object obj2, Canvas canvas) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.compose_shouldDraw(obj, obj2, canvas, null, false);
        }
        return true;
    }

    public static boolean compose_shouldDraw(Object obj, Object obj2, Canvas canvas, Object obj3) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.compose_shouldDraw(obj, obj2, canvas, obj3, true);
        }
        return true;
    }

    public static boolean compose_shouldDrawAndroidView(Object obj, View view, Canvas canvas) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.compose_shouldDrawAndroidView(obj, view, canvas);
        }
        return true;
    }

    public static boolean compose_shouldDrawLayer(Object obj, Object obj2, Canvas canvas) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.compose_shouldDrawLayer(obj, obj2, canvas, null, false);
        }
        return true;
    }

    public static boolean compose_shouldDrawLayer(Object obj, Object obj2, Canvas canvas, Object obj3) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.compose_shouldDrawLayer(obj, obj2, canvas, obj3, true);
        }
        return true;
    }

    public static boolean compose_shouldObserveReads(Canvas canvas) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.compose_shouldObserveReads(canvas);
        }
        return true;
    }

    public static void consent(boolean z10) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.consent(z10);
        }
    }

    public static void disableInjection(WebView webView) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.disableInjection(webView);
        }
    }

    public static void event(String str, Map map) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.event(str, map);
        }
    }

    public static void exclude(View view) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.exclude(view);
        }
    }

    public static void excludePopupMenu(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.excludePopupMenu(obj);
        }
    }

    public static void excludePopupMenuWithoutConsent(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.excludePopupMenuWithoutConsent(obj);
        }
    }

    public static void excludeWithoutConsent(View view) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.excludeWithoutConsent(view);
        }
    }

    public static String fsVersion() {
        return "1.62.0";
    }

    public static View.AccessibilityDelegate getAccessibilityDelegate(Object obj) {
        if (obj == null) {
            return a((View) obj);
        }
        if (obj instanceof View) {
            View view = (View) obj;
            InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
            return instrumentInjectorBridge != null ? instrumentInjectorBridge.getAccessibilityDelegate(view) : a(view);
        }
        Class<?> cls = obj.getClass();
        Log.i("Calling non-View getAccessibilityDelegate method via reflection on " + cls.getName());
        try {
            Method method = cls.getMethod("getAccessibilityDelegate", new Class[0]);
            method.setAccessible(true);
            return (View.AccessibilityDelegate) method.invoke(obj, new Object[0]);
        } catch (Throwable th2) {
            Log.e("Unable to invoke getAccessibilityDelegate via reflection", th2);
            return null;
        }
    }

    public static String getCurrentSession() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.getCurrentSession();
        }
        return null;
    }

    public static String getCurrentSessionURL() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.getCurrentSessionURL();
        }
        return null;
    }

    public static String getCurrentSessionURL(boolean z10) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.getCurrentSessionURL(z10);
        }
        return null;
    }

    public static Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        return instrumentInjectorBridge != null ? instrumentInjectorBridge.getDefaultUncaughtExceptionHandler() : Thread.getDefaultUncaughtExceptionHandler();
    }

    public static WebViewClient getWebViewClient(WebView webView) {
        InstrumentInjectorBridge instrumentInjectorBridge;
        if (Build.VERSION.SDK_INT >= 26 && (instrumentInjectorBridge = f64327a) != null) {
            return instrumentInjectorBridge.getWebViewClient(webView);
        }
        return webView.getWebViewClient();
    }

    public static void identify(String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.identify(str);
        }
    }

    public static void identify(String str, Map map) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.identify(str, map);
        }
    }

    public static void init(Application application, Context context) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.init(application, context);
        }
    }

    public static boolean isFullStoryCanvas(Canvas canvas) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.isFullStoryCanvas(canvas);
        }
        return false;
    }

    public static boolean isRecordingDispatchDraw(Object obj, Canvas canvas) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.isRecordingDispatchDraw(obj, canvas);
        }
        return false;
    }

    public static boolean isRecordingDraw(Object obj, Canvas canvas) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.isRecordingDraw(obj, canvas);
        }
        return false;
    }

    public static boolean isRecordingDrawChild(Object obj, Canvas canvas, View view, long j10) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            return instrumentInjectorBridge.isRecordingDrawChild(obj, canvas, view, j10);
        }
        return false;
    }

    public static void log(LogLevel logLevel, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.log(logLevel, str);
        }
    }

    public static int log_d(String str, String str2) {
        return a(android.util.Log.d(str, str2), LogLevel.DEBUG, str, str2, null);
    }

    public static int log_d(String str, String str2, Throwable th2) {
        return a(android.util.Log.d(str, str2, th2), LogLevel.DEBUG, str, str2, th2);
    }

    public static int log_e(String str, String str2) {
        return a(android.util.Log.e(str, str2), LogLevel.ERROR, str, str2, null);
    }

    public static int log_e(String str, String str2, Throwable th2) {
        return a(android.util.Log.e(str, str2, th2), LogLevel.ERROR, str, str2, th2);
    }

    public static int log_i(String str, String str2) {
        return a(android.util.Log.i(str, str2), LogLevel.INFO, str, str2, null);
    }

    public static int log_i(String str, String str2, Throwable th2) {
        return a(android.util.Log.i(str, str2, th2), LogLevel.INFO, str, str2, th2);
    }

    public static int log_v(String str, String str2) {
        return a(android.util.Log.v(str, str2), LogLevel.LOG, str, str2, null);
    }

    public static int log_v(String str, String str2, Throwable th2) {
        return a(android.util.Log.v(str, str2, th2), LogLevel.LOG, str, str2, th2);
    }

    public static int log_w(String str, String str2) {
        return a(android.util.Log.w(str, str2), LogLevel.WARN, str, str2, null);
    }

    public static int log_w(String str, String str2, Throwable th2) {
        return a(android.util.Log.w(str, str2, th2), LogLevel.WARN, str, str2, th2);
    }

    public static int log_w(String str, Throwable th2) {
        return a(android.util.Log.w(str, null, th2), LogLevel.WARN, str, null, th2);
    }

    public static void mask(View view) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.mask(view);
        }
    }

    public static void maskPopupMenu(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.maskPopupMenu(obj);
        }
    }

    public static void maskPopupMenuWithoutConsent(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.maskPopupMenuWithoutConsent(obj);
        }
    }

    public static void maskWithoutConsent(View view) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.maskWithoutConsent(view);
        }
    }

    public static EdgeEffect maybeWrapEdgeEffect(EdgeEffect edgeEffect, Context context) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        return instrumentInjectorBridge != null ? instrumentInjectorBridge.maybeWrapEdgeEffect(edgeEffect, context) : edgeEffect;
    }

    public static EdgeEffect maybeWrapEdgeEffect(EdgeEffect edgeEffect, Context context, AttributeSet attributeSet) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        return instrumentInjectorBridge != null ? instrumentInjectorBridge.maybeWrapEdgeEffect(edgeEffect, context, attributeSet) : edgeEffect;
    }

    public static void okhttp_addInterceptors(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.okhttp_addInterceptors(obj);
        }
    }

    public static FSPage page(String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        return instrumentInjectorBridge != null ? instrumentInjectorBridge.page(str) : new a();
    }

    public static FSPage page(String str, Map map) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        return instrumentInjectorBridge != null ? instrumentInjectorBridge.page(str, map) : new a();
    }

    public static void reactNative_exec_onFsPressForward(Object obj, int i10, boolean z10, boolean z11, boolean z12) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.reactNative_exec_onFsPressForward(obj, i10, z10, z11, z12);
        }
    }

    public static void reactNative_exec_onFsPressForward_direct(View view, boolean z10, boolean z11, boolean z12) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.reactNative_exec_onFsPressForward_direct(view, z10, z11, z12);
        }
    }

    public static void reactNative_trackNativeViewHierarchyManager(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.reactNative_trackNativeViewHierarchyManager(obj);
        }
    }

    public static void registerStatusListener(FSStatusListener fSStatusListener) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.registerStatusListener(fSStatusListener);
        } else if (b.f132389a) {
            fSStatusListener.onFSError(b.f132390b);
        } else {
            fSStatusListener.onFSDisabled(b.f132390b);
        }
    }

    public static void removeAllClasses(View view) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.removeAllClasses(view);
        }
    }

    public static void removeAttribute(View view, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.removeAttribute(view, str);
        }
    }

    public static void removeClass(View view, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.removeClass(view, str);
        }
    }

    public static void removeClasses(View view, Collection collection) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.removeClasses(view, collection);
        }
    }

    public static void removePopupMenuClass(Object obj, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.removePopupMenuClass(obj, str);
        }
    }

    public static void resetIdleTimer() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.resetIdleTimer();
        }
    }

    public static void restart() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.restart();
        }
    }

    public static void setAccessibilityDelegate(Object obj, View.AccessibilityDelegate accessibilityDelegate) {
        if (obj == null) {
            ((View) obj).setAccessibilityDelegate(accessibilityDelegate);
            return;
        }
        if (obj instanceof View) {
            View view = (View) obj;
            InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
            if (instrumentInjectorBridge != null) {
                instrumentInjectorBridge.setAccessibilityDelegate(view, accessibilityDelegate);
                return;
            } else {
                view.setAccessibilityDelegate(accessibilityDelegate);
                return;
            }
        }
        Class<?> cls = obj.getClass();
        Log.i("Calling non-View setAccessibilityDelegate method via reflection on " + cls.getName());
        try {
            Method method = cls.getMethod("setAccessibilityDelegate", View.AccessibilityDelegate.class);
            method.setAccessible(true);
            method.invoke(obj, accessibilityDelegate);
        } catch (Throwable th2) {
            Log.e("Unable to invoke setAccessibilityDelegate via reflection", th2);
        }
    }

    public static void setAttribute(View view, String str, String str2) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.setAttribute(view, str, str2);
        }
    }

    public static void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        } else {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public static void setReadyListener(FSOnReadyListener fSOnReadyListener) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.setReadyListener(fSOnReadyListener);
        }
    }

    public static void setTagName(View view, String str) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.setTagName(view, str);
        }
    }

    public static void setUserVars(Map map) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.setUserVars(map);
        }
    }

    public static void setWebViewClient(WebView webView, WebViewClient webViewClient) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.setWebViewClient(webView, webViewClient);
        } else {
            webView.setWebViewClient(webViewClient);
        }
    }

    public static void shutdown() {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.shutdown();
        }
    }

    public static void trackWebView(WebView webView) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.trackWebView(webView);
        }
    }

    public static void trackWindow(Window window) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.trackWindow(window);
        }
    }

    public static Typeface typefaceCreateDerived(Typeface typeface, int i10) {
        Typeface typefaceCreate = Typeface.create(typeface, i10);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.typefaceCreateDerived(typeface, typefaceCreate, i10);
        }
        return typefaceCreate;
    }

    public static Typeface typefaceCreateFromAsset(AssetManager assetManager, String str) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, str);
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.typefaceCreateFromAsset(typefaceCreateFromAsset, str);
        }
        return typefaceCreateFromAsset;
    }

    public static void unmask(View view) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.unmask(view);
        }
    }

    public static void unmaskPopupMenu(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.unmaskPopupMenu(obj);
        }
    }

    public static void unmaskPopupMenuWithConsent(Object obj) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.unmaskPopupMenuWithConsent(obj);
        }
    }

    public static void unmaskWithConsent(View view) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.unmaskWithConsent(view);
        }
    }

    public static void unregisterStatusListener(FSStatusListener fSStatusListener) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        if (instrumentInjectorBridge != null) {
            instrumentInjectorBridge.unregisterStatusListener(fSStatusListener);
        }
    }

    public static URLConnection urlconnection_wrapInstance(URLConnection uRLConnection) {
        InstrumentInjectorBridge instrumentInjectorBridge = f64327a;
        return instrumentInjectorBridge != null ? instrumentInjectorBridge.urlconnection_wrapInstance(uRLConnection) : uRLConnection;
    }
}
