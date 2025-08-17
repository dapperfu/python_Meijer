package com.radiusnetworks.flybuy.sdk.pickup;

import Jd.C3778l;
import Td.AbstractC5232j;
import Td.InterfaceC5226d;
import Td.InterfaceC5227e;
import Td.InterfaceC5228f;
import android.content.Context;
import com.radiusnetworks.flybuy.sdk.manager.locationrequest.LocationRequestManager;
import com.radiusnetworks.flybuy.sdk.util.PermissionExtensionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class k implements LocationRequestManager.LocationProvider {
    public static final void a(Function1 callback) {
        Intrinsics.j(callback, "$callback");
        callback.invoke(null);
    }

    public static final void b(Function1 callback, AbstractC5232j it) {
        Intrinsics.j(callback, "$callback");
        Intrinsics.j(it, "it");
        callback.invoke(it.n());
    }

    public static final void c(Function1 callback, Exception it) {
        Intrinsics.j(callback, "$callback");
        Intrinsics.j(it, "it");
        callback.invoke(null);
    }

    @Override // com.radiusnetworks.flybuy.sdk.manager.locationrequest.LocationRequestManager.LocationProvider
    public final void requestLocation(Context context, final Function1 callback) {
        Intrinsics.j(context, "context");
        Intrinsics.j(callback, "callback");
        if (PermissionExtensionsKt.hasCoarseLocationPermission(context) || PermissionExtensionsKt.hasFineLocationPermission(context)) {
            C3778l.b(context).l().c(new InterfaceC5227e() { // from class: com.radiusnetworks.flybuy.sdk.pickup.h
                @Override // Td.InterfaceC5227e
                public final void onComplete(AbstractC5232j abstractC5232j) {
                    k.b(callback, abstractC5232j);
                }
            }).a(new InterfaceC5226d() { // from class: com.radiusnetworks.flybuy.sdk.pickup.i
                @Override // Td.InterfaceC5226d
                public final void onCanceled() {
                    k.a(callback);
                }
            }).e(new InterfaceC5228f() { // from class: com.radiusnetworks.flybuy.sdk.pickup.j
                @Override // Td.InterfaceC5228f
                public final void onFailure(Exception exc) {
                    k.c(callback, exc);
                }
            });
        } else {
            callback.invoke(null);
        }
    }
}
