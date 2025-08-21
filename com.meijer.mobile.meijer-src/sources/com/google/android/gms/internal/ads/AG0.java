package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AG0 extends C8802lo {

    /* renamed from: A, reason: collision with root package name */
    private final SparseBooleanArray f65939A;

    /* renamed from: s, reason: collision with root package name */
    private boolean f65940s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f65941t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f65942u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f65943v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f65944w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f65945x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f65946y;

    /* renamed from: z, reason: collision with root package name */
    private final SparseArray f65947z;

    @Deprecated
    public AG0() {
        this.f65947z = new SparseArray();
        this.f65939A = new SparseBooleanArray();
        y();
    }

    private final void y() {
        this.f65940s = true;
        this.f65941t = true;
        this.f65942u = true;
        this.f65943v = true;
        this.f65944w = true;
        this.f65945x = true;
        this.f65946y = true;
    }

    public final AG0 q(int i10, boolean z10) {
        if (this.f65939A.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.f65939A.put(i10, true);
            return this;
        }
        this.f65939A.delete(i10);
        return this;
    }

    public AG0(Context context) throws NumberFormatException {
        super.e(context);
        Point pointO = OV.O(context);
        super.f(pointO.x, pointO.y, true);
        this.f65947z = new SparseArray();
        this.f65939A = new SparseBooleanArray();
        y();
    }

    /* synthetic */ AG0(BG0 bg0, MG0 mg0) {
        super(bg0);
        this.f65940s = bg0.f66334D;
        this.f65941t = bg0.f66336F;
        this.f65942u = bg0.f66338H;
        this.f65943v = bg0.f66343M;
        this.f65944w = bg0.f66344N;
        this.f65945x = bg0.f66345O;
        this.f65946y = bg0.f66347Q;
        SparseArray sparseArray = bg0.f66349S;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.f65947z = sparseArray2;
        this.f65939A = bg0.f66350T.clone();
    }
}
