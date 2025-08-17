package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7775dG0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C7775dG0 f73384d = new C7775dG0(new C9742vm[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f73385a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7917eh0 f73386b;

    /* renamed from: c, reason: collision with root package name */
    private int f73387c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7775dG0.class == obj.getClass()) {
            C7775dG0 c7775dG0 = (C7775dG0) obj;
            if (this.f73385a == c7775dG0.f73385a && this.f73386b.equals(c7775dG0.f73386b)) {
                return true;
            }
        }
        return false;
    }

    static {
        Integer.toString(0, 36);
    }

    public final int a(C9742vm c9742vm) {
        int iIndexOf = this.f73386b.indexOf(c9742vm);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final C9742vm b(int i10) {
        return (C9742vm) this.f73386b.get(i10);
    }

    public final AbstractC7917eh0 c() {
        return AbstractC7917eh0.r(C9733vh0.b(this.f73386b, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.cG0
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                C7775dG0 c7775dG0 = C7775dG0.f73384d;
                return Integer.valueOf(((C9742vm) obj).f79123c);
            }
        }));
    }

    public final int hashCode() {
        int i10 = this.f73387c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f73386b.hashCode();
        this.f73387c = iHashCode;
        return iHashCode;
    }

    public C7775dG0(C9742vm... c9742vmArr) {
        this.f73386b = AbstractC7917eh0.s(c9742vmArr);
        this.f73385a = c9742vmArr.length;
        int i10 = 0;
        while (i10 < this.f73386b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f73386b.size(); i12++) {
                if (((C9742vm) this.f73386b.get(i10)).equals(this.f73386b.get(i12))) {
                    C9917xL.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }
}
