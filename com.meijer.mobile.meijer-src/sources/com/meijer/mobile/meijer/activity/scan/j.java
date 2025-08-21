package com.meijer.mobile.meijer.activity.scan;

import lu.InterfaceC15612a;
import mv.AbstractC15779K;

/* loaded from: classes10.dex */
public final class j implements InterfaceC15612a<ScanActivity> {
    public static void a(ScanActivity scanActivity, AbstractC15779K abstractC15779K) {
        scanActivity.ioDispatcher = abstractC15779K;
    }

    public static void b(ScanActivity scanActivity, Ro.c cVar) {
        scanActivity.productsRepository = cVar;
    }
}
