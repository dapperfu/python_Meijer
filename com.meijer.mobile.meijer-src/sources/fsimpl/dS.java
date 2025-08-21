package fsimpl;

/* loaded from: classes15.dex */
class dS {
    static boolean a(C14185ee c14185ee, Object obj, dW dWVar) {
        Object objA;
        if ((dWVar.f133279b != 0 && dWVar.f133279b != 1) || (objA = dT.a(c14185ee, obj)) == null || !dT.a(dWVar, c14185ee.a(objA))) {
            return false;
        }
        if (dWVar.f133278a == null) {
            return true;
        }
        Object objA2 = gd.a(c14185ee, objA);
        if (objA2 == null) {
            return false;
        }
        return a(c14185ee, objA2, dWVar.f133278a);
    }
}
