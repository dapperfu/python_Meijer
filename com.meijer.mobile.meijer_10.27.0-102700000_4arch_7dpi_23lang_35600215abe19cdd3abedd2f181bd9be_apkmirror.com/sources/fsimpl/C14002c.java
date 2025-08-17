package fsimpl;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import com.fullstory.instrumentation.CurrentPlatform;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14002c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f131892a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f131893b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f131894c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f131895d;

    static {
        String str;
        boolean z10 = false;
        f131893b = false;
        if (CurrentPlatform.SDK_INT_FIXED < 26) {
            Field fieldA = fT.a(PorterDuffXfermode.class, "mode");
            f131894c = fieldA;
            if (fieldA == null) {
                str = "Failed to locate PorterDuffXfermode native field 'mode'";
                Log.e(str);
                z10 = true;
            }
        } else if (CurrentPlatform.SDK_INT_FIXED < 35) {
            Field fieldA2 = fT.a(-1, 31, Xfermode.class, "porterDuffMode");
            f131895d = fieldA2;
            if (fieldA2 == null) {
                str = "Failed to locate Xfermode native field 'porterDuffMode'";
                Log.e(str);
                z10 = true;
            }
        } else {
            if (CurrentPlatform.SDK_INT_FIXED == 35) {
                f131895d = fT.a(-1, 31, Xfermode.class, "porterDuffMode");
            }
            if (f131895d == null) {
                f131893b = true;
                Field fieldA3 = fT.a(30, 30, PorterDuffXfermode.class, "porterDuffMode");
                f131895d = fieldA3;
                if (fieldA3 == null) {
                    str = "Failed to locate PorterDuffXfermode native field 'porterDuffMode'";
                    Log.e(str);
                    z10 = true;
                }
            }
        }
        f131892a = z10;
    }

    public static boolean a(Xfermode xfermode) {
        if (f131892a) {
            return false;
        }
        if (f131893b) {
            return f131895d != null && (xfermode instanceof PorterDuffXfermode);
        }
        return true;
    }

    public static int b(Xfermode xfermode) throws IllegalAccessException {
        if (f131892a) {
            throw new IllegalAccessException("mode");
        }
        return d(xfermode);
    }

    public static int c(Xfermode xfermode) {
        if (f131892a) {
            return 0;
        }
        try {
            return d(xfermode);
        } catch (Throwable th2) {
            dI.a("Failed to get Xfermode int value", th2);
            return 0;
        }
    }

    private static int d(Xfermode xfermode) throws IllegalAccessException {
        if (!f131893b) {
            Field field = f131894c;
            return (field == null || !(xfermode instanceof PorterDuffXfermode)) ? aY.a(((Integer) f131895d.get(xfermode)).intValue()) : aY.a((PorterDuff.Mode) field.get(xfermode));
        }
        Field field2 = f131895d;
        if (field2 == null || !(xfermode instanceof PorterDuffXfermode)) {
            throw new IllegalAccessException("porterDuffMode");
        }
        return aY.a(((Integer) field2.get(xfermode)).intValue());
    }
}
