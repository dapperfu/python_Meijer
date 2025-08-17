package com.scandit.datacapture.barcode.data;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Barcode f120916a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Barcode barcode) {
        super(0);
        this.f120916a = barcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f120916a.getF120890a().asBarcodeRecord();
    }
}
