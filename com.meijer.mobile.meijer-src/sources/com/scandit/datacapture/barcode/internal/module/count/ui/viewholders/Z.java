package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Z extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13243e0 f122902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C13243e0 c13243e0) {
        super(1);
        this.f122902a = c13243e0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        return this.f122902a.a(it);
    }
}
