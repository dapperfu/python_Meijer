package X4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "", "c", "(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "a", "(Landroid/net/ConnectivityManager;Landroid/net/Network;)Landroid/net/NetworkCapabilities;", "", "capability", "", "b", "(Landroid/net/NetworkCapabilities;I)Z", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class p {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        Intrinsics.j(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i10) {
        Intrinsics.j(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.j(connectivityManager, "<this>");
        Intrinsics.j(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
