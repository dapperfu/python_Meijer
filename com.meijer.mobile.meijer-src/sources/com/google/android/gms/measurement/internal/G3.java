package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    final Context f85869a;

    /* renamed from: b, reason: collision with root package name */
    Boolean f85870b;

    /* renamed from: c, reason: collision with root package name */
    long f85871c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.measurement.H0 f85872d;

    /* renamed from: e, reason: collision with root package name */
    boolean f85873e;

    /* renamed from: f, reason: collision with root package name */
    final Long f85874f;

    /* renamed from: g, reason: collision with root package name */
    String f85875g;

    public G3(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        this.f85873e = true;
        com.google.android.gms.common.internal.r.l(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.r.l(applicationContext);
        this.f85869a = applicationContext;
        this.f85874f = l10;
        if (h02 != null) {
            this.f85872d = h02;
            this.f85873e = h02.f82616c;
            this.f85871c = h02.f82615b;
            this.f85875g = h02.f82618e;
            Bundle bundle = h02.f82617d;
            if (bundle != null) {
                this.f85870b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
