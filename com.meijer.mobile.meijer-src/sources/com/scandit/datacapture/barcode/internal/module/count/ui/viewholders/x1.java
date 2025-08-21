package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class x1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f123056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f123057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f123058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f123059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(boolean z10, y1 y1Var, String str, Function0 function0) {
        super(1);
        this.f123056a = z10;
        this.f123057b = y1Var;
        this.f123058c = str;
        this.f123059d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        if (this.f123056a) {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar = this.f123057b.f123063b;
            if (lVar != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j jVar = com.scandit.datacapture.barcode.internal.module.ui.j.f124293c;
                String str = this.f123058c;
                if (str == null) {
                    str = "";
                }
                lVar.a(jVar, str);
            }
        } else {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar2 = this.f123057b.f123063b;
            if (lVar2 != null) {
                com.scandit.datacapture.barcode.internal.module.ui.j guidanceState = com.scandit.datacapture.barcode.internal.module.ui.j.f124293c;
                Intrinsics.j(guidanceState, "guidanceState");
                if (lVar2.f124301d == guidanceState) {
                    lVar2.a();
                }
            }
        }
        this.f123059d.invoke();
        return Unit.f143329a;
    }
}
