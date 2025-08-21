package com.google.android.gms.common.api;

import id.C14720c;

/* loaded from: classes4.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C14720c f65586a;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f65586a));
    }

    public UnsupportedApiCallException(C14720c c14720c) {
        this.f65586a = c14720c;
    }
}
