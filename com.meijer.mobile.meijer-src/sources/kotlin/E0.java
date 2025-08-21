package kotlin;

import H1.h;
import H1.n;
import H1.r;
import U0.f;
import U0.k;
import androidx.compose.ui.geometry.Rect;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"4\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u0014*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0012\u001a\u00020\u0018*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019\"\u0015\u0010\u0012\u001a\u00020\u001b*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001c\"\u0015\u0010\u0012\u001a\u00020\u001e*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010\u0012\u001a\u00020\"*\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010\u0012\u001a\u00020\u0000*\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "a", "Landroidx/compose/ui/geometry/Rect;", "RectVisibilityThreshold", "", "Lc0/o0;", "", "b", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "getVisibilityThresholdMap$annotations", "()V", "VisibilityThresholdMap", "LH1/n$a;", "LH1/n;", "c", "(LH1/n$a;)J", "VisibilityThreshold", "LU0/f$a;", "LU0/f;", "e", "(LU0/f$a;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "LH1/h$a;", "LH1/h;", "(LH1/h$a;)F", "LU0/k$a;", "LU0/k;", "f", "(LU0/k$a;)J", "LH1/r$a;", "LH1/r;", "d", "(LH1/r$a;)J", "Landroidx/compose/ui/geometry/Rect$a;", "g", "(Landroidx/compose/ui/geometry/Rect$a;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Rect f60690a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<o0<?, ?>, Float> f60691b;

    public static final int b(IntCompanionObject intCompanionObject) {
        return 1;
    }

    public static final long c(n.Companion companion) {
        long j10 = 1;
        return H1.n.f((j10 & 4294967295L) | (j10 << 32));
    }

    public static final long d(r.Companion companion) {
        long j10 = 1;
        return r.c((j10 & 4294967295L) | (j10 << 32));
    }

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f60690a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        o0<Integer, C6456m> o0VarJ = q0.j(IntCompanionObject.f143731a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pairA = TuplesKt.a(o0VarJ, fValueOf2);
        Pair pairA2 = TuplesKt.a(q0.e(r.INSTANCE), fValueOf2);
        Pair pairA3 = TuplesKt.a(q0.d(H1.n.INSTANCE), fValueOf2);
        Pair pairA4 = TuplesKt.a(q0.i(FloatCompanionObject.f143729a), Float.valueOf(0.01f));
        Pair pairA5 = TuplesKt.a(q0.h(Rect.INSTANCE), fValueOf);
        Pair pairA6 = TuplesKt.a(q0.g(U0.k.INSTANCE), fValueOf);
        Pair pairA7 = TuplesKt.a(q0.f(U0.f.INSTANCE), fValueOf);
        o0<H1.h, C6456m> o0VarB = q0.b(H1.h.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        f60691b = MapsKt.o(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, TuplesKt.a(o0VarB, fValueOf3), TuplesKt.a(q0.c(H1.j.INSTANCE), fValueOf3));
    }

    public static final long e(f.Companion companion) {
        return U0.f.e((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final long f(k.Companion companion) {
        return U0.k.d((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final Rect g(Rect.Companion companion) {
        return f60690a;
    }

    public static final Map<o0<?, ?>, Float> h() {
        return f60691b;
    }

    public static final float a(h.Companion companion) {
        return H1.h.p(0.1f);
    }
}
