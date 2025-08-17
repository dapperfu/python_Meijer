package Kh;

import Dh.AccountChip;
import Dh.ProfileInfo;
import Fh.a;
import Ji.C;
import Ji.LocalThemeScope;
import Kh.X0;
import Rh.ContactUsDecorator;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14794C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aq\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "LDh/c;", "chipItems", "LDh/u;", "profileInfo", "LRh/a;", "contactUsDecorator", "", "isLoggedIn", "isNotificationEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onToggleChanged", "Lkotlin/Function1;", "LFh/a;", "onNavigationRequest", "b", "(LJi/M;Ljava/util/List;LDh/u;LRh/a;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class X0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f16722b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Kh.X0$a$a, reason: collision with other inner class name */
        static final class C0285a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f16723a;

            C0285a(LocalThemeScope localThemeScope) {
                this.f16723a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1878340682, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.YourAccountScreen.<anonymous>.<anonymous> (YourAccountScreen.kt:49)");
                }
                Dr.g.g(this.f16723a, C16193g.c(Fh.h.f10626V5, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1206441866, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.YourAccountScreen.<anonymous> (YourAccountScreen.kt:47)");
            }
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10781s, new Object[0]);
            C.f.d dVar = C.f.d.f15507e;
            LocalThemeScope localThemeScope = this.f16721a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1878340682, true, new C0285a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f16722b);
            final Function1<Fh.a, Unit> function1 = this.f16722b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Kh.W0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return X0.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f16721a = localThemeScope;
            this.f16722b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.k.f10423a);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16724a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16725b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<AccountChip> f16726c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProfileInfo f16727d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ContactUsDecorator f16728e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f16729f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f16730g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f16731h;

        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, LocalThemeScope localThemeScope, List<AccountChip> list, ProfileInfo profileInfo, ContactUsDecorator contactUsDecorator, Function1<? super Fh.a, Unit> function1, boolean z11, Function0<Unit> function0) {
            this.f16724a = z10;
            this.f16725b = localThemeScope;
            this.f16726c = list;
            this.f16727d = profileInfo;
            this.f16728e = contactUsDecorator;
            this.f16729f = function1;
            this.f16730g = z11;
            this.f16731h = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.t.f10433a);
            return Unit.f142422a;
        }

        public final void b(InterfaceC14794C padding, Composer composer, int i10) {
            int i11;
            Intrinsics.j(padding, "padding");
            if ((i10 & 6) == 0) {
                i11 = (composer.V(padding) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1800059677, i11, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.YourAccountScreen.<anonymous> (YourAccountScreen.kt:59)");
            }
            if (this.f16724a) {
                composer.startReplaceGroup(-1383766190);
                LocalThemeScope localThemeScope = this.f16725b;
                List<AccountChip> list = this.f16726c;
                ProfileInfo profileInfo = this.f16727d;
                ContactUsDecorator contactUsDecorator = this.f16728e;
                Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, padding);
                Function1<Fh.a, Unit> function1 = this.f16729f;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f16729f);
                final Function1<Fh.a, Unit> function12 = this.f16729f;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Kh.Y0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return X0.b.c(function12);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                U0.b(localThemeScope, list, profileInfo, contactUsDecorator, modifierH, function1, (Function0) objB, composer, LocalThemeScope.f15770g, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-1383334174);
                a1.b(this.f16725b, this.f16730g, null, this.f16729f, this.f16731h, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            b(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r39, final java.util.List<Dh.AccountChip> r40, final Dh.ProfileInfo r41, final Rh.ContactUsDecorator r42, final boolean r43, final boolean r44, androidx.compose.ui.Modifier r45, final kotlin.jvm.functions.Function0<kotlin.Unit> r46, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.X0.b(Ji.M, java.util.List, Dh.u, Rh.a, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, List list, ProfileInfo profileInfo, ContactUsDecorator contactUsDecorator, boolean z10, boolean z11, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, list, profileInfo, contactUsDecorator, z10, z11, modifier, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
