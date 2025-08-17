package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f121578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b10) {
        super(1);
        this.f121578a = b10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p it = (p) obj;
        Intrinsics.j(it, "it");
        p pVar = (p) this.f121578a.f121517f.b();
        List items = CollectionsKt.m();
        pVar.getClass();
        Intrinsics.j(items, "items");
        pVar.f121555a = items;
        pVar.invalidate();
        return Unit.f142422a;
    }
}
