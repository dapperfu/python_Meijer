package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f122488a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f122488a = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCluster cluster = (NativeCluster) obj;
        Intrinsics.j(cluster, "cluster");
        Function1 function1 = this.f122488a.f122500g;
        if (function1 != null) {
            function1.invoke(cluster);
        }
        this.f122488a.performClick();
        return Unit.f143329a;
    }
}
