package com.radiusnetworks.flybuy.sdk.pickup.service;

import Ld.AbstractC4021k;
import android.location.Location;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Intrinsics;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;

/* loaded from: classes12.dex */
public final class j extends AbstractC4021k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f120993a;

    public j(t tVar) {
        this.f120993a = tVar;
    }

    @Override // Ld.AbstractC4021k
    public final void b(LocationResult locationResult) {
        Intrinsics.j(locationResult, "locationResult");
        for (Location location : locationResult.T()) {
            t tVar = this.f120993a;
            Intrinsics.g(location);
            C15809k.d(C15784P.a(C15800f0.b()), null, null, new n(tVar, location, null), 3, null);
        }
    }
}
