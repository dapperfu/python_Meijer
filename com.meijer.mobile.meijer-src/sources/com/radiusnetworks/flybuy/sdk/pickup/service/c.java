package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: f, reason: collision with root package name */
    public static final c f120976f = new c();

    public c() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            return null;
        }
        return FlyBuyCore.getOrders().getBeaconRegionsForOrder(num.intValue());
    }
}
