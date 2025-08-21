package nr;

import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import cr.FaqDetails;
import cr.FaqList;
import cr.HowSubscriptionWorksDetails;
import d0.C13590y;
import dk.C13698b;
import j0.C14890K;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import jr.m;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15408b;
import kr.C15410d;
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.w;
import nr.C16015h;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;
import r0.C16806i;
import si.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\r\u001a\u00020\u0004*\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006&²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onFinish", "m", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "imageRes", "g", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "title", "k", "(LKi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "headerText", "i", "(LKi/M;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "iconRes", "description", "o", "(LKi/M;ILbk/a;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcr/d;", "faqDetailItems", "q", "(LKi/M;Lcr/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "Lcr/f;", "a", "Ljava/util/List;", "y", "()Ljava/util/List;", "howSubscriptionWorksItems", "b", "x", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: nr.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16015h {

    /* renamed from: a, reason: collision with root package name */
    private static final List<HowSubscriptionWorksDetails> f152970a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<FaqDetails> f152971b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nr.h$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152973b;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f152972a = localThemeScope;
            this.f152973b = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1898042646, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous> (HowSubscriptionWorks.kt:157)");
            }
            String strC = C16338g.c(C15410d.f148759P, composer, 0);
            C.f.d dVar = C.f.d.f17051e;
            m.c(this.f152972a, null, strC, AbstractC6392a.INSTANCE.d(C15410d.f148782g, new Object[0]), dVar, this.f152973b, null, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9) | (C.f.d.f17052f << 12), 33);
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
    /* renamed from: nr.h$b */
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152974a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.h$b$a */
        static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152975a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: nr.h$b$a$a, reason: collision with other inner class name */
            static final class C2367a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f152976a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: nr.h$b$a$a$a, reason: collision with other inner class name */
                static final class C2368a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f152977a;

                    C2368a(LocalThemeScope localThemeScope) {
                        this.f152977a = localThemeScope;
                    }

                    public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-822918748, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:187)");
                        }
                        C16015h.k(this.f152977a, C15410d.f148759P, null, composer, LocalThemeScope.f17314g, 2);
                        composer.startReplaceGroup(-550929814);
                        List<HowSubscriptionWorksDetails> listY = C16015h.y();
                        LocalThemeScope localThemeScope = this.f152977a;
                        for (HowSubscriptionWorksDetails howSubscriptionWorksDetails : listY) {
                            C14890K.a(J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
                            int imageRes = howSubscriptionWorksDetails.getImageRes();
                            AbstractC6392a title = howSubscriptionWorksDetails.getTitle();
                            AbstractC6392a description = howSubscriptionWorksDetails.getDescription();
                            int i11 = LocalThemeScope.f17314g;
                            int i12 = AbstractC6392a.f60445b;
                            C16015h.o(localThemeScope, imageRes, title, description, null, composer, (i12 << 9) | i11 | (i12 << 6), 8);
                        }
                        composer.P();
                        C14890K.a(J.i(Modifier.INSTANCE, this.f152977a.getAdsSpacing().getEight().getDp()), composer, 0);
                        C16015h.k(this.f152977a, C15410d.f148751J, null, composer, LocalThemeScope.f17314g, 2);
                        List<FaqDetails> listX = C16015h.x();
                        LocalThemeScope localThemeScope2 = this.f152977a;
                        for (FaqDetails faqDetails : listX) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            C14890K.a(J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composer, 0);
                            AbstractC6392a title2 = faqDetails.getTitle();
                            int i13 = LocalThemeScope.f17314g;
                            C16015h.i(localThemeScope2, title2, null, composer, i13 | (AbstractC6392a.f60445b << 3), 2);
                            C14890K.a(J.i(companion, localThemeScope2.getAdsSpacing().getFive().getDp()), composer, 0);
                            C16015h.q(localThemeScope2, faqDetails, null, composer, i13, 2);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        a(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                C2367a(LocalThemeScope localThemeScope) {
                    this.f152976a = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(156248494, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:181)");
                    }
                    C16453n.e(this.f152976a, new q1.Column(D.i(Modifier.INSTANCE, this.f152976a.getAdsSpacing().getSix().getDp()), null, P0.e.INSTANCE.g(), 2, null), ComposableLambdaKt.c(-822918748, true, new C2368a(this.f152976a), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
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

            a(LocalThemeScope localThemeScope) {
                this.f152975a = localThemeScope;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1952716239, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionWorks.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:176)");
                }
                C18051y.a(J.h(D.i(Modifier.INSTANCE, this.f152975a.getAdsSpacing().getFive().getDp()), 0.0f, 1, null), C16806i.c(this.f152975a.getAdsCornerRadii().getRadius06().getDp()), 0L, 0L, null, this.f152975a.getAdsSpacing().getOne().getDp(), ComposableLambdaKt.c(156248494, true, new C2367a(this.f152975a), composer, 54), composer, 1572864, 28);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        public final void b(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
            boolean zD = composer.D(this.f152974a);
            final LocalThemeScope localThemeScope = this.f152974a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: nr.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16015h.b.c(localThemeScope, (w) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15432b.a(modifierD, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        b(LocalThemeScope localThemeScope) {
            this.f152974a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(LocalThemeScope localThemeScope, w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            w.g(LazyColumn, null, null, C16008a.f152936a.a(), 3, null);
            w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1952716239, true, new a(localThemeScope)), 3, null);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            b(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nr.h$c */
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f152979b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f152980c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f152981d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.h$c$a */
        static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152982a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f152983b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f152984c;

            a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
                this.f152982a = localThemeScope;
                this.f152983b = abstractC6392a;
                this.f152984c = abstractC6392a2;
            }

            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1140789564, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.InstructionText.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:279)");
                }
                LocalThemeScope localThemeScope = this.f152982a;
                q1.Label label = new q1.Label(null, this.f152982a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                AbstractC6392a abstractC6392a = this.f152983b;
                int i11 = AbstractC6392a.f60445b;
                String strA = C13698b.a(abstractC6392a, composer, i11);
                int i12 = LocalThemeScope.f17314g;
                int i13 = q1.Label.f142335j;
                j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f152982a;
                j.h(localThemeScope2, new q1.Label(null, this.f152982a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 381, null), C13698b.a(this.f152984c, composer, i11), null, composer, i12 | (i13 << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                a(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
            this.f152978a = localThemeScope;
            this.f152979b = i10;
            this.f152980c = abstractC6392a;
            this.f152981d = abstractC6392a2;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
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
            C13590y.a(C16335d.c(this.f152979b, composer, 0), C13698b.a(this.f152980c, composer, AbstractC6392a.f60445b), AdsRow.d(J.v(companion, this.f152978a.getAdsSpacing().getEleven().getDp()), P0.e.INSTANCE.i()), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            C14890K.a(J.z(companion, this.f152978a.getAdsSpacing().getSeven().getDp()), composer, 0);
            C16453n.e(this.f152978a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(1140789564, true, new a(this.f152978a, this.f152980c, this.f152981d), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: nr.h$d */
    static final class d implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FaqDetails f152985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152986b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.h$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152987a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FaqList f152988b;

            a(LocalThemeScope localThemeScope, FaqList faqList) {
                this.f152987a = localThemeScope;
                this.f152988b = faqList;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-330707891, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.QuestionAnswerSection.<anonymous>.<anonymous>.<anonymous> (HowSubscriptionWorks.kt:312)");
                }
                LocalThemeScope localThemeScope = this.f152987a;
                j.h(localThemeScope, new q1.Label(J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C13698b.a(this.f152988b.getAnswer(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        d(FaqDetails faqDetails, LocalThemeScope localThemeScope) {
            this.f152985a = faqDetails;
            this.f152986b = localThemeScope;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(957328439, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.QuestionAnswerSection.<anonymous> (HowSubscriptionWorks.kt:306)");
            }
            List<FaqList> listA = this.f152985a.a();
            LocalThemeScope localThemeScope = this.f152986b;
            for (FaqList faqList : listA) {
                C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                LocalThemeScope localThemeScope2 = localThemeScope;
                Tj.f.c(localThemeScope2, C13698b.a(faqList.getQuestion(), composer, AbstractC6392a.f60445b), null, null, false, null, ComposableLambdaKt.c(-330707891, true, new a(localThemeScope, faqList), composer, 54), composer, 1769472 | LocalThemeScope.f17314g, 14);
                localThemeScope = localThemeScope2;
                C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    static {
        int i10 = C15408b.f148729h;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        f152970a = CollectionsKt.p(new HowSubscriptionWorksDetails(i10, companion.d(C15410d.f148797n0, new Object[0]), companion.d(C15410d.f148799o0, new Object[0])), new HowSubscriptionWorksDetails(C15408b.f148722a, companion.d(C15410d.f148778e, new Object[0]), companion.d(C15410d.f148780f, new Object[0])), new HowSubscriptionWorksDetails(C15408b.f148724c, companion.d(C15410d.f148733A, new Object[0]), companion.d(C15410d.f148735B, new Object[0])), new HowSubscriptionWorksDetails(C15408b.f148723b, companion.d(C15410d.f148788j, new Object[0]), companion.d(C15410d.f148790k, new Object[0])), new HowSubscriptionWorksDetails(C15408b.f148727f, companion.d(C15410d.f148739D, new Object[0]), companion.d(C15410d.f148741E, new Object[0])));
        f152971b = CollectionsKt.p(new FaqDetails(companion.d(C15410d.f148755L, new Object[0]), CollectionsKt.p(new FaqList(companion.d(C15410d.f148761R, new Object[0]), companion.d(C15410d.f148760Q, new Object[0])), new FaqList(companion.d(C15410d.f148820z, new Object[0]), companion.d(C15410d.f148818y, new Object[0])))), new FaqDetails(companion.d(C15410d.f148768Y, new Object[0]), CollectionsKt.p(new FaqList(companion.d(C15410d.f148806s, new Object[0]), companion.d(C15410d.f148804r, new Object[0])), new FaqList(companion.d(C15410d.f148805r0, new Object[0]), companion.d(C15410d.f148803q0, new Object[0])), new FaqList(companion.d(C15410d.f148800p, new Object[0]), companion.d(C15410d.f148798o, new Object[0])), new FaqList(companion.d(C15410d.f148794m, new Object[0]), companion.d(C15410d.f148792l, new Object[0])), new FaqList(companion.d(C15410d.f148767X, new Object[0]), companion.d(C15410d.f148766W, new Object[0])), new FaqList(companion.d(C15410d.f148772b, new Object[0]), companion.d(C15410d.f148770a, new Object[0])))), new FaqDetails(companion.d(C15410d.f148784h, new Object[0]), CollectionsKt.e(new FaqList(companion.d(C15410d.f148758O, new Object[0]), companion.d(C15410d.f148757N, new Object[0])))), new FaqDetails(companion.d(C15410d.f148811u0, new Object[0]), CollectionsKt.e(new FaqList(companion.d(C15410d.f148777d0, new Object[0]), companion.d(C15410d.f148775c0, new Object[0])))));
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
        throw new UnsupportedOperationException("Method not decompiled: nr.C16015h.g(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        g(i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
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
    public static final void i(final Ki.LocalThemeScope r22, final bk.AbstractC6392a r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C16015h.i(Ki.M, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, abstractC6392a, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void k(final Ki.LocalThemeScope r22, final int r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C16015h.k(Ki.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
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
    public static final void m(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C16015h.m(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void o(final Ki.LocalThemeScope r17, final int r18, final bk.AbstractC6392a r19, final bk.AbstractC6392a r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C16015h.o(Ki.M, int, bk.a, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        o(localThemeScope, i10, abstractC6392a, abstractC6392a2, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, FaqDetails faqDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, faqDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final List<FaqDetails> x() {
        return f152971b;
    }

    public static final List<HowSubscriptionWorksDetails> y() {
        return f152970a;
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
            C16453n.e(localThemeScope, new q1.Column(J.h(modifier, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(957328439, true, new d(faqDetails, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
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
                    return C16015h.r(localThemeScope, faqDetails, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
