package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.C15807j;

/* loaded from: classes12.dex */
public final class i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationService f120992a;

    public i(LocationService locationService) {
        this.f120992a = locationService;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CircularRegion circularRegion = (CircularRegion) obj;
        Intrinsics.j(circularRegion, "circularRegion");
        return (List) C15807j.b(null, new h(this.f120992a, circularRegion, (Integer) obj2, null), 1, null);
    }
}
