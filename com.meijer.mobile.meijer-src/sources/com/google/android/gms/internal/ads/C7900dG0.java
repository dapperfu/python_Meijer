package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7900dG0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C7900dG0 f74224d = new C7900dG0(new C9867vm[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f74225a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8042eh0 f74226b;

    /* renamed from: c, reason: collision with root package name */
    private int f74227c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7900dG0.class == obj.getClass()) {
            C7900dG0 c7900dG0 = (C7900dG0) obj;
            if (this.f74225a == c7900dG0.f74225a && this.f74226b.equals(c7900dG0.f74226b)) {
                return true;
            }
        }
        return false;
    }

    static {
        Integer.toString(0, 36);
    }

    public final int a(C9867vm c9867vm) {
        int iIndexOf = this.f74226b.indexOf(c9867vm);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final C9867vm b(int i10) {
        return (C9867vm) this.f74226b.get(i10);
    }

    public final AbstractC8042eh0 c() {
        return AbstractC8042eh0.r(C9858vh0.b(this.f74226b, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.cG0
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                C7900dG0 c7900dG0 = C7900dG0.f74224d;
                return Integer.valueOf(((C9867vm) obj).f79963c);
            }
        }));
    }

    public final int hashCode() {
        int i10 = this.f74227c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f74226b.hashCode();
        this.f74227c = iHashCode;
        return iHashCode;
    }

    public C7900dG0(C9867vm... c9867vmArr) {
        this.f74226b = AbstractC8042eh0.s(c9867vmArr);
        this.f74225a = c9867vmArr.length;
        int i10 = 0;
        while (i10 < this.f74226b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f74226b.size(); i12++) {
                if (((C9867vm) this.f74226b.get(i10)).equals(this.f74226b.get(i12))) {
                    C10042xL.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }
}
