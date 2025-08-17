package com.meijer.mobile.core.util.networking;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meijer.mobile.core.util.networking.NetworkConnectivityInterceptor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/core/util/networking/a;", "", "Landroid/net/ConnectivityManager;", "connMgr", "<init>", "(Landroid/net/ConnectivityManager;)V", "Lcom/meijer/mobile/core/util/networking/NetworkConnectivityInterceptor$NetworkState;", "a", "()Lcom/meijer/mobile/core/util/networking/NetworkConnectivityInterceptor$NetworkState;", "Landroid/net/ConnectivityManager;", "b", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connMgr;

    public final NetworkConnectivityInterceptor.NetworkState a() {
        ConnectivityManager connectivityManager = this.connMgr;
        if (connectivityManager == null) {
            return NetworkConnectivityInterceptor.NetworkState.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null ? NetworkConnectivityInterceptor.NetworkState.NO_AVAILABLE_NETWORKS : !activeNetworkInfo.isConnected() ? NetworkConnectivityInterceptor.NetworkState.NO_EXTERNAL_NET_ACCESS : NetworkConnectivityInterceptor.NetworkState.CONNECTED;
    }

    public a(ConnectivityManager connectivityManager) {
        this.connMgr = connectivityManager;
    }
}
