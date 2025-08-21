package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.InterfaceC6299a;
import b.InterfaceC6300b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f47419a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6300b f47420b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6299a f47421c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f47422d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f47423e;

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f47423e;
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
        if (this.f47423e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder d() {
        return this.f47421c.asBinder();
    }

    ComponentName e() {
        return this.f47422d;
    }

    PendingIntent f() {
        return this.f47423e;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    f(InterfaceC6300b interfaceC6300b, InterfaceC6299a interfaceC6299a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f47420b = interfaceC6300b;
        this.f47421c = interfaceC6299a;
        this.f47422d = componentName;
        this.f47423e = pendingIntent;
    }

    public int g(String str, Bundle bundle) {
        int iV1;
        Bundle bundleB = b(bundle);
        synchronized (this.f47419a) {
            try {
                try {
                    iV1 = this.f47420b.v1(this.f47421c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iV1;
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC != null) {
                bundle.putAll(bundleC);
                return this.f47420b.h1(this.f47421c, uri, bundle);
            }
            return this.f47420b.G7(this.f47421c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
