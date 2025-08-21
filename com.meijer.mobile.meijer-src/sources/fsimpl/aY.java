package fsimpl;

import android.graphics.PorterDuff;
import java.lang.reflect.Field;
import java.util.HashSet;

/* loaded from: classes15.dex */
public class aY {

    /* renamed from: b, reason: collision with root package name */
    private static int[] f132808b;

    /* renamed from: a, reason: collision with root package name */
    private static int[] f132807a = new int[PorterDuff.Mode.values().length];

    /* renamed from: c, reason: collision with root package name */
    private static boolean f132809c = false;

    static {
        a();
    }

    public static int a(int i10) {
        if (f132809c && i10 >= 0) {
            int[] iArr = f132808b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
        }
        return 0;
    }

    public static int a(PorterDuff.Mode mode) {
        if (!f132809c) {
            return 0;
        }
        int iOrdinal = mode.ordinal();
        int[] iArr = f132807a;
        if (iOrdinal >= iArr.length) {
            return 0;
        }
        return iArr[iOrdinal];
    }

    private static void a() {
        try {
            HashSet hashSet = new HashSet();
            int iMax = 0;
            for (PorterDuff.Mode mode : PorterDuff.Mode.values()) {
                iMax = Math.max(b(mode), iMax);
                hashSet.add(mode.name());
            }
            f132808b = new int[iMax + 1];
            for (Field field : C14170dq.class.getDeclaredFields()) {
                if (field.getType() == Byte.TYPE) {
                    byte b10 = field.getByte(null);
                    String strName = C14170dq.name(b10);
                    if (hashSet.contains(strName)) {
                        PorterDuff.Mode modeValueOf = PorterDuff.Mode.valueOf(strName);
                        int iB = b(modeValueOf);
                        int iOrdinal = modeValueOf.ordinal();
                        f132808b[iB] = b10;
                        f132807a[iOrdinal] = b10;
                        f132809c = true;
                    }
                }
            }
        } catch (Throwable th2) {
            dI.a("Failed to get nativeInt field mappings", th2);
        }
    }

    private static int b(PorterDuff.Mode mode) {
        return mode.nativeInt;
    }
}
