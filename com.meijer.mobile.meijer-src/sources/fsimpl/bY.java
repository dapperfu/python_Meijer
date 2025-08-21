package fsimpl;

import android.content.res.AssetManager;
import com.fullstory.jni.FSNative;
import com.fullstory.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class bY {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133056a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f133057b;

    static {
        f133057b = FSNative.f65201b ? fT.a(30, AssetManager.class, "getPooledStringForCookie", Integer.TYPE, Integer.TYPE) : null;
        f133056a = f133057b != null;
    }

    public static String a(AssetManager assetManager, long j10) {
        if (f133056a && assetManager != null && j10 != -1) {
            try {
                Object objInvoke = f133057b.invoke(assetManager, Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) (j10 & 65535)));
                if (objInvoke instanceof CharSequence) {
                    return objInvoke.toString();
                }
            } catch (Throwable th2) {
                if (!Log.DISABLE_LOGGING) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }
}
