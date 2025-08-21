package x7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lx7/c;", "Lx7/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lx7/e;", "c", "(Landroid/net/ConnectivityManager;)Lx7/e;", "d", "a", "()Lx7/e;", "", "b", "()Z", "Landroid/net/ConnectivityManager;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18130c implements InterfaceC18129b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    public C18130c(Context context) {
        Intrinsics.j(context, "context");
        Object systemService = context.getSystemService("connectivity");
        this.connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
    }

    @Override // x7.InterfaceC18129b
    public EnumC18132e a() {
        return this.connectivityManager == null ? EnumC18132e.f170630e : C18128a.f170624a.b() >= 23 ? c(this.connectivityManager) : d(this.connectivityManager);
    }

    private final EnumC18132e c(ConnectivityManager connectivityManager) {
        EnumC18132e enumC18132e;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return EnumC18132e.f170630e;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                enumC18132e = EnumC18132e.f170626a;
            } else if (networkCapabilities.hasTransport(0)) {
                enumC18132e = EnumC18132e.f170627b;
            } else if (networkCapabilities.hasTransport(3)) {
                enumC18132e = EnumC18132e.f170628c;
            } else {
                enumC18132e = EnumC18132e.f170629d;
            }
            if (enumC18132e != null) {
                return enumC18132e;
            }
        }
        return EnumC18132e.f170630e;
    }

    private final EnumC18132e d(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 9) {
                        return EnumC18132e.f170629d;
                    }
                    return EnumC18132e.f170628c;
                }
                return EnumC18132e.f170626a;
            }
            return EnumC18132e.f170627b;
        }
        return EnumC18132e.f170630e;
    }

    @Override // x7.InterfaceC18129b
    public boolean b() {
        if (a() != EnumC18132e.f170630e) {
            return true;
        }
        return false;
    }
}
