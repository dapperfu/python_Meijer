package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class w extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f121576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(B b10) {
        super(1);
        this.f121576a = b10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCluster cluster = (NativeCluster) obj;
        Intrinsics.j(cluster, "cluster");
        B b10 = this.f121576a;
        b10.getClass();
        Intrinsics.j(cluster, "cluster");
        b10.f121513b.didTapCluster(cluster);
        return Unit.f142422a;
    }
}
