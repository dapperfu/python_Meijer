package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.O1;
import java.io.IOException;

/* loaded from: classes6.dex */
public class O1<M extends O1<M>> extends S1 {

    /* renamed from: b, reason: collision with root package name */
    protected P1 f81186b;

    @Override // com.google.android.gms.internal.clearcut.S1
    public void a(N1 n12) throws IOException {
        if (this.f81186b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f81186b.b(); i10++) {
            this.f81186b.c(i10).b(n12);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.S1
    protected int d() {
        if (this.f81186b != null) {
            for (int i10 = 0; i10 < this.f81186b.b(); i10++) {
                this.f81186b.c(i10).c();
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.S1
    /* renamed from: e */
    public /* synthetic */ S1 clone() throws CloneNotSupportedException {
        return (O1) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.S1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public M clone() throws CloneNotSupportedException {
        M m10 = (M) super.clone();
        R1.h(this, m10);
        return m10;
    }
}
