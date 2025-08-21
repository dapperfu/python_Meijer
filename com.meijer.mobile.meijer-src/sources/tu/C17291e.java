package tu;

import android.content.ComponentCallbacks2;
import android.content.Context;
import qu.C16766a;
import wu.InterfaceC17927b;

/* renamed from: tu.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17291e {
    public static Object a(Context context) {
        ComponentCallbacks2 componentCallbacks2A = C16766a.a(context.getApplicationContext());
        wu.d.a(componentCallbacks2A instanceof InterfaceC17927b, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", componentCallbacks2A.getClass());
        return ((InterfaceC17927b) componentCallbacks2A).generatedComponent();
    }
}
