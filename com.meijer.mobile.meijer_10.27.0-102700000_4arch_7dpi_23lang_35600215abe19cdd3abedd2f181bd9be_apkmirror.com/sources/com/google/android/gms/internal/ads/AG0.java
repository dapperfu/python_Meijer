package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AG0 extends C8677lo {

    /* renamed from: A, reason: collision with root package name */
    private final SparseBooleanArray f65099A;

    /* renamed from: s, reason: collision with root package name */
    private boolean f65100s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f65101t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f65102u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f65103v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f65104w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f65105x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f65106y;

    /* renamed from: z, reason: collision with root package name */
    private final SparseArray f65107z;

    @Deprecated
    public AG0() {
        this.f65107z = new SparseArray();
        this.f65099A = new SparseBooleanArray();
        y();
    }

    private final void y() {
        this.f65100s = true;
        this.f65101t = true;
        this.f65102u = true;
        this.f65103v = true;
        this.f65104w = true;
        this.f65105x = true;
        this.f65106y = true;
    }

    public final AG0 q(int i10, boolean z10) {
        if (this.f65099A.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.f65099A.put(i10, true);
            return this;
        }
        this.f65099A.delete(i10);
        return this;
    }

    public AG0(Context context) throws NumberFormatException {
        super.e(context);
        Point pointO = OV.O(context);
        super.f(pointO.x, pointO.y, true);
        this.f65107z = new SparseArray();
        this.f65099A = new SparseBooleanArray();
        y();
    }

    /* synthetic */ AG0(BG0 bg0, MG0 mg0) {
        super(bg0);
        this.f65100s = bg0.f65494D;
        this.f65101t = bg0.f65496F;
        this.f65102u = bg0.f65498H;
        this.f65103v = bg0.f65503M;
        this.f65104w = bg0.f65504N;
        this.f65105x = bg0.f65505O;
        this.f65106y = bg0.f65507Q;
        SparseArray sparseArray = bg0.f65509S;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.f65107z = sparseArray2;
        this.f65099A = bg0.f65510T.clone();
    }
}
