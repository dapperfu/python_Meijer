package fsimpl;

/* loaded from: classes14.dex */
public class dQ {

    /* renamed from: a, reason: collision with root package name */
    public dW f132025a;

    /* renamed from: b, reason: collision with root package name */
    public final dR f132026b;

    dQ(dW dWVar, dR dRVar) {
        this.f132025a = dWVar;
        this.f132026b = dRVar;
    }

    public static dQ a(cJ cJVar, boolean z10) {
        dR dRVar = new dR();
        dW dWVarA = a(cJVar, dRVar);
        if (dWVarA == null) {
            return null;
        }
        dRVar.f132027a = z10 && dRVar.f132027a;
        return new dQ(dWVarA, dRVar);
    }

    private static dW a(cJ cJVar, dR dRVar) {
        if (cJVar == null) {
            return null;
        }
        dW dWVar = new dW(a(cJVar.a(), dRVar), cJVar.b());
        dRVar.f132027a = dRVar.f132027a || dWVar.f132029b == 2;
        String strC = cJVar.c();
        if (strC != null) {
            strC = strC.toLowerCase();
        }
        dWVar.f132030c = strC;
        dWVar.f132031d = cJVar.d();
        int iE = cJVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            dWVar.f132032e.put(cJVar.a(i10), true);
        }
        int iF = cJVar.f();
        for (int i11 = 0; i11 < iF; i11++) {
            cG cGVarB = cJVar.b(i11);
            String strA = cGVarB.a();
            String strC2 = cGVarB.c();
            byte b10 = cGVarB.b();
            String lowerCase = strA.toLowerCase();
            dWVar.f132034g.put(lowerCase, strC2);
            dWVar.f132033f.put(lowerCase, Byte.valueOf(b10));
        }
        return dWVar;
    }

    public String a() {
        String strA = null;
        for (dW dWVar = this.f132025a; dWVar != null; dWVar = dWVar.f132028a) {
            strA = strA == null ? dWVar.a() : dWVar.a() + strA;
        }
        return strA;
    }

    public String toString() {
        return "[Selector rules=" + this.f132025a + "]";
    }
}
