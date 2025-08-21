package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.find.productdetail.s2;
import j0.C14889J;
import j0.C14890K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vs.InterfaceC17723c;
import wl.ProductEligibility;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aa\u0010\r\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u001d²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lvs/c;", "productList", "Lkotlin/Function2;", "LCo/h;", "", "", "onProductClicked", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onEntryUpdate", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "content", "c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "productDecorator1", "b", "productDecorator2", "productDecorator3", "", "productListContainsTag", "urls", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    private static final SuggestedProductCarouselDecorator f108603a = new SuggestedProductCarouselDecorator(new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, true, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2097155, 268435455, null), "product1", "Cinnamon Chex", null, null, null, true, false, Co.l.f(null, null, 0.0d, "$3.47", 0.0d, null, 55, null), Co.l.f(null, null, 0.0d, "$3.97/ea", 0.0d, null, 55, null), Co.l.c(false, null, null, null, 0.0d, null, null, 0, 0.5d, l3.f93323c, null), null, 0.0d, false, false, null, null, null, false, null, 1046712, null);

    /* renamed from: b, reason: collision with root package name */
    private static final SuggestedProductCarouselDecorator f108604b = new SuggestedProductCarouselDecorator(new ProductFullDetails(null, "Banana", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -3, 268435455, null), "product2", "Banana", null, null, null, false, true, Co.l.f(null, null, 0.0d, "$1.26", 0.0d, null, 55, null), Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null), null, null, 0.0d, false, false, null, null, null, false, null, 1047608, null);

    /* renamed from: c, reason: collision with root package name */
    private static final SuggestedProductCarouselDecorator f108605c = new SuggestedProductCarouselDecorator(new ProductFullDetails(null, "Crispy Apple", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -3, 268435455, null), "product3", "Crispy Apple", null, null, null, false, false, Co.l.f(null, null, 0.0d, "$2.99", 0.0d, null, 55, null), Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null), null, null, 0.0d, false, false, null, null, null, false, null, 1047736, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f108606a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            Iterator it = list.iterator();
            int width = 0;
            while (it.hasNext()) {
                androidx.compose.ui.layout.f0 f0Var = (androidx.compose.ui.layout.f0) it.next();
                f0.a aVar = layout;
                f0.a.l(aVar, f0Var, width, 0, 0.0f, 4, null);
                width += f0Var.getWidth();
                layout = aVar;
            }
            return Unit.f143329a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K Layout, List<? extends androidx.compose.ui.layout.I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            List<? extends androidx.compose.ui.layout.I> list = measurables;
            final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.compose.ui.layout.I) it.next()).k0(j10));
            }
            Iterator it2 = arrayList.iterator();
            int width = 0;
            while (it2.hasNext()) {
                width += ((androidx.compose.ui.layout.f0) it2.next()).getWidth();
            }
            Iterator it3 = arrayList.iterator();
            int iMax = 0;
            while (it3.hasNext()) {
                iMax = Math.max(iMax, ((androidx.compose.ui.layout.f0) it3.next()).getHeight());
            }
            return androidx.compose.ui.layout.K.G0(Layout, width, iMax, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.r2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s2.a.b(arrayList, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f108607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17723c> f108608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108609c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, String, Unit> f108610d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f108611e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f108612f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC17723c> f108613a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f108614b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<ProductFullDetails, String, Unit> f108615c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f108616d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f108617e;

            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends InterfaceC17723c> list, LocalThemeScope localThemeScope, Function2<? super ProductFullDetails, ? super String, Unit> function2, Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f108613a = list;
                this.f108614b = localThemeScope;
                this.f108615c = function2;
                this.f108616d = function22;
                this.f108617e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1910328924, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselRecyclerView.<anonymous>.<anonymous>.<anonymous> (SuggestedProductCarouselRecyclerView.kt:69)");
                }
                List<InterfaceC17723c> list = this.f108613a;
                LocalThemeScope localThemeScope = this.f108614b;
                Function2<ProductFullDetails, String, Unit> function2 = this.f108615c;
                Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22 = this.f108616d;
                InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f108617e;
                for (InterfaceC17723c interfaceC17723c : list) {
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), 0.0f, 8, null);
                    us.r.l(localThemeScope, interfaceC17723c, !(interfaceC17723c.getCriteoInfo() == null || Intrinsics.e(interfaceC17723c.getCartEligibility(), ProductEligibility.a.l.f167280a)) || interfaceC17723c.o(), false, false, modifierM, s2.f(interfaceC5872l0), true, function2, function22, null, EnumC15218a.f142571e, composer, LocalThemeScope.f17314g | 12610560, 48, 512);
                    interfaceC5872l0 = interfaceC5872l0;
                }
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

        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, List<? extends InterfaceC17723c> list, LocalThemeScope localThemeScope, Function2<? super ProductFullDetails, ? super String, Unit> function2, Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f108607a = modifier;
            this.f108608b = list;
            this.f108609c = localThemeScope;
            this.f108610d = function2;
            this.f108611e = function22;
            this.f108612f = interfaceC5872l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1381109106, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselRecyclerView.<anonymous> (SuggestedProductCarouselRecyclerView.kt:66)");
            }
            Modifier modifierB = d0.T.b(this.f108607a, d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
            List<InterfaceC17723c> list = this.f108608b;
            LocalThemeScope localThemeScope = this.f108609c;
            Function2<ProductFullDetails, String, Unit> function2 = this.f108610d;
            Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> function22 = this.f108611e;
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f108612f;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierB);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(24)), composer, 6);
            s2.c(null, ComposableLambdaKt.c(1910328924, true, new a(list, localThemeScope, function2, function22, interfaceC5872l0), composer, 54), composer, 48, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        c(modifier, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final java.util.List<? extends vs.InterfaceC17723c> r19, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r20, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.s2.e(Ki.M, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, List list, Function2 function2, Function2 function22, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, list, function2, function22, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1708651767);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1708651767, i12, -1, "com.meijer.mobile.meijer.activity.find.productdetail.MatchHeightRowLayout (SuggestedProductCarouselRecyclerView.kt:102)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f108606a;
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            composerStartRestartGroup.P();
            int i16 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            int i17 = ((i16 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicy, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i17 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.q2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s2.d(modifier, function2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void g(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final List<String> h(InterfaceC5872l0<List<String>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }
}
