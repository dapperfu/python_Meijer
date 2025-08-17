package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13166k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13168m f122225a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13166k(C13168m c13168m) {
        super(1);
        this.f122225a = c13168m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13168m it = (C13168m) obj;
        Intrinsics.j(it, "it");
        this.f122225a.invalidate();
        return Unit.f142422a;
    }
}
