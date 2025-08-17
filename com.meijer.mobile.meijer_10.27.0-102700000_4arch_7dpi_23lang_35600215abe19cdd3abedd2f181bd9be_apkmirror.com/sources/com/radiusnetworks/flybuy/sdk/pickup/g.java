package com.radiusnetworks.flybuy.sdk.pickup;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f120009b = new g();

    public g() {
        super(1, PickupManager.class, "<init>", "<init>(Lkotlin/Unit;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new PickupManager((Unit) obj, null);
    }
}
