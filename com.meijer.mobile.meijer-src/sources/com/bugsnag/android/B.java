package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.RemoteException;
import android.os.storage.StorageManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/content/Context;", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/IntentFilter;", "filter", "Lcom/bugsnag/android/D0;", "logger", "Landroid/content/Intent;", "e", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Lcom/bugsnag/android/D0;)Landroid/content/Intent;", "", "f", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;Lcom/bugsnag/android/D0;)V", "Landroid/app/ActivityManager;", "a", "(Landroid/content/Context;)Landroid/app/ActivityManager;", "Landroid/net/ConnectivityManager;", "b", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "Landroid/os/storage/StorageManager;", "d", "(Landroid/content/Context;)Landroid/os/storage/StorageManager;", "Landroid/location/LocationManager;", "c", "(Landroid/content/Context;)Landroid/location/LocationManager;", "bugsnag-android-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class B {
    @JvmName
    public static final ActivityManager a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @JvmName
    public static final ConnectivityManager b(Context context) {
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @JvmName
    public static final LocationManager c(Context context) {
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @JvmName
    public static final StorageManager d(Context context) {
        try {
            Object systemService = context.getSystemService(PlaceTypes.STORAGE);
            if (!(systemService instanceof StorageManager)) {
                systemService = null;
            }
            return (StorageManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final Intent e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, D0 d02) {
        try {
            return Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RemoteException e10) {
            if (d02 == null) {
                return null;
            }
            d02.b("Failed to register receiver", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            if (d02 == null) {
                return null;
            }
            d02.b("Failed to register receiver", e11);
            return null;
        } catch (SecurityException e12) {
            if (d02 == null) {
                return null;
            }
            d02.b("Failed to register receiver", e12);
            return null;
        }
    }

    public static final void f(Context context, BroadcastReceiver broadcastReceiver, D0 d02) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (RemoteException e10) {
            if (d02 == null) {
                return;
            }
            d02.b("Failed to register receiver", e10);
        } catch (IllegalArgumentException e11) {
            if (d02 == null) {
                return;
            }
            d02.b("Failed to register receiver", e11);
        } catch (SecurityException e12) {
            if (d02 == null) {
                return;
            }
            d02.b("Failed to register receiver", e12);
        }
    }
}
