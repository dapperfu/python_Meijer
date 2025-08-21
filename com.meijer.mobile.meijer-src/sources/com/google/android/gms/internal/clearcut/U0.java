package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.util.VisibleForTesting;
import gd.C14346a;
import gd.C14351f;
import gd.InterfaceC14348c;
import jd.C14978a;

/* loaded from: classes6.dex */
public final class U0 extends com.google.android.gms.common.api.d<a.d.c> implements InterfaceC14348c {
    @VisibleForTesting
    private U0(Context context) {
        super(context, C14346a.f134132p, (a.d) null, new C14978a());
    }

    public static InterfaceC14348c p(Context context) {
        return new U0(context);
    }

    @Override // gd.InterfaceC14348c
    public final com.google.android.gms.common.api.g<Status> k(C14351f c14351f) {
        return doBestEffortWrite((U0) new h2(c14351f, asGoogleApiClient()));
    }
}
