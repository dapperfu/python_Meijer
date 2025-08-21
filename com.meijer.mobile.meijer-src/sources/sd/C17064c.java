package sd;

import android.content.Context;
import com.google.android.gms.common.util.n;

/* renamed from: sd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17064c {

    /* renamed from: a, reason: collision with root package name */
    private static Context f160306a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f160307b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f160306a;
        if (context2 != null && (bool = f160307b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f160307b = null;
        if (n.g()) {
            f160307b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f160307b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f160307b = Boolean.FALSE;
            }
        }
        f160306a = applicationContext;
        return f160307b.booleanValue();
    }
}
