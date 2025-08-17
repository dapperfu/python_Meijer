package W0;

import V0.C5346q0;
import V0.C5349s0;
import W0.C5390b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000  2\u00020\u0001:\u0002\u0011\u0016B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"LW0/l;", "", "LW0/c;", "source", "destination", "transformSource", "transformDestination", "LW0/r;", "renderIntent", "", "transform", "<init>", "(LW0/c;LW0/c;LW0/c;LW0/c;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(LW0/c;LW0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "LV0/q0;", "color", "a", "(J)J", "LW0/c;", "getSource", "()LW0/c;", "b", "getDestination", "c", "d", "e", "I", "getRenderIntent-uksYyKA", "()I", "f", "[F", "g", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class l {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5391c source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5391c destination;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5391c transformSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5391c transformDestination;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int renderIntent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LW0/l$a;", "", "<init>", "()V", "LW0/c;", "source", "destination", "LW0/r;", "intent", "", "b", "(LW0/c;LW0/c;I)[F", "LW0/l;", "c", "(LW0/c;)LW0/l;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: W0.l$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"W0/l$a$a", "LW0/l;", "LV0/q0;", "color", "a", "(J)J", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: W0.l$a$a, reason: collision with other inner class name */
        public static final class C0822a extends l {
            C0822a(AbstractC5391c abstractC5391c, int i10) {
                super(abstractC5391c, abstractC5391c, i10, null);
            }

            @Override // W0.l
            public long a(long color) {
                return color;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(AbstractC5391c source, AbstractC5391c destination, int intent) {
            if (!r.e(intent, r.INSTANCE.a())) {
                return null;
            }
            long model = source.getModel();
            C5390b.Companion companion = C5390b.INSTANCE;
            boolean zE = C5390b.e(model, companion.b());
            boolean zE2 = C5390b.e(destination.getModel(), companion.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                source = destination;
            }
            Intrinsics.h(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            F f10 = (F) source;
            float[] fArrC = zE ? f10.getWhitePoint().c() : o.f38304a.c();
            float[] fArrC2 = zE2 ? f10.getWhitePoint().c() : o.f38304a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final l c(AbstractC5391c source) {
            return new C0822a(source, r.INSTANCE.c());
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LW0/l$b;", "LW0/l;", "LW0/F;", "mSource", "mDestination", "LW0/r;", "intent", "<init>", "(LW0/F;LW0/F;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "source", "destination", "", "b", "(LW0/F;LW0/F;I)[F", "LV0/q0;", "color", "a", "(J)J", "h", "LW0/F;", "i", "j", "[F", "mTransform", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends l {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final F mSource;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final F mDestination;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final float[] mTransform;

        public /* synthetic */ b(F f10, F f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, i10);
        }

        private b(F f10, F f11, int i10) {
            super(f10, f11, f10, f11, i10, null, null);
            this.mSource = f10;
            this.mDestination = f11;
            this.mTransform = b(f10, f11, i10);
        }

        private final float[] b(F source, F destination, int intent) {
            if (C5392d.f(source.getWhitePoint(), destination.getWhitePoint())) {
                return C5392d.l(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrC = source.getWhitePoint().c();
            float[] fArrC2 = destination.getWhitePoint().c();
            WhitePoint whitePoint = source.getWhitePoint();
            o oVar = o.f38304a;
            if (!C5392d.f(whitePoint, oVar.b())) {
                transform = C5392d.l(C5392d.e(AbstractC5389a.INSTANCE.a().getTransform(), fArrC, oVar.f()), source.getTransform());
            }
            if (!C5392d.f(destination.getWhitePoint(), oVar.b())) {
                inverseTransform = C5392d.k(C5392d.l(C5392d.e(AbstractC5389a.INSTANCE.a().getTransform(), fArrC2, oVar.f()), destination.getTransform()));
            }
            if (r.e(intent, r.INSTANCE.a())) {
                transform = C5392d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, transform);
            }
            return C5392d.l(inverseTransform, transform);
        }

        @Override // W0.l
        public long a(long color) {
            float fX = C5346q0.x(color);
            float fW = C5346q0.w(color);
            float fU = C5346q0.u(color);
            float fT = C5346q0.t(color);
            float fA = (float) this.mSource.getEotfFunc().a(fX);
            float fA2 = (float) this.mSource.getEotfFunc().a(fW);
            float fA3 = (float) this.mSource.getEotfFunc().a(fU);
            float[] fArr = this.mTransform;
            return C5349s0.a((float) this.mDestination.getOetfFunc().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fT, this.mDestination);
        }
    }

    public /* synthetic */ l(AbstractC5391c abstractC5391c, AbstractC5391c abstractC5391c2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5391c, abstractC5391c2, i10);
    }

    public /* synthetic */ l(AbstractC5391c abstractC5391c, AbstractC5391c abstractC5391c2, AbstractC5391c abstractC5391c3, AbstractC5391c abstractC5391c4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5391c, abstractC5391c2, abstractC5391c3, abstractC5391c4, i10, fArr);
    }

    private l(AbstractC5391c abstractC5391c, AbstractC5391c abstractC5391c2, AbstractC5391c abstractC5391c3, AbstractC5391c abstractC5391c4, int i10, float[] fArr) {
        this.source = abstractC5391c;
        this.destination = abstractC5391c2;
        this.transformSource = abstractC5391c3;
        this.transformDestination = abstractC5391c4;
        this.renderIntent = i10;
        this.transform = fArr;
    }

    public long a(long color) {
        float fX = C5346q0.x(color);
        float fW = C5346q0.w(color);
        float fU = C5346q0.u(color);
        float fT = C5346q0.t(color);
        long j10 = this.transformSource.j(fX, fW, fU);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fM = this.transformSource.m(fX, fW, fU);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fM *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.transformDestination.n(f10, fIntBitsToFloat2, fM, fT, this.destination);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private l(AbstractC5391c abstractC5391c, AbstractC5391c abstractC5391c2, int i10) {
        long model = abstractC5391c.getModel();
        C5390b.Companion companion = C5390b.INSTANCE;
        this(abstractC5391c, abstractC5391c2, C5390b.e(model, companion.b()) ? C5392d.d(abstractC5391c, o.f38304a.b(), null, 2, null) : abstractC5391c, C5390b.e(abstractC5391c2.getModel(), companion.b()) ? C5392d.d(abstractC5391c2, o.f38304a.b(), null, 2, null) : abstractC5391c2, i10, INSTANCE.b(abstractC5391c, abstractC5391c2, i10), null);
    }
}
