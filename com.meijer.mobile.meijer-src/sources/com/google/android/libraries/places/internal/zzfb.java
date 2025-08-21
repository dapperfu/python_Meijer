package com.google.android.libraries.places.internal;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5509c;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzfb implements InterfaceC5509c {
    @Override // Vd.InterfaceC5509c
    public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) throws Exception {
        C5517k c5517k = new C5517k();
        if (abstractC5516j.p()) {
            c5517k.d(new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (abstractC5516j.m() == null && abstractC5516j.n() == null) {
            c5517k.d(new ApiException(new Status(8, "Location unavailable.")));
        }
        return c5517k.a().m() != null ? c5517k.a() : abstractC5516j;
    }

    zzfb(zzfc zzfcVar) {
        Objects.requireNonNull(zzfcVar);
    }
}
