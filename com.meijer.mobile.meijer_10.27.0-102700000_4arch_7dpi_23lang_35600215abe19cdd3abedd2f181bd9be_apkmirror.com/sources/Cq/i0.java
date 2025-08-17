package Cq;

import Cq.X;
import Cq.i0;
import Fq.ShoppingListItem;
import Ji.C;
import Ji.LocalThemeScope;
import Pq.h;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import java.util.Locale;
import ji.q1;
import kotlin.C17937g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15803G;
import ni.C15864u0;
import ni.P0;
import p1.C16193g;
import yr.C18299z;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aw\u0010\u0011\u001a\u00020\r*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "LFq/c;", "inProgressList", "completedList", "", "isSearchFocused", "Landroidx/compose/runtime/l0;", "isInEditMode", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LCq/X;", "onNavigationRequest", "c", "(LJi/M;Ljava/util/List;Ljava/util/List;ZLandroidx/compose/runtime/l0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showMenu", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class i0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f4707c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4708d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f4709e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f4710f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4711g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f4712h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f4713i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Cq.i0$a$a, reason: collision with other inner class name */
        static final class C0082a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ShoppingListItem> f4714a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f4715b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<h.AbstractC5014e, Unit> f4716c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f4717d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f4718e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f4719f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Cq.i0$a$a$a, reason: collision with other inner class name */
            static final class C0083a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f4720a;

                C0083a(LocalThemeScope localThemeScope) {
                    this.f4720a = localThemeScope;
                }

                public final void a(InterfaceC14800I DropdownMenuItem, Composer composer, int i10) {
                    Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1176017528, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListTopBar.kt:105)");
                    }
                    ri.j.h(this.f4720a, new q1.Label(null, null, null, null, 0, false, 0, this.f4720a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(Aq.b.f1497r, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
            /* renamed from: Cq.i0$a$a$b */
            static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f4721a;

                b(LocalThemeScope localThemeScope) {
                    this.f4721a = localThemeScope;
                }

                public final void a(InterfaceC14800I DropdownMenuItem, Composer composer, int i10) {
                    Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-315135873, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListTopBar.kt:120)");
                    }
                    ri.j.h(this.f4721a, new q1.Label(null, null, null, null, 0, false, 0, this.f4721a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(Aq.b.f1465J, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
            /* renamed from: Cq.i0$a$a$c */
            static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f4722a;

                c(LocalThemeScope localThemeScope) {
                    this.f4722a = localThemeScope;
                }

                public final void a(InterfaceC14800I DropdownMenuItem, Composer composer, int i10) {
                    Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(541292973, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListTopBar.kt:141)");
                    }
                    ri.j.h(this.f4722a, new q1.Label(null, null, null, null, 0, false, 0, this.f4722a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(Aq.b.f1489j, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            /* JADX WARN: Multi-variable type inference failed */
            C0082a(List<ShoppingListItem> list, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super h.AbstractC5014e, Unit> function1, Context context, InterfaceC5730l0<Boolean> interfaceC5730l02, LocalThemeScope localThemeScope) {
                this.f4714a = list;
                this.f4715b = interfaceC5730l0;
                this.f4716c = function1;
                this.f4717d = context;
                this.f4718e = interfaceC5730l02;
                this.f4719f = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(InterfaceC5730l0 interfaceC5730l0, Function1 function1, InterfaceC5730l0 interfaceC5730l02) {
                interfaceC5730l0.setValue(Boolean.TRUE);
                function1.invoke(h.AbstractC5014e.C0663e.f28498a);
                i0.e(interfaceC5730l02, false);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1, List list, InterfaceC5730l0 interfaceC5730l0) {
                function1.invoke(new h.AbstractC5014e.ShareList(list));
                i0.e(interfaceC5730l0, false);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(Context context, final Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
                new Pj.m(context, Aq.b.f1468M, new String[0]).E(new DialogInterface.OnClickListener() { // from class: Cq.h0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        i0.a.C0082a.l(function1, dialogInterface, i10);
                    }
                }).g();
                function1.invoke(h.AbstractC5014e.d.f28497a);
                i0.e(interfaceC5730l0, false);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void l(Function1 function1, DialogInterface dialogInterface, int i10) {
                function1.invoke(h.AbstractC5014e.a.f28494a);
            }

            public final void e(InterfaceC14814f DropdownMenu, Composer composer, int i10) {
                Intrinsics.j(DropdownMenu, "$this$DropdownMenu");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1745389712, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous>.<anonymous> (ShoppingListTopBar.kt:96)");
                }
                composer.startReplaceGroup(2012701476);
                if (!this.f4714a.isEmpty()) {
                    composer.startReplaceGroup(-1746271574);
                    boolean zV = composer.V(this.f4715b) | composer.V(this.f4716c);
                    final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f4715b;
                    final Function1<h.AbstractC5014e, Unit> function1 = this.f4716c;
                    final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f4718e;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Cq.e0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i0.a.C0082a.f(interfaceC5730l0, function1, interfaceC5730l02);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C17937g.b((Function0) objB, C18299z.f(companion, "top_bar_drop_down_edit_mode", null, 2, null), false, null, null, ComposableLambdaKt.c(-1176017528, true, new C0083a(this.f4719f), composer, 54), composer, 196608, 28);
                    composer.startReplaceGroup(-1746271574);
                    boolean zV2 = composer.V(this.f4716c) | composer.D(this.f4714a);
                    final Function1<h.AbstractC5014e, Unit> function12 = this.f4716c;
                    final List<ShoppingListItem> list = this.f4714a;
                    final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f4718e;
                    Object objB2 = composer.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: Cq.f0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i0.a.C0082a.g(function12, list, interfaceC5730l03);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C17937g.b((Function0) objB2, C18299z.f(companion, "top_bar_drop_down_share_list", null, 2, null), false, null, null, ComposableLambdaKt.c(-315135873, true, new b(this.f4719f), composer, 54), composer, 196608, 28);
                }
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f4717d) | composer.V(this.f4716c);
                final Context context = this.f4717d;
                final Function1<h.AbstractC5014e, Unit> function13 = this.f4716c;
                final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f4718e;
                Object objB3 = composer.B();
                if (zD || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Cq.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.C0082a.k(context, function13, interfaceC5730l04);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C17937g.b((Function0) objB3, C18299z.f(Modifier.INSTANCE, "top_bar_drop_down_clear_list", null, 2, null), false, null, null, ComposableLambdaKt.c(541292973, true, new c(this.f4719f), composer, 54), composer, 196608, 28);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                e(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5772o interfaceC5772o) {
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5730l0 interfaceC5730l0) {
            i0.e(interfaceC5730l0, false);
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, LocalThemeScope localThemeScope, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<Boolean> interfaceC5730l0, List<ShoppingListItem> list, List<ShoppingListItem> list2, InterfaceC5730l0<Boolean> interfaceC5730l02, Function1<? super h.AbstractC5014e, Unit> function1, Context context) {
            this.f4705a = z10;
            this.f4706b = localThemeScope;
            this.f4707c = interfaceC5772o;
            this.f4708d = interfaceC5730l0;
            this.f4709e = list;
            this.f4710f = list2;
            this.f4711g = interfaceC5730l02;
            this.f4712h = function1;
            this.f4713i = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0) {
            interfaceC5730l0.setValue(Boolean.FALSE);
            return Unit.f142422a;
        }

        public final void e(InterfaceC14800I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1930060931, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous> (ShoppingListTopBar.kt:64)");
            }
            if (this.f4705a) {
                composer.startReplaceGroup(-1717933807);
                LocalThemeScope localThemeScope = this.f4706b;
                C15803G c15803g = C15803G.f151439a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f4707c);
                final InterfaceC5772o interfaceC5772o = this.f4707c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Cq.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.f(interfaceC5772o);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.i(localThemeScope, c15803g, (Function0) objB, C.f.o.f15522e, C16193g.c(Bj.o.f3043t, composer, 0), C18299z.f(Modifier.INSTANCE, "top_bar_close", null, 2, null), false, false, 0L, composer, LocalThemeScope.f15770g | (C15803G.f151440b << 3) | (C.f.o.f15523f << 9), 224);
                composer.P();
            } else if (this.f4708d.getValue().booleanValue()) {
                composer.startReplaceGroup(-1717432661);
                C15864u0 c15864u0 = C15864u0.f151801a;
                String upperCase = C16193g.c(Aq.b.f1494o, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                Modifier modifierF = C18299z.f(Modifier.INSTANCE, "top_bar_done", null, 2, null);
                LocalThemeScope localThemeScope2 = this.f4706b;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f4708d);
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f4708d;
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Cq.b0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.g(interfaceC5730l0);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope2, c15864u0, upperCase, (Function0) objB2, modifierF, null, false, 0L, false, composer, LocalThemeScope.f15770g | (C15864u0.f151802b << 3), 240);
                composer.P();
            } else if (this.f4709e.isEmpty() && this.f4710f.isEmpty()) {
                composer.startReplaceGroup(-1716497019);
                composer.P();
            } else {
                composer.startReplaceGroup(-1716976031);
                LocalThemeScope localThemeScope3 = this.f4706b;
                C15803G c15803g2 = C15803G.f151439a;
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f4711g;
                Object objB3 = composer.B();
                if (objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Cq.c0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.a.k(interfaceC5730l02);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                P0.i(localThemeScope3, c15803g2, (Function0) objB3, C.a.w.f15363e, C16193g.c(Aq.b.f1457B, composer, 0), C18299z.f(Modifier.INSTANCE, "top_bar_more_content", null, 2, null), false, false, 0L, composer, LocalThemeScope.f15770g | 384 | (C15803G.f151440b << 3) | (C.a.w.f15364f << 9), 224);
                composer.P();
            }
            boolean zD2 = i0.d(this.f4711g);
            composer.startReplaceGroup(5004770);
            final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f4711g;
            Object objB4 = composer.B();
            if (objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function0() { // from class: Cq.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i0.a.l(interfaceC5730l03);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C17937g.a(zD2, (Function0) objB4, null, 0L, null, null, ComposableLambdaKt.c(-1745389712, true, new C0082a(this.f4709e, this.f4708d, this.f4712h, this.f4713i, this.f4711g, this.f4706b), composer, 54), composer, 1572912, 60);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            e(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5730l0 interfaceC5730l0) {
            i0.e(interfaceC5730l0, !i0.d(interfaceC5730l0));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4723a;

        b(LocalThemeScope localThemeScope) {
            this.f4723a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-438618781, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListTopBar.<anonymous> (ShoppingListTopBar.kt:59)");
            }
            Dr.g.g(this.f4723a, C16193g.c(Aq.b.f1475T, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
    public static final void c(final Ji.LocalThemeScope r19, final java.util.List<Fq.ShoppingListItem> r20, final java.util.List<Fq.ShoppingListItem> r21, final boolean r22, final androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC5014e, kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super Cq.X, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.i0.c(Ji.M, java.util.List, java.util.List, boolean, androidx.compose.runtime.l0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1) {
        function1.invoke(X.b.f4639a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, List list, List list2, boolean z10, InterfaceC5730l0 interfaceC5730l0, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, list, list2, z10, interfaceC5730l0, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
