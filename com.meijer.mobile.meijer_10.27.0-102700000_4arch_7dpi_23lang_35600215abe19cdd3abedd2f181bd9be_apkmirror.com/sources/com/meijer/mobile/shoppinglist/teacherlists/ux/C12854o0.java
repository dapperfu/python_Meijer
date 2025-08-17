package com.meijer.mobile.shoppinglist.teacherlists.ux;

import As.ClassItem;
import As.SchoolCard;
import As.SchoolItem;
import As.UnavailableItem;
import Hr.ClippableCouponDecorator;
import Hr.CouponCountDownStateDecorator;
import Ji.C;
import Ji.LocalThemeScope;
import M0.SnapshotStateList;
import Ok.Coupon;
import P0.e;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.shoppinglist.teacherlists.ux.C12854o0;
import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import d0.C13457y;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC14913P;
import ji.InterfaceC14920X;
import ji.InterfaceC14935g;
import ji.Q0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l0.C15339A;
import l0.C15340B;
import l0.C15342b;
import l0.InterfaceC15343c;
import ni.C15854p;
import ni.C15862t0;
import ni.C15868w0;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;
import ss.C17037o;
import ss.InterfaceC17023a;
import ts.ProductCardDecorator;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a#\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0007\u001a#\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\f\u001a#\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\f\u001a#\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\f\u001a\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010#\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"LJi/M;", "", "G", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;", "viewState", "I", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Landroidx/compose/runtime/Composer;I)V", "r0", "Ll0/c;", "lazyItemScope", "U", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/c;Landroidx/compose/runtime/Composer;I)V", "j0", "m0", "f0", "X", "K", "P", "d0", "(LJi/M;Ll0/c;Landroidx/compose/runtime/Composer;I)V", "LAs/e;", "schoolItem", "x0", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/c;LAs/e;Landroidx/compose/runtime/Composer;I)V", "LAs/a;", "classItem", "u0", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/c;LAs/a;Landroidx/compose/runtime/Composer;I)V", "Ll0/w;", "lazyListScope", "O0", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/w;)V", "Landroidx/compose/ui/Modifier;", "modifier", "p0", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12854o0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$a */
    static final class a implements Function3<InterfaceC14913P, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1.d f117414a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117415b;

        a(v1.d dVar, LocalThemeScope localThemeScope) {
            this.f117414a = dVar;
            this.f117415b = localThemeScope;
        }

        public final void b(InterfaceC14913P Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(399726642, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.CartIcon.<anonymous> (TeacherListsComposables.kt:117)");
            }
            q1.Badge badgeY = q1.Badge.y(Assemble.getBadges().getPrimary(), Assemble.getBadges().getPrimary().getModifier().then(FullStoryAnnotationsKt.fsAttribute(Modifier.INSTANCE, "Button", "schoolsupplies_cartButton")), null, null, null, 14, null);
            Integer value = this.f117414a.f().getValue();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f15380e, null, null, null, 0.0f, this.f117415b.getAdsColors().getAdsColorInverse(), null, 94, null);
            LocalThemeScope localThemeScope = this.f117415b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f117414a);
            final v1.d dVar = this.f117414a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.a.c(dVar);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            wi.h.d(localThemeScope, value, 99, badgeY, drawableIcon, (Function0) objB, composer, (q1.h.DrawableIcon.f140067h << 12) | LocalThemeScope.f15770g | 384 | (q1.Badge.f139931e << 9), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14913P interfaceC14913P, Composer composer, Integer num) {
            b(interfaceC14913P, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(v1.d dVar) {
            dVar.m().invoke(C12820c1.f117315a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$b */
    static final class b implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15343c f117416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117417b;

        b(InterfaceC15343c interfaceC15343c, LocalThemeScope localThemeScope) {
            this.f117416a = interfaceC15343c;
            this.f117417b = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1836194979, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.LoadingSpinner.<anonymous>.<anonymous> (TeacherListsComposables.kt:619)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.m.d(this.f117417b, InterfaceC15343c.b(this.f117416a, Modifier.INSTANCE, 0.0f, 1, null), largeLoading, Bi.o.f2584a, null, C16193g.c(C12821d.f117329m, composer, 0), null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 40);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$c */
    static final class c implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117418a;

        c(LocalThemeScope localThemeScope) {
            this.f117418a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(400406566, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.StickyAddToCartButton.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:235)");
            }
            Bi.m.f(this.f117418a, null, Assemble.getLoading().getSmallLoading(), Bi.o.f2584a, C16193g.c(As.c.f1518a, composer, 0), false, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Small.f140102f << 6), 49);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f117420b;

        d(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f117419a = localThemeScope;
            this.f117420b = dVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1926774808, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous> (TeacherListsComposables.kt:932)");
            }
            C12854o0.r0(this.f117419a, this.f117420b, composer, LocalThemeScope.f15770g);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e */
    static final class e implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1.d f117421a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117422b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$a */
        static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117423a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f117424b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SchoolItem f117425c;

            a(LocalThemeScope localThemeScope, v1.d dVar, SchoolItem schoolItem) {
                this.f117423a = localThemeScope;
                this.f117424b = dVar;
                this.f117425c = schoolItem;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1179865690, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:999)");
                }
                C12854o0.x0(this.f117423a, this.f117424b, item, this.f117425c, composer, ((i10 << 6) & 896) | LocalThemeScope.f15770g | (SchoolItem.f1528g << 9));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$b */
        static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117426a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f117427b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClassItem f117428c;

            b(LocalThemeScope localThemeScope, v1.d dVar, ClassItem classItem) {
                this.f117426a = localThemeScope;
                this.f117427b = dVar;
                this.f117428c = classItem;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1723611829, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:1012)");
                }
                C12854o0.u0(this.f117426a, this.f117427b, item, this.f117428c, composer, ((i10 << 6) & 896) | LocalThemeScope.f15770g | (ClassItem.f1513d << 9));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$c */
        static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117429a;

            c(LocalThemeScope localThemeScope) {
                this.f117429a = localThemeScope;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2139307264, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:948)");
                }
                C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f117429a.getAdsSpacing().getFive().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$d */
        static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117430a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f117431b;

            d(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f117430a = localThemeScope;
                this.f117431b = dVar;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1144432297, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:952)");
                }
                C12854o0.U(this.f117430a, this.f117431b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$e, reason: collision with other inner class name */
        static final class C1898e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117432a;

            C1898e(LocalThemeScope localThemeScope) {
                this.f117432a = localThemeScope;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-727429432, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:956)");
                }
                C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f117432a.getAdsSpacing().getFive().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$f */
        static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117433a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f117434b;

            f(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f117433a = localThemeScope;
                this.f117434b = dVar;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1695676135, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:960)");
                }
                C12854o0.j0(this.f117433a, this.f117434b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$g */
        static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117435a;

            g(LocalThemeScope localThemeScope) {
                this.f117435a = localThemeScope;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-176185594, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:964)");
                }
                C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f117435a.getAdsSpacing().getEight().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$h */
        static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117436a;

            h(LocalThemeScope localThemeScope) {
                this.f117436a = localThemeScope;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(18768133, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:969)");
                }
                C12854o0.d0(this.f117436a, item, composer, ((i10 << 3) & 112) | LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$i */
        static final class i implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117437a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f117438b;

            i(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f117437a = localThemeScope;
                this.f117438b = dVar;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(828081819, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:980)");
                }
                C12854o0.X(this.f117437a, this.f117438b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$j */
        static final class j implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117439a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f117440b;

            j(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f117439a = localThemeScope;
                this.f117440b = dVar;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1614432476, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:986)");
                }
                C12854o0.K(this.f117439a, this.f117440b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$k */
        static final class k implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117441a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f117442b;

            k(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f117441a = localThemeScope;
                this.f117442b = dVar;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 6) == 0) {
                    i10 |= composer.V(item) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1894184163, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:992)");
                }
                C12854o0.P(this.f117441a, this.f117442b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f15770g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                a(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$l */
        public /* synthetic */ class l {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[v1.e.values().length];
                try {
                    iArr[v1.e.f117522a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v1.e.f117523b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v1.e.f117524c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[v1.e.f117525d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[v1.e.f117526e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[v1.e.f117527f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[v1.e.f117528g.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        e(v1.d dVar, LocalThemeScope localThemeScope) {
            this.f117421a = dVar;
            this.f117422b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(v1.d dVar, LocalThemeScope localThemeScope, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2139307264, true, new c(localThemeScope)), 3, null);
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1144432297, true, new d(localThemeScope, dVar)), 3, null);
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-727429432, true, new C1898e(localThemeScope)), 3, null);
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1695676135, true, new f(localThemeScope, dVar)), 3, null);
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-176185594, true, new g(localThemeScope)), 3, null);
            if (dVar.a().getValue().booleanValue()) {
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(18768133, true, new h(localThemeScope)), 3, null);
            } else {
                switch (l.$EnumSwitchMapping$0[dVar.e().getValue().ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        FS.page("Find School").start();
                        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(828081819, true, new i(localThemeScope, dVar)), 3, null);
                        break;
                    case 3:
                        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1614432476, true, new j(localThemeScope, dVar)), 3, null);
                        break;
                    case 4:
                        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1894184163, true, new k(localThemeScope, dVar)), 3, null);
                        break;
                    case 5:
                        for (SchoolItem schoolItem : dVar.j()) {
                            l0.w.g(LazyColumn, Integer.valueOf(schoolItem.getId()), null, ComposableLambdaKt.composableLambdaInstance(1179865690, true, new a(localThemeScope, dVar, schoolItem)), 2, null);
                        }
                        break;
                    case 6:
                        FS.page("Find Your Class").start();
                        for (ClassItem classItem : dVar.d()) {
                            l0.w.g(LazyColumn, Integer.valueOf(classItem.getId()), null, ComposableLambdaKt.composableLambdaInstance(-1723611829, true, new b(localThemeScope, dVar, classItem)), 2, null);
                        }
                        break;
                    case 7:
                        FS.page("Shop Your List").start();
                        C12854o0.O0(localThemeScope, dVar, LazyColumn);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.f142422a;
        }

        public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2109759247, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous> (TeacherListsComposables.kt:934)");
            }
            C15339A c15339aB = C15340B.b(0, 0, composer, 0, 3);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            final v1.d dVar = this.f117421a;
            final LocalThemeScope localThemeScope = this.f117422b;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            if (dVar.e().getValue() == v1.e.f117522a) {
                composer.startReplaceGroup(341938604);
                C12854o0.f0(localThemeScope, dVar, composer, LocalThemeScope.f15770g);
                composer.P();
            } else {
                composer.startReplaceGroup(342126743);
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.D.h(InterfaceC14814f.b(c14815g, androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), paddingValues));
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(localThemeScope) | composer.V(dVar);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.p0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C12854o0.e.c(dVar, localThemeScope, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15342b.a(modifierFsUnmask, c15339aB, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 508);
                composer.P();
            }
            composer.startReplaceGroup(565349820);
            if (dVar.e().getValue() == v1.e.f117528g) {
                C12854o0.m0(localThemeScope, dVar, composer, LocalThemeScope.f15770g);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            b(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$f */
    static final class f implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f117444b;

        f(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f117443a = localThemeScope;
            this.f117444b = dVar;
        }

        public final void a(InterfaceC14800I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2022770784, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TopAppBar.<anonymous> (TeacherListsComposables.kt:154)");
            }
            C12854o0.I(this.f117443a, this.f117444b, composer, LocalThemeScope.f15770g);
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
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$g */
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117445a;

        g(LocalThemeScope localThemeScope) {
            this.f117445a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(186591226, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TopAppBar.<anonymous> (TeacherListsComposables.kt:144)");
            }
            C12854o0.G(this.f117445a, composer, LocalThemeScope.f15770g);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$h */
    static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117446a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f117447b;

        h(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f117446a = localThemeScope;
            this.f117447b = dVar;
        }

        public final void c(InterfaceC15343c item, Composer composer, int i10) {
            int i11;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(item) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-672224963, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:695)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(InterfaceC15343c.b(item, companion, 0.0f, 1, null), this.f117446a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            final v1.d dVar = this.f117447b;
            LocalThemeScope localThemeScope = this.f117446a;
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            composer.startReplaceGroup(-1493598202);
            SchoolCard value = dVar.p().getValue();
            SchoolCard schoolCard = new SchoolCard(value.getClassName(), value.getSchoolName(), value.getSchoolYear(), value.getGrade(), value.getDateUpdated());
            Modifier modifierB = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 0.0f, H1.h.p(70), 1, null);
            boolean zBooleanValue = dVar.q().getValue().booleanValue();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(dVar);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.h.d(dVar);
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(dVar);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.r0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.h.e(dVar);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            As.p.p(localThemeScope, schoolCard, modifierB, zBooleanValue, function0, (Function0) objB2, composer, LocalThemeScope.f15770g | 384 | (SchoolCard.f1522f << 3), 0);
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(v1.d dVar) {
            dVar.m().invoke(C12814a1.f117303a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(v1.d dVar) {
            dVar.m().invoke(n1.f117409a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$i */
    static final class i implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117448a;

        i(LocalThemeScope localThemeScope) {
            this.f117448a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-838974540, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:725)");
            }
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f117448a.getAdsSpacing().getFive().getDp()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$j */
    static final class j implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117449a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f117450b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$j$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[v1.c.values().length];
                try {
                    iArr[v1.c.f117517a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v1.c.f117518b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v1.c.f117519c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f117449a = localThemeScope;
            this.f117450b = dVar;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            String str;
            String str2;
            boolean z10;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(671047285, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:729)");
            }
            C5658d.f fVarO = C5658d.f48555a.o(this.f117449a.getAdsSpacing().getThree().getDp());
            Modifier modifierB = d0.T.b(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, this.f117449a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
            LocalThemeScope localThemeScope = this.f117449a;
            final v1.d dVar = this.f117450b;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarO, P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierB);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            composer.startReplaceGroup(-1472565117);
            for (final Pair pair : CollectionsKt.p(TuplesKt.a(v1.c.f117517a, C16193g.c(C12821d.f117333q, composer, 0)), TuplesKt.a(v1.c.f117518b, C16193g.c(C12821d.f117334r, composer, 0)), TuplesKt.a(v1.c.f117519c, C16193g.c(C12821d.f117335s, composer, 0)))) {
                int i11 = a.$EnumSwitchMapping$0[((v1.c) pair.c()).ordinal()];
                if (i11 == 1) {
                    str = "schoolsupplies_all";
                } else if (i11 == 2) {
                    str = "schoolsupplies_available";
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "schoolsupplies_unavailable";
                }
                if (dVar.l().getValue() == pair.c()) {
                    str2 = str;
                    z10 = true;
                } else {
                    str2 = str;
                    z10 = false;
                }
                String str3 = (String) pair.d();
                Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(Modifier.INSTANCE, "Chip", str2);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(dVar) | composer.V(pair);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.s0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12854o0.j.c(dVar, pair);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                As.p.j(localThemeScope, z10, str3, modifierFsAttribute, (Function0) objB, composer, LocalThemeScope.f15770g, 0);
            }
            composer.P();
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
        public static final Unit c(v1.d dVar, Pair pair) {
            dVar.m().invoke(new ChangeFilter((v1.c) pair.c()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$k */
    static final class k implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117451a;

        k(LocalThemeScope localThemeScope) {
            this.f117451a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2113898186, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:772)");
            }
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f117451a.getAdsSpacing().getFive().getDp()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$l */
    static final class l implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductListDecorator f117452a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f117453b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117454c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f117455d;

        l(ProductListDecorator productListDecorator, v1.d dVar, LocalThemeScope localThemeScope, int i10) {
            this.f117452a = productListDecorator;
            this.f117453b = dVar;
            this.f117454c = localThemeScope;
            this.f117455d = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(v1.d dVar, InterfaceC17023a it) {
            Intrinsics.j(it, "it");
            if (it instanceof InterfaceC17023a.FindSimilarItems) {
                dVar.m().invoke(new FindSimilarTapped(((InterfaceC17023a.FindSimilarItems) it).getProduct()));
            } else if (it instanceof InterfaceC17023a.ProductItemClicked) {
                dVar.m().invoke(new ProductCardTapped(((InterfaceC17023a.ProductItemClicked) it).getItemClicked().getProduct()));
            } else if (!(it instanceof InterfaceC17023a.SendCriteoLoadBeacon) && !(it instanceof InterfaceC17023a.SendCriteoOnViewBeacon)) {
                if (!(it instanceof InterfaceC17023a.UpdateEntry)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC17023a.UpdateEntry updateEntry = (InterfaceC17023a.UpdateEntry) it;
                dVar.m().invoke(new UpdateEntryAction(updateEntry.getProductToAdd(), updateEntry.getQuantity(), new Rect()));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r() {
            return Unit.f142422a;
        }

        public final void g(InterfaceC15343c item, Composer composer, int i10) {
            int i11;
            int i12;
            boolean z10;
            ClippableCouponDecorator clippableCouponDecorator;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(item) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(985049839, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:784)");
            }
            boolean isOutOfStock = this.f117452a.getIsOutOfStock();
            Modifier modifierA = InterfaceC15343c.a(item, Modifier.INSTANCE, null, null, null, 7, null);
            final ProductListDecorator productListDecorator = this.f117452a;
            final v1.d dVar = this.f117453b;
            LocalThemeScope localThemeScope = this.f117454c;
            int i13 = this.f117455d;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            ProductCardDecorator productCardDecoratorV = productListDecorator.V();
            if (productListDecorator.getCoupon() != null) {
                i12 = i13;
                z10 = true;
            } else {
                i12 = i13;
                z10 = false;
            }
            CouponCountDownStateDecorator couponCountDownStateDecorator = productListDecorator.getCouponCountDownStateDecorator();
            ClippableCouponDecorator clippableCouponDecoratorB = couponCountDownStateDecorator != null ? couponCountDownStateDecorator.b() : null;
            Double dValueOf = productListDecorator.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r13.intValue()) : null;
            double dDoubleValue = 2.147483647E9d;
            if (dValueOf == null) {
                clippableCouponDecorator = clippableCouponDecoratorB;
            } else {
                clippableCouponDecorator = clippableCouponDecoratorB;
                if (!Intrinsics.b(dValueOf, 0.0d)) {
                    Double dValueOf2 = productListDecorator.getProduct().getMaxOrderQuantity() != null ? Double.valueOf(r9.intValue()) : null;
                    Intrinsics.g(dValueOf2);
                    dDoubleValue = dValueOf2.doubleValue();
                }
            }
            double d10 = dDoubleValue;
            boolean isSelected = productListDecorator.getIsSelected();
            boolean z11 = productListDecorator.getSponsorship() != null;
            boolean zBooleanValue = dVar.k().getValue().booleanValue();
            boolean zBooleanValue2 = dVar.c().getValue().booleanValue();
            boolean showQuantityRequested = productListDecorator.getShowQuantityRequested();
            int quantityRequested = productListDecorator.getQuantityRequested();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(dVar);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.t0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.l.k(dVar, (InterfaceC17023a) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(dVar) | composer.D(productListDecorator);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.l.p(dVar, productListDecorator);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(productListDecorator) | composer.V(dVar);
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.v0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.l.q(productListDecorator, dVar);
                    }
                };
                composer.t(objB3);
            }
            Function0 function02 = (Function0) objB3;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB4 == companion2.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.w0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.l.r();
                    }
                };
                composer.t(objB4);
            }
            Function0 function03 = (Function0) objB4;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = composer.V(dVar) | composer.D(productListDecorator);
            Object objB5 = composer.B();
            if (zV3 || objB5 == companion2.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.l.l(dVar, productListDecorator);
                    }
                };
                composer.t(objB5);
            }
            Function0 function04 = (Function0) objB5;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV4 = composer.V(dVar) | composer.D(productListDecorator);
            Object objB6 = composer.B();
            if (zV4 || objB6 == companion2.a()) {
                objB6 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.y0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.l.o(dVar, productListDecorator);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            C17037o.v(localThemeScope, productCardDecoratorV, i12, function1, z10, clippableCouponDecorator, function0, function02, function03, d10, isOutOfStock, function04, (Function0) objB6, null, isSelected, false, z11, zBooleanValue, showQuantityRequested, quantityRequested, zBooleanValue2, false, false, null, composer, 100663296 | LocalThemeScope.f15770g | (ProductCardDecorator.f162061C << 3) | (ClippableCouponDecorator.f13160c << 15), 196608, 48, 6295552);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            g(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(v1.d dVar, ProductListDecorator productListDecorator) {
            dVar.m().invoke(new FindSimilarTapped(productListDecorator.getProduct()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(v1.d dVar, ProductListDecorator productListDecorator) {
            dVar.m().invoke(new StepperStateChangedAction(productListDecorator.getProduct().getCode(), 0.0d, new Rect()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(v1.d dVar, ProductListDecorator productListDecorator) {
            dVar.m().invoke(new ClipCouponAction(productListDecorator));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(ProductListDecorator productListDecorator, v1.d dVar) {
            Coupon coupon = productListDecorator.getCoupon();
            if (coupon != null) {
                dVar.m().invoke(new CouponDetailsAction(coupon));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$m */
    static final class m implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117456a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f117457b;

        m(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f117456a = localThemeScope;
            this.f117457b = dVar;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-642854769, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:890)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f117456a.getAdsSpacing().getSeven().getDp());
            LocalThemeScope localThemeScope = this.f117456a;
            v1.d dVar = this.f117457b;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null), "Unavailable Supply List Items:", null, composer, LocalThemeScope.f15770g | 384 | (q1.Label.f140080j << 3), 4);
            Composer composer2 = composer;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.o(localThemeScope.getAdsSpacing().getThree().getDp()), companion2.k(), composer2, 0);
            int iA2 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            composer2.startReplaceGroup(719929538);
            SnapshotStateList<UnavailableItem> snapshotStateListH = dVar.h();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(snapshotStateListH, 10));
            Iterator<UnavailableItem> it = snapshotStateListH.iterator();
            while (it.hasNext()) {
                As.p.v(localThemeScope, it.next(), null, composer2, (UnavailableItem.f1606c << 3) | LocalThemeScope.f15770g, 2);
                arrayList.add(Unit.f142422a);
                composer2 = composer;
            }
            composer.P();
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void K(LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15343c interfaceC15343c, Composer composer, final int i10) {
        int i11;
        final v1.d dVar2;
        Composer composer2;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-898012051);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC15343c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
            dVar2 = dVar;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-898012051, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.EmptyStateContent (TeacherListsComposables.kt:456)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(InterfaceC15343c.b(interfaceC15343c, companion, 0.0f, 1, null), H1.h.p((float) 8.5d), 0.0f, 2, null);
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composerStartRestartGroup, 48);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16190d.c(C12818c.f117311a, composerStartRestartGroup, 0);
            InterfaceC5784k interfaceC5784kE = InterfaceC5784k.INSTANCE.e();
            Modifier modifierB = InterfaceC14800I.b(c14801j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.U
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.L((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i12 = i11;
            C13457y.a(cVarC, null, C16705m.d(modifierB, false, (Function1) objB, 1, null), null, interfaceC5784kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String strC = C16193g.c(C12821d.f117324h, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f15770g;
            int i14 = i12 & 14;
            ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i13 | i14 | (q1.Label.f140080j << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB2 = InterfaceC14800I.b(c14801j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA4 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB2);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C15862t0 c15862t0 = C15862t0.f151797a;
            String strC2 = C16193g.c(C12821d.f117340x, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i15 = i12 & 112;
            boolean z10 = i15 == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion4.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.V
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.M(dVar);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            ni.P0.k(localThemeScope, c15862t0, strC2, (Function0) objB2, null, null, true, 0L, false, composerStartRestartGroup, (C15862t0.f151798b << 3) | i13 | 1572864 | i14, 216);
            composerStartRestartGroup.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH3 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA5 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR5 = composerStartRestartGroup.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH3);
            Function0<InterfaceC5811g> function0A5 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A5);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5742sR5, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB3 = InterfaceC14800I.b(c14801j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
            int iA6 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR6 = composerStartRestartGroup.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB3);
            Function0<InterfaceC5811g> function0A6 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A6);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5742sR6, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            C15868w0 c15868w0 = C15868w0.f151812a;
            String strC3 = C16193g.c(C12821d.f117322f, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i15 == 32;
            Object objB3 = composerStartRestartGroup.B();
            if (z11 || objB3 == companion4.a()) {
                dVar2 = dVar;
                objB3 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.N(dVar2);
                    }
                };
                composerStartRestartGroup.t(objB3);
            } else {
                dVar2 = dVar;
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            ni.P0.k(localThemeScope2, c15868w0, strC3, (Function0) objB3, null, null, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C15868w0.f151813b << 3), 216);
            composer2 = composerStartRestartGroup;
            composer2.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composer2, 0);
            composer2.v();
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.X
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.O(localThemeScope2, dVar2, interfaceC15343c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void P(LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15343c interfaceC15343c, Composer composer, final int i10) {
        int i11;
        final v1.d dVar2;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(884638098);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC15343c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            dVar2 = dVar;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(884638098, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.ErrorStateContent (TeacherListsComposables.kt:534)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(InterfaceC15343c.b(interfaceC15343c, companion, 0.0f, 1, null), H1.h.p((float) 8.5d), 0.0f, 2, null);
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composerStartRestartGroup, 48);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16190d.c(C12818c.f117311a, composerStartRestartGroup, 0);
            InterfaceC5784k interfaceC5784kE = InterfaceC5784k.INSTANCE.e();
            Modifier modifierB = InterfaceC14800I.b(c14801j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.Q((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i12 = i11;
            C13457y.a(cVarC, null, C16705m.d(modifierB, false, (Function1) objB, 1, null), null, interfaceC5784kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String strC = C16193g.c(C12821d.f117327k, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f15770g;
            int i14 = i12 & 14;
            int i15 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, (i15 << 3) | i13 | i14, 4);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(C12821d.f117326j, composerStartRestartGroup, 0), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB2 = InterfaceC14800I.b(c14801j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA4 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB2);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C15862t0 c15862t0 = C15862t0.f151797a;
            String strC2 = C16193g.c(C12821d.f117340x, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i16 = i12 & 112;
            boolean z10 = i16 == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion4.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.R(dVar);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            ni.P0.k(localThemeScope, c15862t0, strC2, (Function0) objB2, null, null, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C15862t0.f151798b << 3), 216);
            composerStartRestartGroup.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH3 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA5 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR5 = composerStartRestartGroup.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH3);
            Function0<InterfaceC5811g> function0A5 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A5);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5742sR5, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB3 = InterfaceC14800I.b(c14801j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
            int iA6 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR6 = composerStartRestartGroup.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB3);
            Function0<InterfaceC5811g> function0A6 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A6);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5742sR6, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            C15868w0 c15868w0 = C15868w0.f151812a;
            String strC3 = C16193g.c(C12821d.f117322f, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i16 == 32;
            Object objB3 = composerStartRestartGroup.B();
            if (z11 || objB3 == companion4.a()) {
                dVar2 = dVar;
                objB3 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.S(dVar2);
                    }
                };
                composerStartRestartGroup.t(objB3);
            } else {
                dVar2 = dVar;
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            ni.P0.k(localThemeScope2, c15868w0, strC3, (Function0) objB3, null, null, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C15868w0.f151813b << 3), 216);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.T(localThemeScope2, dVar2, interfaceC15343c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void X(LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15343c interfaceC15343c, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(1935474787);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC15343c) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1935474787, i12, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.LandingPageContent (TeacherListsComposables.kt:332)");
            }
            C5658d c5658d = C5658d.f48555a;
            C5658d.f fVarB = c5658d.b();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierB = InterfaceC15343c.b(interfaceC15343c, androidx.compose.foundation.layout.D.k(companion, localThemeScope2.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), 0.0f, 1, null);
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarB, companion2.l(), composerStartRestartGroup, 6);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.b(), companion2.k(), composerStartRestartGroup, 6);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composerStartRestartGroup, 0);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 381, null);
            String strC = C16193g.c(C12821d.f117337u, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f15770g;
            int i14 = i12 & 14;
            int i15 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA4 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            Modifier modifierA = c14801j.a(androidx.compose.foundation.layout.J.A(companion, H1.h.p(50), H1.h.p(240)), 1.0f, false);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA5 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR5 = composerStartRestartGroup.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA);
            Function0<InterfaceC5811g> function0A5 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A5);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5742sR5, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            String value = dVar.i().getValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i16 = i12 & 112;
            boolean z10 = i16 == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.H
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.Y(dVar, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composerStartRestartGroup.P();
            String strC2 = C16193g.c(C12821d.f117337u, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i16 == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.Z(dVar, (InterfaceC5692y) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            As.p.l(localThemeScope, value, function1, strC2, (Function1) objB2, null, composerStartRestartGroup, i13 | i14, 16);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_search");
            C15862t0 c15862t0 = C15862t0.f151797a;
            String strC3 = C16193g.c(C12821d.f117336t, composerStartRestartGroup, 0);
            boolean z12 = dVar.i().getValue().length() >= 5 && !StringsKt.r0(dVar.i().getValue());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z13 = i16 == 32;
            Object objB3 = composerStartRestartGroup.B();
            if (z13 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.a0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            ni.P0.k(localThemeScope, c15862t0, strC3, (Function0) objB3, modifierFsAttribute, null, false, 0L, z12, composerStartRestartGroup, i13 | i14 | (C15862t0.f151798b << 3), 112);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p((float) 8.5d), 0.0f, 2, null);
            MeasurePolicy measurePolicyA3 = C5665k.a(c5658d.h(), companion2.g(), composerStartRestartGroup, 48);
            int iA6 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR6 = composerStartRestartGroup.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            Function0<InterfaceC5811g> function0A6 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A6);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyA3, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5742sR6, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA7 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR7 = composerStartRestartGroup.r();
            Modifier modifierE7 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5811g> function0A7 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A7);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA7 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA7, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA7, interfaceC5742sR7, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B7 = companion3.b();
            if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                composerA7.t(Integer.valueOf(iA7));
                composerA7.n(Integer.valueOf(iA7), function2B7);
            }
            androidx.compose.runtime.D1.c(composerA7, modifierE7, companion3.f());
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16190d.c(C12818c.f117312b, composerStartRestartGroup, 0);
            InterfaceC5784k interfaceC5784kE = InterfaceC5784k.INSTANCE.e();
            Modifier modifierB2 = InterfaceC14800I.b(c14801j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.b0((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            C13457y.a(cVarC, null, C16705m.d(modifierB2, false, (Function1) objB4, 1, null), null, interfaceC5784kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup = composerStartRestartGroup;
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            localThemeScope2 = localThemeScope;
            ri.j.h(localThemeScope2, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(C12821d.f117325i, composerStartRestartGroup, 0), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.L
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.c0(localThemeScope2, dVar, interfaceC15343c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        G(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        I(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
        K(localThemeScope, dVar, interfaceC15343c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void O0(LocalThemeScope localThemeScope, v1.d dVar, l0.w wVar) {
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-672224963, true, new h(localThemeScope, dVar)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-838974540, true, new i(localThemeScope)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(671047285, true, new j(localThemeScope, dVar)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-2113898186, true, new k(localThemeScope)), 3, null);
        if (CollectionsKt.p(v1.c.f117517a, v1.c.f117518b).contains(dVar.l().getValue())) {
            SnapshotStateList<ProductListDecorator> snapshotStateListN = dVar.n();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(snapshotStateListN, 10));
            int i10 = 0;
            for (ProductListDecorator productListDecorator : snapshotStateListN) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                ProductListDecorator productListDecorator2 = productListDecorator;
                l0.w.g(wVar, i10 + " | " + productListDecorator2.getProduct().getCode(), null, ComposableLambdaKt.composableLambdaInstance(985049839, true, new l(productListDecorator2, dVar, localThemeScope, i10)), 2, null);
                arrayList.add(Unit.f142422a);
                i10 = i11;
            }
        }
        if (CollectionsKt.p(v1.c.f117517a, v1.c.f117519c).contains(dVar.l().getValue())) {
            l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-642854769, true, new m(localThemeScope, dVar)), 3, null);
            l0.w.g(wVar, null, null, C12812a.f117297a.a(), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
        P(localThemeScope, dVar, interfaceC15343c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void U(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15343c interfaceC15343c, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1595134857);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC15343c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1595134857, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.HeaderTitle (TeacherListsComposables.kt:163)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierB = InterfaceC15343c.b(interfaceC15343c, companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.g(), composerStartRestartGroup, 48);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.I four = localThemeScope.getAdsTypography().getHeadings().getFour();
            Ji.T adsColorBrandPrimary = localThemeScope.getAdsColors().getAdsColorBrandPrimary();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.V((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            ri.j.h(localThemeScope, new q1.Label(C16705m.d(companion, false, (Function1) objB, 1, null), adsColorBrandPrimary, null, null, 0, false, 0, four, null, 380, null), C6408b.a(dVar.g().getValue(), composerStartRestartGroup, AbstractC5607a.f45514b), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.W(localThemeScope, dVar, interfaceC15343c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
        U(localThemeScope, dVar, interfaceC15343c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(v1.d dVar, String zipCode) {
        Intrinsics.j(zipCode, "zipCode");
        Function1<v1.a, Unit> function1M = dVar.m();
        if (zipCode.length() > 5) {
            zipCode = dVar.i().getValue();
        }
        function1M.invoke(new UpdateSearchTerm(zipCode));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(v1.d dVar, InterfaceC5692y TeacherListsSearchBar) {
        Intrinsics.j(TeacherListsSearchBar, "$this$TeacherListsSearchBar");
        dVar.m().invoke(C12844k1.f117390a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
        X(localThemeScope, dVar, interfaceC15343c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(LocalThemeScope localThemeScope, InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
        d0(localThemeScope, interfaceC15343c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void f0(LocalThemeScope localThemeScope, final v1.d dVar, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-398279932);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-398279932, i12, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.OutOfSeasonContent (TeacherListsComposables.kt:276)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), H1.h.p((float) 8.5d), 0.0f, 2, null);
            C5658d c5658d = C5658d.f48555a;
            C5658d.f fVarB = c5658d.b();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(fVarB, companion2.g(), composerStartRestartGroup, 54);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            C14802K.a(InterfaceC14814f.b(c14815g, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16190d.c(C12818c.f117311a, composerStartRestartGroup, 0);
            InterfaceC5784k interfaceC5784kE = InterfaceC5784k.INSTANCE.e();
            Modifier modifierB = InterfaceC14800I.b(c14801j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12854o0.g0((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            boolean z10 = true;
            C13457y.a(cVarC, null, C16705m.d(modifierB, false, (Function1) objB, 1, null), null, interfaceC5784kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String strC = C16193g.c(C12821d.f117332p, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f15770g;
            int i14 = i12 & 14;
            int i15 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, (i15 << 3) | i13 | i14, 4);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(C12821d.f117330n, composerStartRestartGroup, 0), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            C15862t0 c15862t0 = C15862t0.f151797a;
            String strC2 = C16193g.c(C12821d.f117331o, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i12 & 112) != 32) {
                z10 = false;
            }
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion4.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.h0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            ni.P0.k(localThemeScope2, c15862t0, strC2, (Function0) objB2, null, null, false, 0L, false, composerStartRestartGroup, i13 | i14 | (C15862t0.f151798b << 3), 248);
            composerStartRestartGroup = composerStartRestartGroup;
            C14802K.a(InterfaceC14814f.b(c14815g, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.i0(localThemeScope2, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        f0(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void j0(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15343c interfaceC15343c, Composer composer, final int i10) {
        int i11;
        Function0 function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(-613553929);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC15343c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-613553929, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.ProgressTracker (TeacherListsComposables.kt:186)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, dVar.b().getValue().intValue() == 0 ? localThemeScope.getAdsSpacing().getTen().getDp() : H1.h.p(0), H1.h.p(dVar.b().getValue().intValue() == 0 ? 6 : 0), dVar.b().getValue().intValue() == 0 ? localThemeScope.getAdsSpacing().getTen().getDp() : H1.h.p(0), 0.0f, 8, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            int iIntValue = dVar.b().getValue().intValue();
            List listP = CollectionsKt.p(C16193g.c(C12821d.f117316A, composerStartRestartGroup, 0), C16193g.c(C12821d.f117341y, composerStartRestartGroup, 0), C16193g.c(C12821d.f117342z, composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceGroup(1733001478);
            if (dVar.b().getValue().intValue() == 0) {
                function0 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z10 = (i11 & 112) == 32;
                Object objB = composerStartRestartGroup.B();
                if (z10 || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12854o0.k0(dVar);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function0 = (Function0) objB;
                composerStartRestartGroup.P();
            }
            Function0 function02 = function0;
            composerStartRestartGroup.P();
            Ei.k.k(localThemeScope, listP, Integer.valueOf(iIntValue), companion, false, false, false, false, 0, 0, function02, composerStartRestartGroup, 1797120 | LocalThemeScope.f15770g | (i11 & 14), 0, 448);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.T
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.l0(localThemeScope, dVar, interfaceC15343c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
        j0(localThemeScope, dVar, interfaceC15343c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void m0(final LocalThemeScope localThemeScope, final v1.d dVar, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1225216380);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1225216380, i12, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.StickyAddToCartButton (TeacherListsComposables.kt:223)");
            }
            C17917Z.a(null, 0L, 0.0f, 0.0f, composerStartRestartGroup, 0, 15);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, 1, null), localThemeScope.getAdsSpacing().getFive().getDp());
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            boolean zBooleanValue = dVar.q().getValue().booleanValue();
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.e(), false);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            composerStartRestartGroup.startReplaceGroup(-1200593480);
            if (zBooleanValue) {
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(400406566, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i12 & 14) | (Q0.b.f139712b << 3));
            }
            composerStartRestartGroup.P();
            Modifier modifierA = zBooleanValue ? T0.a.a(companion, 0.0f) : T0.a.a(companion, 1.0f);
            MeasurePolicy measurePolicyG3 = C5662h.g(companion2.o(), false);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyG3, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C15854p c15854p = C15854p.f151759a;
            String strC = C16193g.c(As.c.f1520c, composerStartRestartGroup, 0);
            C.b.a.C0247b c0247b = C.b.a.C0247b.f15372e;
            boolean z10 = !zBooleanValue;
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_addAllToCart");
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = (i12 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.n0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            ni.P0.h(localThemeScope, c15854p, (Function0) objB, c0247b, strC, modifierFsAttribute, null, true, z10, false, 0L, composerStartRestartGroup, 12582912 | LocalThemeScope.f15770g | (i12 & 14) | (C15854p.f151760b << 3) | (C.b.a.C0247b.f15373f << 9), 0, 800);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.P
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.o0(localThemeScope, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        m0(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p0(final Ji.LocalThemeScope r32, final com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.shoppinglist.teacherlists.ux.C12854o0.p0(Ji.M, com.meijer.mobile.shoppinglist.teacherlists.ux.v1$d, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(LocalThemeScope localThemeScope, v1.d dVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p0(localThemeScope, dVar, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void r0(final LocalThemeScope localThemeScope, final v1.d dVar, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-118569798);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-118569798, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TopAppBar (TeacherListsComposables.kt:142)");
            }
            C.f.o oVar = C.f.o.f15522e;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(C12821d.f117323g, new Object[0]);
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(Modifier.INSTANCE, "Button", "schoolsupplies_exit");
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-2022770784, true, new f(localThemeScope, dVar), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(186591226, true, new g(localThemeScope), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.s0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Dr.g.f(localThemeScope, null, composableLambdaC, modifierFsAttribute, composableLambdaC2, (Function0) objB, oVar, 0.0f, false, abstractC5607aD, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 24960 | (C.f.o.f15523f << 18) | (AbstractC5607a.f45514b << 27), 193);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.t0(localThemeScope, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        r0(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void u0(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15343c interfaceC15343c, final ClassItem classItem, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1657213002);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC15343c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(classItem) : composerStartRestartGroup.D(classItem) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1657213002, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.UIClassItem (TeacherListsComposables.kt:664)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048 || ((i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && composerStartRestartGroup.D(classItem)));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.v0(dVar, classItem);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            As.p.n(localThemeScope, classItem, (Function0) objB, androidx.compose.foundation.layout.J.b(InterfaceC15343c.b(interfaceC15343c, companion, 0.0f, 1, null), 0.0f, H1.h.p(54), 1, null), composerStartRestartGroup, ((i11 >> 6) & 112) | LocalThemeScope.f15770g | (i11 & 14) | (ClassItem.f1513d << 3), 0);
            ClassItem classItem2 = (ClassItem) CollectionsKt.F0(dVar.d());
            if (classItem2 != null && classItem.getId() == classItem2.getId()) {
                composerStartRestartGroup.startReplaceGroup(-1782434577);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1782342321);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            }
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.N
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.w0(localThemeScope, dVar, interfaceC15343c, classItem, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15343c interfaceC15343c, ClassItem classItem, int i10, Composer composer, int i11) {
        u0(localThemeScope, dVar, interfaceC15343c, classItem, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void x0(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15343c interfaceC15343c, final SchoolItem schoolItem, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-701076552);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC15343c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(schoolItem) : composerStartRestartGroup.D(schoolItem) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-701076552, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.UISchoolItem (TeacherListsComposables.kt:635)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048 || ((i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && composerStartRestartGroup.D(schoolItem)));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12854o0.y0(dVar, schoolItem);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            As.p.t(localThemeScope, schoolItem, (Function0) objB, androidx.compose.foundation.layout.J.b(InterfaceC15343c.b(interfaceC15343c, companion, 0.0f, 1, null), 0.0f, H1.h.p(70), 1, null), composerStartRestartGroup, ((i11 >> 6) & 112) | LocalThemeScope.f15770g | (i11 & 14) | (SchoolItem.f1528g << 3), 0);
            SchoolItem schoolItem2 = (SchoolItem) CollectionsKt.F0(dVar.j());
            if (schoolItem2 != null && schoolItem.getId() == schoolItem2.getId()) {
                composerStartRestartGroup.startReplaceGroup(726752289);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(726844545);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            }
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.z0(localThemeScope, dVar, interfaceC15343c, schoolItem, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15343c interfaceC15343c, SchoolItem schoolItem, int i10, Composer composer, int i11) {
        x0(localThemeScope, dVar, interfaceC15343c, schoolItem, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void G(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        boolean zD;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1741575128);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1741575128, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.AppBarTitle (TeacherListsComposables.kt:107)");
            }
            localThemeScope2 = localThemeScope;
            Dr.g.g(localThemeScope2, C16193g.c(C12821d.f117317a, composerStartRestartGroup, 0), null, false, null, 0, null, 0, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14), 126);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.H(localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void I(final LocalThemeScope localThemeScope, final v1.d dVar, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1292495588);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(dVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1292495588, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.CartIcon (TeacherListsComposables.kt:115)");
            }
            Ji.Q.e(localThemeScope, InterfaceC14935g.a.f139807a, ComposableLambdaKt.c(399726642, true, new a(dVar, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14935g.a.f139808b << 3));
            C14802K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.J(localThemeScope, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(v1.d dVar) {
        dVar.m().invoke(p1.f117462a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(v1.d dVar) {
        dVar.m().invoke(o1.f117458a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(v1.d dVar) {
        dVar.m().invoke(p1.f117462a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(v1.d dVar) {
        dVar.m().invoke(o1.f117458a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(v1.d dVar) {
        dVar.m().invoke(C12844k1.f117390a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void d0(final LocalThemeScope localThemeScope, final InterfaceC15343c interfaceC15343c, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1968560984);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(interfaceC15343c)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1968560984, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.LoadingSpinner (TeacherListsComposables.kt:615)");
            }
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(136)), composerStartRestartGroup, 6);
            Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(1836194979, true, new b(interfaceC15343c, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12854o0.e0(localThemeScope, interfaceC15343c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(v1.d dVar) {
        dVar.m().invoke(C12832g1.f117361a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(v1.d dVar) {
        dVar.m().invoke(C12817b1.f117310a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(v1.d dVar) {
        dVar.m().invoke(C12814a1.f117303a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(v1.d dVar) {
        dVar.m().invoke(C12829f1.f117357a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(v1.d dVar, ClassItem classItem) {
        dVar.m().invoke(new GetSupplies(classItem));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(v1.d dVar, SchoolItem schoolItem) {
        dVar.m().invoke(new GetClasses(schoolItem));
        return Unit.f142422a;
    }
}
