package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f122530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b10) {
        super(1);
        this.f122530a = b10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p it = (p) obj;
        Intrinsics.j(it, "it");
        p pVar = (p) this.f122530a.f122469f.b();
        List items = CollectionsKt.m();
        pVar.getClass();
        Intrinsics.j(items, "items");
        pVar.f122507a = items;
        pVar.invalidate();
        return Unit.f143329a;
    }
}
