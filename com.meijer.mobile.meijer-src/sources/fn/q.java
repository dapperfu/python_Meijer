package fn;

import Ki.C;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.Q;
import Ki.T;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5801e;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsListItem;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsTimeDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.y;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import dk.C13698b;
import fn.q;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import java.util.Locale;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
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
import l0.C15432b;
import l0.InterfaceC15433c;
import oi.C16188p;
import oi.E0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aC\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0010\u001a+\u0010\u0014\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001b²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "viewState", "", "isAddressQualifierNewUI", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "onOrderOptionsAction", "n", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "decorator", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/r;Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "g", "Lkotlin/Function0;", "onAddNewAddressClick", "l", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "deliveryMode", "lastAction", "isNewAddressQualifierEnabled", "isNoSavedAddresses", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f132156b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: fn.q$a$a, reason: collision with other inner class name */
        static final class C2097a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132157a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f132158b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: fn.q$a$a$a, reason: collision with other inner class name */
            static final class C2098a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f132159a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f132160b;

                C2098a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                    this.f132159a = localThemeScope;
                    this.f132160b = orderOptionsViewState;
                }

                public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-162070084, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:341)");
                    }
                    LocalThemeScope localThemeScope = this.f132159a;
                    q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f132159a.getAdsTypography().getHeadings().getEight(), null, 383, null);
                    String strC = C16338g.c(Il.h.f14935c0, composer, 0);
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = q1.Label.f142335j;
                    si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    si.j.h(this.f132159a, new q1.Label(null, null, null, null, 0, false, 0, this.f132159a.getAdsTypography().getBody().getTwo(), null, 383, null), C13698b.a(this.f132160b.getCalloutViewMessage(), composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
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

            C2097a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                this.f132157a = localThemeScope;
                this.f132158b = orderOptionsViewState;
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1196436082, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:334)");
                }
                LocalThemeScope localThemeScope = this.f132157a;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.n.f17109d, null, null, null, 0.0f, null, D.i(Modifier.INSTANCE, this.f132157a.getAdsSpacing().getFive().getDp()), 62, null);
                int i11 = LocalThemeScope.f17314g;
                C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                C16453n.e(this.f132157a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(-162070084, true, new C2098a(this.f132157a, this.f132158b), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
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

        a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
            this.f132155a = localThemeScope;
            this.f132156b = orderOptionsViewState;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1422932430, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:322)");
            }
            C16453n.i(this.f132155a, new q1.Row(D.j(androidx.compose.foundation.b.d(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f132155a.getAdsColors().getAdsColorSupportWarningBg().getColor(), null, 2, null), this.f132155a.getAdsSpacing().getFive().getDp(), this.f132155a.getAdsSpacing().getThree().getDp()), null, null, 6, null), ComposableLambdaKt.c(1196436082, true, new C2097a(this.f132155a, this.f132156b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f132162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f132163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f132164d;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1<? super y.e, Unit> function1) {
            this.f132161a = localThemeScope;
            this.f132162b = orderOptionsDecorator;
            this.f132163c = orderOptionsViewState;
            this.f132164d = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1922395718, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:356)");
            }
            LocalThemeScope localThemeScope = this.f132161a;
            Modifier modifierJ = D.j(Modifier.INSTANCE, this.f132161a.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
            OrderOptionsDecorator orderOptionsDecorator = this.f132162b;
            OrderOptionsTimeDecorator timeSlotDecorator = this.f132163c.getTimeSlotDecorator();
            if (timeSlotDecorator == null) {
                timeSlotDecorator = new OrderOptionsTimeDecorator(null, null, 3, null);
            }
            C14038f.c(localThemeScope, modifierJ, orderOptionsDecorator, timeSlotDecorator, this.f132164d, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9), 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f132166b;

        c(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator) {
            this.f132165a = localThemeScope;
            this.f132166b = orderOptionsDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-258589341, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:368)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(J.h(companion, 0.0f, 1, null), this.f132165a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            LocalThemeScope localThemeScope = this.f132165a;
            OrderOptionsDecorator orderOptionsDecorator = this.f132166b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
            I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
            Modifier modifierK = D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: fn.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.c.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            si.j.h(localThemeScope, new q1.Label(C16819m.d(modifierK, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, seven, null, 382, null), C13698b.a(orderOptionsDecorator.f(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132167a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f132168b;

        d(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
            this.f132167a = localThemeScope;
            this.f132168b = orderOptionsViewState;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-830548033, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:402)");
            }
            LocalThemeScope localThemeScope = this.f132167a;
            q1.Label label = new q1.Label(D.j(Modifier.INSTANCE, this.f132167a.getAdsSpacing().getFive().getDp(), this.f132167a.getAdsSpacing().getEight().getDp()), this.f132167a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null);
            OrderOptionsDecorator orderOptionsDecorator = this.f132168b.getOrderOptionsDecorator();
            si.j.h(localThemeScope, label, C13698b.a(orderOptionsDecorator != null ? orderOptionsDecorator.e() : null, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            C17983Z.a(null, this.f132167a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132169a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f132170b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f132171c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132172a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<y.e, Unit> f132173b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OrderOptionsDecorator f132174c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: fn.q$e$a$a, reason: collision with other inner class name */
            static final class C2099a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f132175a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f132176b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrderOptionsDecorator f132177c;

                C2099a(LocalThemeScope localThemeScope, j1 j1Var, OrderOptionsDecorator orderOptionsDecorator) {
                    this.f132175a = localThemeScope;
                    this.f132176b = j1Var;
                    this.f132177c = orderOptionsDecorator;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2128056657, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:429)");
                    }
                    LocalThemeScope localThemeScope = this.f132175a;
                    q1.h.DrawableIcon enabledIcon = this.f132176b.getIcons().getEnabledIcon();
                    C.a.B b10 = C.a.B.f16864e;
                    int i11 = LocalThemeScope.f17314g;
                    C16671b.b(localThemeScope, enabledIcon, b10, null, composer, (q1.h.DrawableIcon.f142322h << 3) | i11 | (C.a.B.f16865f << 6), 4);
                    LocalThemeScope localThemeScope2 = this.f132175a;
                    q1.Label labelY = q1.Label.y(this.f132176b.getLabels().getEnabledLabel(), J.h(D.m(this.f132176b.getLabels().getEnabledLabel().getModifier(), this.f132175a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), null, null, null, 0, false, 0, null, null, 510, null);
                    String upperCase = C13698b.a(this.f132177c.d(), composer, AbstractC6392a.f60445b).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope2, labelY, upperCase, null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super y.e, Unit> function1, OrderOptionsDecorator orderOptionsDecorator) {
                this.f132172a = localThemeScope;
                this.f132173b = function1;
                this.f132174c = orderOptionsDecorator;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1906841502, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:420)");
                }
                LocalThemeScope localThemeScope = this.f132172a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f132173b) | composer.D(this.f132174c);
                final Function1<y.e, Unit> function1 = this.f132173b;
                final OrderOptionsDecorator orderOptionsDecorator = this.f132174c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: fn.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.e.a.c(function1, orderOptionsDecorator);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(2128056657, true, new C2099a(this.f132172a, Assemble, this.f132174c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, OrderOptionsDecorator orderOptionsDecorator) {
                y.e eVar;
                if (orderOptionsDecorator.l()) {
                    eVar = y.e.k.f110887a;
                } else {
                    eVar = y.e.i.f110885a;
                }
                function1.invoke(eVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function1<? super y.e, Unit> function1, OrderOptionsDecorator orderOptionsDecorator) {
            this.f132169a = localThemeScope;
            this.f132170b = function1;
            this.f132171c = orderOptionsDecorator;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(399793538, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.LegacyOrderOptionsListView.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:419)");
            }
            LocalThemeScope localThemeScope = this.f132169a;
            Q.e(localThemeScope, InterfaceC15205y.a.b.f142543a, ComposableLambdaKt.c(1906841502, true, new a(localThemeScope, this.f132170b, this.f132171c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.b.f142544b << 3));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final f f132178f = new f();

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
        final /* synthetic */ Function1 f132179f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f132180g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, List list) {
            super(1);
            this.f132179f = function1;
            this.f132180g = list;
        }

        public final Object a(int i10) {
            return this.f132179f.invoke(this.f132180g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f132181f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132182g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f132183h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f132184i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope, Function1 function1, OrderOptionsDecorator orderOptionsDecorator) {
            super(4);
            this.f132181f = list;
            this.f132182g = localThemeScope;
            this.f132183h = function1;
            this.f132184i = orderOptionsDecorator;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
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
            OrderOptionsListItem orderOptionsListItem = (OrderOptionsListItem) this.f132181f.get(i10);
            composer.startReplaceGroup(1162071415);
            LocalThemeScope localThemeScope = this.f132182g;
            Modifier.Companion companion = Modifier.INSTANCE;
            if (this.f132184i.k()) {
                FullStoryAnnotationsKt.fsMask(companion);
            }
            C14042j.d(localThemeScope, companion, orderOptionsListItem, this.f132183h, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6), 0);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f132185f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(L1.A a10) {
            super(1);
            this.f132185f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f132185f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f132186f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f132187g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f132188h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132189i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f132190j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f132191k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f132192l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Modifier f132193m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1 function1, Modifier modifier) {
            super(2);
            this.f132187g = nVar;
            this.f132188h = function0;
            this.f132189i = localThemeScope;
            this.f132190j = orderOptionsDecorator;
            this.f132191k = orderOptionsViewState;
            this.f132192l = function1;
            this.f132193m = modifier;
            this.f132186f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f132187g.getHelpersHashCode();
            this.f132187g.i();
            L1.n nVar = this.f132187g;
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
            boolean zD = composer.D(this.f132189i) | composer.D(this.f132190j) | composer.D(this.f132191k) | composer.V(this.f132192l) | composer.V(this.f132193m);
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                Object lVar = new l(this.f132191k, this.f132189i, this.f132190j, this.f132192l, this.f132193m);
                composer.t(lVar);
                objB2 = lVar;
            }
            composer.P();
            C15432b.a(modifierK, null, null, false, null, null, null, false, null, (Function1) objB2, composer, 0, 510);
            composer.startReplaceGroup(-591824777);
            if (Intrinsics.e(this.f132190j.getSelectedDeliveryMode(), "delivery")) {
                LocalThemeScope localThemeScope = this.f132189i;
                I one = localThemeScope.getAdsTypography().getDetail().getOne();
                T adsColorText02 = this.f132189i.getAdsColors().getAdsColorText02();
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == Composer.INSTANCE.a()) {
                    objB3 = m.f132232a;
                    composer.t(objB3);
                }
                composer.P();
                si.j.h(localThemeScope, new q1.Label(D.l(nVar.k(companion, hVarC, (Function1) objB3), this.f132189i.getAdsSpacing().getFive().getDp(), this.f132189i.getAdsSpacing().getFive().getDp(), this.f132189i.getAdsSpacing().getFive().getDp(), this.f132189i.getAdsSpacing().getThree().getDp()), adsColorText02, null, null, 0, false, 0, one, null, 380, null), C13698b.a(AbstractC6392a.INSTANCE.d(Il.h.f14950k, String.valueOf(this.f132191k.l().size())), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            }
            composer.P();
            composer.P();
            if (this.f132187g.getHelpersHashCode() != helpersHashCode) {
                this.f132188h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f132194a;

        k(L1.h hVar) {
            this.f132194a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f132194a.getTop(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function1<l0.w, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y.OrderOptionsViewState f132195a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132196b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderOptionsDecorator f132197c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<y.e, Unit> f132198d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f132199e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132200a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderOptionsDecorator f132201b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f132202c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<y.e, Unit> f132203d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: fn.q$l$a$a, reason: collision with other inner class name */
            static final class C2100a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f132204a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderOptionsDecorator f132205b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f132206c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function1<y.e, Unit> f132207d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: fn.q$l$a$a$a, reason: collision with other inner class name */
                static final class C2101a implements Function1<r1.u, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C2101a f132208a = new C2101a();

                    public final void a(r1.u semantics) {
                        Intrinsics.j(semantics, "$this$semantics");
                        r1.s.v(semantics);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                        a(uVar);
                        return Unit.f143329a;
                    }

                    C2101a() {
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: fn.q$l$a$a$b */
                static final class b implements Function0<Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f132209a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsDecorator f132210b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function1<y.e, Unit> f132211c;

                    /* JADX WARN: Multi-variable type inference failed */
                    b(y.OrderOptionsViewState orderOptionsViewState, OrderOptionsDecorator orderOptionsDecorator, Function1<? super y.e, Unit> function1) {
                        this.f132209a = orderOptionsViewState;
                        this.f132210b = orderOptionsDecorator;
                        this.f132211c = function1;
                    }

                    public final void a() {
                        if (this.f132209a.l().size() < 5 || this.f132210b.l()) {
                            this.f132211c.invoke(this.f132210b.l() ? y.e.k.f110887a : y.e.i.f110885a);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: fn.q$l$a$a$c */
                static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ OrderOptionsDecorator f132212a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f132213b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f132214c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: fn.q$l$a$a$c$a, reason: collision with other inner class name */
                    static final class C2102a implements Function1<r1.u, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ String f132215a;

                        C2102a(String str) {
                            this.f132215a = str;
                        }

                        public final void a(r1.u semantics) {
                            Intrinsics.j(semantics, "$this$semantics");
                            r1.s.g0(semantics, this.f132215a);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                            a(uVar);
                            return Unit.f143329a;
                        }
                    }

                    c(OrderOptionsDecorator orderOptionsDecorator, LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                        this.f132212a = orderOptionsDecorator;
                        this.f132213b = localThemeScope;
                        this.f132214c = orderOptionsViewState;
                    }

                    public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                        String strC;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(517864975, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:162)");
                        }
                        if (this.f132212a.l()) {
                            composer.startReplaceGroup(193027160);
                            strC = C16338g.c(Il.h.f14928Y, composer, 0);
                            composer.P();
                        } else {
                            composer.startReplaceGroup(193155190);
                            strC = C16338g.c(Il.h.f14942g, composer, 0);
                            composer.P();
                        }
                        LocalThemeScope localThemeScope = this.f132213b;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(strC);
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new C2102a(strC);
                            composer.t(objB);
                        }
                        composer.P();
                        q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(this.f132212a.l() ? C.a.B.f16864e : C.a.C0287a.f16877e, null, null, null, 0.0f, (this.f132214c.l().size() != 5 || this.f132212a.l()) ? this.f132213b.getAdsColors().getAdsColorBrandPrimary() : this.f132213b.getAdsColors().getAdsColorsDisabled(), J.v(C16819m.d(companion, false, (Function1) objB, 1, null), this.f132213b.getAdsSpacing().getSix().getDp()), 30, null);
                        int i11 = LocalThemeScope.f17314g;
                        C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                        LocalThemeScope localThemeScope2 = this.f132213b;
                        si.j.h(localThemeScope2, new q1.Label(D.k(companion, this.f132213b.getAdsSpacing().getThree().getDp(), 0.0f, 2, null), (this.f132214c.l().size() != 5 || this.f132212a.l()) ? this.f132213b.getAdsColors().getAdsColorBrandPrimary() : this.f132213b.getAdsColors().getAdsColorsDisabled(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getEight(), null, 380, null), C13698b.a(this.f132212a.c(), composer, AbstractC6392a.f60445b), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

                /* JADX WARN: Multi-variable type inference failed */
                C2100a(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1<? super y.e, Unit> function1) {
                    this.f132204a = localThemeScope;
                    this.f132205b = orderOptionsDecorator;
                    this.f132206c = orderOptionsViewState;
                    this.f132207d = function1;
                }

                public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
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
                    LocalThemeScope localThemeScope = this.f132204a;
                    I six = localThemeScope.getAdsTypography().getHeadings().getSix();
                    T adsColorText01 = this.f132204a.getAdsColors().getAdsColorText01();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = C2101a.f132208a;
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Label label = new q1.Label(C16819m.d(companion, false, (Function1) objB, 1, null), adsColorText01, null, null, 0, false, 0, six, null, 380, null);
                    String strA = C13698b.a(this.f132205b.f(), composer, AbstractC6392a.f60445b);
                    int i12 = LocalThemeScope.f17314g;
                    si.j.h(localThemeScope, label, strA, null, composer, (q1.Label.f142335j << 3) | i12, 4);
                    C14890K.a(InterfaceC14888I.b(AdsRow, companion, 1.0f, false, 2, null), composer, 0);
                    LocalThemeScope localThemeScope2 = this.f132204a;
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(this.f132206c) | composer.D(this.f132205b) | composer.V(this.f132207d);
                    y.OrderOptionsViewState orderOptionsViewState = this.f132206c;
                    OrderOptionsDecorator orderOptionsDecorator = this.f132205b;
                    Function1<y.e, Unit> function1 = this.f132207d;
                    Object objB2 = composer.B();
                    if (zD || objB2 == companion2.a()) {
                        objB2 = new b(orderOptionsViewState, orderOptionsDecorator, function1);
                        composer.t(objB2);
                    }
                    composer.P();
                    C16453n.i(localThemeScope2, new q1.Row(ClickableKt.d(companion, false, null, null, (Function0) objB2, 7, null), null, null, 6, null), ComposableLambdaKt.c(517864975, true, new c(this.f132205b, this.f132204a, this.f132206c), composer, 54), composer, i12 | 384 | (q1.Row.f142392d << 3));
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

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1<? super y.e, Unit> function1) {
                this.f132200a = localThemeScope;
                this.f132201b = orderOptionsDecorator;
                this.f132202c = orderOptionsViewState;
                this.f132203d = function1;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(741733903, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f132200a;
                Modifier.Companion companion = Modifier.INSTANCE;
                C16453n.i(localThemeScope, new q1.Row(D.l(companion, this.f132200a.getAdsSpacing().getFive().getDp(), this.f132200a.getAdsSpacing().getThree().getDp(), this.f132200a.getAdsSpacing().getFive().getDp(), this.f132200a.getAdsSpacing().getSeven().getDp()), null, P0.e.INSTANCE.i(), 2, null), ComposableLambdaKt.c(1493838415, true, new C2100a(this.f132200a, this.f132201b, this.f132202c, this.f132203d), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << 3));
                C17983Z.a(D.m(companion, 0.0f, 0.0f, 0.0f, this.f132200a.getAdsSpacing().getFour().getDp(), 7, null), this.f132200a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132216a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f132217b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f132218a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.OrderOptionsViewState f132219b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: fn.q$l$b$a$a, reason: collision with other inner class name */
                static final class C2103a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f132220a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ y.OrderOptionsViewState f132221b;

                    C2103a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                        this.f132220a = localThemeScope;
                        this.f132221b = orderOptionsViewState;
                    }

                    public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1888322833, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:228)");
                        }
                        LocalThemeScope localThemeScope = this.f132220a;
                        q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f132220a.getAdsTypography().getHeadings().getEight(), null, 383, null);
                        String strC = C16338g.c(Il.h.f14935c0, composer, 0);
                        int i11 = LocalThemeScope.f17314g;
                        int i12 = q1.Label.f142335j;
                        si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        si.j.h(this.f132220a, new q1.Label(null, null, null, null, 0, false, 0, this.f132220a.getAdsTypography().getBody().getTwo(), null, 383, null), C13698b.a(this.f132221b.getCalloutViewMessage(), composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
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

                a(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                    this.f132218a = localThemeScope;
                    this.f132219b = orderOptionsViewState;
                }

                public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1553026361, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:220)");
                    }
                    LocalThemeScope localThemeScope = this.f132218a;
                    q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.n.f17109d, null, null, null, 0.0f, null, D.i(Modifier.INSTANCE, this.f132218a.getAdsSpacing().getFive().getDp()), 62, null);
                    int i11 = LocalThemeScope.f17314g;
                    C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                    C16453n.e(this.f132218a, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(1888322833, true, new C2103a(this.f132218a, this.f132219b), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
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

            b(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                this.f132216a = localThemeScope;
                this.f132217b = orderOptionsViewState;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-421761401, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:208)");
                }
                C16453n.i(this.f132216a, new q1.Row(D.j(androidx.compose.foundation.b.d(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f132216a.getAdsColors().getAdsColorSupportWarningBg().getColor(), null, 2, null), this.f132216a.getAdsSpacing().getFive().getDp(), this.f132216a.getAdsSpacing().getThree().getDp()), null, null, 6, null), ComposableLambdaKt.c(-1553026361, true, new a(this.f132216a, this.f132217b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132222a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.OrderOptionsViewState f132223b;

            c(LocalThemeScope localThemeScope, y.OrderOptionsViewState orderOptionsViewState) {
                this.f132222a = localThemeScope;
                this.f132223b = orderOptionsViewState;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(656345492, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.NewOrderOptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderOptionsList.kt:266)");
                }
                LocalThemeScope localThemeScope = this.f132222a;
                q1.Label label = new q1.Label(D.j(Modifier.INSTANCE, this.f132222a.getAdsSpacing().getFive().getDp(), this.f132222a.getAdsSpacing().getEight().getDp()), this.f132222a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null);
                OrderOptionsDecorator orderOptionsDecorator = this.f132223b.getOrderOptionsDecorator();
                si.j.h(localThemeScope, label, C13698b.a(orderOptionsDecorator != null ? orderOptionsDecorator.e() : null, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                C17983Z.a(null, this.f132222a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class d extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final d f132224f = new d();

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
            final /* synthetic */ Function1 f132225f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f132226g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Function1 function1, List list) {
                super(1);
                this.f132225f = function1;
                this.f132226g = list;
            }

            public final Object a(int i10) {
                return this.f132225f.invoke(this.f132226g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class f extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f132227f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132228g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Modifier f132229h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ OrderOptionsDecorator f132230i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1 f132231j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(List list, LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, Function1 function1) {
                super(4);
                this.f132227f = list;
                this.f132228g = localThemeScope;
                this.f132229h = modifier;
                this.f132230i = orderOptionsDecorator;
                this.f132231j = function1;
            }

            public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
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
                OrderOptionsListItem orderOptionsListItem = (OrderOptionsListItem) this.f132227f.get(i10);
                composer.startReplaceGroup(-1539296402);
                Modifier modifierL = D.l(this.f132229h, this.f132228g.getAdsSpacing().getFive().getDp(), this.f132228g.getAdsSpacing().getTwo().getDp(), this.f132228g.getAdsSpacing().getFive().getDp(), this.f132228g.getAdsSpacing().getTwo().getDp());
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
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
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14903g c14903g = C14903g.f139698a;
                w.d(this.f132228g, this.f132230i.k() ? FullStoryAnnotationsKt.fsMask(Modifier.INSTANCE) : Modifier.INSTANCE, orderOptionsListItem, this.f132230i.k() ? "delivery" : "pickup", this.f132231j, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6), 0);
                composer.v();
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15433c, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(y.OrderOptionsViewState orderOptionsViewState, LocalThemeScope localThemeScope, OrderOptionsDecorator orderOptionsDecorator, Function1<? super y.e, Unit> function1, Modifier modifier) {
            this.f132195a = orderOptionsViewState;
            this.f132196b = localThemeScope;
            this.f132197c = orderOptionsDecorator;
            this.f132198d = function1;
            this.f132199e = modifier;
        }

        public final void a(l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(741733903, true, new a(this.f132196b, this.f132197c, this.f132195a, this.f132198d)), 3, null);
            if (this.f132195a.getCalloutViewMessage() != null) {
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-421761401, true, new b(this.f132196b, this.f132195a)), 3, null);
            }
            List<OrderOptionsListItem> listL = this.f132195a.l();
            LocalThemeScope localThemeScope = this.f132196b;
            Modifier modifier = this.f132199e;
            OrderOptionsDecorator orderOptionsDecorator = this.f132197c;
            Function1<y.e, Unit> function1 = this.f132198d;
            LazyColumn.i(listL.size(), null, new e(d.f132224f, listL), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(listL, localThemeScope, modifier, orderOptionsDecorator, function1)));
            if (this.f132195a.l().isEmpty()) {
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(656345492, true, new c(this.f132196b, this.f132195a)), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0.w wVar) {
            a(wVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f132232a = new m();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        m() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class n extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f132233f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(L1.A a10) {
            super(1);
            this.f132233f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f132233f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f132234f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f132235g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f132236h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132237i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f132238j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f132235g = nVar;
            this.f132236h = function0;
            this.f132237i = localThemeScope;
            this.f132238j = function02;
            this.f132234f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f132235g.getHelpersHashCode();
            this.f132235g.i();
            L1.n nVar = this.f132235g;
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
            LocalThemeScope localThemeScope = this.f132237i;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            T adsColorText01 = this.f132237i.getAdsColors().getAdsColorText01();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = p.f132239a;
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.i(nVar.k(companion, hVarC, (Function1) objB), this.f132237i.getAdsSpacing().getFive().getDp()), adsColorText01, null, null, 0, false, 0, six, null, 380, null);
            String strC = C16338g.c(Il.h.f14909F, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f132237i;
            I one = localThemeScope2.getAdsTypography().getBody().getOne();
            T adsColorText012 = this.f132237i.getAdsColors().getAdsColorText01();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, this.f132237i.getAdsSpacing().getFive().getDp(), this.f132237i.getAdsSpacing().getFive().getDp(), this.f132237i.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new C2104q(hVarC);
                composer.t(objB2);
            }
            composer.P();
            si.j.h(localThemeScope2, new q1.Label(nVar.k(modifierM, hVarD, (Function1) objB2), adsColorText012, null, null, 0, false, 0, one, null, 380, null), C16338g.c(Il.h.f14910G, composer, 0), null, composer, i11 | (i12 << 3), 4);
            Z0.c cVarC = C16335d.c(S.f99566Y, composer, 0);
            Modifier modifierB = C5801e.b(androidx.compose.foundation.layout.D.j(companion, this.f132237i.getAdsSpacing().getFive().getDp(), this.f132237i.getAdsSpacing().getEight().getDp()), f10, false, 2, null);
            composer.startReplaceGroup(-1746271574);
            boolean zV2 = composer.V(hVarD) | composer.D(this.f132237i) | composer.V(hVarE);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new r(hVarD, this.f132237i, hVarE);
                composer.t(objB3);
            }
            composer.P();
            C13590y.a(cVarC, null, nVar.k(modifierB, hVarA, (Function1) objB3), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            LocalThemeScope localThemeScope3 = this.f132237i;
            I one2 = localThemeScope3.getAdsTypography().getDetail().getOne();
            T adsColorText013 = this.f132237i.getAdsColors().getAdsColorText01();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, this.f132237i.getAdsSpacing().getFive().getDp(), 0.0f, this.f132237i.getAdsSpacing().getFive().getDp(), H1.h.p(30), 2, null);
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(hVarF);
            Object objB4 = composer.B();
            if (zV3 || objB4 == companion2.a()) {
                objB4 = new s(hVarF);
                composer.t(objB4);
            }
            composer.P();
            si.j.h(localThemeScope3, new q1.Label(nVar.k(modifierM2, hVarE, (Function1) objB4), adsColorText013, null, null, 0, false, 0, one2, null, 380, null), C13698b.a(AbstractC6392a.INSTANCE.d(Il.h.f14950k, "0"), composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
            long color = this.f132237i.getAdsColors().getAdsColorUIDivider().getColor();
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(hVarG);
            Object objB5 = composer.B();
            if (zV4 || objB5 == companion2.a()) {
                objB5 = new t(hVarG);
                composer.t(objB5);
            }
            composer.P();
            C17983Z.a(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarF, (Function1) objB5), 0.0f, 0.0f, 0.0f, this.f132237i.getAdsSpacing().getFive().getDp(), 7, null), color, 0.0f, 0.0f, composer, 0, 12);
            Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion, this.f132237i.getAdsSpacing().getFive().getDp(), 0.0f, this.f132237i.getAdsSpacing().getFive().getDp(), this.f132237i.getAdsSpacing().getFive().getDp(), 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion2.a()) {
                objB6 = u.f132246a;
                composer.t(objB6);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierM3, hVarG, (Function1) objB6);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            P0.h(this.f132237i, C16188p.f154218a, this.f132238j, C.a.C0287a.f16877e, C16338g.c(Il.h.f14942g, composer, 0), null, C16338g.c(Il.h.f14942g, composer, 0), true, false, false, 0L, composer, i11 | 12582912 | (C16188p.f154219b << 3) | (C.a.C0287a.f16878f << 9), 0, 912);
            composer.v();
            composer.P();
            if (this.f132235g.getHelpersHashCode() != helpersHashCode) {
                this.f132236h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class p implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f132239a = new p();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        p() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fn.q$q, reason: collision with other inner class name */
    static final class C2104q implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f132240a;

        C2104q(L1.h hVar) {
            this.f132240a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f132240a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f132241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f132243c;

        r(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2) {
            this.f132241a = hVar;
            this.f132242b = localThemeScope;
            this.f132243c = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f132241a.getBottom(), this.f132242b.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f132243c.getTop(), this.f132242b.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class s implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f132244a;

        s(L1.h hVar) {
            this.f132244a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), this.f132244a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class t implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f132245a;

        t(L1.h hVar) {
            this.f132245a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), this.f132245a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class u implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f132246a = new u();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
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
                objB = new Function1() { // from class: fn.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.h(viewState, localThemeScope, decorator, onOrderOptionsAction, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(modifier, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, (i11 >> 3) & 14, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: fn.n
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
        LazyColumn.i(listL.size(), null, new g(f.f132178f, listL), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new h(listL, localThemeScope, function1, orderOptionsDecorator)));
        if (orderOptionsViewState.l().isEmpty()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-830548033, true, new d(localThemeScope, orderOptionsViewState)), 3, null);
        }
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(399793538, true, new e(localThemeScope, function1, orderOptionsDecorator)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsDecorator orderOptionsDecorator, y.OrderOptionsViewState orderOptionsViewState, Function1 function1, int i10, Composer composer, int i11) {
        g(localThemeScope, modifier, orderOptionsDecorator, orderOptionsViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierF, false, new i(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new j(nVar, 0, pairH.b(), localThemeScope, decorator, viewState, onOrderOptionsAction, modifier)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: fn.p
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
        return Unit.f143329a;
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
    public static final void l(final Ki.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.q.l(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void n(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, com.meijer.mobile.meijer.activity.orderoptions.y.OrderOptionsViewState r31, final boolean r32, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.q.n(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.y$g, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1) {
        function1.invoke(y.e.i.f110885a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, y.OrderOptionsViewState orderOptionsViewState, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, orderOptionsViewState, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
