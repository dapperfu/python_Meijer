package Cq;

import Fq.ShoppingListItem;
import Ji.LocalThemeScope;
import Pq.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14794C;
import ji.q1;
import kotlin.C17927c1;
import kotlin.C17960n1;
import kotlin.C17963o1;
import kotlin.C17985y;
import kotlin.InterfaceC17951k1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¥\u0001\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJi/M;", "LPq/h$h;", "state", "Lx0/c1;", "scaffoldState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFq/c;", "", "onItemSearchIconClicked", "", "isShoppingListIterationTwoEnabled", "isShoppingListIterationThreeEnabled", "LPq/h$e;", "onAction", "LCq/X;", "onNavigationRequest", "LBq/a;", "onShoppingListItemAction", "LBq/b;", "onShoppingListSearchAction", "b", "(LJi/M;LPq/h$h;Lx0/c1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class q0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f4790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4791c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4792d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f4793e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<X, Unit> f4794f;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, Function1<? super h.AbstractC5014e, Unit> function1, Function1<? super X, Unit> function12) {
            this.f4789a = localThemeScope;
            this.f4790b = shoppingListState;
            this.f4791c = interfaceC5730l0;
            this.f4792d = interfaceC5730l02;
            this.f4793e = function1;
            this.f4794f = function12;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(585346958, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous> (ShoppingListWithTopBar.kt:60)");
            }
            i0.c(this.f4789a, this.f4790b.d(), this.f4790b.c(), this.f4791c.getValue().booleanValue(), this.f4792d, null, this.f4793e, this.f4794f, composer, LocalThemeScope.f15770g | 24576, 16);
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
    static final class b implements Function3<C17963o1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4795a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC17951k1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f4796a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Cq.q0$b$a$a, reason: collision with other inner class name */
            static final class C0085a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f4797a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC17951k1 f4798b;

                C0085a(LocalThemeScope localThemeScope, InterfaceC17951k1 interfaceC17951k1) {
                    this.f4797a = localThemeScope;
                    this.f4798b = interfaceC17951k1;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(800804170, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListWithTopBar.kt:80)");
                    }
                    LocalThemeScope localThemeScope = this.f4797a;
                    ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), this.f4797a.getAdsColors().getAdsColorUIBackground01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 380, null), this.f4798b.getMessage(), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope) {
                this.f4796a = localThemeScope;
            }

            public final void a(InterfaceC17951k1 data, Composer composer, int i10) {
                Intrinsics.j(data, "data");
                if (ComposerKt.M()) {
                    ComposerKt.U(-667851289, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous>.<anonymous> (ShoppingListWithTopBar.kt:72)");
                }
                C17985y.a(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.D(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null), H1.h.p(16)), C16692i.c(H1.h.p(4)), this.f4796a.getAdsColors().getAdsColorText01().getColor(), 0L, null, 0.0f, ComposableLambdaKt.c(800804170, true, new C0085a(this.f4796a, data), composer, 54), composer, 1572870, 56);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC17951k1 interfaceC17951k1, Composer composer, Integer num) {
                a(interfaceC17951k1, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope) {
            this.f4795a = localThemeScope;
        }

        public final void a(C17963o1 it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(it) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1767427098, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous> (ShoppingListWithTopBar.kt:71)");
            }
            C17960n1.b(it, null, ComposableLambdaKt.c(-667851289, true, new a(this.f4795a), composer, 54), composer, (i10 & 14) | 384, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C17963o1 c17963o1, Composer composer, Integer num) {
            a(c17963o1, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4799a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f4800b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4801c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4802d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4803e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f4804f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<ShoppingListItem, Unit> f4805g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f4806h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f4807i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f4808j;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, boolean z10, boolean z11, Function1<? super ShoppingListItem, Unit> function1, Function1<? super h.AbstractC5014e, Unit> function12, Function1<? super Bq.a, Unit> function13, Function1<? super Bq.b, Unit> function14) {
            this.f4799a = localThemeScope;
            this.f4800b = shoppingListState;
            this.f4801c = interfaceC5730l0;
            this.f4802d = interfaceC5730l02;
            this.f4803e = z10;
            this.f4804f = z11;
            this.f4805g = function1;
            this.f4806h = function12;
            this.f4807i = function13;
            this.f4808j = function14;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-845628683, i11, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous> (ShoppingListWithTopBar.kt:92)");
            }
            W.b(this.f4799a, this.f4800b, this.f4801c, this.f4802d, this.f4803e, this.f4804f, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), this.f4805g, this.f4806h, this.f4807i, this.f4808j, composer, LocalThemeScope.f15770g | 3456, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r29, final Pq.h.ShoppingListState r30, final kotlin.C17927c1 r31, androidx.compose.ui.Modifier r32, final kotlin.jvm.functions.Function1<? super Fq.ShoppingListItem, kotlin.Unit> r33, boolean r34, boolean r35, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC5014e, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super Cq.X, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super Bq.b, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.q0.b(Ji.M, Pq.h$h, x0.c1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, C17927c1 c17927c1, Modifier modifier, Function1 function1, boolean z10, boolean z11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, shoppingListState, c17927c1, modifier, function1, z10, z11, function12, function13, function14, function15, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }
}
