package Fi;

import Fi.k;
import Ki.C;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.T;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13572f;
import d0.C13575i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ji.C15042c;
import ki.q1;
import kotlin.C17970S0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.N;
import oi.P0;
import p1.C16338g;
import qi.C16671b;
import r0.C16806i;
import r1.C16819m;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aE\u0010#\u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$\u001a+\u0010%\u001a\u00020\u0010*\u00020\u00002\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b%\u0010&\u001a3\u0010-\u001a\u00020\u0010*\u00020'2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020(H\u0002¢\u0006\u0004\b-\u0010.\u001aI\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020(2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u00020\u00192\b\b\u0002\u00101\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b2\u00103\u001a#\u00104\u001a\u00020\u0010*\u00020'2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020(H\u0002¢\u0006\u0004\b4\u00105\"\u0014\u00107\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00109\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104¨\u0006:"}, d2 = {"LKi/M;", "", "", "labels", "", "selectedIndex", "Landroidx/compose/ui/Modifier;", "modifier", "", "isNumbered", "isError", "isWarning", "allStepsComplete", "warningContentDescription", "errorContentDescription", "Lkotlin/Function0;", "", "onBackClicked", "k", "(LKi/M;Ljava/util/List;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZZZZIILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "LFi/w;", "indicatorType", "index", "y", "(LKi/M;LFi/w;ILandroidx/compose/runtime/Composer;I)V", "LH1/h;", "size", "content", "r", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LV0/q0;", "backgroundColor", "textColor", "LFi/n;", "borderSpec", "s", "(LKi/M;Landroidx/compose/ui/Modifier;FIJJLFi/n;Landroidx/compose/runtime/Composer;II)V", "u", "(LKi/M;JIFLandroidx/compose/runtime/Composer;I)V", "LX0/f;", "", "startFraction", "endFraction", "color", "strokeWidth", "E", "(LX0/f;FFJF)V", "progress", "linearIndicatorWidth", "linearIndicatorHeight", "o", "(FLandroidx/compose/ui/Modifier;JFFJLandroidx/compose/runtime/Composer;II)V", "F", "(LX0/f;JF)V", "a", "LinearIndicatorHeight", "b", "LinearIndicatorWidth", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final float f10565a = C17970S0.f168497a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final float f10566b = H1.h.p(240);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10567a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f10568b;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f10567a = localThemeScope;
            this.f10568b = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2029313417, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.AcresProgressTracker.<anonymous>.<anonymous>.<anonymous> (AcresProgressTracker.kt:151)");
            }
            P0.i(this.f10567a, N.f153988a, this.f10568b, C.f.d.f17051e, C16338g.c(C15042c.f140909f, composer, 0), null, false, false, 0L, composer, 3120, 240);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10569a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10570b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10571c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f10572d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10573e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10574f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f10575g;

        b(LocalThemeScope localThemeScope, boolean z10, boolean z11, Integer num, int i10, boolean z12, boolean z13) {
            this.f10569a = localThemeScope;
            this.f10570b = z10;
            this.f10571c = z11;
            this.f10572d = num;
            this.f10573e = i10;
            this.f10574f = z12;
            this.f10575g = z13;
        }

        public final void a(Composer composer, int i10) {
            w wVar;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-959125168, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.AcresProgressTracker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcresProgressTracker.kt:178)");
            }
            LocalThemeScope localThemeScope = this.f10569a;
            if (this.f10570b) {
                if (this.f10571c) {
                    wVar = p.f10608a;
                } else {
                    Integer num = this.f10572d;
                    if (num == null) {
                        wVar = v.f10614a;
                    } else {
                        int i11 = this.f10573e;
                        if (num != null && num.intValue() == i11 && this.f10574f) {
                            wVar = r.f10610a;
                        } else {
                            Integer num2 = this.f10572d;
                            int i12 = this.f10573e;
                            if (num2 != null && num2.intValue() == i12 && this.f10575g) {
                                wVar = t.f10612a;
                            } else {
                                Integer num3 = this.f10572d;
                                wVar = (num3 != null && num3.intValue() == this.f10573e) ? s.f10611a : (this.f10572d.intValue() >= this.f10573e && this.f10572d.intValue() > this.f10573e) ? p.f10608a : v.f10614a;
                            }
                        }
                    }
                }
            } else if (this.f10571c) {
                wVar = o.f10607a;
            } else {
                Integer num4 = this.f10572d;
                if (num4 == null) {
                    wVar = u.f10613a;
                } else {
                    int i13 = this.f10573e;
                    if (num4 != null && num4.intValue() == i13 && this.f10574f) {
                        wVar = r.f10610a;
                    } else {
                        Integer num5 = this.f10572d;
                        int i14 = this.f10573e;
                        if (num5 != null && num5.intValue() == i14 && this.f10575g) {
                            wVar = t.f10612a;
                        } else {
                            Integer num6 = this.f10572d;
                            wVar = (num6 != null && num6.intValue() == this.f10573e) ? q.f10609a : (this.f10572d.intValue() >= this.f10573e && this.f10572d.intValue() > this.f10573e) ? o.f10607a : u.f10613a;
                        }
                    }
                }
            }
            k.y(localThemeScope, wVar, this.f10573e, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f10578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10579d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10580e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10581f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10582g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f10583h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<String> f10584i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f10585j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ r0 f10586k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f10587l;

        c(int i10, int i11, Integer num, int i12, boolean z10, boolean z11, LocalThemeScope localThemeScope, boolean z12, List<String> list, String str, r0 r0Var, int i13) {
            this.f10576a = i10;
            this.f10577b = i11;
            this.f10578c = num;
            this.f10579d = i12;
            this.f10580e = z10;
            this.f10581f = z11;
            this.f10582g = localThemeScope;
            this.f10583h = z12;
            this.f10584i = list;
            this.f10585j = str;
            this.f10586k = r0Var;
            this.f10587l = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, int i10, List list, String str2, Integer num, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str + ". Step " + (i10 + 1) + " of " + list.size() + ". " + str2);
            r1.s.t0(semantics, num != null && num.intValue() == i10);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            final String str;
            T adsColorText01;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-22157753, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.AcresProgressTracker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcresProgressTracker.kt:214)");
            }
            String strC = C16338g.c(this.f10576a, composer, 0);
            String strC2 = C16338g.c(this.f10577b, composer, 0);
            Integer num = this.f10578c;
            int i11 = this.f10579d;
            if (num != null && num.intValue() == i11 && this.f10580e) {
                str = strC2;
            } else {
                Integer num2 = this.f10578c;
                int i12 = this.f10579d;
                if (num2 == null || num2.intValue() != i12 || !this.f10581f) {
                    strC = "";
                }
                str = strC;
            }
            LocalThemeScope localThemeScope = this.f10582g;
            I two = localThemeScope.getAdsTypography().getBodyCompact().getTwo();
            if (this.f10583h) {
                adsColorText01 = this.f10582g.getAdsColors().getAdsColorText01();
            } else {
                Integer num3 = this.f10578c;
                adsColorText01 = (num3 != null && this.f10579d <= num3.intValue()) ? this.f10582g.getAdsColors().getAdsColorText01() : this.f10582g.getAdsColors().getAdsColorsDisabled();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(str) | composer.d(this.f10579d) | composer.D(this.f10584i) | composer.V(this.f10585j) | composer.V(this.f10578c);
            final int i13 = this.f10579d;
            final List<String> list = this.f10584i;
            final String str2 = this.f10585j;
            final Integer num4 = this.f10578c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                Object obj = new Function1() { // from class: Fi.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return k.c.c(str, i13, list, str2, num4, (r1.u) obj2);
                    }
                };
                composer.t(obj);
                objB = obj;
            }
            composer.P();
            si.j.h(localThemeScope, new q1.Label(J.s(C16819m.d(companion, false, (Function1) objB, 1, null), this.f10586k.K(this.f10587l)), adsColorText01, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, two, null, 372, null), this.f10585j, null, composer, 0, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1<Float> f10588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r0 f10590c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10591d;

        d(z1<Float> z1Var, LocalThemeScope localThemeScope, r0 r0Var, int i10) {
            this.f10588a = z1Var;
            this.f10589b = localThemeScope;
            this.f10590c = r0Var;
            this.f10591d = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.A(semantics);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(3101171, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.AcresProgressTracker.<anonymous>.<anonymous>.<anonymous> (AcresProgressTracker.kt:264)");
            }
            float fFloatValue = this.f10588a.getValue().floatValue();
            long color = this.f10589b.getAdsColors().getAdsColorsDisabled().getColor();
            long color2 = this.f10589b.getAdsColors().getAdsColorBrandPrimary().getColor();
            float fK = this.f10590c.K(this.f10591d);
            float f10 = k.f10565a;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Fi.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.d.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            k.o(fFloatValue, C16819m.d(companion, false, (Function1) objB, 1, null), color2, fK, f10, color, composer, 24576, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f10592a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super Composer, ? super Integer, Unit> function2) {
            this.f10592a = function2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1118607227, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.ProgressCircle.<anonymous> (AcresProgressTracker.kt:436)");
            }
            Function2<Composer, Integer, Unit> function2 = this.f10592a;
            if (function2 != null) {
                function2.invoke(composer, 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BorderSpec f10594b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10595c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10596d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10597e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f10598f;

        f(long j10, BorderSpec borderSpec, LocalThemeScope localThemeScope, long j11, int i10, float f10) {
            this.f10593a = j10;
            this.f10594b = borderSpec;
            this.f10595c = localThemeScope;
            this.f10596d = j11;
            this.f10597e = i10;
            this.f10598f = f10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1224657896, i10, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.ProgressCircleNumbered.<anonymous> (AcresProgressTracker.kt:453)");
            }
            Modifier modifierE = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(J.o(modifierE, H1.h.p(20)), C16806i.f()), this.f10593a, null, 2, null);
            if (this.f10594b.getHasBorder()) {
                modifierE = C13572f.e(modifierE, C13575i.a(this.f10594b.getBorderWidth(), this.f10594b.getBorderColor()), C16806i.f());
            }
            Modifier modifierThen = modifierD.then(modifierE);
            LocalThemeScope localThemeScope = this.f10595c;
            long j10 = this.f10596d;
            int i11 = this.f10597e;
            float f10 = this.f10598f;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierThen);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE2, companion.f());
            C5806j c5806j = C5806j.f48836a;
            k.u(localThemeScope, j10, i11, f10, composer, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    private static final void F(X0.f fVar, long j10, float f10) {
        E(fVar, 0.0f, 1.0f, j10, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r33, final java.util.List<java.lang.String> r34, final java.lang.Integer r35, androidx.compose.ui.Modifier r36, boolean r37, boolean r38, boolean r39, boolean r40, int r41, int r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fi.k.k(Ki.M, java.util.List, java.lang.Integer, androidx.compose.ui.Modifier, boolean, boolean, boolean, boolean, int, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.List] */
    public static final androidx.compose.ui.layout.J l(final Function0 function0, final int i10, List list, final List list2, final List list3, LocalThemeScope localThemeScope, boolean z10, boolean z11, Integer num, boolean z12, boolean z13, int i11, int i12, z1 z1Var, r0 r0Var, H1.b bVar) {
        int iI1;
        int i13;
        r0 SubcomposeLayout = r0Var;
        Intrinsics.j(SubcomposeLayout, "$this$SubcomposeLayout");
        final int iL = H1.b.l(bVar.getValue());
        final Ref.IntRef intRef = new Ref.IntRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = CollectionsKt.m();
        final Ref.IntRef intRef2 = new Ref.IntRef();
        float f10 = 8;
        final int iI12 = (int) SubcomposeLayout.I1(H1.h.p(f10));
        boolean z14 = true;
        if (function0 != null) {
            List<androidx.compose.ui.layout.I> listZ = SubcomposeLayout.Z("custom_content", ComposableLambdaKt.composableLambdaInstance(-2029313417, true, new a(localThemeScope, function0)));
            ?? arrayList = new ArrayList(CollectionsKt.x(listZ, 10));
            Iterator<T> it = listZ.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.compose.ui.layout.I) it.next()).k0(bVar.getValue()));
            }
            objectRef.f143742a = arrayList;
            intRef2.f143740a = !((Collection) arrayList).isEmpty() ? ((f0) CollectionsKt.s0((List) objectRef.f143742a)).M0() : 0;
            iI1 = (int) SubcomposeLayout.I1(H1.h.p(f10));
            intRef.f143740a = (int) SubcomposeLayout.I1(H1.h.p(6));
        } else {
            iI1 = 0;
        }
        int i14 = iI1 * 2;
        int i15 = iI12 * 2;
        int i16 = ((((iL - (intRef2.f143740a * 2)) - i14) - i15) - ((i10 - 1) * iI12)) / i10;
        List list4 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list4, 10));
        int i17 = 0;
        int i18 = 0;
        for (Object obj : list4) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                CollectionsKt.w();
            }
            String str = (String) obj;
            ArrayList arrayList3 = arrayList2;
            int i20 = i17;
            List<androidx.compose.ui.layout.I> listZ2 = SubcomposeLayout.Z("STEPS " + i17 + ", " + str, ComposableLambdaKt.composableLambdaInstance(-959125168, z14, new b(localThemeScope, z10, z11, num, i20, z12, z13)));
            ArrayList arrayList4 = new ArrayList(CollectionsKt.x(listZ2, 10));
            Iterator<T> it2 = listZ2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((androidx.compose.ui.layout.I) it2.next()).k0(bVar.getValue()));
            }
            list3.addAll(arrayList4);
            String str2 = "LABEL " + i20 + ", " + str;
            r0 r0Var2 = SubcomposeLayout;
            c cVar = new c(i11, i12, num, i20, z12, z13, localThemeScope, z11, list, str, r0Var2, i16);
            int i21 = i16;
            List<androidx.compose.ui.layout.I> listZ3 = r0Var2.Z(str2, ComposableLambdaKt.composableLambdaInstance(-22157753, z14, cVar));
            ArrayList arrayList5 = new ArrayList(CollectionsKt.x(listZ3, 10));
            int iMax = i18;
            for (Iterator it3 = listZ3.iterator(); it3.hasNext(); it3 = it3) {
                androidx.compose.ui.layout.I i22 = (androidx.compose.ui.layout.I) it3.next();
                iMax = Math.max(iMax, i22.W(i21));
                arrayList5.add(i22.k0(bVar.getValue()));
                objectRef = objectRef;
            }
            arrayList3.add(Boolean.valueOf(list2.addAll(arrayList5)));
            arrayList2 = arrayList3;
            objectRef = objectRef;
            i16 = i21;
            i18 = iMax;
            SubcomposeLayout = r0Var2;
            i17 = i19;
            z14 = true;
        }
        r0 r0Var3 = SubcomposeLayout;
        final Ref.ObjectRef objectRef2 = objectRef;
        double dM0 = 0.0d;
        int iM0 = (int) ((((f0) CollectionsKt.u0(list2)) != null ? r1.M0() : 0.0d) / 2.0d);
        f0 f0Var = (f0) CollectionsKt.F0(list2);
        if (f0Var != null) {
            i13 = iM0;
            dM0 = f0Var.M0();
        } else {
            i13 = iM0;
        }
        int i23 = iL - ((((((int) (dM0 / 2.0d)) + i13) + (intRef2.f143740a * 2)) + i15) + i14);
        List<androidx.compose.ui.layout.I> listZ4 = r0Var3.Z("BAR", ComposableLambdaKt.composableLambdaInstance(3101171, true, new d(z1Var, localThemeScope, r0Var3, i23)));
        final ArrayList arrayList6 = new ArrayList(CollectionsKt.x(listZ4, 10));
        Iterator<T> it4 = listZ4.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((androidx.compose.ui.layout.I) it4.next()).k0(H1.b.d(bVar.getValue(), i23, i23, 0, 0, 12, null)));
        }
        List<f0> list5 = list3;
        long jA = H1.r.INSTANCE.a();
        for (f0 f0Var2 : list5) {
            jA = H1.r.c((Math.max((int) (jA >> 32), f0Var2.getWidth()) << 32) | (Math.max((int) (jA & 4294967295L), f0Var2.J0()) & 4294967295L));
        }
        Iterator it5 = list5.iterator();
        int iMax2 = 0;
        while (it5.hasNext()) {
            iMax2 = Math.max(iMax2, ((f0) it5.next()).J0());
        }
        final int iM02 = ((f0) list3.get(0)).M0() / 2;
        final long j10 = jA;
        return K.G0(r0Var, iL, i18 + iMax2 + intRef.f143740a, null, new Function1() { // from class: Fi.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return k.m(arrayList6, iL, j10, intRef, list3, i10, iM02, list2, function0, objectRef2, intRef2, iI12, (f0.a) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(List list, int i10, long j10, Ref.IntRef intRef, List list2, int i11, int i12, List list3, Function0 function0, Ref.ObjectRef objectRef, Ref.IntRef intRef2, int i13, f0.a aVar) {
        char c10;
        f0.a layout = aVar;
        Intrinsics.j(layout, "$this$layout");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            int iM0 = (i10 - f0Var.M0()) / 2;
            int i14 = (int) (j10 & 4294967295L);
            f0.a.l(layout, f0Var, iM0, ((i14 / 2) - (f0Var.getHeight() / 2)) + intRef.f143740a, 0.0f, 4, null);
            int i15 = 0;
            for (Object obj : list2) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    CollectionsKt.w();
                }
                f0 f0Var2 = (f0) obj;
                int i17 = i11 - 1;
                int width = (((f0Var.getWidth() / (i17 > 0 ? i17 : 1)) * i15) + iM0) - i12;
                int i18 = i15;
                f0.a.l(aVar, f0Var2, width, intRef.f143740a, 0.0f, 4, null);
                if (i18 < list3.size()) {
                    int width2 = (width + i12) - ((int) (((f0) list3.get(i18)).getWidth() / 2));
                    if (i18 != 0 || function0 == null || ((Collection) objectRef.f143742a).isEmpty()) {
                        c10 = 2;
                    } else {
                        c10 = 2;
                        f0.a.l(aVar, (f0) CollectionsKt.s0((List) objectRef.f143742a), (width2 - intRef2.f143740a) - i13, 0, 0.0f, 4, null);
                    }
                    f0.a.l(aVar, (f0) list3.get(i18), width2, i14 + intRef.f143740a, 0.0f, 4, null);
                } else {
                    c10 = 2;
                }
                i15 = i16;
            }
            layout = aVar;
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, List list, Integer num, Modifier modifier, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, Function0 function0, int i12, int i13, int i14, Composer composer, int i15) {
        k(localThemeScope, list, num, modifier, z10, z11, z12, z13, i10, i11, function0, composer, J0.a(i12 | 1), J0.a(i13), i14);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final float r26, androidx.compose.ui.Modifier r27, long r28, float r30, float r31, long r32, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fi.k.o(float, androidx.compose.ui.Modifier, long, float, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(long j10, float f10, long j11, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.b() & 4294967295L));
        F(Canvas, j10, fIntBitsToFloat);
        E(Canvas, 0.0f, f10, j11, fIntBitsToFloat);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(float f10, Modifier modifier, long j10, float f11, float f12, long j11, int i10, int i11, Composer composer, int i12) {
        o(f10, modifier, j10, f11, f12, j11, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void r(androidx.compose.ui.Modifier r20, final float r21, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fi.k.r(androidx.compose.ui.Modifier, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void s(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final float r18, final int r19, final long r20, final long r22, final Fi.BorderSpec r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fi.k.s(Ki.M, androidx.compose.ui.Modifier, float, int, long, long, Fi.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, Modifier modifier, float f10, int i10, long j10, long j11, BorderSpec borderSpec, int i11, int i12, Composer composer, int i13) {
        s(localThemeScope, modifier, f10, i10, j10, j11, borderSpec, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final LocalThemeScope localThemeScope, final long j10, final int i10, final float f10, Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1746421624);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.e(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.b(f10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1746421624, i12, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.ProgressCircleText (AcresProgressTracker.kt:484)");
            }
            String strValueOf = String.valueOf(i10 + 1);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i13 = i12 & 14;
            boolean z10 = (i13 == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i12 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new I() { // from class: Fi.h
                    @Override // Ki.I
                    public final TextStyle getStyle() {
                        return k.v(localThemeScope, j10);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            si.j.h(localThemeScope, new q1.Label(J.i(J.z(Modifier.INSTANCE, f10), H1.h.p(0.9f * f10)), null, null, null, 0, false, 0, (I) objB, null, 382, null), strValueOf, null, composerStartRestartGroup, i13, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Fi.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.w(localThemeScope, j10, i10, f10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, long j10, int i10, float f10, int i11, Composer composer, int i12) {
        u(localThemeScope, j10, i10, f10, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Modifier modifier, float f10, Function2 function2, int i10, int i11, Composer composer, int i12) {
        r(modifier, f10, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(LocalThemeScope localThemeScope, final w wVar, int i10, Composer composer, final int i11) {
        int i12;
        final int i13;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(1068226057);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? composerStartRestartGroup.V(wVar) : composerStartRestartGroup.D(wVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            i13 = i10;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1068226057, i12, -1, "com.meijer.mobile.android_acres_library.composables.progress_tracker.ProgressTrackerCircle (AcresProgressTracker.kt:350)");
            }
            if (Intrinsics.e(wVar, o.f10607a)) {
                composerStartRestartGroup.startReplaceGroup(68063174);
                C16671b.b(localThemeScope2, new q1.h.DrawableIcon(C.i.a.f17092d, null, null, null, 0.0f, null, null, 126, null), null, null, composerStartRestartGroup, i12 & 14, 6);
                composerStartRestartGroup.P();
                localThemeScope2 = localThemeScope;
                i13 = i10;
            } else {
                if (Intrinsics.e(wVar, p.f10608a)) {
                    composerStartRestartGroup.startReplaceGroup(68069723);
                    localThemeScope2 = localThemeScope;
                    s(localThemeScope2, Modifier.INSTANCE, H1.h.p(24), i10, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), new BorderSpec(false, 0.0f, 0L, 6, null), composerStartRestartGroup, (i12 & 14) | 432 | ((i12 << 3) & 7168), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.P();
                } else if (Intrinsics.e(wVar, q.f10609a)) {
                    composerStartRestartGroup.startReplaceGroup(68080775);
                    localThemeScope2 = localThemeScope;
                    C16671b.b(localThemeScope2, new q1.h.DrawableIcon(C.i.d.f17095d, null, null, null, 0.0f, null, null, 126, null), null, null, composerStartRestartGroup, i12 & 14, 6);
                    composerStartRestartGroup.P();
                } else if (Intrinsics.e(wVar, s.f10611a)) {
                    composerStartRestartGroup.startReplaceGroup(68087429);
                    i13 = i10;
                    localThemeScope2 = localThemeScope;
                    s(localThemeScope2, Modifier.INSTANCE, H1.h.p(24), i13, C5489q0.INSTANCE.k(), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), new BorderSpec(true, H1.h.p(2), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null), composerStartRestartGroup, (i12 & 14) | 25008 | ((i12 << 3) & 7168), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.P();
                } else if (Intrinsics.e(wVar, r.f10610a)) {
                    composerStartRestartGroup.startReplaceGroup(68101667);
                    localThemeScope2 = localThemeScope;
                    C16671b.b(localThemeScope2, new q1.h.DrawableIcon(C.i.e.f17096d, null, null, null, 0.0f, null, null, 126, null), null, null, composerStartRestartGroup, i12 & 14, 6);
                    composerStartRestartGroup.P();
                } else if (Intrinsics.e(wVar, t.f10612a)) {
                    composerStartRestartGroup.startReplaceGroup(68107973);
                    localThemeScope2 = localThemeScope;
                    C16671b.b(localThemeScope2, new q1.h.DrawableIcon(C.i.n.f17109d, null, null, null, 0.0f, null, null, 126, null), null, null, composerStartRestartGroup, i12 & 14, 6);
                    composerStartRestartGroup.P();
                } else if (Intrinsics.e(wVar, u.f10613a)) {
                    composerStartRestartGroup.startReplaceGroup(2111540915);
                    localThemeScope2 = localThemeScope;
                    C16671b.b(localThemeScope2, new q1.h.DrawableIcon(C.i.g.f17100d, null, null, null, 0.0f, null, null, 126, null), null, null, composerStartRestartGroup, i12 & 14, 6);
                    composerStartRestartGroup.P();
                } else {
                    if (!Intrinsics.e(wVar, v.f10614a)) {
                        composerStartRestartGroup.startReplaceGroup(68063183);
                        composerStartRestartGroup.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(68122015);
                    i13 = i10;
                    localThemeScope2 = localThemeScope;
                    s(localThemeScope2, Modifier.INSTANCE, H1.h.p(24), i13, C5489q0.INSTANCE.k(), localThemeScope.getAdsColors().getAdsColorsDisabled().getColor(), new BorderSpec(true, H1.h.p(1), localThemeScope.getAdsColors().getAdsColorsDisabled().getColor(), null), composerStartRestartGroup, (i12 & 14) | 25008 | ((i12 << 3) & 7168), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.P();
                }
                i13 = i10;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Fi.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.z(localThemeScope2, wVar, i13, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, w wVar, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, wVar, i10, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    private static final void E(X0.f fVar, float f10, float f11, long j10, float f12) {
        boolean z10;
        float f13;
        float f14;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / 2;
        if (fVar.getLayoutDirection() == H1.t.f13338a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f13 = f10;
        } else {
            f13 = 1.0f - f11;
        }
        float f15 = f13 * fIntBitsToFloat;
        if (z10) {
            f14 = f11;
        } else {
            f14 = 1.0f - f10;
        }
        X0.f.O0(fVar, j10, U0.f.e((Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(f14 * fIntBitsToFloat) << 32)), f12, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle v(LocalThemeScope localThemeScope, long j10) {
        return TextStyle.c(localThemeScope.getAdsTypography().getHeadings().getEight().getStyle(), j10, localThemeScope.getAdsTypography().getHeadings().getEight().getStyle().l(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744444, null);
    }
}
