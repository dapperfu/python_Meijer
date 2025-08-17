package com.google.android.gms.common.api;

import gd.C14244c;

/* loaded from: classes4.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C14244c f64746a;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f64746a));
    }

    public UnsupportedApiCallException(C14244c c14244c) {
        this.f64746a = c14244c;
    }
}
