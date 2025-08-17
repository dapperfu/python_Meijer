package fsimpl;

import com.fullstory.util.Log;

/* loaded from: classes14.dex */
public class dV {
    public static dQ a(C14060ee c14060ee, Object obj, dQ[] dQVarArr) {
        for (dQ dQVar : dQVarArr) {
            if (a(c14060ee, obj, dQVar)) {
                if (!Log.DISABLE_LOGGING) {
                    Log.i("Matched " + obj.getClass() + " from selector " + dQVar.a());
                }
                return dQVar;
            }
        }
        return null;
    }

    private static boolean a(C14060ee c14060ee, Object obj, dQ dQVar) {
        boolean z10 = dQVar.f132026b.f132027a;
        dW dWVar = dQVar.f132025a;
        return z10 ? dU.a(c14060ee, obj, dWVar) : dS.a(c14060ee, obj, dWVar);
    }
}
