package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13211s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13211s(C13212t c13212t) {
        super(0);
        this.f122408a = c13212t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z10;
        L l10;
        for (Map.Entry entry : O.c().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            com.scandit.datacapture.barcode.internal.module.count.ui.status.b statusInternal = (com.scandit.datacapture.barcode.internal.module.count.ui.status.b) entry.getValue();
            if (!Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f122747a)) {
                if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f122746a)) {
                    z10 = true;
                } else {
                    z10 = statusInternal instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e;
                }
                if (z10 && (l10 = (L) this.f122408a.f122426r.get(Integer.valueOf(iIntValue))) != null) {
                    Intrinsics.j(statusInternal, "statusInternal");
                    l10.f122345f = statusInternal;
                    com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = l10.f122342c;
                    mVar.getClass();
                    Intrinsics.j(statusInternal, "statusInternal");
                    com.scandit.datacapture.barcode.internal.module.count.ui.status.m.f122766e.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.count.ui.status.g(mVar, statusInternal));
                    l10.a(true);
                }
            }
        }
        this.f122408a.f122425q.a();
        return Unit.f143329a;
    }
}
