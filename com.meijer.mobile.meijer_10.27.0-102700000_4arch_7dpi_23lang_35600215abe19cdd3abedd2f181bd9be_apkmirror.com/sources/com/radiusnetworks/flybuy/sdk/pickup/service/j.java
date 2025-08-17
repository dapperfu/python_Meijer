package com.radiusnetworks.flybuy.sdk.pickup.service;

import Jd.AbstractC3777k;
import android.location.Location;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Intrinsics;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;

/* loaded from: classes11.dex */
public final class j extends AbstractC3777k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f120047a;

    public j(t tVar) {
        this.f120047a = tVar;
    }

    @Override // Jd.AbstractC3777k
    public final void b(LocationResult locationResult) {
        Intrinsics.j(locationResult, "locationResult");
        for (Location location : locationResult.T()) {
            t tVar = this.f120047a;
            Intrinsics.g(location);
            tVar.getClass();
            C16648k.d(C16623P.a(C16639f0.b()), null, null, new n(tVar, location, null), 3, null);
        }
    }
}
