package fsimpl;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.InputStream;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class eX {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f133365a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f133366b;

    static {
        Method methodA = (Build.VERSION.SDK_INT < 28 || Build.VERSION.SDK_INT > 29) ? null : fT.a(-1, AssetManager.AssetInputStream.class, "getNativeAsset", new Class[0]);
        f133365a = methodA;
        f133366b = methodA != null;
    }

    public static Long a(InputStream inputStream) {
        if (f133366b && (inputStream instanceof AssetManager.AssetInputStream)) {
            try {
                Long l10 = (Long) f133365a.invoke(inputStream, new Object[0]);
                if (l10 instanceof Long) {
                    return l10;
                }
            } catch (Throwable th2) {
            }
        }
        return null;
    }
}
