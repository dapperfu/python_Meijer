package com.scandit.datacapture.barcode.internal.module.find.ui.camera;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f123143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f123143a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        Intrinsics.j(view, "view");
        i iVar = (i) view;
        e eVar = this.f123143a;
        int childCount = eVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eVar.getChildAt(i10);
            Intrinsics.h(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.camera.ZoomButton");
            i iVar2 = (i) childAt;
            iVar2.setSelected(Intrinsics.e(iVar2, iVar));
        }
        float f10 = iVar.f123161b;
        if (eVar.f123148b != f10) {
            eVar.f123148b = f10;
            eVar.a();
        }
        e eVar2 = this.f123143a;
        Function1 function1 = eVar2.f123149c;
        if (function1 != null) {
            function1.invoke(Float.valueOf(eVar2.f123148b));
        }
        return Unit.f143329a;
    }
}
