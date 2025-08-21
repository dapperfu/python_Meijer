package com.meijer.mobile.meijer.activity.cart;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a9\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onPrimaryButtonClick", "onSecondaryButtonClick", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class o1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102787b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.o1$a$a, reason: collision with other inner class name */
        static final class C1437a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102788a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f102789b;

            C1437a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f102788a = localThemeScope;
                this.f102789b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(838208960, i10, -1, "com.meijer.mobile.meijer.activity.cart.BottomBar.<anonymous>.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:174)");
                }
                si.j.h(this.f102788a, this.f102789b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.meijer.Y.f101226ug, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f102786a = localThemeScope;
            this.f102787b = function0;
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(559723475, i10, -1, "com.meijer.mobile.meijer.activity.cart.BottomBar.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:166)");
            }
            oi.E0.b(this.f102786a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null), H1.h.p(16), 0.0f, 2, null), false, null, 895, null), this.f102787b, ComposableLambdaKt.c(838208960, true, new C1437a(this.f102786a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102791b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102792a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f102793b;

            a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f102792a = localThemeScope;
                this.f102793b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(66625463, i10, -1, "com.meijer.mobile.meijer.activity.cart.BottomBar.<anonymous>.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:191)");
                }
                si.j.h(this.f102792a, this.f102793b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.meijer.Y.f100345Bd, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        b(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f102790a = localThemeScope;
            this.f102791b = function0;
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1269953270, i10, -1, "com.meijer.mobile.meijer.activity.cart.BottomBar.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:183)");
            }
            oi.E0.b(this.f102790a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null), H1.h.p(16), 0.0f, 2, null), false, null, 895, null), this.f102791b, ComposableLambdaKt.c(66625463, true, new a(this.f102790a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.cart.o1.b(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
