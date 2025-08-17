package com.meijer.mobile.meijer.activity.settings.debug;

import Ji.LocalThemeScope;
import V0.C5346q0;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.settings.debug.C12522t;
import d0.C13443j;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14810b;
import ji.InterfaceC14905H;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.C17738x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ni.E0;
import yl.AbstractC18227f;
import yl.AbstractC18253g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001am\u0010\u0010\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u000726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001am\u0010\u0018\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u000726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0001¢\u0006\u0004\b\u0018\u0010\u0011¨\u0006\u0019²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lyl/f;", "feature", "Lyl/g;", "flagState", "", "isEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "before", "after", "", "onCheckedChanged", "f", "(LJi/M;Lyl/f;Lyl/g;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "", "text", "d", "(LJi/M;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "h", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ComposableStringLiteral"})
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12522t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$a */
    static final class a implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f112268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112269b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f112270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f112271d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$a$a, reason: collision with other inner class name */
        static final class C1779a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112272a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14905H f112273b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f112274c;

            C1779a(LocalThemeScope localThemeScope, InterfaceC14905H interfaceC14905H, String str) {
                this.f112272a = localThemeScope;
                this.f112273b = interfaceC14905H;
                this.f112274c = str;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(41497163, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.BulkToggleButton.<anonymous>.<anonymous> (FeatureFlagListItem.kt:105)");
                }
                ri.j.h(this.f112272a, this.f112273b.getLabels().getEnabledRestingLabel(), this.f112274c, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        a(Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f112268a = modifier;
            this.f112269b = localThemeScope;
            this.f112270c = function0;
            this.f112271d = str;
        }

        public final void a(InterfaceC14905H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1438320040, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.BulkToggleButton.<anonymous> (FeatureFlagListItem.kt:99)");
            }
            q1.d.ChipButton chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, null, null, null, Assemble.getButtons().getEnabledResting().getModifier().then(this.f112268a), false, null, 895, null);
            LocalThemeScope localThemeScope = this.f112269b;
            E0.b(localThemeScope, chipButtonY, this.f112270c, ComposableLambdaKt.c(41497163, true, new C1779a(localThemeScope, Assemble, this.f112271d), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.ChipButton.f139940k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
            a(interfaceC14905H, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$b */
    static final class b implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC18227f f112276b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC18253g f112277c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f112278d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<AbstractC18253g, AbstractC18253g, Unit> f112279e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112280a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18227f f112281b;

            a(LocalThemeScope localThemeScope, AbstractC18227f abstractC18227f) {
                this.f112280a = localThemeScope;
                this.f112281b = abstractC18227f;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(288838198, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FeatureFlagListItem.<anonymous>.<anonymous>.<anonymous> (FeatureFlagListItem.kt:60)");
                }
                ri.j.h(this.f112280a, new q1.Label(null, null, null, null, 0, false, 0, this.f112280a.getAdsTypography().getDetail().getOne(), null, 383, null), this.f112281b.getShortName() + "(remoteId: " + this.f112281b.getRemoteId() + ')', null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, AbstractC18227f abstractC18227f, AbstractC18253g abstractC18253g, boolean z10, Function2<? super AbstractC18253g, ? super AbstractC18253g, Unit> function2) {
            this.f112275a = localThemeScope;
            this.f112276b = abstractC18227f;
            this.f112277c = abstractC18253g;
            this.f112278d = z10;
            this.f112279e = function2;
        }

        public final void a(InterfaceC14810b AdsBox, Composer composer, int i10) {
            String str;
            AbstractC18253g abstractC18253g;
            int i11;
            Intrinsics.j(AdsBox, "$this$AdsBox");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-764356451, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FeatureFlagListItem.<anonymous> (FeatureFlagListItem.kt:53)");
            }
            LocalThemeScope localThemeScope = this.f112275a;
            AbstractC18227f abstractC18227f = this.f112276b;
            AbstractC18253g abstractC18253g2 = this.f112277c;
            boolean z10 = this.f112278d;
            Function2<AbstractC18253g, AbstractC18253g, Unit> function2 = this.f112279e;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            String title = abstractC18227f.getTitle();
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, title, null, composer, i12 | (i13 << 3), 4);
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            C17738x.a(null, ComposableLambdaKt.c(288838198, true, new a(localThemeScope, abstractC18227f), composer, 54), composer, 48, 1);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            AbstractC18227f prerequisite = abstractC18227f.getPrerequisite();
            String shortName = prerequisite != null ? prerequisite.getShortName() : null;
            composer.startReplaceGroup(-761649835);
            if (shortName == null) {
                str = null;
                abstractC18253g = abstractC18253g2;
                i11 = 6;
            } else {
                str = null;
                abstractC18253g = abstractC18253g2;
                i11 = 6;
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), shortName, null, composer, (i13 << 3) | i12, 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            }
            composer.P();
            C12522t.h(localThemeScope, abstractC18227f, abstractC18253g, z10, null, function2, composer, i12, 8);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, i11);
            String description = abstractC18227f.getDescription();
            String str2 = (description == null || StringsKt.r0(description)) ? str : description;
            composer.startReplaceGroup(-761631174);
            if (str2 != null) {
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), str2, null, composer, i12 | (i13 << 3), 4);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            a(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c */
    static final class c implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC18253g f112283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<AbstractC18253g, AbstractC18253g, Unit> f112284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f112285d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC18227f f112286e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112287a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18253g f112288b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14905H f112289c;

            a(LocalThemeScope localThemeScope, AbstractC18253g abstractC18253g, InterfaceC14905H interfaceC14905H) {
                this.f112287a = localThemeScope;
                this.f112288b = abstractC18253g;
                this.f112289c = interfaceC14905H;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1159409422, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FlagStateButtons.<anonymous>.<anonymous>.<anonymous> (FeatureFlagListItem.kt:141)");
                }
                ri.j.h(this.f112287a, Intrinsics.e(this.f112288b, AbstractC18253g.a.f170618b) ? this.f112289c.getLabels().getEnabledSelectedLabel() : this.f112289c.getLabels().getEnabledRestingLabel(), "OFF", null, composer, LocalThemeScope.f15770g | 384 | (q1.Label.f140080j << 3), 4);
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
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c$b */
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112290a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18253g f112291b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14905H f112292c;

            b(LocalThemeScope localThemeScope, AbstractC18253g abstractC18253g, InterfaceC14905H interfaceC14905H) {
                this.f112290a = localThemeScope;
                this.f112291b = abstractC18253g;
                this.f112292c = interfaceC14905H;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1407316997, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FlagStateButtons.<anonymous>.<anonymous>.<anonymous> (FeatureFlagListItem.kt:151)");
                }
                ri.j.h(this.f112290a, Intrinsics.e(this.f112291b, AbstractC18253g.b.f170619b) ? this.f112292c.getLabels().getEnabledSelectedLabel() : this.f112292c.getLabels().getEnabledRestingLabel(), "ON", null, composer, LocalThemeScope.f15770g | 384 | (q1.Label.f140080j << 3), 4);
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
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c$c, reason: collision with other inner class name */
        static final class C1780c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f112293a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112294b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC18253g f112295c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC14905H f112296d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC18227f f112297e;

            C1780c(boolean z10, LocalThemeScope localThemeScope, AbstractC18253g abstractC18253g, InterfaceC14905H interfaceC14905H, AbstractC18227f abstractC18227f) {
                this.f112293a = z10;
                this.f112294b = localThemeScope;
                this.f112295c = abstractC18253g;
                this.f112296d = interfaceC14905H;
                this.f112297e = abstractC18227f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(boolean z10, X0.f Canvas) {
                Intrinsics.j(Canvas, "$this$Canvas");
                X0.f.f1(Canvas, z10 ? C5346q0.INSTANCE.e() : C5346q0.INSTANCE.h(), 0.0f, 0L, 0.0f, null, null, 0, 126, null);
                return Unit.f142422a;
            }

            public final void b(InterfaceC14800I AdsButton, Composer composer, int i10) {
                String string;
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1058443962, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FlagStateButtons.<anonymous>.<anonymous>.<anonymous> (FeatureFlagListItem.kt:161)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierV = androidx.compose.foundation.layout.J.v(companion, H1.h.p(15));
                composer.startReplaceGroup(5004770);
                boolean zA = composer.a(this.f112293a);
                final boolean z10 = this.f112293a;
                Object objB = composer.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C12522t.c.C1780c.c(z10, (X0.f) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13443j.a(modifierV, (Function1) objB, composer, 6);
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
                LocalThemeScope localThemeScope = this.f112294b;
                q1.Label enabledSelectedLabel = Intrinsics.e(this.f112295c, AbstractC18253g.c.f170620b) ? this.f112296d.getLabels().getEnabledSelectedLabel() : this.f112296d.getLabels().getEnabledRestingLabel();
                if (this.f112297e.getRemoteId() == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DEFAULT (");
                    sb2.append(this.f112297e.getDefault() ? "ON" : "OFF");
                    sb2.append(')');
                    string = sb2.toString();
                } else {
                    string = "REMOTE";
                }
                ri.j.h(localThemeScope, enabledSelectedLabel, string, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                b(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, AbstractC18253g abstractC18253g, Function2<? super AbstractC18253g, ? super AbstractC18253g, Unit> function2, boolean z10, AbstractC18227f abstractC18227f) {
            this.f112282a = localThemeScope;
            this.f112283b = abstractC18253g;
            this.f112284c = function2;
            this.f112285d = z10;
            this.f112286e = abstractC18227f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function2 function2, AbstractC18253g abstractC18253g) {
            function2.invoke(abstractC18253g, AbstractC18253g.a.f170618b);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function2 function2, AbstractC18253g abstractC18253g) {
            function2.invoke(abstractC18253g, AbstractC18253g.b.f170619b);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function2 function2, AbstractC18253g abstractC18253g) {
            function2.invoke(abstractC18253g, AbstractC18253g.c.f170620b);
            return Unit.f142422a;
        }

        public final void d(InterfaceC14905H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1009792993, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FlagStateButtons.<anonymous>.<anonymous> (FeatureFlagListItem.kt:137)");
            }
            LocalThemeScope localThemeScope = this.f112282a;
            q1.d.ChipButton enabledSelected = Intrinsics.e(this.f112283b, AbstractC18253g.a.f170618b) ? Assemble.getButtons().getEnabledSelected() : Assemble.getButtons().getEnabledResting();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f112284c) | composer.D(this.f112283b);
            final Function2<AbstractC18253g, AbstractC18253g, Unit> function2 = this.f112284c;
            final AbstractC18253g abstractC18253g = this.f112283b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12522t.c.e(function2, abstractC18253g);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1159409422, true, new a(this.f112282a, this.f112283b, Assemble), composer, 54);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.d.ChipButton.f139940k;
            E0.b(localThemeScope, enabledSelected, (Function0) objB, composableLambdaC, composer, i11 | 3072 | (i12 << 3));
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            LocalThemeScope localThemeScope2 = this.f112282a;
            q1.d.ChipButton enabledSelected2 = Intrinsics.e(this.f112283b, AbstractC18253g.b.f170619b) ? Assemble.getButtons().getEnabledSelected() : Assemble.getButtons().getEnabledResting();
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f112284c) | composer.D(this.f112283b);
            final Function2<AbstractC18253g, AbstractC18253g, Unit> function22 = this.f112284c;
            final AbstractC18253g abstractC18253g2 = this.f112283b;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12522t.c.f(function22, abstractC18253g2);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            E0.b(localThemeScope2, enabledSelected2, (Function0) objB2, ComposableLambdaKt.c(1407316997, true, new b(this.f112282a, this.f112283b, Assemble), composer, 54), composer, (i12 << 3) | i11 | 3072);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            LocalThemeScope localThemeScope3 = this.f112282a;
            q1.d.ChipButton enabledSelected3 = Intrinsics.e(this.f112283b, AbstractC18253g.c.f170620b) ? Assemble.getButtons().getEnabledSelected() : Assemble.getButtons().getEnabledResting();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(this.f112284c) | composer.D(this.f112283b);
            final Function2<AbstractC18253g, AbstractC18253g, Unit> function23 = this.f112284c;
            final AbstractC18253g abstractC18253g3 = this.f112283b;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12522t.c.g(function23, abstractC18253g3);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            E0.b(localThemeScope3, enabledSelected3, (Function0) objB3, ComposableLambdaKt.c(-1058443962, true, new C1780c(this.f112285d, this.f112282a, this.f112283b, Assemble, this.f112286e), composer, 54), composer, i11 | 3072 | (i12 << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
            d(interfaceC14905H, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, final Function0<Unit> onClick, final String text, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(750799725);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(text) ? 256 : 128;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(750799725, i12, -1, "com.meijer.mobile.meijer.activity.settings.debug.BulkToggleButton (FeatureFlagListItem.kt:97)");
            }
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.C2218a.f140286a, ComposableLambdaKt.c(-1438320040, true, new a(modifier, localThemeScope, onClick, text), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.C2218a.f140287b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.debug.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12522t.e(localThemeScope, onClick, text, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Function0 function0, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, function0, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r19, final yl.AbstractC18227f r20, final yl.AbstractC18253g r21, final boolean r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function2<? super yl.AbstractC18253g, ? super yl.AbstractC18253g, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12522t.f(Ji.M, yl.f, yl.g, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, AbstractC18227f abstractC18227f, AbstractC18253g abstractC18253g, boolean z10, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, abstractC18227f, abstractC18253g, z10, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r16, final yl.AbstractC18227f r17, final yl.AbstractC18253g r18, final boolean r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function2<? super yl.AbstractC18253g, ? super yl.AbstractC18253g, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12522t.h(Ji.M, yl.f, yl.g, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, AbstractC18227f abstractC18227f, AbstractC18253g abstractC18253g, boolean z10, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, abstractC18227f, abstractC18253g, z10, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
