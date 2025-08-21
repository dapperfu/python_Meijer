package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class G0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f122828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(J0 j02, boolean z10, Function0 function0) {
        super(1);
        this.f122828a = j02;
        this.f122829b = z10;
        this.f122830c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f122828a.f122850h;
        if (oVar != null) {
            if (this.f122829b) {
                oVar.f122713d.start();
            } else {
                oVar.f122713d.stop();
            }
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = this.f122828a.f122851i;
        if (oVar2 != null) {
            oVar2.f122713d.stop();
        }
        this.f122830c.invoke();
        return Unit.f143329a;
    }
}
