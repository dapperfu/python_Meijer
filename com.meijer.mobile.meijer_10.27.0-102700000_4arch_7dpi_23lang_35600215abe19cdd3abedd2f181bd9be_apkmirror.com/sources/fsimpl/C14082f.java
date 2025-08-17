package fsimpl;

import android.graphics.Typeface;
import android.os.Build;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14082f {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f132200a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f132201b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f132202c = false;

    static {
        boolean z10 = false;
        Field fieldA = fT.a(28, 30, Typeface.class, "native_instance");
        f132201b = fieldA;
        if (fieldA != null && fieldA.getType() == Long.TYPE) {
            z10 = true;
        }
        f132200a = z10;
    }

    public static long a(Typeface typeface) {
        if (f132200a && !f132202c) {
            try {
                Object obj = f132201b.get(typeface);
                if (obj instanceof Long) {
                    return ((Long) obj).longValue();
                }
            } catch (Throwable th2) {
                Log.e("Unexpected error getting native_instance value on typeface", th2);
                C14107fy.a(th2);
            }
            f132202c = true;
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
