package cg;

import Xf.f;
import com.google.firebase.perf.metrics.Trace;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Wf.a f62471a = Wf.a.e();

    public static Trace a(Trace trace, f.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(EnumC6506b.FRAMES_TOTAL.toString(), aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(EnumC6506b.FRAMES_SLOW.toString(), aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(EnumC6506b.FRAMES_FROZEN.toString(), aVar.b());
        }
        f62471a.a("Screen trace: " + trace.getName() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
