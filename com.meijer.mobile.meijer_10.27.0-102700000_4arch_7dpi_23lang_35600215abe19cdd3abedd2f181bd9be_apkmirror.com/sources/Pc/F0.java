package Pc;

import Mc.C4169y;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C8659lf;

@TargetApi(24)
/* loaded from: classes4.dex */
public class F0 extends E0 {
    static final boolean l(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // Pc.C4558b
    public final boolean d(Activity activity, Configuration configuration) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76129R4)).booleanValue()) {
            return false;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76157T4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C4169y.b();
        int iZ = Qc.g.z(activity, configuration.screenHeightDp);
        int iZ2 = Qc.g.z(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        Lc.v.t();
        DisplayMetrics displayMetricsZ = D0.Z(windowManager);
        int i10 = displayMetricsZ.heightPixels;
        int i11 = displayMetricsZ.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) Mc.A.c().a(C8659lf.f76101P4)).intValue();
        return (l(i10, iZ + dimensionPixelSize, iRound) && l(i11, iZ2, iRound)) ? false : true;
    }
}
