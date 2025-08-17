package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13078s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13078s(C13079t c13079t) {
        super(0);
        this.f121456a = c13079t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z10;
        L l10;
        for (Map.Entry entry : O.c().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            com.scandit.datacapture.barcode.internal.module.count.ui.status.b statusInternal = (com.scandit.datacapture.barcode.internal.module.count.ui.status.b) entry.getValue();
            if (!Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f121795a)) {
                if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f121794a)) {
                    z10 = true;
                } else {
                    z10 = statusInternal instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e;
                }
                if (z10 && (l10 = (L) this.f121456a.f121474r.get(Integer.valueOf(iIntValue))) != null) {
                    Intrinsics.j(statusInternal, "statusInternal");
                    l10.f121393f = statusInternal;
                    com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = l10.f121390c;
                    mVar.getClass();
                    Intrinsics.j(statusInternal, "statusInternal");
                    com.scandit.datacapture.barcode.internal.module.count.ui.status.m.f121814e.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.count.ui.status.g(mVar, statusInternal));
                    l10.a(true);
                }
            }
        }
        this.f121456a.f121473q.a();
        return Unit.f142422a;
    }
}
