package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes4.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private final int f64724a;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f64724a = i10;
    }
}
