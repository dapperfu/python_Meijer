package xu;

import android.content.ComponentCallbacks2;
import android.content.Context;
import uu.C17330a;

/* renamed from: xu.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18099e {
    public static Object a(Context context) {
        ComponentCallbacks2 componentCallbacks2A = C17330a.a(context.getApplicationContext());
        Au.d.a(componentCallbacks2A instanceof Au.b, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", componentCallbacks2A.getClass());
        return ((Au.b) componentCallbacks2A).generatedComponent();
    }
}
