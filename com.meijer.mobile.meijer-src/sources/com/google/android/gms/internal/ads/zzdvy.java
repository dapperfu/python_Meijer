package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public class zzdvy extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f81539a;

    public zzdvy(int i10) {
        this.f81539a = i10;
    }

    public final int a() {
        return this.f81539a;
    }

    public zzdvy(int i10, String str) {
        super(str);
        this.f81539a = i10;
    }

    public zzdvy(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f81539a = 1;
    }
}
