package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9734uY extends XZ {

    /* renamed from: b, reason: collision with root package name */
    public final long f79699b;

    /* renamed from: c, reason: collision with root package name */
    public final List f79700c;

    /* renamed from: d, reason: collision with root package name */
    public final List f79701d;

    public C9734uY(int i10, long j10) {
        super(i10, null);
        this.f79699b = j10;
        this.f79700c = new ArrayList();
        this.f79701d = new ArrayList();
    }

    public final C9734uY b(int i10) {
        int size = this.f79701d.size();
        for (int i11 = 0; i11 < size; i11++) {
            C9734uY c9734uY = (C9734uY) this.f79701d.get(i11);
            if (c9734uY.f72186a == i10) {
                return c9734uY;
            }
        }
        return null;
    }

    public final VY c(int i10) {
        int size = this.f79700c.size();
        for (int i11 = 0; i11 < size; i11++) {
            VY vy = (VY) this.f79700c.get(i11);
            if (vy.f72186a == i10) {
                return vy;
            }
        }
        return null;
    }

    public final void d(C9734uY c9734uY) {
        this.f79701d.add(c9734uY);
    }

    public final void e(VY vy) {
        this.f79700c.add(vy);
    }

    @Override // com.google.android.gms.internal.ads.XZ
    public final String toString() {
        List list = this.f79700c;
        return XZ.a(this.f72186a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.f79701d.toArray());
    }
}
