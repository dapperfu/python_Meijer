package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MDExternalError;

/* loaded from: classes7.dex */
class a3 extends MedalliaDigitalError {

    /* renamed from: a, reason: collision with root package name */
    private final MDExternalError f91604a;

    protected a3(int i10, MDExternalError.ExternalError externalError, String str) {
        super(i10, str);
        this.f91604a = externalError != null ? new MDExternalError(externalError) : null;
    }

    protected MDExternalError a() {
        return this.f91604a;
    }
}
