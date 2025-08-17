package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class z extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f121579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f121580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(B b10, List list) {
        super(1);
        this.f121579a = b10;
        this.f121580b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p it = (p) obj;
        Intrinsics.j(it, "it");
        p pVar = (p) this.f121579a.f121517f.b();
        List items = this.f121580b;
        pVar.getClass();
        Intrinsics.j(items, "items");
        pVar.f121555a = items;
        pVar.invalidate();
        j jVar = (j) this.f121579a.f121519h.b();
        List items2 = this.f121580b;
        jVar.getClass();
        Intrinsics.j(items2, "items");
        jVar.f121542a = items2;
        jVar.invalidate();
        return Unit.f142422a;
    }
}
