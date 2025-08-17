package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class Eo0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f66513a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Bo0 f66514b = Bo0.f65582b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f66515c = null;

    public final Eo0 a(Ek0 ek0, int i10, String str, String str2) {
        ArrayList arrayList = this.f66513a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new Fo0(ek0, i10, str, str2, null));
        return this;
    }

    public final Eo0 b(Bo0 bo0) {
        if (this.f66513a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f66514b = bo0;
        return this;
    }

    public final Eo0 c(int i10) {
        if (this.f66513a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f66515c = Integer.valueOf(i10);
        return this;
    }

    public final Ho0 d() throws GeneralSecurityException {
        if (this.f66513a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f66515c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f66513a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int iA = ((Fo0) arrayList.get(i10)).a();
                i10++;
                if (iA == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        Ho0 ho0 = new Ho0(this.f66514b, Collections.unmodifiableList(this.f66513a), this.f66515c, null);
        this.f66513a = null;
        return ho0;
    }
}
