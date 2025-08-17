package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class g2 extends O1<g2> implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private byte[] f81462c = V1.f81217h;

    /* renamed from: d, reason: collision with root package name */
    private String f81463d = "";

    /* renamed from: e, reason: collision with root package name */
    private byte[][] f81464e = V1.f81216g;

    /* renamed from: f, reason: collision with root package name */
    private boolean f81465f = false;

    public g2() {
        this.f81186b = null;
        this.f81203a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final g2 clone() {
        try {
            g2 g2Var = (g2) super.clone();
            byte[][] bArr = this.f81464e;
            if (bArr != null && bArr.length > 0) {
                g2Var.f81464e = (byte[][]) bArr.clone();
            }
            return g2Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    public final void a(N1 n12) throws IOException {
        if (!Arrays.equals(this.f81462c, V1.f81217h)) {
            n12.d(1, this.f81462c);
        }
        byte[][] bArr = this.f81464e;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            while (true) {
                byte[][] bArr2 = this.f81464e;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    n12.d(2, bArr3);
                }
                i10++;
            }
        }
        String str = this.f81463d;
        if (str != null && !str.equals("")) {
            n12.c(4, this.f81463d);
        }
        super.a(n12);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    protected final int d() {
        int iD = super.d();
        if (!Arrays.equals(this.f81462c, V1.f81217h)) {
            iD += N1.i(1, this.f81462c);
        }
        byte[][] bArr = this.f81464e;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            int iS = 0;
            int i11 = 0;
            while (true) {
                byte[][] bArr2 = this.f81464e;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    i11++;
                    iS += N1.s(bArr3);
                }
                i10++;
            }
            iD = iD + iS + i11;
        }
        String str = this.f81463d;
        return (str == null || str.equals("")) ? iD : iD + N1.h(4, this.f81463d);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: e */
    public final /* synthetic */ S1 clone() throws CloneNotSupportedException {
        return (g2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        if (!Arrays.equals(this.f81462c, g2Var.f81462c)) {
            return false;
        }
        String str = this.f81463d;
        if (str == null) {
            if (g2Var.f81463d != null) {
                return false;
            }
        } else if (!str.equals(g2Var.f81463d)) {
            return false;
        }
        if (!R1.i(this.f81464e, g2Var.f81464e)) {
            return false;
        }
        P1 p12 = this.f81186b;
        if (p12 != null && !p12.a()) {
            return this.f81186b.equals(g2Var.f81186b);
        }
        P1 p13 = g2Var.f81186b;
        return p13 == null || p13.a();
    }

    @Override // com.google.android.gms.internal.clearcut.O1
    /* renamed from: f */
    public final /* synthetic */ O1 clone() throws CloneNotSupportedException {
        return (g2) clone();
    }

    public final int hashCode() {
        int iHashCode = (((g2.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f81462c)) * 31;
        String str = this.f81463d;
        int iHashCode2 = 0;
        int iHashCode3 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + R1.g(this.f81464e)) * 31) + 1237) * 31;
        P1 p12 = this.f81186b;
        if (p12 != null && !p12.a()) {
            iHashCode2 = this.f81186b.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }
}
