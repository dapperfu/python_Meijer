package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.rt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9328rt {

    /* renamed from: e, reason: collision with root package name */
    public static final C9328rt f78079e = new C9328rt(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f78080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78081b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78083d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9328rt)) {
            return false;
        }
        C9328rt c9328rt = (C9328rt) obj;
        return this.f78080a == c9328rt.f78080a && this.f78081b == c9328rt.f78081b && this.f78082c == c9328rt.f78082c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f78080a), Integer.valueOf(this.f78081b), Integer.valueOf(this.f78082c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f78080a + ", channelCount=" + this.f78081b + ", encoding=" + this.f78082c + "]";
    }

    public C9328rt(int i10, int i11, int i12) {
        int iC;
        this.f78080a = i10;
        this.f78081b = i11;
        this.f78082c = i12;
        if (OV.j(i12)) {
            iC = OV.C(i12) * i11;
        } else {
            iC = -1;
        }
        this.f78083d = iC;
    }
}
