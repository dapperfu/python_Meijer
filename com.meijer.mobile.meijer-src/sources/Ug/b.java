package Ug;

/* loaded from: classes8.dex */
final class b extends f {
    @Override // Ug.i
    protected void h(StringBuilder sb2, int i10) {
        if (i10 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // Ug.i
    protected int i(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }

    b(Ig.a aVar) {
        super(aVar);
    }
}
