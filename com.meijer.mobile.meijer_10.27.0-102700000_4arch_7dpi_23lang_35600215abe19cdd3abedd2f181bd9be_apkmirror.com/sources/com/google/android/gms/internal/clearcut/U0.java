package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.util.VisibleForTesting;
import ed.C13642a;
import ed.C13647f;
import ed.InterfaceC13644c;
import hd.C14400a;

/* loaded from: classes6.dex */
public final class U0 extends com.google.android.gms.common.api.d<a.d.c> implements InterfaceC13644c {
    @VisibleForTesting
    private U0(Context context) {
        super(context, C13642a.f128664p, (a.d) null, new C14400a());
    }

    public static InterfaceC13644c p(Context context) {
        return new U0(context);
    }

    @Override // ed.InterfaceC13644c
    public final com.google.android.gms.common.api.g<Status> f(C13647f c13647f) {
        return doBestEffortWrite((U0) new h2(c13647f, asGoogleApiClient()));
    }
}
