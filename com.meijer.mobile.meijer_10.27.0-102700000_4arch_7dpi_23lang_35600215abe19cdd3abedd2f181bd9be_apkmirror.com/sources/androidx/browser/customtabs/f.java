package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.InterfaceC6160a;
import b.InterfaceC6161b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f47195a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6161b f47196b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6160a f47197c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f47198d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f47199e;

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f47199e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f47199e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder d() {
        return this.f47197c.asBinder();
    }

    ComponentName e() {
        return this.f47198d;
    }

    PendingIntent f() {
        return this.f47199e;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    f(InterfaceC6161b interfaceC6161b, InterfaceC6160a interfaceC6160a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f47196b = interfaceC6161b;
        this.f47197c = interfaceC6160a;
        this.f47198d = componentName;
        this.f47199e = pendingIntent;
    }

    public int g(String str, Bundle bundle) {
        int iO1;
        Bundle bundleB = b(bundle);
        synchronized (this.f47195a) {
            try {
                try {
                    iO1 = this.f47196b.o1(this.f47197c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iO1;
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC != null) {
                bundle.putAll(bundleC);
                return this.f47196b.e1(this.f47197c, uri, bundle);
            }
            return this.f47196b.C7(this.f47197c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
