package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public class zzfz extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f80703a;

    public zzfz(int i10) {
        this.f80703a = i10;
    }

    public zzfz(String str, int i10) {
        super(str);
        this.f80703a = i10;
    }

    public zzfz(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f80703a = i10;
    }

    public zzfz(Throwable th2, int i10) {
        super(th2);
        this.f80703a = i10;
    }
}
