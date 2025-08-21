package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.radiusnetworks.flybuy.sdk.util.PermissionExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LocationService f120979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LocationService locationService) {
        super(0);
        this.f120979f = locationService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context applicationContext = this.f120979f.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        if (!PermissionExtensionsKt.hasBluetoothScanPermission(applicationContext)) {
            return null;
        }
        Object systemService = this.f120979f.getSystemService("bluetooth");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return ((BluetoothManager) systemService).getAdapter();
    }
}
