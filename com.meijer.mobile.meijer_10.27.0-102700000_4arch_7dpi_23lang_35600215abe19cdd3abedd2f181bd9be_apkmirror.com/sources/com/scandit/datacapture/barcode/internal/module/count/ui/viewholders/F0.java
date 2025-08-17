package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class F0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f121873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(J0 j02, boolean z10, Function0 function0) {
        super(1);
        this.f121873a = j02;
        this.f121874b = z10;
        this.f121875c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f121873a.f121898h;
        if (oVar != null) {
            oVar.f121761d.stop();
        }
        J0 j02 = this.f121873a;
        if (j02.f121901k) {
            com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = j02.f121899i;
            if (oVar2 != null) {
                oVar2.f121761d.start();
            }
        } else {
            com.scandit.datacapture.barcode.internal.module.count.ui.o oVar3 = j02.f121899i;
            if (oVar3 != null) {
                if (this.f121874b) {
                    oVar3.f121761d.start();
                } else {
                    oVar3.f121761d.stop();
                }
            }
        }
        this.f121875c.invoke();
        return Unit.f142422a;
    }
}
