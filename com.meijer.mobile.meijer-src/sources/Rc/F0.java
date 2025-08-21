package Rc;

import Oc.C4447y;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C8784lf;

@TargetApi(24)
/* loaded from: classes4.dex */
public class F0 extends E0 {
    static final boolean l(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // Rc.C5179b
    public final boolean d(Activity activity, Configuration configuration) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76969R4)).booleanValue()) {
            return false;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76997T4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C4447y.b();
        int iZ = Sc.g.z(activity, configuration.screenHeightDp);
        int iZ2 = Sc.g.z(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        Nc.v.t();
        DisplayMetrics displayMetricsZ = D0.Z(windowManager);
        int i10 = displayMetricsZ.heightPixels;
        int i11 = displayMetricsZ.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) Oc.A.c().a(C8784lf.f76941P4)).intValue();
        return (l(i10, iZ + dimensionPixelSize, iRound) && l(i11, iZ2, iRound)) ? false : true;
    }
}
