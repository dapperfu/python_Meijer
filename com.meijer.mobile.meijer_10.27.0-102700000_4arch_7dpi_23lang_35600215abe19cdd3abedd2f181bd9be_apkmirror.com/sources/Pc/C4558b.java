package Pc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C10184zt;
import com.google.android.gms.internal.ads.C7392Zc;
import com.google.android.gms.internal.ads.EnumC6756Ge;
import com.google.android.gms.internal.ads.GS;
import com.google.android.gms.internal.ads.InterfaceC9008ot;
import java.io.InputStream;
import java.util.Map;

/* renamed from: Pc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4558b {
    public CookieManager a(Context context) {
        throw null;
    }

    public WebResourceResponse b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public C10184zt c(InterfaceC9008ot interfaceC9008ot, C7392Zc c7392Zc, boolean z10, GS gs2) {
        throw null;
    }

    public boolean d(Activity activity, Configuration configuration) {
        throw null;
    }

    public void g(Context context, String str, String str2) {
    }

    public boolean h(Context context, String str) {
        return false;
    }

    public int i(AudioManager audioManager) {
        return 0;
    }

    public void j(Activity activity) {
    }

    public Intent e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public EnumC6756Ge f(Context context, TelephonyManager telephonyManager) {
        return EnumC6756Ge.ENUM_UNKNOWN;
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    /* synthetic */ C4558b(O0 o02) {
    }
}
