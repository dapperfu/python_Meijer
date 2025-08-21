package com.meijer.mobile.shoppinglist.teacherlists.ux;

import As.ClassItem;
import As.SchoolCard;
import As.SchoolItem;
import As.UnavailableItem;
import Hr.ClippableCouponDecorator;
import Hr.CouponCountDownStateDecorator;
import Ki.C;
import Ki.LocalThemeScope;
import M0.SnapshotStateList;
import P0.e;
import Pk.Coupon;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.shoppinglist.teacherlists.ux.C12980o0;
import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import d0.C13590y;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC15147P;
import ki.InterfaceC15154X;
import ki.InterfaceC15169g;
import ki.Q0;
import ki.q1;
import kotlin.C17983Z;
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
import l0.C15429A;
import l0.C15430B;
import l0.C15432b;
import l0.InterfaceC15433c;
import oi.C16188p;
import oi.C16196t0;
import oi.C16202w0;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;
import ss.InterfaceC17146a;
import ts.ProductCardDecorator;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a#\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0007\u001a#\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\f\u001a#\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\f\u001a#\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\f\u001a\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010#\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"LKi/M;", "", "G", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;", "viewState", "I", "(LKi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Landroidx/compose/runtime/Composer;I)V", "r0", "Ll0/c;", "lazyItemScope", "U", "(LKi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/c;Landroidx/compose/runtime/Composer;I)V", "j0", "m0", "f0", "X", "K", "P", "d0", "(LKi/M;Ll0/c;Landroidx/compose/runtime/Composer;I)V", "LAs/e;", "schoolItem", "x0", "(LKi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/c;LAs/e;Landroidx/compose/runtime/Composer;I)V", "LAs/a;", "classItem", "u0", "(LKi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/c;LAs/a;Landroidx/compose/runtime/Composer;I)V", "Ll0/w;", "lazyListScope", "O0", "(LKi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Ll0/w;)V", "Landroidx/compose/ui/Modifier;", "modifier", "p0", "(LKi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C12980o0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$a */
    static final class a implements Function3<InterfaceC15147P, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1.d f118359a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118360b;

        a(v1.d dVar, LocalThemeScope localThemeScope) {
            this.f118359a = dVar;
            this.f118360b = localThemeScope;
        }

        public final void b(InterfaceC15147P Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(399726642, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.CartIcon.<anonymous> (TeacherListsComposables.kt:117)");
            }
            q1.Badge badgeY = q1.Badge.y(Assemble.getBadges().getPrimary(), Assemble.getBadges().getPrimary().getModifier().then(FullStoryAnnotationsKt.fsAttribute(Modifier.INSTANCE, "Button", "schoolsupplies_cartButton")), null, null, null, 14, null);
            Integer value = this.f118359a.f().getValue();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.h.f16924e, null, null, null, 0.0f, this.f118360b.getAdsColors().getAdsColorInverse(), null, 94, null);
            LocalThemeScope localThemeScope = this.f118360b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f118359a);
            final v1.d dVar = this.f118359a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.a.c(dVar);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            xi.h.d(localThemeScope, value, 99, badgeY, drawableIcon, (Function0) objB, composer, (q1.h.DrawableIcon.f142322h << 12) | LocalThemeScope.f17314g | 384 | (q1.Badge.f142186e << 9), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15147P interfaceC15147P, Composer composer, Integer num) {
            b(interfaceC15147P, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(v1.d dVar) {
            dVar.m().invoke(C12946c1.f118260a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$b */
    static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15433c f118361a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118362b;

        b(InterfaceC15433c interfaceC15433c, LocalThemeScope localThemeScope) {
            this.f118361a = interfaceC15433c;
            this.f118362b = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1836194979, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.LoadingSpinner.<anonymous>.<anonymous> (TeacherListsComposables.kt:619)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.m.d(this.f118362b, InterfaceC15433c.b(this.f118361a, Modifier.INSTANCE, 0.0f, 1, null), largeLoading, Ci.o.f4629a, null, C16338g.c(C12947d.f118274m, composer, 0), null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 40);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$c */
    static final class c implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118363a;

        c(LocalThemeScope localThemeScope) {
            this.f118363a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(400406566, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.StickyAddToCartButton.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:235)");
            }
            Ci.m.f(this.f118363a, null, Assemble.getLoading().getSmallLoading(), Ci.o.f4629a, C16338g.c(As.c.f2015a, composer, 0), false, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Small.f142357f << 6), 49);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f118365b;

        d(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f118364a = localThemeScope;
            this.f118365b = dVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1926774808, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous> (TeacherListsComposables.kt:932)");
            }
            C12980o0.r0(this.f118364a, this.f118365b, composer, LocalThemeScope.f17314g);
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
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e */
    static final class e implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1.d f118366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118367b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$a */
        static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118368a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f118369b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SchoolItem f118370c;

            a(LocalThemeScope localThemeScope, v1.d dVar, SchoolItem schoolItem) {
                this.f118368a = localThemeScope;
                this.f118369b = dVar;
                this.f118370c = schoolItem;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.x0(this.f118368a, this.f118369b, item, this.f118370c, composer, ((i10 << 6) & 896) | LocalThemeScope.f17314g | (SchoolItem.f2025g << 9));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$b */
        static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118371a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f118372b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClassItem f118373c;

            b(LocalThemeScope localThemeScope, v1.d dVar, ClassItem classItem) {
                this.f118371a = localThemeScope;
                this.f118372b = dVar;
                this.f118373c = classItem;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.u0(this.f118371a, this.f118372b, item, this.f118373c, composer, ((i10 << 6) & 896) | LocalThemeScope.f17314g | (ClassItem.f2010d << 9));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$c */
        static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118374a;

            c(LocalThemeScope localThemeScope) {
                this.f118374a = localThemeScope;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2139307264, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:948)");
                }
                C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f118374a.getAdsSpacing().getFive().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$d */
        static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118375a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f118376b;

            d(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f118375a = localThemeScope;
                this.f118376b = dVar;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.U(this.f118375a, this.f118376b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$e, reason: collision with other inner class name */
        static final class C1905e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118377a;

            C1905e(LocalThemeScope localThemeScope) {
                this.f118377a = localThemeScope;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-727429432, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:956)");
                }
                C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f118377a.getAdsSpacing().getFive().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$f */
        static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118378a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f118379b;

            f(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f118378a = localThemeScope;
                this.f118379b = dVar;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.j0(this.f118378a, this.f118379b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$g */
        static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118380a;

            g(LocalThemeScope localThemeScope) {
                this.f118380a = localThemeScope;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-176185594, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeacherListsComposables.kt:964)");
                }
                C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f118380a.getAdsSpacing().getEight().getDp()), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$h */
        static final class h implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118381a;

            h(LocalThemeScope localThemeScope) {
                this.f118381a = localThemeScope;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.d0(this.f118381a, item, composer, ((i10 << 3) & 112) | LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$i */
        static final class i implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118382a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f118383b;

            i(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f118382a = localThemeScope;
                this.f118383b = dVar;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.X(this.f118382a, this.f118383b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$j */
        static final class j implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118384a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f118385b;

            j(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f118384a = localThemeScope;
                this.f118385b = dVar;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.K(this.f118384a, this.f118385b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$k */
        static final class k implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118386a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1.d f118387b;

            k(LocalThemeScope localThemeScope, v1.d dVar) {
                this.f118386a = localThemeScope;
                this.f118387b = dVar;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
                C12980o0.P(this.f118386a, this.f118387b, item, composer, ((i10 << 6) & 896) | LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                a(interfaceC15433c, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$e$l */
        public /* synthetic */ class l {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[v1.e.values().length];
                try {
                    iArr[v1.e.f118467a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v1.e.f118468b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v1.e.f118469c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[v1.e.f118470d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[v1.e.f118471e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[v1.e.f118472f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[v1.e.f118473g.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        e(v1.d dVar, LocalThemeScope localThemeScope) {
            this.f118366a = dVar;
            this.f118367b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(v1.d dVar, LocalThemeScope localThemeScope, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2139307264, true, new c(localThemeScope)), 3, null);
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1144432297, true, new d(localThemeScope, dVar)), 3, null);
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-727429432, true, new C1905e(localThemeScope)), 3, null);
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
                        C12980o0.O0(localThemeScope, dVar, LazyColumn);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.f143329a;
        }

        public final void b(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
            C15429A c15429aB = C15430B.b(0, 0, composer, 0, 3);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            final v1.d dVar = this.f118366a;
            final LocalThemeScope localThemeScope = this.f118367b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            if (dVar.e().getValue() == v1.e.f118467a) {
                composer.startReplaceGroup(341938604);
                C12980o0.f0(localThemeScope, dVar, composer, LocalThemeScope.f17314g);
                composer.P();
            } else {
                composer.startReplaceGroup(342126743);
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.D.h(InterfaceC14902f.b(c14903g, androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), paddingValues));
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(localThemeScope) | composer.V(dVar);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.p0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C12980o0.e.c(dVar, localThemeScope, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15432b.a(modifierFsUnmask, c15429aB, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 508);
                composer.P();
            }
            composer.startReplaceGroup(565349820);
            if (dVar.e().getValue() == v1.e.f118473g) {
                C12980o0.m0(localThemeScope, dVar, composer, LocalThemeScope.f17314g);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            b(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$f */
    static final class f implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f118389b;

        f(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f118388a = localThemeScope;
            this.f118389b = dVar;
        }

        public final void a(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2022770784, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TopAppBar.<anonymous> (TeacherListsComposables.kt:154)");
            }
            C12980o0.I(this.f118388a, this.f118389b, composer, LocalThemeScope.f17314g);
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
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$g */
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118390a;

        g(LocalThemeScope localThemeScope) {
            this.f118390a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(186591226, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TopAppBar.<anonymous> (TeacherListsComposables.kt:144)");
            }
            C12980o0.G(this.f118390a, composer, LocalThemeScope.f17314g);
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
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$h */
    static final class h implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f118392b;

        h(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f118391a = localThemeScope;
            this.f118392b = dVar;
        }

        public final void c(InterfaceC15433c item, Composer composer, int i10) {
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
            Modifier modifierK = androidx.compose.foundation.layout.D.k(InterfaceC15433c.b(item, companion, 0.0f, 1, null), this.f118391a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            final v1.d dVar = this.f118392b;
            LocalThemeScope localThemeScope = this.f118391a;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
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
                        return C12980o0.h.d(dVar);
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
                        return C12980o0.h.e(dVar);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            As.p.p(localThemeScope, schoolCard, modifierB, zBooleanValue, function0, (Function0) objB2, composer, LocalThemeScope.f17314g | 384 | (SchoolCard.f2019f << 3), 0);
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            c(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(v1.d dVar) {
            dVar.m().invoke(C12940a1.f118248a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(v1.d dVar) {
            dVar.m().invoke(n1.f118354a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$i */
    static final class i implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118393a;

        i(LocalThemeScope localThemeScope) {
            this.f118393a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-838974540, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:725)");
            }
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f118393a.getAdsSpacing().getFive().getDp()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$j */
    static final class j implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f118395b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$j$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[v1.c.values().length];
                try {
                    iArr[v1.c.f118462a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v1.c.f118463b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v1.c.f118464c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f118394a = localThemeScope;
            this.f118395b = dVar;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
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
            C5800d.f fVarO = C5800d.f48779a.o(this.f118394a.getAdsSpacing().getThree().getDp());
            Modifier modifierB = d0.T.b(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, this.f118394a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
            LocalThemeScope localThemeScope = this.f118394a;
            final v1.d dVar = this.f118395b;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarO, P0.e.INSTANCE.l(), composer, 0);
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
            composer.startReplaceGroup(-1472565117);
            for (final Pair pair : CollectionsKt.p(TuplesKt.a(v1.c.f118462a, C16338g.c(C12947d.f118278q, composer, 0)), TuplesKt.a(v1.c.f118463b, C16338g.c(C12947d.f118279r, composer, 0)), TuplesKt.a(v1.c.f118464c, C16338g.c(C12947d.f118280s, composer, 0)))) {
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
                            return C12980o0.j.c(dVar, pair);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                As.p.j(localThemeScope, z10, str3, modifierFsAttribute, (Function0) objB, composer, LocalThemeScope.f17314g, 0);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(v1.d dVar, Pair pair) {
            dVar.m().invoke(new ChangeFilter((v1.c) pair.c()));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$k */
    static final class k implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118396a;

        k(LocalThemeScope localThemeScope) {
            this.f118396a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2113898186, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:772)");
            }
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f118396a.getAdsSpacing().getFive().getDp()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$l */
    static final class l implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProductListDecorator f118397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f118398b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118399c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f118400d;

        l(ProductListDecorator productListDecorator, v1.d dVar, LocalThemeScope localThemeScope, int i10) {
            this.f118397a = productListDecorator;
            this.f118398b = dVar;
            this.f118399c = localThemeScope;
            this.f118400d = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(v1.d dVar, InterfaceC17146a it) {
            Intrinsics.j(it, "it");
            if (it instanceof InterfaceC17146a.FindSimilarItems) {
                dVar.m().invoke(new FindSimilarTapped(((InterfaceC17146a.FindSimilarItems) it).getProduct()));
            } else if (it instanceof InterfaceC17146a.ProductItemClicked) {
                dVar.m().invoke(new ProductCardTapped(((InterfaceC17146a.ProductItemClicked) it).getItemClicked().getProduct()));
            } else if (!(it instanceof InterfaceC17146a.SendCriteoLoadBeacon) && !(it instanceof InterfaceC17146a.SendCriteoOnViewBeacon)) {
                if (!(it instanceof InterfaceC17146a.UpdateEntry)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC17146a.UpdateEntry updateEntry = (InterfaceC17146a.UpdateEntry) it;
                dVar.m().invoke(new UpdateEntryAction(updateEntry.getProductToAdd(), updateEntry.getQuantity(), new Rect()));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r() {
            return Unit.f143329a;
        }

        public final void g(InterfaceC15433c item, Composer composer, int i10) {
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
            boolean isOutOfStock = this.f118397a.getIsOutOfStock();
            Modifier modifierA = InterfaceC15433c.a(item, Modifier.INSTANCE, null, null, null, 7, null);
            final ProductListDecorator productListDecorator = this.f118397a;
            final v1.d dVar = this.f118398b;
            LocalThemeScope localThemeScope = this.f118399c;
            int i13 = this.f118400d;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
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
                        return C12980o0.l.k(dVar, (InterfaceC17146a) obj);
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
                        return C12980o0.l.p(dVar, productListDecorator);
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
                        return C12980o0.l.q(productListDecorator, dVar);
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
                        return C12980o0.l.r();
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
                        return C12980o0.l.l(dVar, productListDecorator);
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
                        return C12980o0.l.o(dVar, productListDecorator);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            ss.v.C(localThemeScope, productCardDecoratorV, i12, function1, z10, clippableCouponDecorator, function0, function02, function03, d10, isOutOfStock, function04, (Function0) objB6, null, isSelected, false, z11, zBooleanValue, showQuantityRequested, quantityRequested, zBooleanValue2, false, false, false, null, composer, 100663296 | LocalThemeScope.f17314g | (ProductCardDecorator.f163361E << 3) | (ClippableCouponDecorator.f13970c << 15), 196608, 48, 14684160);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            g(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(v1.d dVar, ProductListDecorator productListDecorator) {
            dVar.m().invoke(new FindSimilarTapped(productListDecorator.getProduct()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(v1.d dVar, ProductListDecorator productListDecorator) {
            dVar.m().invoke(new StepperStateChangedAction(productListDecorator.getProduct().getCode(), 0.0d, new Rect()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(v1.d dVar, ProductListDecorator productListDecorator) {
            dVar.m().invoke(new ClipCouponAction(productListDecorator));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(ProductListDecorator productListDecorator, v1.d dVar) {
            Coupon coupon = productListDecorator.getCoupon();
            if (coupon != null) {
                dVar.m().invoke(new CouponDetailsAction(coupon));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.o0$m */
    static final class m implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1.d f118402b;

        m(LocalThemeScope localThemeScope, v1.d dVar) {
            this.f118401a = localThemeScope;
            this.f118402b = dVar;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-642854769, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.suppliesContent.<anonymous>.<anonymous> (TeacherListsComposables.kt:890)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f118401a.getAdsSpacing().getSeven().getDp());
            LocalThemeScope localThemeScope = this.f118401a;
            v1.d dVar = this.f118402b;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null), "Unavailable Supply List Items:", null, composer, LocalThemeScope.f17314g | 384 | (q1.Label.f142335j << 3), 4);
            Composer composer2 = composer;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.o(localThemeScope.getAdsSpacing().getThree().getDp()), companion2.k(), composer2, 0);
            int iA2 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer2);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
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
                As.p.v(localThemeScope, it.next(), null, composer2, (UnavailableItem.f2103c << 3) | LocalThemeScope.f17314g, 2);
                arrayList.add(Unit.f143329a);
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void K(LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15433c interfaceC15433c, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC15433c) ? 256 : 128;
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
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(InterfaceC15433c.b(interfaceC15433c, companion, 0.0f, 1, null), H1.h.p((float) 8.5d), 0.0f, 2, null);
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarG, composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16335d.c(C12944c.f118256a, composerStartRestartGroup, 0);
            InterfaceC5926k interfaceC5926kE = InterfaceC5926k.INSTANCE.e();
            Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.U
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12980o0.L((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i12 = i11;
            C13590y.a(cVarC, null, C16819m.d(modifierB, false, (Function1) objB, 1, null), null, interfaceC5926kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String strC = C16338g.c(C12947d.f118269h, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i13 | i14 | (q1.Label.f142335j << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH2);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB2 = InterfaceC14888I.b(c14889j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA4 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB2);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            C16196t0 c16196t0 = C16196t0.f154256a;
            String strC2 = C16338g.c(C12947d.f118285x, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i15 = i12 & 112;
            boolean z10 = i15 == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion4.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.V
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.M(dVar);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            oi.P0.k(localThemeScope, c16196t0, strC2, (Function0) objB2, null, null, true, 0L, false, composerStartRestartGroup, (C16196t0.f154257b << 3) | i13 | 1572864 | i14, 216);
            composerStartRestartGroup.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH3 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA5 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR5 = composerStartRestartGroup.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH3);
            Function0<InterfaceC5953g> function0A5 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A5);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB3 = InterfaceC14888I.b(c14889j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
            int iA6 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR6 = composerStartRestartGroup.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB3);
            Function0<InterfaceC5953g> function0A6 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A6);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5884sR6, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            C16202w0 c16202w0 = C16202w0.f154271a;
            String strC3 = C16338g.c(C12947d.f118267f, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i15 == 32;
            Object objB3 = composerStartRestartGroup.B();
            if (z11 || objB3 == companion4.a()) {
                dVar2 = dVar;
                objB3 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.N(dVar2);
                    }
                };
                composerStartRestartGroup.t(objB3);
            } else {
                dVar2 = dVar;
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            oi.P0.k(localThemeScope2, c16202w0, strC3, (Function0) objB3, null, null, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C16202w0.f154272b << 3), 216);
            composer2 = composerStartRestartGroup;
            composer2.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composer2, 0);
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
                    return C12980o0.O(localThemeScope2, dVar2, interfaceC15433c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void P(LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15433c interfaceC15433c, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC15433c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            dVar2 = dVar;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(884638098, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.ErrorStateContent (TeacherListsComposables.kt:534)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(InterfaceC15433c.b(interfaceC15433c, companion, 0.0f, 1, null), H1.h.p((float) 8.5d), 0.0f, 2, null);
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarG, composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16335d.c(C12944c.f118256a, composerStartRestartGroup, 0);
            InterfaceC5926k interfaceC5926kE = InterfaceC5926k.INSTANCE.e();
            Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12980o0.Q((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i12 = i11;
            C13590y.a(cVarC, null, C16819m.d(modifierB, false, (Function1) objB, 1, null), null, interfaceC5926kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String strC = C16338g.c(C12947d.f118272k, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            int i15 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, (i15 << 3) | i13 | i14, 4);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(C12947d.f118271j, composerStartRestartGroup, 0), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH2);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB2 = InterfaceC14888I.b(c14889j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA4 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB2);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            C16196t0 c16196t0 = C16196t0.f154256a;
            String strC2 = C16338g.c(C12947d.f118285x, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i16 = i12 & 112;
            boolean z10 = i16 == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion4.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.R(dVar);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            oi.P0.k(localThemeScope, c16196t0, strC2, (Function0) objB2, null, null, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C16196t0.f154257b << 3), 216);
            composerStartRestartGroup.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH3 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA5 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR5 = composerStartRestartGroup.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH3);
            Function0<InterfaceC5953g> function0A5 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A5);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierB3 = InterfaceC14888I.b(c14889j, companion, 0.6583333f, false, 2, null);
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
            int iA6 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR6 = composerStartRestartGroup.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB3);
            Function0<InterfaceC5953g> function0A6 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A6);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5884sR6, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            C16202w0 c16202w0 = C16202w0.f154271a;
            String strC3 = C16338g.c(C12947d.f118267f, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i16 == 32;
            Object objB3 = composerStartRestartGroup.B();
            if (z11 || objB3 == companion4.a()) {
                dVar2 = dVar;
                objB3 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.S(dVar2);
                    }
                };
                composerStartRestartGroup.t(objB3);
            } else {
                dVar2 = dVar;
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            oi.P0.k(localThemeScope2, c16202w0, strC3, (Function0) objB3, null, null, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C16202w0.f154272b << 3), 216);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.17083333f, false, 2, null), composerStartRestartGroup, 0);
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
                    return C12980o0.T(localThemeScope2, dVar2, interfaceC15433c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void X(LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15433c interfaceC15433c, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC15433c) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1935474787, i12, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.LandingPageContent (TeacherListsComposables.kt:332)");
            }
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarB = c5800d.b();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierB = InterfaceC15433c.b(interfaceC15433c, androidx.compose.foundation.layout.D.k(companion, localThemeScope2.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), 0.0f, 1, null);
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarB, companion2.l(), composerStartRestartGroup, 6);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.b(), companion2.k(), composerStartRestartGroup, 6);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composerStartRestartGroup, 0);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 381, null);
            String strC = C16338g.c(C12947d.f118282u, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            int i15 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA4 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            Modifier modifierA = c14889j.a(androidx.compose.foundation.layout.J.A(companion, H1.h.p(50), H1.h.p(240)), 1.0f, false);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA5 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR5 = composerStartRestartGroup.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA);
            Function0<InterfaceC5953g> function0A5 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A5);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            String value = dVar.i().getValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i16 = i12 & 112;
            boolean z10 = i16 == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.H
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12980o0.Y(dVar, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composerStartRestartGroup.P();
            String strC2 = C16338g.c(C12947d.f118282u, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i16 == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12980o0.Z(dVar, (InterfaceC5834y) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            As.p.l(localThemeScope, value, function1, strC2, (Function1) objB2, null, composerStartRestartGroup, i13 | i14, 16);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_search");
            C16196t0 c16196t0 = C16196t0.f154256a;
            String strC3 = C16338g.c(C12947d.f118281t, composerStartRestartGroup, 0);
            boolean z12 = dVar.i().getValue().length() >= 5 && !StringsKt.s0(dVar.i().getValue());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z13 = i16 == 32;
            Object objB3 = composerStartRestartGroup.B();
            if (z13 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.a0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            oi.P0.k(localThemeScope, c16196t0, strC3, (Function0) objB3, modifierFsAttribute, null, false, 0L, z12, composerStartRestartGroup, i13 | i14 | (C16196t0.f154257b << 3), 112);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p((float) 8.5d), 0.0f, 2, null);
            MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.h(), companion2.g(), composerStartRestartGroup, 48);
            int iA6 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR6 = composerStartRestartGroup.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            Function0<InterfaceC5953g> function0A6 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A6);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyA3, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5884sR6, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA7 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR7 = composerStartRestartGroup.r();
            Modifier modifierE7 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A7 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A7);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA7 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA7, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA7, interfaceC5884sR7, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B7 = companion3.b();
            if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                composerA7.t(Integer.valueOf(iA7));
                composerA7.n(Integer.valueOf(iA7), function2B7);
            }
            androidx.compose.runtime.D1.c(composerA7, modifierE7, companion3.f());
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16335d.c(C12944c.f118257b, composerStartRestartGroup, 0);
            InterfaceC5926k interfaceC5926kE = InterfaceC5926k.INSTANCE.e();
            Modifier modifierB2 = InterfaceC14888I.b(c14889j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12980o0.b0((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            C13590y.a(cVarC, null, C16819m.d(modifierB2, false, (Function1) objB4, 1, null), null, interfaceC5926kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup = composerStartRestartGroup;
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            localThemeScope2 = localThemeScope;
            si.j.h(localThemeScope2, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(C12947d.f118270i, composerStartRestartGroup, 0), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
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
                    return C12980o0.c0(localThemeScope2, dVar, interfaceC15433c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        G(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        I(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
        K(localThemeScope, dVar, interfaceC15433c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void O0(LocalThemeScope localThemeScope, v1.d dVar, l0.w wVar) {
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-672224963, true, new h(localThemeScope, dVar)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-838974540, true, new i(localThemeScope)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(671047285, true, new j(localThemeScope, dVar)), 3, null);
        l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-2113898186, true, new k(localThemeScope)), 3, null);
        if (CollectionsKt.p(v1.c.f118462a, v1.c.f118463b).contains(dVar.l().getValue())) {
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
                arrayList.add(Unit.f143329a);
                i10 = i11;
            }
        }
        if (CollectionsKt.p(v1.c.f118462a, v1.c.f118464c).contains(dVar.l().getValue())) {
            l0.w.g(wVar, null, null, ComposableLambdaKt.composableLambdaInstance(-642854769, true, new m(localThemeScope, dVar)), 3, null);
            l0.w.g(wVar, null, null, C12938a.f118242a.a(), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
        P(localThemeScope, dVar, interfaceC15433c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void U(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15433c interfaceC15433c, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC15433c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1595134857, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.HeaderTitle (TeacherListsComposables.kt:163)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierB = InterfaceC15433c.b(interfaceC15433c, companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.g(), composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.I four = localThemeScope.getAdsTypography().getHeadings().getFour();
            Ki.T adsColorBrandPrimary = localThemeScope.getAdsColors().getAdsColorBrandPrimary();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12980o0.V((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            si.j.h(localThemeScope, new q1.Label(C16819m.d(companion, false, (Function1) objB, 1, null), adsColorBrandPrimary, null, null, 0, false, 0, four, null, 380, null), C13698b.a(dVar.g().getValue(), composerStartRestartGroup, AbstractC6392a.f60445b), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
                    return C12980o0.W(localThemeScope, dVar, interfaceC15433c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
        U(localThemeScope, dVar, interfaceC15433c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(v1.d dVar, String zipCode) {
        Intrinsics.j(zipCode, "zipCode");
        Function1<v1.a, Unit> function1M = dVar.m();
        if (zipCode.length() > 5) {
            zipCode = dVar.i().getValue();
        }
        function1M.invoke(new UpdateSearchTerm(zipCode));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(v1.d dVar, InterfaceC5834y TeacherListsSearchBar) {
        Intrinsics.j(TeacherListsSearchBar, "$this$TeacherListsSearchBar");
        dVar.m().invoke(C12970k1.f118335a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
        X(localThemeScope, dVar, interfaceC15433c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(LocalThemeScope localThemeScope, InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
        d0(localThemeScope, interfaceC15433c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarB = c5800d.b();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, companion2.g(), composerStartRestartGroup, 54);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            C14890K.a(InterfaceC14902f.b(c14903g, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            Z0.c cVarC = C16335d.c(C12944c.f118256a, composerStartRestartGroup, 0);
            InterfaceC5926k interfaceC5926kE = InterfaceC5926k.INSTANCE.e();
            Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 0.35555556f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12980o0.g0((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            boolean z10 = true;
            C13590y.a(cVarC, null, C16819m.d(modifierB, false, (Function1) objB, 1, null), null, interfaceC5926kE, 0.0f, null, composerStartRestartGroup, 24624, 104);
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.32222223f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String strC = C16338g.c(C12947d.f118277p, composerStartRestartGroup, 0);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            int i15 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, (i15 << 3) | i13 | i14, 4);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(C12947d.f118275n, composerStartRestartGroup, 0), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEight().getDp()), composerStartRestartGroup, 0);
            C16196t0 c16196t0 = C16196t0.f154256a;
            String strC2 = C16338g.c(C12947d.f118276o, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i12 & 112) != 32) {
                z10 = false;
            }
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion4.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.h0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            oi.P0.k(localThemeScope2, c16196t0, strC2, (Function0) objB2, null, null, false, 0L, false, composerStartRestartGroup, i13 | i14 | (C16196t0.f154257b << 3), 248);
            composerStartRestartGroup = composerStartRestartGroup;
            C14890K.a(InterfaceC14902f.b(c14903g, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
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
                    return C12980o0.i0(localThemeScope2, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        f0(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void j0(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15433c interfaceC15433c, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC15433c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-613553929, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.ProgressTracker (TeacherListsComposables.kt:186)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, dVar.b().getValue().intValue() == 0 ? localThemeScope.getAdsSpacing().getTen().getDp() : H1.h.p(0), H1.h.p(dVar.b().getValue().intValue() == 0 ? 6 : 0), dVar.b().getValue().intValue() == 0 ? localThemeScope.getAdsSpacing().getTen().getDp() : H1.h.p(0), 0.0f, 8, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            int iIntValue = dVar.b().getValue().intValue();
            List listP = CollectionsKt.p(C16338g.c(C12947d.f118261A, composerStartRestartGroup, 0), C16338g.c(C12947d.f118286y, composerStartRestartGroup, 0), C16338g.c(C12947d.f118287z, composerStartRestartGroup, 0));
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
                            return C12980o0.k0(dVar);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function0 = (Function0) objB;
                composerStartRestartGroup.P();
            }
            Function0 function02 = function0;
            composerStartRestartGroup.P();
            Fi.k.k(localThemeScope, listP, Integer.valueOf(iIntValue), companion, false, false, false, false, 0, 0, function02, composerStartRestartGroup, 1797120 | LocalThemeScope.f17314g | (i11 & 14), 0, 448);
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
                    return C12980o0.l0(localThemeScope, dVar, interfaceC15433c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
        j0(localThemeScope, dVar, interfaceC15433c, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
            C17983Z.a(null, 0L, 0.0f, 0.0f, composerStartRestartGroup, 0, 15);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, 1, null), localThemeScope.getAdsSpacing().getFive().getDp());
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            boolean zBooleanValue = dVar.q().getValue().booleanValue();
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.e(), false);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            composerStartRestartGroup.startReplaceGroup(-1200593480);
            if (zBooleanValue) {
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(400406566, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14) | (Q0.b.f141967b << 3));
            }
            composerStartRestartGroup.P();
            Modifier modifierA = zBooleanValue ? T0.a.a(companion, 0.0f) : T0.a.a(companion, 1.0f);
            MeasurePolicy measurePolicyG3 = C5804h.g(companion2.o(), false);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyG3, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C16188p c16188p = C16188p.f154218a;
            String strC = C16338g.c(As.c.f2017c, composerStartRestartGroup, 0);
            C.b.a.C0289b c0289b = C.b.a.C0289b.f16916e;
            boolean z10 = !zBooleanValue;
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_addAllToCart");
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = (i12 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.n0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            oi.P0.h(localThemeScope, c16188p, (Function0) objB, c0289b, strC, modifierFsAttribute, null, true, z10, false, 0L, composerStartRestartGroup, 12582912 | LocalThemeScope.f17314g | (i12 & 14) | (C16188p.f154219b << 3) | (C.b.a.C0289b.f16917f << 9), 0, 800);
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
                    return C12980o0.o0(localThemeScope, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        m0(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
    public static final void p0(final Ki.LocalThemeScope r32, final com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.shoppinglist.teacherlists.ux.C12980o0.p0(Ki.M, com.meijer.mobile.shoppinglist.teacherlists.ux.v1$d, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(LocalThemeScope localThemeScope, v1.d dVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p0(localThemeScope, dVar, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            C.f.o oVar = C.f.o.f17066e;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(C12947d.f118268g, new Object[0]);
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
                        return C12980o0.s0(dVar);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Dr.g.f(localThemeScope, null, composableLambdaC, modifierFsAttribute, composableLambdaC2, (Function0) objB, oVar, 0.0f, false, abstractC6392aD, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 24960 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 193);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12980o0.t0(localThemeScope, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(LocalThemeScope localThemeScope, v1.d dVar, int i10, Composer composer, int i11) {
        r0(localThemeScope, dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void u0(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15433c interfaceC15433c, final ClassItem classItem, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC15433c) ? 256 : 128;
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
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048 || ((i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && composerStartRestartGroup.D(classItem)));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.v0(dVar, classItem);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            As.p.n(localThemeScope, classItem, (Function0) objB, androidx.compose.foundation.layout.J.b(InterfaceC15433c.b(interfaceC15433c, companion, 0.0f, 1, null), 0.0f, H1.h.p(54), 1, null), composerStartRestartGroup, ((i11 >> 6) & 112) | LocalThemeScope.f17314g | (i11 & 14) | (ClassItem.f2010d << 3), 0);
            ClassItem classItem2 = (ClassItem) CollectionsKt.F0(dVar.d());
            if (classItem2 != null && classItem.getId() == classItem2.getId()) {
                composerStartRestartGroup.startReplaceGroup(-1782434577);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1782342321);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
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
                    return C12980o0.w0(localThemeScope, dVar, interfaceC15433c, classItem, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15433c interfaceC15433c, ClassItem classItem, int i10, Composer composer, int i11) {
        u0(localThemeScope, dVar, interfaceC15433c, classItem, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void x0(final LocalThemeScope localThemeScope, final v1.d dVar, final InterfaceC15433c interfaceC15433c, final SchoolItem schoolItem, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC15433c) ? 256 : 128;
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
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048 || ((i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && composerStartRestartGroup.D(schoolItem)));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12980o0.y0(dVar, schoolItem);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            As.p.t(localThemeScope, schoolItem, (Function0) objB, androidx.compose.foundation.layout.J.b(InterfaceC15433c.b(interfaceC15433c, companion, 0.0f, 1, null), 0.0f, H1.h.p(70), 1, null), composerStartRestartGroup, ((i11 >> 6) & 112) | LocalThemeScope.f17314g | (i11 & 14) | (SchoolItem.f2025g << 3), 0);
            SchoolItem schoolItem2 = (SchoolItem) CollectionsKt.F0(dVar.j());
            if (schoolItem2 != null && schoolItem.getId() == schoolItem2.getId()) {
                composerStartRestartGroup.startReplaceGroup(726752289);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(726844545);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
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
                    return C12980o0.z0(localThemeScope, dVar, interfaceC15433c, schoolItem, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(LocalThemeScope localThemeScope, v1.d dVar, InterfaceC15433c interfaceC15433c, SchoolItem schoolItem, int i10, Composer composer, int i11) {
        x0(localThemeScope, dVar, interfaceC15433c, schoolItem, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
            Dr.g.g(localThemeScope2, C16338g.c(C12947d.f118262a, composerStartRestartGroup, 0), null, false, null, 0, null, 0, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14), 126);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12980o0.H(localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
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
            Ki.Q.e(localThemeScope, InterfaceC15169g.a.f142062a, ComposableLambdaKt.c(399726642, true, new a(dVar, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15169g.a.f142063b << 3));
            C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12980o0.J(localThemeScope, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(v1.d dVar) {
        dVar.m().invoke(p1.f118407a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(v1.d dVar) {
        dVar.m().invoke(o1.f118403a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(v1.d dVar) {
        dVar.m().invoke(p1.f118407a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(v1.d dVar) {
        dVar.m().invoke(o1.f118403a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(v1.d dVar) {
        dVar.m().invoke(C12970k1.f118335a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview", "AlwaysProvideAModifier"})
    public static final void d0(final LocalThemeScope localThemeScope, final InterfaceC15433c interfaceC15433c, Composer composer, final int i10) {
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
            if (composerStartRestartGroup.V(interfaceC15433c)) {
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
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(136)), composerStartRestartGroup, 6);
            Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(1836194979, true, new b(interfaceC15433c, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12980o0.e0(localThemeScope, interfaceC15433c, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(v1.d dVar) {
        dVar.m().invoke(C12958g1.f118306a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(v1.d dVar) {
        dVar.m().invoke(C12943b1.f118255a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(v1.d dVar) {
        dVar.m().invoke(C12940a1.f118248a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(v1.d dVar) {
        dVar.m().invoke(C12955f1.f118302a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(v1.d dVar, ClassItem classItem) {
        dVar.m().invoke(new GetSupplies(classItem));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(v1.d dVar, SchoolItem schoolItem) {
        dVar.m().invoke(new GetClasses(schoolItem));
        return Unit.f143329a;
    }
}
