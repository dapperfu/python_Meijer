package com.radiusnetworks.flybuy.sdk.pickup.service;

import Jd.InterfaceC3769c;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f120048a;

    public k(LocationService locationService) {
        this.f120048a = locationService;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Order order = (Order) obj;
        com.radiusnetworks.flybuy.sdk.pickup.data.a locationFilter = (com.radiusnetworks.flybuy.sdk.pickup.data.a) obj2;
        Intrinsics.j(locationFilter, "locationFilter");
        j jVar = null;
        if (!Intrinsics.e(this.f120048a.f120069l.e(), order != null ? Integer.valueOf(order.getId()) : null)) {
            this.f120048a.f120069l.m(order != null ? Integer.valueOf(order.getId()) : null);
            this.f120048a.e();
        }
        if (!Intrinsics.e(locationFilter, this.f120048a.f120070m)) {
            t tVar = this.f120048a;
            tVar.f120070m = locationFilter;
            if (tVar.f120065h) {
                LogExtensionsKt.logd(tVar, true, "Removing location updates");
                InterfaceC3769c interfaceC3769c = tVar.f120062e;
                if (interfaceC3769c == null) {
                    Intrinsics.y("locationClient");
                    interfaceC3769c = null;
                }
                j jVar2 = tVar.f120063f;
                if (jVar2 == null) {
                    Intrinsics.y("locationCallback");
                    jVar2 = null;
                }
                interfaceC3769c.h(jVar2);
                tVar.f120065h = false;
            }
            if (!tVar.f120065h) {
                StringBuilder sb2 = new StringBuilder("Requesting location updates with ");
                LocationRequest locationRequestB = LocationRequest.B();
                Intrinsics.i(locationRequestB, "create(...)");
                com.radiusnetworks.flybuy.sdk.pickup.data.a aVar = tVar.f120070m;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j10 = (long) aVar.f119989b;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                locationRequestB.J2(timeUnit.convert(j10, timeUnit2));
                locationRequestB.l2(1000L);
                locationRequestB.M2(aVar.f119990c);
                locationRequestB.O2(aVar.f119991d);
                sb2.append(locationRequestB);
                LogExtensionsKt.logd(tVar, true, sb2.toString());
                InterfaceC3769c interfaceC3769c2 = tVar.f120062e;
                if (interfaceC3769c2 == null) {
                    Intrinsics.y("locationClient");
                    interfaceC3769c2 = null;
                }
                LocationRequest locationRequestB2 = LocationRequest.B();
                Intrinsics.i(locationRequestB2, "create(...)");
                com.radiusnetworks.flybuy.sdk.pickup.data.a aVar2 = tVar.f120070m;
                locationRequestB2.J2(timeUnit.convert((long) aVar2.f119989b, timeUnit2));
                locationRequestB2.l2(1000L);
                locationRequestB2.M2(aVar2.f119990c);
                locationRequestB2.O2(aVar2.f119991d);
                j jVar3 = tVar.f120063f;
                if (jVar3 == null) {
                    Intrinsics.y("locationCallback");
                } else {
                    jVar = jVar3;
                }
                interfaceC3769c2.m(locationRequestB2, jVar, Looper.getMainLooper());
                tVar.f120065h = true;
            }
        }
        return Unit.f142422a;
    }
}
