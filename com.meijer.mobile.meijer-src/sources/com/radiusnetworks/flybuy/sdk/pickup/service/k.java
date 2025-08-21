package com.radiusnetworks.flybuy.sdk.pickup.service;

import Ld.InterfaceC4013c;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.pickup.data.LocationFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationService f120994a;

    public k(LocationService locationService) {
        this.f120994a = locationService;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Order order = (Order) obj;
        LocationFilter locationFilter = (LocationFilter) obj2;
        Intrinsics.j(locationFilter, "locationFilter");
        j jVar = null;
        if (!Intrinsics.e(this.f120994a.f121016l.e(), order != null ? Integer.valueOf(order.getId()) : null)) {
            this.f120994a.f121016l.m(order != null ? Integer.valueOf(order.getId()) : null);
            this.f120994a.f();
        }
        if (!Intrinsics.e(locationFilter, this.f120994a.f121017m)) {
            LocationService locationService = this.f120994a;
            locationService.f121017m = locationFilter;
            if (locationService.f121012h) {
                LogExtensionsKt.logd(locationService, true, "Removing location updates");
                InterfaceC4013c interfaceC4013c = locationService.f121009e;
                if (interfaceC4013c == null) {
                    Intrinsics.x("locationClient");
                    interfaceC4013c = null;
                }
                j jVar2 = locationService.f121010f;
                if (jVar2 == null) {
                    Intrinsics.x("locationCallback");
                } else {
                    jVar = jVar2;
                }
                interfaceC4013c.f(jVar);
                locationService.f121012h = false;
            }
            locationService.d();
        }
        return Unit.f143329a;
    }
}
