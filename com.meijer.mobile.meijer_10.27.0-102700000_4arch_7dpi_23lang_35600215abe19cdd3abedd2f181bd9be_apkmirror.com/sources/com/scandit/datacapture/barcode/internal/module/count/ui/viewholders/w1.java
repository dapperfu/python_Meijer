package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class w1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f122093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f122094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f122095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f122096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(boolean z10, y1 y1Var, String str, Function0 function0) {
        super(1);
        this.f122093a = z10;
        this.f122094b = y1Var;
        this.f122095c = str;
        this.f122096d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        if (this.f122093a) {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar = this.f122094b.f122111b;
            if (lVar != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j jVar = com.scandit.datacapture.barcode.internal.module.ui.j.f123340b;
                String str = this.f122095c;
                if (str == null) {
                    str = "";
                }
                lVar.a(jVar, str);
            }
        } else {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar2 = this.f122094b.f122111b;
            if (lVar2 != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j guidanceState = com.scandit.datacapture.barcode.internal.module.ui.j.f123340b;
                Intrinsics.j(guidanceState, "guidanceState");
                if (lVar2.f123349d == guidanceState) {
                    lVar2.a();
                }
            }
        }
        this.f122096d.invoke();
        return Unit.f142422a;
    }
}
