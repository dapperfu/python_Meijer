package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f122679a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f122679a = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.j(context, "context");
        e eVar = new e(context);
        j jVar = this.f122679a;
        eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        jVar.f122682b = eVar;
        return eVar;
    }
}
