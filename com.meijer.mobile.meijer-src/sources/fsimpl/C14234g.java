package fsimpl;

import android.graphics.text.MeasuredText;
import java.lang.reflect.Field;

/* renamed from: fsimpl.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14234g {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f133556a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f133557b;

    static {
        Field fieldA = fT.a(30, C14233fz.f133549i, "mChars");
        f133557b = fieldA;
        f133556a = fieldA == null;
    }

    public static char[] a(MeasuredText measuredText) {
        if (f133556a) {
            return null;
        }
        try {
            return (char[]) f133557b.get(measuredText);
        } catch (IllegalAccessException e10) {
            dI.a("Failed to get MeasuredText's chars", e10);
            return null;
        }
    }
}
