package jm;

import Ji.LocalThemeScope;
import Wl.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import j0.C14802K;
import j0.InterfaceC14800I;
import jm.C15011a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15860s0;
import ni.C15866v0;
import p1.C16193g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LWl/a;", "", "onNavigationRequest", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jm.a0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15011a0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: jm.a0$a */
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f140615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Wl.a, Unit> f140616b;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super Wl.a, Unit> function1) {
            this.f140615a = localThemeScope;
            this.f140616b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1) {
            function1.invoke(a.b.f38712a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(a.j.f38720a);
            return Unit.f142422a;
        }

        public final void c(InterfaceC14800I BottomAppBar, Composer composer, int i10) {
            int i11;
            Intrinsics.j(BottomAppBar, "$this$BottomAppBar");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(BottomAppBar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2058827715, i11, -1, "com.meijer.mobile.home.ux.views.HomeScreenBottomBar.<anonymous> (HomeScreenBottomBar.kt:45)");
            }
            LocalThemeScope localThemeScope = this.f140615a;
            C15866v0 c15866v0 = C15866v0.f151806a;
            String strC = C16193g.c(Bj.o.f3045u, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f140616b);
            final Function1<Wl.a, Unit> function1 = this.f140616b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: jm.Y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15011a0.a.d(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierB = InterfaceC14800I.b(BottomAppBar, companion, 1.0f, false, 2, null);
            int i12 = LocalThemeScope.f15770g;
            ni.P0.k(localThemeScope, c15866v0, strC, (Function0) objB, modifierB, null, false, 0L, false, composer, i12 | (C15866v0.f151807b << 3), 240);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
            LocalThemeScope localThemeScope2 = this.f140615a;
            C15860s0 c15860s0 = C15860s0.f151792a;
            String strC2 = C16193g.c(Bj.o.f2971F0, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f140616b);
            final Function1<Wl.a, Unit> function12 = this.f140616b;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: jm.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15011a0.a.e(function12);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            ni.P0.k(localThemeScope2, c15860s0, strC2, (Function0) objB2, InterfaceC14800I.b(BottomAppBar, companion, 1.0f, false, 2, null), null, false, 0L, false, composer, i12 | (C15860s0.f151793b << 3), 240);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            c(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function1<? super Wl.a, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.C15011a0.b(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
