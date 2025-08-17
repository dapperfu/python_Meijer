package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6636Cq {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f65839a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f65840b = "0";

    public final synchronized String a() {
        String string;
        string = this.f65839a.toString();
        this.f65839a = this.f65839a.add(BigInteger.ONE);
        this.f65840b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f65840b;
    }
}
