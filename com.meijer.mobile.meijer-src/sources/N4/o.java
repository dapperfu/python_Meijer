package N4;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes4.dex */
public class o implements WebMessageBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f20586a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static M4.c[] a(InvocationHandler[] invocationHandlerArr) {
        M4.c[] cVarArr = new M4.c[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            cVarArr[i10] = new q(invocationHandlerArr[i10]);
        }
        return cVarArr;
    }

    public static M4.b b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        M4.c[] cVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (t.f20592C.d()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) iw.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    return null;
                }
                return new M4.b(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), cVarArrA);
            }
            return new M4.b(webMessagePayloadBoundaryInterface.getAsString(), cVarArrA);
        }
        return new M4.b(webMessageBoundaryInterface.getData(), cVarArrA);
    }
}
