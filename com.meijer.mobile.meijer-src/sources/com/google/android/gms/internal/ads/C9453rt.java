package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.rt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9453rt {

    /* renamed from: e, reason: collision with root package name */
    public static final C9453rt f78919e = new C9453rt(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f78920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78921b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78922c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78923d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9453rt)) {
            return false;
        }
        C9453rt c9453rt = (C9453rt) obj;
        return this.f78920a == c9453rt.f78920a && this.f78921b == c9453rt.f78921b && this.f78922c == c9453rt.f78922c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f78920a), Integer.valueOf(this.f78921b), Integer.valueOf(this.f78922c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f78920a + ", channelCount=" + this.f78921b + ", encoding=" + this.f78922c + "]";
    }

    public C9453rt(int i10, int i11, int i12) {
        int iC;
        this.f78920a = i10;
        this.f78921b = i11;
        this.f78922c = i12;
        if (OV.j(i12)) {
            iC = OV.C(i12) * i11;
        } else {
            iC = -1;
        }
        this.f78923d = iC;
    }
}
