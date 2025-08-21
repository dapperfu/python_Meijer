package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6645b {
    public static ApiException a(Status status) {
        if (status.I0()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
