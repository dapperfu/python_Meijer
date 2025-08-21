package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class v extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f122527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context) {
        super(1);
        this.f122527a = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        return new p(this.f122527a);
    }
}
