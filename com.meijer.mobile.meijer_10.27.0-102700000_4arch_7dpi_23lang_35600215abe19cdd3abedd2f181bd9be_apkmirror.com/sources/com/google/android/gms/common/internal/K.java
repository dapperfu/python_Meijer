package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import gd.C14248g;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f64811a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C14248g f64812b;

    public final int a(Context context, int i10) {
        return this.f64811a.get(i10, -1);
    }

    public final void c() {
        this.f64811a.clear();
    }

    public K(C14248g c14248g) {
        r.l(c14248g);
        this.f64812b = c14248g;
    }

    @ResultIgnorabilityUnspecified
    public final int b(Context context, a.f fVar) {
        r.l(context);
        r.l(fVar);
        int iH = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iA = a(context, minApkVersion);
        if (iA != -1) {
            return iA;
        }
        int i10 = 0;
        while (true) {
            if (i10 < this.f64811a.size()) {
                int iKeyAt = this.f64811a.keyAt(i10);
                if (iKeyAt > minApkVersion && this.f64811a.get(iKeyAt) == 0) {
                    break;
                }
                i10++;
            } else {
                iH = -1;
                break;
            }
        }
        if (iH == -1) {
            iH = this.f64812b.h(context, minApkVersion);
        }
        this.f64811a.put(minApkVersion, iH);
        return iH;
    }
}
