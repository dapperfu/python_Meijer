package a3;

import android.util.SparseBooleanArray;
import d3.C13599a;
import d3.P;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f44699a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f44700a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f44701b;

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
            C13599a.g(!this.f44701b);
            this.f44700a.append(i10, true);
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public r e() {
            C13599a.g(!this.f44701b);
            this.f44701b = true;
            return new r(this.f44700a);
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
        C13599a.c(i10, 0, d());
        return this.f44699a.keyAt(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (P.f127888a >= 24) {
            return this.f44699a.equals(rVar.f44699a);
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
        this.f44699a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f44699a.get(i10);
    }

    public int d() {
        return this.f44699a.size();
    }

    public int hashCode() {
        if (P.f127888a >= 24) {
            return this.f44699a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }
}
