package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class BG0 extends C6973Mo {

    /* renamed from: D, reason: collision with root package name */
    public final boolean f65494D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f65495E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f65496F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f65497G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f65498H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f65499I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f65500J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f65501K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f65502L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f65503M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f65504N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f65505O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f65506P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f65507Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f65508R;

    /* renamed from: S, reason: collision with root package name */
    private final SparseArray f65509S;

    /* renamed from: T, reason: collision with root package name */
    private final SparseBooleanArray f65510T;

    @Override // com.google.android.gms.internal.ads.C6973Mo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BG0.class == obj.getClass()) {
            BG0 bg0 = (BG0) obj;
            if (super.equals(bg0) && this.f65494D == bg0.f65494D && this.f65496F == bg0.f65496F && this.f65498H == bg0.f65498H && this.f65503M == bg0.f65503M && this.f65504N == bg0.f65504N && this.f65505O == bg0.f65505O && this.f65507Q == bg0.f65507Q) {
                SparseBooleanArray sparseBooleanArray = this.f65510T;
                SparseBooleanArray sparseBooleanArray2 = bg0.f65510T;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.f65509S;
                            SparseArray sparseArray2 = bg0.f65509S;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                C7775dG0 c7775dG0 = (C7775dG0) entry.getKey();
                                                if (!map2.containsKey(c7775dG0) || !Objects.equals(entry.getValue(), map2.get(c7775dG0))) {
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
        this.f65494D = ag0.f65100s;
        this.f65495E = false;
        this.f65496F = ag0.f65101t;
        this.f65497G = false;
        this.f65498H = ag0.f65102u;
        this.f65499I = false;
        this.f65500J = false;
        this.f65501K = false;
        this.f65502L = false;
        this.f65503M = ag0.f65103v;
        this.f65504N = ag0.f65104w;
        this.f65505O = ag0.f65105x;
        this.f65506P = false;
        this.f65507Q = ag0.f65106y;
        this.f65508R = false;
        this.f65509S = ag0.f65107z;
        this.f65510T = ag0.f65099A;
    }

    public static BG0 d(Context context) {
        return new BG0(new AG0(context));
    }

    public final AG0 c() {
        return new AG0(this, null);
    }

    @Deprecated
    public final CG0 e(int i10, C7775dG0 c7775dG0) {
        Map map = (Map) this.f65509S.get(i10);
        if (map != null) {
            return (CG0) map.get(c7775dG0);
        }
        return null;
    }

    public final boolean f(int i10) {
        return this.f65510T.get(i10);
    }

    @Deprecated
    public final boolean g(int i10, C7775dG0 c7775dG0) {
        Map map = (Map) this.f65509S.get(i10);
        return map != null && map.containsKey(c7775dG0);
    }

    @Override // com.google.android.gms.internal.ads.C6973Mo
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f65494D ? 1 : 0)) * 961) + (this.f65496F ? 1 : 0)) * 961) + (this.f65498H ? 1 : 0)) * 28629151) + (this.f65503M ? 1 : 0)) * 31) + (this.f65504N ? 1 : 0)) * 31) + (this.f65505O ? 1 : 0)) * 961) + (this.f65507Q ? 1 : 0)) * 31;
    }
}
