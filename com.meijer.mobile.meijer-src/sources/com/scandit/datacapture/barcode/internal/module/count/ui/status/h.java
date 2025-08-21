package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f122753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, boolean z10) {
        super(0);
        this.f122753a = mVar;
        this.f122754b = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122753a.a(true, this.f122754b);
        return Unit.f143329a;
    }
}
