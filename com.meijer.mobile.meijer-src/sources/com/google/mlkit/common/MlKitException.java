package com.google.mlkit.common;

import com.google.android.gms.common.internal.r;

/* loaded from: classes8.dex */
public class MlKitException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f91232a;

    public MlKitException(String str, int i10) {
        super(r.g(str, "Provided message must not be empty."));
        this.f91232a = i10;
    }

    public int a() {
        return this.f91232a;
    }

    public MlKitException(String str, int i10, Throwable th2) {
        super(r.g(str, "Provided message must not be empty."), th2);
        this.f91232a = i10;
    }
}
