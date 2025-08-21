package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class m extends FunctionReferenceImpl implements Function1 {
    public m(Object obj) {
        super(1, obj, BarcodePickView.class, "onDrawerDataUpdated", "onDrawerDataUpdated(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView.access$onDrawerDataUpdated((BarcodePickView) this.receiver, ((Boolean) obj).booleanValue());
        return Unit.f143329a;
    }
}
