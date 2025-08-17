package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6992Nd0 implements InterfaceC9305rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f68929a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f68930b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f68931c;

    /* renamed from: d, reason: collision with root package name */
    private C8030fk0 f68932d;

    protected final void i(C8030fk0 c8030fk0) {
        for (int i10 = 0; i10 < this.f68931c; i10++) {
            ((Pu0) this.f68930b.get(i10)).p(this, c8030fk0, this.f68929a);
        }
    }

    protected final void h() {
        C8030fk0 c8030fk0 = this.f68932d;
        int i10 = OV.f69091a;
        for (int i11 = 0; i11 < this.f68931c; i11++) {
            ((Pu0) this.f68930b.get(i11)).c(this, c8030fk0, this.f68929a);
        }
        this.f68932d = null;
    }

    protected final void j(C8030fk0 c8030fk0) {
        this.f68932d = c8030fk0;
        for (int i10 = 0; i10 < this.f68931c; i10++) {
            ((Pu0) this.f68930b.get(i10)).q(this, c8030fk0, this.f68929a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0, com.google.android.gms.internal.ads.InterfaceC9007os0
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    protected final void zzg(int i10) {
        C8030fk0 c8030fk0 = this.f68932d;
        int i11 = OV.f69091a;
        for (int i12 = 0; i12 < this.f68931c; i12++) {
            ((Pu0) this.f68930b.get(i12)).l(this, c8030fk0, this.f68929a, i10);
        }
    }

    protected AbstractC6992Nd0(boolean z10) {
        this.f68929a = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void d(Pu0 pu0) {
        pu0.getClass();
        if (!this.f68930b.contains(pu0)) {
            this.f68930b.add(pu0);
            this.f68931c++;
        }
    }
}
