package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.pal.db, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10650db {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f83087a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private C10599ab f83088b = C10599ab.f83052b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f83089c = null;

    public final C10650db a(C7 c72, int i10, L7 l72) {
        ArrayList arrayList = this.f83087a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new C10684fb(c72, i10, l72, null));
        return this;
    }

    public final C10650db b(C10599ab c10599ab) {
        if (this.f83087a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f83088b = c10599ab;
        return this;
    }

    public final C10650db c(int i10) {
        if (this.f83087a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f83089c = Integer.valueOf(i10);
        return this;
    }

    public final C10716hb d() throws GeneralSecurityException {
        if (this.f83087a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f83089c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f83087a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (((C10684fb) arrayList.get(i10)).a() != iIntValue) {
                    i10 = i11;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        C10716hb c10716hb = new C10716hb(this.f83088b, Collections.unmodifiableList(this.f83087a), this.f83089c, null);
        this.f83087a = null;
        return c10716hb;
    }
}
