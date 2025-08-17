package zn;

import Dn.AddressPrediction;
import Dn.I;
import F1.j;
import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import oi.C16088n;
import pi.C16307b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0087\u0001\u0010\u0012\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\n0\u0005H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001c²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LDn/I$d;", "viewState", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "query", "", "updateSearchQueryAction", "Lkotlin/Function0;", "searchSubmitAction", "addManuallyAction", "LDn/A;", "selectedAddress", "onAddressItemClickAction", "i", "(LJi/M;Landroidx/compose/ui/Modifier;LDn/I$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "addressItem", "onAddressItemClick", "f", "(LJi/M;Landroidx/compose/ui/Modifier;LDn/A;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "isAllowManualAdd", "searchQuery", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class V {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f172981b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AddressPrediction f172982c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zn.V$a$a, reason: collision with other inner class name */
        static final class C2794a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172983a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressPrediction f172984b;

            C2794a(LocalThemeScope localThemeScope, AddressPrediction addressPrediction) {
                this.f172983a = localThemeScope;
                this.f172984b = addressPrediction;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1196417939, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressListItemView.<anonymous>.<anonymous>.<anonymous> (SearchDeliveryAddressScreen.kt:157)");
                }
                LocalThemeScope localThemeScope = this.f172983a;
                Ji.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f172983a.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                j.Companion companion2 = F1.j.INSTANCE;
                q1.Label label = new q1.Label(modifierM, null, null, F1.j.h(companion2.a()), 0, false, 1, eight, null, 310, null);
                String primaryText = this.f172984b.getPrimaryText();
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, primaryText, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f172983a;
                ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f172983a.getAdsSpacing().getTwo().getDp(), 0.0f, this.f172983a.getAdsSpacing().getThree().getDp(), 5, null), null, null, F1.j.h(companion2.a()), 0, false, 1, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 310, null), this.f172984b.getSecondaryText(), null, composer, i11 | (i12 << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Modifier modifier, AddressPrediction addressPrediction) {
            this.f172980a = localThemeScope;
            this.f172981b = modifier;
            this.f172982c = addressPrediction;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-868107485, i11, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressListItemView.<anonymous>.<anonymous> (SearchDeliveryAddressScreen.kt:140)");
            }
            LocalThemeScope localThemeScope = this.f172980a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.k.f15407e, null, null, null, 0.0f, this.f172980a.getAdsColors().getAdsColorBrandPrimary(), AdsRow.d(androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, this.f172980a.getAdsSpacing().getSeven().getDp()), P0.e.INSTANCE.i()), 30, null);
            int i12 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, (q1.h.DrawableIcon.f140067h << 3) | i12, 6);
            C16088n.e(this.f172980a, new q1.Column(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(this.f172981b, 0.0f, 1, null), this.f172980a.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null), null, null, 6, null), ComposableLambdaKt.c(-1196417939, true, new C2794a(this.f172980a, this.f172982c), composer, 54), composer, i12 | 384 | (q1.Column.f139985d << 3));
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
    static final class b implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<AddressPrediction, Unit> f172985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AddressPrediction f172986b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super AddressPrediction, Unit> function1, AddressPrediction addressPrediction) {
            this.f172985a = function1;
            this.f172986b = addressPrediction;
        }

        public final void a() {
            this.f172985a.invoke(this.f172986b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f172987f = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AddressPrediction addressPrediction) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f172988f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f172989g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, List list) {
            super(1);
            this.f172988f = function1;
            this.f172989g = list;
        }

        public final Object a(int i10) {
            return this.f172988f.invoke(this.f172989g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f172990f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172991g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f172992h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f172990f = list;
            this.f172991g = localThemeScope;
            this.f172992h = function1;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
            AddressPrediction addressPrediction = (AddressPrediction) this.f172990f.get(i10);
            composer.startReplaceGroup(-987297391);
            LocalThemeScope localThemeScope = this.f172991g;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f172992h) | composer.D(addressPrediction);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(this.f172992h, addressPrediction);
                composer.t(objB);
            }
            composer.P();
            V.f(localThemeScope, companion, addressPrediction, (Function0) objB, composer, LocalThemeScope.f15770g | 48, 0);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final Dn.AddressPrediction r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.V.f(Ji.M, androidx.compose.ui.Modifier, Dn.A, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, AddressPrediction addressPrediction, Function0 function0, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, addressPrediction, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r43, androidx.compose.ui.Modifier r44, Dn.I.SearchAddressViewState r45, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r46, final kotlin.jvm.functions.Function0<kotlin.Unit> r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, kotlin.jvm.functions.Function1<? super Dn.AddressPrediction, kotlin.Unit> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.V.i(Ji.M, androidx.compose.ui.Modifier, Dn.I$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1, String query) {
        Intrinsics.j(query, "query");
        function1.invoke(query);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(I.SearchAddressViewState searchAddressViewState, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        List<AddressPrediction> listC = searchAddressViewState.c();
        LazyColumn.i(listC.size(), null, new d(c.f172987f, listC), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new e(listC, localThemeScope, function1)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, I.SearchAddressViewState searchAddressViewState, Function1 function1, Function0 function0, Function0 function02, Function1 function12, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, searchAddressViewState, function1, function0, function02, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
