package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.yH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10145yH0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f81028g = new Comparator() { // from class: com.google.android.gms.internal.ads.tH0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C9931wH0) obj).f80303a - ((C9931wH0) obj2).f80303a;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f81029h = new Comparator() { // from class: com.google.android.gms.internal.ads.vH0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C9931wH0) obj).f80305c, ((C9931wH0) obj2).f80305c);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private int f81033d;

    /* renamed from: e, reason: collision with root package name */
    private int f81034e;

    /* renamed from: f, reason: collision with root package name */
    private int f81035f;

    /* renamed from: b, reason: collision with root package name */
    private final C9931wH0[] f81031b = new C9931wH0[5];

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f81030a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f81032c = -1;

    public final float a(float f10) {
        if (this.f81032c != 0) {
            Collections.sort(this.f81030a, f81029h);
            this.f81032c = 0;
        }
        float f11 = this.f81034e;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f81030a.size(); i11++) {
            float f12 = 0.5f * f11;
            C9931wH0 c9931wH0 = (C9931wH0) this.f81030a.get(i11);
            i10 += c9931wH0.f80304b;
            if (i10 >= f12) {
                return c9931wH0.f80305c;
            }
        }
        if (this.f81030a.isEmpty()) {
            return Float.NaN;
        }
        return ((C9931wH0) this.f81030a.get(r6.size() - 1)).f80305c;
    }

    public final void b(int i10, float f10) {
        C9931wH0 c9931wH0;
        if (this.f81032c != 1) {
            Collections.sort(this.f81030a, f81028g);
            this.f81032c = 1;
        }
        int i11 = this.f81035f;
        if (i11 > 0) {
            C9931wH0[] c9931wH0Arr = this.f81031b;
            int i12 = i11 - 1;
            this.f81035f = i12;
            c9931wH0 = c9931wH0Arr[i12];
        } else {
            c9931wH0 = new C9931wH0(null);
        }
        int i13 = this.f81033d;
        this.f81033d = i13 + 1;
        c9931wH0.f80303a = i13;
        c9931wH0.f80304b = i10;
        c9931wH0.f80305c = f10;
        this.f81030a.add(c9931wH0);
        this.f81034e += i10;
        while (true) {
            int i14 = this.f81034e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            C9931wH0 c9931wH02 = (C9931wH0) this.f81030a.get(0);
            int i16 = c9931wH02.f80304b;
            if (i16 <= i15) {
                this.f81034e -= i16;
                this.f81030a.remove(0);
                int i17 = this.f81035f;
                if (i17 < 5) {
                    C9931wH0[] c9931wH0Arr2 = this.f81031b;
                    this.f81035f = i17 + 1;
                    c9931wH0Arr2[i17] = c9931wH02;
                }
            } else {
                c9931wH02.f80304b = i16 - i15;
                this.f81034e -= i15;
            }
        }
    }

    public final void c() {
        this.f81030a.clear();
        this.f81032c = -1;
        this.f81033d = 0;
        this.f81034e = 0;
    }

    public C10145yH0(int i10) {
    }
}
