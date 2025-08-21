package com.scandit.datacapture.barcode.data;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Barcode f121868a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Barcode barcode) {
        super(0);
        this.f121868a = barcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121868a.getF121842a().asBarcodeRecord();
    }
}
