package com.meijer.mobile.scanner.ux.activity;

import Ki.LocalThemeScope;
import Op.ScannedItem;
import Op.b;
import V0.x1;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14888I;
import java.util.List;
import ki.q1;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001aN\u0010\r\u001a\u00020\u000b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/runtime/z1;", "LOp/b$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LOp/p;", "Lkotlin/ParameterName;", "name", "item", "", "onItemClick", "c", "(LKi/M;Landroidx/compose/runtime/z1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "quantity", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<ScannedItem, Unit> f117595a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScannedItem f117596b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super ScannedItem, Unit> function1, ScannedItem scannedItem) {
            this.f117595a = function1;
            this.f117596b = scannedItem;
        }

        public final void a() {
            this.f117595a.invoke(this.f117596b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScannedItem f117598b;

        b(LocalThemeScope localThemeScope, ScannedItem scannedItem) {
            this.f117597a = localThemeScope;
            this.f117598b = scannedItem;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-165476378, i10, -1, "com.meijer.mobile.scanner.ux.activity.ScannedProductsBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScannerDemoActivity.kt:229)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = D.j(companion, H1.h.p(16), H1.h.p(12));
            LocalThemeScope localThemeScope = this.f117597a;
            ScannedItem scannedItem = this.f117598b;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
            String str = scannedItem.getBarcode().getBarcodeString() + " (" + scannedItem.getBarcode().getFormatName() + ')';
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), String.valueOf(scannedItem.getQuantity()), null, composer, i11 | (i12 << 3), 4);
            composer.v();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f117599f = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ScannedItem scannedItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f117600f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f117601g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, List list) {
            super(1);
            this.f117600f = function1;
            this.f117601g = list;
        }

        public final Object a(int i10) {
            return this.f117600f.invoke(this.f117601g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f117602f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f117603g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117604h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list, Function1 function1, LocalThemeScope localThemeScope) {
            super(4);
            this.f117602f = list;
            this.f117603g = function1;
            this.f117604h = localThemeScope;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15433c) ? 4 : 2);
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
            ScannedItem scannedItem = (ScannedItem) this.f117602f.get(i10);
            composer.startReplaceGroup(-1211677311);
            V0.D1 d1A = x1.a();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f117603g) | composer.D(scannedItem);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(this.f117603g, scannedItem);
                composer.t(objB);
            }
            composer.P();
            C18051y.b((Function0) objB, null, false, d1A, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(-165476378, true, new b(this.f117604h, scannedItem), composer, 54), composer, 805309440, HttpResponseStatus.ERROR_BAD_GATEWAY);
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
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r19, final androidx.compose.runtime.z1<Op.b.ViewState> r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super Op.ScannedItem, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.scanner.ux.activity.z.c(Ki.M, androidx.compose.runtime.z1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(z1 z1Var, Function1 function1, LocalThemeScope localThemeScope, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        List listS0 = CollectionsKt.S0(((b.ViewState) z1Var.getValue()).c());
        LazyColumn.i(listS0.size(), null, new d(c.f117599f, listS0), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new e(listS0, function1, localThemeScope)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, z1 z1Var, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, z1Var, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
