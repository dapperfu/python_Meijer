package com.radiusnetworks.flybuy.sdk.pickup;

import Ld.C4022l;
import Vd.AbstractC5516j;
import Vd.InterfaceC5510d;
import Vd.InterfaceC5511e;
import Vd.InterfaceC5512f;
import android.content.Context;
import com.radiusnetworks.flybuy.sdk.manager.locationrequest.LocationRequestManager;
import com.radiusnetworks.flybuy.sdk.util.PermissionExtensionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k implements LocationRequestManager.LocationProvider {
    public static final void a(Function1 callback) {
        Intrinsics.j(callback, "$callback");
        callback.invoke(null);
    }

    public static final void b(Function1 callback, AbstractC5516j it) {
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
            C4022l.b(context).m().c(new InterfaceC5511e() { // from class: com.radiusnetworks.flybuy.sdk.pickup.h
                @Override // Vd.InterfaceC5511e
                public final void onComplete(AbstractC5516j abstractC5516j) {
                    k.b(callback, abstractC5516j);
                }
            }).a(new InterfaceC5510d() { // from class: com.radiusnetworks.flybuy.sdk.pickup.i
                @Override // Vd.InterfaceC5510d
                public final void onCanceled() {
                    k.a(callback);
                }
            }).e(new InterfaceC5512f() { // from class: com.radiusnetworks.flybuy.sdk.pickup.j
                @Override // Vd.InterfaceC5512f
                public final void onFailure(Exception exc) {
                    k.c(callback, exc);
                }
            });
        } else {
            callback.invoke(null);
        }
    }
}
