package Cq;

import Cq.X;
import Cq.i0;
import Fq.ShoppingListItem;
import Ki.C;
import Ki.LocalThemeScope;
import Pq.h;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import java.util.Locale;
import ki.q1;
import kotlin.C18003g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16137G;
import oi.C16198u0;
import oi.P0;
import p1.C16338g;
import yr.C18370z;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aw\u0010\u0011\u001a\u00020\r*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "LFq/c;", "inProgressList", "completedList", "", "isSearchFocused", "Landroidx/compose/runtime/l0;", "isInEditMode", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LCq/X;", "onNavigationRequest", "c", "(LKi/M;Ljava/util/List;Ljava/util/List;ZLandroidx/compose/runtime/l0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showMenu", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class i0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f5667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5668d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f5669e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f5670f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5671g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5672h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f5673i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Cq.i0$a$a, reason: collision with other inner class name */
        static final class C0098a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ShoppingListItem> f5674a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f5675b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5676c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f5677d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f5678e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5679f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Cq.i0$a$a$a, reason: collision with other inner class name */
            static final class C0099a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f5680a;

                C0099a(LocalThemeScope localThemeScope) {
                    this.f5680a = localThemeScope;
                }

                public final void a(InterfaceC14888I DropdownMenuItem, Composer composer, int i10) {
                    Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1176017528, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListTopBar.kt:105)");
                    }
                    si.j.h(this.f5680a, new q1.Label(null, null, null, null, 0, false, 0, this.f5680a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(Aq.b.f1994r, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
            /* renamed from: Cq.i0$a$a$b */
            static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f5681a;

                b(LocalThemeScope localThemeScope) {
                    this.f5681a = localThemeScope;
                }

                public final void a(InterfaceC14888I DropdownMenuItem, Composer composer, int i10) {
                    Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-315135873, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListTopBar.kt:120)");
                    }
                    si.j.h(this.f5681a, new q1.Label(null, null, null, null, 0, false, 0, this.f5681a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(Aq.b.f1962J, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
            /* renamed from: Cq.i0$a$a$c */
            static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f5682a;

                c(LocalThemeScope localThemeScope) {
                    this.f5682a = localThemeScope;
                }

                public final void a(InterfaceC14888I DropdownMenuItem, Composer composer, int i10) {
                    Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(541292973, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListTopBar.kt:141)");
                    }
                    si.j.h(this.f5682a, new q1.Label(null, null, null, null, 0, false, 0, this.f5682a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(Aq.b.f1986j, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            /* JADX WARN: Multi-variable type inference failed */
            C0098a(List<ShoppingListItem> list, InterfaceC5872l0<Boolean> interfaceC5872l0, Function1<? super h.AbstractC4612e, Unit> function1, Context context, InterfaceC5872l0<Boolean> interfaceC5872l02, LocalThemeScope localThemeScope) {
                this.f5674a = list;
                this.f5675b = interfaceC5872l0;
                this.f5676c = function1;
                this.f5677d = context;
                this.f5678e = interfaceC5872l02;
                this.f5679f = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(InterfaceC5872l0 interfaceC5872l0, Function1 function1, InterfaceC5872l0 interfaceC5872l02) {
                interfaceC5872l0.setValue(Boolean.TRUE);
                function1.invoke(h.AbstractC4612e.C0483e.f26380a);
                i0.e(interfaceC5872l02, false);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1, List list, InterfaceC5872l0 interfaceC5872l0) {
                function1.invoke(new h.AbstractC4612e.ShareList(list));
                i0.e(interfaceC5872l0, false);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(Context context, final Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
                new Qj.m(context, Aq.b.f1965M, new String[0]).E(new DialogInterface.OnClickListener() { // from class: Cq.h0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        i0.a.C0098a.l(function1, dialogInterface, i10);
                    }
                }).g();
                function1.invoke(h.AbstractC4612e.d.f26379a);
                i0.e(interfaceC5872l0, false);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void l(Function1 function1, DialogInterface dialogInterface, int i10) {
                function1.invoke(h.AbstractC4612e.a.f26376a);
            }

            public final void e(InterfaceC14902f DropdownMenu, Composer composer, int i10) {
                Intrinsics.j(DropdownMenu, "$this$DropdownMenu");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1745389712, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous> (ShoppingListTopBar.kt:96)");
                }
                composer.startReplaceGroup(2012701476);
                if (!this.f5674a.isEmpty()) {
                    composer.startReplaceGroup(-1746271574);
                    boolean zV = composer.V(this.f5675b) | composer.V(this.f5676c);
                    final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f5675b;
                    final Function1<h.AbstractC4612e, Unit> function1 = this.f5676c;
                    final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f5678e;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Cq.e0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i0.a.C0098a.f(interfaceC5872l0, function1, interfaceC5872l02);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C18003g.b((Function0) objB, C18370z.f(companion, "top_bar_drop_down_edit_mode", null, 2, null), false, null, null, ComposableLambdaKt.c(-1176017528, true, new C0099a(this.f5679f), composer, 54), composer, 196608, 28);
                    composer.startReplaceGroup(-1746271574);
                    boolean zV2 = composer.V(this.f5676c) | composer.D(this.f5674a);
                    final Function1<h.AbstractC4612e, Unit> function12 = this.f5676c;
                    final List<ShoppingListItem> list = this.f5674a;
                    final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f5678e;
                    Object objB2 = composer.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: Cq.f0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i0.a.C0098a.g(function12, list, interfaceC5872l03);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C18003g.b((Function0) objB2, C18370z.f(companion, "top_bar_drop_down_share_list", null, 2, null), false, null, null, ComposableLambdaKt.c(-315135873, true, new b(this.f5679f), composer, 54), composer, 196608, 28);
                }
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f5677d) | composer.V(this.f5676c);
                final Context context = this.f5677d;
                final Function1<h.AbstractC4612e, Unit> function13 = this.f5676c;
                final InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f5678e;
                Object objB3 = composer.B();
                if (zD || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Cq.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.C0098a.k(context, function13, interfaceC5872l04);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C18003g.b((Function0) objB3, C18370z.f(Modifier.INSTANCE, "top_bar_drop_down_clear_list", null, 2, null), false, null, null, ComposableLambdaKt.c(541292973, true, new c(this.f5679f), composer, 54), composer, 196608, 28);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                e(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5914o interfaceC5914o) {
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5872l0 interfaceC5872l0) {
            i0.e(interfaceC5872l0, false);
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, LocalThemeScope localThemeScope, InterfaceC5914o interfaceC5914o, InterfaceC5872l0<Boolean> interfaceC5872l0, List<ShoppingListItem> list, List<ShoppingListItem> list2, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super h.AbstractC4612e, Unit> function1, Context context) {
            this.f5665a = z10;
            this.f5666b = localThemeScope;
            this.f5667c = interfaceC5914o;
            this.f5668d = interfaceC5872l0;
            this.f5669e = list;
            this.f5670f = list2;
            this.f5671g = interfaceC5872l02;
            this.f5672h = function1;
            this.f5673i = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.FALSE);
            return Unit.f143329a;
        }

        public final void e(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1930060931, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous> (ShoppingListTopBar.kt:64)");
            }
            if (this.f5665a) {
                composer.startReplaceGroup(-1717933807);
                LocalThemeScope localThemeScope = this.f5666b;
                C16137G c16137g = C16137G.f153898a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f5667c);
                final InterfaceC5914o interfaceC5914o = this.f5667c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Cq.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.f(interfaceC5914o);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.i(localThemeScope, c16137g, (Function0) objB, C.f.o.f17066e, C16338g.c(Cj.o.f5088t, composer, 0), C18370z.f(Modifier.INSTANCE, "top_bar_close", null, 2, null), false, false, 0L, composer, LocalThemeScope.f17314g | (C16137G.f153899b << 3) | (C.f.o.f17067f << 9), 224);
                composer.P();
            } else if (this.f5668d.getValue().booleanValue()) {
                composer.startReplaceGroup(-1717432661);
                C16198u0 c16198u0 = C16198u0.f154260a;
                String upperCase = C16338g.c(Aq.b.f1991o, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                Modifier modifierF = C18370z.f(Modifier.INSTANCE, "top_bar_done", null, 2, null);
                LocalThemeScope localThemeScope2 = this.f5666b;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f5668d);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f5668d;
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Cq.b0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.g(interfaceC5872l0);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope2, c16198u0, upperCase, (Function0) objB2, modifierF, null, false, 0L, false, composer, LocalThemeScope.f17314g | (C16198u0.f154261b << 3), 240);
                composer.P();
            } else if (this.f5669e.isEmpty() && this.f5670f.isEmpty()) {
                composer.startReplaceGroup(-1716497019);
                composer.P();
            } else {
                composer.startReplaceGroup(-1716976031);
                LocalThemeScope localThemeScope3 = this.f5666b;
                C16137G c16137g2 = C16137G.f153898a;
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f5671g;
                Object objB3 = composer.B();
                if (objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Cq.c0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.k(interfaceC5872l02);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                P0.i(localThemeScope3, c16137g2, (Function0) objB3, C.a.w.f16907e, C16338g.c(Aq.b.f1954B, composer, 0), C18370z.f(Modifier.INSTANCE, "top_bar_more_content", null, 2, null), false, false, 0L, composer, LocalThemeScope.f17314g | 384 | (C16137G.f153899b << 3) | (C.a.w.f16908f << 9), 224);
                composer.P();
            }
            boolean zD2 = i0.d(this.f5671g);
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f5671g;
            Object objB4 = composer.B();
            if (objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function0() { // from class: Cq.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i0.a.l(interfaceC5872l03);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C18003g.a(zD2, (Function0) objB4, null, 0L, null, null, ComposableLambdaKt.c(-1745389712, true, new C0098a(this.f5669e, this.f5668d, this.f5672h, this.f5673i, this.f5671g, this.f5666b), composer, 54), composer, 1572912, 60);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            e(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5872l0 interfaceC5872l0) {
            i0.e(interfaceC5872l0, !i0.d(interfaceC5872l0));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5683a;

        b(LocalThemeScope localThemeScope) {
            this.f5683a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-438618781, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous> (ShoppingListTopBar.kt:59)");
            }
            Dr.g.g(this.f5683a, C16338g.c(Aq.b.f1972T, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r19, final java.util.List<Fq.ShoppingListItem> r20, final java.util.List<Fq.ShoppingListItem> r21, final boolean r22, final androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super Cq.X, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.i0.c(Ki.M, java.util.List, java.util.List, boolean, androidx.compose.runtime.l0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1) {
        function1.invoke(X.b.f5599a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, List list, List list2, boolean z10, InterfaceC5872l0 interfaceC5872l0, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, list, list2, z10, interfaceC5872l0, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
