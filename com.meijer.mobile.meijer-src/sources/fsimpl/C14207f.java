package fsimpl;

import android.graphics.Typeface;
import android.os.Build;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14207f {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133450a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f133451b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f133452c = false;

    static {
        boolean z10 = false;
        Field fieldA = fT.a(28, 30, Typeface.class, "native_instance");
        f133451b = fieldA;
        if (fieldA != null && fieldA.getType() == Long.TYPE) {
            z10 = true;
        }
        f133450a = z10;
    }

    public static long a(Typeface typeface) {
        if (f133450a && !f133452c) {
            try {
                Object obj = f133451b.get(typeface);
                if (obj instanceof Long) {
                    return ((Long) obj).longValue();
                }
            } catch (Throwable th2) {
                Log.e("Unexpected error getting native_instance value on typeface", th2);
                C14232fy.a(th2);
            }
            f133452c = true;
        }
        return -1L;
    }

    public static int b(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 28) {
            return typeface.getWeight();
        }
        return -1;
    }
}
