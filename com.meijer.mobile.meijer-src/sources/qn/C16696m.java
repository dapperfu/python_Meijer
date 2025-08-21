package qn;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import java.util.List;
import java.util.Locale;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import oi.E0;
import p1.C16338g;
import qn.C16696m;
import xo.AbstractC18202b;
import xo.InStoreOrdersItemDecorator;
import xo.OrderHistoryHeaderDecorator;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aU\u0010\u000e\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "isInStoreOrdersEmptyPageVisible", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lxo/b;", "decorators", "Lkotlin/Function1;", "Lzp/b;", "", "orderViewListener", "Lkotlin/Function0;", "onLoadMore", "j", "(LKi/M;ZLandroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lxo/c;", "decorator", "f", "(LKi/M;Lxo/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lxo/a;", "h", "(LKi/M;Lxo/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qn.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16696m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qn.m$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158720a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<DigitalReceipt, Unit> f158721b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InStoreOrdersItemDecorator f158722c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qn.m$a$a, reason: collision with other inner class name */
        static final class C2469a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f158723a;

            C2469a(LocalThemeScope localThemeScope) {
                this.f158723a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1861388586, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreOrderItem.<anonymous>.<anonymous>.<anonymous> (OrderHistoryInStoreOrderTab.kt:177)");
                }
                LocalThemeScope localThemeScope = this.f158723a;
                q1.Label label = new q1.Label(null, this.f158723a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101000ja, composer, 0);
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                String upperCase = strC.toUpperCase(US);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        a(LocalThemeScope localThemeScope, Function1<? super DigitalReceipt, Unit> function1, InStoreOrdersItemDecorator inStoreOrdersItemDecorator) {
            this.f158720a = localThemeScope;
            this.f158721b = function1;
            this.f158722c = inStoreOrdersItemDecorator;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(759105789, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.InStoreOrderItem.<anonymous>.<anonymous> (OrderHistoryInStoreOrderTab.kt:171)");
            }
            LocalThemeScope localThemeScope = this.f158720a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f158721b) | composer.D(this.f158722c);
            final Function1<DigitalReceipt, Unit> function1 = this.f158721b;
            final InStoreOrdersItemDecorator inStoreOrdersItemDecorator = this.f158722c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: qn.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16696m.a.c(function1, inStoreOrdersItemDecorator);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1861388586, true, new C2469a(this.f158720a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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
        public static final Unit c(Function1 function1, InStoreOrdersItemDecorator inStoreOrdersItemDecorator) {
            function1.invoke(inStoreOrdersItemDecorator.getReceipt());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: qn.m$b */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f158724f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC18202b abstractC18202b) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: qn.m$c */
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f158725f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f158726g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f158725f = function1;
            this.f158726g = list;
        }

        public final Object a(int i10) {
            return this.f158725f.invoke(this.f158726g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: qn.m$d */
    public static final class d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f158727f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f158728g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158729h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f158730i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, boolean z10, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f158727f = list;
            this.f158728g = z10;
            this.f158729h = localThemeScope;
            this.f158730i = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            AbstractC18202b abstractC18202b = (AbstractC18202b) this.f158727f.get(i10);
            composer.startReplaceGroup(-1908397262);
            if (abstractC18202b instanceof OrderHistoryHeaderDecorator) {
                composer.startReplaceGroup(-1908332287);
                if (!this.f158728g) {
                    C16696m.f(this.f158729h, (OrderHistoryHeaderDecorator) abstractC18202b, null, composer, LocalThemeScope.f17314g, 2);
                }
                composer.P();
            } else if (abstractC18202b instanceof InStoreOrdersItemDecorator) {
                composer.startReplaceGroup(-1908110482);
                C16696m.h(this.f158729h, (InStoreOrdersItemDecorator) abstractC18202b, this.f158730i, null, composer, LocalThemeScope.f17314g, 4);
                composer.P();
            } else {
                composer.startReplaceGroup(-1908002292);
                composer.P();
            }
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r26, final xo.OrderHistoryHeaderDecorator r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C16696m.f(Ki.M, xo.c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, OrderHistoryHeaderDecorator orderHistoryHeaderDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, orderHistoryHeaderDecorator, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0410  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r56, final xo.InStoreOrdersItemDecorator r57, final kotlin.jvm.functions.Function1<? super zp.DigitalReceipt, kotlin.Unit> r58, androidx.compose.ui.Modifier r59, androidx.compose.runtime.Composer r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C16696m.h(Ki.M, xo.a, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, InStoreOrdersItemDecorator inStoreOrdersItemDecorator, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, inStoreOrdersItemDecorator, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r27, boolean r28, final androidx.compose.ui.Modifier r29, final java.util.List<? extends xo.AbstractC18202b> r30, final kotlin.jvm.functions.Function1<? super zp.DigitalReceipt, kotlin.Unit> r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C16696m.j(Ki.M, boolean, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(List list, boolean z10, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new c(b.f158724f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(list, z10, localThemeScope, function1)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, List list, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, z10, modifier, list, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
