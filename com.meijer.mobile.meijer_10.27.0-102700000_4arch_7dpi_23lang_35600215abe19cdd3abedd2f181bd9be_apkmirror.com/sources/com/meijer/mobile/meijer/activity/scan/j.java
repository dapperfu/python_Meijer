package com.meijer.mobile.meijer.activity.scan;

import pu.InterfaceC16421a;
import qv.AbstractC16618K;

/* loaded from: classes9.dex */
public final class j implements InterfaceC16421a<ScanActivity> {
    public static void a(ScanActivity scanActivity, AbstractC16618K abstractC16618K) {
        scanActivity.ioDispatcher = abstractC16618K;
    }

    public static void b(ScanActivity scanActivity, Ro.c cVar) {
        scanActivity.productsRepository = cVar;
    }
}
