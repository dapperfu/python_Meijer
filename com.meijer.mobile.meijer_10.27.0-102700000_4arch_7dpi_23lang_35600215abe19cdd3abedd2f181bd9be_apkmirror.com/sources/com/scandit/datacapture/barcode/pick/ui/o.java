package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BarcodePickView barcodePickView) {
        super(1);
        this.f123735a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0 block = (Function0) obj;
        Intrinsics.j(block, "block");
        ViewExtensionsKt.runOnMainThread(this.f123735a, new n(block));
        return Unit.f142422a;
    }
}
