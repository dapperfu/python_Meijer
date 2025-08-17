package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"T", "Lc0/q;", "V", "Lc0/k;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "f", "(Lc0/k;Ljava/lang/Object;Lc0/q;JJZ)Lc0/k;", "", "Lc0/m;", "velocity", "e", "(Lc0/k;FFJJZ)Lc0/k;", "initialValue", "initialVelocity", "a", "(FFJJZ)Lc0/k;", "Lc0/o0;", "typeConverter", "b", "(Lc0/o0;Ljava/lang/Object;Ljava/lang/Object;JJZ)Lc0/k;", "i", "(Lc0/o0;Ljava/lang/Object;)Lc0/q;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6329l {
    public static final AnimationState<Float, C6330m> a(float f10, float f11, long j10, long j11, boolean z10) {
        return new AnimationState<>(q0.i(FloatCompanionObject.f142822a), Float.valueOf(f10), C6335r.a(f11), j10, j11, z10);
    }

    public static final <T, V extends AbstractC6334q> AnimationState<T, V> b(o0<T, V> o0Var, T t10, T t11, long j10, long j11, boolean z10) {
        return new AnimationState<>(o0Var, t10, o0Var.a().invoke(t11), j10, j11, z10);
    }

    public static /* synthetic */ AnimationState c(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j10, j11, z10);
    }

    public static /* synthetic */ AnimationState d(o0 o0Var, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return b(o0Var, obj, obj2, j10, j11, z10);
    }

    public static final AnimationState<Float, C6330m> e(AnimationState<Float, C6330m> c6328k, float f10, float f11, long j10, long j11, boolean z10) {
        return new AnimationState<>(c6328k.l(), Float.valueOf(f10), C6335r.a(f11), j10, j11, z10);
    }

    public static final <T, V extends AbstractC6334q> AnimationState<T, V> f(AnimationState<T, V> c6328k, T t10, V v10, long j10, long j11, boolean z10) {
        return new AnimationState<>(c6328k.l(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ AnimationState g(AnimationState c6328k, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) c6328k.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((C6330m) c6328k.p()).getValue();
        }
        if ((i10 & 4) != 0) {
            j10 = c6328k.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = c6328k.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = c6328k.getIsRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return e(c6328k, f10, f11, j10, j12, z11);
    }

    public static /* synthetic */ AnimationState h(AnimationState c6328k, Object obj, AbstractC6334q abstractC6334q, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c6328k.getValue();
        }
        if ((i10 & 2) != 0) {
            abstractC6334q = C6335r.e(c6328k.p());
        }
        if ((i10 & 4) != 0) {
            j10 = c6328k.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = c6328k.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = c6328k.getIsRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return f(c6328k, obj, abstractC6334q, j10, j12, z11);
    }

    public static final <T, V extends AbstractC6334q> V i(o0<T, V> o0Var, T t10) {
        V vInvoke = o0Var.a().invoke(t10);
        vInvoke.d();
        return vInvoke;
    }
}
