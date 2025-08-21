package com.meijer.mobile.meijer.search;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import Vl.HomeDepartment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.home.HomeDecorator;
import ds.C13724f;
import fs.AbstractC14072a;
import ii.AbstractC14761h;
import java.util.List;
import ki.q1;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import r1.C16819m;
import vs.ProductCarouselDecorator;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001a}\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\t2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000bH\u0001¢\u0006\u0004\b$\u0010#\u001aÝ\u0001\u0010(\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\t2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "homeDecorator", "", "isLoggedIn", "Lkotlin/Function1;", "Lvs/d;", "", "onViewAllClicked", "Lkotlin/Function2;", "LCo/h;", "", "onProductClicked", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onEntryUpdate", "Lkotlin/Function0;", "onRetryClicked", "q", "(LKi/M;Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LPj/a;", "loadingState", "", "LVl/g;", "departments", "Lbk/a;", "viewAllTitle", "onDepartmentClicked", "o", "(LKi/M;LPj/a;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lbk/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "text", "D", "(LKi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "A", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "x", "isTopCarouselVisible", "onViewAllDepartmentsClicked", "onRetryDepartmentsClicked", "G", "(LKi/M;Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;LPj/a;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lbk/a;Landroidx/compose/runtime/Composer;III)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Q1 {
    /* JADX WARN: Removed duplicated region for block: B:178:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ki.LocalThemeScope r30, final com.meijer.mobile.meijer.activity.home.HomeDecorator r31, final boolean r32, final boolean r33, final kotlin.jvm.functions.Function1<? super vs.ProductCarouselDecorator, kotlin.Unit> r34, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r35, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final Pj.a r38, final java.util.List<Vl.HomeDepartment> r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super Vl.HomeDepartment, kotlin.Unit> r42, androidx.compose.ui.Modifier r43, final bk.AbstractC6392a r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.Q1.G(Ki.M, com.meijer.mobile.meijer.activity.home.HomeDecorator, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, Pj.a, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, bk.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final Ki.LocalThemeScope r20, androidx.compose.ui.Modifier r21, final java.lang.String r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.Q1.A(Ki.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, modifier, str, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void D(final LocalThemeScope localThemeScope, final String text, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-642813089);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-642813089, i11, -1, "com.meijer.mobile.meijer.search.SearchResultsHeader (SearchScreenComposables.kt:184)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.search.H1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Q1.E((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            si.j.h(localThemeScope, new q1.Label(C16819m.d(companion, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), text, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | (q1.Label.f142335j << 3) | ((i11 << 3) & 896), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.search.I1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q1.F(localThemeScope, text, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, String str, int i10, Composer composer, int i11) {
        D(localThemeScope, str, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, HomeDecorator homeDecorator, boolean z10, boolean z11, Function1 function1, Function2 function2, Function2 function22, Function0 function0, Pj.a aVar, List list, Function0 function02, Function0 function03, Function1 function12, Modifier modifier, AbstractC6392a abstractC6392a, int i10, int i11, int i12, Composer composer, int i13) {
        G(localThemeScope, homeDecorator, z10, z11, function1, function2, function22, function0, aVar, list, function02, function03, function12, modifier, abstractC6392a, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    public static final void o(final LocalThemeScope localThemeScope, final Pj.a loadingState, final List<HomeDepartment> departments, final Function0<Unit> onViewAllClicked, final AbstractC6392a viewAllTitle, final Function0<Unit> onRetryClicked, final Function1<? super HomeDepartment, Unit> onDepartmentClicked, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(departments, "departments");
        Intrinsics.j(onViewAllClicked, "onViewAllClicked");
        Intrinsics.j(viewAllTitle, "viewAllTitle");
        Intrinsics.j(onRetryClicked, "onRetryClicked");
        Intrinsics.j(onDepartmentClicked, "onDepartmentClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(737202886);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(loadingState) : composerStartRestartGroup.D(loadingState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(departments) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onViewAllClicked) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? composerStartRestartGroup.V(viewAllTitle) : composerStartRestartGroup.D(viewAllTitle) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onRetryClicked) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onDepartmentClicked) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(737202886, i11, -1, "com.meijer.mobile.meijer.search.DepartmentsCarouselSection (SearchScreenComposables.kt:105)");
            }
            int i12 = i11 << 6;
            C13724f.b(localThemeScope, androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(32), 0.0f, 0.0f, 13, null), C16338g.c(com.meijer.mobile.meijer.Y.f100366Ce, composerStartRestartGroup, 0), loadingState, departments, viewAllTitle, onViewAllClicked, onRetryClicked, onDepartmentClicked, composerStartRestartGroup, ((i11 << 9) & 3670016) | LocalThemeScope.f17314g | 48 | (i11 & 14) | (Pj.a.f26096c << 9) | (i12 & 7168) | (57344 & i12) | (AbstractC6392a.f60445b << 15) | ((i11 << 3) & 458752) | (29360128 & i12) | (234881024 & i12), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.search.N1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q1.p(localThemeScope, loadingState, departments, onViewAllClicked, viewAllTitle, onRetryClicked, onDepartmentClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Pj.a aVar, List list, Function0 function0, AbstractC6392a abstractC6392a, Function0 function02, Function1 function1, int i10, Composer composer, int i11) {
        o(localThemeScope, aVar, list, function0, abstractC6392a, function02, function1, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void q(final LocalThemeScope localThemeScope, final HomeDecorator homeDecorator, final boolean z10, final Function1<? super ProductCarouselDecorator, Unit> onViewAllClicked, final Function2<? super ProductFullDetails, ? super String, Unit> onProductClicked, final Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> onEntryUpdate, final Function0<Unit> onRetryClicked, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        List<ProductCarouselDecorator> productCarouselList;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onViewAllClicked, "onViewAllClicked");
        Intrinsics.j(onProductClicked, "onProductClicked");
        Intrinsics.j(onEntryUpdate, "onEntryUpdate");
        Intrinsics.j(onRetryClicked, "onRetryClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1014814574);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(homeDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onViewAllClicked) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onProductClicked) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onEntryUpdate) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onRetryClicked) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1014814574, i11, -1, "com.meijer.mobile.meijer.search.RecommendedCarouselSection (SearchScreenComposables.kt:53)");
            }
            final ProductCarouselDecorator productCarouselDecorator = (homeDecorator == null || (productCarouselList = homeDecorator.getProductCarouselList()) == null) ? null : (ProductCarouselDecorator) CollectionsKt.u0(productCarouselList);
            if (productCarouselDecorator == null) {
                composer2 = composerStartRestartGroup;
            } else {
                AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100904ed, new Object[0]);
                Pj.a loadingState = productCarouselDecorator.getLoadingState();
                List<ProductListDecorator> listG = productCarouselDecorator.g();
                String bannerResource = productCarouselDecorator.getBannerResource();
                Integer bannerErrorImageResource = productCarouselDecorator.getBannerErrorImageResource();
                EnumC15218a carouselType = productCarouselDecorator.getCarouselType();
                Function2<Pk.c, EnumC15218a, Unit> function2F = productCarouselDecorator.f();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(32), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zD = ((i11 & 7168) == 2048) | composerStartRestartGroup.D(productCarouselDecorator);
                Object objB = composerStartRestartGroup.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.search.O1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Q1.r(onViewAllClicked, productCarouselDecorator);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zD2 = ((57344 & i11) == 16384) | composerStartRestartGroup.D(productCarouselDecorator);
                Object objB2 = composerStartRestartGroup.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function2() { // from class: com.meijer.mobile.meijer.search.P1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Q1.s(onProductClicked, productCarouselDecorator, (ProductFullDetails) obj, (String) obj2);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                Function2 function2 = (Function2) objB2;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z11 = (i11 & 458752) == 131072;
                Object objB3 = composerStartRestartGroup.B();
                if (z11 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function3() { // from class: com.meijer.mobile.meijer.search.D1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return Q1.t(onEntryUpdate, (ProductFullDetails) obj, (com.meijer.mobile.core.design.widget.stepperview.a) obj2, (EnumC15218a) obj3);
                        }
                    };
                    composerStartRestartGroup.t(objB3);
                }
                Function3 function3 = (Function3) objB3;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB4 = composerStartRestartGroup.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB4 == companion.a()) {
                    objB4 = new Function1() { // from class: com.meijer.mobile.meijer.search.E1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Q1.u((AbstractC14072a) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB4);
                }
                Function1 function1 = (Function1) objB4;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB5 = composerStartRestartGroup.B();
                if (objB5 == companion.a()) {
                    objB5 = new Function3() { // from class: com.meijer.mobile.meijer.search.F1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return Q1.v(((Integer) obj).intValue(), (EnumC15218a) obj2, ((Boolean) obj3).booleanValue());
                        }
                    };
                    composerStartRestartGroup.t(objB5);
                }
                composerStartRestartGroup.P();
                composer2 = composerStartRestartGroup;
                bs.l.d(localThemeScope, listG, z10, abstractC6392aD, loadingState, carouselType, false, false, modifierM, false, bannerResource, bannerErrorImageResource, null, null, function0, onRetryClicked, function2, function3, function2F, function1, null, (Function3) objB5, composer2, 114819072 | LocalThemeScope.f17314g | (i11 & 14) | (i11 & 896) | (AbstractC6392a.f60445b << 9) | (Pj.a.f26096c << 12), ((i11 >> 3) & 458752) | 805306368, 48, 530688);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.search.G1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q1.w(localThemeScope, homeDecorator, z10, onViewAllClicked, onProductClicked, onEntryUpdate, onRetryClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function2 function2, ProductCarouselDecorator productCarouselDecorator, ProductFullDetails product, String str) {
        Intrinsics.j(product, "product");
        AbstractC14761h abstractC14761hJ = productCarouselDecorator.j();
        function2.invoke(product, abstractC14761hJ != null ? abstractC14761hJ.getValue() : null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function2 function2, ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state, EnumC15218a enumC15218a) {
        Intrinsics.j(product, "product");
        Intrinsics.j(state, "state");
        Intrinsics.j(enumC15218a, "<unused var>");
        function2.invoke(product, state);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(AbstractC14072a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(int i10, EnumC15218a enumC15218a, boolean z10) {
        Intrinsics.j(enumC15218a, "<unused var>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, HomeDecorator homeDecorator, boolean z10, Function1 function1, Function2 function2, Function2 function22, Function0 function0, int i10, Composer composer, int i11) {
        q(localThemeScope, homeDecorator, z10, function1, function2, function22, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ki.LocalThemeScope r41, androidx.compose.ui.Modifier r42, final java.lang.String r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.Q1.x(Ki.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, modifier, str, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle B(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getHeadings().getSeven().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, ProductCarouselDecorator productCarouselDecorator) {
        function1.invoke(productCarouselDecorator);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle y(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getBody().getTwo().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, F1.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
    }
}
