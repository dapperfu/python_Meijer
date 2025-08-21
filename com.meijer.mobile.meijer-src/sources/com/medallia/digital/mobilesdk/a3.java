package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MDExternalError;

/* loaded from: classes8.dex */
class a3 extends MedalliaDigitalError {

    /* renamed from: a, reason: collision with root package name */
    private final MDExternalError f92443a;

    protected a3(int i10, MDExternalError.ExternalError externalError, String str) {
        super(i10, str);
        this.f92443a = externalError != null ? new MDExternalError(externalError) : null;
    }

    protected MDExternalError a() {
        return this.f92443a;
    }
}
