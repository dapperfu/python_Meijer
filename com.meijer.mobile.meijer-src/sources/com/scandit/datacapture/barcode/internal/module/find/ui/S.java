package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.view.View;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class S extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindItem f123115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(u0 u0Var, BarcodeFindItem barcodeFindItem) {
        super(1);
        this.f123114a = u0Var;
        this.f123115b = barcodeFindItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        C13285a it = (C13285a) obj;
        Intrinsics.j(it, "it");
        List list = this.f123114a.f123236d.f123127b;
        BarcodeFindItem barcodeFindItem = this.f123115b;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.e(((y0) next).f123345b, barcodeFindItem)) {
                break;
            }
        }
        y0 dotInfo = (y0) next;
        if (dotInfo != null) {
            C13285a c13285a = this.f123114a.f123236d;
            c13285a.getClass();
            Intrinsics.j(dotInfo, "dotInfo");
            int childCount = c13285a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = c13285a.getChildAt(i10);
                C13301m c13301m = childAt instanceof C13301m ? (C13301m) childAt : null;
                if (c13301m != null) {
                    if (Intrinsics.e(c13301m.getTag(), dotInfo)) {
                        c13301m.f123198d.start();
                    } else {
                        c13301m.f123198d.stop();
                    }
                }
            }
        }
        return Unit.f143329a;
    }
}
