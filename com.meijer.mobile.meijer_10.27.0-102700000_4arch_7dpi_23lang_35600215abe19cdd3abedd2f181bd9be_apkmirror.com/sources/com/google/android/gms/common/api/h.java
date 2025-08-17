package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.r;

/* loaded from: classes4.dex */
public final class h {
    public static g<Status> a(Status status, e eVar) {
        r.m(status, "Result must not be null");
        hd.r rVar = new hd.r(eVar);
        rVar.e(status);
        return rVar;
    }
}
