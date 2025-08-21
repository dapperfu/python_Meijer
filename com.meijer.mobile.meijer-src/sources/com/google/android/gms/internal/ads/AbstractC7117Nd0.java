package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7117Nd0 implements InterfaceC9430rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f69769a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f69770b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f69771c;

    /* renamed from: d, reason: collision with root package name */
    private C8155fk0 f69772d;

    protected final void i(C8155fk0 c8155fk0) {
        for (int i10 = 0; i10 < this.f69771c; i10++) {
            ((Pu0) this.f69770b.get(i10)).p(this, c8155fk0, this.f69769a);
        }
    }

    protected final void h() {
        C8155fk0 c8155fk0 = this.f69772d;
        int i10 = OV.f69931a;
        for (int i11 = 0; i11 < this.f69771c; i11++) {
            ((Pu0) this.f69770b.get(i11)).c(this, c8155fk0, this.f69769a);
        }
        this.f69772d = null;
    }

    protected final void j(C8155fk0 c8155fk0) {
        this.f69772d = c8155fk0;
        for (int i10 = 0; i10 < this.f69771c; i10++) {
            ((Pu0) this.f69770b.get(i10)).q(this, c8155fk0, this.f69769a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    protected final void zzg(int i10) {
        C8155fk0 c8155fk0 = this.f69772d;
        int i11 = OV.f69931a;
        for (int i12 = 0; i12 < this.f69771c; i12++) {
            ((Pu0) this.f69770b.get(i12)).l(this, c8155fk0, this.f69769a, i10);
        }
    }

    protected AbstractC7117Nd0(boolean z10) {
        this.f69769a = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void d(Pu0 pu0) {
        pu0.getClass();
        if (!this.f69770b.contains(pu0)) {
            this.f69770b.add(pu0);
            this.f69771c++;
        }
    }
}
