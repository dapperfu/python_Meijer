package N4;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes4.dex */
public class m extends M4.a {

    /* renamed from: a, reason: collision with root package name */
    private final JsReplyProxyBoundaryInterface f20582a;

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new m(jsReplyProxyBoundaryInterface);
    }

    public static m b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) iw.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (m) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: N4.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.a(jsReplyProxyBoundaryInterface);
            }
        });
    }

    public m(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f20582a = jsReplyProxyBoundaryInterface;
    }
}
