package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class QA0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f69532a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC7307Wl f69533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69534c;

    /* renamed from: d, reason: collision with root package name */
    public final C7453aF0 f69535d;

    /* renamed from: e, reason: collision with root package name */
    public final long f69536e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC7307Wl f69537f;

    /* renamed from: g, reason: collision with root package name */
    public final int f69538g;

    /* renamed from: h, reason: collision with root package name */
    public final C7453aF0 f69539h;

    /* renamed from: i, reason: collision with root package name */
    public final long f69540i;

    /* renamed from: j, reason: collision with root package name */
    public final long f69541j;

    public QA0(long j10, AbstractC7307Wl abstractC7307Wl, int i10, C7453aF0 c7453aF0, long j11, AbstractC7307Wl abstractC7307Wl2, int i11, C7453aF0 c7453aF02, long j12, long j13) {
        this.f69532a = j10;
        this.f69533b = abstractC7307Wl;
        this.f69534c = i10;
        this.f69535d = c7453aF0;
        this.f69536e = j11;
        this.f69537f = abstractC7307Wl2;
        this.f69538g = i11;
        this.f69539h = c7453aF02;
        this.f69540i = j12;
        this.f69541j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && QA0.class == obj.getClass()) {
            QA0 qa0 = (QA0) obj;
            if (this.f69532a == qa0.f69532a && this.f69534c == qa0.f69534c && this.f69536e == qa0.f69536e && this.f69538g == qa0.f69538g && this.f69540i == qa0.f69540i && this.f69541j == qa0.f69541j && C6555Af0.a(this.f69533b, qa0.f69533b) && C6555Af0.a(this.f69535d, qa0.f69535d) && C6555Af0.a(this.f69537f, qa0.f69537f) && C6555Af0.a(this.f69539h, qa0.f69539h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f69532a), this.f69533b, Integer.valueOf(this.f69534c), this.f69535d, Long.valueOf(this.f69536e), this.f69537f, Integer.valueOf(this.f69538g), this.f69539h, Long.valueOf(this.f69540i), Long.valueOf(this.f69541j)});
    }
}
