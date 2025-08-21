package com.meijer.mobile.meijer.activity.digitalreceipts;

import Kk.AppVersion;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;

/* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12179p implements InterfaceC15612a<ReceiptsAndSavingsActivity> {
    public static void a(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, InterfaceC14523a interfaceC14523a) {
        receiptsAndSavingsActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, AppVersion appVersion) {
        receiptsAndSavingsActivity.appVersion = appVersion;
    }

    public static void c(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, zl.k kVar) {
        receiptsAndSavingsActivity.featureManager = kVar;
    }

    public static void d(ReceiptsAndSavingsActivity receiptsAndSavingsActivity, Cs.b bVar) {
        receiptsAndSavingsActivity.userProvider = bVar;
    }
}
