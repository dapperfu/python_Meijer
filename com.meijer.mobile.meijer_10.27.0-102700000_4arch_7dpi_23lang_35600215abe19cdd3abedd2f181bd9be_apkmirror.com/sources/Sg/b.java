package Sg;

/* loaded from: classes7.dex */
final class b extends f {
    @Override // Sg.i
    protected void h(StringBuilder sb2, int i10) {
        if (i10 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // Sg.i
    protected int i(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }

    b(Gg.a aVar) {
        super(aVar);
    }
}
