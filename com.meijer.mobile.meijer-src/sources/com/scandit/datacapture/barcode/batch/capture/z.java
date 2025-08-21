package com.scandit.datacapture.barcode.batch.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeBatchDeserializer f121419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(BarcodeBatchDeserializer barcodeBatchDeserializer) {
        super(0);
        this.f121419a = barcodeBatchDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121419a;
    }
}
