package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(BarcodePickView barcodePickView) {
        super(1);
        this.f123740a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView it = (BarcodePickView) obj;
        Intrinsics.j(it, "it");
        this.f123740a.f123657e.b();
        this.f123740a.f123657e.d();
        return Unit.f142422a;
    }
}
