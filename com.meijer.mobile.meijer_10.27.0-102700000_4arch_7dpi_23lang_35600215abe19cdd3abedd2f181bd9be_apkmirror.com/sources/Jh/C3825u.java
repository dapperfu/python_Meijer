package Jh;

import Jh.C3825u;
import Ji.LocalThemeScope;
import P0.e;
import Sh.AddressSuggestionDecorator;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.meijer.mobile.accounts.ux.addresses.a;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ji.InterfaceC14930d0;
import ji.q1;
import ji.s1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a?\u0010\n\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "LSh/c;", "addressSuggestions", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "onResourceAction", "g", "(LJi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "addressSuggestionDecorator", "d", "(LJi/M;LSh/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Jh.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3825u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Jh.u$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AddressSuggestionDecorator f15299b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15300c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Jh.u$a$a, reason: collision with other inner class name */
        static final class C0243a implements Function3<InterfaceC14930d0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f15301a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressSuggestionDecorator f15302b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15303c;

            /* JADX WARN: Multi-variable type inference failed */
            C0243a(LocalThemeScope localThemeScope, AddressSuggestionDecorator addressSuggestionDecorator, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
                this.f15301a = localThemeScope;
                this.f15302b = addressSuggestionDecorator;
                this.f15303c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, AddressSuggestionDecorator addressSuggestionDecorator, boolean z10) {
                function1.invoke(new a.SelectAddressSuggestion(addressSuggestionDecorator.getTitle()));
                return Unit.f142422a;
            }

            public final void b(InterfaceC14930d0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(443719808, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressSuggestionCard.<anonymous>.<anonymous>.<anonymous> (AddressSuggestionsView.kt:103)");
                }
                LocalThemeScope localThemeScope = this.f15301a;
                q1.s.RadioButton defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
                boolean isSelected = this.f15302b.getIsSelected();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f15303c) | composer.D(this.f15302b);
                final Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> function1 = this.f15303c;
                final AddressSuggestionDecorator addressSuggestionDecorator = this.f15302b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Jh.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C3825u.a.C0243a.c(function1, addressSuggestionDecorator, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                vi.s.b(localThemeScope, defaultToggleButton, isSelected, false, false, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.s.RadioButton.f140178e << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14930d0 interfaceC14930d0, Composer composer, Integer num) {
                b(interfaceC14930d0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AddressSuggestionDecorator addressSuggestionDecorator, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
            this.f15298a = localThemeScope;
            this.f15299b = addressSuggestionDecorator;
            this.f15300c = function1;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1853608156, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressSuggestionCard.<anonymous> (AddressSuggestionsView.kt:101)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(16));
            LocalThemeScope localThemeScope = this.f15298a;
            AddressSuggestionDecorator addressSuggestionDecorator = this.f15299b;
            Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> function1 = this.f15300c;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion2.l(), composer2, 0);
            int iA = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierI);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            s1.h hVar = s1.h.f140225a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(443719808, true, new C0243a(localThemeScope, addressSuggestionDecorator, function1), composer2, 54);
            int i11 = LocalThemeScope.f15770g;
            Ji.Q.e(localThemeScope, hVar, composableLambdaC, composer2, i11 | 384 | (s1.h.f140226b << 3));
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion2.k(), composer2, 0);
            int iA2 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = D1.a(composer2);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null), C6408b.a(addressSuggestionDecorator.getTitle(), composer2, AbstractC5607a.f45514b), null, composer2, i11 | (q1.Label.f140080j << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(4)), composer2, 6);
            composer2.startReplaceGroup(568432861);
            Map<String, Boolean> mapC = addressSuggestionDecorator.c();
            ArrayList arrayList = new ArrayList(mapC.size());
            for (Map.Entry<String, Boolean> entry : mapC.entrySet()) {
                String key = entry.getKey();
                composer2.startReplaceGroup(568435912);
                if (key != null && key.length() != 0) {
                    ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, entry.getValue().booleanValue() ? localThemeScope.getAdsTypography().getBodyCompact().getTwo().f(FontWeight.INSTANCE.a()) : localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), key, null, composer2, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                }
                composer.P();
                arrayList.add(Unit.f142422a);
                composer2 = composer;
            }
            composer.P();
            composer.v();
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(final Ji.LocalThemeScope r24, final Sh.AddressSuggestionDecorator r25, androidx.compose.ui.Modifier r26, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.C3825u.d(Ji.M, Sh.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, AddressSuggestionDecorator addressSuggestionDecorator) {
        function1.invoke(new a.SelectAddressSuggestion(addressSuggestionDecorator.getTitle()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, AddressSuggestionDecorator addressSuggestionDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, addressSuggestionDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6 A[LOOP:0: B:73:0x01a0->B:75:0x01a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r26, final java.util.List<Sh.AddressSuggestionDecorator> r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.C3825u.g(Ji.M, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, List list, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, list, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
