package Rc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C10309zt;
import com.google.android.gms.internal.ads.C7517Zc;
import com.google.android.gms.internal.ads.EnumC6881Ge;
import com.google.android.gms.internal.ads.GS;
import com.google.android.gms.internal.ads.InterfaceC9133ot;
import java.io.InputStream;
import java.util.Map;

/* renamed from: Rc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5179b {
    public CookieManager a(Context context) {
        throw null;
    }

    public WebResourceResponse b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public C10309zt c(InterfaceC9133ot interfaceC9133ot, C7517Zc c7517Zc, boolean z10, GS gs2) {
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

    public EnumC6881Ge f(Context context, TelephonyManager telephonyManager) {
        return EnumC6881Ge.ENUM_UNKNOWN;
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    /* synthetic */ C5179b(O0 o02) {
    }
}
