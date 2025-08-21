package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class j2 extends O1<j2> implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static volatile j2[] f82342e;

    /* renamed from: c, reason: collision with root package name */
    private String f82343c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f82344d = "";

    public j2() {
        this.f82026b = null;
        this.f82043a = -1;
    }

    public static j2[] g() {
        if (f82342e == null) {
            synchronized (R1.f82040c) {
                try {
                    if (f82342e == null) {
                        f82342e = new j2[0];
                    }
                } finally {
                }
            }
        }
        return f82342e;
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
        String str = this.f82343c;
        if (str != null && !str.equals("")) {
            n12.c(1, this.f82343c);
        }
        String str2 = this.f82344d;
        if (str2 != null && !str2.equals("")) {
            n12.c(2, this.f82344d);
        }
        super.a(n12);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    protected final int d() {
        int iD = super.d();
        String str = this.f82343c;
        if (str != null && !str.equals("")) {
            iD += N1.h(1, this.f82343c);
        }
        String str2 = this.f82344d;
        return (str2 == null || str2.equals("")) ? iD : iD + N1.h(2, this.f82344d);
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
        String str = this.f82343c;
        if (str == null) {
            if (j2Var.f82343c != null) {
                return false;
            }
        } else if (!str.equals(j2Var.f82343c)) {
            return false;
        }
        String str2 = this.f82344d;
        if (str2 == null) {
            if (j2Var.f82344d != null) {
                return false;
            }
        } else if (!str2.equals(j2Var.f82344d)) {
            return false;
        }
        P1 p12 = this.f82026b;
        if (p12 != null && !p12.a()) {
            return this.f82026b.equals(j2Var.f82026b);
        }
        P1 p13 = j2Var.f82026b;
        return p13 == null || p13.a();
    }

    @Override // com.google.android.gms.internal.clearcut.O1
    /* renamed from: f */
    public final /* synthetic */ O1 clone() throws CloneNotSupportedException {
        return (j2) clone();
    }

    public final int hashCode() {
        int iHashCode = (j2.class.getName().hashCode() + 527) * 31;
        String str = this.f82343c;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82344d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        P1 p12 = this.f82026b;
        if (p12 != null && !p12.a()) {
            iHashCode2 = this.f82026b.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }
}
