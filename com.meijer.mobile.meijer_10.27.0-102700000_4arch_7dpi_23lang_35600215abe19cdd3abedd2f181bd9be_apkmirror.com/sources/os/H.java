package os;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j0.C14815g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import os.H;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\\\u0010\u000e\u001a\u00020\n*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "LVl/f;", "clippedRewards", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "reward", "", "onRewardClicked", "Lkotlin/Function0;", "onViewAllClicked", "c", "(LJi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class H {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Vl.f, Unit> f154959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Vl.f f154960b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Vl.f, Unit> function1, Vl.f fVar) {
            this.f154959a = function1;
            this.f154960b = fVar;
        }

        public final void a() {
            this.f154959a.invoke(this.f154960b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f154962b;

        b(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f154961a = localThemeScope;
            this.f154962b = function0;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-601633047, i10, -1, "com.meijer.mobile.ui.mperks.homescreen.YourRewardsCarousel.<anonymous>.<anonymous>.<anonymous> (HomeScreenMperksYourRewardsCarousel.kt:66)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(BinsView.TOTE_WIDTH_DP)), this.f154961a.getAdsSpacing().getThree().getDp());
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f154962b);
            final Function0<Unit> function0 = this.f154962b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: os.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return H.b.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = ClickableKt.d(modifierI, false, null, null, (Function0) objB, 7, null);
            e.b bVarG = P0.e.INSTANCE.g();
            C5658d.f fVarB = C5658d.f48555a.b();
            LocalThemeScope localThemeScope = this.f154961a;
            Function0<Unit> function02 = this.f154962b;
            MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            Fj.b.b(localThemeScope, C.b.g.d.f15455e, AbstractC5607a.INSTANCE.d(ns.u.f152710Z, new Object[0]), localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, function02, composer, LocalThemeScope.f15770g | (C.b.g.d.f15456f << 3) | (AbstractC5607a.f45514b << 6) | (Ji.T.f15798b << 9), 8);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f154963f = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Vl.f fVar) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f154964f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f154965g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, List list) {
            super(1);
            this.f154964f = function1;
            this.f154965g = list;
        }

        public final Object a(int i10) {
            return this.f154964f.invoke(this.f154965g.get(i10));
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
        final /* synthetic */ List f154966f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154967g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f154968h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f154966f = list;
            this.f154967g = localThemeScope;
            this.f154968h = function1;
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
            Vl.f fVar = (Vl.f) this.f154966f.get(i10);
            composer.startReplaceGroup(1170113464);
            LocalThemeScope localThemeScope = this.f154967g;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f154968h) | composer.D(fVar);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(this.f154968h, fVar);
                composer.t(objB);
            }
            composer.P();
            E.s(localThemeScope, fVar, null, (Function0) objB, composer, LocalThemeScope.f15770g, 2);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r20, final java.util.List<? extends Vl.f> r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function1<? super Vl.f, kotlin.Unit> r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.H.c(Ji.M, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(List list, LocalThemeScope localThemeScope, Function1 function1, Function0 function0, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List listB1 = CollectionsKt.b1(list, 3);
        LazyRow.i(listB1.size(), null, new d(c.f154963f, listB1), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new e(listB1, localThemeScope, function1)));
        if (list.size() >= 3) {
            l0.w.g(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-601633047, true, new b(localThemeScope, function0)), 3, null);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, List list, Modifier modifier, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, list, modifier, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
