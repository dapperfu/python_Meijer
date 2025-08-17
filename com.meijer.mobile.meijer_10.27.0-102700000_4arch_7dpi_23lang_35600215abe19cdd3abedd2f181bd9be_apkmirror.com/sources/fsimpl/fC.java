package fsimpl;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes14.dex */
public class fC {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f132206a;

    public static DisplayMetrics a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        f132206a.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static synchronized void a(WindowManager windowManager) {
        f132206a = windowManager;
    }
}
