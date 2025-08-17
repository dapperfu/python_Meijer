package com.scandit.datacapture.barcode.batch.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeBatchDeserializer f120467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(BarcodeBatchDeserializer barcodeBatchDeserializer) {
        super(0);
        this.f120467a = barcodeBatchDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f120467a;
    }
}
