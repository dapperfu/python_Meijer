package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.pickup.helper.LocationEventGenerator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;

/* loaded from: classes12.dex */
public final class m extends ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f120996a;

    public m(t tVar) {
        this.f120996a = tVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i10, ScanResult scanResult) {
        super.onScanResult(i10, scanResult);
        LocationEventGenerator locationEventGenerator = this.f120996a.f121005a;
        if (locationEventGenerator == null) {
            Intrinsics.x("locationEventGenerator");
            locationEventGenerator = null;
        }
        List<OrderEventInfo> listUpdateBeaconScanResult = locationEventGenerator.updateBeaconScanResult(scanResult);
        this.f120996a.getClass();
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new l(listUpdateBeaconScanResult, null), 3, null);
    }
}
