package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.qq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9341qq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f78688a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7270Rq f78689b;

    RunnableC9341qq(C9447rq c9447rq, Context context, C7270Rq c7270Rq) {
        this.f78688a = context;
        this.f78689b = c7270Rq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f78689b.b(Kc.a.a(this.f78688a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.f78689b.c(e10);
            Sc.p.e("Exception while getting advertising Id info", e10);
        }
    }
}
