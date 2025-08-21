package fsimpl;

/* loaded from: classes15.dex */
public class dQ {

    /* renamed from: a, reason: collision with root package name */
    public dW f133275a;

    /* renamed from: b, reason: collision with root package name */
    public final dR f133276b;

    dQ(dW dWVar, dR dRVar) {
        this.f133275a = dWVar;
        this.f133276b = dRVar;
    }

    public static dQ a(cJ cJVar, boolean z10) {
        dR dRVar = new dR();
        dW dWVarA = a(cJVar, dRVar);
        if (dWVarA == null) {
            return null;
        }
        dRVar.f133277a = z10 && dRVar.f133277a;
        return new dQ(dWVarA, dRVar);
    }

    private static dW a(cJ cJVar, dR dRVar) {
        if (cJVar == null) {
            return null;
        }
        dW dWVar = new dW(a(cJVar.a(), dRVar), cJVar.b());
        dRVar.f133277a = dRVar.f133277a || dWVar.f133279b == 2;
        String strC = cJVar.c();
        if (strC != null) {
            strC = strC.toLowerCase();
        }
        dWVar.f133280c = strC;
        dWVar.f133281d = cJVar.d();
        int iE = cJVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            dWVar.f133282e.put(cJVar.a(i10), true);
        }
        int iF = cJVar.f();
        for (int i11 = 0; i11 < iF; i11++) {
            cG cGVarB = cJVar.b(i11);
            String strA = cGVarB.a();
            String strC2 = cGVarB.c();
            byte b10 = cGVarB.b();
            String lowerCase = strA.toLowerCase();
            dWVar.f133284g.put(lowerCase, strC2);
            dWVar.f133283f.put(lowerCase, Byte.valueOf(b10));
        }
        return dWVar;
    }

    public String a() {
        String strA = null;
        for (dW dWVar = this.f133275a; dWVar != null; dWVar = dWVar.f133278a) {
            strA = strA == null ? dWVar.a() : dWVar.a() + strA;
        }
        return strA;
    }

    public String toString() {
        return "[Selector rules=" + this.f133275a + "]";
    }
}
