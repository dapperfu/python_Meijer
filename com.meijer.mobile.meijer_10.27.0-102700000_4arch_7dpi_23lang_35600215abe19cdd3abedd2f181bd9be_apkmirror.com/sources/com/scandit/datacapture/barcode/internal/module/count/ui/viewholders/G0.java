package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class G0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f121876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(J0 j02, boolean z10, Function0 function0) {
        super(1);
        this.f121876a = j02;
        this.f121877b = z10;
        this.f121878c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f121876a.f121898h;
        if (oVar != null) {
            if (this.f121877b) {
                oVar.f121761d.start();
            } else {
                oVar.f121761d.stop();
            }
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = this.f121876a.f121899i;
        if (oVar2 != null) {
            oVar2.f121761d.stop();
        }
        this.f121878c.invoke();
        return Unit.f142422a;
    }
}
