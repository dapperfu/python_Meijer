package h1;

import U0.f;
import g1.HistoricalChange;
import g1.PointerInputChange;
import g1.r;
import j1.C14920a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a9\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!\"0\u0010*\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"0\u0010/\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010#\u0012\u0004\b.\u0010)\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'*\u0018\b\u0002\u00100\"\b\u0012\u0004\u0012\u00020\u00120\u00002\b\u0012\u0004\u0012\u00020\u00120\u0000*\f\b\u0002\u00101\"\u00020\u00122\u00020\u0012¨\u00062"}, d2 = {"", "Lh1/a;", "", "index", "", "time", "", "dataPoint", "", "j", "([Lh1/a;IJF)V", "Lh1/d;", "Lg1/B;", "event", "c", "(Lh1/d;Lg1/B;)V", "d", "e", "", "x", "y", "sampleCount", "degree", "coefficients", "i", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "f", "([F[FIZ)F", "a", "g", "([F[F)F", "<set-?>", "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerAddPointsFix", "b", "h", "setVelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "VelocityTrackerStrategyUseImpulse", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14441e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f134656a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f134657b;

    private static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final void c(C14440d c14440d, PointerInputChange pointerInputChange) {
        if (f134656a) {
            e(c14440d, pointerInputChange);
        } else {
            d(c14440d, pointerInputChange);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float[] fArr, float[] fArr2, int i10, boolean z10) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float fSignum = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f11 = fArr2[i13];
            if (f10 != f11) {
                float f12 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f11);
                fSignum += (f12 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f12);
                if (i12 == i11) {
                    fSignum *= 0.5f;
                }
            }
            i12--;
            f10 = f11;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    public static final boolean h() {
        return f134657b;
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        int i12 = i11;
        if (i12 < 1) {
            C14920a.a("The degree must be at positive integer");
        }
        if (i10 == 0) {
            C14920a.a("At least one point must be provided");
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i10];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            ArraysKt.l(fArr4[i19], fArr7, 0, 0, i10);
            for (int i20 = 0; i20 < i19; i20++) {
                float[] fArr8 = fArr5[i20];
                float fG = g(fArr7, fArr8);
                for (int i21 = 0; i21 < i10; i21++) {
                    fArr7[i21] = fArr7[i21] - (fArr8[i21] * fG);
                }
            }
            float fSqrt = (float) Math.sqrt(g(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i22 = 0; i22 < i10; i22++) {
                fArr7[i22] = fArr7[i22] * f10;
            }
            float[] fArr9 = fArr6[i19];
            int i23 = 0;
            while (i23 < i13) {
                fArr9[i23] = i23 < i19 ? 0.0f : g(fArr7, fArr4[i23]);
                i23++;
            }
            i19++;
        }
        for (int i24 = i12; -1 < i24; i24--) {
            float fG2 = g(fArr5[i24], fArr2);
            float[] fArr10 = fArr6[i24];
            int i25 = i24 + 1;
            if (i25 <= i12) {
                int i26 = i12;
                while (true) {
                    fG2 -= fArr10[i26] * fArr3[i26];
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            fArr3[i24] = fG2 / fArr10[i24];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DataPointAtTime[] dataPointAtTimeArr, int i10, long j10, float f10) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i10];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i10] = new DataPointAtTime(j10, f10);
        } else {
            dataPointAtTime.d(j10);
            dataPointAtTime.c(f10);
        }
    }

    private static final void d(C14440d c14440d, PointerInputChange pointerInputChange) {
        if (r.b(pointerInputChange)) {
            c14440d.f(pointerInputChange.getPosition());
            c14440d.e();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List<HistoricalChange> listE = pointerInputChange.e();
        int size = listE.size();
        int i10 = 0;
        while (i10 < size) {
            HistoricalChange historicalChange = listE.get(i10);
            long jP = f.p(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            c14440d.f(f.q(c14440d.getCurrentPointerPositionAccumulator(), jP));
            c14440d.a(historicalChange.getUptimeMillis(), c14440d.getCurrentPointerPositionAccumulator());
            i10++;
            previousPosition = position;
        }
        c14440d.f(f.q(c14440d.getCurrentPointerPositionAccumulator(), f.p(pointerInputChange.getPosition(), previousPosition)));
        c14440d.a(pointerInputChange.getUptimeMillis(), c14440d.getCurrentPointerPositionAccumulator());
    }

    private static final void e(C14440d c14440d, PointerInputChange pointerInputChange) {
        if (r.b(pointerInputChange)) {
            c14440d.e();
        }
        if (!r.d(pointerInputChange)) {
            List<HistoricalChange> listE = pointerInputChange.e();
            int size = listE.size();
            for (int i10 = 0; i10 < size; i10++) {
                HistoricalChange historicalChange = listE.get(i10);
                c14440d.a(historicalChange.getUptimeMillis(), historicalChange.getOriginalEventPosition());
            }
            c14440d.a(pointerInputChange.getUptimeMillis(), pointerInputChange.getOriginalEventPosition());
        }
        if (r.d(pointerInputChange) && pointerInputChange.getUptimeMillis() - c14440d.getLastMoveEventTimeStamp() > 40) {
            c14440d.e();
        }
        c14440d.g(pointerInputChange.getUptimeMillis());
    }
}
