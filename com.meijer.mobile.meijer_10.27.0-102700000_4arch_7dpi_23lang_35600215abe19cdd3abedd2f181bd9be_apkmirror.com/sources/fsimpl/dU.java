package fsimpl;

/* loaded from: classes14.dex */
class dU {
    private static Object a(C14060ee c14060ee, Object obj) {
        return dT.a(c14060ee, gd.a(c14060ee, obj));
    }

    static boolean a(C14060ee c14060ee, Object obj, dW dWVar) {
        Object objA = dT.a(c14060ee, obj);
        if (objA == null) {
            return false;
        }
        boolean z10 = false;
        while (objA != null && dWVar != null) {
            Object objA2 = objA;
            dW dWVar2 = dWVar;
            while (objA2 != null && dWVar2 != null) {
                if (dT.a(dWVar2, c14060ee.a(objA2))) {
                    if (dWVar2.f132029b == 2) {
                        objA = a(c14060ee, objA2);
                        dWVar = dWVar2.f132028a;
                        z10 = true;
                        break;
                    }
                    objA2 = a(c14060ee, objA2);
                    dWVar2 = dWVar2.f132028a;
                } else {
                    if (!z10) {
                        return false;
                    }
                    objA = a(c14060ee, objA);
                }
            }
            objA = objA2;
            dWVar = dWVar2;
        }
        return dWVar == null;
    }
}
