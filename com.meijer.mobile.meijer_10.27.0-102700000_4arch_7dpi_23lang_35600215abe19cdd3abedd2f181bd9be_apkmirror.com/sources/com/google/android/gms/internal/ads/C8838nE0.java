package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.nE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8838nE0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f77016a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77017b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77018c;

    public C8838nE0(String str, boolean z10, boolean z11) {
        this.f77016a = str;
        this.f77017b = z10;
        this.f77018c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C8838nE0.class) {
            C8838nE0 c8838nE0 = (C8838nE0) obj;
            if (TextUtils.equals(this.f77016a, c8838nE0.f77016a) && this.f77017b == c8838nE0.f77017b && this.f77018c == c8838nE0.f77018c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f77016a.hashCode() + 31) * 31) + (true != this.f77017b ? 1237 : 1231)) * 31) + (true != this.f77018c ? 1237 : 1231);
    }
}
