package a1;

import V0.BlendModeColorFilter;
import V0.C5306c0;
import V0.C5346q0;
import V0.C5347r0;
import V0.F1;
import V0.G1;
import V0.s1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012\"\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\n\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LV0/q0;", "other", "", "e", "(JJ)Z", "LV0/r0;", "f", "(LV0/r0;)Z", "", "La1/h;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "EmptyPath", "LV0/F1;", "b", "I", "()I", "DefaultStrokeLineCap", "LV0/G1;", "c", "DefaultStrokeLineJoin", "LV0/c0;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "LV0/s1;", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final List<h> f43520a = CollectionsKt.m();

    /* renamed from: b, reason: collision with root package name */
    private static final int f43521b = F1.INSTANCE.a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f43522c = G1.INSTANCE.b();

    /* renamed from: d, reason: collision with root package name */
    private static final int f43523d = C5306c0.INSTANCE.z();

    /* renamed from: e, reason: collision with root package name */
    private static final long f43524e = C5346q0.INSTANCE.i();

    /* renamed from: f, reason: collision with root package name */
    private static final int f43525f = s1.INSTANCE.b();

    public static final int a() {
        return f43525f;
    }

    public static final int b() {
        return f43521b;
    }

    public static final int c() {
        return f43522c;
    }

    public static final List<h> d() {
        return f43520a;
    }

    public static final boolean f(C5347r0 c5347r0) {
        if (!(c5347r0 instanceof BlendModeColorFilter)) {
            return c5347r0 == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) c5347r0;
        int blendMode = blendModeColorFilter.getBlendMode();
        C5306c0.Companion companion = C5306c0.INSTANCE;
        return C5306c0.E(blendMode, companion.z()) || C5306c0.E(blendModeColorFilter.getBlendMode(), companion.B());
    }

    public static final boolean e(long j10, long j11) {
        if (C5346q0.x(j10) == C5346q0.x(j11) && C5346q0.w(j10) == C5346q0.w(j11) && C5346q0.u(j10) == C5346q0.u(j11)) {
            return true;
        }
        return false;
    }
}
