package W0;

import V0.C5492s0;
import W0.F;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 a2\u00020\u0001:\u0001.B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bG\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010M\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\b=\u0010LR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170N8\u0006¢\u0006\f\n\u0004\b)\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bR\u0010LR\u001a\u0010V\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\bU\u0010LR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170N8\u0006¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\b-\u0010QR\u001a\u0010Z\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bY\u0010LR\u001a\u0010]\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\bC\u0010^\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"LW0/F;", "LW0/c;", "", "name", "", "primaries", "LW0/I;", "whitePoint", "transform", "LW0/n;", "oetf", "eotf", "", "min", "max", "LW0/G;", "transferParameters", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;[FLW0/I;[FLW0/n;LW0/n;FFLW0/G;I)V", "function", "(Ljava/lang/String;[FLW0/I;LW0/G;I)V", "", "gamma", "(Ljava/lang/String;[FLW0/I;DFFI)V", "colorSpace", "(LW0/F;[FLW0/I;)V", "component", "f", "(I)F", "e", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "LV0/q0;", "n", "(FFFFLW0/c;)J", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "LW0/I;", "J", "()LW0/I;", "F", "g", "h", "LW0/G;", "H", "()LW0/G;", "i", "[F", "G", "()[F", "I", "k", "C", "inverseTransform", "LW0/n;", "()LW0/n;", "oetfOrig", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "D", "()Lkotlin/jvm/functions/Function1;", "E", "oetfFunc", "o", "B", "eotfOrig", "p", "q", "A", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "s", "isSrgb", "t", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class F extends AbstractC5526c {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    private static final n f40511u = new n() { // from class: W0.u
        @Override // W0.n
        public final double a(double d10) {
            return F.t(d10);
        }
    };

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WhitePoint whitePoint;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float max;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TransferParameters transferParameters;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float[] primaries;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float[] inverseTransform;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final n oetfOrig;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Function1<Double, Double> oetf;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final n oetfFunc;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final n eotfOrig;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Function1<Double, Double> eotf;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final n eotfFunc;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isWideGamut;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isSrgb;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"LW0/F$a;", "", "<init>", "()V", "", "primaries", "LW0/I;", "whitePoint", "LW0/n;", "OETF", "EOTF", "", "min", "max", "", PreferencesHelper.PREF_ID, "", "C", "([FLW0/I;LW0/n;LW0/n;FFI)Z", "", "point", "a", "b", "p", "(DLW0/n;LW0/n;)Z", "D", "([FFF)Z", "o", "([F)F", "p1", "p2", "r", "([F[F)Z", "E", "([F)[F", "q", "([FLW0/I;)[F", "LW0/G;", "function", "x", "(LW0/G;)LW0/n;", "s", "DoubleIdentity", "LW0/n;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: W0.F$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean C(float[] primaries, WhitePoint whitePoint, n OETF, n EOTF, float min, float max, int id2) {
            if (id2 == 0) {
                return true;
            }
            k kVar = k.f40555a;
            if (!C5527d.g(primaries, kVar.H()) || !C5527d.f(whitePoint, o.f40592a.e()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            F fG = kVar.G();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!p(d10, OETF, fG.getOetfOrig()) || !p(d10, EOTF, fG.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] E(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                ArraysKt.q(primaries, fArr, 0, 0, 6, 6, null);
                return fArr;
            }
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = f10 + f11 + primaries[2];
            fArr[0] = f10 / f12;
            fArr[1] = f11 / f12;
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = f13 + f14 + primaries[5];
            fArr[2] = f13 / f15;
            fArr[3] = f14 / f15;
            float f16 = primaries[6];
            float f17 = primaries[7];
            float f18 = f16 + f17 + primaries[8];
            fArr[4] = f16 / f18;
            fArr[5] = f17 / f18;
            return fArr;
        }

        private final float o(float[] primaries) {
            if (primaries.length < 6) {
                return 0.0f;
            }
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] q(float[] primaries, WhitePoint whitePoint) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float x10 = whitePoint.getX();
            float y10 = whitePoint.getY();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - x10) / y10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (x10 / y10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean r(float[] p12, float[] p22) {
            float f10 = p12[0];
            float f11 = p22[0];
            float f12 = p12[1];
            float f13 = p22[1];
            float f14 = p12[2];
            float f15 = p22[2];
            float f16 = p12[3];
            float f17 = p22[3];
            float f18 = p12[4];
            float f19 = p22[4];
            float f20 = p12[5];
            float f21 = p22[5];
            float[] fArr = {f10 - f11, f12 - f13, f14 - f15, f16 - f17, f18 - f19, f20 - f21};
            float f22 = fArr[0];
            float f23 = fArr[1];
            if (((f13 - f21) * f22) - ((f11 - f19) * f23) >= 0.0f && ((f11 - f15) * f23) - ((f13 - f17) * f22) >= 0.0f) {
                float f24 = fArr[2];
                float f25 = fArr[3];
                if (((f17 - f13) * f24) - ((f15 - f11) * f25) >= 0.0f && ((f15 - f19) * f25) - ((f17 - f21) * f24) >= 0.0f) {
                    float f26 = fArr[4];
                    float f27 = fArr[5];
                    if (((f21 - f17) * f26) - ((f19 - f15) * f27) >= 0.0f && ((f19 - f11) * f27) - ((f21 - f13) * f26) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double t(TransferParameters transferParameters, double d10) {
            return k.f40555a.J(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double u(TransferParameters transferParameters, double d10) {
            return k.f40555a.L(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double y(TransferParameters transferParameters, double d10) {
            return k.f40555a.K(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double z(TransferParameters transferParameters, double d10) {
            return k.f40555a.M(transferParameters, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double A(TransferParameters transferParameters, double d10) {
            return C5527d.o(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double B(TransferParameters transferParameters, double d10) {
            return C5527d.p(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean D(float[] primaries, float min, float max) {
            float fO = o(primaries);
            k kVar = k.f40555a;
            if (fO / o(kVar.C()) <= 0.9f || !r(primaries, kVar.H())) {
                if (min < 0.0f && max > 1.0f) {
                    return true;
                }
                return false;
            }
            return true;
        }

        private final boolean p(double point, n a10, n b10) {
            if (Math.abs(a10.a(point) - b10.a(point)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n s(final TransferParameters function) {
            if (function.h()) {
                return new n() { // from class: W0.x
                    @Override // W0.n
                    public final double a(double d10) {
                        return F.Companion.t(function, d10);
                    }
                };
            }
            if (function.i()) {
                return new n() { // from class: W0.y
                    @Override // W0.n
                    public final double a(double d10) {
                        return F.Companion.u(function, d10);
                    }
                };
            }
            if (function.getE() == 0.0d && function.getF() == 0.0d) {
                return new n() { // from class: W0.z
                    @Override // W0.n
                    public final double a(double d10) {
                        return F.Companion.v(function, d10);
                    }
                };
            }
            return new n() { // from class: W0.A
                @Override // W0.n
                public final double a(double d10) {
                    return F.Companion.w(function, d10);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double v(TransferParameters transferParameters, double d10) {
            return C5527d.q(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double w(TransferParameters transferParameters, double d10) {
            return C5527d.r(d10, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n x(final TransferParameters function) {
            if (function.h()) {
                return new n() { // from class: W0.B
                    @Override // W0.n
                    public final double a(double d10) {
                        return F.Companion.y(function, d10);
                    }
                };
            }
            if (function.i()) {
                return new n() { // from class: W0.C
                    @Override // W0.n
                    public final double a(double d10) {
                        return F.Companion.z(function, d10);
                    }
                };
            }
            if (function.getE() == 0.0d && function.getF() == 0.0d) {
                return new n() { // from class: W0.D
                    @Override // W0.n
                    public final double a(double d10) {
                        return F.Companion.A(function, d10);
                    }
                };
            }
            return new n() { // from class: W0.E
                @Override // W0.n
                public final double a(double d10) {
                    return F.Companion.B(function, d10);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<Double, Double> {
        b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(F.this.getEotfOrig().a(RangesKt.m(d10, F.this.min, F.this.max)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<Double, Double> {
        c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(RangesKt.m(F.this.getOetfOrig().a(d10), F.this.min, F.this.max));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    public F(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, n nVar, n nVar2, float f10, float f11, TransferParameters transferParameters, int i10) {
        super(str, C5525b.INSTANCE.b(), i10, null);
        this.whitePoint = whitePoint;
        this.min = f10;
        this.max = f11;
        this.transferParameters = transferParameters;
        this.oetfOrig = nVar;
        this.oetf = new c();
        this.oetfFunc = new n() { // from class: W0.s
            @Override // W0.n
            public final double a(double d10) {
                return F.K(this.f40614a, d10);
            }
        };
        this.eotfOrig = nVar2;
        this.eotf = new b();
        this.eotfFunc = new n() { // from class: W0.t
            @Override // W0.n
            public final double a(double d10) {
                return F.y(this.f40615a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrE = companion.E(fArr);
        this.primaries = fArrE;
        if (fArr2 == null) {
            this.transform = companion.q(fArrE, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = C5527d.k(this.transform);
        this.isWideGamut = companion.D(fArrE, f10, f11);
        this.isSrgb = companion.C(fArrE, whitePoint, nVar, nVar2, f10, f11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d10) {
        return d10;
    }

    @Override // W0.AbstractC5526c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || F.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        F f10 = (F) other;
        if (Float.compare(f10.min, this.min) != 0 || Float.compare(f10.max, this.max) != 0 || !Intrinsics.e(this.whitePoint, f10.whitePoint) || !Arrays.equals(this.primaries, f10.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.e(transferParameters, f10.transferParameters);
        }
        if (f10.transferParameters == null) {
            return true;
        }
        if (Intrinsics.e(this.oetfOrig, f10.oetfOrig)) {
            return Intrinsics.e(this.eotfOrig, f10.eotfOrig);
        }
        return false;
    }

    @Override // W0.AbstractC5526c
    public float[] l(float[] v10) {
        if (v10.length < 3) {
            return v10;
        }
        v10[0] = (float) this.eotfFunc.a(v10[0]);
        v10[1] = (float) this.eotfFunc.a(v10[1]);
        v10[2] = (float) this.eotfFunc.a(v10[2]);
        return C5527d.n(this.transform, v10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double K(F f10, double d10) {
        return RangesKt.m(f10.oetfOrig.a(d10), f10.min, f10.max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(F f10, double d10) {
        return f10.eotfOrig.a(RangesKt.m(d10, f10.min, f10.max));
    }

    /* renamed from: A, reason: from getter */
    public final n getEotfFunc() {
        return this.eotfFunc;
    }

    /* renamed from: B, reason: from getter */
    public final n getEotfOrig() {
        return this.eotfOrig;
    }

    /* renamed from: C, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    public final Function1<Double, Double> D() {
        return this.oetf;
    }

    /* renamed from: E, reason: from getter */
    public final n getOetfFunc() {
        return this.oetfFunc;
    }

    /* renamed from: F, reason: from getter */
    public final n getOetfOrig() {
        return this.oetfOrig;
    }

    /* renamed from: G, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    /* renamed from: H, reason: from getter */
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    /* renamed from: I, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* renamed from: J, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // W0.AbstractC5526c
    public float[] b(float[] v10) {
        C5527d.n(this.inverseTransform, v10);
        if (v10.length < 3) {
            return v10;
        }
        v10[0] = (float) this.oetfFunc.a(v10[0]);
        v10[1] = (float) this.oetfFunc.a(v10[1]);
        v10[2] = (float) this.oetfFunc.a(v10[2]);
        return v10;
    }

    @Override // W0.AbstractC5526c
    public float e(int component) {
        return this.max;
    }

    @Override // W0.AbstractC5526c
    public float f(int component) {
        return this.min;
    }

    @Override // W0.AbstractC5526c
    /* renamed from: i, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // W0.AbstractC5526c
    public long j(float v02, float v12, float v22) {
        float fA = (float) this.eotfFunc.a(v02);
        float fA2 = (float) this.eotfFunc.a(v12);
        float fA3 = (float) this.eotfFunc.a(v22);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f10 = (fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3);
        float f11 = (fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3);
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    @Override // W0.AbstractC5526c
    public float m(float v02, float v12, float v22) {
        float fA = (float) this.eotfFunc.a(v02);
        float fA2 = (float) this.eotfFunc.a(v12);
        float fA3 = (float) this.eotfFunc.a(v22);
        float[] fArr = this.transform;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // W0.AbstractC5526c
    public long n(float x10, float y10, float z10, float a10, AbstractC5526c colorSpace) {
        float[] fArr = this.inverseTransform;
        return C5492s0.a((float) this.oetfFunc.a((fArr[0] * x10) + (fArr[3] * y10) + (fArr[6] * z10)), (float) this.oetfFunc.a((fArr[1] * x10) + (fArr[4] * y10) + (fArr[7] * z10)), (float) this.oetfFunc.a((fArr[2] * x10) + (fArr[5] * y10) + (fArr[8] * z10)), a10, colorSpace);
    }

    public final Function1<Double, Double> z() {
        return this.eotf;
    }

    @Override // W0.AbstractC5526c
    public int hashCode() {
        int iFloatToIntBits;
        int iFloatToIntBits2;
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f10 = this.min;
        int iHashCode2 = 0;
        if (f10 == 0.0f) {
            iFloatToIntBits = 0;
        } else {
            iFloatToIntBits = Float.floatToIntBits(f10);
        }
        int i10 = (iHashCode + iFloatToIntBits) * 31;
        float f11 = this.max;
        if (f11 == 0.0f) {
            iFloatToIntBits2 = 0;
        } else {
            iFloatToIntBits2 = Float.floatToIntBits(f11);
        }
        int i11 = (i10 + iFloatToIntBits2) * 31;
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            iHashCode2 = transferParameters.hashCode();
        }
        int i12 = i11 + iHashCode2;
        if (this.transferParameters == null) {
            return (((i12 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i10) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.x(transferParameters), companion.s(transferParameters), 0.0f, 1.0f, transferParameters, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(String str, float[] fArr, WhitePoint whitePoint, final double d10, float f10, float f11, int i10) {
        n nVar;
        n nVar2;
        if (d10 == 1.0d) {
            nVar = f40511u;
        } else {
            nVar = new n() { // from class: W0.v
                @Override // W0.n
                public final double a(double d11) {
                    return F.u(d10, d11);
                }
            };
        }
        n nVar3 = nVar;
        if (d10 == 1.0d) {
            nVar2 = f40511u;
        } else {
            nVar2 = new n() { // from class: W0.w
                @Override // W0.n
                public final double a(double d11) {
                    return F.v(d10, d11);
                }
            };
        }
        this(str, fArr, whitePoint, null, nVar3, nVar2, f10, f11, new TransferParameters(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    public F(F f10, float[] fArr, WhitePoint whitePoint) {
        this(f10.getName(), f10.primaries, whitePoint, fArr, f10.oetfOrig, f10.eotfOrig, f10.min, f10.max, f10.transferParameters, -1);
    }
}
