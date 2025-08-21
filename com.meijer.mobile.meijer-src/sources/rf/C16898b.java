package rf;

import Vd.AbstractC5516j;
import Vd.C5508b;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import androidx.privacysandbox.ads.adservices.measurement.k;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16898b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f159533a = new k();

    public static <T> AbstractC5516j<T> b(AbstractC5516j<T> abstractC5516j, AbstractC5516j<T> abstractC5516j2) {
        final C5508b c5508b = new C5508b();
        final C5517k c5517k = new C5517k(c5508b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC5509c<T, AbstractC5516j<TContinuationResult>> interfaceC5509c = new InterfaceC5509c() { // from class: rf.a
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j3) {
                return C16898b.a(c5517k, atomicBoolean, c5508b, abstractC5516j3);
            }
        };
        Executor executor = f159533a;
        abstractC5516j.l(executor, interfaceC5509c);
        abstractC5516j2.l(executor, interfaceC5509c);
        return c5517k.a();
    }

    public static /* synthetic */ AbstractC5516j a(C5517k c5517k, AtomicBoolean atomicBoolean, C5508b c5508b, AbstractC5516j abstractC5516j) {
        if (abstractC5516j.r()) {
            c5517k.e(abstractC5516j.n());
        } else if (abstractC5516j.m() != null) {
            c5517k.d(abstractC5516j.m());
        } else if (atomicBoolean.getAndSet(true)) {
            c5508b.a();
        }
        return C5519m.f(null);
    }
}
