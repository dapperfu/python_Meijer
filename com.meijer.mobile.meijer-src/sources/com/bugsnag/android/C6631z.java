package com.bugsnag.android;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012>\u0010\r\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004j\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/bugsnag/android/z;", "Lcom/bugsnag/android/y;", "Landroid/net/ConnectivityManager;", "cm", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "hasConnection", "", "networkState", "", "Lcom/bugsnag/android/NetworkChangeCallback;", "callback", "<init>", "(Landroid/net/ConnectivityManager;Lkotlin/jvm/functions/Function2;)V", "a", "()V", "b", "()Z", "c", "()Ljava/lang/String;", "Landroid/net/ConnectivityManager;", "Lcom/bugsnag/android/z$a;", "Lcom/bugsnag/android/z$a;", "networkCallback", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6631z implements InterfaceC6629y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager cm;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a networkCallback;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BG\u0012>\u0010\u000b\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002j\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015RL\u0010\u000b\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002j\u0004\u0018\u0001`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/bugsnag/android/z$a;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "hasConnection", "", "networkState", "", "Lcom/bugsnag/android/NetworkChangeCallback;", "cb", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "a", "(Z)V", "onUnavailable", "()V", "Landroid/net/Network;", "network", "onAvailable", "(Landroid/net/Network;)V", "Lkotlin/jvm/functions/Function2;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "receivedFirstCallback", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.z$a */
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function2<Boolean, String, Unit> cb;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AtomicBoolean receivedFirstCallback = new AtomicBoolean(false);

        private final void a(boolean hasConnection) {
            Function2<Boolean, String, Unit> function2;
            if (!this.receivedFirstCallback.getAndSet(true) || (function2 = this.cb) == null) {
                return;
            }
            function2.invoke(Boolean.valueOf(hasConnection), r1.f64358a.c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Boolean, ? super String, Unit> function2) {
            this.cb = function2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            a(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            a(false);
        }
    }

    @Override // com.bugsnag.android.InterfaceC6629y
    public void a() {
        this.cm.registerDefaultNetworkCallback(this.networkCallback);
    }

    @Override // com.bugsnag.android.InterfaceC6629y
    public boolean b() {
        return this.cm.getActiveNetwork() != null;
    }

    @Override // com.bugsnag.android.InterfaceC6629y
    public String c() {
        Network activeNetwork = this.cm.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? this.cm.getNetworkCapabilities(activeNetwork) : null;
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(0) ? "cellular" : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    public C6631z(ConnectivityManager connectivityManager, Function2<? super Boolean, ? super String, Unit> function2) {
        this.cm = connectivityManager;
        this.networkCallback = new a(function2);
    }
}
