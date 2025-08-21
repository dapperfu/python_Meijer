package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.pal.db, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10775db {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f83927a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private C10724ab f83928b = C10724ab.f83892b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f83929c = null;

    public final C10775db a(C7 c72, int i10, L7 l72) {
        ArrayList arrayList = this.f83927a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new C10809fb(c72, i10, l72, null));
        return this;
    }

    public final C10775db b(C10724ab c10724ab) {
        if (this.f83927a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f83928b = c10724ab;
        return this;
    }

    public final C10775db c(int i10) {
        if (this.f83927a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f83929c = Integer.valueOf(i10);
        return this;
    }

    public final C10841hb d() throws GeneralSecurityException {
        if (this.f83927a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f83929c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f83927a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (((C10809fb) arrayList.get(i10)).a() != iIntValue) {
                    i10 = i11;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        C10841hb c10841hb = new C10841hb(this.f83928b, Collections.unmodifiableList(this.f83927a), this.f83929c, null);
        this.f83927a = null;
        return c10841hb;
    }
}
