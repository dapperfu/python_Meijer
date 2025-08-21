package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class F0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f122825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(J0 j02, boolean z10, Function0 function0) {
        super(1);
        this.f122825a = j02;
        this.f122826b = z10;
        this.f122827c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f122825a.f122850h;
        if (oVar != null) {
            oVar.f122713d.stop();
        }
        J0 j02 = this.f122825a;
        if (j02.f122853k) {
            com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = j02.f122851i;
            if (oVar2 != null) {
                oVar2.f122713d.start();
            }
        } else {
            com.scandit.datacapture.barcode.internal.module.count.ui.o oVar3 = j02.f122851i;
            if (oVar3 != null) {
                if (this.f122826b) {
                    oVar3.f122713d.start();
                } else {
                    oVar3.f122713d.stop();
                }
            }
        }
        this.f122827c.invoke();
        return Unit.f143329a;
    }
}
