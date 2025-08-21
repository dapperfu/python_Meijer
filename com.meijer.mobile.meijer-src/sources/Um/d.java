package Um;

import F1.t;
import Ki.I;
import Ki.LocalThemeScope;
import P0.e;
import Sm.w;
import Um.d;
import X0.Stroke;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.AnnotatedString;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.find.model.ChartData;
import com.meijer.mobile.meijer.activity.find.model.ChartDataType;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13576j;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14900d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.q1;
import kotlin.C6439a;
import kotlin.C6456m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import p1.C16338g;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LSm/w$b;", "viewState", "", "b", "(LKi/M;Landroidx/compose/ui/Modifier;LSm/w$b;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.compose.SavingsChartKt$SavingsChart$1$1", f = "SavingsChart.kt", l = {71, 82}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f37594a;

        /* renamed from: b, reason: collision with root package name */
        Object f37595b;

        /* renamed from: c, reason: collision with root package name */
        Object f37596c;

        /* renamed from: d, reason: collision with root package name */
        Object f37597d;

        /* renamed from: e, reason: collision with root package name */
        Object f37598e;

        /* renamed from: f, reason: collision with root package name */
        Object f37599f;

        /* renamed from: g, reason: collision with root package name */
        int f37600g;

        /* renamed from: h, reason: collision with root package name */
        int f37601h;

        /* renamed from: i, reason: collision with root package name */
        int f37602i;

        /* renamed from: j, reason: collision with root package name */
        int f37603j;

        /* renamed from: k, reason: collision with root package name */
        int f37604k;

        /* renamed from: l, reason: collision with root package name */
        float f37605l;

        /* renamed from: m, reason: collision with root package name */
        int f37606m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ w.ViewState f37607n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List<C6439a<Float, C6456m>> f37608o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w.ViewState viewState, List<C6439a<Float, C6456m>> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37607n = viewState;
            this.f37608o = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f37607n, this.f37608o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0108 -> B:25:0x0109). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Um.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w.ViewState f37609a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<C6439a<Float, C6456m>> f37610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f37611c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ChartDataType.values().length];
                try {
                    iArr[ChartDataType.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChartDataType.MPERKS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChartDataType.COUPONS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChartDataType.SPECIALS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ChartDataType.TEAM_MEMBER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(w.ViewState viewState, List<C6439a<Float, C6456m>> list, LocalThemeScope localThemeScope) {
            this.f37609a = viewState;
            this.f37610b = list;
            this.f37611c = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(w.ViewState viewState, List list, LocalThemeScope localThemeScope, X0.f Canvas) {
            Intrinsics.j(Canvas, "$this$Canvas");
            if (viewState.getTotal() == 0.0d) {
                X0.f.k1(Canvas, localThemeScope.getAdsColors().getAdsColorPlaceholder().getColor(), 0.0f, ((Number) ((C6439a) CollectionsKt.s0(list)).m()).floatValue(), false, 0L, 0L, 0.0f, new Stroke(200.0f, 0.0f, 0, 0, null, 30, null), null, 0, 880, null);
            } else {
                List<ChartData> listC = viewState.c();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
                Iterator it = listC.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.w();
                    }
                    Iterator it2 = it;
                    ArrayList arrayList2 = arrayList;
                    X0.f.k1(Canvas, g.a(localThemeScope, ((ChartData) next).getType()).getColor(), r3.getStartAngle(), ((Number) ((C6439a) list.get(i10)).m()).floatValue(), false, 0L, 0L, 0.0f, new Stroke(200.0f, 0.0f, 0, 0, null, 30, null), null, 0, 880, null);
                    arrayList2.add(Unit.f143329a);
                    arrayList = arrayList2;
                    i10 = i11;
                    it = it2;
                }
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            s.w(semantics);
            return Unit.f143329a;
        }

        public final void c(InterfaceC14900d BoxWithConstraints, Composer composer, int i10) {
            int i11;
            Composer composer2 = composer;
            Intrinsics.j(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer2.V(BoxWithConstraints) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(489944094, i11, -1, "com.meijer.mobile.meijer.activity.find.compose.SavingsChart.<anonymous> (SavingsChart.kt:94)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(J.v(companion, ((H1.h) ComparisonsKt.i(H1.h.l(BoxWithConstraints.e()), H1.h.l(BoxWithConstraints.c()))).getValue()), H1.h.p(50));
            e.Companion companion2 = P0.e.INSTANCE;
            Modifier modifierG = BoxWithConstraints.g(modifierI, companion2.e());
            composer2.startReplaceGroup(-1746271574);
            boolean zD = composer2.D(this.f37609a) | composer2.D(this.f37610b) | composer2.D(this.f37611c);
            final w.ViewState viewState = this.f37609a;
            final List<C6439a<Float, C6456m>> list = this.f37610b;
            final LocalThemeScope localThemeScope = this.f37611c;
            Object objB = composer2.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Um.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.b.d(viewState, list, localThemeScope, (X0.f) obj);
                    }
                };
                composer2.t(objB);
            }
            composer2.P();
            C13576j.a(modifierG, (Function1) objB, composer2, 0);
            Modifier modifierV = J.v(companion, H1.h.p(0));
            composer2.startReplaceGroup(1849434622);
            Object objB2 = composer2.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Um.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.b.e((u) obj);
                    }
                };
                composer2.t(objB2);
            }
            composer2.P();
            Modifier modifierD = C16819m.d(modifierV, false, (Function1) objB2, 1, null);
            List<C6439a<Float, C6456m>> list2 = this.f37610b;
            LocalThemeScope localThemeScope2 = this.f37611c;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), companion2.l(), composer2, 0);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierD);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            composer2.startReplaceGroup(438368093);
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                LocalThemeScope localThemeScope3 = localThemeScope2;
                si.j.h(localThemeScope3, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 383, null), String.valueOf(((Number) ((C6439a) it.next()).m()).floatValue()), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2 = composer;
                localThemeScope2 = localThemeScope3;
            }
            composer2.P();
            composer2.v();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            e.Companion companion5 = P0.e.INSTANCE;
            Modifier modifierG2 = BoxWithConstraints.g(companion4, companion5.e());
            e.b bVarG = companion5.g();
            C5800d.f fVarB = C5800d.f48779a.b();
            w.ViewState viewState2 = this.f37609a;
            LocalThemeScope localThemeScope4 = this.f37611c;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer2, 54);
            int iA2 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierG2);
            InterfaceC5953g.Companion companion6 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A2 = companion6.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = D1.a(composer2);
            D1.c(composerA2, measurePolicyA, companion6.e());
            D1.c(composerA2, interfaceC5884sR2, companion6.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion6.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion6.f());
            C14903g c14903g = C14903g.f139698a;
            int i12 = a.$EnumSwitchMapping$0[viewState2.getChartDataType().ordinal()];
            if (i12 == 1) {
                composer2.startReplaceGroup(-1913621350);
                q1.Label label = new q1.Label(null, localThemeScope4.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne(), null, 381, null);
                AnnotatedString annotatedStringB = g.b(viewState2.o(), localThemeScope4.getAdsTypography().getBody().getOne().getStyle().l());
                int i13 = LocalThemeScope.f17314g;
                int i14 = q1.Label.f142335j;
                si.j.g(localThemeScope4, label, annotatedStringB, null, null, composer, i13 | (i14 << 3), 12);
                C14890K.a(J.i(companion4, H1.h.p(4)), composer, 6);
                si.j.h(localThemeScope4, new q1.Label(null, localThemeScope4.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne(), null, 381, null), C16338g.d(Y.f100710Ud, new Object[]{Integer.valueOf(viewState2.g())}, composer, 0), null, composer, i13 | (i14 << 3), 4);
                si.j.h(localThemeScope4, new q1.Label(null, localThemeScope4.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope4.getAdsTypography().getDetail().getOne(), null, 381, null), C16338g.c(Y.f100729Vd, composer, 0), null, composer, i13 | (i14 << 3), 4);
                composer.P();
            } else {
                if (i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5) {
                    composer2.startReplaceGroup(1046647501);
                    composer2.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(-1912241106);
                I one = localThemeScope4.getAdsTypography().getBody().getOne();
                si.j.h(localThemeScope4, new q1.Label(J.B(companion4, 0.0f, H1.h.p(HttpResponseStatus.SUCCESS_OK), 1, null), localThemeScope4.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.a()), t.INSTANCE.b(), false, 3, one, null, 292, null), C16338g.c(viewState2.k(), composer2, 0), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            c(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final Sm.w.ViewState r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Um.d.b(Ki.M, androidx.compose.ui.Modifier, Sm.w$b, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, w.ViewState viewState, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, viewState, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
