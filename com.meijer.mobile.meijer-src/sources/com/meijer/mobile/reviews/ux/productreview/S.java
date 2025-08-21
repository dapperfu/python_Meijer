package com.meijer.mobile.reviews.ux.productreview;

import Jp.Filter;
import Ki.LocalThemeScope;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.InterfaceC14888I;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ki.C15132A;
import ki.InterfaceC15148Q;
import ki.q1;
import kotlin.C14661b;
import kotlin.C14670k;
import kotlin.C14683x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import r1.C16813g;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aW\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001ak\u0010\u0019\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ay\u0010\u001f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aQ\u0010&\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b&\u0010'\u001a+\u0010(\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b(\u0010)\u001a1\u0010,\u001a\u00020\u000b*\u00020\u00002\u0006\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b,\u0010-\u001a%\u0010.\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010/\u001a;\u00104\u001a\u00020\u000b*\u00020\u00002\u0006\u00101\u001a\u0002002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u0011H\u0007¢\u0006\u0004\b4\u00105\u001a=\u00108\u001a\u00020\u000b*\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00112\b\b\u0002\u00107\u001a\u000200H\u0007¢\u0006\u0004\b8\u00109¨\u0006;²\u0006\u000e\u0010:\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Li4/k;", "navController", "LJp/b;", "sortBy", "", "LJp/a;", "filters", "Lkotlin/Function0;", "", "onResetClick", "onResultsClick", "L", "(LKi/M;Landroidx/compose/ui/Modifier;Li4/k;LJp/b;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "", "filterOptions", "r0", "([Ljava/lang/String;Ljava/util/Set;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "sortBySelected", "", "Lkotlin/Function1;", "onSortBySelected", "g0", "(LKi/M;Landroidx/compose/ui/Modifier;Li4/k;LJp/b;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "title", "checkboxTracker", "onFilterSelected", "D", "(LKi/M;Landroidx/compose/ui/Modifier;ILi4/k;Ljava/util/Set;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LKi/C;", "navigationIcon", "Lbk/a;", "navigationContentDescription", "navigationIconClick", "X", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;LKi/C;Lbk/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "e0", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "categoryName", "currentSelection", "c0", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Z", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isSelected", "onClick", "optionName", "n0", "(LKi/M;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "text", "isChecked", "H", "(LKi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "itemSelected", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class S {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116556a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f116557b;

        a(LocalThemeScope localThemeScope, boolean z10) {
            this.f116556a = localThemeScope;
            this.f116557b = z10;
        }

        public final void a(InterfaceC15148Q Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-907284942, i10, -1, "com.meijer.mobile.reviews.ux.productreview.CheckboxItem.<anonymous>.<anonymous> (FilterAndSortReviews.kt:471)");
            }
            wi.s.b(this.f116556a, Assemble.getToggleButtons().getLeadingToggleButton(), this.f116557b, false, false, null, composer, LocalThemeScope.f17314g | (q1.s.Checkbox.f142428e << 3), 28);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
            a(interfaceC15148Q, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116558a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116559b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116560a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f116561b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.ux.productreview.S$b$a$a, reason: collision with other inner class name */
            static final class C1862a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116562a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f116563b;

                C1862a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f116562a = localThemeScope;
                    this.f116563b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-466420248, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FilterAndSortTopBar.<anonymous>.<anonymous>.<anonymous> (FilterAndSortReviews.kt:288)");
                    }
                    LocalThemeScope localThemeScope = this.f116562a;
                    q1.Label labelY = q1.Label.y(this.f116563b.getLabels().getEnabledLabel(), null, this.f116562a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 509, null);
                    String lowerCase = C16338g.c(Cj.o.f5099y0, composer, 0).toLowerCase(Locale.ROOT);
                    Intrinsics.i(lowerCase, "toLowerCase(...)");
                    si.j.h(localThemeScope, labelY, u1.o.a(lowerCase, B1.d.INSTANCE.a()), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f116560a = localThemeScope;
                this.f116561b = function0;
            }

            public final void a(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1096733947, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FilterAndSortTopBar.<anonymous>.<anonymous> (FilterAndSortReviews.kt:284)");
                }
                oi.E0.b(this.f116560a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null), this.f116561b, ComposableLambdaKt.c(-466420248, true, new C1862a(this.f116560a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f116558a = localThemeScope;
            this.f116559b = function0;
        }

        public final void a(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(228621975, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FilterAndSortTopBar.<anonymous> (FilterAndSortReviews.kt:283)");
            }
            LocalThemeScope localThemeScope = this.f116558a;
            Ki.Q.e(localThemeScope, C15132A.f141851a, ComposableLambdaKt.c(1096733947, true, new a(localThemeScope, this.f116559b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15132A.f141852b << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f116565b;

        c(LocalThemeScope localThemeScope, String str) {
            this.f116564a = localThemeScope;
            this.f116565b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-811569283, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FilterAndSortTopBar.<anonymous> (FilterAndSortReviews.kt:281)");
            }
            Dr.g.g(this.f116564a, this.f116565b, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
    static final class d implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116567b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f116568a;

            a(LocalThemeScope localThemeScope) {
                this.f116568a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1918990703, i10, -1, "com.meijer.mobile.reviews.ux.productreview.SeeResultsButton.<anonymous>.<anonymous>.<anonymous> (FilterAndSortReviews.kt:321)");
                }
                si.j.h(this.f116568a, new q1.Label(null, this.f116568a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, this.f116568a.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(Cj.o.f5008B0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        d(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f116566a = localThemeScope;
            this.f116567b = function0;
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-534523972, i10, -1, "com.meijer.mobile.reviews.ux.productreview.SeeResultsButton.<anonymous>.<anonymous> (FilterAndSortReviews.kt:313)");
            }
            oi.E0.b(this.f116566a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), false, null, 895, null), this.f116567b, ComposableLambdaKt.c(1918990703, true, new a(this.f116566a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(final Ki.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final int r29, final kotlin.C14670k r30, final java.util.Set<Jp.Filter> r31, final java.util.Set<Jp.Filter> r32, final kotlin.jvm.functions.Function1<? super Jp.Filter, kotlin.Unit> r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, final kotlin.jvm.functions.Function0<kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.D(Ki.M, androidx.compose.ui.Modifier, int, i4.k, java.util.Set, java.util.Set, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, Modifier modifier, int i10, C14670k c14670k, Set set, Set set2, Function1 function1, Function0 function0, Function0 function02, int i11, int i12, Composer composer, int i13) {
        D(localThemeScope, modifier, i10, c14670k, set, set2, function1, function0, function02, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(final Ki.LocalThemeScope r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.ui.Modifier r32, final java.lang.String r33, boolean r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.H(Ki.M, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(boolean z10, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.y0(semantics, "Checkbox item");
        r1.s.s0(semantics, Role.INSTANCE.c());
        r1.s.G0(semantics, t1.b.a(z10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, Function0 function0, Modifier modifier, String str, boolean z10, int i10, int i11, Composer composer, int i12) {
        H(localThemeScope, function0, modifier, str, z10, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L(final Ki.LocalThemeScope r38, androidx.compose.ui.Modifier r39, final kotlin.C14670k r40, final Jp.b r41, final java.util.Set<Jp.Filter> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function0<kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.L(Ki.M, androidx.compose.ui.Modifier, i4.k, Jp.b, java.util.Set, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(C14670k c14670k) throws Resources.NotFoundException {
        c14670k.S("locale", new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.O((C14683x) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(C14683x navigate) {
        Intrinsics.j(navigate, "$this$navigate");
        navigate.a(new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.G
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.P((C14661b) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(C14661b anim) {
        Intrinsics.j(anim, "$this$anim");
        anim.e(Cj.d.f4638b);
        anim.f(Cj.d.f4640d);
        anim.g(Cj.d.f4638b);
        anim.h(Cj.d.f4640d);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(C14670k c14670k) throws Resources.NotFoundException {
        c14670k.S("sort_by", new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.R((C14683x) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(C14683x navigate) {
        Intrinsics.j(navigate, "$this$navigate");
        navigate.a(new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.S((C14661b) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(C14661b anim) {
        Intrinsics.j(anim, "$this$anim");
        anim.e(Cj.d.f4638b);
        anim.f(Cj.d.f4640d);
        anim.g(Cj.d.f4638b);
        anim.h(Cj.d.f4640d);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(C14670k c14670k) throws Resources.NotFoundException {
        c14670k.S("rating", new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.U((C14683x) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(C14683x navigate) {
        Intrinsics.j(navigate, "$this$navigate");
        navigate.a(new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.V((C14661b) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(C14661b anim) {
        Intrinsics.j(anim, "$this$anim");
        anim.e(Cj.d.f4638b);
        anim.f(Cj.d.f4640d);
        anim.g(Cj.d.f4638b);
        anim.h(Cj.d.f4640d);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(LocalThemeScope localThemeScope, Modifier modifier, C14670k c14670k, Jp.b bVar, Set set, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, modifier, c14670k, bVar, set, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void X(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final java.lang.String r19, final Ki.C r20, final bk.AbstractC6392a r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.X(Ki.M, androidx.compose.ui.Modifier, java.lang.String, Ki.C, bk.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(LocalThemeScope localThemeScope, Modifier modifier, String str, Ki.C c10, AbstractC6392a abstractC6392a, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        X(localThemeScope, modifier, str, c10, abstractC6392a, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z(final Ki.LocalThemeScope r27, final java.lang.String r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.Z(Ki.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        Z(localThemeScope, str, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c0(final Ki.LocalThemeScope r31, final java.lang.String r32, androidx.compose.ui.Modifier r33, java.lang.String r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.c0(Ki.M, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, String str, Modifier modifier, String str2, int i10, int i11, Composer composer, int i12) {
        c0(localThemeScope, str, modifier, str2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e0(final Ki.LocalThemeScope r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.e0(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g0(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, final kotlin.C14670k r31, final Jp.b r32, final java.util.List<? extends Jp.b> r33, final kotlin.jvm.functions.Function1<? super Jp.b, kotlin.Unit> r34, final kotlin.jvm.functions.Function0<kotlin.Unit> r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.g0(Ki.M, androidx.compose.ui.Modifier, i4.k, Jp.b, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit k0(Ref.ObjectRef objectRef, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        r1.s.g0(semantics, (String) objectRef.f143742a);
        r1.s.n0(semantics, C16813g.INSTANCE.b());
        r1.s.s0(semantics, Role.INSTANCE.f());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(LocalThemeScope localThemeScope, Modifier modifier, C14670k c14670k, Jp.b bVar, List list, Function1 function1, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        g0(localThemeScope, modifier, c14670k, bVar, list, function1, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n0(final Ki.LocalThemeScope r35, final boolean r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.ui.Modifier r38, final java.lang.String r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.S.n0(Ki.M, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(boolean z10, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.x0(semantics, z10 ? "selected" : "");
        r1.s.s0(semantics, Role.INSTANCE.f());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(LocalThemeScope localThemeScope, boolean z10, Function0 function0, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        n0(localThemeScope, z10, function0, modifier, str, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(C14670k c14670k) {
        c14670k.X();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Function1 function1, Filter filter) {
        function1.invoke(filter);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    private static final Jp.b h0(InterfaceC5872l0<Jp.b> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void i0(InterfaceC5872l0<Jp.b> interfaceC5872l0, Jp.b bVar) {
        interfaceC5872l0.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(C14670k c14670k) {
        c14670k.X();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, java.lang.String] */
    public static final Unit l0(Jp.b bVar, Ref.ObjectRef objectRef, Context context, Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
        i0(interfaceC5872l0, bVar);
        ?? string = context.getString(h0(interfaceC5872l0).getDescription());
        Intrinsics.i(string, "getString(...)");
        objectRef.f143742a = string;
        function1.invoke(bVar);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    private static final String r0(String[] strArr, Set<Filter> set, Composer composer, int i10) {
        String strA;
        composer.startReplaceGroup(1933242174);
        if (ComposerKt.M()) {
            ComposerKt.U(1933242174, i10, -1, "com.meijer.mobile.reviews.ux.productreview.optionsSelectedString (FilterAndSortReviews.kt:160)");
        }
        composer.startReplaceGroup(-1875104853);
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (ArraysKt.Y(strArr, C16338g.c(((Filter) obj).getDescription(), composer, 0))) {
                arrayList.add(obj);
            }
        }
        composer.P();
        if (arrayList.isEmpty()) {
            composer.startReplaceGroup(2001409968);
            composer.P();
            strA = null;
        } else if (arrayList.size() == strArr.length) {
            composer.startReplaceGroup(2001484399);
            strA = C16338g.c(Lp.c.f19375c, composer, 0);
            composer.P();
        } else {
            composer.startReplaceGroup(2001544477);
            strA = C13698b.a(AbstractC6392a.INSTANCE.b(Lp.b.f19318a, arrayList.size(), new Object[0]), composer, AbstractC6392a.f60445b);
            composer.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return strA;
    }
}
