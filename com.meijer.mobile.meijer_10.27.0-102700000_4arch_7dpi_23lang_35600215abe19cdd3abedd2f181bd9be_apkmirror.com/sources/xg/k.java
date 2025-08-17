package xg;

import Dd.C3077a7;
import Dd.C3095c1;
import Dd.C3107d1;
import Dd.C3131f1;
import Dd.C3142g0;
import Dd.C3221m7;
import Dd.C3364z6;
import Dd.C9;
import Dd.D6;
import Dd.E6;
import Dd.K6;
import Dd.M9;
import Dd.N9;
import Dd.P9;
import Dd.Q9;
import Dd.X6;
import Dd.Y6;
import Dd.Z6;
import android.os.SystemClock;
import com.google.android.gms.common.internal.r;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;
import sg.AbstractC16961f;
import sg.C16962g;
import sg.C16964i;
import ug.C17255b;
import vg.C17567a;
import yg.C18212a;
import zg.C18455a;
import zg.C18458d;

/* loaded from: classes7.dex */
public final class k extends AbstractC16961f {

    /* renamed from: j, reason: collision with root package name */
    private static final C18458d f169624j = C18458d.b();

    /* renamed from: k, reason: collision with root package name */
    static boolean f169625k = true;

    /* renamed from: d, reason: collision with root package name */
    private final C17255b f169626d;

    /* renamed from: e, reason: collision with root package name */
    private final l f169627e;

    /* renamed from: f, reason: collision with root package name */
    private final N9 f169628f;

    /* renamed from: g, reason: collision with root package name */
    private final P9 f169629g;

    /* renamed from: h, reason: collision with root package name */
    private final C18455a f169630h = new C18455a();

    /* renamed from: i, reason: collision with root package name */
    private boolean f169631i;

    @Override // sg.AbstractC16966k
    public final synchronized void b() throws MlKitException {
        this.f169631i = this.f169627e.zzc();
    }

    @Override // sg.AbstractC16966k
    public final synchronized void d() {
        try {
            this.f169627e.zzb();
            f169625k = true;
            C3077a7 c3077a7 = new C3077a7();
            X6 x62 = this.f169631i ? X6.TYPE_THICK : X6.TYPE_THIN;
            N9 n92 = this.f169628f;
            c3077a7.e(x62);
            C3221m7 c3221m7 = new C3221m7();
            c3221m7.i(C18046b.c(this.f169626d));
            c3077a7.g(c3221m7.j());
            n92.d(Q9.d(c3077a7), Z6.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // sg.AbstractC16961f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(C18212a c18212a) throws Throwable {
        k kVar;
        C18212a c18212a2;
        try {
            try {
                C18455a c18455a = this.f169630h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c18455a.a(c18212a);
                try {
                    List listA = this.f169627e.a(c18212a);
                    kVar = this;
                    c18212a2 = c18212a;
                    try {
                        kVar.m(Y6.NO_ERROR, jElapsedRealtime, c18212a2, listA);
                        f169625k = false;
                        return listA;
                    } catch (MlKitException e10) {
                        e = e10;
                        MlKitException mlKitException = e;
                        kVar.m(mlKitException.a() == 14 ? Y6.MODEL_NOT_DOWNLOADED : Y6.UNKNOWN_ERROR, jElapsedRealtime, c18212a2, null);
                        throw mlKitException;
                    }
                } catch (MlKitException e11) {
                    e = e11;
                    kVar = this;
                    c18212a2 = c18212a;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void m(final Y6 y62, long j10, final C18212a c18212a, List list) {
        final C3142g0 c3142g0 = new C3142g0();
        final C3142g0 c3142g02 = new C3142g0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17567a c17567a = (C17567a) it.next();
                c3142g0.e(C18046b.a(c17567a.c()));
                c3142g02.e(C18046b.b(c17567a.e()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f169628f.f(new M9() { // from class: xg.i
            @Override // Dd.M9
            public final C9 zza() {
                return this.f169617a.j(jElapsedRealtime, y62, c3142g0, c3142g02, c18212a);
            }
        }, Z6.ON_DEVICE_BARCODE_DETECT);
        C3107d1 c3107d1 = new C3107d1();
        c3107d1.e(y62);
        c3107d1.f(Boolean.valueOf(f169625k));
        c3107d1.g(C18046b.c(this.f169626d));
        c3107d1.c(c3142g0.g());
        c3107d1.d(c3142g02.g());
        final C3131f1 c3131f1H = c3107d1.h();
        final j jVar = new j(this);
        final N9 n92 = this.f169628f;
        final Z6 z62 = Z6.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C16962g.d().execute(new Runnable() { // from class: Dd.L9
            @Override // java.lang.Runnable
            public final void run() {
                n92.h(z62, c3131f1H, jElapsedRealtime, jVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f169629g.c(true != this.f169631i ? 24301 : 24302, y62.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    final /* synthetic */ C9 j(long j10, Y6 y62, C3142g0 c3142g0, C3142g0 c3142g02, C18212a c18212a) {
        C3221m7 c3221m7 = new C3221m7();
        K6 k62 = new K6();
        k62.c(Long.valueOf(j10));
        k62.d(y62);
        k62.e(Boolean.valueOf(f169625k));
        Boolean bool = Boolean.TRUE;
        k62.a(bool);
        k62.b(bool);
        c3221m7.h(k62.f());
        c3221m7.i(C18046b.c(this.f169626d));
        c3221m7.e(c3142g0.g());
        c3221m7.f(c3142g02.g());
        int iE = c18212a.e();
        int iC = f169624j.c(c18212a);
        D6 d62 = new D6();
        d62.a(iE != -1 ? iE != 35 ? iE != 842094169 ? iE != 16 ? iE != 17 ? E6.UNKNOWN_FORMAT : E6.NV21 : E6.NV16 : E6.YV12 : E6.YUV_420_888 : E6.BITMAP);
        d62.b(Integer.valueOf(iC));
        c3221m7.g(d62.d());
        C3077a7 c3077a7 = new C3077a7();
        c3077a7.e(this.f169631i ? X6.TYPE_THICK : X6.TYPE_THIN);
        c3077a7.g(c3221m7.j());
        return Q9.d(c3077a7);
    }

    final /* synthetic */ C9 k(C3131f1 c3131f1, int i10, C3364z6 c3364z6) {
        C3077a7 c3077a7 = new C3077a7();
        c3077a7.e(this.f169631i ? X6.TYPE_THICK : X6.TYPE_THIN);
        C3095c1 c3095c1 = new C3095c1();
        c3095c1.a(Integer.valueOf(i10));
        c3095c1.c(c3131f1);
        c3095c1.b(c3364z6);
        c3077a7.d(c3095c1.e());
        return Q9.d(c3077a7);
    }

    public k(C16964i c16964i, C17255b c17255b, l lVar, N9 n92) {
        r.m(c16964i, "MlKitContext can not be null");
        r.m(c17255b, "BarcodeScannerOptions can not be null");
        this.f169626d = c17255b;
        this.f169627e = lVar;
        this.f169628f = n92;
        this.f169629g = P9.a(c16964i.b());
    }
}
