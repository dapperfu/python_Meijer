package M4;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes4.dex */
public class o implements WebMessageBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f18923a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static L4.c[] a(InvocationHandler[] invocationHandlerArr) {
        L4.c[] cVarArr = new L4.c[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            cVarArr[i10] = new q(invocationHandlerArr[i10]);
        }
        return cVarArr;
    }

    public static L4.b b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        L4.c[] cVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (t.f18929C.d()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) mw.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    return null;
                }
                return new L4.b(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), cVarArrA);
            }
            return new L4.b(webMessagePayloadBoundaryInterface.getAsString(), cVarArrA);
        }
        return new L4.b(webMessageBoundaryInterface.getData(), cVarArrA);
    }
}
