package com.meijer.mobile.scanner.ux.activity;

import Mp.d;
import lu.InterfaceC15612a;

/* loaded from: classes12.dex */
public final class B implements InterfaceC15612a<ScannerDemoActivity> {
    public static void a(ScannerDemoActivity scannerDemoActivity, d.a aVar) {
        scannerDemoActivity.barcodeAnalysisFactory = aVar;
    }

    public static void b(ScannerDemoActivity scannerDemoActivity, Bl.g gVar) {
        scannerDemoActivity.featureEntryPoint = gVar;
    }

    public static void c(ScannerDemoActivity scannerDemoActivity, Dl.e eVar) {
        scannerDemoActivity.meijerIntent = eVar;
    }
}
