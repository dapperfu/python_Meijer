package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import id.C14724g;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f65651a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C14724g f65652b;

    public final int a(Context context, int i10) {
        return this.f65651a.get(i10, -1);
    }

    public final void c() {
        this.f65651a.clear();
    }

    public K(C14724g c14724g) {
        r.l(c14724g);
        this.f65652b = c14724g;
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
            if (i10 < this.f65651a.size()) {
                int iKeyAt = this.f65651a.keyAt(i10);
                if (iKeyAt > minApkVersion && this.f65651a.get(iKeyAt) == 0) {
                    break;
                }
                i10++;
            } else {
                iH = -1;
                break;
            }
        }
        if (iH == -1) {
            iH = this.f65652b.h(context, minApkVersion);
        }
        this.f65651a.put(minApkVersion, iH);
        return iH;
    }
}
