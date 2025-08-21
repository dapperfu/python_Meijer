package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class J extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(O o10) {
        super(0);
        this.f123799a = o10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC13328h interfaceC13328h = this.f123799a.f123813h;
        if (interfaceC13328h != null) {
            interfaceC13328h.onCameraOnEnd();
        }
        return Unit.f143329a;
    }
}
