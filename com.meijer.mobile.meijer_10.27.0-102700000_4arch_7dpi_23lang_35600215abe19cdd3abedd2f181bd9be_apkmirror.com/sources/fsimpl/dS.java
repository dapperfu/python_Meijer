package fsimpl;

/* loaded from: classes14.dex */
class dS {
    static boolean a(C14060ee c14060ee, Object obj, dW dWVar) {
        Object objA;
        if ((dWVar.f132029b != 0 && dWVar.f132029b != 1) || (objA = dT.a(c14060ee, obj)) == null || !dT.a(dWVar, c14060ee.a(objA))) {
            return false;
        }
        if (dWVar.f132028a == null) {
            return true;
        }
        Object objA2 = gd.a(c14060ee, objA);
        if (objA2 == null) {
            return false;
        }
        return a(c14060ee, objA2, dWVar.f132028a);
    }
}
