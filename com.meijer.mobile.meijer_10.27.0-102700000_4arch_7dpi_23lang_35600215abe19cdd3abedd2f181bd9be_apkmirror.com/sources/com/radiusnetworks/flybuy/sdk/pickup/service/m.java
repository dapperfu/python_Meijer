package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;

/* loaded from: classes11.dex */
public final class m extends ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f120050a;

    public m(t tVar) {
        this.f120050a = tVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i10, ScanResult scanResult) {
        super.onScanResult(i10, scanResult);
        com.radiusnetworks.flybuy.sdk.pickup.helper.c cVar = this.f120050a.f120058a;
        if (cVar == null) {
            Intrinsics.y("locationEventGenerator");
            cVar = null;
        }
        ArrayList arrayListA = cVar.a(scanResult);
        this.f120050a.getClass();
        C16648k.d(C16623P.a(C16639f0.b()), null, null, new l(arrayListA, null), 3, null);
    }
}
