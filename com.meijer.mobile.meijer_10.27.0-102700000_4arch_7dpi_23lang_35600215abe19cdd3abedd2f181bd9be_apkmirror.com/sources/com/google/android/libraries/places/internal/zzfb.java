package com.google.android.libraries.places.internal;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5225c;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzfb implements InterfaceC5225c {
    @Override // Td.InterfaceC5225c
    public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) throws Exception {
        C5233k c5233k = new C5233k();
        if (abstractC5232j.p()) {
            c5233k.d(new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (abstractC5232j.m() == null && abstractC5232j.n() == null) {
            c5233k.d(new ApiException(new Status(8, "Location unavailable.")));
        }
        return c5233k.a().m() != null ? c5233k.a() : abstractC5232j;
    }

    zzfb(zzfc zzfcVar) {
        Objects.requireNonNull(zzfcVar);
    }
}
