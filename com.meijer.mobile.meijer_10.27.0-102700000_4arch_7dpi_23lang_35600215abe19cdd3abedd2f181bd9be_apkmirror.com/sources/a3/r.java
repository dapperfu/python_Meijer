package a3;

import android.util.SparseBooleanArray;
import d3.C13466a;
import d3.P;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f43881a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f43882a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f43883b;

        public b b(r rVar) {
            for (int i10 = 0; i10 < rVar.d(); i10++) {
                a(rVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b a(int i10) {
            C13466a.g(!this.f43883b);
            this.f43882a.append(i10, true);
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public r e() {
            C13466a.g(!this.f43883b);
            this.f43883b = true;
            return new r(this.f43882a);
        }
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        C13466a.c(i10, 0, d());
        return this.f43881a.keyAt(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (P.f127086a >= 24) {
            return this.f43881a.equals(rVar.f43881a);
        }
        if (d() != rVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != rVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    private r(SparseBooleanArray sparseBooleanArray) {
        this.f43881a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f43881a.get(i10);
    }

    public int d() {
        return this.f43881a.size();
    }

    public int hashCode() {
        if (P.f127086a >= 24) {
            return this.f43881a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }
}
