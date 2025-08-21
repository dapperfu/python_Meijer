package g0;

import i0.C14592e;
import java.util.List;
import kotlin.AbstractC16037C;
import kotlin.C16054o;
import kotlin.EnumC13937z;
import kotlin.InterfaceC16035A;
import kotlin.InterfaceC16045f;
import kotlin.InterfaceC16053n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo0/C;", "pagerState", "Lo0/A;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "Lg0/j;", "a", "(Lo0/C;Lo0/A;Lkotlin/jvm/functions/Function3;)Lg0/j;", "velocity", "", "e", "(Lo0/C;F)Z", "d", "(Lo0/C;)F", "LH1/t;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "c", "(Lo0/C;LH1/t;FFFF)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14289g {

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"g0/g$a", "Lg0/j;", "Lg0/k;", "snapPosition", "", "velocity", "Lkotlin/Pair;", "e", "(Lg0/k;F)Lkotlin/Pair;", "", "d", "(F)Z", "a", "(F)F", "decayOffset", "b", "(FF)F", "Lo0/n;", "c", "()Lo0/n;", "layoutInfo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: g0.g$a */
    public static final class a implements InterfaceC14292j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f133773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3<Float, Float, Float, Float> f133774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16035A f133775c;

        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC16037C abstractC16037C, Function3<? super Float, ? super Float, ? super Float, Float> function3, InterfaceC16035A interfaceC16035A) {
            this.f133773a = abstractC16037C;
            this.f133774b = function3;
            this.f133775c = interfaceC16035A;
        }

        private final Pair<Float, Float> e(InterfaceC14293k snapPosition, float velocity) {
            float f10;
            List<InterfaceC16045f> listH = c().h();
            AbstractC16037C abstractC16037C = this.f133773a;
            int size = listH.size();
            int i10 = 0;
            float f11 = Float.NEGATIVE_INFINITY;
            float f12 = Float.POSITIVE_INFINITY;
            while (true) {
                f10 = 0.0f;
                if (i10 >= size) {
                    break;
                }
                InterfaceC16045f interfaceC16045f = listH.get(i10);
                float fA = C14294l.a(C16054o.a(c()), c().d(), c().getAfterContentPadding(), c().getPageSize(), interfaceC16045f.getOffset(), interfaceC16045f.getIndex(), snapPosition, abstractC16037C.H());
                if (fA <= 0.0f && fA > f11) {
                    f11 = fA;
                }
                if (fA >= 0.0f && fA < f12) {
                    f12 = fA;
                }
                i10++;
            }
            if (f11 == Float.NEGATIVE_INFINITY) {
                f11 = f12;
            }
            if (f12 == Float.POSITIVE_INFINITY) {
                f12 = f11;
            }
            if (!this.f133773a.e()) {
                if (C14289g.e(this.f133773a, velocity)) {
                    f11 = 0.0f;
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                }
            }
            if (this.f133773a.d()) {
                f10 = f11;
            } else if (!C14289g.e(this.f133773a, velocity)) {
                f12 = 0.0f;
            }
            return TuplesKt.a(Float.valueOf(f10), Float.valueOf(f12));
        }

        @Override // g0.InterfaceC14292j
        public float a(float velocity) {
            Pair<Float, Float> pairE = e(this.f133773a.C().getSnapPosition(), velocity);
            float fFloatValue = pairE.a().floatValue();
            float fFloatValue2 = pairE.b().floatValue();
            float fFloatValue3 = this.f133774b.invoke(Float.valueOf(velocity), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
            if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                C14592e.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
            }
            if (d(fFloatValue3)) {
                return fFloatValue3;
            }
            return 0.0f;
        }

        @Override // g0.InterfaceC14292j
        public float b(float velocity, float decayOffset) {
            int I10 = this.f133773a.I() + this.f133773a.K();
            if (I10 == 0) {
                return 0.0f;
            }
            int firstVisiblePage = velocity < 0.0f ? this.f133773a.getFirstVisiblePage() + 1 : this.f133773a.getFirstVisiblePage();
            int iF = RangesKt.f(Math.abs((RangesKt.o(this.f133775c.a(firstVisiblePage, RangesKt.o(((int) (decayOffset / I10)) + firstVisiblePage, 0, this.f133773a.H()), velocity, this.f133773a.I(), this.f133773a.K()), 0, this.f133773a.H()) - firstVisiblePage) * I10) - I10, 0);
            return iF == 0 ? iF : iF * Math.signum(velocity);
        }

        public final InterfaceC16053n c() {
            return this.f133773a.C();
        }

        public final boolean d(float f10) {
            return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    public static final InterfaceC14292j a(AbstractC16037C abstractC16037C, InterfaceC16035A interfaceC16035A, Function3<? super Float, ? super Float, ? super Float, Float> function3) {
        return new a(abstractC16037C, function3, interfaceC16035A);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float c(kotlin.AbstractC16037C r5, H1.t r6, float r7, float r8, float r9, float r10) {
        /*
            boolean r0 = e(r5, r8)
            o0.n r1 = r5.C()
            f0.z r1 = r1.getOrientation()
            f0.z r2 = kotlin.EnumC13937z.f131419a
            if (r1 != r2) goto L11
            goto L1b
        L11:
            H1.t r1 = H1.t.f13338a
            if (r6 != r1) goto L16
            goto L1b
        L16:
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            o0.n r6 = r5.C()
            int r6 = r6.getPageSize()
            r1 = 0
            if (r6 != 0) goto L28
            r2 = r1
            goto L2e
        L28:
            float r2 = d(r5)
            float r6 = (float) r6
            float r2 = r2 / r6
        L2e:
            int r6 = (int) r2
            float r6 = (float) r6
            float r6 = r2 - r6
            H1.d r3 = r5.getDensity()
            int r8 = g0.C14288f.a(r3, r8)
            g0.d$a r3 = g0.C14286d.INSTANCE
            int r4 = r3.a()
            boolean r4 = g0.C14286d.e(r8, r4)
            if (r4 == 0) goto L71
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L51
            if (r0 == 0) goto L86
            goto L7b
        L51:
            float r6 = java.lang.Math.abs(r2)
            float r5 = r5.N()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L64
            if (r0 == 0) goto L7b
            goto L86
        L64:
            float r5 = java.lang.Math.abs(r9)
            float r6 = java.lang.Math.abs(r10)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L7b
            goto L86
        L71:
            int r5 = r3.b()
            boolean r5 = g0.C14286d.e(r8, r5)
            if (r5 == 0) goto L7c
        L7b:
            return r10
        L7c:
            int r5 = r3.c()
            boolean r5 = g0.C14286d.e(r8, r5)
            if (r5 == 0) goto L87
        L86:
            return r9
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C14289g.c(o0.C, H1.t, float, float, float, float):float");
    }

    private static final float d(AbstractC16037C abstractC16037C) {
        if (abstractC16037C.C().getOrientation() == EnumC13937z.f131420b) {
            return Float.intBitsToFloat((int) (abstractC16037C.T() >> 32));
        }
        return Float.intBitsToFloat((int) (abstractC16037C.T() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(AbstractC16037C abstractC16037C, float f10) {
        float fD;
        boolean z10;
        boolean reverseLayout = abstractC16037C.C().getReverseLayout();
        if (abstractC16037C.V()) {
            fD = -f10;
        } else {
            fD = d(abstractC16037C);
        }
        if (fD > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 || !reverseLayout) && (z10 || reverseLayout)) {
            return false;
        }
        return true;
    }
}
