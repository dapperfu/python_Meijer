package fsimpl;

import android.graphics.BlendMode;
import android.graphics.Xfermode;
import java.lang.reflect.Field;

/* renamed from: fsimpl.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13975b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f131749a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f131750b;

    static {
        Field fieldA = fT.a(30, C14108fz.f132298h, "mXfermode");
        f131750b = fieldA;
        f131749a = fieldA == null;
    }

    public static Xfermode a(BlendMode blendMode) {
        if (f131749a) {
            return null;
        }
        try {
            return (Xfermode) f131750b.get(blendMode);
        } catch (IllegalAccessException e10) {
            dI.a("Failed to get BlendMode's Xfermode", e10);
            return null;
        }
    }
}
