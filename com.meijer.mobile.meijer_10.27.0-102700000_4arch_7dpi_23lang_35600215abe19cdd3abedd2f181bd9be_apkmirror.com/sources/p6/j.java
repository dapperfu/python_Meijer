package p6;

import g6.C14209i;
import g6.y;
import i6.InterfaceC14692c;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155561a;

    /* renamed from: b, reason: collision with root package name */
    private final a f155562b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f155563c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        if (oVar.h0(y.MergePathsApi19)) {
            return new i6.l(this);
        }
        u6.g.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f155562b;
    }

    public String c() {
        return this.f155561a;
    }

    public boolean d() {
        return this.f155563c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f155562b + '}';
    }

    public j(String str, a aVar, boolean z10) {
        this.f155561a = str;
        this.f155562b = aVar;
        this.f155563c = z10;
    }
}
