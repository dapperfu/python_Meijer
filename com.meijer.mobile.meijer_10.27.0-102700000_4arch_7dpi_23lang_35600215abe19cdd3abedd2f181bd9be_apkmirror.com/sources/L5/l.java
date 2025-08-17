package L5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/net/ConnectivityManager;", "connectivityManager", "", "a", "(Landroid/net/ConnectivityManager;)Z", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class l {
    @JvmName
    public static final boolean a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.j(connectivityManager, "connectivityManager");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }
}
