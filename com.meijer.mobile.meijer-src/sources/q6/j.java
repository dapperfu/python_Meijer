package q6;

import h6.C14478i;
import h6.y;
import j6.InterfaceC14951c;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f157965a;

    /* renamed from: b, reason: collision with root package name */
    private final a f157966b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f157967c;

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

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        if (oVar.h0(y.MergePathsApi19)) {
            return new j6.l(this);
        }
        v6.g.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f157966b;
    }

    public String c() {
        return this.f157965a;
    }

    public boolean d() {
        return this.f157967c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f157966b + '}';
    }

    public j(String str, a aVar, boolean z10) {
        this.f157965a = str;
        this.f157966b = aVar;
        this.f157967c = z10;
    }
}
