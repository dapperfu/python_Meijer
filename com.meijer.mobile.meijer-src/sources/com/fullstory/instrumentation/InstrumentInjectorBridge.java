package com.fullstory.instrumentation;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EdgeEffect;
import com.fullstory.FS;
import com.fullstory.FSOnReadyListener;
import com.fullstory.FSPage;
import com.fullstory.FSRuntimeConfigEditor;
import com.fullstory.FSStatusListener;
import java.lang.Thread;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface InstrumentInjectorBridge {
    void __endPage(UUID uuid);

    void __pageView(UUID uuid, String str, Map map);

    void __sendInternalMessage(String str, Object obj);

    void __updatePageProperties(UUID uuid, Map map);

    void addClass(View view, String str);

    void addClasses(View view, Collection collection);

    void addPopupMenuClass(Object obj, String str);

    void anonymize();

    void associateDrawable(Drawable drawable, int i10);

    boolean bitmap_isRecycled(Bitmap bitmap);

    void bitmap_recycle(Bitmap bitmap);

    void clearSession();

    void compose_click(Object obj, boolean z10);

    int compose_getGroupSize(Object obj, Object obj2);

    void compose_nodeChanged(Object obj);

    void compose_onSlotsInserted(Object obj, int i10);

    boolean compose_shouldDraw(Object obj, Object obj2, Canvas canvas, Object obj3, boolean z10);

    boolean compose_shouldDrawAndroidView(Object obj, View view, Canvas canvas);

    boolean compose_shouldDrawLayer(Object obj, Object obj2, Canvas canvas, Object obj3, boolean z10);

    boolean compose_shouldObserveReads(Canvas canvas);

    void consent(boolean z10);

    void disableInjection(WebView webView);

    void event(String str, Map map);

    void exclude(View view);

    void excludePopupMenu(Object obj);

    void excludePopupMenuWithoutConsent(Object obj);

    void excludeWithoutConsent(View view);

    void flutterEvent(Map map);

    View.AccessibilityDelegate getAccessibilityDelegate(View view);

    String getCurrentSession();

    String getCurrentSessionURL();

    String getCurrentSessionURL(boolean z10);

    Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler();

    WebViewClient getWebViewClient(WebView webView);

    Window.Callback getWindowCallback(Window window);

    void gotSession();

    void identify(String str);

    void identify(String str, Map map);

    void init(Application application, Context context);

    boolean isFullStoryCanvas(Canvas canvas);

    boolean isPreviewMode(boolean z10);

    boolean isRecordingDispatchDraw(Object obj, Canvas canvas);

    boolean isRecordingDraw(Object obj, Canvas canvas);

    boolean isRecordingDrawChild(Object obj, Canvas canvas, View view, long j10);

    void log(FS.LogLevel logLevel, String str);

    void logcat(FS.LogLevel logLevel, String str, String str2, Throwable th2);

    void mask(View view);

    void maskPopupMenu(Object obj);

    void maskPopupMenuWithoutConsent(Object obj);

    void maskWithoutConsent(View view);

    EdgeEffect maybeWrapEdgeEffect(EdgeEffect edgeEffect, Context context);

    EdgeEffect maybeWrapEdgeEffect(EdgeEffect edgeEffect, Context context, AttributeSet attributeSet);

    void noSession(int i10, String str);

    void okhttp_addInterceptors(Object obj);

    FSPage page(String str);

    FSPage page(String str, Map map);

    void reactNative_exec_onFsPressForward(Object obj, int i10, boolean z10, boolean z11, boolean z12);

    void reactNative_exec_onFsPressForward_direct(View view, boolean z10, boolean z11, boolean z12);

    void reactNative_trackNativeViewHierarchyManager(Object obj);

    boolean reconfigure(FSRuntimeConfigEditor.Applier applier);

    void registerStatusListener(FSStatusListener fSStatusListener);

    void removeAllClasses(View view);

    void removeAttribute(View view, String str);

    void removeClass(View view, String str);

    void removeClasses(View view, Collection collection);

    void removePopupMenuClass(Object obj, String str);

    void resetIdleTimer();

    void restart();

    void setAccessibilityDelegate(View view, View.AccessibilityDelegate accessibilityDelegate);

    void setAttribute(View view, String str, String str2);

    void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    void setReadyListener(FSOnReadyListener fSOnReadyListener);

    void setTagName(View view, String str);

    void setUserVars(Map map);

    void setWebViewClient(WebView webView, WebViewClient webViewClient);

    void setWindowCallback(Window window, Window.Callback callback);

    void shutdown();

    void trackWebView(WebView webView);

    void typefaceCreateDerived(Typeface typeface, Typeface typeface2, int i10);

    void typefaceCreateFromAsset(Typeface typeface, String str);

    void unmask(View view);

    void unmaskPopupMenu(Object obj);

    void unmaskPopupMenuWithConsent(Object obj);

    void unmaskWithConsent(View view);

    void unregisterStatusListener(FSStatusListener fSStatusListener);

    URLConnection urlconnection_wrapInstance(URLConnection uRLConnection);
}
