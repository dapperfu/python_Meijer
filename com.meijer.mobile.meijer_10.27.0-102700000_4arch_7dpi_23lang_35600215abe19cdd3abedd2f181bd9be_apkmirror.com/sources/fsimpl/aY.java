package fsimpl;

import android.graphics.PorterDuff;
import java.lang.reflect.Field;
import java.util.HashSet;

/* loaded from: classes14.dex */
public class aY {

    /* renamed from: b, reason: collision with root package name */
    private static int[] f131558b;

    /* renamed from: a, reason: collision with root package name */
    private static int[] f131557a = new int[PorterDuff.Mode.values().length];

    /* renamed from: c, reason: collision with root package name */
    private static boolean f131559c = false;

    static {
        a();
    }

    public static int a(int i10) {
        if (f131559c && i10 >= 0) {
            int[] iArr = f131558b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
        }
        return 0;
    }

    public static int a(PorterDuff.Mode mode) {
        if (!f131559c) {
            return 0;
        }
        int iOrdinal = mode.ordinal();
        int[] iArr = f131557a;
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
            f131558b = new int[iMax + 1];
            for (Field field : C14045dq.class.getDeclaredFields()) {
                if (field.getType() == Byte.TYPE) {
                    byte b10 = field.getByte(null);
                    String strName = C14045dq.name(b10);
                    if (hashSet.contains(strName)) {
                        PorterDuff.Mode modeValueOf = PorterDuff.Mode.valueOf(strName);
                        int iB = b(modeValueOf);
                        int iOrdinal = modeValueOf.ordinal();
                        f131558b[iB] = b10;
                        f131557a[iOrdinal] = b10;
                        f131559c = true;
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
