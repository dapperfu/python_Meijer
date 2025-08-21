package fsimpl;

import android.os.Build;
import android.view.View;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC14236i extends View {

    /* renamed from: a, reason: collision with root package name */
    static final Field f133602a = fT.a(View.class, "mAccessibilityDelegate");

    public static View.AccessibilityDelegate a(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : b(view);
    }

    public static void a(View view, View.AccessibilityDelegate accessibilityDelegate) throws IllegalAccessException, IllegalArgumentException {
        Field field = f133602a;
        if (field == null) {
            return;
        }
        try {
            field.set(view, accessibilityDelegate);
        } catch (IllegalAccessException e10) {
            Log.e("Unable to set the value of mAccessibilityDelegate", e10);
        }
    }

    private static View.AccessibilityDelegate b(View view) throws IllegalAccessException, IllegalArgumentException {
        Field field = f133602a;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
        } catch (IllegalAccessException e10) {
            Log.e("Unable to get the value of mAccessibilityDelegate", e10);
        }
        return null;
    }
}
