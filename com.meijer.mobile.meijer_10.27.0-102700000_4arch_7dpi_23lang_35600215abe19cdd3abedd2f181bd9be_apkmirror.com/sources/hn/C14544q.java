package hn;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import gn.ReadOnlyProductListDecorator;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.C14898A;
import ji.j1;
import ji.q1;
import kotlin.C17988z0;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import tr.C17134a;
import tr.C17135b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u001ac\u0010\r\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0016\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001b²\u0006\u000e\u0010\u0018\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lgn/r;", "decorator", "Lkotlin/Function0;", "", "onAddCartButton", "onSavingsPressed", "viewAppliedOffer", "", "isPostOrderComplexPromoEnabled", "isPostOrder", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/r;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "", "note", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "viewAppliedOfferClicked", "", "appliedOffersCount", "h", "(LJi/M;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)V", "lastAction", "isOnSale", "outOfStock", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hn.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14544q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.q$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136041b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReadOnlyProductListDecorator f136042c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.q$a$a, reason: collision with other inner class name */
        static final class C2157a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136043a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReadOnlyProductListDecorator f136044b;

            C2157a(LocalThemeScope localThemeScope, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
                this.f136043a = localThemeScope;
                this.f136044b = readOnlyProductListDecorator;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-656361442, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderPurchasedItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderPurchasedItem.kt:176)");
                }
                LocalThemeScope localThemeScope = this.f136043a;
                q1.Label label = new q1.Label(null, this.f136043a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                String upperCase = C6408b.a(this.f136044b.q(), composer, AbstractC5607a.f45514b).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, ReadOnlyProductListDecorator readOnlyProductListDecorator) {
            this.f136040a = localThemeScope;
            this.f136041b = function0;
            this.f136042c = readOnlyProductListDecorator;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1437177877, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderPurchasedItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderPurchasedItem.kt:170)");
            }
            E0.b(this.f136040a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), null, false, null, 959, null), this.f136041b, ComposableLambdaKt.c(-656361442, true, new C2157a(this.f136040a, this.f136042c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.q$b */
    static final class b implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136045a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136046b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.q$b$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136047a;

            a(LocalThemeScope localThemeScope) {
                this.f136047a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1908886393, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderPurchasedItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderPurchasedItem.kt:196)");
                }
                LocalThemeScope localThemeScope = this.f136047a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f136047a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C16193g.c(C17135b.f162015d, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        b(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f136045a = localThemeScope;
            this.f136046b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-654203628, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderPurchasedItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderPurchasedItem.kt:189)");
            }
            E0.b(this.f136045a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.e(0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, H1.h.p(24), 0.0f, 2, null), false, null, 831, null), this.f136046b, ComposableLambdaKt.c(-1908886393, true, new a(this.f136045a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.q$c */
    static final class c implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f136048a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136049b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f136050c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.q$c$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f136051a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f136052b;

            a(int i10, LocalThemeScope localThemeScope) {
                this.f136051a = i10;
                this.f136052b = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1154100015, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ViewAppliedOfferButton.<anonymous>.<anonymous> (OrderPurchasedItem.kt:277)");
                }
                String strA = C6408b.a(AbstractC5607a.INSTANCE.b(C17134a.f161961d, this.f136051a, new Object[0]), composer, AbstractC5607a.f45514b);
                q1.Label label = new q1.Label(null, this.f136052b.getAdsColors().getAdsColorBrandSecondary(), null, null, 0, false, 0, this.f136052b.getAdsTypography().getHeadings().getSix().f(FontWeight.INSTANCE.j()), null, 381, null);
                ri.j.h(this.f136052b, label, strA, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                C17988z0.a(C16190d.c(Bj.i.f2767o, composer, 0), null, null, this.f136052b.getAdsColors().getAdsColorBrandSecondary().getColor(), composer, 48, 4);
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

        c(LocalThemeScope localThemeScope, Function0<Unit> function0, int i10) {
            this.f136048a = localThemeScope;
            this.f136049b = function0;
            this.f136050c = i10;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1714634718, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ViewAppliedOfferButton.<anonymous> (OrderPurchasedItem.kt:271)");
            }
            E0.b(this.f136048a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), null, false, null, 959, null), this.f136049b, ComposableLambdaKt.c(-1154100015, true, new a(this.f136050c, this.f136048a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final java.lang.String r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14544q.d(Ji.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r54, androidx.compose.ui.Modifier r55, gn.ReadOnlyProductListDecorator r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, boolean r60, boolean r61, androidx.compose.runtime.Composer r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14544q.f(Ji.M, androidx.compose.ui.Modifier, gn.r, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, ReadOnlyProductListDecorator readOnlyProductListDecorator, Function0 function0, Function0 function02, Function0 function03, boolean z10, boolean z11, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, readOnlyProductListDecorator, function0, function02, function03, z10, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Function0 function0, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, function0, i10, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }

    private static final void h(final LocalThemeScope localThemeScope, final Function0<Unit> function0, final int i10, Composer composer, final int i11) {
        int i12;
        int i13;
        int i14;
        boolean zD;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(497315010);
        if ((i11 & 6) == 0) {
            if ((i11 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 384) == 0) {
            if (composerStartRestartGroup.d(i10)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(497315010, i12, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.ViewAppliedOfferButton (OrderPurchasedItem.kt:269)");
            }
            Ji.Q.e(localThemeScope, C14898A.f139596a, ComposableLambdaKt.c(1714634718, true, new c(localThemeScope, function0, i10), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (C14898A.f139597b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: hn.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14544q.i(localThemeScope, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
