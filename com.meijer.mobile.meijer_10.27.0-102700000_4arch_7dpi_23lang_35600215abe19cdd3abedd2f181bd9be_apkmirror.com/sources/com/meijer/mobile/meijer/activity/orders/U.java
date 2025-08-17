package com.meijer.mobile.meijer.activity.orders;

import Am.C2906v;
import Ji.LocalThemeScope;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.orders.U;
import gn.OrderOutOfStockListDecorator;
import gn.OrderSubstitutionsListDecorator;
import hn.C14538k;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import java.util.Locale;
import ji.C14899B;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17921a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import oi.C16088n;
import p1.C16193g;
import tr.C17135b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u009f\u0001\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0012H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001ai\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0012H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0003¢\u0006\u0004\b \u0010\u001e¨\u0006#²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lkotlin/Function0;", "", "onBackPressed", "onConfirmClicked", "onSkipClicked", "", "Lgn/q;", "substitutionItems", "Lgn/p;", "outOfStockItems", "Lvo/b;", "substitutionScreenType", "Lkotlin/Function1;", "", "onSubstitutionAccepted", "onSubstitutionRejected", "o", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Lvo/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "k", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lvo/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "h", "(LJi/M;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lvo/b;Landroidx/compose/runtime/Composer;I)V", "outOfStockItemsCount", "q", "(LJi/M;ILandroidx/compose/runtime/Composer;I)V", "substitutionsCount", "s", "", "subsConfirmed", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class U {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110459a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f110460b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f110461c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f110462d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orders.U$a$a, reason: collision with other inner class name */
        static final class C1701a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f110463a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f110464b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f110465c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orders.U$a$a$a, reason: collision with other inner class name */
            static final class C1702a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110466a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f110467b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110468c;

                C1702a(LocalThemeScope localThemeScope, j1 j1Var, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    this.f110466a = localThemeScope;
                    this.f110467b = j1Var;
                    this.f110468c = interfaceC5730l0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(18828906, i10, -1, "com.meijer.mobile.meijer.activity.orders.BottomBar.<anonymous>.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:164)");
                    }
                    LocalThemeScope localThemeScope = this.f110466a;
                    q1.Label labelY = q1.Label.y(this.f110467b.getLabels().getEnabledLabel(), androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, 0.0f, H1.h.p(5), 1, null), null, null, null, 0, false, 0, null, null, 510, null);
                    String upperCase = C16193g.c(U.i(this.f110468c) ? C17135b.f162005W : C17135b.f161978I, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            C1701a(LocalThemeScope localThemeScope, Function0<Unit> function0, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f110463a = localThemeScope;
                this.f110464b = function0;
                this.f110465c = interfaceC5730l0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1317638147, i10, -1, "com.meijer.mobile.meijer.activity.orders.BottomBar.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:156)");
                }
                ni.E0.b(this.f110463a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), false, null, 895, null), this.f110464b, ComposableLambdaKt.c(18828906, true, new C1702a(this.f110463a, Assemble, this.f110465c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f110469a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f110470b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.orders.U$a$b$a, reason: collision with other inner class name */
            static final class C1703a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110471a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f110472b;

                C1703a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f110471a = localThemeScope;
                    this.f110472b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-960151803, i10, -1, "com.meijer.mobile.meijer.activity.orders.BottomBar.<anonymous>.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:184)");
                    }
                    ri.j.h(this.f110471a, this.f110472b.getLabels().getEnabledLabel(), C16193g.c(C17135b.f162046s0, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            b(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f110469a = localThemeScope;
                this.f110470b = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(817480920, i10, -1, "com.meijer.mobile.meijer.activity.orders.BottomBar.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:179)");
                }
                ni.E0.b(this.f110469a, Assemble.getButtons().getEnabledButton(), this.f110470b, ComposableLambdaKt.c(-960151803, true, new C1703a(this.f110469a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, InterfaceC5730l0<Boolean> interfaceC5730l0, Function0<Unit> function02) {
            this.f110459a = localThemeScope;
            this.f110460b = function0;
            this.f110461c = interfaceC5730l0;
            this.f110462d = function02;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1380408217, i10, -1, "com.meijer.mobile.meijer.activity.orders.BottomBar.<anonymous> (OrderSubstitutionScreen.kt:155)");
            }
            LocalThemeScope localThemeScope = this.f110459a;
            C14899B c14899b = C14899B.f139602a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1317638147, true, new C1701a(localThemeScope, this.f110460b, this.f110461c), composer, 54);
            int i11 = LocalThemeScope.f15770g;
            Ji.Q.e(localThemeScope, c14899b, composableLambdaC, composer, i11 | 384 | (C14899B.f139603b << 3));
            if (!U.i(this.f110461c)) {
                LocalThemeScope localThemeScope2 = this.f110459a;
                Ji.Q.e(localThemeScope2, InterfaceC14971y.a.b.f140288a, ComposableLambdaKt.c(817480920, true, new b(localThemeScope2, this.f110462d), composer, 54), composer, i11 | 384 | (InterfaceC14971y.a.b.f140289b << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vo.b f110473a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110474b;

        b(vo.b bVar, LocalThemeScope localThemeScope) {
            this.f110473a = bVar;
            this.f110474b = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2084844761, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionMainContent.<anonymous>.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:93)");
            }
            if (this.f110473a == vo.b.f164897i) {
                ri.j.h(this.f110474b, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, this.f110474b.getAdsTypography().getBody().getOne(), null, 383, null), androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), null, null, null, 0, false, 0, null, null, 510, null), C16193g.c(C17135b.f162018e0, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                C17917Z.a(null, this.f110474b.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            }
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
        final /* synthetic */ LocalThemeScope f110475a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<OrderOutOfStockListDecorator> f110476b;

        c(LocalThemeScope localThemeScope, List<OrderOutOfStockListDecorator> list) {
            this.f110475a = localThemeScope;
            this.f110476b = list;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-865633712, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionMainContent.<anonymous>.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:104)");
            }
            U.q(this.f110475a, this.f110476b.size(), composer, LocalThemeScope.f15770g);
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
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110477a;

        d(LocalThemeScope localThemeScope) {
            this.f110477a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-467887869, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionMainContent.<anonymous>.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:112)");
            }
            ri.j.h(this.f110477a, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, this.f110477a.getAdsTypography().getBody().getOne(), null, 383, null), androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), null, null, null, 0, false, 0, null, null, 510, null), C16193g.c(C17135b.f162020f0, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            C17917Z.a(null, this.f110477a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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
        final /* synthetic */ LocalThemeScope f110478a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<OrderSubstitutionsListDecorator> f110479b;

        e(LocalThemeScope localThemeScope, List<OrderSubstitutionsListDecorator> list) {
            this.f110478a = localThemeScope;
            this.f110479b = list;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1686986082, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionMainContent.<anonymous>.<anonymous>.<anonymous> (OrderSubstitutionScreen.kt:124)");
            }
            U.s(this.f110478a, this.f110479b.size(), composer, LocalThemeScope.f15770g);
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
        public static final f f110480f = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(OrderOutOfStockListDecorator c14295p) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f110481f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f110482g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, List list) {
            super(1);
            this.f110481f = function1;
            this.f110482g = list;
        }

        public final Object a(int i10) {
            return this.f110481f.invoke(this.f110482g.get(i10));
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
        final /* synthetic */ List f110483f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110484g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope) {
            super(4);
            this.f110483f = list;
            this.f110484g = localThemeScope;
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
            OrderOutOfStockListDecorator c14295p = (OrderOutOfStockListDecorator) this.f110483f.get(i10);
            composer.startReplaceGroup(558072829);
            C14538k.b(this.f110484g, null, c14295p, composer, LocalThemeScope.f15770g, 1);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final i f110485f = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(OrderSubstitutionsListDecorator c14296q) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f110486f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f110487g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function1 function1, List list) {
            super(1);
            this.f110486f = function1;
            this.f110487g = list;
        }

        public final Object a(int i10) {
            return this.f110486f.invoke(this.f110487g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f110488f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f110489g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function1 function1, List list) {
            super(1);
            this.f110488f = function1;
            this.f110489g = list;
        }

        public final Object a(int i10) {
            return this.f110488f.invoke(this.f110489g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class l extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f110490f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110491g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f110492h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f110493i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List list, LocalThemeScope localThemeScope, Function1 function1, Function1 function12) {
            super(4);
            this.f110490f = list;
            this.f110491g = localThemeScope;
            this.f110492h = function1;
            this.f110493i = function12;
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
            OrderSubstitutionsListDecorator c14296q = (OrderSubstitutionsListDecorator) this.f110490f.get(i10);
            composer.startReplaceGroup(-667448944);
            F0.j(this.f110491g, c14296q, this.f110492h, this.f110493i, composer, LocalThemeScope.f15770g);
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
    @SourceDebugExtension
    static final class m implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f110495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110496c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f110497d;

        m(LocalThemeScope localThemeScope, Modifier modifier, String str, Function0<Unit> function0) {
            this.f110494a = localThemeScope;
            this.f110495b = modifier;
            this.f110496c = str;
            this.f110497d = function0;
        }

        public final void b(Composer composer, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1865157571, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionScreen.<anonymous> (OrderSubstitutionScreen.kt:56)");
            }
            LocalThemeScope localThemeScope = this.f110494a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(this.f110495b, 0.0f, 1, null);
            String strD = C16193g.d(C17135b.f162022g0, new Object[]{this.f110496c}, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f110497d);
            final Function0<Unit> function0 = this.f110497d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.V
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return U.m.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2906v.c(localThemeScope, modifierH, strD, (Function0) objB, false, composer, LocalThemeScope.f15770g, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f110499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f110500c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ vo.b f110501d;

        n(LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, vo.b bVar) {
            this.f110498a = localThemeScope;
            this.f110499b = function0;
            this.f110500c = function02;
            this.f110501d = bVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1258601054, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionScreen.<anonymous> (OrderSubstitutionScreen.kt:63)");
            }
            U.h(this.f110498a, this.f110499b, this.f110500c, this.f110501d, composer, LocalThemeScope.f15770g);
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
    static final class o implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110502a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<OrderSubstitutionsListDecorator> f110503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<OrderOutOfStockListDecorator> f110504c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ vo.b f110505d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f110506e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f110507f;

        /* JADX WARN: Multi-variable type inference failed */
        o(LocalThemeScope localThemeScope, List<OrderSubstitutionsListDecorator> list, List<OrderOutOfStockListDecorator> list2, vo.b bVar, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12) {
            this.f110502a = localThemeScope;
            this.f110503b = list;
            this.f110504c = list2;
            this.f110505d = bVar;
            this.f110506e = function1;
            this.f110507f = function12;
        }

        public final void a(InterfaceC14794C contentPaddingValues, Composer composer, int i10) {
            Intrinsics.j(contentPaddingValues, "contentPaddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(contentPaddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(830792362, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionScreen.<anonymous> (OrderSubstitutionScreen.kt:70)");
            }
            U.k(this.f110502a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPaddingValues), this.f110503b, this.f110504c, this.f110505d, this.f110506e, this.f110507f, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class p implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f110509b;

        p(LocalThemeScope localThemeScope, int i10) {
            this.f110508a = localThemeScope;
            this.f110509b = i10;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) throws Resources.NotFoundException {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-741658987, i10, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionNotAvailableHeader.<anonymous> (OrderSubstitutionScreen.kt:202)");
            }
            LocalThemeScope localThemeScope = this.f110508a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f110508a.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            q1.Label labelY = q1.Label.y(label, androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(24), 0.0f, 0.0f, 12, null), null, null, null, 0, false, 0, null, null, 510, null);
            String strD = C16193g.d(C17135b.f162014c0, new Object[]{Integer.valueOf(this.f110509b)}, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, labelY, strD, null, composer, (i12 << 3) | i11, 4);
            ri.j.h(this.f110508a, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, this.f110508a.getAdsTypography().getHeadings().getSeven(), null, 383, null), androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, H1.h.p(8), 6, null), null, null, null, 0, false, 0, null, null, 510, null), C16193g.c(C17135b.f162016d0, composer, 0), null, composer, i11 | (i12 << 3), 4);
            C17917Z.a(null, this.f110508a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws Resources.NotFoundException {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class q implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f110510a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f110511b;

        q(LocalThemeScope localThemeScope, int i10) {
            this.f110510a = localThemeScope;
            this.f110511b = i10;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-644095408, i10, -1, "com.meijer.mobile.meijer.activity.orders.ViewOrderSubstitutionHeader.<anonymous> (OrderSubstitutionScreen.kt:232)");
            }
            C17917Z.a(null, this.f110510a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            float f10 = 16;
            ri.j.h(this.f110510a, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, this.f110510a.getAdsTypography().getHeadings().getSeven(), null, 383, null), androidx.compose.foundation.layout.D.l(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(24), H1.h.p(f10), H1.h.p(8)), null, null, null, 0, false, 0, null, null, 510, null), C16193g.d(C17135b.f162012b0, new Object[]{Integer.valueOf(this.f110511b)}, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            C17917Z.a(null, this.f110510a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

    public static final void o(final LocalThemeScope localThemeScope, Modifier modifier, final String orderId, final Function0<Unit> onBackPressed, final Function0<Unit> onConfirmClicked, final Function0<Unit> onSkipClicked, final List<OrderSubstitutionsListDecorator> substitutionItems, final List<OrderOutOfStockListDecorator> outOfStockItems, final vo.b substitutionScreenType, final Function1<? super Integer, Unit> onSubstitutionAccepted, final Function1<? super Integer, Unit> onSubstitutionRejected, Composer composer, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(onBackPressed, "onBackPressed");
        Intrinsics.j(onConfirmClicked, "onConfirmClicked");
        Intrinsics.j(onSkipClicked, "onSkipClicked");
        Intrinsics.j(substitutionItems, "substitutionItems");
        Intrinsics.j(outOfStockItems, "outOfStockItems");
        Intrinsics.j(substitutionScreenType, "substitutionScreenType");
        Intrinsics.j(onSubstitutionAccepted, "onSubstitutionAccepted");
        Intrinsics.j(onSubstitutionRejected, "onSubstitutionRejected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-992698584);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= composerStartRestartGroup.V(orderId) ? 256 : 128;
        }
        if ((i12 & 4) != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i13 |= composerStartRestartGroup.D(onBackPressed) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 8) != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i13 |= composerStartRestartGroup.D(onConfirmClicked) ? 16384 : 8192;
        }
        if ((i12 & 16) != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i13 |= composerStartRestartGroup.D(onSkipClicked) ? 131072 : 65536;
        }
        if ((i12 & 32) != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i13 |= composerStartRestartGroup.D(substitutionItems) ? 1048576 : 524288;
        }
        if ((i12 & 64) != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i13 |= composerStartRestartGroup.D(outOfStockItems) ? 8388608 : 4194304;
        }
        if ((i12 & 128) != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.d(substitutionScreenType.ordinal()) ? 67108864 : 33554432;
        }
        if ((i12 & 256) != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.D(onSubstitutionAccepted) ? 536870912 : 268435456;
        }
        if ((i12 & 512) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (composerStartRestartGroup.D(onSubstitutionRejected) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i15 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-992698584, i13, i14, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionScreen (OrderSubstitutionScreen.kt:53)");
            }
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            C17921a1.a(null, null, ComposableLambdaKt.c(1865157571, true, new m(localThemeScope, modifier3, orderId, onBackPressed), composerStartRestartGroup, 54), ComposableLambdaKt.c(-1258601054, true, new n(localThemeScope, onConfirmClicked, onSkipClicked, substitutionScreenType), composerStartRestartGroup, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(830792362, true, new o(localThemeScope, substitutionItems, outOfStockItems, substitutionScreenType, onSubstitutionAccepted, onSubstitutionRejected), composerStartRestartGroup, 54), composer2, 3456, 12582912, 131059);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier4;
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.M
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return U.p(localThemeScope, modifier2, orderId, onBackPressed, onConfirmClicked, onSkipClicked, substitutionItems, outOfStockItems, substitutionScreenType, onSubstitutionAccepted, onSubstitutionRejected, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final LocalThemeScope localThemeScope, final Function0<Unit> function0, final Function0<Unit> function02, final vo.b bVar, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1635692067);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function02) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.d(bVar.ordinal()) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1635692067, i11, -1, "com.meijer.mobile.meijer.activity.orders.BottomBar (OrderSubstitutionScreen.kt:142)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = t1.e(Boolean.valueOf(bVar == vo.b.f164895g || bVar == vo.b.f164897i), null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C16088n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), null, P0.e.INSTANCE.g(), 2, null), ComposableLambdaKt.c(1380408217, true, new a(localThemeScope, function0, (InterfaceC5730l0) objB, function02), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.N
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return U.j(localThemeScope, function0, function02, bVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Function0 function0, Function0 function02, vo.b bVar, int i10, Composer composer, int i11) {
        h(localThemeScope, function0, function02, bVar, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final java.util.List<gn.OrderSubstitutionsListDecorator> r24, final java.util.List<gn.OrderOutOfStockListDecorator> r25, final vo.b r26, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r27, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orders.U.k(Ji.M, androidx.compose.ui.Modifier, java.util.List, java.util.List, vo.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(List list, vo.b bVar, List list2, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        if (!list.isEmpty()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2084844761, true, new b(bVar, localThemeScope)), 3, null);
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-865633712, true, new c(localThemeScope, list)), 3, null);
            LazyColumn.i(list.size(), null, new g(f.f110480f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new h(list, localThemeScope)));
        } else if (bVar == vo.b.f164896h) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-467887869, true, new d(localThemeScope)), 3, null);
        }
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1686986082, true, new e(localThemeScope, list2)), 3, null);
        LazyColumn.i(list2.size(), new j(new Function1() { // from class: com.meijer.mobile.meijer.activity.orders.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return U.m((OrderSubstitutionsListDecorator) obj);
            }
        }, list2), new k(i.f110485f, list2), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new l(list2, localThemeScope, function1, function12)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(OrderSubstitutionsListDecorator decorator) {
        Intrinsics.j(decorator, "decorator");
        return Integer.valueOf(decorator.getItemId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, List list, List list2, vo.b bVar, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, list, list2, bVar, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, String str, Function0 function0, Function0 function02, Function0 function03, List list, List list2, vo.b bVar, Function1 function1, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        o(localThemeScope, modifier, str, function0, function02, function03, list, list2, bVar, function1, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, i10, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, i10, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final LocalThemeScope localThemeScope, final int i10, Composer composer, final int i11) {
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1407774623);
        if ((i11 & 6) == 0) {
            if ((i11 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (composerStartRestartGroup.d(i10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1407774623, i12, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionNotAvailableHeader (OrderSubstitutionScreen.kt:194)");
            }
            C16088n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(-741658987, true, new p(localThemeScope, i10), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.T
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return U.r(localThemeScope, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(final LocalThemeScope localThemeScope, final int i10, Composer composer, final int i11) {
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(564841862);
        if ((i11 & 6) == 0) {
            if ((i11 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (composerStartRestartGroup.d(i10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(564841862, i12, -1, "com.meijer.mobile.meijer.activity.orders.ViewOrderSubstitutionHeader (OrderSubstitutionScreen.kt:224)");
            }
            C16088n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(-644095408, true, new q(localThemeScope, i10), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.S
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return U.t(localThemeScope, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
