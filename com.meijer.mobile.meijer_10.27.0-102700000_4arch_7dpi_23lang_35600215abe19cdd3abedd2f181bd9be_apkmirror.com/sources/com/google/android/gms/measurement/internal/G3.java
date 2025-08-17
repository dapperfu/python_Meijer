package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    final Context f85029a;

    /* renamed from: b, reason: collision with root package name */
    Boolean f85030b;

    /* renamed from: c, reason: collision with root package name */
    long f85031c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.measurement.H0 f85032d;

    /* renamed from: e, reason: collision with root package name */
    boolean f85033e;

    /* renamed from: f, reason: collision with root package name */
    final Long f85034f;

    /* renamed from: g, reason: collision with root package name */
    String f85035g;

    public G3(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        this.f85033e = true;
        com.google.android.gms.common.internal.r.l(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.r.l(applicationContext);
        this.f85029a = applicationContext;
        this.f85034f = l10;
        if (h02 != null) {
            this.f85032d = h02;
            this.f85033e = h02.f81776c;
            this.f85031c = h02.f81775b;
            this.f85035g = h02.f81778e;
            Bundle bundle = h02.f81777d;
            if (bundle != null) {
                this.f85030b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
