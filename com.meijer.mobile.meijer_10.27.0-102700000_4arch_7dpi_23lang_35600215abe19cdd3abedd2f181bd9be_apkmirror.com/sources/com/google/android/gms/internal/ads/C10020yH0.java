package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.yH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10020yH0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f80188g = new Comparator() { // from class: com.google.android.gms.internal.ads.tH0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C9806wH0) obj).f79463a - ((C9806wH0) obj2).f79463a;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f80189h = new Comparator() { // from class: com.google.android.gms.internal.ads.vH0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C9806wH0) obj).f79465c, ((C9806wH0) obj2).f79465c);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private int f80193d;

    /* renamed from: e, reason: collision with root package name */
    private int f80194e;

    /* renamed from: f, reason: collision with root package name */
    private int f80195f;

    /* renamed from: b, reason: collision with root package name */
    private final C9806wH0[] f80191b = new C9806wH0[5];

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f80190a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f80192c = -1;

    public final float a(float f10) {
        if (this.f80192c != 0) {
            Collections.sort(this.f80190a, f80189h);
            this.f80192c = 0;
        }
        float f11 = this.f80194e;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f80190a.size(); i11++) {
            float f12 = 0.5f * f11;
            C9806wH0 c9806wH0 = (C9806wH0) this.f80190a.get(i11);
            i10 += c9806wH0.f79464b;
            if (i10 >= f12) {
                return c9806wH0.f79465c;
            }
        }
        if (this.f80190a.isEmpty()) {
            return Float.NaN;
        }
        return ((C9806wH0) this.f80190a.get(r6.size() - 1)).f79465c;
    }

    public final void b(int i10, float f10) {
        C9806wH0 c9806wH0;
        if (this.f80192c != 1) {
            Collections.sort(this.f80190a, f80188g);
            this.f80192c = 1;
        }
        int i11 = this.f80195f;
        if (i11 > 0) {
            C9806wH0[] c9806wH0Arr = this.f80191b;
            int i12 = i11 - 1;
            this.f80195f = i12;
            c9806wH0 = c9806wH0Arr[i12];
        } else {
            c9806wH0 = new C9806wH0(null);
        }
        int i13 = this.f80193d;
        this.f80193d = i13 + 1;
        c9806wH0.f79463a = i13;
        c9806wH0.f79464b = i10;
        c9806wH0.f79465c = f10;
        this.f80190a.add(c9806wH0);
        this.f80194e += i10;
        while (true) {
            int i14 = this.f80194e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            C9806wH0 c9806wH02 = (C9806wH0) this.f80190a.get(0);
            int i16 = c9806wH02.f79464b;
            if (i16 <= i15) {
                this.f80194e -= i16;
                this.f80190a.remove(0);
                int i17 = this.f80195f;
                if (i17 < 5) {
                    C9806wH0[] c9806wH0Arr2 = this.f80191b;
                    this.f80195f = i17 + 1;
                    c9806wH0Arr2[i17] = c9806wH02;
                }
            } else {
                c9806wH02.f79464b = i16 - i15;
                this.f80194e -= i15;
            }
        }
    }

    public final void c() {
        this.f80190a.clear();
        this.f80192c = -1;
        this.f80193d = 0;
        this.f80194e = 0;
    }

    public C10020yH0(int i10) {
    }
}
