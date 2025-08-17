package fsimpl;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ProgressBar;
import com.fullstory.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fsimpl.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC14114l extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f132356a;

    /* renamed from: b, reason: collision with root package name */
    static final Method f132357b;

    /* renamed from: c, reason: collision with root package name */
    static final Field f132358c;

    static {
        boolean z10 = Build.VERSION.SDK_INT < 26;
        f132356a = z10;
        if (z10) {
            f132357b = null;
            f132358c = fT.a(28, -1, ProgressBar.class, "mMirrorForRtl");
        } else {
            f132357b = fT.a(28, 30, ProgressBar.class, "getMirrorForRtl", new Class[0]);
            f132358c = null;
        }
    }

    public static Drawable a(ProgressBar progressBar) {
        return progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
    }

    public static boolean b(ProgressBar progressBar) {
        try {
            if (f132356a) {
                Field field = f132358c;
                if (field != null) {
                    return ((Boolean) field.get(progressBar)).booleanValue();
                }
                return true;
            }
            Method method = f132357b;
            if (method != null) {
                return ((Boolean) method.invoke(progressBar, new Object[0])).booleanValue();
            }
            return true;
        } catch (Throwable th2) {
            Log.e(f132356a ? "Could not get the value of mMirrorForRtl on given ProgressBar" : "Could not invoke getMirrorForRtl on given ProgressBar", th2);
            return true;
        }
    }
}
