package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6761Cq {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f66679a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f66680b = "0";

    public final synchronized String a() {
        String string;
        string = this.f66679a.toString();
        this.f66679a = this.f66679a.add(BigInteger.ONE);
        this.f66680b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f66680b;
    }
}
