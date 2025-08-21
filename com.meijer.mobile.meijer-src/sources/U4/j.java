package U4;

import O4.AbstractC4373v;
import S4.NetworkState;
import X4.p;
import X4.r;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LU4/j;", "LU4/h;", "LS4/e;", "Landroid/content/Context;", "context", "LY4/b;", "taskExecutor", "<init>", "(Landroid/content/Context;LY4/b;)V", "k", "()LS4/e;", "", "h", "()V", "i", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "U4/j$a", "g", "LU4/j$a;", "networkCallback", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends h<NetworkState> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a networkCallback;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"U4/j$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            Intrinsics.j(network, "network");
            Intrinsics.j(capabilities, "capabilities");
            AbstractC4373v.e().a(k.f37101a, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(Build.VERSION.SDK_INT >= 28 ? k.d(capabilities) : k.c(jVar.connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.j(network, "network");
            AbstractC4373v.e().a(k.f37101a, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.connectivityManager));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Y4.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.j(context, "context");
        Intrinsics.j(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.networkCallback = new a();
    }

    @Override // U4.h
    public void h() {
        try {
            AbstractC4373v.e().a(k.f37101a, "Registering network callback");
            r.a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e10) {
            AbstractC4373v.e().d(k.f37101a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC4373v.e().d(k.f37101a, "Received exception while registering network callback", e11);
        }
    }

    @Override // U4.h
    public void i() {
        try {
            AbstractC4373v.e().a(k.f37101a, "Unregistering network callback");
            p.c(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e10) {
            AbstractC4373v.e().d(k.f37101a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC4373v.e().d(k.f37101a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // U4.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public NetworkState e() {
        return k.c(this.connectivityManager);
    }
}
