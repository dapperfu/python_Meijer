package hn;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.util.Patterns;
import android.widget.TextView;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ck.C6408b;
import gn.OrderDetailWhatsNextDecorator;
import hn.C14512J;
import i.C14583i;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14794C;
import java.util.List;
import ji.q1;
import kotlin.C17985y;
import kotlin.C17988z0;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import l0.C15342b;
import l0.InterfaceC15343c;
import p1.C16190d;
import p1.C16193g;
import r0.C16692i;
import r1.C16705m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LJi/M;", "Lgn/o;", "decorator", "", "j", "(LJi/M;Lgn/o;Landroidx/compose/runtime/Composer;I)V", "Lgn/o$b;", "l", "(LJi/M;Lgn/o$b;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "f", "(Landroidx/compose/ui/Modifier;Lgn/o$b;Landroidx/compose/runtime/Composer;II)V", "", "instructions", "number", "Landroid/text/SpannableString;", "n", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hn.J, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14512J {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.J$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderDetailWhatsNextDecorator f135748a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135749b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: hn.J$a$a, reason: collision with other inner class name */
        public static final class C2147a extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final C2147a f135750f = new C2147a();

            public C2147a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(OrderDetailWhatsNextDecorator.WhatsNextItemDecorator whatsNextItemDecorator) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: hn.J$a$b */
        public static final class b extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f135751f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f135752g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Function1 function1, List list) {
                super(1);
                this.f135751f = function1;
                this.f135752g = list;
            }

            public final Object a(int i10) {
                return this.f135751f.invoke(this.f135752g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        /* renamed from: hn.J$a$c */
        public static final class c extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f135753f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135754g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, LocalThemeScope localThemeScope) {
                super(4);
                this.f135753f = list;
                this.f135754g = localThemeScope;
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
                OrderDetailWhatsNextDecorator.WhatsNextItemDecorator whatsNextItemDecorator = (OrderDetailWhatsNextDecorator.WhatsNextItemDecorator) this.f135753f.get(i10);
                composer.startReplaceGroup(-842333192);
                C14512J.l(this.f135754g, whatsNextItemDecorator, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3));
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

        a(OrderDetailWhatsNextDecorator orderDetailWhatsNextDecorator, LocalThemeScope localThemeScope) {
            this.f135748a = orderDetailWhatsNextDecorator;
            this.f135749b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(OrderDetailWhatsNextDecorator orderDetailWhatsNextDecorator, LocalThemeScope localThemeScope, l0.w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            List<OrderDetailWhatsNextDecorator.WhatsNextItemDecorator> listE = orderDetailWhatsNextDecorator.e();
            LazyRow.i(listE.size(), null, new b(C2147a.f135750f, listE), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(listE, localThemeScope)));
            return Unit.f142422a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1789688565, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderWhatsNextView.<anonymous> (OrderWhatsNextView.kt:59)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), H1.h.p(f10));
            final OrderDetailWhatsNextDecorator orderDetailWhatsNextDecorator = this.f135748a;
            final LocalThemeScope localThemeScope = this.f135749b;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C17988z0.a(C16190d.c(orderDetailWhatsNextDecorator.getIcon(), composer, 0), C16193g.c(com.meijer.mobile.meijer.Y.f99890Wh, composer, 0), null, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 0, 4);
            String strA = C6408b.a(orderDetailWhatsNextDecorator.getTitle(), composer, AbstractC5607a.f45514b);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(8), 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: hn.H
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14512J.a.d((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ri.j.h(localThemeScope, new q1.Label(C16705m.d(modifierM, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne().f(FontWeight.INSTANCE.f()), null, 382, null), strA, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            composer.v();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null);
            float f11 = 32;
            C5658d.f fVarO = c5658d.o(H1.h.p(f11));
            InterfaceC14794C interfaceC14794CC = androidx.compose.foundation.layout.D.c(H1.h.p(f11), 0.0f, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(orderDetailWhatsNextDecorator) | composer.D(localThemeScope);
            Object objB2 = composer.B();
            if (zD || objB2 == companion4.a()) {
                objB2 = new Function1() { // from class: hn.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14512J.a.e(orderDetailWhatsNextDecorator, localThemeScope, (l0.w) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C15342b.c(modifierM2, null, interfaceC14794CC, false, fVarO, null, null, false, null, (Function1) objB2, composer, 24966, 490);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.J$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderDetailWhatsNextDecorator.WhatsNextItemDecorator f135755a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135756b;

        b(OrderDetailWhatsNextDecorator.WhatsNextItemDecorator whatsNextItemDecorator, LocalThemeScope localThemeScope) {
            this.f135755a = whatsNextItemDecorator;
            this.f135756b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(LocalThemeScope localThemeScope, X0.f drawBehind) {
            Intrinsics.j(drawBehind, "$this$drawBehind");
            X0.f.f1(drawBehind, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.k.h(drawBehind.b()), 0L, 0.0f, null, null, 0, 124, null);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(325213790, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.WhatsNextItem.<anonymous> (OrderWhatsNextView.kt:99)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 12;
            Modifier modifierZ = androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), H1.h.p(280));
            OrderDetailWhatsNextDecorator.WhatsNextItemDecorator whatsNextItemDecorator = this.f135755a;
            final LocalThemeScope localThemeScope = this.f135756b;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierZ);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            AbstractC5607a stepNumber = whatsNextItemDecorator.getStepNumber();
            composer.startReplaceGroup(1272739352);
            if (stepNumber == null) {
                composer2 = composer;
            } else {
                int i11 = AbstractC5607a.f45514b;
                String strA = C6408b.a(stepNumber, composer, i11);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(localThemeScope);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: hn.K
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C14512J.b.c(localThemeScope, (X0.f) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.ui.draw.b.b(companion, (Function1) objB), localThemeScope.getAdsColors().getAdsColorUIBackground01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), strA, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                composer2 = composer;
                AbstractC5607a instruction = whatsNextItemDecorator.getInstruction();
                composer2.startReplaceGroup(1272760883);
                if (instruction != null) {
                    C14512J.f(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(16), 2, null), whatsNextItemDecorator, composer2, i11 << 3, 0);
                }
                composer2.P();
            }
            composer2.P();
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView g(TextView textView, Context it) {
        Intrinsics.j(it, "it");
        return textView;
    }

    public static final void f(final Modifier modifier, final OrderDetailWhatsNextDecorator.WhatsNextItemDecorator decorator, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(decorator, "decorator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-740469487);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(decorator) : composerStartRestartGroup.D(decorator) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-740469487, i12, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.DefaultLinkifyText (OrderWhatsNextView.kt:134)");
            }
            final Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new TextView(context);
                composerStartRestartGroup.t(objB);
            }
            final TextView textView = (TextView) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(textView);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: hn.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14512J.g(textView, (Context) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD2 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && composerStartRestartGroup.D(decorator))) | composerStartRestartGroup.D(context);
            Object objB3 = composerStartRestartGroup.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: hn.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C14512J.h(decorator, context, (TextView) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            androidx.compose.ui.viewinterop.e.a(function1, modifier2, (Function1) objB3, composerStartRestartGroup, (i12 << 3) & 112, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: hn.E
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14512J.i(modifier, decorator, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(OrderDetailWhatsNextDecorator.WhatsNextItemDecorator whatsNextItemDecorator, Context context, TextView textView) {
        CharSequence charSequenceD;
        Intrinsics.j(textView, "textView");
        if (whatsNextItemDecorator.getIsURLProvided()) {
            charSequenceD = n(bk.d.a(context, whatsNextItemDecorator.getInstruction()), bk.d.a(context, whatsNextItemDecorator.getPickupHelpNumber()) + '.');
        } else {
            AbstractC5607a instruction = whatsNextItemDecorator.getInstruction();
            charSequenceD = instruction != null ? instruction.d(context) : null;
        }
        textView.setText(charSequenceD);
        textView.setMinLines(3);
        textView.setTextAppearance(C14583i.f136681c);
        n2.c.d(textView, 15);
        Linkify.addLinks(textView, Patterns.PHONE, "sms:", Linkify.sPhoneNumberMatchFilter, Linkify.sPhoneNumberTransformFilter);
        CharSequence text = textView.getText();
        Intrinsics.i(text, "getText(...)");
        textView.setText(Ek.b.a(text));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Modifier modifier, OrderDetailWhatsNextDecorator.WhatsNextItemDecorator whatsNextItemDecorator, int i10, int i11, Composer composer, int i12) {
        f(modifier, whatsNextItemDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void j(final LocalThemeScope localThemeScope, final OrderDetailWhatsNextDecorator decorator, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(decorator, "decorator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1363138383);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(decorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1363138383, i11, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderWhatsNextView (OrderWhatsNextView.kt:57)");
            }
            t1.a(androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(1789688565, true, new a(decorator, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 62);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: hn.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14512J.k(localThemeScope, decorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, OrderDetailWhatsNextDecorator orderDetailWhatsNextDecorator, int i10, Composer composer, int i11) {
        j(localThemeScope, orderDetailWhatsNextDecorator, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void l(final LocalThemeScope localThemeScope, final OrderDetailWhatsNextDecorator.WhatsNextItemDecorator decorator, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(decorator, "decorator");
        Composer composerStartRestartGroup = composer.startRestartGroup(419890721);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(decorator) : composerStartRestartGroup.D(decorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(419890721, i11, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.WhatsNextItem (OrderWhatsNextView.kt:93)");
            }
            C17985y.a(androidx.compose.foundation.layout.J.D(Modifier.INSTANCE, null, false, 3, null), C16692i.c(H1.h.p(8)), 0L, 0L, null, 0.0f, ComposableLambdaKt.c(325213790, true, new b(decorator, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 60);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: hn.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14512J.m(localThemeScope, decorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, OrderDetailWhatsNextDecorator.WhatsNextItemDecorator whatsNextItemDecorator, int i10, Composer composer, int i11) {
        l(localThemeScope, whatsNextItemDecorator, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final SpannableString n(String str, String str2) {
        return new SpannableString(str + ' ' + str2);
    }
}
