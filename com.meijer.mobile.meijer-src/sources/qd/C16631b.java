package qd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.fullstory.FS;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.n;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import sd.C17067f;

/* renamed from: qd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16631b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f158238b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile C16631b f158239c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f158240a = new ConcurrentHashMap();

    public static C16631b b() {
        if (f158239c == null) {
            synchronized (f158238b) {
                try {
                    if (f158239c == null) {
                        f158239c = new C16631b();
                    }
                } finally {
                }
            }
        }
        C16631b c16631b = f158239c;
        r.l(c16631b);
        return c16631b;
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof q0);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!n.i() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }

    private C16631b() {
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C17067f.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    FS.log_w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f158240a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                FS.log_w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean zH = h(context, intent, serviceConnection, i10, executor);
                if (!zH) {
                    return false;
                }
                return zH;
            } finally {
                this.f158240a.remove(serviceConnection, serviceConnection);
            }
        }
        return h(context, intent, serviceConnection, i10, executor);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (g(serviceConnection) && this.f158240a.containsKey(serviceConnection)) {
            try {
                e(context, (ServiceConnection) this.f158240a.get(serviceConnection));
                return;
            } finally {
                this.f158240a.remove(serviceConnection);
            }
        }
        e(context, serviceConnection);
    }
}
