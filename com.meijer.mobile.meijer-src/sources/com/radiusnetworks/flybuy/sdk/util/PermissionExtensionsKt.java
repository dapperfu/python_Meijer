package com.radiusnetworks.flybuy.sdk.util;

import Z1.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0003H\u0007\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0007\u001a\f\u0010\f\u001a\u00020\n*\u00020\u0003H\u0007\u001a\f\u0010\r\u001a\u00020\n*\u00020\u0003H\u0007\u001a\f\u0010\u000e\u001a\u00020\n*\u00020\u0003H\u0007\u001a\f\u0010\u000f\u001a\u00020\n*\u00020\u0003H\u0007\u001a\f\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0007\u001a\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0012"}, d2 = {"backgroundLocationPermissions", "", "", "Landroid/content/Context;", "bluetoothAdvertiseConnectPermissions", "bluetoothScanPermissions", "coarseLocationPermissions", "fineAndCoarseLocationPermissions", "fineLocationPermissions", "hasBackgroundLocationPermission", "", "hasBluetoothAdvertiseConnectPermission", "hasBluetoothScanPermission", "hasCoarseLocationPermission", "hasFineAndBackgroundLocationPermissions", "hasFineLocationPermission", "hasPostNotificationsPermissions", "postNotificationsPermission", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PermissionExtensionsKt {
    public static final List<String> backgroundLocationPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        return (Build.VERSION.SDK_INT < 29 || ContextExtensionsKt.targetSdkVersion(context) < 29) ? CollectionsKt.m() : CollectionsKt.e("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static final List<String> bluetoothAdvertiseConnectPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        return (Build.VERSION.SDK_INT < 31 || ContextExtensionsKt.targetSdkVersion(context) < 31) ? CollectionsKt.m() : CollectionsKt.p("android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT");
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static final List<String> bluetoothScanPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        return (Build.VERSION.SDK_INT < 31 || ContextExtensionsKt.targetSdkVersion(context) < 31) ? CollectionsKt.m() : CollectionsKt.e("android.permission.BLUETOOTH_SCAN");
    }

    public static final List<String> coarseLocationPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        return CollectionsKt.e("android.permission.ACCESS_COARSE_LOCATION");
    }

    public static final List<String> fineAndCoarseLocationPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        return CollectionsKt.p("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    public static final List<String> fineLocationPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        return CollectionsKt.e("android.permission.ACCESS_FINE_LOCATION");
    }

    @Keep
    public static final boolean hasBackgroundLocationPermission(Context context) {
        Intrinsics.j(context, "<this>");
        List<String> listBackgroundLocationPermissions = backgroundLocationPermissions(context);
        if (listBackgroundLocationPermissions.isEmpty() || listBackgroundLocationPermissions.isEmpty()) {
            return true;
        }
        Iterator<T> it = listBackgroundLocationPermissions.iterator();
        while (it.hasNext()) {
            if (e.c(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @Keep
    public static final boolean hasBluetoothAdvertiseConnectPermission(Context context) {
        Intrinsics.j(context, "<this>");
        List<String> listBluetoothAdvertiseConnectPermissions = bluetoothAdvertiseConnectPermissions(context);
        if (listBluetoothAdvertiseConnectPermissions.isEmpty() || listBluetoothAdvertiseConnectPermissions.isEmpty()) {
            return true;
        }
        Iterator<T> it = listBluetoothAdvertiseConnectPermissions.iterator();
        while (it.hasNext()) {
            if (e.c(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @Keep
    public static final boolean hasBluetoothScanPermission(Context context) {
        Intrinsics.j(context, "<this>");
        List<String> listBluetoothScanPermissions = bluetoothScanPermissions(context);
        if (listBluetoothScanPermissions.isEmpty() || listBluetoothScanPermissions.isEmpty()) {
            return true;
        }
        Iterator<T> it = listBluetoothScanPermissions.iterator();
        while (it.hasNext()) {
            if (e.c(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @Keep
    public static final boolean hasCoarseLocationPermission(Context context) {
        Intrinsics.j(context, "<this>");
        List<String> listCoarseLocationPermissions = coarseLocationPermissions(context);
        if (listCoarseLocationPermissions.isEmpty() || listCoarseLocationPermissions.isEmpty()) {
            return true;
        }
        Iterator<T> it = listCoarseLocationPermissions.iterator();
        while (it.hasNext()) {
            if (e.c(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @Keep
    public static final boolean hasFineAndBackgroundLocationPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        boolean zHasFineLocationPermission = hasFineLocationPermission(context);
        return Build.VERSION.SDK_INT >= 29 ? zHasFineLocationPermission && hasBackgroundLocationPermission(context) : zHasFineLocationPermission;
    }

    @Keep
    public static final boolean hasFineLocationPermission(Context context) {
        Intrinsics.j(context, "<this>");
        List<String> listFineLocationPermissions = fineLocationPermissions(context);
        if (listFineLocationPermissions.isEmpty() || listFineLocationPermissions.isEmpty()) {
            return true;
        }
        Iterator<T> it = listFineLocationPermissions.iterator();
        while (it.hasNext()) {
            if (e.c(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @Keep
    public static final boolean hasPostNotificationsPermissions(Context context) {
        Intrinsics.j(context, "<this>");
        List<String> listPostNotificationsPermission = postNotificationsPermission(context);
        if (listPostNotificationsPermission.isEmpty() || listPostNotificationsPermission.isEmpty()) {
            return true;
        }
        Iterator<T> it = listPostNotificationsPermission.iterator();
        while (it.hasNext()) {
            if (e.c(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @Keep
    @SuppressLint({"InlinedApi"})
    public static final List<String> postNotificationsPermission(Context context) {
        Intrinsics.j(context, "<this>");
        return (Build.VERSION.SDK_INT < 33 || ContextExtensionsKt.targetSdkVersion(context) < 33) ? CollectionsKt.m() : CollectionsKt.e("android.permission.POST_NOTIFICATIONS");
    }
}
