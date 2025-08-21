package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.nE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8963nE0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f77856a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77857b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77858c;

    public C8963nE0(String str, boolean z10, boolean z11) {
        this.f77856a = str;
        this.f77857b = z10;
        this.f77858c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C8963nE0.class) {
            C8963nE0 c8963nE0 = (C8963nE0) obj;
            if (TextUtils.equals(this.f77856a, c8963nE0.f77856a) && this.f77857b == c8963nE0.f77857b && this.f77858c == c8963nE0.f77858c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f77856a.hashCode() + 31) * 31) + (true != this.f77857b ? 1237 : 1231)) * 31) + (true != this.f77858c ? 1237 : 1231);
    }
}
