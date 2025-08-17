package ag;

import Vf.f;
import com.google.firebase.perf.metrics.Trace;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Uf.a f45456a = Uf.a.e();

    public static Trace a(Trace trace, f.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(EnumC5600b.FRAMES_TOTAL.toString(), aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(EnumC5600b.FRAMES_SLOW.toString(), aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(EnumC5600b.FRAMES_FROZEN.toString(), aVar.b());
        }
        f45456a.a("Screen trace: " + trace.getName() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
