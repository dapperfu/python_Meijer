package Rc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C8784lf;
import java.util.Locale;

@TargetApi(28)
/* loaded from: classes4.dex */
public class M0 extends I0 {
    @Override // Rc.C5179b
    public final int i(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // Rc.C5179b
    public final void j(final Activity activity) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77287o1)).booleanValue() && Nc.v.s().j().zzj() == null && !activity.isInMultiWindowMode()) {
            n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: Rc.J0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return M0.m(activity, view, windowInsets);
                }
            });
        }
    }

    static final /* synthetic */ WindowInsets m(Activity activity, View view, WindowInsets windowInsets) {
        if (Nc.v.s().j().zzj() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                r0 r0VarJ = Nc.v.s().j();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                r0VarJ.F0(strConcat);
            } else {
                Nc.v.s().j().F0("");
            }
        }
        n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void n(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = 1;
        if (true != z10) {
            i11 = 2;
        }
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }
}
