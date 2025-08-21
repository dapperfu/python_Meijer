package l5;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.f;
import r5.C16840d;
import r5.C16844h;
import r5.InterfaceC16855s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/Context;", "context", "Ll5/f$a;", "listener", "Lr5/s;", "logger", "Ll5/f;", "a", "(Landroid/content/Context;Ll5/f$a;Lr5/s;)Ll5/f;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g {
    public static final f a(Context context, f.a aVar, InterfaceC16855s interfaceC16855s) {
        ConnectivityManager connectivityManager = (ConnectivityManager) Z1.b.j(context, ConnectivityManager.class);
        if (connectivityManager == null || !C16840d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (interfaceC16855s != null && interfaceC16855s.getLevel() <= 5) {
                interfaceC16855s.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new e();
        }
        try {
            return new h(connectivityManager, aVar);
        } catch (Exception e10) {
            if (interfaceC16855s != null) {
                C16844h.a(interfaceC16855s, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new e();
        }
    }
}
