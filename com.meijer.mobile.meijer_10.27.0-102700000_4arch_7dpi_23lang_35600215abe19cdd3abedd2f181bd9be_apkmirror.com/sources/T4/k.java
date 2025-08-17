package T4;

import N4.AbstractC4333v;
import R4.NetworkState;
import W4.p;
import W4.q;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import i2.C14592a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0005*\u00020\u000b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0005*\u00020\u00158AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", "LX4/b;", "taskExecutor", "LT4/h;", "LR4/e;", "a", "(Landroid/content/Context;LX4/b;)LT4/h;", "", "Ljava/lang/String;", "TAG", "Landroid/net/ConnectivityManager;", "", "e", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "c", "(Landroid/net/ConnectivityManager;)LR4/e;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "Landroid/net/NetworkCapabilities;", "d", "(Landroid/net/NetworkCapabilities;)LR4/e;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34810a;

    static {
        String strI = AbstractC4333v.i("NetworkStateTracker");
        Intrinsics.i(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        f34810a = strI;
    }

    public static final h<NetworkState> a(Context context, X4.b taskExecutor) {
        Intrinsics.j(context, "context");
        Intrinsics.j(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final NetworkState c(ConnectivityManager connectivityManager) {
        Intrinsics.j(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zE = e(connectivityManager);
        boolean zA = C14592a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new NetworkState(z11, zE, zA, z10);
    }

    public static final NetworkState d(NetworkCapabilities networkCapabilities) {
        Intrinsics.j(networkCapabilities, "<this>");
        return new NetworkState(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    public static final boolean e(ConnectivityManager connectivityManager) {
        Intrinsics.j(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = p.a(connectivityManager, q.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return p.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e10) {
            AbstractC4333v.e().d(f34810a, "Unable to validate active network", e10);
            return false;
        }
    }
}
