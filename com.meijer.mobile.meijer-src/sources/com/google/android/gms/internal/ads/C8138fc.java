package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8138fc {

    /* renamed from: a, reason: collision with root package name */
    final long f74967a;

    /* renamed from: b, reason: collision with root package name */
    final String f74968b;

    /* renamed from: c, reason: collision with root package name */
    final int f74969c;

    C8138fc(long j10, String str, int i10) {
        this.f74967a = j10;
        this.f74968b = str;
        this.f74969c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C8138fc)) {
            C8138fc c8138fc = (C8138fc) obj;
            if (c8138fc.f74967a == this.f74967a && c8138fc.f74969c == this.f74969c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f74967a;
    }
}
