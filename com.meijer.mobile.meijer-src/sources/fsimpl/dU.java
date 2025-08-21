package fsimpl;

/* loaded from: classes15.dex */
class dU {
    private static Object a(C14185ee c14185ee, Object obj) {
        return dT.a(c14185ee, gd.a(c14185ee, obj));
    }

    static boolean a(C14185ee c14185ee, Object obj, dW dWVar) {
        Object objA = dT.a(c14185ee, obj);
        if (objA == null) {
            return false;
        }
        boolean z10 = false;
        while (objA != null && dWVar != null) {
            Object objA2 = objA;
            dW dWVar2 = dWVar;
            while (objA2 != null && dWVar2 != null) {
                if (dT.a(dWVar2, c14185ee.a(objA2))) {
                    if (dWVar2.f133279b == 2) {
                        objA = a(c14185ee, objA2);
                        dWVar = dWVar2.f133278a;
                        z10 = true;
                        break;
                    }
                    objA2 = a(c14185ee, objA2);
                    dWVar2 = dWVar2.f133278a;
                } else {
                    if (!z10) {
                        return false;
                    }
                    objA = a(c14185ee, objA);
                }
            }
            objA = objA2;
            dWVar = dWVar2;
        }
        return dWVar == null;
    }
}
