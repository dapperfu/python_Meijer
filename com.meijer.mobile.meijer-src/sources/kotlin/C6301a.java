package kotlin;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lb0/a;", "", "<init>", "()V", "", "time", "Lb0/a$a;", "b", "(F)Lb0/a$a;", "velocity", "friction", "", "a", "(FF)D", "", "[F", "SplinePositions", "c", "SplineTimes", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6301a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6301a f59720a = new C6301a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float[] SplinePositions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float[] SplineTimes;

    /* renamed from: d, reason: collision with root package name */
    public static final int f59723d;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb0/a$a;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class FlingResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float distanceCoefficient;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float velocityCoefficient;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) other;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        /* renamed from: a, reason: from getter */
        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        /* renamed from: b, reason: from getter */
        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return (Float.hashCode(this.distanceCoefficient) * 31) + Float.hashCode(this.velocityCoefficient);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }

        public FlingResult(float f10, float f11) {
            this.distanceCoefficient = f10;
            this.velocityCoefficient = f11;
        }
    }

    public final FlingResult b(float time) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        float fN = RangesKt.n(time, 0.0f, 1.0f);
        float f12 = 100;
        int i10 = (int) (f12 * fN);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = SplinePositions;
            float f15 = fArr[i10];
            float f16 = (fArr[i11] - f15) / (f14 - f13);
            float f17 = ((fN - f13) * f16) + f15;
            f10 = f16;
            f11 = f17;
        }
        return new FlingResult(f11, f10);
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        w.b(fArr, fArr2, 100);
        f59723d = 8;
    }

    private C6301a() {
    }

    public final double a(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }
}
