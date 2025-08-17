package xg;

import Dd.C3077a7;
import Dd.C3104ca;
import Dd.C3221m7;
import Dd.C3245o7;
import Dd.N9;
import Dd.Q9;
import Dd.X6;
import Dd.Z6;
import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5231i;
import gd.C14244c;
import java.util.List;
import java.util.concurrent.Executor;
import sg.C16964i;
import sg.C16968m;
import ug.C17255b;
import ug.InterfaceC17254a;
import vg.C17567a;
import yg.C18212a;
import zg.C18459e;

/* renamed from: xg.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18051g extends C18459e implements InterfaceC17254a {

    /* renamed from: m, reason: collision with root package name */
    private static final C17255b f169610m = new C17255b.a().a();

    /* renamed from: h, reason: collision with root package name */
    private final boolean f169611h;

    /* renamed from: i, reason: collision with root package name */
    private final C17255b f169612i;

    /* renamed from: j, reason: collision with root package name */
    final C3104ca f169613j;

    /* renamed from: k, reason: collision with root package name */
    private int f169614k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f169615l;

    @Override // zg.C18459e, java.io.Closeable, java.lang.AutoCloseable, ug.InterfaceC17254a
    public final synchronized void close() {
        super.close();
    }

    private final AbstractC5232j h(AbstractC5232j abstractC5232j, final int i10, final int i11) {
        return abstractC5232j.s(new InterfaceC5231i() { // from class: xg.e
            @Override // Td.InterfaceC5231i
            public final AbstractC5232j then(Object obj) {
                return this.f169604a.g(i10, i11, (List) obj);
            }
        });
    }

    @Override // com.google.android.gms.common.api.f
    public final C14244c[] a() {
        return this.f169611h ? C16968m.f160478a : new C14244c[]{C16968m.f160479b};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C18051g(C17255b c17255b, k kVar, Executor executor, N9 n92, C16964i c16964i) {
        X6 x62;
        super(kVar, executor);
        c17255b.b();
        this.f169612i = c17255b;
        boolean zF = C18046b.f();
        this.f169611h = zF;
        C3221m7 c3221m7 = new C3221m7();
        c3221m7.i(C18046b.c(c17255b));
        C3245o7 c3245o7J = c3221m7.j();
        C3077a7 c3077a7 = new C3077a7();
        if (zF) {
            x62 = X6.TYPE_THICK;
        } else {
            x62 = X6.TYPE_THIN;
        }
        c3077a7.e(x62);
        c3077a7.g(c3245o7J);
        n92.d(Q9.e(c3077a7, 1), Z6.ON_DEVICE_BARCODE_CREATE);
        this.f169613j = null;
    }

    final /* synthetic */ AbstractC5232j g(int i10, int i11, List list) throws Exception {
        return C5235m.f(list);
    }

    @Override // ug.InterfaceC17254a
    public final AbstractC5232j<List<C17567a>> w0(C18212a c18212a) {
        return h(super.b(c18212a), c18212a.j(), c18212a.f());
    }
}
