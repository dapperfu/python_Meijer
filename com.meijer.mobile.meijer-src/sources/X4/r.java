package X4;

import android.net.ConnectivityManager;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "", "a", "(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class r {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.j(connectivityManager, "<this>");
        Intrinsics.j(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
