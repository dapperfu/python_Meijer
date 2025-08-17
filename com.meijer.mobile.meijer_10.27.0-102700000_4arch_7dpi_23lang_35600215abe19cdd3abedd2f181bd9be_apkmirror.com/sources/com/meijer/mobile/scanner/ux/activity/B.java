package com.meijer.mobile.scanner.ux.activity;

import Mp.d;
import pu.InterfaceC16421a;

/* loaded from: classes11.dex */
public final class B implements InterfaceC16421a<ScannerDemoActivity> {
    public static void a(ScannerDemoActivity scannerDemoActivity, d.a aVar) {
        scannerDemoActivity.barcodeAnalysisFactory = aVar;
    }

    public static void b(ScannerDemoActivity scannerDemoActivity, Al.g gVar) {
        scannerDemoActivity.featureEntryPoint = gVar;
    }

    public static void c(ScannerDemoActivity scannerDemoActivity, Cl.e eVar) {
        scannerDemoActivity.meijerIntent = eVar;
    }
}
