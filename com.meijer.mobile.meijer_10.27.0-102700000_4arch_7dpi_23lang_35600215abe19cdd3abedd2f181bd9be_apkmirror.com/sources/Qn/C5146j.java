package Qn;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xl.C18067a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\f¨\u0006\u001d"}, d2 = {"LQn/j;", "", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/wifi/WifiManager;", "wifiManager", "LCk/b;", "eventBus", "<init>", "(Landroid/net/ConnectivityManager;Landroid/net/wifi/WifiManager;LCk/b;)V", "", "e", "()Z", "networkAvailable", "", "f", "(Z)V", "a", "Landroid/net/ConnectivityManager;", "b", "()Landroid/net/ConnectivityManager;", "Landroid/net/wifi/WifiManager;", "c", "()Landroid/net/wifi/WifiManager;", "LCk/b;", "value", "d", "Z", "isNetworkAvailable", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qn.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5146j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WifiManager wifiManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ck.b eventBus;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isNetworkAvailable;

    public C5146j(ConnectivityManager connectivityManager, WifiManager wifiManager, Ck.b eventBus) {
        Intrinsics.j(eventBus, "eventBus");
        this.connectivityManager = connectivityManager;
        this.wifiManager = wifiManager;
        this.eventBus = eventBus;
        this.isNetworkAvailable = true;
    }

    private final boolean e() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.connectivityManager;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    private final void f(boolean networkAvailable) {
        if (this.isNetworkAvailable != networkAvailable) {
            this.isNetworkAvailable = networkAvailable;
            this.eventBus.a(new C18067a(networkAvailable));
        }
    }

    /* renamed from: b, reason: from getter */
    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    /* renamed from: c, reason: from getter */
    public final WifiManager getWifiManager() {
        return this.wifiManager;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsNetworkAvailable() {
        return this.isNetworkAvailable;
    }

    public final boolean a() {
        boolean zE = e();
        uw.a.INSTANCE.q("checkConnection(): networkAvailable=%1b", Boolean.valueOf(zE));
        f(zE);
        return zE;
    }
}
