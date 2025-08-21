package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public class zzgyg extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private boolean f81546a;

    public zzgyg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.f81546a = true;
    }

    final boolean b() {
        return this.f81546a;
    }

    public zzgyg(String str) {
        super(str);
    }
}
