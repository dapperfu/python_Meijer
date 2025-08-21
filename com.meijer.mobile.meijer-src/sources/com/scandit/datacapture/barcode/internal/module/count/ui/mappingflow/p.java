package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class p extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122691a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar) {
        super(1);
        this.f122691a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.j(context, "context");
        m mVar = new m(context);
        r rVar = this.f122691a;
        mVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        rVar.f122695b = mVar;
        return mVar;
    }
}
