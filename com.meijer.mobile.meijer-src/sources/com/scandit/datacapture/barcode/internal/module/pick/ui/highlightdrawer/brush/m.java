package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f123524a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(1);
        this.f123524a = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar;
        int iIntValue = ((Number) obj).intValue();
        for (Map.Entry entry : this.f123524a.f123535k.entrySet()) {
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) entry.getValue();
            if (iIntValue2 != iIntValue && (hVar = eVar.f123659h) != null) {
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b onFinished = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b.f123666a;
                Intrinsics.j(onFinished, "onFinished");
                if (hVar.f123686o == com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f123663b) {
                    hVar.a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f123662a, onFinished);
                } else {
                    onFinished.invoke();
                }
            }
        }
        return Unit.f143329a;
    }
}
