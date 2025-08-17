package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.view.View;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class S extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindItem f122163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(u0 u0Var, BarcodeFindItem barcodeFindItem) {
        super(1);
        this.f122162a = u0Var;
        this.f122163b = barcodeFindItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        C13152a it = (C13152a) obj;
        Intrinsics.j(it, "it");
        List list = this.f122162a.f122284d.f122175b;
        BarcodeFindItem barcodeFindItem = this.f122163b;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.e(((y0) next).f122393b, barcodeFindItem)) {
                break;
            }
        }
        y0 dotInfo = (y0) next;
        if (dotInfo != null) {
            C13152a c13152a = this.f122162a.f122284d;
            c13152a.getClass();
            Intrinsics.j(dotInfo, "dotInfo");
            int childCount = c13152a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = c13152a.getChildAt(i10);
                C13168m c13168m = childAt instanceof C13168m ? (C13168m) childAt : null;
                if (c13168m != null) {
                    if (Intrinsics.e(c13168m.getTag(), dotInfo)) {
                        c13168m.f122246d.start();
                    } else {
                        c13168m.f122246d.stop();
                    }
                }
            }
        }
        return Unit.f142422a;
    }
}
