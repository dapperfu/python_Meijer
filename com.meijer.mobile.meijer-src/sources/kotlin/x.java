package kotlin;

import kotlin.InterfaceC6421H;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Lb0/x;", "Lc0/H;", "LH1/d;", "density", "<init>", "(LH1/d;)V", "", "startVelocity", "f", "(F)F", "initialValue", "initialVelocity", "d", "(FF)F", "", "playTimeNanos", "e", "(JFF)F", "c", "(FF)J", "b", "Lb0/n;", "a", "Lb0/n;", "flingCalculator", "()F", "absVelocityThreshold", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x implements InterfaceC6421H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6314n flingCalculator;

    @Override // kotlin.InterfaceC6421H
    /* renamed from: a */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    private final float f(float startVelocity) {
        return this.flingCalculator.b(startVelocity) * Math.signum(startVelocity);
    }

    @Override // kotlin.InterfaceC6421H
    public long c(float initialValue, float initialVelocity) {
        return this.flingCalculator.c(initialVelocity) * 1000000;
    }

    public x(H1.d dVar) {
        this.flingCalculator = new C6314n(y.a(), dVar);
    }

    @Override // kotlin.InterfaceC6421H
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.flingCalculator.d(initialVelocity).b(playTimeNanos / 1000000);
    }

    @Override // kotlin.InterfaceC6421H
    public float d(float initialValue, float initialVelocity) {
        return initialValue + f(initialVelocity);
    }

    @Override // kotlin.InterfaceC6421H
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialValue + this.flingCalculator.d(initialVelocity).a(playTimeNanos / 1000000);
    }
}
