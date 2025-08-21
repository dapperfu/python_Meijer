package zg;

import Fd.C3299a7;
import Fd.C3317c1;
import Fd.C3329d1;
import Fd.C3353f1;
import Fd.C3364g0;
import Fd.C3443m7;
import Fd.C3586z6;
import Fd.C9;
import Fd.D6;
import Fd.E6;
import Fd.K6;
import Fd.M9;
import Fd.N9;
import Fd.P9;
import Fd.Q9;
import Fd.X6;
import Fd.Y6;
import Fd.Z6;
import android.os.SystemClock;
import com.google.android.gms.common.internal.r;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;
import ug.AbstractC17408f;
import ug.C17409g;
import ug.C17411i;
import wg.C17872b;
import xg.C18179a;

/* loaded from: classes8.dex */
public final class k extends AbstractC17408f {

    /* renamed from: j, reason: collision with root package name */
    private static final Bg.d f172773j = Bg.d.b();

    /* renamed from: k, reason: collision with root package name */
    static boolean f172774k = true;

    /* renamed from: d, reason: collision with root package name */
    private final C17872b f172775d;

    /* renamed from: e, reason: collision with root package name */
    private final l f172776e;

    /* renamed from: f, reason: collision with root package name */
    private final N9 f172777f;

    /* renamed from: g, reason: collision with root package name */
    private final P9 f172778g;

    /* renamed from: h, reason: collision with root package name */
    private final Bg.a f172779h = new Bg.a();

    /* renamed from: i, reason: collision with root package name */
    private boolean f172780i;

    @Override // ug.AbstractC17413k
    public final synchronized void b() throws MlKitException {
        this.f172780i = this.f172776e.zzc();
    }

    @Override // ug.AbstractC17413k
    public final synchronized void d() {
        try {
            this.f172776e.zzb();
            f172774k = true;
            C3299a7 c3299a7 = new C3299a7();
            X6 x62 = this.f172780i ? X6.TYPE_THICK : X6.TYPE_THIN;
            N9 n92 = this.f172777f;
            c3299a7.e(x62);
            C3443m7 c3443m7 = new C3443m7();
            c3443m7.i(C18483b.c(this.f172775d));
            c3299a7.g(c3443m7.j());
            n92.d(Q9.d(c3299a7), Z6.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ug.AbstractC17408f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(Ag.a aVar) throws Throwable {
        k kVar;
        Ag.a aVar2;
        try {
            try {
                Bg.a aVar3 = this.f172779h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                aVar3.a(aVar);
                try {
                    List listA = this.f172776e.a(aVar);
                    kVar = this;
                    aVar2 = aVar;
                    try {
                        kVar.m(Y6.NO_ERROR, jElapsedRealtime, aVar2, listA);
                        f172774k = false;
                        return listA;
                    } catch (MlKitException e10) {
                        e = e10;
                        MlKitException mlKitException = e;
                        kVar.m(mlKitException.a() == 14 ? Y6.MODEL_NOT_DOWNLOADED : Y6.UNKNOWN_ERROR, jElapsedRealtime, aVar2, null);
                        throw mlKitException;
                    }
                } catch (MlKitException e11) {
                    e = e11;
                    kVar = this;
                    aVar2 = aVar;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void m(final Y6 y62, long j10, final Ag.a aVar, List list) {
        final C3364g0 c3364g0 = new C3364g0();
        final C3364g0 c3364g02 = new C3364g0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18179a c18179a = (C18179a) it.next();
                c3364g0.e(C18483b.a(c18179a.c()));
                c3364g02.e(C18483b.b(c18179a.e()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f172777f.f(new M9() { // from class: zg.i
            @Override // Fd.M9
            public final C9 zza() {
                return this.f172766a.j(jElapsedRealtime, y62, c3364g0, c3364g02, aVar);
            }
        }, Z6.ON_DEVICE_BARCODE_DETECT);
        C3329d1 c3329d1 = new C3329d1();
        c3329d1.e(y62);
        c3329d1.f(Boolean.valueOf(f172774k));
        c3329d1.g(C18483b.c(this.f172775d));
        c3329d1.c(c3364g0.g());
        c3329d1.d(c3364g02.g());
        final C3353f1 c3353f1H = c3329d1.h();
        final j jVar = new j(this);
        final N9 n92 = this.f172777f;
        final Z6 z62 = Z6.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C17409g.d().execute(new Runnable() { // from class: Fd.L9
            @Override // java.lang.Runnable
            public final void run() {
                n92.h(z62, c3353f1H, jElapsedRealtime, jVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f172778g.c(true != this.f172780i ? 24301 : 24302, y62.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    final /* synthetic */ C9 j(long j10, Y6 y62, C3364g0 c3364g0, C3364g0 c3364g02, Ag.a aVar) {
        C3443m7 c3443m7 = new C3443m7();
        K6 k62 = new K6();
        k62.c(Long.valueOf(j10));
        k62.d(y62);
        k62.e(Boolean.valueOf(f172774k));
        Boolean bool = Boolean.TRUE;
        k62.a(bool);
        k62.b(bool);
        c3443m7.h(k62.f());
        c3443m7.i(C18483b.c(this.f172775d));
        c3443m7.e(c3364g0.g());
        c3443m7.f(c3364g02.g());
        int iE = aVar.e();
        int iC = f172773j.c(aVar);
        D6 d62 = new D6();
        d62.a(iE != -1 ? iE != 35 ? iE != 842094169 ? iE != 16 ? iE != 17 ? E6.UNKNOWN_FORMAT : E6.NV21 : E6.NV16 : E6.YV12 : E6.YUV_420_888 : E6.BITMAP);
        d62.b(Integer.valueOf(iC));
        c3443m7.g(d62.d());
        C3299a7 c3299a7 = new C3299a7();
        c3299a7.e(this.f172780i ? X6.TYPE_THICK : X6.TYPE_THIN);
        c3299a7.g(c3443m7.j());
        return Q9.d(c3299a7);
    }

    final /* synthetic */ C9 k(C3353f1 c3353f1, int i10, C3586z6 c3586z6) {
        C3299a7 c3299a7 = new C3299a7();
        c3299a7.e(this.f172780i ? X6.TYPE_THICK : X6.TYPE_THIN);
        C3317c1 c3317c1 = new C3317c1();
        c3317c1.a(Integer.valueOf(i10));
        c3317c1.c(c3353f1);
        c3317c1.b(c3586z6);
        c3299a7.d(c3317c1.e());
        return Q9.d(c3299a7);
    }

    public k(C17411i c17411i, C17872b c17872b, l lVar, N9 n92) {
        r.m(c17411i, "MlKitContext can not be null");
        r.m(c17872b, "BarcodeScannerOptions can not be null");
        this.f172775d = c17872b;
        this.f172776e = lVar;
        this.f172777f = n92;
        this.f172778g = P9.a(c17411i.b());
    }
}
