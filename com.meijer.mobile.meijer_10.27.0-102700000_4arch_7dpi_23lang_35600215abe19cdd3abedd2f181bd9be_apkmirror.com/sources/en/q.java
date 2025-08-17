package en;

import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import Ji.Q;
import Ji.T;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5659e;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsListItem;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsTimeDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.y;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import en.q;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import java.util.Locale;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import ni.C15854p;
import ni.E0;
import ni.P0;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0010\u001a+\u0010\u0014\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001b²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "viewState", "", "isAddressQualifierNewUI", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "onOrderOptionsAction", "n", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "decorator", "j", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/r;Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "g", "Lkotlin/Function0;", "onAddNewAddressClick", "l", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "deliveryMode", "lastAction", "isNewAddressQualifierEnabled", "isNoSavedAddresses", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129166a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f129167b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: en.q$a$a, reason: collision with other inner class name */
        static final class C2033a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129168a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f129169b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: en.q$a$a$a, reason: collision with other inner class name */
            static final class C2034a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129170a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f129171b;

                C2034a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                    this.f129170a = localThemeScope;
                    this.f129171b = orderOptionsViewState;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-162070084, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:341)");
                    }
                    LocalThemeScope localThemeScope = this.f129170a;
                    q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f129170a.getAdsTypography().getHeadings().getEight(), null, 383, null);
                    String strC = C16193g.c(Hl.h.f12784c0, composer, 0);
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    ri.j.h(this.f129170a, new q1.Label(null, null, null, null, 0, false, 0, this.f129170a.getAdsTypography().getBody().getTwo(), null, 383, null), C6408b.a(this.f129171b.getCalloutViewMessage(), composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
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

            C2033a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                this.f129168a = localThemeScope;
                this.f129169b = orderOptionsViewState;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1196436082, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:334)");
                }
                LocalThemeScope localThemeScope = this.f129168a;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.n.f15565d, null, null, null, 0.0f, null, D.i(Modifier.INSTANCE, this.f129168a.getAdsSpacing().getFive().getDp()), 62, null);
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                C16088n.e(this.f129168a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(-162070084, true, new C2034a(this.f129168a, this.f129169b), composer, 54), composer, i11 | 384 | (q1.Column.f139985d << 3));
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

        a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
            this.f129166a = localThemeScope;
            this.f129167b = orderOptionsViewState;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1422932430, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:322)");
            }
            C16088n.i(this.f129166a, new q1.Row(D.j(androidx.compose.foundation.b.d(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f129166a.getAdsColors().getAdsColorSupportWarningBg().getColor(), null, 2, null), this.f129166a.getAdsSpacing().getFive().getDp(), this.f129166a.getAdsSpacing().getThree().getDp()), null, null, 6, null), ComposableLambdaKt.c(1196436082, true, new C2033a(this.f129166a, this.f129167b), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129172a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129173b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f129174c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f129175d;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1<? super y.e, Unit> function1) {
            this.f129172a = localThemeScope;
            this.f129173b = orderOptionsDecorator;
            this.f129174c = orderOptionsViewState;
            this.f129175d = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1922395718, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:356)");
            }
            LocalThemeScope localThemeScope = this.f129172a;
            Modifier modifierJ = D.j(Modifier.INSTANCE, this.f129172a.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
            OrderOptionsDecorator orderOptionsDecorator = this.f129173b;
            OrderOptionsTimeDecorator timeSlotDecorator = this.f129174c.getTimeSlotDecorator();
            if (timeSlotDecorator == null) {
                timeSlotDecorator = new OrderOptionsTimeDecorator(null, null, 3, null);
            }
            C13706f.c(localThemeScope, modifierJ, orderOptionsDecorator, timeSlotDecorator, this.f129175d, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9), 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129176a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129177b;

        c(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator) {
            this.f129176a = localThemeScope;
            this.f129177b = orderOptionsDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-258589341, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:368)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(J.h(companion, 0.0f, 1, null), this.f129176a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            LocalThemeScope localThemeScope = this.f129176a;
            OrderOptionsDecorator orderOptionsDecorator = this.f129177b;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
            I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
            Modifier modifierK = D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: en.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.c.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ri.j.h(localThemeScope, new q1.Label(C16705m.d(modifierK, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, seven, null, 382, null), C6408b.a(orderOptionsDecorator.f(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129178a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f129179b;

        d(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
            this.f129178a = localThemeScope;
            this.f129179b = orderOptionsViewState;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-830548033, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:402)");
            }
            LocalThemeScope localThemeScope = this.f129178a;
            q1.Label label = new q1.Label(D.j(Modifier.INSTANCE, this.f129178a.getAdsSpacing().getFive().getDp(), this.f129178a.getAdsSpacing().getEight().getDp()), this.f129178a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null);
            OrderOptionsDecorator orderOptionsDecorator = this.f129179b.getOrderOptionsDecorator();
            ri.j.h(localThemeScope, label, C6408b.a(orderOptionsDecorator != null ? orderOptionsDecorator.e() : null, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            C17917Z.a(null, this.f129178a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f129181b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129182c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129183a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<y.e, Unit> f129184b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OrderOptionsDecorator f129185c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: en.q$e$a$a, reason: collision with other inner class name */
            static final class C2035a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129186a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f129187b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrderOptionsDecorator f129188c;

                C2035a(LocalThemeScope localThemeScope, j1 j1Var, OrderOptionsDecorator orderOptionsDecorator) {
                    this.f129186a = localThemeScope;
                    this.f129187b = j1Var;
                    this.f129188c = orderOptionsDecorator;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2128056657, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:429)");
                    }
                    LocalThemeScope localThemeScope = this.f129186a;
                    q1.h.DrawableIcon enabledIcon = this.f129187b.getIcons().getEnabledIcon();
                    C.a.B b10 = C.a.B.f15320e;
                    int i11 = LocalThemeScope.f15770g;
                    C16307b.b(localThemeScope, enabledIcon, b10, null, composer, (q1.h.DrawableIcon.f140067h << 3) | i11 | (C.a.B.f15321f << 6), 4);
                    LocalThemeScope localThemeScope2 = this.f129186a;
                    q1.Label labelY = q1.Label.y(this.f129187b.getLabels().getEnabledLabel(), J.h(D.m(this.f129187b.getLabels().getEnabledLabel().getModifier(), this.f129186a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), null, null, null, 0, false, 0, null, null, 510, null);
                    String upperCase = C6408b.a(this.f129188c.d(), composer, AbstractC5607a.f45514b).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope2, labelY, upperCase, null, composer, i11 | (q1.Label.f140080j << 3), 4);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super y.e, Unit> function1, OrderOptionsDecorator orderOptionsDecorator) {
                this.f129183a = localThemeScope;
                this.f129184b = function1;
                this.f129185c = orderOptionsDecorator;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1906841502, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:420)");
                }
                LocalThemeScope localThemeScope = this.f129183a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f129184b) | composer.D(this.f129185c);
                final Function1<y.e, Unit> function1 = this.f129184b;
                final OrderOptionsDecorator orderOptionsDecorator = this.f129185c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: en.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.e.a.c(function1, orderOptionsDecorator);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(2128056657, true, new C2035a(this.f129183a, Assemble, this.f129185c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, OrderOptionsDecorator orderOptionsDecorator) {
                y.e eVar;
                if (orderOptionsDecorator.l()) {
                    eVar = y.e.k.f110026a;
                } else {
                    eVar = y.e.i.f110024a;
                }
                function1.invoke(eVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function1<? super y.e, Unit> function1, OrderOptionsDecorator orderOptionsDecorator) {
            this.f129180a = localThemeScope;
            this.f129181b = function1;
            this.f129182c = orderOptionsDecorator;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(399793538, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:419)");
            }
            LocalThemeScope localThemeScope = this.f129180a;
            Q.e(localThemeScope, InterfaceC14971y.a.b.f140288a, ComposableLambdaKt.c(1906841502, true, new a(localThemeScope, this.f129181b, this.f129182c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.b.f140289b << 3));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final f f129189f = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(OrderOptionsListItem orderOptionsListItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f129190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f129191g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, List list) {
            super(1);
            this.f129190f = function1;
            this.f129191g = list;
        }

        public final Object a(int i10) {
            return this.f129190f.invoke(this.f129191g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f129192f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129193g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f129194h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129195i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope, Function1 function1, OrderOptionsDecorator orderOptionsDecorator) {
            super(4);
            this.f129192f = list;
            this.f129193g = localThemeScope;
            this.f129194h = function1;
            this.f129195i = orderOptionsDecorator;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            OrderOptionsListItem orderOptionsListItem = (OrderOptionsListItem) this.f129192f.get(i10);
            composer.startReplaceGroup(1162071415);
            LocalThemeScope localThemeScope = this.f129193g;
            Modifier.Companion companion = Modifier.INSTANCE;
            if (this.f129195i.k()) {
                FullStoryAnnotationsKt.fsMask(companion);
            }
            C13710j.d(localThemeScope, companion, orderOptionsListItem, this.f129194h, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 6), 0);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f129196f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(L1.A a10) {
            super(1);
            this.f129196f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f129196f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f129197f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f129198g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f129199h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129200i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129201j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f129202k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f129203l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Modifier f129204m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1 function1, Modifier modifier) {
            super(2);
            this.f129198g = nVar;
            this.f129199h = function0;
            this.f129200i = localThemeScope;
            this.f129201j = orderOptionsDecorator;
            this.f129202k = orderOptionsViewState;
            this.f129203l = function1;
            this.f129204m = modifier;
            this.f129197f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f129198g.getHelpersHashCode();
            this.f129198g.i();
            L1.n nVar = this.f129198g;
            composer.startReplaceGroup(-1173642125);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new k(hVarC);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f129200i) | composer.D(this.f129201j) | composer.D(this.f129202k) | composer.V(this.f129203l) | composer.V(this.f129204m);
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                Object lVar = new l(this.f129202k, this.f129200i, this.f129201j, this.f129203l, this.f129204m);
                composer.t(lVar);
                objB2 = lVar;
            }
            composer.P();
            C15342b.a(modifierK, null, null, false, null, null, null, false, null, (Function1) objB2, composer, 0, 510);
            composer.startReplaceGroup(-591824777);
            if (Intrinsics.e(this.f129201j.getSelectedDeliveryMode(), "delivery")) {
                LocalThemeScope localThemeScope = this.f129200i;
                I one = localThemeScope.getAdsTypography().getDetail().getOne();
                T adsColorText02 = this.f129200i.getAdsColors().getAdsColorText02();
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == Composer.INSTANCE.a()) {
                    objB3 = m.f129243a;
                    composer.t(objB3);
                }
                composer.P();
                ri.j.h(localThemeScope, new q1.Label(D.l(nVar.k(companion, hVarC, (Function1) objB3), this.f129200i.getAdsSpacing().getFive().getDp(), this.f129200i.getAdsSpacing().getFive().getDp(), this.f129200i.getAdsSpacing().getFive().getDp(), this.f129200i.getAdsSpacing().getThree().getDp()), adsColorText02, null, null, 0, false, 0, one, null, 380, null), C6408b.a(AbstractC5607a.INSTANCE.d(Hl.h.f12799k, String.valueOf(this.f129202k.l().size())), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            }
            composer.P();
            composer.P();
            if (this.f129198g.getHelpersHashCode() != helpersHashCode) {
                this.f129199h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f129205a;

        k(L1.h hVar) {
            this.f129205a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f129205a.getTop(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function1<l0.w, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f129206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129207b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f129208c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f129209d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f129210e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129211a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderOptionsDecorator f129212b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f129213c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<y.e, Unit> f129214d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: en.q$l$a$a, reason: collision with other inner class name */
            static final class C2036a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129215a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderOptionsDecorator f129216b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f129217c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function1<y.e, Unit> f129218d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: en.q$l$a$a$a, reason: collision with other inner class name */
                static final class C2037a implements Function1<r1.u, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C2037a f129219a = new C2037a();

                    public final void a(r1.u semantics) {
                        Intrinsics.j(semantics, "$this$semantics");
                        r1.s.v(semantics);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                        a(uVar);
                        return Unit.f142422a;
                    }

                    C2037a() {
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: en.q$l$a$a$b */
                static final class b implements Function0<Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f129220a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsDecorator f129221b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function1<y.e, Unit> f129222c;

                    /* JADX WARN: Multi-variable type inference failed */
                    b(y.OrderOptionsViewState orderOptionsViewState, OrderOptionsDecorator orderOptionsDecorator, Function1<? super y.e, Unit> function1) {
                        this.f129220a = orderOptionsViewState;
                        this.f129221b = orderOptionsDecorator;
                        this.f129222c = function1;
                    }

                    public final void a() {
                        if (this.f129220a.l().size() < 5 || this.f129221b.l()) {
                            this.f129222c.invoke(this.f129221b.l() ? y.e.k.f110026a : y.e.i.f110024a);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: en.q$l$a$a$c */
                static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsDecorator f129223a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f129224b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f129225c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: en.q$l$a$a$c$a, reason: collision with other inner class name */
                    static final class C2038a implements Function1<r1.u, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ String f129226a;

                        C2038a(String str) {
                            this.f129226a = str;
                        }

                        public final void a(r1.u semantics) {
                            Intrinsics.j(semantics, "$this$semantics");
                            r1.s.g0(semantics, this.f129226a);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                            a(uVar);
                            return Unit.f142422a;
                        }
                    }

                    c(OrderOptionsDecorator orderOptionsDecorator, LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                        this.f129223a = orderOptionsDecorator;
                        this.f129224b = localThemeScope;
                        this.f129225c = orderOptionsViewState;
                    }

                    public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                        String strC;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(517864975, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:162)");
                        }
                        if (this.f129223a.l()) {
                            composer.startReplaceGroup(193027160);
                            strC = C16193g.c(Hl.h.f12777Y, composer, 0);
                            composer.P();
                        } else {
                            composer.startReplaceGroup(193155190);
                            strC = C16193g.c(Hl.h.f12791g, composer, 0);
                            composer.P();
                        }
                        LocalThemeScope localThemeScope = this.f129224b;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(strC);
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new C2038a(strC);
                            composer.t(objB);
                        }
                        composer.P();
                        q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(this.f129223a.l() ? C.a.B.f15320e : C.a.C0245a.f15333e, null, null, null, 0.0f, (this.f129225c.l().size() != 5 || this.f129223a.l()) ? this.f129224b.getAdsColors().getAdsColorBrandPrimary() : this.f129224b.getAdsColors().getAdsColorsDisabled(), J.v(C16705m.d(companion, false, (Function1) objB, 1, null), this.f129224b.getAdsSpacing().getSix().getDp()), 30, null);
                        int i11 = LocalThemeScope.f15770g;
                        C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                        LocalThemeScope localThemeScope2 = this.f129224b;
                        ri.j.h(localThemeScope2, new q1.Label(D.k(companion, this.f129224b.getAdsSpacing().getThree().getDp(), 0.0f, 2, null), (this.f129225c.l().size() != 5 || this.f129223a.l()) ? this.f129224b.getAdsColors().getAdsColorBrandPrimary() : this.f129224b.getAdsColors().getAdsColorsDisabled(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getEight(), null, 380, null), C6408b.a(this.f129223a.c(), composer, AbstractC5607a.f45514b), null, composer, i11 | (q1.Label.f140080j << 3), 4);
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

                /* JADX WARN: Multi-variable type inference failed */
                C2036a(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1<? super y.e, Unit> function1) {
                    this.f129215a = localThemeScope;
                    this.f129216b = orderOptionsDecorator;
                    this.f129217c = orderOptionsViewState;
                    this.f129218d = function1;
                }

                public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1493838415, i11, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:140)");
                    }
                    LocalThemeScope localThemeScope = this.f129215a;
                    I six = localThemeScope.getAdsTypography().getHeadings().getSix();
                    T adsColorText01 = this.f129215a.getAdsColors().getAdsColorText01();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C2037a.f129219a;
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Label label = new q1.Label(C16705m.d(companion, false, (Function1) objB, 1, null), adsColorText01, null, null, 0, false, 0, six, null, 380, null);
                    String strA = C6408b.a(this.f129216b.f(), composer, AbstractC5607a.f45514b);
                    int i12 = LocalThemeScope.f15770g;
                    ri.j.h(localThemeScope, label, strA, null, composer, (q1.Label.f140080j << 3) | i12, 4);
                    C14802K.a(InterfaceC14800I.b(AdsRow, companion, 1.0f, false, 2, null), composer, 0);
                    LocalThemeScope localThemeScope2 = this.f129215a;
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(this.f129217c) | composer.D(this.f129216b) | composer.V(this.f129218d);
                    y.OrderOptionsViewState orderOptionsViewState = this.f129217c;
                    OrderOptionsDecorator orderOptionsDecorator = this.f129216b;
                    Function1<y.e, Unit> function1 = this.f129218d;
                    Object objB2 = composer.B();
                    if (zD || objB2 == companion2.a()) {
                        objB2 = new b(orderOptionsViewState, orderOptionsDecorator, function1);
                        composer.t(objB2);
                    }
                    composer.P();
                    C16088n.i(localThemeScope2, new q1.Row(ClickableKt.d(companion, false, null, null, (Function0) objB2, 7, null), null, null, 6, null), ComposableLambdaKt.c(517864975, true, new c(this.f129216b, this.f129215a, this.f129217c), composer, 54), composer, i12 | 384 | (q1.Row.f140137d << 3));
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

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1<? super y.e, Unit> function1) {
                this.f129211a = localThemeScope;
                this.f129212b = orderOptionsDecorator;
                this.f129213c = orderOptionsViewState;
                this.f129214d = function1;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(741733903, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f129211a;
                Modifier.Companion companion = Modifier.INSTANCE;
                C16088n.i(localThemeScope, new q1.Row(D.l(companion, this.f129211a.getAdsSpacing().getFive().getDp(), this.f129211a.getAdsSpacing().getThree().getDp(), this.f129211a.getAdsSpacing().getFive().getDp(), this.f129211a.getAdsSpacing().getSeven().getDp()), null, P0.e.INSTANCE.i(), 2, null), ComposableLambdaKt.c(1493838415, true, new C2036a(this.f129211a, this.f129212b, this.f129213c, this.f129214d), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << 3));
                C17917Z.a(D.m(companion, 0.0f, 0.0f, 0.0f, this.f129211a.getAdsSpacing().getFour().getDp(), 7, null), this.f129211a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129227a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f129228b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129229a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f129230b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: en.q$l$b$a$a, reason: collision with other inner class name */
                static final class C2039a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f129231a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f129232b;

                    C2039a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                        this.f129231a = localThemeScope;
                        this.f129232b = orderOptionsViewState;
                    }

                    public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1888322833, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:228)");
                        }
                        LocalThemeScope localThemeScope = this.f129231a;
                        q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f129231a.getAdsTypography().getHeadings().getEight(), null, 383, null);
                        String strC = C16193g.c(Hl.h.f12784c0, composer, 0);
                        int i11 = LocalThemeScope.f15770g;
                        int i12 = q1.Label.f140080j;
                        ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        ri.j.h(this.f129231a, new q1.Label(null, null, null, null, 0, false, 0, this.f129231a.getAdsTypography().getBody().getTwo(), null, 383, null), C6408b.a(this.f129232b.getCalloutViewMessage(), composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
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

                a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                    this.f129229a = localThemeScope;
                    this.f129230b = orderOptionsViewState;
                }

                public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1553026361, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:220)");
                    }
                    LocalThemeScope localThemeScope = this.f129229a;
                    q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.n.f15565d, null, null, null, 0.0f, null, D.i(Modifier.INSTANCE, this.f129229a.getAdsSpacing().getFive().getDp()), 62, null);
                    int i11 = LocalThemeScope.f15770g;
                    C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                    C16088n.e(this.f129229a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(1888322833, true, new C2039a(this.f129229a, this.f129230b), composer, 54), composer, i11 | 384 | (q1.Column.f139985d << 3));
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

            b(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                this.f129227a = localThemeScope;
                this.f129228b = orderOptionsViewState;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-421761401, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:208)");
                }
                C16088n.i(this.f129227a, new q1.Row(D.j(androidx.compose.foundation.b.d(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f129227a.getAdsColors().getAdsColorSupportWarningBg().getColor(), null, 2, null), this.f129227a.getAdsSpacing().getFive().getDp(), this.f129227a.getAdsSpacing().getThree().getDp()), null, null, 6, null), ComposableLambdaKt.c(-1553026361, true, new a(this.f129227a, this.f129228b), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129233a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f129234b;

            c(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                this.f129233a = localThemeScope;
                this.f129234b = orderOptionsViewState;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(656345492, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:266)");
                }
                LocalThemeScope localThemeScope = this.f129233a;
                q1.Label label = new q1.Label(D.j(Modifier.INSTANCE, this.f129233a.getAdsSpacing().getFive().getDp(), this.f129233a.getAdsSpacing().getEight().getDp()), this.f129233a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null);
                OrderOptionsDecorator orderOptionsDecorator = this.f129234b.getOrderOptionsDecorator();
                ri.j.h(localThemeScope, label, C6408b.a(orderOptionsDecorator != null ? orderOptionsDecorator.e() : null, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                C17917Z.a(null, this.f129233a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class d extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final d f129235f = new d();

            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(OrderOptionsListItem orderOptionsListItem) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class e extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f129236f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f129237g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Function1 function1, List list) {
                super(1);
                this.f129236f = function1;
                this.f129237g = list;
            }

            public final Object a(int i10) {
                return this.f129236f.invoke(this.f129237g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class f extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f129238f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129239g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Modifier f129240h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ OrderOptionsDecorator f129241i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1 f129242j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(List list, LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, Function1 function1) {
                super(4);
                this.f129238f = list;
                this.f129239g = localThemeScope;
                this.f129240h = modifier;
                this.f129241i = orderOptionsDecorator;
                this.f129242j = function1;
            }

            public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                OrderOptionsListItem orderOptionsListItem = (OrderOptionsListItem) this.f129238f.get(i10);
                composer.startReplaceGroup(-1539296402);
                Modifier modifierL = D.l(this.f129240h, this.f129239g.getAdsSpacing().getFive().getDp(), this.f129239g.getAdsSpacing().getTwo().getDp(), this.f129239g.getAdsSpacing().getFive().getDp(), this.f129239g.getAdsSpacing().getTwo().getDp());
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                w.d(this.f129239g, this.f129241i.k() ? FullStoryAnnotationsKt.fsMask(Modifier.INSTANCE) : Modifier.INSTANCE, orderOptionsListItem, this.f129241i.k() ? "delivery" : "pickup", this.f129242j, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 6), 0);
                composer.v();
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15343c, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(y.OrderOptionsViewState orderOptionsViewState, LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, Function1<? super y.e, Unit> function1, Modifier modifier) {
            this.f129206a = orderOptionsViewState;
            this.f129207b = localThemeScope;
            this.f129208c = orderOptionsDecorator;
            this.f129209d = function1;
            this.f129210e = modifier;
        }

        public final void a(l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(741733903, true, new a(this.f129207b, this.f129208c, this.f129206a, this.f129209d)), 3, null);
            if (this.f129206a.getCalloutViewMessage() != null) {
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-421761401, true, new b(this.f129207b, this.f129206a)), 3, null);
            }
            List<OrderOptionsListItem> listL = this.f129206a.l();
            LocalThemeScope localThemeScope = this.f129207b;
            Modifier modifier = this.f129210e;
            OrderOptionsDecorator orderOptionsDecorator = this.f129208c;
            Function1<y.e, Unit> function1 = this.f129209d;
            LazyColumn.i(listL.size(), null, new e(d.f129235f, listL), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(listL, localThemeScope, modifier, orderOptionsDecorator, function1)));
            if (this.f129206a.l().isEmpty()) {
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(656345492, true, new c(this.f129207b, this.f129206a)), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0.w wVar) {
            a(wVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f129243a = new m();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        m() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class n extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f129244f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(L1.A a10) {
            super(1);
            this.f129244f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f129244f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f129245f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f129246g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f129247h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129248i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f129249j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f129246g = nVar;
            this.f129247h = function0;
            this.f129248i = localThemeScope;
            this.f129249j = function02;
            this.f129245f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f129246g.getHelpersHashCode();
            this.f129246g.i();
            L1.n nVar = this.f129246g;
            composer.startReplaceGroup(-1359428296);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.h hVarG = bVarM.g();
            Configuration configuration = (Configuration) composer.o(AndroidCompositionLocals_androidKt.f());
            float f10 = configuration.screenWidthDp / configuration.screenHeightDp;
            LocalThemeScope localThemeScope = this.f129248i;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            T adsColorText01 = this.f129248i.getAdsColors().getAdsColorText01();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = p.f129250a;
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.i(nVar.k(companion, hVarC, (Function1) objB), this.f129248i.getAdsSpacing().getFive().getDp()), adsColorText01, null, null, 0, false, 0, six, null, 380, null);
            String strC = C16193g.c(Hl.h.f12758F, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f129248i;
            I one = localThemeScope2.getAdsTypography().getBody().getOne();
            T adsColorText012 = this.f129248i.getAdsColors().getAdsColorText01();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, this.f129248i.getAdsSpacing().getFive().getDp(), this.f129248i.getAdsSpacing().getFive().getDp(), this.f129248i.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new C2040q(hVarC);
                composer.t(objB2);
            }
            composer.P();
            ri.j.h(localThemeScope2, new q1.Label(nVar.k(modifierM, hVarD, (Function1) objB2), adsColorText012, null, null, 0, false, 0, one, null, 380, null), C16193g.c(Hl.h.f12759G, composer, 0), null, composer, i11 | (i12 << 3), 4);
            Z0.c cVarC = C16190d.c(S.f98709Y, composer, 0);
            Modifier modifierB = C5659e.b(androidx.compose.foundation.layout.D.j(companion, this.f129248i.getAdsSpacing().getFive().getDp(), this.f129248i.getAdsSpacing().getEight().getDp()), f10, false, 2, null);
            composer.startReplaceGroup(-1746271574);
            boolean zV2 = composer.V(hVarD) | composer.D(this.f129248i) | composer.V(hVarE);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new r(hVarD, this.f129248i, hVarE);
                composer.t(objB3);
            }
            composer.P();
            C13457y.a(cVarC, null, nVar.k(modifierB, hVarA, (Function1) objB3), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            LocalThemeScope localThemeScope3 = this.f129248i;
            I one2 = localThemeScope3.getAdsTypography().getDetail().getOne();
            T adsColorText013 = this.f129248i.getAdsColors().getAdsColorText01();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, this.f129248i.getAdsSpacing().getFive().getDp(), 0.0f, this.f129248i.getAdsSpacing().getFive().getDp(), H1.h.p(30), 2, null);
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(hVarF);
            Object objB4 = composer.B();
            if (zV3 || objB4 == companion2.a()) {
                objB4 = new s(hVarF);
                composer.t(objB4);
            }
            composer.P();
            ri.j.h(localThemeScope3, new q1.Label(nVar.k(modifierM2, hVarE, (Function1) objB4), adsColorText013, null, null, 0, false, 0, one2, null, 380, null), C6408b.a(AbstractC5607a.INSTANCE.d(Hl.h.f12799k, "0"), composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
            long color = this.f129248i.getAdsColors().getAdsColorUIDivider().getColor();
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(hVarG);
            Object objB5 = composer.B();
            if (zV4 || objB5 == companion2.a()) {
                objB5 = new t(hVarG);
                composer.t(objB5);
            }
            composer.P();
            C17917Z.a(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarF, (Function1) objB5), 0.0f, 0.0f, 0.0f, this.f129248i.getAdsSpacing().getFive().getDp(), 7, null), color, 0.0f, 0.0f, composer, 0, 12);
            Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, this.f129248i.getAdsSpacing().getFive().getDp(), 0.0f, this.f129248i.getAdsSpacing().getFive().getDp(), this.f129248i.getAdsSpacing().getFive().getDp(), 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion2.a()) {
                objB6 = u.f129257a;
                composer.t(objB6);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierM3, hVarG, (Function1) objB6);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            P0.h(this.f129248i, C15854p.f151759a, this.f129249j, C.a.C0245a.f15333e, C16193g.c(Hl.h.f12791g, composer, 0), null, C16193g.c(Hl.h.f12791g, composer, 0), true, false, false, 0L, composer, i11 | 12582912 | (C15854p.f151760b << 3) | (C.a.C0245a.f15334f << 9), 0, 912);
            composer.v();
            composer.P();
            if (this.f129246g.getHelpersHashCode() != helpersHashCode) {
                this.f129247h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f129250a = new p();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        p() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: en.q$q, reason: collision with other inner class name */
    static final class C2040q implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f129251a;

        C2040q(L1.h hVar) {
            this.f129251a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f129251a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f129252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f129254c;

        r(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
            this.f129252a = hVar;
            this.f129253b = localThemeScope;
            this.f129254c = hVar2;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f129252a.getBottom(), this.f129253b.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f129254c.getTop(), this.f129253b.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class s implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f129255a;

        s(L1.h hVar) {
            this.f129255a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), this.f129255a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class t implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f129256a;

        t(L1.h hVar) {
            this.f129256a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), this.f129256a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class u implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f129257a = new u();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        u() {
        }
    }

    public static final void g(final LocalThemeScope localThemeScope, final Modifier modifier, final OrderOptionsDecorator decorator, final y.OrderOptionsViewState viewState, final Function1<? super y.e, Unit> onOrderOptionsAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onOrderOptionsAction, "onOrderOptionsAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1488483055);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(viewState) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onOrderOptionsAction) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1488483055, i11, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView (OrderOptionsList.kt:318)");
            }
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = composerStartRestartGroup.D(viewState) | ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | composerStartRestartGroup.D(decorator) | ((57344 & i11) == 16384);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: en.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.h(viewState, localThemeScope, decorator, onOrderOptionsAction, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(modifier, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, (i11 >> 3) & 14, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: en.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.i(localThemeScope, modifier, decorator, viewState, onOrderOptionsAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(y.OrderOptionsViewState orderOptionsViewState, LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        if (orderOptionsViewState.getCalloutViewMessage() != null) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1422932430, true, new a(localThemeScope, orderOptionsViewState)), 3, null);
        }
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1922395718, true, new b(localThemeScope, orderOptionsDecorator, orderOptionsViewState, function1)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-258589341, true, new c(localThemeScope, orderOptionsDecorator)), 3, null);
        List<OrderOptionsListItem> listL = orderOptionsViewState.l();
        LazyColumn.i(listL.size(), null, new g(f.f129189f, listL), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new h(listL, localThemeScope, function1, orderOptionsDecorator)));
        if (orderOptionsViewState.l().isEmpty()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-830548033, true, new d(localThemeScope, orderOptionsViewState)), 3, null);
        }
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(399793538, true, new e(localThemeScope, function1, orderOptionsDecorator)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1 function1, int i10, Composer composer, int i11) {
        g(localThemeScope, modifier, orderOptionsDecorator, orderOptionsViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void j(final LocalThemeScope localThemeScope, final Modifier modifier, final OrderOptionsDecorator decorator, final y.OrderOptionsViewState viewState, final Function1<? super y.e, Unit> onOrderOptionsAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onOrderOptionsAction, "onOrderOptionsAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(365071289);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(viewState) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onOrderOptionsAction) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(365071289, i11, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView (OrderOptionsList.kt:118)");
            }
            Modifier modifierF = J.f(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierF, false, new i(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new j(nVar, 0, pairH.b(), localThemeScope, decorator, viewState, onOrderOptionsAction, modifier)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: en.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.k(localThemeScope, modifier, decorator, viewState, onOrderOptionsAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1 function1, int i10, Composer composer, int i11) {
        j(localThemeScope, modifier, orderOptionsDecorator, orderOptionsViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ji.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.q.l(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ji.LocalThemeScope r29, androidx.compose.ui.Modifier r30, com.meijer.mobile.meijer.activity.orderoptions.y.OrderOptionsViewState r31, final boolean r32, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en.q.n(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.y$g, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1) {
        function1.invoke(y.e.i.f110024a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, y.OrderOptionsViewState orderOptionsViewState, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, orderOptionsViewState, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
