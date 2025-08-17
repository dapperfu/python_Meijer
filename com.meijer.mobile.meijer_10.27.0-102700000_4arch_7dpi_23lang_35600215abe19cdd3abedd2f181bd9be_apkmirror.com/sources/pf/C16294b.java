package pf;

import Td.AbstractC5232j;
import Td.C5224b;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5225c;
import androidx.privacysandbox.ads.adservices.measurement.k;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16294b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f155732a = new k();

    public static <T> AbstractC5232j<T> b(AbstractC5232j<T> abstractC5232j, AbstractC5232j<T> abstractC5232j2) {
        final C5224b c5224b = new C5224b();
        final C5233k c5233k = new C5233k(c5224b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC5225c<T, AbstractC5232j<TContinuationResult>> interfaceC5225c = new InterfaceC5225c() { // from class: pf.a
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j3) {
                return C16294b.a(c5233k, atomicBoolean, c5224b, abstractC5232j3);
            }
        };
        Executor executor = f155732a;
        abstractC5232j.l(executor, interfaceC5225c);
        abstractC5232j2.l(executor, interfaceC5225c);
        return c5233k.a();
    }

    public static /* synthetic */ AbstractC5232j a(C5233k c5233k, AtomicBoolean atomicBoolean, C5224b c5224b, AbstractC5232j abstractC5232j) {
        if (abstractC5232j.r()) {
            c5233k.e(abstractC5232j.n());
        } else if (abstractC5232j.m() != null) {
            c5233k.d(abstractC5232j.m());
        } else if (atomicBoolean.getAndSet(true)) {
            c5224b.a();
        }
        return C5235m.f(null);
    }
}
