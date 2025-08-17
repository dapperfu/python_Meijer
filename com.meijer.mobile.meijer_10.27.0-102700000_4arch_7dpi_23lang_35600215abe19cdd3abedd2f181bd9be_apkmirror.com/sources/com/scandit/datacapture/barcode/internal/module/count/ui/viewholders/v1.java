package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class v1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f122085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f122086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f122087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f122088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(boolean z10, y1 y1Var, String str, Function0 function0) {
        super(1);
        this.f122085a = z10;
        this.f122086b = y1Var;
        this.f122087c = str;
        this.f122088d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        if (this.f122085a) {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar = this.f122086b.f122111b;
            if (lVar != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j jVar = com.scandit.datacapture.barcode.internal.module.ui.j.f123342d;
                String str = this.f122087c;
                if (str == null) {
                    str = "";
                }
                lVar.a(jVar, str);
            }
        } else {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar2 = this.f122086b.f122111b;
            if (lVar2 != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j guidanceState = com.scandit.datacapture.barcode.internal.module.ui.j.f123342d;
                Intrinsics.j(guidanceState, "guidanceState");
                if (lVar2.f123349d == guidanceState) {
                    lVar2.a();
                }
            }
        }
        this.f122088d.invoke();
        return Unit.f142422a;
    }
}
