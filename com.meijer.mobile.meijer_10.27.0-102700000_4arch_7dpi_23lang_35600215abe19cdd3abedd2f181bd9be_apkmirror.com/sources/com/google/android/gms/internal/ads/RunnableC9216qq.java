package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.qq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9216qq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f77848a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7145Rq f77849b;

    RunnableC9216qq(C9322rq c9322rq, Context context, C7145Rq c7145Rq) {
        this.f77848a = context;
        this.f77849b = c7145Rq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f77849b.b(Ic.a.a(this.f77848a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.f77849b.c(e10);
            Qc.p.e("Exception while getting advertising Id info", e10);
        }
    }
}
