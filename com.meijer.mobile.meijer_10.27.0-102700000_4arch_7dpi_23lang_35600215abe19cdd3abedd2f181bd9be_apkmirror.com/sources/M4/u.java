package M4;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public class u {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final y f19001a = new y(u.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final w f19002a = u.a();
    }

    private static InvocationHandler b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static y c() {
        return a.f19001a;
    }

    public static w d() {
        return b.f19002a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? g.a() : f().getClass().getClassLoader();
    }

    private static Object f() throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    static w a() {
        try {
            return new x((WebViewProviderFactoryBoundaryInterface) mw.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new k();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
