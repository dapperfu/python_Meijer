package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Lc0/I;", "Lc0/H;", "", "frictionMultiplier", "absVelocityThreshold", "<init>", "(FF)V", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JFF)F", "b", "c", "(FF)J", "d", "(FF)F", "a", "F", "()F", "friction", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6296I implements InterfaceC6295H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float friction;

    @Override // kotlin.InterfaceC6295H
    /* renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    public C6296I(float f10, float f11) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f11));
        this.friction = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    @Override // kotlin.InterfaceC6295H
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialVelocity * ((float) Math.exp(((playTimeNanos / 1000000) / 1000.0f) * this.friction));
    }

    @Override // kotlin.InterfaceC6295H
    public long c(float initialValue, float initialVelocity) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(initialVelocity))) * 1000.0f) / this.friction)) * 1000000;
    }

    @Override // kotlin.InterfaceC6295H
    public float d(float initialValue, float initialVelocity) {
        if (Math.abs(initialVelocity) <= getAbsVelocityThreshold()) {
            return initialValue;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / initialVelocity));
        float f10 = this.friction;
        return (initialValue - (initialVelocity / f10)) + ((initialVelocity / f10) * ((float) Math.exp((f10 * ((dLog / f10) * 1000)) / 1000.0f)));
    }

    @Override // kotlin.InterfaceC6295H
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        float f10 = this.friction;
        return (initialValue - (initialVelocity / f10)) + ((initialVelocity / f10) * ((float) Math.exp((f10 * (playTimeNanos / 1000000)) / 1000.0f)));
    }
}
