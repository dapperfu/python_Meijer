package W0;

import V0.C5349s0;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"LW0/q;", "LW0/c;", "", "name", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "LV0/q0;", "n", "(FFFFLW0/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class q extends AbstractC5391c {

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f38317f;

    /* renamed from: g, reason: collision with root package name */
    private static final float[] f38318g;

    /* renamed from: h, reason: collision with root package name */
    private static final float[] f38319h;

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f38320i;

    @Override // W0.AbstractC5391c
    public long j(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 1.0f) {
            v02 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v22 < -0.5f) {
            v22 = -0.5f;
        }
        float f10 = v22 <= 0.5f ? v22 : 0.5f;
        float[] fArr = f38320i;
        float f11 = (fArr[0] * v02) + (fArr[3] * v12) + (fArr[6] * f10);
        float f12 = (fArr[1] * v02) + (fArr[4] * v12) + (fArr[7] * f10);
        float f13 = (fArr[2] * v02) + (fArr[5] * v12) + (fArr[8] * f10);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f38319h;
        return (Float.floatToRawIntBits(((fArr2[0] * f14) + (fArr2[3] * f15)) + (fArr2[6] * f16)) << 32) | (Float.floatToRawIntBits((fArr2[1] * f14) + (fArr2[4] * f15) + (fArr2[7] * f16)) & 4294967295L);
    }

    @Override // W0.AbstractC5391c
    public float[] l(float[] v10) {
        float f10 = v10[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        v10[0] = f10;
        float f11 = v10[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        v10[1] = f11;
        float f12 = v10[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        v10[2] = f13 <= 0.5f ? f13 : 0.5f;
        C5392d.n(f38320i, v10);
        float f14 = v10[0];
        v10[0] = f14 * f14 * f14;
        float f15 = v10[1];
        v10[1] = f15 * f15 * f15;
        float f16 = v10[2];
        v10[2] = f16 * f16 * f16;
        C5392d.n(f38319h, v10);
        return v10;
    }

    @Override // W0.AbstractC5391c
    public float m(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 1.0f) {
            v02 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v22 < -0.5f) {
            v22 = -0.5f;
        }
        float f10 = v22 <= 0.5f ? v22 : 0.5f;
        float[] fArr = f38320i;
        float f11 = (fArr[0] * v02) + (fArr[3] * v12) + (fArr[6] * f10);
        float f12 = (fArr[1] * v02) + (fArr[4] * v12) + (fArr[7] * f10);
        float f13 = (fArr[2] * v02) + (fArr[5] * v12) + (fArr[8] * f10);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float[] fArr2 = f38319h;
        return (fArr2[2] * f14) + (fArr2[5] * f15) + (fArr2[8] * f13 * f13 * f13);
    }

    static {
        float[] transform = AbstractC5389a.INSTANCE.a().getTransform();
        o oVar = o.f38304a;
        float[] fArrL = C5392d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C5392d.e(transform, oVar.b().c(), oVar.e().c()));
        f38317f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f38318g = fArr;
        f38319h = C5392d.k(fArrL);
        f38320i = C5392d.k(fArr);
    }

    public q(String str, int i10) {
        super(str, C5390b.INSTANCE.a(), i10, null);
    }

    @Override // W0.AbstractC5391c
    public float[] b(float[] v10) {
        C5392d.n(f38317f, v10);
        v10[0] = J1.b.a(v10[0]);
        v10[1] = J1.b.a(v10[1]);
        v10[2] = J1.b.a(v10[2]);
        C5392d.n(f38318g, v10);
        return v10;
    }

    @Override // W0.AbstractC5391c
    public float e(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // W0.AbstractC5391c
    public float f(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // W0.AbstractC5391c
    public long n(float x10, float y10, float z10, float a10, AbstractC5391c colorSpace) {
        float[] fArr = f38317f;
        float f10 = (fArr[0] * x10) + (fArr[3] * y10) + (fArr[6] * z10);
        float f11 = (fArr[1] * x10) + (fArr[4] * y10) + (fArr[7] * z10);
        float f12 = (fArr[2] * x10) + (fArr[5] * y10) + (fArr[8] * z10);
        float fA = J1.b.a(f10);
        float fA2 = J1.b.a(f11);
        float fA3 = J1.b.a(f12);
        float[] fArr2 = f38318g;
        return C5349s0.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), a10, colorSpace);
    }
}
