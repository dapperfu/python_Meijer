package oi;

import B0.RippleAlpha;
import Ki.LocalThemeScope;
import Ki.T;
import P0.e;
import V0.C5489q0;
import V0.C5492s0;
import android.annotation.SuppressLint;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.BorderStroke;
import d0.C13572f;
import d0.C13575i;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import kotlin.C17942E;
import kotlin.C17943E0;
import kotlin.C17960N;
import kotlin.C17982Y0;
import kotlin.C18016k0;
import kotlin.C18045v;
import kotlin.C4107g;
import kotlin.InterfaceC18013j0;
import kotlin.InterfaceC18047w;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.RippleConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.P0;
import oi.s1;
import oi.v1;
import oi.w1;
import r0.C16806i;
import r1.C16819m;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0004\b\"\u0010#\u001a#\u0010&\u001a\u00020%*\u00020\u00132\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\u00020+*\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b,\u0010-\u001aa\u00108\u001a\u00020/*\u00020\u00132\u0006\u0010\b\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u0002062\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b8\u00109\u001ac\u0010=\u001a\u00020/*\u00020\u00132\u0006\u0010\b\u001a\u00020:2\u0006\u0010;\u001a\u0002032\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\b\b\u0002\u00105\u001a\u00020\u00172\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010<\u001a\u0002062\b\b\u0002\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010\u0003\u001a\u000206H\u0007¢\u0006\u0004\b=\u0010>\u001au\u0010@\u001a\u00020/*\u00020\u00132\u0006\u0010\b\u001a\u00020?2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\u0006\u00102\u001a\u0002012\u0006\u0010;\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00172\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010<\u001a\u0002062\b\b\u0002\u0010\u0003\u001a\u0002062\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b@\u0010A\u001au\u0010C\u001a\u00020/*\u00020\u00132\u0006\u0010\b\u001a\u00020B2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\u0006\u00102\u001a\u0002012\u0006\u0010;\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00172\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010\u0003\u001a\u0002062\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010<\u001a\u000206H\u0007¢\u0006\u0004\bC\u0010D\u001a+\u0010F\u001a\u00020E*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001eH\u0000¢\u0006\u0004\bF\u0010G\u001a#\u0010I\u001a\u00020H*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0004\bI\u0010J\u001a#\u0010L\u001a\u00020K*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0004\bL\u0010M\u001a5\u0010O\u001a\u00020/2\u0006\u0010N\u001a\u00020H2\u0006\u00102\u001a\u0002012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00107\u001a\u000206H\u0001¢\u0006\u0004\bO\u0010P\u001a\u001f\u0010R\u001a\u00020/2\u0006\u0010Q\u001a\u00020K2\u0006\u0010;\u001a\u000203H\u0001¢\u0006\u0004\bR\u0010S\u001a5\u0010X\u001a\u00020\u0017*\u00020\u00172\u0006\u0010T\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010U\u001a\u0004\u0018\u00010\r2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010Y\u001a)\u0010^\u001a\u00020\u001e2\u0006\u0010Z\u001a\u00020\u001e2\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010]\u001a\u00020VH\u0003¢\u0006\u0004\b^\u0010_\u001aj\u0010g\u001a\u00020/2\u0006\u0010`\u001a\u00020E2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\u0006\u0010\u0003\u001a\u0002062\u0006\u0010b\u001a\u00020a2\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00172\b\b\u0002\u0010<\u001a\u0002062\u0017\u0010f\u001a\u0013\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020/0c¢\u0006\u0002\beH\u0001¢\u0006\u0004\bg\u0010h¨\u0006i"}, d2 = {"Loi/v1;", "themeCondition", "Loi/s1;", "enabled", "Loi/w1;", "A", "(Loi/v1;Loi/s1;)Loi/w1;", "Loi/C0;", "buttonFamily", "LV0/D1;", "H", "(Loi/C0;)LV0/D1;", "conditionSet", "Ld0/h;", "B", "(Loi/C0;Loi/w1;)Ld0/h;", "Loi/a;", "C", "(Loi/C0;Loi/w1;)Loi/a;", "LKi/M;", "Lj0/C;", "D", "(LKi/M;Loi/C0;)Lj0/C;", "Landroidx/compose/ui/Modifier;", "F", "(Loi/C0;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Lx0/w;", "E", "(Loi/C0;)Lkotlin/jvm/functions/Function2;", "LV0/q0;", "backgroundColor", "conditions", "Lx0/W0;", "G", "(JLoi/w1;)Lx0/W0;", "parentBackgroundColor", "Loi/H0;", "I", "(LKi/M;JLoi/C0;)Loi/H0;", "Loi/J1;", "J", "(Loi/C0;)Loi/J1;", "Loi/M1;", "K", "(LKi/M;Loi/C0;)Loi/M1;", "Loi/V;", "", "onClick", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "", "contentDescription", "modifier", "", "disableIconTint", "i", "(LKi/M;Loi/V;Lkotlin/jvm/functions/Function0;LKi/C;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZJLandroidx/compose/runtime/Composer;II)V", "Loi/B0;", "text", "fillMaxWidth", "k", "(LKi/M;Loi/B0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZJZLandroidx/compose/runtime/Composer;II)V", "Loi/y;", "h", "(LKi/M;Loi/y;Lkotlin/jvm/functions/Function0;LKi/C;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZJLandroidx/compose/runtime/Composer;III)V", "Loi/l0;", "j", "(LKi/M;Loi/l0;Lkotlin/jvm/functions/Function0;LKi/C;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZJZLandroidx/compose/runtime/Composer;III)V", "Loi/G0;", "x", "(LKi/M;Loi/C0;Loi/w1;J)Loi/G0;", "Loi/I1;", "y", "(LKi/M;Loi/C0;Loi/w1;)Loi/I1;", "Loi/L1;", "z", "(LKi/M;Loi/C0;Loi/w1;)Loi/L1;", "iconTemplate", "r", "(Loi/I1;LKi/C;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "textTemplate", "t", "(Loi/L1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "shape", "border", "LH1/h;", "elevation", "L", "(Landroidx/compose/ui/Modifier;LV0/D1;JLd0/h;F)Landroidx/compose/ui/Modifier;", "color", "Lx0/j0;", "elevationOverlay", "absoluteElevation", "M", "(JLx0/j0;FLandroidx/compose/runtime/Composer;I)J", "conditioned", "Lh0/l;", "interactionSource", "Lkotlin/Function1;", "Lj0/I;", "Lkotlin/ExtensionFunctionType;", "content", "l", "(Loi/G0;Lkotlin/jvm/functions/Function0;ZLh0/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class P0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IconTemplate f154016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ki.C f154017b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f154018c;

        a(IconTemplate iconTemplate, Ki.C c10, boolean z10) {
            this.f154016a = iconTemplate;
            this.f154017b = c10;
            this.f154018c = z10;
        }

        public final void a(InterfaceC14888I AcresButtonInternal, Composer composer, int i10) {
            Intrinsics.j(AcresButtonInternal, "$this$AcresButtonInternal");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1378661992, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButton.<anonymous> (Buttons.kt:1869)");
            }
            P0.r(this.f154016a, this.f154017b, null, this.f154018c, composer, 0, 4);
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
    static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextTemplate f154019a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f154020b;

        b(TextTemplate textTemplate, String str) {
            this.f154019a = textTemplate;
            this.f154020b = str;
        }

        public final void a(InterfaceC14888I AcresButtonInternal, Composer composer, int i10) {
            Intrinsics.j(AcresButtonInternal, "$this$AcresButtonInternal");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(791326724, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButton.<anonymous> (Buttons.kt:1973)");
            }
            P0.t(this.f154019a, this.f154020b, composer, 0);
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
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IconTemplate f154021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ki.C f154022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f154023c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154024d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextTemplate f154025e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f154026f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ IconTemplate f154027a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ki.C f154028b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f154029c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154030d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ TextTemplate f154031e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f154032f;

            a(IconTemplate iconTemplate, Ki.C c10, boolean z10, LocalThemeScope localThemeScope, TextTemplate textTemplate, String str) {
                this.f154027a = iconTemplate;
                this.f154028b = c10;
                this.f154029c = z10;
                this.f154030d = localThemeScope;
                this.f154031e = textTemplate;
                this.f154032f = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1858598560, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButton.<anonymous>.<anonymous> (Buttons.kt:2092)");
                }
                P0.r(this.f154027a, this.f154028b, null, this.f154029c, composer, 0, 4);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, this.f154030d.getAdsSpacing().getThree().getDp()), composer, 0);
                P0.t(this.f154031e, this.f154032f, composer, 0);
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

        c(IconTemplate iconTemplate, Ki.C c10, boolean z10, LocalThemeScope localThemeScope, TextTemplate textTemplate, String str) {
            this.f154021a = iconTemplate;
            this.f154022b = c10;
            this.f154023c = z10;
            this.f154024d = localThemeScope;
            this.f154025e = textTemplate;
            this.f154026f = str;
        }

        public final void a(InterfaceC14888I AcresButtonInternal, Composer composer, int i10) {
            Intrinsics.j(AcresButtonInternal, "$this$AcresButtonInternal");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-330254267, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButton.<anonymous> (Buttons.kt:2091)");
            }
            C4107g.k(0.0f, ComposableLambdaKt.c(1858598560, true, new a(this.f154021a, this.f154022b, this.f154023c, this.f154024d, this.f154025e, this.f154026f), composer, 54), composer, 48, 1);
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
    static final class d implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextTemplate f154033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f154034b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154035c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ IconTemplate f154036d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ki.C f154037e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f154038f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextTemplate f154039a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f154040b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154041c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ IconTemplate f154042d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ki.C f154043e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f154044f;

            a(TextTemplate textTemplate, String str, LocalThemeScope localThemeScope, IconTemplate iconTemplate, Ki.C c10, boolean z10) {
                this.f154039a = textTemplate;
                this.f154040b = str;
                this.f154041c = localThemeScope;
                this.f154042d = iconTemplate;
                this.f154043e = c10;
                this.f154044f = z10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(819706272, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButton.<anonymous>.<anonymous> (Buttons.kt:2218)");
                }
                P0.t(this.f154039a, this.f154040b, composer, 0);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, this.f154041c.getAdsSpacing().getThree().getDp()), composer, 0);
                P0.r(this.f154042d, this.f154043e, null, this.f154044f, composer, 0, 4);
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

        d(TextTemplate textTemplate, String str, LocalThemeScope localThemeScope, IconTemplate iconTemplate, Ki.C c10, boolean z10) {
            this.f154033a = textTemplate;
            this.f154034b = str;
            this.f154035c = localThemeScope;
            this.f154036d = iconTemplate;
            this.f154037e = c10;
            this.f154038f = z10;
        }

        public final void a(InterfaceC14888I AcresButtonInternal, Composer composer, int i10) {
            Intrinsics.j(AcresButtonInternal, "$this$AcresButtonInternal");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1369146555, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButton.<anonymous> (Buttons.kt:2217)");
            }
            C4107g.k(0.0f, ComposableLambdaKt.c(819706272, true, new a(this.f154033a, this.f154034b, this.f154035c, this.f154036d, this.f154037e, this.f154038f), composer, 54), composer, 48, 1);
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
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ButtonTemplate f154045a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f154046b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.l f154047c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f154048d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f154049e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f154050f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f154051g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f154052h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f154053a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ButtonTemplate f154054b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f154055c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f154056d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ h0.l f154057e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Modifier f154058f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f154059g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f154060h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14888I, Composer, Integer, Unit> f154061i;

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, ButtonTemplate buttonTemplate, float f10, boolean z11, h0.l lVar, Modifier modifier, Function0<Unit> function0, String str, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3) {
                this.f154053a = z10;
                this.f154054b = buttonTemplate;
                this.f154055c = f10;
                this.f154056d = z11;
                this.f154057e = lVar;
                this.f154058f = modifier;
                this.f154059g = function0;
                this.f154060h = str;
                this.f154061i = function3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, r1.u clearAndSetSemantics) {
                Intrinsics.j(clearAndSetSemantics, "$this$clearAndSetSemantics");
                r1.s.g0(clearAndSetSemantics, str);
                r1.s.s0(clearAndSetSemantics, Role.INSTANCE.a());
                return Unit.f143329a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2128560698, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButtonInternal.<anonymous>.<anonymous> (Buttons.kt:2403)");
                }
                Modifier modifierH = this.f154053a ? androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE;
                Modifier.Companion companion = Modifier.INSTANCE;
                V0.D1 d1Invoke = this.f154054b.g().invoke(composer, 0);
                long jM = P0.M(this.f154054b.getColors().getBackgroundColor(), (InterfaceC18013j0) composer.o(C18016k0.d()), this.f154055c, composer, 0);
                BorderStroke border = this.f154054b.getBorder();
                InterfaceC18047w interfaceC18047wInvoke = this.f154054b.d().invoke(composer, 0);
                composer.startReplaceGroup(1142420575);
                androidx.compose.runtime.z1<H1.h> z1VarA = interfaceC18047wInvoke != null ? interfaceC18047wInvoke.a(this.f154056d, this.f154057e, composer, 0) : null;
                composer.P();
                Modifier modifierC = ClickableKt.c(P0.L(companion, d1Invoke, jM, border, z1VarA != null ? z1VarA.getValue().getValue() : H1.h.p(0)).then(this.f154058f).then(modifierH).then(this.f154054b.getModifier()), this.f154057e, C17982Y0.f(false, 0.0f, 0L, 7, null), this.f154056d, null, Role.j(Role.INSTANCE.a()), this.f154059g, 8, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f154060h);
                final String str = this.f154060h;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: oi.Q0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return P0.e.a.c(str, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierA = C16819m.a(modifierC, (Function1) objB);
                ButtonTemplate buttonTemplate = this.f154054b;
                Function3<InterfaceC14888I, Composer, Integer, Unit> function3 = this.f154061i;
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), true);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C5806j c5806j = C5806j.f48836a;
                Modifier modifierH2 = androidx.compose.foundation.layout.D.h(companion, buttonTemplate.getContentPadding());
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.b(), companion2.i(), composer, 54);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH2);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                function3.invoke(C14889J.f139620a, composer, 6);
                composer.v();
                composer.v();
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

        /* JADX WARN: Multi-variable type inference failed */
        e(ButtonTemplate buttonTemplate, boolean z10, h0.l lVar, boolean z11, Modifier modifier, Function0<Unit> function0, String str, Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3) {
            this.f154045a = buttonTemplate;
            this.f154046b = z10;
            this.f154047c = lVar;
            this.f154048d = z11;
            this.f154049e = modifier;
            this.f154050f = function0;
            this.f154051g = str;
            this.f154052h = function3;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-215249158, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresButtonInternal.<anonymous> (Buttons.kt:2394)");
            }
            InterfaceC18047w interfaceC18047wInvoke = this.f154045a.d().invoke(composer, 0);
            composer.startReplaceGroup(-696008705);
            androidx.compose.runtime.z1<H1.h> z1VarA = interfaceC18047wInvoke == null ? null : interfaceC18047wInvoke.a(this.f154046b, this.f154047c, composer, 0);
            composer.P();
            float fP = H1.h.p(((H1.h) composer.o(C18016k0.c())).getValue() + (z1VarA != null ? z1VarA.getValue().getValue() : H1.h.p(0)));
            androidx.compose.runtime.r.b(new androidx.compose.runtime.G0[]{C17960N.a().d(C5489q0.m(C17942E.b(this.f154045a.getColors().getBackgroundColor(), composer, 0))), C18016k0.c().d(H1.h.l(fP))}, ComposableLambdaKt.c(2128560698, true, new a(this.f154048d, this.f154045a, fP, this.f154046b, this.f154047c, this.f154049e, this.f154050f, this.f154051g, this.f154052h), composer, 54), composer, androidx.compose.runtime.G0.f50200i | 48);
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
    static final class g implements Function2<Composer, Integer, InterfaceC18047w> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f154062a = new g();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ InterfaceC18047w invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }

        g() {
        }

        public final InterfaceC18047w a(Composer composer, int i10) {
            composer.startReplaceGroup(-340495682);
            if (ComposerKt.M()) {
                ComposerKt.U(-340495682, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.getElevation.<anonymous> (Buttons.kt:964)");
            }
            float f10 = 0;
            InterfaceC18047w interfaceC18047wB = C18045v.f169801a.b(H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), composer, (C18045v.f169812l << 15) | 28086, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC18047wB;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$h", "Loi/H0;", "Lkotlin/Function1;", "Loi/w1;", "Loi/G0;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements H0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, ButtonTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, V0.D1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0 f154064a;

            a(C0 c02) {
                this.f154064a = c02;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ V0.D1 invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final V0.D1 a(Composer composer, int i10) {
                composer.startReplaceGroup(1655959306);
                if (ComposerKt.M()) {
                    ComposerKt.U(1655959306, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToButtonVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1034)");
                }
                V0.D1 d1H = P0.H(this.f154064a);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return d1H;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ButtonTemplate c(C0 c02, long j10, LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            long backgroundColor = P0.C(c02, Intrinsics.e(conditions.getTheme(), v1.b.f154268a) ? w1.b.f154276c : w1.b.f154276c).getBackgroundColor();
            if (C5489q0.t(backgroundColor) <= 1.0f) {
                backgroundColor = C5492s0.g(backgroundColor, j10);
            }
            return new ButtonTemplate(P0.F(c02), P0.E(c02), new a(c02), P0.B(c02, conditions), P0.C(c02, conditions), P0.D(localThemeScope, c02), P0.G(backgroundColor, conditions));
        }

        @Override // oi.H0
        public Function1<w1, ButtonTemplate> a() {
            return this.getTemplate;
        }

        h(final C0 c02, final long j10, final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.R0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.h.c(c02, j10, localThemeScope, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$i", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class i implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154066a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-54550287);
                if (ComposerKt.M()) {
                    ComposerKt.U(-54550287, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1067)");
                }
                long color = T.a.C3938f.f17380c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154067a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-242494104);
                if (ComposerKt.M()) {
                    ComposerKt.U(-242494104, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1076)");
                }
                long color = T.a.m0.f17395c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(C0 c02, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.b.f154276c) || Intrinsics.e(conditions, w1.c.f154277c)) {
                return new IconTemplate(c02 instanceof G1 ? androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)) : androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), a.f154066a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(c02 instanceof G1 ? androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)) : androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), b.f154067a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        i(final C0 c02) {
            this.getTemplate = new Function1() { // from class: oi.S0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.i.c(c02, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$j", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class j implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate = new Function1() { // from class: oi.T0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P0.j.c((w1) obj);
            }
        };

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154069a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1082627002);
                if (ComposerKt.M()) {
                    ComposerKt.U(1082627002, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1273)");
                }
                long color = T.a.o0.f17399c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154070a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-1661699599);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1661699599, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1279)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.b.f154276c) || Intrinsics.e(conditions, w1.c.f154277c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), a.f154069a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), b.f154070a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        j() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$k", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class k implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154072a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(804155034);
                if (ComposerKt.M()) {
                    ComposerKt.U(804155034, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1096)");
                }
                long color = T.a.o0.f17399c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154073a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(578773329);
                if (ComposerKt.M()) {
                    ComposerKt.U(578773329, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1105)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(C0 c02, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.b.f154276c) || Intrinsics.e(conditions, w1.c.f154277c)) {
                return new IconTemplate(c02 instanceof G1 ? androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)) : androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), a.f154072a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(c02 instanceof G1 ? androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)) : androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), b.f154073a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        k(final C0 c02) {
            this.getTemplate = new Function1() { // from class: oi.U0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.k.c(c02, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$l", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class l implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154075a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-1613543367);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1613543367, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1123)");
                }
                long color = T.a.C3938f.f17380c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154076a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-1838925072);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1838925072, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1132)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(C0 c02, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.b.f154276c) || Intrinsics.e(conditions, w1.c.f154277c)) {
                return new IconTemplate(c02 instanceof G1 ? androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)) : androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), a.f154075a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(c02 instanceof G1 ? androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)) : androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), b.f154076a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        l(final C0 c02) {
            this.getTemplate = new Function1() { // from class: oi.V0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.l.c(c02, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$m", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class m implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate = new Function1() { // from class: oi.W0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P0.m.c((w1) obj);
            }
        };

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154078a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(263725528);
                if (ComposerKt.M()) {
                    ComposerKt.U(263725528, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1153)");
                }
                long color = T.a.C3938f.f17380c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154079a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(38343823);
                if (ComposerKt.M()) {
                    ComposerKt.U(38343823, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1158)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), a.f154078a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), b.f154079a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        m() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$n", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class n implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate = new Function1() { // from class: oi.X0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P0.n.c((w1) obj);
            }
        };

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154081a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(2140994423);
                if (ComposerKt.M()) {
                    ComposerKt.U(2140994423, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1175)");
                }
                long color = T.a.C3938f.f17380c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154082a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1915612718);
                if (ComposerKt.M()) {
                    ComposerKt.U(1915612718, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1180)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)), a.f154081a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)), b.f154082a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        n() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$o", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class o implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate = new Function1() { // from class: oi.Y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P0.o.c((w1) obj);
            }
        };

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154084a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-276703978);
                if (ComposerKt.M()) {
                    ComposerKt.U(-276703978, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1196)");
                }
                long color = T.a.C.f17346c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154085a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-502085683);
                if (ComposerKt.M()) {
                    ComposerKt.U(-502085683, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1201)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), a.f154084a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), b.f154085a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        o() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$p", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class p implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate = new Function1() { // from class: oi.Z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P0.p.c((w1) obj);
            }
        };

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154087a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1600564917);
                if (ComposerKt.M()) {
                    ComposerKt.U(1600564917, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1215)");
                }
                long color = T.a.C.f17346c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154088a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1375183212);
                if (ComposerKt.M()) {
                    ComposerKt.U(1375183212, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1220)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)), a.f154087a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)), b.f154088a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        p() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$q", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class q implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate = new Function1() { // from class: oi.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P0.q.c((w1) obj);
            }
        };

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154090a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-817133484);
                if (ComposerKt.M()) {
                    ComposerKt.U(-817133484, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1236)");
                }
                long color = T.a.B.f17345c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154091a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-1042515189);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1042515189, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1241)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), a.f154090a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(24)), b.f154091a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        q() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$r", "Loi/J1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/I1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class r implements J1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, IconTemplate> getTemplate = new Function1() { // from class: oi.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P0.r.c((w1) obj);
            }
        };

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f154093a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1060135411);
                if (ComposerKt.M()) {
                    ComposerKt.U(1060135411, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1255)");
                }
                long color = T.a.B.f17345c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, C5489q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f154094a = new b();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
                return C5489q0.m(a(composer, num.intValue()));
            }

            b() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(834753706);
                if (ComposerKt.M()) {
                    ComposerKt.U(834753706, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToIconVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1260)");
                }
                long color = T.a.a0.f17371c.getColor();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return color;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IconTemplate c(w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)), a.f154093a);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new IconTemplate(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(21)), b.f154094a);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.J1
        public Function1<w1, IconTemplate> a() {
            return this.getTemplate;
        }

        r() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$s", "Loi/M1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/L1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class s implements M1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, TextTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154096a;

            a(LocalThemeScope localThemeScope) {
                this.f154096a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(1245413530);
                if (ComposerKt.M()) {
                    ComposerKt.U(1245413530, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1305)");
                }
                TextStyle style = this.f154096a.getAdsTypography().getHeadings().getEight().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154097a;

            b(LocalThemeScope localThemeScope) {
                this.f154097a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(-1934594095);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1934594095, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1311)");
                }
                TextStyle style = this.f154097a.getAdsTypography().getHeadings().getEight().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextTemplate c(LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new TextTemplate(null, T.a.o0.f17399c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new a(localThemeScope), 12285, null);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new TextTemplate(null, T.a.a0.f17371c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new b(localThemeScope), 12285, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.M1
        public Function1<w1, TextTemplate> a() {
            return this.getTemplate;
        }

        s(final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.s.c(localThemeScope, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$t", "Loi/M1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/L1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class t implements M1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, TextTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154099a;

            a(LocalThemeScope localThemeScope) {
                this.f154099a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(61448707);
                if (ComposerKt.M()) {
                    ComposerKt.U(61448707, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1328)");
                }
                TextStyle style = this.f154099a.getAdsTypography().getHeadings().getEight().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154100a;

            b(LocalThemeScope localThemeScope) {
                this.f154100a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(2090835834);
                if (ComposerKt.M()) {
                    ComposerKt.U(2090835834, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1334)");
                }
                TextStyle style = this.f154100a.getAdsTypography().getHeadings().getEight().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextTemplate c(LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new TextTemplate(null, T.a.C3938f.f17380c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new a(localThemeScope), 12285, null);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new TextTemplate(null, T.a.m0.f17395c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new b(localThemeScope), 12285, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.M1
        public Function1<w1, TextTemplate> a() {
            return this.getTemplate;
        }

        t(final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.t.c(localThemeScope, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$u", "Loi/M1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/L1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class u implements M1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, TextTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154102a;

            a(LocalThemeScope localThemeScope) {
                this.f154102a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(1111317922);
                if (ComposerKt.M()) {
                    ComposerKt.U(1111317922, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1351)");
                }
                TextStyle style = this.f154102a.getAdsTypography().getHeadings().getEight().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154103a;

            b(LocalThemeScope localThemeScope) {
                this.f154103a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(-1154262247);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1154262247, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1357)");
                }
                TextStyle style = this.f154103a.getAdsTypography().getHeadings().getEight().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextTemplate c(LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new TextTemplate(null, T.a.C3938f.f17380c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new a(localThemeScope), 12285, null);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new TextTemplate(null, T.a.a0.f17371c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new b(localThemeScope), 12285, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.M1
        public Function1<w1, TextTemplate> a() {
            return this.getTemplate;
        }

        u(final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.u.c(localThemeScope, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$v", "Loi/M1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/L1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class v implements M1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, TextTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154105a;

            a(LocalThemeScope localThemeScope) {
                this.f154105a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(-2133780159);
                if (ComposerKt.M()) {
                    ComposerKt.U(-2133780159, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1373)");
                }
                TextStyle style = this.f154105a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154106a;

            b(LocalThemeScope localThemeScope) {
                this.f154106a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(-104393032);
                if (ComposerKt.M()) {
                    ComposerKt.U(-104393032, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1379)");
                }
                TextStyle style = this.f154106a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextTemplate c(LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new TextTemplate(null, T.a.C3938f.f17380c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new a(localThemeScope), 12285, null);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new TextTemplate(null, T.a.m0.f17395c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new b(localThemeScope), 12285, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.M1
        public Function1<w1, TextTemplate> a() {
            return this.getTemplate;
        }

        v(final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.v.c(localThemeScope, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$w", "Loi/M1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/L1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class w implements M1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, TextTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154108a;

            a(LocalThemeScope localThemeScope) {
                this.f154108a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(-1083910944);
                if (ComposerKt.M()) {
                    ComposerKt.U(-1083910944, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1396)");
                }
                TextStyle style = this.f154108a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154109a;

            b(LocalThemeScope localThemeScope) {
                this.f154109a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(945476183);
                if (ComposerKt.M()) {
                    ComposerKt.U(945476183, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1402)");
                }
                TextStyle style = this.f154109a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextTemplate c(LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new TextTemplate(null, T.a.o0.f17399c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new a(localThemeScope), 12285, null);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new TextTemplate(null, T.a.a0.f17371c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new b(localThemeScope), 12285, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.M1
        public Function1<w1, TextTemplate> a() {
            return this.getTemplate;
        }

        w(final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.w.c(localThemeScope, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$x", "Loi/M1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/L1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class x implements M1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, TextTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154111a;

            a(LocalThemeScope localThemeScope) {
                this.f154111a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(-34041729);
                if (ComposerKt.M()) {
                    ComposerKt.U(-34041729, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1418)");
                }
                TextStyle style = this.f154111a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154112a;

            b(LocalThemeScope localThemeScope) {
                this.f154112a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(1995345398);
                if (ComposerKt.M()) {
                    ComposerKt.U(1995345398, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1424)");
                }
                TextStyle style = this.f154112a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextTemplate c(LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new TextTemplate(null, T.a.C3938f.f17380c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new a(localThemeScope), 12285, null);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new TextTemplate(null, T.a.a0.f17371c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new b(localThemeScope), 12285, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.M1
        public Function1<w1, TextTemplate> a() {
            return this.getTemplate;
        }

        x(final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.x.c(localThemeScope, (w1) obj);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"oi/P0$y", "Loi/M1;", "Lkotlin/Function1;", "Loi/w1;", "Loi/L1;", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getTemplate", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class y implements M1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<w1, TextTemplate> getTemplate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154114a;

            a(LocalThemeScope localThemeScope) {
                this.f154114a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(2075298723);
                if (ComposerKt.M()) {
                    ComposerKt.U(2075298723, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1438)");
                }
                TextStyle style = this.f154114a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, TextStyle> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154115a;

            b(LocalThemeScope localThemeScope) {
                this.f154115a = localThemeScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                return a(composer, num.intValue());
            }

            public final TextStyle a(Composer composer, int i10) {
                composer.startReplaceGroup(1245174938);
                if (ComposerKt.M()) {
                    ComposerKt.U(1245174938, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.mapToTextVariantSet.<no name provided>.getTemplate.<anonymous>.<anonymous> (Buttons.kt:1444)");
                }
                TextStyle style = this.f154115a.getAdsTypography().getHeadings().getSeven().getStyle();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return style;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextTemplate c(LocalThemeScope localThemeScope, w1 conditions) {
            Intrinsics.j(conditions, "conditions");
            if (Intrinsics.e(conditions, w1.c.f154277c) || Intrinsics.e(conditions, w1.b.f154276c)) {
                return new TextTemplate(null, T.a.o0.f17399c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new a(localThemeScope), 12285, null);
            }
            if (Intrinsics.e(conditions, w1.a.f154275c)) {
                return new TextTemplate(null, T.a.a0.f17371c.getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, new b(localThemeScope), 12285, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // oi.M1
        public Function1<w1, TextTemplate> a() {
            return this.getTemplate;
        }

        y(final LocalThemeScope localThemeScope) {
            this.getTemplate = new Function1() { // from class: oi.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P0.y.c(localThemeScope, (w1) obj);
                }
            };
        }
    }

    public static final InterfaceC14882C D(LocalThemeScope localThemeScope, C0 buttonFamily) {
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(buttonFamily, "buttonFamily");
        if (Intrinsics.e(buttonFamily, C16171j.f154177a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16174k.f154181a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16177l.f154190a)) {
            float dp2 = localThemeScope.getAdsSpacing().getFour().getDp();
            float dp3 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f10 = (float) 7.5d;
            return new InterfaceC14882C.a(dp2, H1.h.p(f10), dp3, H1.h.p(f10), null);
        }
        if (Intrinsics.e(buttonFamily, C16180m.f154191a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16183n.f154203a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16186o.f154216a)) {
            float dp4 = localThemeScope.getAdsSpacing().getFour().getDp();
            float dp5 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f11 = (float) 7.5d;
            return new InterfaceC14882C.a(dp4, H1.h.p(f11), dp5, H1.h.p(f11), null);
        }
        if (Intrinsics.e(buttonFamily, C16188p.f154218a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16190q.f154222a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, oi.r.f154243a)) {
            float dp6 = localThemeScope.getAdsSpacing().getFour().getDp();
            float dp7 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f12 = (float) 7.5d;
            return new InterfaceC14882C.a(dp6, H1.h.p(f12), dp7, H1.h.p(f12), null);
        }
        if (Intrinsics.e(buttonFamily, C16193s.f154249a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16195t.f154254a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16197u.f154259a)) {
            float dp8 = localThemeScope.getAdsSpacing().getFour().getDp();
            float dp9 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f13 = (float) 7.5d;
            return new InterfaceC14882C.a(dp8, H1.h.p(f13), dp9, H1.h.p(f13), null);
        }
        if (Intrinsics.e(buttonFamily, C16199v.f154263a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getTwo().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16201w.f154270a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getTwo().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16203x.f154278a)) {
            float dp10 = localThemeScope.getAdsSpacing().getTwo().getDp();
            float dp11 = localThemeScope.getAdsSpacing().getThree().getDp();
            float f14 = (float) 7.5d;
            return new InterfaceC14882C.a(dp10, H1.h.p(f14), dp11, H1.h.p(f14), null);
        }
        if (Intrinsics.e(buttonFamily, C16207z.f154284a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16131A.f153871a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16132B.f153874a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16133C.f153876a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16134D.f153878a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16135E.f153884a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16136F.f153892a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16137G.f153898a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16138H.f153909a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16139I.f153910a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16140J.f153925a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16141K.f153940a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16142L.f153955a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16143M.f153976a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, N.f153988a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, O.f154006a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, P.f154014a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, Q.f154116a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, S.f154122a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, T.f154124a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, U.f154125a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, W.f154128a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, X.f154129a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, Y.f154130a)) {
            float dp12 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp13 = localThemeScope.getAdsSpacing().getFour().getDp();
            float f15 = (float) 7.5d;
            return new InterfaceC14882C.a(dp12, H1.h.p(f15), dp13, H1.h.p(f15), null);
        }
        if (Intrinsics.e(buttonFamily, Z.f154131a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16145a0.f154134a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16148b0.f154145a)) {
            float dp14 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp15 = localThemeScope.getAdsSpacing().getFour().getDp();
            float f16 = (float) 7.5d;
            return new InterfaceC14882C.a(dp14, H1.h.p(f16), dp15, H1.h.p(f16), null);
        }
        if (Intrinsics.e(buttonFamily, C16151c0.f154150a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16154d0.f154154a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16157e0.f154158a)) {
            float dp16 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp17 = localThemeScope.getAdsSpacing().getFour().getDp();
            float f17 = (float) 7.5d;
            return new InterfaceC14882C.a(dp16, H1.h.p(f17), dp17, H1.h.p(f17), null);
        }
        if (Intrinsics.e(buttonFamily, C16160f0.f154164a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16163g0.f154168a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16166h0.f154172a)) {
            float dp18 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp19 = localThemeScope.getAdsSpacing().getFour().getDp();
            float f18 = (float) 7.5d;
            return new InterfaceC14882C.a(dp18, H1.h.p(f18), dp19, H1.h.p(f18), null);
        }
        if (Intrinsics.e(buttonFamily, C16169i0.f154175a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getTwo().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16172j0.f154179a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getTwo().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16175k0.f154182a)) {
            float dp20 = localThemeScope.getAdsSpacing().getThree().getDp();
            float dp21 = localThemeScope.getAdsSpacing().getTwo().getDp();
            float f19 = (float) 7.5d;
            return new InterfaceC14882C.a(dp20, H1.h.p(f19), dp21, H1.h.p(f19), null);
        }
        if (Intrinsics.e(buttonFamily, C16181m0.f154192a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16184n0.f154204a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16187o0.f154217a)) {
            float dp22 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp23 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f20 = (float) 7.5d;
            return new InterfaceC14882C.a(dp22, H1.h.p(f20), dp23, H1.h.p(f20), null);
        }
        if (Intrinsics.e(buttonFamily, C16189p0.f154220a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16191q0.f154224a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16192r0.f154244a)) {
            float dp24 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp25 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f21 = (float) 7.5d;
            return new InterfaceC14882C.a(dp24, H1.h.p(f21), dp25, H1.h.p(f21), null);
        }
        if (Intrinsics.e(buttonFamily, C16194s0.f154251a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16196t0.f154256a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16198u0.f154260a)) {
            float dp26 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp27 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f22 = (float) 7.5d;
            return new InterfaceC14882C.a(dp26, H1.h.p(f22), dp27, H1.h.p(f22), null);
        }
        if (Intrinsics.e(buttonFamily, C16200v0.f154265a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getEight().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16202w0.f154271a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16204x0.f154280a)) {
            float dp28 = localThemeScope.getAdsSpacing().getFive().getDp();
            float dp29 = localThemeScope.getAdsSpacing().getFive().getDp();
            float f23 = (float) 7.5d;
            return new InterfaceC14882C.a(dp28, H1.h.p(f23), dp29, H1.h.p(f23), null);
        }
        if (Intrinsics.e(buttonFamily, C16206y0.f154282a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), null);
        }
        if (Intrinsics.e(buttonFamily, C16208z0.f154285a)) {
            return new InterfaceC14882C.a(localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), null);
        }
        if (!Intrinsics.e(buttonFamily, A0.f153872a)) {
            throw new NoWhenBranchMatchedException();
        }
        float dp30 = localThemeScope.getAdsSpacing().getThree().getDp();
        float dp31 = localThemeScope.getAdsSpacing().getThree().getDp();
        float f24 = (float) 7.5d;
        return new InterfaceC14882C.a(dp30, H1.h.p(f24), dp31, H1.h.p(f24), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r23, final oi.InterfaceC16205y r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, final Ki.C r26, final java.lang.String r27, androidx.compose.ui.Modifier r28, java.lang.String r29, boolean r30, boolean r31, boolean r32, long r33, androidx.compose.runtime.Composer r35, final int r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.P0.h(Ki.M, oi.y, kotlin.jvm.functions.Function0, Ki.C, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, boolean, boolean, boolean, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r24, final oi.InterfaceC16178l0 r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, final Ki.C r27, final java.lang.String r28, androidx.compose.ui.Modifier r29, java.lang.String r30, boolean r31, boolean r32, long r33, boolean r35, androidx.compose.runtime.Composer r36, final int r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.P0.j(Ki.M, oi.l0, kotlin.jvm.functions.Function0, Ki.C, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, boolean, boolean, long, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[N1.values().length];
            try {
                iArr[N1.f154001a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N1.f154002b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N1.f154003c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final w1 A(v1 themeCondition, s1 enabled) {
        Intrinsics.j(themeCondition, "themeCondition");
        Intrinsics.j(enabled, "enabled");
        if (themeCondition instanceof v1.b) {
            if (enabled instanceof u1) {
                return w1.c.f154277c;
            }
            if (enabled instanceof t1) {
                return w1.b.f154276c;
            }
            if (enabled instanceof s1.a) {
                return w1.a.f154275c;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(themeCondition instanceof v1.c) && !(themeCondition instanceof v1.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (enabled instanceof u1) {
            return w1.c.f154277c;
        }
        if (enabled instanceof t1) {
            return w1.b.f154276c;
        }
        if (enabled instanceof s1.a) {
            return w1.a.f154275c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BorderStroke B(C0 buttonFamily, w1 conditionSet) {
        Intrinsics.j(buttonFamily, "buttonFamily");
        Intrinsics.j(conditionSet, "conditionSet");
        boolean z10 = buttonFamily instanceof E1;
        if ((z10 && Intrinsics.e(conditionSet, w1.c.f154277c)) || (z10 && Intrinsics.e(conditionSet, w1.b.f154276c))) {
            return C13575i.a(H1.h.p(2), T.a.C3938f.f17380c.getColor());
        }
        if (z10 && Intrinsics.e(conditionSet, w1.a.f154275c)) {
            return C13575i.a(H1.h.p(2), T.a.a0.f17371c.getColor());
        }
        return null;
    }

    public static final AcresButtonColors C(C0 buttonFamily, w1 conditionSet) {
        long color;
        long color2;
        long color3;
        Intrinsics.j(buttonFamily, "buttonFamily");
        Intrinsics.j(conditionSet, "conditionSet");
        boolean z10 = buttonFamily instanceof A1;
        if (z10 && (buttonFamily instanceof H1) && (conditionSet instanceof w1.c)) {
            return new AcresButtonColors(T.a.C3938f.f17380c.getColor(), T.a.o0.f17399c.getColor(), null);
        }
        if (z10 && (buttonFamily instanceof H1) && (conditionSet instanceof w1.b)) {
            return new AcresButtonColors(T.a.C3941i.f17386c.getColor(), T.a.o0.f17399c.getColor(), null);
        }
        if (z10 && (buttonFamily instanceof H1) && (conditionSet instanceof w1.a)) {
            return new AcresButtonColors(T.a.a0.f17371c.getColor(), T.a.o0.f17399c.getColor(), null);
        }
        if (z10 && (buttonFamily instanceof B1) && (conditionSet instanceof w1.c)) {
            return new AcresButtonColors(T.a.o0.f17399c.getColor(), T.a.C3938f.f17380c.getColor(), null);
        }
        if (z10 && (buttonFamily instanceof B1) && (conditionSet instanceof w1.b)) {
            return new AcresButtonColors(T.a.g0.f17383c.getColor(), T.a.C3938f.f17380c.getColor(), null);
        }
        if (z10 && (buttonFamily instanceof B1) && (conditionSet instanceof w1.a)) {
            T.a.m0 m0Var = T.a.m0.f17395c;
            return new AcresButtonColors(m0Var.getColor(), m0Var.getColor(), null);
        }
        boolean z11 = buttonFamily instanceof E1;
        if (z11 && (conditionSet instanceof w1.c)) {
            return new AcresButtonColors(T.a.n0.f17397c.getColor(), T.a.C3938f.f17380c.getColor(), null);
        }
        if (z11 && (conditionSet instanceof w1.b)) {
            return new AcresButtonColors(T.a.C3935c.f17374c.getColor(), T.a.C3938f.f17380c.getColor(), null);
        }
        if (z11 && (conditionSet instanceof w1.a)) {
            return new AcresButtonColors(T.a.n0.f17397c.getColor(), T.a.a0.f17371c.getColor(), null);
        }
        boolean z12 = buttonFamily instanceof F1;
        if (z12 && (conditionSet instanceof w1.c)) {
            long color4 = T.a.n0.f17397c.getColor();
            if ((buttonFamily instanceof C16142L) || (buttonFamily instanceof C16143M) || (buttonFamily instanceof N)) {
                color3 = T.a.C3938f.f17380c.getColor();
            } else if ((buttonFamily instanceof O) || (buttonFamily instanceof P) || (buttonFamily instanceof Q)) {
                color3 = T.a.C.f17346c.getColor();
            } else if ((buttonFamily instanceof S) || (buttonFamily instanceof T) || (buttonFamily instanceof U)) {
                color3 = T.a.B.f17345c.getColor();
            } else {
                if (!(buttonFamily instanceof C16206y0) && !(buttonFamily instanceof C16208z0) && !(buttonFamily instanceof A0) && !(buttonFamily instanceof C16199v) && !(buttonFamily instanceof C16201w) && !(buttonFamily instanceof C16203x) && !(buttonFamily instanceof C16169i0) && !(buttonFamily instanceof C16172j0) && !(buttonFamily instanceof C16175k0)) {
                    throw new NoWhenBranchMatchedException();
                }
                color3 = T.a.C3938f.f17380c.getColor();
            }
            return new AcresButtonColors(color4, color3, null);
        }
        if (!z12 || !(conditionSet instanceof w1.b)) {
            if (z12 && (conditionSet instanceof w1.a)) {
                return new AcresButtonColors(T.a.n0.f17397c.getColor(), T.a.a0.f17371c.getColor(), null);
            }
            boolean z13 = buttonFamily instanceof z1;
            if (z13 && (conditionSet instanceof w1.c)) {
                return new AcresButtonColors(T.a.Q.f17360c.getColor(), T.a.o0.f17399c.getColor(), null);
            }
            if (z13 && (conditionSet instanceof w1.b)) {
                return new AcresButtonColors(T.a.S.f17362c.getColor(), T.a.o0.f17399c.getColor(), null);
            }
            if (!z13 || !(conditionSet instanceof w1.a)) {
                return new AcresButtonColors(T.a.C3938f.f17380c.getColor(), T.a.o0.f17399c.getColor(), null);
            }
            T.a.a0 a0Var = T.a.a0.f17371c;
            return new AcresButtonColors(a0Var.getColor(), a0Var.getColor(), null);
        }
        boolean z14 = buttonFamily instanceof C16142L;
        if (z14 || (buttonFamily instanceof C16143M) || (buttonFamily instanceof N)) {
            color = T.a.C3935c.f17374c.getColor();
        } else if ((buttonFamily instanceof O) || (buttonFamily instanceof P) || (buttonFamily instanceof Q) || (buttonFamily instanceof S) || (buttonFamily instanceof T) || (buttonFamily instanceof U)) {
            color = T.a.c0.f17375c.getColor();
        } else {
            if (!(buttonFamily instanceof C16206y0) && !(buttonFamily instanceof C16208z0) && !(buttonFamily instanceof A0) && !(buttonFamily instanceof C16199v) && !(buttonFamily instanceof C16201w) && !(buttonFamily instanceof C16203x) && !(buttonFamily instanceof C16169i0) && !(buttonFamily instanceof C16172j0) && !(buttonFamily instanceof C16175k0)) {
                throw new NoWhenBranchMatchedException();
            }
            color = T.a.C3935c.f17374c.getColor();
        }
        long j10 = color;
        if (z14 || (buttonFamily instanceof C16143M) || (buttonFamily instanceof N)) {
            color2 = T.a.C3935c.f17374c.getColor();
        } else if ((buttonFamily instanceof O) || (buttonFamily instanceof P) || (buttonFamily instanceof Q)) {
            color2 = T.a.C.f17346c.getColor();
        } else if ((buttonFamily instanceof S) || (buttonFamily instanceof T)) {
            color2 = T.a.B.f17345c.getColor();
        } else if (buttonFamily instanceof U) {
            color2 = T.a.c0.f17375c.getColor();
        } else {
            if (!(buttonFamily instanceof C16206y0) && !(buttonFamily instanceof C16208z0) && !(buttonFamily instanceof A0) && !(buttonFamily instanceof C16199v) && !(buttonFamily instanceof C16201w) && !(buttonFamily instanceof C16203x) && !(buttonFamily instanceof C16169i0) && !(buttonFamily instanceof C16172j0) && !(buttonFamily instanceof C16175k0)) {
                throw new NoWhenBranchMatchedException();
            }
            color2 = T.a.C3938f.f17380c.getColor();
        }
        return new AcresButtonColors(j10, color2, null);
    }

    public static final Function2<Composer, Integer, InterfaceC18047w> E(C0 buttonFamily) {
        Intrinsics.j(buttonFamily, "buttonFamily");
        return g.f154062a;
    }

    @SuppressLint({"ModifierFactoryExtensionFunction"})
    public static final Modifier F(C0 buttonFamily) {
        Intrinsics.j(buttonFamily, "buttonFamily");
        if (buttonFamily instanceof C1) {
            return androidx.compose.foundation.layout.J.b(Modifier.INSTANCE, 0.0f, H1.h.p(48), 1, null);
        }
        if (buttonFamily instanceof D1) {
            return androidx.compose.foundation.layout.J.b(Modifier.INSTANCE, 0.0f, H1.h.p(40), 1, null);
        }
        if (buttonFamily instanceof G1) {
            return androidx.compose.foundation.layout.J.b(Modifier.INSTANCE, 0.0f, H1.h.p(36), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RippleConfiguration G(long j10, w1 conditions) {
        float f10;
        Intrinsics.j(conditions, "conditions");
        if (Intrinsics.e(conditions, w1.c.f154277c)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
            if (!Intrinsics.e(conditions, w1.b.f154276c) && !Intrinsics.e(conditions, w1.a.f154275c)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new RippleConfiguration(j10, new RippleAlpha(1.0f, 1.0f, 1.0f, f10), null);
    }

    public static final V0.D1 H(C0 buttonFamily) {
        Intrinsics.j(buttonFamily, "buttonFamily");
        return buttonFamily instanceof G1 ? C16806i.c(H1.h.p(8)) : C16806i.c(H1.h.p(12));
    }

    public static final H0 I(LocalThemeScope mapToButtonVariantSet, long j10, C0 buttonFamily) {
        Intrinsics.j(mapToButtonVariantSet, "$this$mapToButtonVariantSet");
        Intrinsics.j(buttonFamily, "buttonFamily");
        return new h(buttonFamily, j10, mapToButtonVariantSet);
    }

    public static final J1 J(C0 buttonFamily) {
        Intrinsics.j(buttonFamily, "buttonFamily");
        boolean z10 = buttonFamily instanceof x1;
        return (z10 && (buttonFamily instanceof A1) && (buttonFamily instanceof B1)) ? new i(buttonFamily) : (z10 && (((buttonFamily instanceof A1) && (buttonFamily instanceof H1)) || (buttonFamily instanceof z1))) ? new k(buttonFamily) : (z10 && (buttonFamily instanceof E1)) ? new l(buttonFamily) : ((buttonFamily instanceof C16142L) || (buttonFamily instanceof C16143M) || (buttonFamily instanceof C16199v) || (buttonFamily instanceof C16201w) || (buttonFamily instanceof C16169i0) || (buttonFamily instanceof C16172j0)) ? new m() : ((buttonFamily instanceof N) || (buttonFamily instanceof C16203x) || (buttonFamily instanceof C16175k0)) ? new n() : ((buttonFamily instanceof O) || (buttonFamily instanceof P)) ? new o() : buttonFamily instanceof Q ? new p() : ((buttonFamily instanceof S) || (buttonFamily instanceof T)) ? new q() : buttonFamily instanceof U ? new r() : new j();
    }

    public static final M1 K(LocalThemeScope localThemeScope, C0 buttonFamily) {
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(buttonFamily, "buttonFamily");
        boolean z10 = buttonFamily instanceof y1;
        return (z10 && (buttonFamily instanceof G1) && (((buttonFamily instanceof A1) && (buttonFamily instanceof H1)) || (buttonFamily instanceof z1))) ? new s(localThemeScope) : (z10 && (buttonFamily instanceof G1) && (buttonFamily instanceof A1) && (buttonFamily instanceof B1)) ? new t(localThemeScope) : (z10 && (buttonFamily instanceof G1) && ((buttonFamily instanceof E1) || (buttonFamily instanceof F1))) ? new u(localThemeScope) : (z10 && (buttonFamily instanceof A1) && (buttonFamily instanceof B1)) ? new v(localThemeScope) : (z10 && (((buttonFamily instanceof A1) && (buttonFamily instanceof H1)) || (buttonFamily instanceof z1))) ? new w(localThemeScope) : (z10 && ((buttonFamily instanceof E1) || (buttonFamily instanceof F1))) ? new x(localThemeScope) : new y(localThemeScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier L(Modifier modifier, V0.D1 d12, long j10, BorderStroke borderStroke, float f10) {
        Modifier modifierB = T0.l.b(modifier, f10, d12, false, 0L, 0L, 24, null);
        Modifier modifierE = Modifier.INSTANCE;
        if (borderStroke != null) {
            modifierE = C13572f.e(modifierE, borderStroke, d12);
        }
        return T0.e.a(androidx.compose.foundation.b.c(modifierB.then(modifierE), j10, d12), d12);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r19, final oi.V r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final Ki.C r22, final java.lang.String r23, androidx.compose.ui.Modifier r24, boolean r25, boolean r26, long r27, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.P0.i(Ki.M, oi.V, kotlin.jvm.functions.Function0, Ki.C, java.lang.String, androidx.compose.ui.Modifier, boolean, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r21, final oi.B0 r22, final java.lang.String r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.ui.Modifier r25, java.lang.String r26, boolean r27, long r28, boolean r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.P0.k(Ki.M, oi.B0, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, boolean, long, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final oi.ButtonTemplate r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, final boolean r19, final h0.l r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, boolean r23, final kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.P0.l(oi.G0, kotlin.jvm.functions.Function0, boolean, h0.l, java.lang.String, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(ButtonTemplate buttonTemplate, Function0 function0, boolean z10, h0.l lVar, String str, Modifier modifier, boolean z11, Function3 function3, int i10, int i11, Composer composer, int i12) {
        l(buttonTemplate, function0, z10, lVar, str, modifier, z11, function3, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, InterfaceC16205y interfaceC16205y, Function0 function0, Ki.C c10, String str, Modifier modifier, String str2, boolean z10, boolean z11, boolean z12, long j10, int i10, int i11, int i12, Composer composer, int i13) {
        h(localThemeScope, interfaceC16205y, function0, c10, str, modifier, str2, z10, z11, z12, j10, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, V v10, Function0 function0, Ki.C c10, String str, Modifier modifier, boolean z10, boolean z11, long j10, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, v10, function0, c10, str, modifier, z10, z11, j10, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, InterfaceC16178l0 interfaceC16178l0, Function0 function0, Ki.C c10, String str, Modifier modifier, String str2, boolean z10, boolean z11, long j10, boolean z12, int i10, int i11, int i12, Composer composer, int i13) {
        j(localThemeScope, interfaceC16178l0, function0, c10, str, modifier, str2, z10, z11, j10, z12, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, B0 b02, String str, Function0 function0, Modifier modifier, String str2, boolean z10, long j10, boolean z11, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, b02, str, function0, modifier, str2, z10, j10, z11, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final oi.IconTemplate r15, final Ki.C r16, java.lang.String r17, boolean r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.P0.r(oi.I1, Ki.C, java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(IconTemplate iconTemplate, Ki.C c10, String str, boolean z10, int i10, int i11, Composer composer, int i12) {
        r(iconTemplate, c10, str, z10, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void t(final TextTemplate textTemplate, String str, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        final String text = str;
        Intrinsics.j(textTemplate, "textTemplate");
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(891363178);
        if ((i10 & 6) == 0) {
            i11 = i10 | (composerStartRestartGroup.V(textTemplate) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(891363178, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.AcresTextInternal (Buttons.kt:2310)");
            }
            composer2 = composerStartRestartGroup;
            text = str;
            kotlin.N1.b(text, textTemplate.getModifier(), textTemplate.getColor(), textTemplate.getFontSize(), textTemplate.getFontStyle(), textTemplate.getFontWeight(), textTemplate.getFontFamily(), textTemplate.getLetterSpacing(), textTemplate.getTextDecoration(), textTemplate.getTextAlign(), textTemplate.getLineHeight(), textTemplate.getOverflow(), textTemplate.getSoftWrap(), textTemplate.getMaxLines(), 0, textTemplate.l(), textTemplate.o().invoke(composerStartRestartGroup, 0), composer2, (i11 >> 3) & 14, 0, 16384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oi.L0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return P0.u(textTemplate, text, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(TextTemplate textTemplate, String str, int i10, Composer composer, int i11) {
        t(textTemplate, str, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final ButtonTemplate x(LocalThemeScope determineButtonTemplateInternal, C0 buttonFamily, w1 conditions, long j10) {
        Intrinsics.j(determineButtonTemplateInternal, "$this$determineButtonTemplateInternal");
        Intrinsics.j(buttonFamily, "buttonFamily");
        Intrinsics.j(conditions, "conditions");
        return I(determineButtonTemplateInternal, j10, buttonFamily).a().invoke(conditions);
    }

    public static final IconTemplate y(LocalThemeScope localThemeScope, C0 buttonFamily, w1 conditions) {
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(buttonFamily, "buttonFamily");
        Intrinsics.j(conditions, "conditions");
        return J(buttonFamily).a().invoke(conditions);
    }

    public static final TextTemplate z(LocalThemeScope localThemeScope, C0 buttonFamily, w1 conditions) {
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(buttonFamily, "buttonFamily");
        Intrinsics.j(conditions, "conditions");
        return K(localThemeScope, buttonFamily).a().invoke(conditions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long M(long j10, InterfaceC18013j0 interfaceC18013j0, float f10, Composer composer, int i10) {
        Composer composer2;
        long jA;
        composer.startReplaceGroup(-1237578407);
        if (ComposerKt.M()) {
            ComposerKt.U(-1237578407, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.surfaceColorAtElevation (Buttons.kt:2357)");
        }
        if (C5489q0.s(j10, C17943E0.f167967a.a(composer, C17943E0.f167968b).n()) && interfaceC18013j0 != null) {
            composer2 = composer;
            jA = interfaceC18013j0.a(j10, f10, composer2, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896));
        } else {
            composer2 = composer;
            jA = j10;
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer2.P();
        return jA;
    }
}
