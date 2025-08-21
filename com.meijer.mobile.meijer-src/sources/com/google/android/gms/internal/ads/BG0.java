package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class BG0 extends C7098Mo {

    /* renamed from: D, reason: collision with root package name */
    public final boolean f66334D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f66335E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f66336F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f66337G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f66338H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f66339I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f66340J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f66341K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f66342L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f66343M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f66344N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f66345O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f66346P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f66347Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f66348R;

    /* renamed from: S, reason: collision with root package name */
    private final SparseArray f66349S;

    /* renamed from: T, reason: collision with root package name */
    private final SparseBooleanArray f66350T;

    @Override // com.google.android.gms.internal.ads.C7098Mo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BG0.class == obj.getClass()) {
            BG0 bg0 = (BG0) obj;
            if (super.equals(bg0) && this.f66334D == bg0.f66334D && this.f66336F == bg0.f66336F && this.f66338H == bg0.f66338H && this.f66343M == bg0.f66343M && this.f66344N == bg0.f66344N && this.f66345O == bg0.f66345O && this.f66347Q == bg0.f66347Q) {
                SparseBooleanArray sparseBooleanArray = this.f66350T;
                SparseBooleanArray sparseBooleanArray2 = bg0.f66350T;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.f66349S;
                            SparseArray sparseArray2 = bg0.f66349S;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                C7900dG0 c7900dG0 = (C7900dG0) entry.getKey();
                                                if (!map2.containsKey(c7900dG0) || !Objects.equals(entry.getValue(), map2.get(c7900dG0))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    static {
        new BG0(new AG0());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    private BG0(AG0 ag0) {
        super(ag0);
        this.f66334D = ag0.f65940s;
        this.f66335E = false;
        this.f66336F = ag0.f65941t;
        this.f66337G = false;
        this.f66338H = ag0.f65942u;
        this.f66339I = false;
        this.f66340J = false;
        this.f66341K = false;
        this.f66342L = false;
        this.f66343M = ag0.f65943v;
        this.f66344N = ag0.f65944w;
        this.f66345O = ag0.f65945x;
        this.f66346P = false;
        this.f66347Q = ag0.f65946y;
        this.f66348R = false;
        this.f66349S = ag0.f65947z;
        this.f66350T = ag0.f65939A;
    }

    public static BG0 d(Context context) {
        return new BG0(new AG0(context));
    }

    public final AG0 c() {
        return new AG0(this, null);
    }

    @Deprecated
    public final CG0 e(int i10, C7900dG0 c7900dG0) {
        Map map = (Map) this.f66349S.get(i10);
        if (map != null) {
            return (CG0) map.get(c7900dG0);
        }
        return null;
    }

    public final boolean f(int i10) {
        return this.f66350T.get(i10);
    }

    @Deprecated
    public final boolean g(int i10, C7900dG0 c7900dG0) {
        Map map = (Map) this.f66349S.get(i10);
        return map != null && map.containsKey(c7900dG0);
    }

    @Override // com.google.android.gms.internal.ads.C7098Mo
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f66334D ? 1 : 0)) * 961) + (this.f66336F ? 1 : 0)) * 961) + (this.f66338H ? 1 : 0)) * 28629151) + (this.f66343M ? 1 : 0)) * 31) + (this.f66344N ? 1 : 0)) * 31) + (this.f66345O ? 1 : 0)) * 961) + (this.f66347Q ? 1 : 0)) * 31;
    }
}
