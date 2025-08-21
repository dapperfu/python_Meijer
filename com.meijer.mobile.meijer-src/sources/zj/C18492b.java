package zj;

import Tf.d;
import com.google.firebase.perf.metrics.Trace;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzj/b;", "Lzj/a;", "LTf/d;", "firebasePerformance", "<init>", "(LTf/d;)V", "", "traceName", "", "c", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "Lcom/google/firebase/perf/metrics/Trace;", "", "Lkotlin/ExtensionFunctionType;", "traceBuilder", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "b", "(Ljava/lang/String;)V", "LTf/d;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "tracesMap", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zj.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18492b implements InterfaceC18491a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d firebasePerformance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, Trace> tracesMap;

    public C18492b(d firebasePerformance) {
        Intrinsics.j(firebasePerformance, "firebasePerformance");
        this.firebasePerformance = firebasePerformance;
        this.tracesMap = new ConcurrentHashMap<>();
    }

    private final boolean c(String traceName) {
        return this.tracesMap.get(traceName) != null;
    }

    @Override // zj.InterfaceC18491a
    public void a(String traceName, Function1<? super Trace, Unit> traceBuilder) {
        Intrinsics.j(traceName, "traceName");
        Intrinsics.j(traceBuilder, "traceBuilder");
        if (c(traceName)) {
            return;
        }
        Trace traceE = this.firebasePerformance.e(traceName);
        Intrinsics.i(traceE, "newTrace(...)");
        traceBuilder.invoke(traceE);
        this.tracesMap.put(traceName, traceE);
        traceE.start();
    }

    @Override // zj.InterfaceC18491a
    public void b(String traceName) {
        Intrinsics.j(traceName, "traceName");
        Trace trace = this.tracesMap.get(traceName);
        if (trace != null) {
            trace.stop();
        }
    }
}
