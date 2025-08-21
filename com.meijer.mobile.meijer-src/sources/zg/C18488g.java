package zg;

import Fd.C3299a7;
import Fd.C3326ca;
import Fd.C3443m7;
import Fd.C3467o7;
import Fd.N9;
import Fd.Q9;
import Fd.X6;
import Fd.Z6;
import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5515i;
import id.C14720c;
import java.util.List;
import java.util.concurrent.Executor;
import ug.C17411i;
import ug.C17415m;
import wg.C17872b;
import wg.InterfaceC17871a;
import xg.C18179a;

/* renamed from: zg.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18488g extends Bg.e implements InterfaceC17871a {

    /* renamed from: m, reason: collision with root package name */
    private static final C17872b f172759m = new C17872b.a().a();

    /* renamed from: h, reason: collision with root package name */
    private final boolean f172760h;

    /* renamed from: i, reason: collision with root package name */
    private final C17872b f172761i;

    /* renamed from: j, reason: collision with root package name */
    final C3326ca f172762j;

    /* renamed from: k, reason: collision with root package name */
    private int f172763k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f172764l;

    @Override // Bg.e, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    private final AbstractC5516j h(AbstractC5516j abstractC5516j, final int i10, final int i11) {
        return abstractC5516j.s(new InterfaceC5515i() { // from class: zg.e
            @Override // Vd.InterfaceC5515i
            public final AbstractC5516j then(Object obj) {
                return this.f172753a.g(i10, i11, (List) obj);
            }
        });
    }

    @Override // com.google.android.gms.common.api.f
    public final C14720c[] a() {
        return this.f172760h ? C17415m.f163964a : new C14720c[]{C17415m.f163965b};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C18488g(C17872b c17872b, k kVar, Executor executor, N9 n92, C17411i c17411i) {
        X6 x62;
        super(kVar, executor);
        c17872b.b();
        this.f172761i = c17872b;
        boolean zF = C18483b.f();
        this.f172760h = zF;
        C3443m7 c3443m7 = new C3443m7();
        c3443m7.i(C18483b.c(c17872b));
        C3467o7 c3467o7J = c3443m7.j();
        C3299a7 c3299a7 = new C3299a7();
        if (zF) {
            x62 = X6.TYPE_THICK;
        } else {
            x62 = X6.TYPE_THIN;
        }
        c3299a7.e(x62);
        c3299a7.g(c3467o7J);
        n92.d(Q9.e(c3299a7, 1), Z6.ON_DEVICE_BARCODE_CREATE);
        this.f172762j = null;
    }

    @Override // wg.InterfaceC17871a
    public final AbstractC5516j<List<C18179a>> D0(Ag.a aVar) {
        return h(super.b(aVar), aVar.j(), aVar.f());
    }

    final /* synthetic */ AbstractC5516j g(int i10, int i11, List list) throws Exception {
        return C5519m.f(list);
    }
}
