package com.meijer.mobile.reviews.ux.productreview;

import Ji.LocalThemeScope;
import Jp.Filter;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.reviews.ux.productreview.AbstractC12708a;
import com.meijer.mobile.reviews.ux.productreview.C12720g;
import com.meijer.mobile.reviews.ux.productreview.T;
import java.util.Set;
import kotlin.C14664h;
import kotlin.C14675s;
import kotlin.C14677u;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16699g;
import r1.C16705m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a9\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u0011\u001a\u00020\f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LJi/M;", "Li4/u;", "navController", "Lcom/meijer/mobile/reviews/ux/productreview/T;", "vmFilterSort", "Lcom/meijer/mobile/reviews/ux/productreview/T$b;", "viewState", "Lkotlin/Function0;", "", "onResultsClick", "d", "(LJi/M;Li4/u;Lcom/meijer/mobile/reviews/ux/productreview/T;Lcom/meijer/mobile/reviews/ux/productreview/T$b;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Landroid/content/Context;", "context", "", "filterAndSort", "h", "(Landroidx/compose/ui/Modifier;Landroid/content/Context;I)Landroidx/compose/ui/Modifier;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.reviews.ux.productreview.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12720g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.g$a */
    static final class a implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f115762a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T.FilterAndSortState f115763b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115764c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C14677u f115765d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f115766e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115767f;

        a(Context context, T.FilterAndSortState filterAndSortState, LocalThemeScope localThemeScope, C14677u c14677u, T t10, Function0<Unit> function0) {
            this.f115762a = context;
            this.f115763b = filterAndSortState;
            this.f115764c = localThemeScope;
            this.f115765d = c14677u;
            this.f115766e = t10;
            this.f115767f = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(T t10) {
            t10.p(AbstractC12708a.c.f115662a);
            return Unit.f142422a;
        }

        public final void b(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-974739767, i10, -1, "com.meijer.mobile.reviews.ux.productreview.NavigationComponent.<anonymous>.<anonymous>.<anonymous> (FilterAndSortActivity.kt:128)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(C12720g.h(androidx.compose.foundation.g.b(Modifier.INSTANCE, false, null, 2, null), this.f115762a, Bj.o.f3051x));
            Jp.b sortBy = this.f115763b.getSortBy();
            Set<Filter> setC = this.f115763b.c();
            LocalThemeScope localThemeScope = this.f115764c;
            C14677u c14677u = this.f115765d;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f115766e);
            final T t10 = this.f115766e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12720g.a.c(t10);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            S.L(localThemeScope, modifierFsUnmask, c14677u, sortBy, setC, (Function0) objB, this.f115767f, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            b(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.g$b */
    static final class b implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f115769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C14677u f115770c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T.FilterAndSortState f115771d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f115772e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115773f;

        b(LocalThemeScope localThemeScope, Context context, C14677u c14677u, T.FilterAndSortState filterAndSortState, T t10, Function0<Unit> function0) {
            this.f115768a = localThemeScope;
            this.f115769b = context;
            this.f115770c = c14677u;
            this.f115771d = filterAndSortState;
            this.f115772e = t10;
            this.f115773f = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(T t10, Jp.b sortBy) {
            Intrinsics.j(sortBy, "sortBy");
            t10.p(new AbstractC12708a.SelectSortBy(sortBy));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(T t10) {
            t10.p(AbstractC12708a.b.f115661a);
            return Unit.f142422a;
        }

        public final void c(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-1287816974, i10, -1, "com.meijer.mobile.reviews.ux.productreview.NavigationComponent.<anonymous>.<anonymous>.<anonymous> (FilterAndSortActivity.kt:141)");
            }
            LocalThemeScope localThemeScope = this.f115768a;
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(C12720g.h(Modifier.INSTANCE, this.f115769b, Bj.o.f2973G0));
            C14677u c14677u = this.f115770c;
            Jp.b sortBy = this.f115771d.getSortBy();
            EnumEntries<Jp.b> enumEntriesE = Jp.b.e();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f115772e);
            final T t10 = this.f115772e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12720g.b.d(t10, (Jp.b) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            Function0<Unit> function0 = this.f115773f;
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(this.f115772e);
            final T t11 = this.f115772e;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12720g.b.e(t11);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            S.g0(localThemeScope, modifierFsUnmask, c14677u, sortBy, enumEntriesE, function1, function0, (Function0) objB2, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            c(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.g$c */
    static final class c implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f115774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T.FilterAndSortState f115775b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115776c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C14677u f115777d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f115778e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115779f;

        c(Context context, T.FilterAndSortState filterAndSortState, LocalThemeScope localThemeScope, C14677u c14677u, T t10, Function0<Unit> function0) {
            this.f115774a = context;
            this.f115775b = filterAndSortState;
            this.f115776c = localThemeScope;
            this.f115777d = c14677u;
            this.f115778e = t10;
            this.f115779f = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(T t10, Filter filter) {
            Intrinsics.j(filter, "filter");
            t10.p(new AbstractC12708a.SelectFilter(filter));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(T t10) {
            t10.p(new AbstractC12708a.ResetFilter(T.INSTANCE.b()));
            return Unit.f142422a;
        }

        public final void c(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-514775023, i10, -1, "com.meijer.mobile.reviews.ux.productreview.NavigationComponent.<anonymous>.<anonymous>.<anonymous> (FilterAndSortActivity.kt:157)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(C12720g.h(Modifier.INSTANCE, this.f115774a, Lp.c.f18607P));
            int i11 = Lp.c.f18607P;
            Set<Filter> setB = T.INSTANCE.b();
            Set<Filter> setC = this.f115775b.c();
            LocalThemeScope localThemeScope = this.f115776c;
            C14677u c14677u = this.f115777d;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f115778e);
            final T t10 = this.f115778e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12720g.c.d(t10, (Filter) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            Function0<Unit> function0 = this.f115779f;
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(this.f115778e);
            final T t11 = this.f115778e;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12720g.c.e(t11);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            S.D(localThemeScope, modifierFsUnmask, i11, c14677u, setB, setC, function1, function0, (Function0) objB2, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            c(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.g$d */
    static final class d implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f115780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T.FilterAndSortState f115781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115782c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C14677u f115783d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f115784e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115785f;

        d(Context context, T.FilterAndSortState filterAndSortState, LocalThemeScope localThemeScope, C14677u c14677u, T t10, Function0<Unit> function0) {
            this.f115780a = context;
            this.f115781b = filterAndSortState;
            this.f115782c = localThemeScope;
            this.f115783d = c14677u;
            this.f115784e = t10;
            this.f115785f = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(T t10, Filter filter) {
            Intrinsics.j(filter, "filter");
            t10.p(new AbstractC12708a.SelectFilter(filter));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(T t10) {
            t10.p(new AbstractC12708a.ResetFilter(T.INSTANCE.a()));
            return Unit.f142422a;
        }

        public final void c(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(258266928, i10, -1, "com.meijer.mobile.reviews.ux.productreview.NavigationComponent.<anonymous>.<anonymous>.<anonymous> (FilterAndSortActivity.kt:177)");
            }
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(C12720g.h(Modifier.INSTANCE, this.f115780a, Lp.c.f18659q));
            int i11 = Lp.c.f18659q;
            Set<Filter> setA = T.INSTANCE.a();
            Set<Filter> setC = this.f115781b.c();
            LocalThemeScope localThemeScope = this.f115782c;
            C14677u c14677u = this.f115783d;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f115784e);
            final T t10 = this.f115784e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12720g.d.d(t10, (Filter) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            Function0<Unit> function0 = this.f115785f;
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(this.f115784e);
            final T t11 = this.f115784e;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12720g.d.e(t11);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            S.D(localThemeScope, modifierFsUnmask, i11, c14677u, setA, setC, function1, function0, (Function0) objB2, composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            c(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, final C14677u navController, final T vmFilterSort, final T.FilterAndSortState viewState, final Function0<Unit> onResultsClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(navController, "navController");
        Intrinsics.j(vmFilterSort, "vmFilterSort");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onResultsClick, "onResultsClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-775658389);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(navController) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(vmFilterSort) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(viewState) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onResultsClick) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-775658389, i12, -1, "com.meijer.mobile.reviews.ux.productreview.NavigationComponent (FilterAndSortActivity.kt:124)");
            }
            final Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = composerStartRestartGroup.D(context) | composerStartRestartGroup.D(viewState) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | composerStartRestartGroup.D(navController) | composerStartRestartGroup.D(vmFilterSort) | ((57344 & i12) == 16384);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12720g.e(context, viewState, localThemeScope, navController, vmFilterSort, onResultsClick, (C14675s) obj);
                    }
                };
                composerStartRestartGroup.t(function1);
                objB = function1;
            }
            composerStartRestartGroup.P();
            j4.k.b(navController, "default_filter", null, null, null, null, null, null, null, (Function1) objB, composerStartRestartGroup, ((i12 >> 3) & 14) | 48, 508);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.productreview.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12720g.f(localThemeScope, navController, vmFilterSort, viewState, onResultsClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Context context, T.FilterAndSortState filterAndSortState, LocalThemeScope localThemeScope, C14677u c14677u, T t10, Function0 function0, C14675s NavHost) {
        Intrinsics.j(NavHost, "$this$NavHost");
        j4.i.c(NavHost, "default_filter", null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-974739767, true, new a(context, filterAndSortState, localThemeScope, c14677u, t10, function0)), 126, null);
        j4.i.c(NavHost, "sort_by", null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1287816974, true, new b(localThemeScope, context, c14677u, filterAndSortState, t10, function0)), 126, null);
        j4.i.c(NavHost, "rating", null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-514775023, true, new c(context, filterAndSortState, localThemeScope, c14677u, t10, function0)), 126, null);
        j4.i.c(NavHost, "locale", null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(258266928, true, new d(context, filterAndSortState, localThemeScope, c14677u, t10, function0)), 126, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, C14677u c14677u, T t10, T.FilterAndSortState filterAndSortState, Function0 function0, int i10, Composer composer, int i11) {
        d(localThemeScope, c14677u, t10, filterAndSortState, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier h(Modifier modifier, final Context context, final int i10) {
        return C16705m.d(modifier, false, new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12720g.i(i10, context, (r1.u) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(int i10, Context context, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        r1.s.n0(semantics, C16699g.INSTANCE.a());
        r1.s.g0(semantics, AbstractC5607a.INSTANCE.d(i10, new Object[0]).b(context));
        return Unit.f142422a;
    }
}
