package com.meijer.mobile.meijer.activity.settings.debug;

import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.activity.settings.debug.C12637h;
import j0.InterfaceC14888I;
import ki.C15191r;
import ki.j1;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a9\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onNavigateUp", "onLaunchSearch", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12637h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.h$a */
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113031a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113032b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.h$a$a, reason: collision with other inner class name */
        static final class C1784a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113033a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f113034b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.h$a$a$a, reason: collision with other inner class name */
            static final class C1785a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113035a;

                C1785a(LocalThemeScope localThemeScope) {
                    this.f113035a = localThemeScope;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1612050548, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugToolbar.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:227)");
                    }
                    C18054z0.a(C16335d.c(C.a.B.f16864e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), "Search Products", null, this.f113035a.getAdsColors().getAdsColorUIBackground01().getColor(), composer, 48, 4);
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

            C1784a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f113033a = localThemeScope;
                this.f113034b = function0;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1167184511, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugToolbar.<anonymous>.<anonymous> (DebugOptionsActivity.kt:226)");
                }
                LocalThemeScope localThemeScope = this.f113033a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f113034b);
                final Function0<Unit> function0 = this.f113034b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12637h.a.C1784a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1612050548, true, new C1785a(this.f113033a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f113031a = localThemeScope;
            this.f113032b = function0;
        }

        public final void a(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1461419419, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugToolbar.<anonymous> (DebugOptionsActivity.kt:225)");
            }
            LocalThemeScope localThemeScope = this.f113031a;
            Ki.Q.e(localThemeScope, C15191r.f142443a, ComposableLambdaKt.c(-1167184511, true, new C1784a(localThemeScope, this.f113032b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15191r.f142444b << 3));
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
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.h$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113036a;

        b(LocalThemeScope localThemeScope) {
            this.f113036a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1872559681, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugToolbar.<anonymous> (DebugOptionsActivity.kt:223)");
            }
            Dr.g.g(this.f113036a, C16338g.c(com.meijer.mobile.meijer.Y.f100585O2, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12637h.c(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
