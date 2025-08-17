package fsimpl;

import android.graphics.text.MeasuredText;
import java.lang.reflect.Field;

/* renamed from: fsimpl.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14109g {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f132306a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f132307b;

    static {
        Field fieldA = fT.a(30, C14108fz.f132299i, "mChars");
        f132307b = fieldA;
        f132306a = fieldA == null;
    }

    public static char[] a(MeasuredText measuredText) {
        if (f132306a) {
            return null;
        }
        try {
            return (char[]) f132307b.get(measuredText);
        } catch (IllegalAccessException e10) {
            dI.a("Failed to get MeasuredText's chars", e10);
            return null;
        }
    }
}
