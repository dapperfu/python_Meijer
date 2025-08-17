package qd;

import android.content.Context;
import com.google.android.gms.common.util.n;

/* renamed from: qd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16516c {

    /* renamed from: a, reason: collision with root package name */
    private static Context f157191a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f157192b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f157191a;
        if (context2 != null && (bool = f157192b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f157192b = null;
        if (n.g()) {
            f157192b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f157192b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f157192b = Boolean.FALSE;
            }
        }
        f157191a = applicationContext;
        return f157192b.booleanValue();
    }
}
