package L4;

import M4.a;
import M4.g;
import M4.t;
import M4.u;
import M4.v;
import M4.w;
import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f17875a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f17876b = Uri.parse("");

    /* renamed from: c, reason: collision with root package name */
    private static boolean f17877c = true;

    /* renamed from: d, reason: collision with root package name */
    private static final WeakHashMap<WebView, v> f17878d = new WeakHashMap<>();

    public interface a {
        void onPostMessage(WebView webView, b bVar, Uri uri, boolean z10, L4.a aVar);
    }

    public static void a(WebView webView, String str, Set<String> set, a aVar) {
        if (!t.f18948V.d()) {
            throw t.a();
        }
        g(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static void b(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper looperB = g.b(webView);
        if (looperB == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperB + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static PackageInfo d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return M4.d.a();
        }
        try {
            return f();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo f() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static v g(WebView webView) {
        if (!t.f18990s0.d() || !f17877c) {
            return new v(c(webView));
        }
        WeakHashMap<WebView, v> weakHashMap = f17878d;
        v vVar = weakHashMap.get(webView);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(c(webView));
        weakHashMap.put(webView, vVar2);
        return vVar2;
    }

    public static WebViewClient h(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a.e eVar = t.f18934H;
        if (eVar.c()) {
            return M4.d.b(webView);
        }
        if (!eVar.d()) {
            throw t.a();
        }
        b(webView);
        return g(webView).b();
    }

    public static boolean i() {
        if (t.f18945S.d()) {
            return e().getStatics().isMultiProcessEnabled();
        }
        throw t.a();
    }

    public static void j(WebView webView, String str) {
        if (!t.f18948V.d()) {
            throw t.a();
        }
        g(webView).c(str);
    }

    public static void k(WebView webView, boolean z10) {
        if (!t.f18966g0.d()) {
            throw t.a();
        }
        g(webView).d(z10);
    }

    private static WebViewProviderBoundaryInterface c(WebView webView) {
        return e().createWebView(webView);
    }

    private static w e() {
        return u.d();
    }
}
