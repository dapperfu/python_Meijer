package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001b"}, d2 = {"Lb0/n;", "", "", "friction", "LH1/d;", "density", "<init>", "(FLH1/d;)V", "a", "(LH1/d;)F", "velocity", "", "e", "(F)D", "", "c", "(F)J", "b", "(F)F", "Lb0/n$a;", "d", "(F)Lb0/n$a;", "F", "LH1/d;", "getDensity", "()LH1/d;", "magicPhysicalCoefficient", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6314n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float friction;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float magicPhysicalCoefficient;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lb0/n$a;", "", "", "initialVelocity", "distance", "", "duration", "<init>", "(FFJ)V", "time", "a", "(J)F", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getInitialVelocity", "()F", "getDistance", "c", "J", "getDuration", "()J", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.n$a, reason: from toString */
    public static final /* data */ class FlingInfo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float initialVelocity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float distance;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long duration;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) other;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float a(long time) {
            long j10 = this.duration;
            return this.distance * Math.signum(this.initialVelocity) * C6301a.f59720a.b(j10 > 0 ? time / j10 : 1.0f).getDistanceCoefficient();
        }

        public final float b(long time) {
            long j10 = this.duration;
            return (((C6301a.f59720a.b(j10 > 0 ? time / j10 : 1.0f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public FlingInfo(float f10, float f11, long j10) {
            this.initialVelocity = f10;
            this.distance = f11;
            this.duration = j10;
        }
    }

    private final double e(float velocity) {
        return C6301a.f59720a.a(velocity, this.friction * this.magicPhysicalCoefficient);
    }

    public C6314n(float f10, H1.d dVar) {
        this.friction = f10;
        this.density = dVar;
        this.magicPhysicalCoefficient = a(dVar);
    }

    private final float a(H1.d density) {
        return C6315o.c(0.84f, density.getDensity());
    }

    public final float b(float velocity) {
        return (float) (this.friction * this.magicPhysicalCoefficient * Math.exp((C6315o.f59841a / (C6315o.f59841a - 1.0d)) * e(velocity)));
    }

    public final long c(float velocity) {
        return (long) (Math.exp(e(velocity) / (C6315o.f59841a - 1.0d)) * 1000.0d);
    }

    public final FlingInfo d(float velocity) {
        double dE = e(velocity);
        double d10 = C6315o.f59841a - 1.0d;
        return new FlingInfo(velocity, (float) (this.friction * this.magicPhysicalCoefficient * Math.exp((C6315o.f59841a / d10) * dE)), (long) (Math.exp(dE / d10) * 1000.0d));
    }
}
