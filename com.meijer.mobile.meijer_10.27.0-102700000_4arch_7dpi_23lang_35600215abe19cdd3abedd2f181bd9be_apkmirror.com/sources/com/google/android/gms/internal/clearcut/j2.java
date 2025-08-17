package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class j2 extends O1<j2> implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static volatile j2[] f81502e;

    /* renamed from: c, reason: collision with root package name */
    private String f81503c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f81504d = "";

    public j2() {
        this.f81186b = null;
        this.f81203a = -1;
    }

    public static j2[] g() {
        if (f81502e == null) {
            synchronized (R1.f81200c) {
                try {
                    if (f81502e == null) {
                        f81502e = new j2[0];
                    }
                } finally {
                }
            }
        }
        return f81502e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final j2 clone() {
        try {
            return (j2) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    public final void a(N1 n12) throws IOException {
        String str = this.f81503c;
        if (str != null && !str.equals("")) {
            n12.c(1, this.f81503c);
        }
        String str2 = this.f81504d;
        if (str2 != null && !str2.equals("")) {
            n12.c(2, this.f81504d);
        }
        super.a(n12);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    protected final int d() {
        int iD = super.d();
        String str = this.f81503c;
        if (str != null && !str.equals("")) {
            iD += N1.h(1, this.f81503c);
        }
        String str2 = this.f81504d;
        return (str2 == null || str2.equals("")) ? iD : iD + N1.h(2, this.f81504d);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: e */
    public final /* synthetic */ S1 clone() throws CloneNotSupportedException {
        return (j2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        String str = this.f81503c;
        if (str == null) {
            if (j2Var.f81503c != null) {
                return false;
            }
        } else if (!str.equals(j2Var.f81503c)) {
            return false;
        }
        String str2 = this.f81504d;
        if (str2 == null) {
            if (j2Var.f81504d != null) {
                return false;
            }
        } else if (!str2.equals(j2Var.f81504d)) {
            return false;
        }
        P1 p12 = this.f81186b;
        if (p12 != null && !p12.a()) {
            return this.f81186b.equals(j2Var.f81186b);
        }
        P1 p13 = j2Var.f81186b;
        return p13 == null || p13.a();
    }

    @Override // com.google.android.gms.internal.clearcut.O1
    /* renamed from: f */
    public final /* synthetic */ O1 clone() throws CloneNotSupportedException {
        return (j2) clone();
    }

    public final int hashCode() {
        int iHashCode = (j2.class.getName().hashCode() + 527) * 31;
        String str = this.f81503c;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81504d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        P1 p12 = this.f81186b;
        if (p12 != null && !p12.a()) {
            iHashCode2 = this.f81186b.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }
}
