package com.scandit.datacapture.barcode.internal.module.find.ui.camera;

import android.view.View;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f123142a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(1);
        this.f123142a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        Intrinsics.j(view, "view");
        e eVar = this.f123142a;
        eVar.getClass();
        float f10 = ((i) view).f123161b;
        Iterator it = eVar.f123147a.iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Math.abs(((Number) it.next()).floatValue() - f10) < 0.001f) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && i11 != CollectionsKt.o(eVar.f123147a)) {
            i10 = i11 + 1;
        }
        eVar.a(((Number) eVar.f123147a.get(i10)).floatValue());
        e eVar2 = this.f123142a;
        Function1 function1 = eVar2.f123149c;
        if (function1 != null) {
            function1.invoke(Float.valueOf(eVar2.f123148b));
        }
        return Unit.f143329a;
    }
}
