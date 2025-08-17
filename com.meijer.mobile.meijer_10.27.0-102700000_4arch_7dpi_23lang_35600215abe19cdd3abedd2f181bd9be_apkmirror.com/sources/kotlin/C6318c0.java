package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0017\u0010\u0005R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0019\u0010\u0005\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lc0/c0;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Lc0/T;", "f", "(FFJ)J", "a", "F", "getFinalPosition", "()F", "d", "", "b", "D", "naturalFreq", "value", "c", "dampingRatio", "e", "stiffness", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6318c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float finalPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float dampingRatio = 1.0f;

    public final void c(float f10) {
        if (f10 < 0.0f) {
            C6310X.a("Damping ratio must be non-negative");
        }
        this.dampingRatio = f10;
    }

    /* renamed from: a, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float b() {
        double d10 = this.naturalFreq;
        return (float) (d10 * d10);
    }

    public final void d(float f10) {
        this.finalPosition = f10;
    }

    public final long f(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dExp;
        double dExp2;
        float f10 = lastDisplacement - this.finalPosition;
        double d10 = timeElapsed / 1000.0d;
        float f11 = this.dampingRatio;
        double d11 = f11 * f11;
        double d12 = this.naturalFreq;
        double d13 = (-f11) * d12;
        if (f11 > 1.0f) {
            double dSqrt = d12 * Math.sqrt(d11 - 1);
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f10;
            double d17 = ((d15 * d16) - lastVelocity) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dExp2 = (Math.exp(d19) * d18) + (Math.exp(d20) * d17);
            dExp = (d18 * d15 * Math.exp(d19)) + (d17 * d14 * Math.exp(d20));
        } else if (f11 == 1.0f) {
            double d21 = f10;
            double d22 = lastVelocity + (d12 * d21);
            double d23 = (-d12) * d10;
            double d24 = d21 + (d10 * d22);
            dExp2 = d24 * Math.exp(d23);
            dExp = (d24 * Math.exp(d23) * (-this.naturalFreq)) + (d22 * Math.exp(d23));
        } else {
            double d25 = 1;
            double dSqrt2 = d12 * Math.sqrt(d25 - d11);
            double d26 = f10;
            double d27 = (d25 / dSqrt2) * (((-d13) * d26) + lastVelocity);
            double d28 = dSqrt2 * d10;
            double d29 = d10 * d13;
            double dExp3 = Math.exp(d29) * ((Math.cos(d28) * d26) + (Math.sin(d28) * d27));
            dExp = (d13 * dExp3) + (Math.exp(d29) * (((-dSqrt2) * d26 * Math.sin(d28)) + (dSqrt2 * d27 * Math.cos(d28))));
            dExp2 = dExp3;
        }
        return C6306T.a((Float.floatToRawIntBits((float) dExp) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + this.finalPosition)) << 32));
    }

    public C6318c0(float f10) {
        this.finalPosition = f10;
    }

    public final void e(float f10) {
        if (b() <= 0.0f) {
            C6310X.a("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f10);
    }
}
