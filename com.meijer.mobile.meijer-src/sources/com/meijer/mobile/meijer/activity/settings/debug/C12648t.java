package com.meijer.mobile.meijer.activity.settings.debug;

import Ki.LocalThemeScope;
import V0.C5489q0;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.settings.debug.C12648t;
import d0.C13576j;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14898b;
import ki.InterfaceC15139H;
import ki.InterfaceC15205y;
import ki.q1;
import kotlin.C17808x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oi.E0;
import zl.AbstractC18503f;
import zl.AbstractC18529g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001am\u0010\u0010\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u000726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001am\u0010\u0018\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u000726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0001¢\u0006\u0004\b\u0018\u0010\u0011¨\u0006\u0019²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lzl/f;", "feature", "Lzl/g;", "flagState", "", "isEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "before", "after", "", "onCheckedChanged", "f", "(LKi/M;Lzl/f;Lzl/g;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "", "text", "d", "(LKi/M;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "h", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ComposableStringLiteral"})
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12648t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$a */
    static final class a implements Function3<InterfaceC15139H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f113120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113121b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113122c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f113123d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$a$a, reason: collision with other inner class name */
        static final class C1787a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113124a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15139H f113125b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f113126c;

            C1787a(LocalThemeScope localThemeScope, InterfaceC15139H interfaceC15139H, String str) {
                this.f113124a = localThemeScope;
                this.f113125b = interfaceC15139H;
                this.f113126c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(41497163, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.BulkToggleButton.<anonymous>.<anonymous> (FeatureFlagListItem.kt:105)");
                }
                si.j.h(this.f113124a, this.f113125b.getLabels().getEnabledRestingLabel(), this.f113126c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        a(Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f113120a = modifier;
            this.f113121b = localThemeScope;
            this.f113122c = function0;
            this.f113123d = str;
        }

        public final void a(InterfaceC15139H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1438320040, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.BulkToggleButton.<anonymous> (FeatureFlagListItem.kt:99)");
            }
            q1.d.ChipButton chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, null, null, null, Assemble.getButtons().getEnabledResting().getModifier().then(this.f113120a), false, null, 895, null);
            LocalThemeScope localThemeScope = this.f113121b;
            E0.b(localThemeScope, chipButtonY, this.f113122c, ComposableLambdaKt.c(41497163, true, new C1787a(localThemeScope, Assemble, this.f113123d), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.ChipButton.f142195k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15139H interfaceC15139H, Composer composer, Integer num) {
            a(interfaceC15139H, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$b */
    static final class b implements Function3<InterfaceC14898b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113127a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC18503f f113128b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC18529g f113129c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f113130d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<AbstractC18529g, AbstractC18529g, Unit> f113131e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113132a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18503f f113133b;

            a(LocalThemeScope localThemeScope, AbstractC18503f abstractC18503f) {
                this.f113132a = localThemeScope;
                this.f113133b = abstractC18503f;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(288838198, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FeatureFlagListItem.<anonymous>.<anonymous>.<anonymous> (FeatureFlagListItem.kt:60)");
                }
                si.j.h(this.f113132a, new q1.Label(null, null, null, null, 0, false, 0, this.f113132a.getAdsTypography().getDetail().getOne(), null, 383, null), this.f113133b.getShortName() + "(remoteId: " + this.f113133b.getRemoteId() + ')', null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, AbstractC18503f abstractC18503f, AbstractC18529g abstractC18529g, boolean z10, Function2<? super AbstractC18529g, ? super AbstractC18529g, Unit> function2) {
            this.f113127a = localThemeScope;
            this.f113128b = abstractC18503f;
            this.f113129c = abstractC18529g;
            this.f113130d = z10;
            this.f113131e = function2;
        }

        public final void a(InterfaceC14898b AdsBox, Composer composer, int i10) {
            String str;
            AbstractC18529g abstractC18529g;
            int i11;
            Intrinsics.j(AdsBox, "$this$AdsBox");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-764356451, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FeatureFlagListItem.<anonymous> (FeatureFlagListItem.kt:53)");
            }
            LocalThemeScope localThemeScope = this.f113127a;
            AbstractC18503f abstractC18503f = this.f113128b;
            AbstractC18529g abstractC18529g2 = this.f113129c;
            boolean z10 = this.f113130d;
            Function2<AbstractC18529g, AbstractC18529g, Unit> function2 = this.f113131e;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            String title = abstractC18503f.getTitle();
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, title, null, composer, i12 | (i13 << 3), 4);
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            C17808x.a(null, ComposableLambdaKt.c(288838198, true, new a(localThemeScope, abstractC18503f), composer, 54), composer, 48, 1);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            AbstractC18503f prerequisite = abstractC18503f.getPrerequisite();
            String shortName = prerequisite != null ? prerequisite.getShortName() : null;
            composer.startReplaceGroup(-761649835);
            if (shortName == null) {
                str = null;
                abstractC18529g = abstractC18529g2;
                i11 = 6;
            } else {
                str = null;
                abstractC18529g = abstractC18529g2;
                i11 = 6;
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), shortName, null, composer, (i13 << 3) | i12, 4);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            }
            composer.P();
            C12648t.h(localThemeScope, abstractC18503f, abstractC18529g, z10, null, function2, composer, i12, 8);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, i11);
            String description = abstractC18503f.getDescription();
            String str2 = (description == null || StringsKt.s0(description)) ? str : description;
            composer.startReplaceGroup(-761631174);
            if (str2 != null) {
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), str2, null, composer, i12 | (i13 << 3), 4);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14898b interfaceC14898b, Composer composer, Integer num) {
            a(interfaceC14898b, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c */
    static final class c implements Function3<InterfaceC15139H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113134a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC18529g f113135b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<AbstractC18529g, AbstractC18529g, Unit> f113136c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f113137d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC18503f f113138e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113139a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18529g f113140b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15139H f113141c;

            a(LocalThemeScope localThemeScope, AbstractC18529g abstractC18529g, InterfaceC15139H interfaceC15139H) {
                this.f113139a = localThemeScope;
                this.f113140b = abstractC18529g;
                this.f113141c = interfaceC15139H;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1159409422, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FlagStateButtons.<anonymous>.<anonymous>.<anonymous> (FeatureFlagListItem.kt:141)");
                }
                si.j.h(this.f113139a, Intrinsics.e(this.f113140b, AbstractC18529g.a.f172918b) ? this.f113141c.getLabels().getEnabledSelectedLabel() : this.f113141c.getLabels().getEnabledRestingLabel(), "OFF", null, composer, LocalThemeScope.f17314g | 384 | (q1.Label.f142335j << 3), 4);
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
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c$b */
        static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113142a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18529g f113143b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15139H f113144c;

            b(LocalThemeScope localThemeScope, AbstractC18529g abstractC18529g, InterfaceC15139H interfaceC15139H) {
                this.f113142a = localThemeScope;
                this.f113143b = abstractC18529g;
                this.f113144c = interfaceC15139H;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1407316997, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FlagStateButtons.<anonymous>.<anonymous>.<anonymous> (FeatureFlagListItem.kt:151)");
                }
                si.j.h(this.f113142a, Intrinsics.e(this.f113143b, AbstractC18529g.b.f172919b) ? this.f113144c.getLabels().getEnabledSelectedLabel() : this.f113144c.getLabels().getEnabledRestingLabel(), "ON", null, composer, LocalThemeScope.f17314g | 384 | (q1.Label.f142335j << 3), 4);
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
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.t$c$c, reason: collision with other inner class name */
        static final class C1788c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f113145a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113146b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC18529g f113147c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15139H f113148d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC18503f f113149e;

            C1788c(boolean z10, LocalThemeScope localThemeScope, AbstractC18529g abstractC18529g, InterfaceC15139H interfaceC15139H, AbstractC18503f abstractC18503f) {
                this.f113145a = z10;
                this.f113146b = localThemeScope;
                this.f113147c = abstractC18529g;
                this.f113148d = interfaceC15139H;
                this.f113149e = abstractC18503f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(boolean z10, X0.f Canvas) {
                Intrinsics.j(Canvas, "$this$Canvas");
                X0.f.f1(Canvas, z10 ? C5489q0.INSTANCE.e() : C5489q0.INSTANCE.h(), 0.0f, 0L, 0.0f, null, null, 0, 126, null);
                return Unit.f143329a;
            }

            public final void b(InterfaceC14888I AdsButton, Composer composer, int i10) {
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
                boolean zA = composer.a(this.f113145a);
                final boolean z10 = this.f113145a;
                Object objB = composer.B();
                if (zA || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C12648t.c.C1788c.c(z10, (X0.f) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13576j.a(modifierV, (Function1) objB, composer, 6);
                C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
                LocalThemeScope localThemeScope = this.f113146b;
                q1.Label enabledSelectedLabel = Intrinsics.e(this.f113147c, AbstractC18529g.c.f172920b) ? this.f113148d.getLabels().getEnabledSelectedLabel() : this.f113148d.getLabels().getEnabledRestingLabel();
                if (this.f113149e.getRemoteId() == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DEFAULT (");
                    sb2.append(this.f113149e.getDefault() ? "ON" : "OFF");
                    sb2.append(')');
                    string = sb2.toString();
                } else {
                    string = "REMOTE";
                }
                si.j.h(localThemeScope, enabledSelectedLabel, string, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                b(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, AbstractC18529g abstractC18529g, Function2<? super AbstractC18529g, ? super AbstractC18529g, Unit> function2, boolean z10, AbstractC18503f abstractC18503f) {
            this.f113134a = localThemeScope;
            this.f113135b = abstractC18529g;
            this.f113136c = function2;
            this.f113137d = z10;
            this.f113138e = abstractC18503f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function2 function2, AbstractC18529g abstractC18529g) {
            function2.invoke(abstractC18529g, AbstractC18529g.a.f172918b);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function2 function2, AbstractC18529g abstractC18529g) {
            function2.invoke(abstractC18529g, AbstractC18529g.b.f172919b);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function2 function2, AbstractC18529g abstractC18529g) {
            function2.invoke(abstractC18529g, AbstractC18529g.c.f172920b);
            return Unit.f143329a;
        }

        public final void d(InterfaceC15139H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1009792993, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.FlagStateButtons.<anonymous>.<anonymous> (FeatureFlagListItem.kt:137)");
            }
            LocalThemeScope localThemeScope = this.f113134a;
            q1.d.ChipButton enabledSelected = Intrinsics.e(this.f113135b, AbstractC18529g.a.f172918b) ? Assemble.getButtons().getEnabledSelected() : Assemble.getButtons().getEnabledResting();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f113136c) | composer.D(this.f113135b);
            final Function2<AbstractC18529g, AbstractC18529g, Unit> function2 = this.f113136c;
            final AbstractC18529g abstractC18529g = this.f113135b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12648t.c.e(function2, abstractC18529g);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1159409422, true, new a(this.f113134a, this.f113135b, Assemble), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.d.ChipButton.f142195k;
            E0.b(localThemeScope, enabledSelected, (Function0) objB, composableLambdaC, composer, i11 | 3072 | (i12 << 3));
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            LocalThemeScope localThemeScope2 = this.f113134a;
            q1.d.ChipButton enabledSelected2 = Intrinsics.e(this.f113135b, AbstractC18529g.b.f172919b) ? Assemble.getButtons().getEnabledSelected() : Assemble.getButtons().getEnabledResting();
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f113136c) | composer.D(this.f113135b);
            final Function2<AbstractC18529g, AbstractC18529g, Unit> function22 = this.f113136c;
            final AbstractC18529g abstractC18529g2 = this.f113135b;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12648t.c.f(function22, abstractC18529g2);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            E0.b(localThemeScope2, enabledSelected2, (Function0) objB2, ComposableLambdaKt.c(1407316997, true, new b(this.f113134a, this.f113135b, Assemble), composer, 54), composer, (i12 << 3) | i11 | 3072);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            LocalThemeScope localThemeScope3 = this.f113134a;
            q1.d.ChipButton enabledSelected3 = Intrinsics.e(this.f113135b, AbstractC18529g.c.f172920b) ? Assemble.getButtons().getEnabledSelected() : Assemble.getButtons().getEnabledResting();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(this.f113136c) | composer.D(this.f113135b);
            final Function2<AbstractC18529g, AbstractC18529g, Unit> function23 = this.f113136c;
            final AbstractC18529g abstractC18529g3 = this.f113135b;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12648t.c.g(function23, abstractC18529g3);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            E0.b(localThemeScope3, enabledSelected3, (Function0) objB3, ComposableLambdaKt.c(-1058443962, true, new C1788c(this.f113137d, this.f113134a, this.f113135b, Assemble, this.f113138e), composer, 54), composer, i11 | 3072 | (i12 << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15139H interfaceC15139H, Composer composer, Integer num) {
            d(interfaceC15139H, composer, num.intValue());
            return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.C2257a.f142541a, ComposableLambdaKt.c(-1438320040, true, new a(modifier, localThemeScope, onClick, text), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.C2257a.f142542b << 3));
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
                    return C12648t.e(localThemeScope, onClick, text, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Function0 function0, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, function0, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void f(final Ki.LocalThemeScope r19, final zl.AbstractC18503f r20, final zl.AbstractC18529g r21, final boolean r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function2<? super zl.AbstractC18529g, ? super zl.AbstractC18529g, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12648t.f(Ki.M, zl.f, zl.g, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, AbstractC18503f abstractC18503f, AbstractC18529g abstractC18529g, boolean z10, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, abstractC18503f, abstractC18529g, z10, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void h(final Ki.LocalThemeScope r16, final zl.AbstractC18503f r17, final zl.AbstractC18529g r18, final boolean r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function2<? super zl.AbstractC18529g, ? super zl.AbstractC18529g, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12648t.h(Ki.M, zl.f, zl.g, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, AbstractC18503f abstractC18503f, AbstractC18529g abstractC18529g, boolean z10, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, abstractC18503f, abstractC18529g, z10, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
