package Ds;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LDs/d;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/wifi/WifiManager;", "wifiManager", "", "b", "(Landroid/net/ConnectivityManager;Landroid/net/wifi/WifiManager;)Z", "a", "(Landroid/net/ConnectivityManager;)Z", "", "Ljava/lang/String;", "getMeijerWifiSsid", "()Ljava/lang/String;", "meijerWifiSsid", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7334a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String meijerWifiSsid = "meijerwifi";

    @JvmStatic
    public static final boolean a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    @JvmStatic
    public static final boolean b(ConnectivityManager connectivityManager, WifiManager wifiManager) {
        NetworkInfo activeNetworkInfo;
        if ((connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) && wifiManager != null && wifiManager.isWifiEnabled()) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if ((connectionInfo != null ? connectionInfo.getSSID() : null) != null) {
                String ssid = connectionInfo.getSSID();
                Intrinsics.i(ssid, "getSSID(...)");
                if (!StringsKt.c0(ssid, "<unknown ssid>", false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private d() {
    }
}
