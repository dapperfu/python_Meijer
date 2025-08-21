package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class QA0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f70372a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC7432Wl f70373b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70374c;

    /* renamed from: d, reason: collision with root package name */
    public final C7578aF0 f70375d;

    /* renamed from: e, reason: collision with root package name */
    public final long f70376e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC7432Wl f70377f;

    /* renamed from: g, reason: collision with root package name */
    public final int f70378g;

    /* renamed from: h, reason: collision with root package name */
    public final C7578aF0 f70379h;

    /* renamed from: i, reason: collision with root package name */
    public final long f70380i;

    /* renamed from: j, reason: collision with root package name */
    public final long f70381j;

    public QA0(long j10, AbstractC7432Wl abstractC7432Wl, int i10, C7578aF0 c7578aF0, long j11, AbstractC7432Wl abstractC7432Wl2, int i11, C7578aF0 c7578aF02, long j12, long j13) {
        this.f70372a = j10;
        this.f70373b = abstractC7432Wl;
        this.f70374c = i10;
        this.f70375d = c7578aF0;
        this.f70376e = j11;
        this.f70377f = abstractC7432Wl2;
        this.f70378g = i11;
        this.f70379h = c7578aF02;
        this.f70380i = j12;
        this.f70381j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && QA0.class == obj.getClass()) {
            QA0 qa0 = (QA0) obj;
            if (this.f70372a == qa0.f70372a && this.f70374c == qa0.f70374c && this.f70376e == qa0.f70376e && this.f70378g == qa0.f70378g && this.f70380i == qa0.f70380i && this.f70381j == qa0.f70381j && C6680Af0.a(this.f70373b, qa0.f70373b) && C6680Af0.a(this.f70375d, qa0.f70375d) && C6680Af0.a(this.f70377f, qa0.f70377f) && C6680Af0.a(this.f70379h, qa0.f70379h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f70372a), this.f70373b, Integer.valueOf(this.f70374c), this.f70375d, Long.valueOf(this.f70376e), this.f70377f, Integer.valueOf(this.f70378g), this.f70379h, Long.valueOf(this.f70380i), Long.valueOf(this.f70381j)});
    }
}
