package fsimpl;

import com.fullstory.util.Log;

/* loaded from: classes15.dex */
public class dV {
    public static dQ a(C14185ee c14185ee, Object obj, dQ[] dQVarArr) {
        for (dQ dQVar : dQVarArr) {
            if (a(c14185ee, obj, dQVar)) {
                if (!Log.DISABLE_LOGGING) {
                    Log.i("Matched " + obj.getClass() + " from selector " + dQVar.a());
                }
                return dQVar;
            }
        }
        return null;
    }

    private static boolean a(C14185ee c14185ee, Object obj, dQ dQVar) {
        boolean z10 = dQVar.f133276b.f133277a;
        dW dWVar = dQVar.f133275a;
        return z10 ? dU.a(c14185ee, obj, dWVar) : dS.a(c14185ee, obj, dWVar);
    }
}
