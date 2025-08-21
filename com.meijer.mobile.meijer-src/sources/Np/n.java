package Np;

import Ki.LocalThemeScope;
import Mp.ProductScanItem;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14888I;
import java.util.List;
import java.util.Locale;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import l0.w;
import oi.C16196t0;
import oi.P0;
import p1.C16338g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014²\u0006\u000e\u0010\u0010\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "LMp/h;", "productList", "", "headerLabel", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDoneClicked", "d", "(LKi/M;Ljava/util/List;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "product", "g", "(LKi/M;LMp/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lastAction", "items", "", "noProductQuantity", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22570c;

        a(LocalThemeScope localThemeScope, String str, Function0<Unit> function0) {
            this.f22568a = localThemeScope;
            this.f22569b = str;
            this.f22570c = function0;
        }

        public final void a(InterfaceC15433c stickyHeader, int i10, Composer composer, int i11) {
            Intrinsics.j(stickyHeader, "$this$stickyHeader");
            if ((i11 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-768159977, i11, -1, "com.meijer.mobile.scanner.ux.compose.ScannerBottomSheet.<anonymous>.<anonymous>.<anonymous> (ScannerBottomSheet.kt:66)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(J.k(companion, H1.h.p(56), 0.0f, 2, null), this.f22568a.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null);
            e.c cVarI = P0.e.INSTANCE.i();
            LocalThemeScope localThemeScope = this.f22568a;
            String str = this.f22569b;
            Function0<Unit> function0 = this.f22570c;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            q1.Label label = new q1.Label(D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), localThemeScope.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 380, null);
            int i12 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope, label, str, null, composer, i12 | (q1.Label.f142335j << 3), 4);
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
            C16196t0 c16196t0 = C16196t0.f154256a;
            String upperCase = C16338g.c(Mp.j.f20395f, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            P0.k(localThemeScope, c16196t0, upperCase, function0, null, null, false, 0L, false, composer, (C16196t0.f154257b << 3) | i12, 248);
            C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            composer.v();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f22571f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ProductScanItem productScanItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f22572f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f22573g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f22572f = function1;
            this.f22573g = list;
        }

        public final Object a(int i10) {
            return this.f22572f.invoke(this.f22573g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f22574f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22575g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope) {
            super(4);
            this.f22574f = list;
            this.f22575g = localThemeScope;
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
            ProductScanItem productScanItem = (ProductScanItem) this.f22574f.get(i10);
            composer.startReplaceGroup(-329837339);
            n.g(this.f22575g, productScanItem, null, composer, LocalThemeScope.f17314g, 2);
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r20, final java.util.List<Mp.ProductScanItem> r21, final java.lang.String r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Np.n.d(Ki.M, java.util.List, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(List list, LocalThemeScope localThemeScope, String str, Function0 function0, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        w.d(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-768159977, true, new a(localThemeScope, str, function0)), 3, null);
        LazyColumn.i(list.size(), null, new c(b.f22571f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(list, localThemeScope)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, List list, String str, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, list, str, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r30, final Mp.ProductScanItem r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Np.n.g(Ki.M, Mp.h, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, ProductScanItem productScanItem, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, productScanItem, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
