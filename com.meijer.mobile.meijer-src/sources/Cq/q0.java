package Cq;

import Fq.ShoppingListItem;
import Ki.LocalThemeScope;
import Pq.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14882C;
import ki.q1;
import kotlin.C17993c1;
import kotlin.C18026n1;
import kotlin.C18029o1;
import kotlin.C18051y;
import kotlin.InterfaceC18017k1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16806i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¥\u0001\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LKi/M;", "LPq/h$h;", "state", "Lx0/c1;", "scaffoldState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFq/c;", "", "onItemSearchIconClicked", "", "isShoppingListIterationTwoEnabled", "isShoppingListIterationThreeEnabled", "LPq/h$e;", "onAction", "LCq/X;", "onNavigationRequest", "LBq/a;", "onShoppingListItemAction", "LBq/b;", "onShoppingListSearchAction", "b", "(LKi/M;LPq/h$h;Lx0/c1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class q0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5749a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f5750b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5751c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5752d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5753e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<X, Unit> f5754f;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super h.AbstractC4612e, Unit> function1, Function1<? super X, Unit> function12) {
            this.f5749a = localThemeScope;
            this.f5750b = shoppingListState;
            this.f5751c = interfaceC5872l0;
            this.f5752d = interfaceC5872l02;
            this.f5753e = function1;
            this.f5754f = function12;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(585346958, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous> (ShoppingListWithTopBar.kt:60)");
            }
            i0.c(this.f5749a, this.f5750b.d(), this.f5750b.c(), this.f5751c.getValue().booleanValue(), this.f5752d, null, this.f5753e, this.f5754f, composer, LocalThemeScope.f17314g | 24576, 16);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<C18029o1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5755a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC18017k1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5756a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Cq.q0$b$a$a, reason: collision with other inner class name */
            static final class C0101a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f5757a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC18017k1 f5758b;

                C0101a(LocalThemeScope localThemeScope, InterfaceC18017k1 interfaceC18017k1) {
                    this.f5757a = localThemeScope;
                    this.f5758b = interfaceC18017k1;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(800804170, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous>.<anonymous>.<anonymous> (ShoppingListWithTopBar.kt:80)");
                    }
                    LocalThemeScope localThemeScope = this.f5757a;
                    si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), this.f5757a.getAdsColors().getAdsColorUIBackground01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 380, null), this.f5758b.getMessage(), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope) {
                this.f5756a = localThemeScope;
            }

            public final void a(InterfaceC18017k1 data, Composer composer, int i10) {
                Intrinsics.j(data, "data");
                if (ComposerKt.M()) {
                    ComposerKt.U(-667851289, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListWithTopBar.<anonymous>.<anonymous> (ShoppingListWithTopBar.kt:72)");
                }
                C18051y.a(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.D(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null), H1.h.p(16)), C16806i.c(H1.h.p(4)), this.f5756a.getAdsColors().getAdsColorText01().getColor(), 0L, null, 0.0f, ComposableLambdaKt.c(800804170, true, new C0101a(this.f5756a, data), composer, 54), composer, 1572870, 56);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC18017k1 interfaceC18017k1, Composer composer, Integer num) {
                a(interfaceC18017k1, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope) {
            this.f5755a = localThemeScope;
        }

        public final void a(C18029o1 it, Composer composer, int i10) {
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
            C18026n1.b(it, null, ComposableLambdaKt.c(-667851289, true, new a(this.f5755a), composer, 54), composer, (i10 & 14) | 384, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C18029o1 c18029o1, Composer composer, Integer num) {
            a(c18029o1, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f5760b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5761c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5762d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5763e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5764f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<ShoppingListItem, Unit> f5765g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5766h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f5767i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f5768j;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, boolean z10, boolean z11, Function1<? super ShoppingListItem, Unit> function1, Function1<? super h.AbstractC4612e, Unit> function12, Function1<? super Bq.a, Unit> function13, Function1<? super Bq.b, Unit> function14) {
            this.f5759a = localThemeScope;
            this.f5760b = shoppingListState;
            this.f5761c = interfaceC5872l0;
            this.f5762d = interfaceC5872l02;
            this.f5763e = z10;
            this.f5764f = z11;
            this.f5765g = function1;
            this.f5766h = function12;
            this.f5767i = function13;
            this.f5768j = function14;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
            W.b(this.f5759a, this.f5760b, this.f5761c, this.f5762d, this.f5763e, this.f5764f, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), this.f5765g, this.f5766h, this.f5767i, this.f5768j, composer, LocalThemeScope.f17314g | 3456, 0, 0);
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
    public static final void b(final Ki.LocalThemeScope r29, final Pq.h.ShoppingListState r30, final kotlin.C17993c1 r31, androidx.compose.ui.Modifier r32, final kotlin.jvm.functions.Function1<? super Fq.ShoppingListItem, kotlin.Unit> r33, boolean r34, boolean r35, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super Cq.X, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super Bq.b, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.q0.b(Ki.M, Pq.h$h, x0.c1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, h.ShoppingListState shoppingListState, C17993c1 c17993c1, Modifier modifier, Function1 function1, boolean z10, boolean z11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, shoppingListState, c17993c1, modifier, function1, z10, z11, function12, function13, function14, function15, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }
}
