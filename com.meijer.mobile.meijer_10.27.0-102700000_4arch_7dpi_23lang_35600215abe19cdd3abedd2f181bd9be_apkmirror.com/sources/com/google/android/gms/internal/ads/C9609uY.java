package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9609uY extends XZ {

    /* renamed from: b, reason: collision with root package name */
    public final long f78859b;

    /* renamed from: c, reason: collision with root package name */
    public final List f78860c;

    /* renamed from: d, reason: collision with root package name */
    public final List f78861d;

    public C9609uY(int i10, long j10) {
        super(i10, null);
        this.f78859b = j10;
        this.f78860c = new ArrayList();
        this.f78861d = new ArrayList();
    }

    public final C9609uY b(int i10) {
        int size = this.f78861d.size();
        for (int i11 = 0; i11 < size; i11++) {
            C9609uY c9609uY = (C9609uY) this.f78861d.get(i11);
            if (c9609uY.f71346a == i10) {
                return c9609uY;
            }
        }
        return null;
    }

    public final VY c(int i10) {
        int size = this.f78860c.size();
        for (int i11 = 0; i11 < size; i11++) {
            VY vy = (VY) this.f78860c.get(i11);
            if (vy.f71346a == i10) {
                return vy;
            }
        }
        return null;
    }

    public final void d(C9609uY c9609uY) {
        this.f78861d.add(c9609uY);
    }

    public final void e(VY vy) {
        this.f78860c.add(vy);
    }

    @Override // com.google.android.gms.internal.ads.XZ
    public final String toString() {
        List list = this.f78860c;
        return XZ.a(this.f71346a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.f78861d.toArray());
    }
}
