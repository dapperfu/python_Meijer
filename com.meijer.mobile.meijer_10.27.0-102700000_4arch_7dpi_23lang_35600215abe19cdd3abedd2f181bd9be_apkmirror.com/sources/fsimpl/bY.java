package fsimpl;

import android.content.res.AssetManager;
import com.fullstory.jni.FSNative;
import com.fullstory.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
public class bY {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f131806a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f131807b;

    static {
        f131807b = FSNative.f64361b ? fT.a(30, AssetManager.class, "getPooledStringForCookie", Integer.TYPE, Integer.TYPE) : null;
        f131806a = f131807b != null;
    }

    public static String a(AssetManager assetManager, long j10) {
        if (f131806a && assetManager != null && j10 != -1) {
            try {
                Object objInvoke = f131807b.invoke(assetManager, Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) (j10 & 65535)));
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
