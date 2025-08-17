package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C16646j;

/* loaded from: classes11.dex */
public final class i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f120046a;

    public i(LocationService locationService) {
        this.f120046a = locationService;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CircularRegion circularRegion = (CircularRegion) obj;
        Intrinsics.j(circularRegion, "circularRegion");
        return (List) C16646j.b(null, new h(this.f120046a, circularRegion, (Integer) obj2, null), 1, null);
    }
}
