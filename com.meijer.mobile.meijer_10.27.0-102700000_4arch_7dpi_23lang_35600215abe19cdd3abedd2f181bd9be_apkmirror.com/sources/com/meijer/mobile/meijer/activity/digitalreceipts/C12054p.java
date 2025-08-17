package com.meijer.mobile.meijer.activity.digitalreceipts;

import Jk.AppVersion;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12054p implements InterfaceC16421a<ReceiptsAndSavingsActivity> {
    public static void a(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, InterfaceC14261a interfaceC14261a) {
        receiptsAndSavingsActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, AppVersion appVersion) {
        receiptsAndSavingsActivity.appVersion = appVersion;
    }

    public static void c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, yl.k kVar) {
        receiptsAndSavingsActivity.featureManager = kVar;
    }

    public static void d(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, Cs.b bVar) {
        receiptsAndSavingsActivity.userProvider = bVar;
    }
}
