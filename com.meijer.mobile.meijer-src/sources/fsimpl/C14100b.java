package fsimpl;

import android.graphics.BlendMode;
import android.graphics.Xfermode;
import java.lang.reflect.Field;

/* renamed from: fsimpl.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14100b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f132999a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f133000b;

    static {
        Field fieldA = fT.a(30, C14233fz.f133548h, "mXfermode");
        f133000b = fieldA;
        f132999a = fieldA == null;
    }

    public static Xfermode a(BlendMode blendMode) {
        if (f132999a) {
            return null;
        }
        try {
            return (Xfermode) f133000b.get(blendMode);
        } catch (IllegalAccessException e10) {
            dI.a("Failed to get BlendMode's Xfermode", e10);
            return null;
        }
    }
}
