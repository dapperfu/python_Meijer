package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f123521a = new d();

    public d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SubView it = (SubView) obj;
        Intrinsics.j(it, "it");
        it.setAlpha(0.0f);
        return Unit.f142422a;
    }
}
