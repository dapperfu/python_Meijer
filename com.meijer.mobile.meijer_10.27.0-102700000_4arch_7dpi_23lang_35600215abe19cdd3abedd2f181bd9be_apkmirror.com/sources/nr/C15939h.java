package nr;

import Ji.C;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import cr.FaqDetails;
import cr.FaqList;
import cr.HowSubscriptionWorksDetails;
import d0.C13457y;
import j0.C14802K;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import ji.q1;
import jr.m;
import kotlin.C17917Z;
import kotlin.C17985y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15305b;
import kr.C15307d;
import l0.C15342b;
import l0.InterfaceC15343c;
import l0.w;
import nr.C15939h;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;
import r0.C16692i;
import ri.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\r\u001a\u00020\u0004*\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006&²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onFinish", "m", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "imageRes", "g", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "title", "k", "(LJi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lak/a;", "headerText", "i", "(LJi/M;Lak/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "iconRes", "description", "o", "(LJi/M;ILak/a;Lak/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcr/d;", "faqDetailItems", "q", "(LJi/M;Lcr/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "Lcr/f;", "a", "Ljava/util/List;", "y", "()Ljava/util/List;", "howSubscriptionWorksItems", "b", "x", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: nr.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15939h {

    /* renamed from: a, reason: collision with root package name */
    private static final List<HowSubscriptionWorksDetails> f152518a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<FaqDetails> f152519b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nr.h$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152521b;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f152520a = localThemeScope;
            this.f152521b = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1898042646, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous> (HowSubscriptionWorks.kt:157)");
            }
            String strC = C16193g.c(C15307d.f147849P, composer, 0);
            C.f.d dVar = C.f.d.f15507e;
            m.c(this.f152520a, null, strC, AbstractC5607a.INSTANCE.d(C15307d.f147872g, new Object[0]), dVar, this.f152521b, null, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9) | (C.f.d.f15508f << 12), 33);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: nr.h$b */
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152522a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.h$b$a */
        static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152523a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: nr.h$b$a$a, reason: collision with other inner class name */
            static final class C2365a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f152524a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: nr.h$b$a$a$a, reason: collision with other inner class name */
                static final class C2366a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f152525a;

                    C2366a(LocalThemeScope localThemeScope) {
                        this.f152525a = localThemeScope;
                    }

                    public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-822918748, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:187)");
                        }
                        C15939h.k(this.f152525a, C15307d.f147849P, null, composer, LocalThemeScope.f15770g, 2);
                        composer.startReplaceGroup(-550929814);
                        List<HowSubscriptionWorksDetails> listY = C15939h.y();
                        LocalThemeScope localThemeScope = this.f152525a;
                        for (HowSubscriptionWorksDetails howSubscriptionWorksDetails : listY) {
                            C14802K.a(J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
                            int imageRes = howSubscriptionWorksDetails.getImageRes();
                            AbstractC5607a title = howSubscriptionWorksDetails.getTitle();
                            AbstractC5607a description = howSubscriptionWorksDetails.getDescription();
                            int i11 = LocalThemeScope.f15770g;
                            int i12 = AbstractC5607a.f45514b;
                            C15939h.o(localThemeScope, imageRes, title, description, null, composer, (i12 << 9) | i11 | (i12 << 6), 8);
                        }
                        composer.P();
                        C14802K.a(J.i(Modifier.INSTANCE, this.f152525a.getAdsSpacing().getEight().getDp()), composer, 0);
                        C15939h.k(this.f152525a, C15307d.f147843J, null, composer, LocalThemeScope.f15770g, 2);
                        List<FaqDetails> listX = C15939h.x();
                        LocalThemeScope localThemeScope2 = this.f152525a;
                        for (FaqDetails faqDetails : listX) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            C14802K.a(J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composer, 0);
                            AbstractC5607a title2 = faqDetails.getTitle();
                            int i13 = LocalThemeScope.f15770g;
                            C15939h.i(localThemeScope2, title2, null, composer, i13 | (AbstractC5607a.f45514b << 3), 2);
                            C14802K.a(J.i(companion, localThemeScope2.getAdsSpacing().getFive().getDp()), composer, 0);
                            C15939h.q(localThemeScope2, faqDetails, null, composer, i13, 2);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        a(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C2365a(LocalThemeScope localThemeScope) {
                    this.f152524a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(156248494, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:181)");
                    }
                    C16088n.e(this.f152524a, new q1.Column(D.i(Modifier.INSTANCE, this.f152524a.getAdsSpacing().getSix().getDp()), null, P0.e.INSTANCE.g(), 2, null), ComposableLambdaKt.c(-822918748, true, new C2366a(this.f152524a), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f152523a = localThemeScope;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1952716239, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:176)");
                }
                C17985y.a(J.h(D.i(Modifier.INSTANCE, this.f152523a.getAdsSpacing().getFive().getDp()), 0.0f, 1, null), C16692i.c(this.f152523a.getAdsCornerRadii().getRadius06().getDp()), 0L, 0L, null, this.f152523a.getAdsSpacing().getOne().getDp(), ComposableLambdaKt.c(156248494, true, new C2365a(this.f152523a), composer, 54), composer, 1572864, 28);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-205643843, i11, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous> (HowSubscriptionWorks.kt:165)");
            }
            Modifier modifierD = J.D(J.h(D.h(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), null, false, 3, null);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f152522a);
            final LocalThemeScope localThemeScope = this.f152522a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: nr.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15939h.b.c(localThemeScope, (w) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15342b.a(modifierD, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        b(LocalThemeScope localThemeScope) {
            this.f152522a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(LocalThemeScope localThemeScope, w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            w.g(LazyColumn, null, null, C15932a.f152484a.a(), 3, null);
            w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1952716239, true, new a(localThemeScope)), 3, null);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            b(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nr.h$c */
    static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f152527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f152528c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f152529d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.h$c$a */
        static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152530a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f152531b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f152532c;

            a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
                this.f152530a = localThemeScope;
                this.f152531b = abstractC5607a;
                this.f152532c = abstractC5607a2;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1140789564, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.InstructionText.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:279)");
                }
                LocalThemeScope localThemeScope = this.f152530a;
                q1.Label label = new q1.Label(null, this.f152530a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                AbstractC5607a abstractC5607a = this.f152531b;
                int i11 = AbstractC5607a.f45514b;
                String strA = C6408b.a(abstractC5607a, composer, i11);
                int i12 = LocalThemeScope.f15770g;
                int i13 = q1.Label.f140080j;
                j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f152530a;
                j.h(localThemeScope2, new q1.Label(null, this.f152530a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(this.f152532c, composer, i11), null, composer, i12 | (i13 << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, int i10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
            this.f152526a = localThemeScope;
            this.f152527b = i10;
            this.f152528c = abstractC5607a;
            this.f152529d = abstractC5607a2;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(AdsRow) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-838057146, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.InstructionText.<anonymous> (HowSubscriptionWorks.kt:271)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C13457y.a(C16190d.c(this.f152527b, composer, 0), C6408b.a(this.f152528c, composer, AbstractC5607a.f45514b), AdsRow.d(J.v(companion, this.f152526a.getAdsSpacing().getEleven().getDp()), P0.e.INSTANCE.i()), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            C14802K.a(J.z(companion, this.f152526a.getAdsSpacing().getSeven().getDp()), composer, 0);
            C16088n.e(this.f152526a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(1140789564, true, new a(this.f152526a, this.f152528c, this.f152529d), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: nr.h$d */
    static final class d implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FaqDetails f152533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152534b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.h$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152535a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FaqList f152536b;

            a(LocalThemeScope localThemeScope, FaqList faqList) {
                this.f152535a = localThemeScope;
                this.f152536b = faqList;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-330707891, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.QuestionAnswerSection.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:312)");
                }
                LocalThemeScope localThemeScope = this.f152535a;
                j.h(localThemeScope, new q1.Label(J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C6408b.a(this.f152536b.getAnswer(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(FaqDetails faqDetails, LocalThemeScope localThemeScope) {
            this.f152533a = faqDetails;
            this.f152534b = localThemeScope;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(957328439, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.QuestionAnswerSection.<anonymous> (HowSubscriptionWorks.kt:306)");
            }
            List<FaqList> listA = this.f152533a.a();
            LocalThemeScope localThemeScope = this.f152534b;
            for (FaqList faqList : listA) {
                C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                LocalThemeScope localThemeScope2 = localThemeScope;
                Sj.f.c(localThemeScope2, C6408b.a(faqList.getQuestion(), composer, AbstractC5607a.f45514b), null, null, false, null, ComposableLambdaKt.c(-330707891, true, new a(localThemeScope, faqList), composer, 54), composer, 1769472 | LocalThemeScope.f15770g, 14);
                localThemeScope = localThemeScope2;
                C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    static {
        int i10 = C15305b.f147821h;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        f152518a = CollectionsKt.p(new HowSubscriptionWorksDetails(i10, companion.d(C15307d.f147887n0, new Object[0]), companion.d(C15307d.f147889o0, new Object[0])), new HowSubscriptionWorksDetails(C15305b.f147814a, companion.d(C15307d.f147868e, new Object[0]), companion.d(C15307d.f147870f, new Object[0])), new HowSubscriptionWorksDetails(C15305b.f147816c, companion.d(C15307d.f147825A, new Object[0]), companion.d(C15307d.f147827B, new Object[0])), new HowSubscriptionWorksDetails(C15305b.f147815b, companion.d(C15307d.f147878j, new Object[0]), companion.d(C15307d.f147880k, new Object[0])), new HowSubscriptionWorksDetails(C15305b.f147819f, companion.d(C15307d.f147831D, new Object[0]), companion.d(C15307d.f147833E, new Object[0])));
        f152519b = CollectionsKt.p(new FaqDetails(companion.d(C15307d.f147845L, new Object[0]), CollectionsKt.p(new FaqList(companion.d(C15307d.f147851R, new Object[0]), companion.d(C15307d.f147850Q, new Object[0])), new FaqList(companion.d(C15307d.f147910z, new Object[0]), companion.d(C15307d.f147908y, new Object[0])))), new FaqDetails(companion.d(C15307d.f147858Y, new Object[0]), CollectionsKt.p(new FaqList(companion.d(C15307d.f147896s, new Object[0]), companion.d(C15307d.f147894r, new Object[0])), new FaqList(companion.d(C15307d.f147895r0, new Object[0]), companion.d(C15307d.f147893q0, new Object[0])), new FaqList(companion.d(C15307d.f147890p, new Object[0]), companion.d(C15307d.f147888o, new Object[0])), new FaqList(companion.d(C15307d.f147884m, new Object[0]), companion.d(C15307d.f147882l, new Object[0])), new FaqList(companion.d(C15307d.f147857X, new Object[0]), companion.d(C15307d.f147856W, new Object[0])), new FaqList(companion.d(C15307d.f147862b, new Object[0]), companion.d(C15307d.f147860a, new Object[0])))), new FaqDetails(companion.d(C15307d.f147874h, new Object[0]), CollectionsKt.e(new FaqList(companion.d(C15307d.f147848O, new Object[0]), companion.d(C15307d.f147847N, new Object[0])))), new FaqDetails(companion.d(C15307d.f147899t0, new Object[0]), CollectionsKt.e(new FaqList(companion.d(C15307d.f147867d0, new Object[0]), companion.d(C15307d.f147865c0, new Object[0])))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final int r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C15939h.g(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        g(i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r22, final ak.AbstractC5607a r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C15939h.i(Ji.M, ak.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, abstractC5607a, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r22, final int r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C15939h.k(Ji.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C15939h.m(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r17, final int r18, final ak.AbstractC5607a r19, final ak.AbstractC5607a r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C15939h.o(Ji.M, int, ak.a, ak.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, int i10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        o(localThemeScope, i10, abstractC5607a, abstractC5607a2, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, FaqDetails faqDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, faqDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final List<FaqDetails> x() {
        return f152519b;
    }

    public static final List<HowSubscriptionWorksDetails> y() {
        return f152518a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final LocalThemeScope localThemeScope, final FaqDetails faqDetails, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1366768831);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(faqDetails)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1366768831, i12, -1, "com.meijer.mobile.subscription.ux.howItWorks.QuestionAnswerSection (HowSubscriptionWorks.kt:302)");
            }
            C16088n.e(localThemeScope, new q1.Column(J.h(modifier, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(957328439, true, new d(faqDetails, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nr.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15939h.r(localThemeScope, faqDetails, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
