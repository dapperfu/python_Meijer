package eq;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import eq.C13729d;
import j0.InterfaceC14800I;
import kotlin.C17986y0;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001aO\u0010\u000b\u001a\u00020\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000e\u001a\u00020\b*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LJi/M;", "Lak/a;", "title", "Leq/f;", "navigationIcon", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "navigationEvent", "content", "d", "(LJi/M;Lak/a;Leq/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "navigateTo", "f", "(LJi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: eq.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13729d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eq.d$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f129573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129574b;

        a(AbstractC5607a abstractC5607a, LocalThemeScope localThemeScope) {
            this.f129573a = abstractC5607a;
            this.f129574b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(8364109, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.AppBar.<anonymous> (AppBar.kt:46)");
            }
            AbstractC5607a abstractC5607a = this.f129573a;
            if (abstractC5607a != null) {
                N1.b(C6408b.a(abstractC5607a, composer, AbstractC5607a.f45514b), null, this.f129574b.getAdsColors().getAdsColorInverse().getColor(), 0L, null, null, null, 0L, null, null, 0L, F1.t.INSTANCE.b(), false, 1, 0, null, this.f129574b.getAdsTypography().getHeadings().getSix().getStyle(), composer, 0, 3120, 55290);
            }
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
    @SourceDebugExtension
    /* renamed from: eq.d$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Asset f129575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f129576b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eq.d$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Asset f129577a;

            a(Asset asset) {
                this.f129577a = asset;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-470072698, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.AppBar.<anonymous>.<anonymous> (AppBar.kt:61)");
                }
                C17988z0.a(C16190d.c(this.f129577a.getIcon(), composer, 0), C16193g.c(this.f129577a.getContentDescription(), composer, 0), null, 0L, composer, 0, 12);
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

        b(Asset asset, Function0<Unit> function0) {
            this.f129575a = asset;
            this.f129576b = function0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1765991247, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.AppBar.<anonymous> (AppBar.kt:57)");
            }
            if (this.f129575a != null) {
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f129576b);
                final Function0<Unit> function0 = this.f129576b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: eq.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C13729d.b.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C17986y0.a((Function0) objB, null, false, null, ComposableLambdaKt.c(-470072698, true, new a(this.f129575a), composer, 54), composer, 24576, 14);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
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
    /* renamed from: eq.d$c */
    static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f129578a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Composer, ? super Integer, Unit> function2) {
            this.f129578a = function2;
        }

        public final void a(InterfaceC14800I TopAppBar, Composer composer, int i10) {
            Intrinsics.j(TopAppBar, "$this$TopAppBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1173406600, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.AppBar.<anonymous> (AppBar.kt:69)");
            }
            Function2<Composer, Integer, Unit> function2 = this.f129578a;
            if (function2 != null) {
                function2.invoke(composer, 0);
            }
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
    /* renamed from: eq.d$d, reason: collision with other inner class name */
    static final class C2047d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129579a;

        C2047d(LocalThemeScope localThemeScope) {
            this.f129579a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(236835475, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.OptionsMenu.<anonymous> (AppBar.kt:81)");
            }
            C17988z0.a(C16190d.c(Bj.i.f2662I0, composer, 0), C16193g.c(com.meijer.mobile.shopandscan.e.f116990m, composer, 0), null, this.f129579a.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r20, final ak.AbstractC5607a r21, final eq.Asset r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.C13729d.d(Ji.M, ak.a, eq.f, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Asset asset, Modifier modifier, Function0 function0, Function2 function2, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, abstractC5607a, asset, modifier, function0, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void f(final LocalThemeScope localThemeScope, final Function0<Unit> navigateTo, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(navigateTo, "navigateTo");
        Composer composerStartRestartGroup = composer.startRestartGroup(2030886831);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(navigateTo) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2030886831, i11, -1, "com.meijer.mobile.shopandscan.presentation.component.OptionsMenu (AppBar.kt:79)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: eq.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C13729d.g(navigateTo);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C17986y0.a((Function0) objB, null, false, null, ComposableLambdaKt.c(236835475, true, new C2047d(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C13729d.h(localThemeScope, navigateTo, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        f(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
