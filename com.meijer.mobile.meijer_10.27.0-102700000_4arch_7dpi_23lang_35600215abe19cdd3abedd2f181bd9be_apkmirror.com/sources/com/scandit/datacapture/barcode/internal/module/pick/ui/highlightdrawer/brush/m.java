package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f122572a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(1);
        this.f122572a = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar;
        int iIntValue = ((Number) obj).intValue();
        for (Map.Entry entry : this.f122572a.f122583k.entrySet()) {
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e eVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e) entry.getValue();
            if (iIntValue2 != iIntValue && (hVar = eVar.f122707h) != null) {
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b onFinished = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.b.f122714a;
                Intrinsics.j(onFinished, "onFinished");
                if (hVar.f122734o == com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122711b) {
                    hVar.a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122710a, onFinished);
                } else {
                    onFinished.invoke();
                }
            }
        }
        return Unit.f142422a;
    }
}
