package Cq;

import Cq.X;
import Cq.m0;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import j0.C14896Q;
import j0.InterfaceC14882C;
import j0.InterfaceC14894O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LCq/X;", "", "onNavigationRequest", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lj0/C;", "paddingValues", "c", "(LKi/M;Lj0/C;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class m0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5707a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<X, Unit> f5708b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cq.m0$a$a, reason: collision with other inner class name */
        static final class C0100a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5709a;

            C0100a(LocalThemeScope localThemeScope) {
                this.f5709a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-212253524, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListUnauthScreen.<anonymous>.<anonymous> (ShoppingListUnauthScreen.kt:56)");
                }
                Dr.g.g(this.f5709a, C16338g.c(Aq.b.f1972T, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2121830036, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListUnauthScreen.<anonymous> (ShoppingListUnauthScreen.kt:55)");
            }
            LocalThemeScope localThemeScope = this.f5707a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-212253524, true, new C0100a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f5708b);
            final Function1<X, Unit> function1 = this.f5708b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Cq.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f17051e, 0.0f, false, AbstractC6392a.INSTANCE.d(Aq.b.f1972T, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super X, Unit> function1) {
            this.f5707a = localThemeScope;
            this.f5708b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(X.b.f5599a);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5710a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<X, Unit> f5711b;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super X, Unit> function1) {
            this.f5710a = localThemeScope;
            this.f5711b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1) {
            function1.invoke(X.c.f5600a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(X.a.f5598a);
            return Unit.f143329a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1780138315, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListUnauthScreen.<anonymous> (ShoppingListUnauthScreen.kt:63)");
            }
            String strC = C16338g.c(Cj.o.f5016F0, composer, 0);
            String strC2 = C16338g.c(Cj.o.f5090u, composer, 0);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C14896Q.e(j0.W.c(InterfaceC14894O.INSTANCE, composer, 6), composer, 0).getBottom(), 7, null);
            LocalThemeScope localThemeScope = this.f5710a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f5711b);
            final Function1<X, Unit> function1 = this.f5711b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Cq.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.b.d(function1);
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f5711b);
            final Function1<X, Unit> function12 = this.f5711b;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Cq.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.b.e(function12);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            yr.l0.d(localThemeScope, strC, strC2, modifierM, function0, (Function0) objB2, composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5712a;

        c(LocalThemeScope localThemeScope) {
            this.f5712a = localThemeScope;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-834949549, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListUnauthScreen.<anonymous> (ShoppingListUnauthScreen.kt:78)");
            }
            m0.c(this.f5712a, paddingValues, null, composer, LocalThemeScope.f17314g | ((i10 << 3) & 112), 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r38, final j0.InterfaceC14882C r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.m0.c(Ki.M, j0.C, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, InterfaceC14882C interfaceC14882C, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, interfaceC14882C, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function1<? super Cq.X, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.m0.e(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
