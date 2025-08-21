package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f123562a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f123562a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar;
        int iIntValue = ((Number) obj).intValue();
        for (Map.Entry entry : this.f123562a.f123575m.entrySet()) {
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
