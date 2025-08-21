package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class w1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f123045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f123046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f123047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f123048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(boolean z10, y1 y1Var, String str, Function0 function0) {
        super(1);
        this.f123045a = z10;
        this.f123046b = y1Var;
        this.f123047c = str;
        this.f123048d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        if (this.f123045a) {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar = this.f123046b.f123063b;
            if (lVar != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j jVar = com.scandit.datacapture.barcode.internal.module.ui.j.f124292b;
                String str = this.f123047c;
                if (str == null) {
                    str = "";
                }
                lVar.a(jVar, str);
            }
        } else {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar2 = this.f123046b.f123063b;
            if (lVar2 != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j guidanceState = com.scandit.datacapture.barcode.internal.module.ui.j.f124292b;
                Intrinsics.j(guidanceState, "guidanceState");
                if (lVar2.f124301d == guidanceState) {
                    lVar2.a();
                }
            }
        }
        this.f123048d.invoke();
        return Unit.f143329a;
    }
}
