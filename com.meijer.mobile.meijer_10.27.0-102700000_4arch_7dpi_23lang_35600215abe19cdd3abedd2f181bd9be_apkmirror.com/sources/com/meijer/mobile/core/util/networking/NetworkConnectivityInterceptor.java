package com.meijer.mobile.core.util.networking;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/core/util/networking/NetworkConnectivityInterceptor;", "Lokhttp3/Interceptor;", "Lcom/meijer/mobile/core/util/networking/a;", "networkConnectivityManager", "<init>", "(Lcom/meijer/mobile/core/util/networking/a;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "a", "Lcom/meijer/mobile/core/util/networking/a;", "NetworkState", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkConnectivityInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.core.util.networking.a networkConnectivityManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/core/util/networking/NetworkConnectivityInterceptor$NetworkState;", "", "<init>", "(Ljava/lang/String;I)V", "NO_AVAILABLE_NETWORKS", "NO_EXTERNAL_NET_ACCESS", "CONNECTED", "UNKNOWN", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NetworkState[] $VALUES;

        @g(name = "NO_AVAILABLE_NETWORKS")
        public static final NetworkState NO_AVAILABLE_NETWORKS = new NetworkState("NO_AVAILABLE_NETWORKS", 0);

        @g(name = "NO_EXTERNAL_NET_ACCESS")
        public static final NetworkState NO_EXTERNAL_NET_ACCESS = new NetworkState("NO_EXTERNAL_NET_ACCESS", 1);

        @g(name = "CONNECTED")
        public static final NetworkState CONNECTED = new NetworkState("CONNECTED", 2);

        @g(name = "UNKNOWN")
        public static final NetworkState UNKNOWN = new NetworkState("UNKNOWN", 3);

        private static final /* synthetic */ NetworkState[] a() {
            return new NetworkState[]{NO_AVAILABLE_NETWORKS, NO_EXTERNAL_NET_ACCESS, CONNECTED, UNKNOWN};
        }

        static {
            NetworkState[] networkStateArrA = a();
            $VALUES = networkStateArrA;
            $ENTRIES = EnumEntriesKt.a(networkStateArrA);
        }

        public static NetworkState valueOf(String str) {
            return (NetworkState) Enum.valueOf(NetworkState.class, str);
        }

        public static NetworkState[] values() {
            return (NetworkState[]) $VALUES.clone();
        }

        private NetworkState(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkState.values().length];
            try {
                iArr[NetworkState.NO_AVAILABLE_NETWORKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkState.NO_EXTERNAL_NET_ACCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NetworkConnectivityInterceptor(com.meijer.mobile.core.util.networking.a networkConnectivityManager) {
        Intrinsics.j(networkConnectivityManager, "networkConnectivityManager");
        this.networkConnectivityManager = networkConnectivityManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.j(chain, "chain");
        int i10 = a.$EnumSwitchMapping$0[this.networkConnectivityManager.a().ordinal()];
        if (i10 == 1) {
            throw new NoAvailableNetworksException("User has no Wi-Fi, mobile, or other network turned on or available");
        }
        if (i10 != 2) {
            return chain.proceed(chain.request());
        }
        throw new NoExternalNetAccessException("User has networks on but no connectivity");
    }
}
