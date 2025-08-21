package com.meijer.mobile.meijer.activity.coupons;

import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import Lm.k;
import Lm.l;
import Pj.a;
import Sk.CouponOptions;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.appcompat.app.c;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.F;
import androidx.view.I;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.coupons.api.models.Category;
import com.meijer.mobile.meijer.M;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import dk.C13698b;
import e.C13737e;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17987a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/CouponFilterActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "selectedCategoryList", "LSk/a;", "couponOptions", "LQk/c;", "couponPage", "", "J1", "(Ljava/util/List;LSk/a;LQk/c;)V", "", "", "sortByOptions", "", "selectedIndex", "Landroid/content/DialogInterface$OnClickListener;", "confirmAction", "negativeButtonText", "negativeButtonAction", "I1", "([Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "Landroid/os/PersistableBundle;", "outPersistentState", "onSaveInstanceState", "(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V", "LLm/l;", "s", "Lkotlin/Lazy;", "G1", "()LLm/l;", "viewModel", "LLm/l$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CouponFilterActivity extends Hilt_CouponFilterActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Lm.l.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Qk.c f106202b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$a, reason: collision with other inner class name */
        static final class C1548a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CouponFilterActivity f106203a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<l.ViewState> f106204b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Qk.c f106205c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$a$a, reason: collision with other inner class name */
            static final class C1549a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106206a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CouponFilterActivity f106207b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<l.ViewState> f106208c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Qk.c f106209d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1550a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106210a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CouponFilterActivity f106211b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<l.ViewState> f106212c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ Qk.c f106213d;

                    C1550a(LocalThemeScope localThemeScope, CouponFilterActivity couponFilterActivity, z1<l.ViewState> z1Var, Qk.c cVar) {
                        this.f106210a = localThemeScope;
                        this.f106211b = couponFilterActivity;
                        this.f106212c = z1Var;
                        this.f106213d = cVar;
                    }

                    public final void b(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
                        Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(2093113403, i10, -1, "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponFilterActivity.kt:106)");
                        }
                        LocalThemeScope localThemeScope = this.f106210a;
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(this.f106211b) | composer.V(this.f106212c);
                        Qk.c cVar = this.f106213d;
                        boolean zD2 = zD | composer.d(cVar != null ? cVar.ordinal() : -1);
                        final CouponFilterActivity couponFilterActivity = this.f106211b;
                        final Qk.c cVar2 = this.f106213d;
                        final z1<l.ViewState> z1Var = this.f106212c;
                        Object objB = composer.B();
                        if (zD2 || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.coupons.i
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CouponFilterActivity.a.C1548a.C1549a.C1550a.c(couponFilterActivity, cVar2, z1Var);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.s.g(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        b(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(CouponFilterActivity couponFilterActivity, Qk.c cVar, z1 z1Var) {
                        List<Category> listD = a.c(z1Var).d();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listD) {
                            if (((Category) obj).getIsSelected()) {
                                arrayList.add(obj);
                            }
                        }
                        couponFilterActivity.J1(arrayList, a.c(z1Var).getCouponOptions(), cVar);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$a$a$b */
                static final class b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106214a;

                    b(LocalThemeScope localThemeScope) {
                        this.f106214a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1970948885, i10, -1, "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponFilterActivity.kt:115)");
                        }
                        Dr.g.g(this.f106214a, C16338g.c(Y.f100474I5, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1154258901, i10, -1, "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CouponFilterActivity.kt:104)");
                    }
                    LocalThemeScope localThemeScope = this.f106206a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(2093113403, true, new C1550a(localThemeScope, this.f106207b, this.f106208c, this.f106209d), composer, 54);
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(1970948885, true, new b(this.f106206a), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f106207b);
                    final CouponFilterActivity couponFilterActivity = this.f106207b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.coupons.h
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CouponFilterActivity.a.C1548a.C1549a.c(couponFilterActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, C.f.o.f17066e, 0.0f, false, AbstractC6392a.INSTANCE.d(Cj.o.f5088t, new Object[0]), composer, LocalThemeScope.f17314g | 24960 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 197);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1549a(LocalThemeScope localThemeScope, CouponFilterActivity couponFilterActivity, z1<l.ViewState> z1Var, Qk.c cVar) {
                    this.f106206a = localThemeScope;
                    this.f106207b = couponFilterActivity;
                    this.f106208c = z1Var;
                    this.f106209d = cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(CouponFilterActivity couponFilterActivity) {
                    if (!couponFilterActivity.onNavigateUp()) {
                        couponFilterActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$a$b */
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106215a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CouponFilterActivity f106216b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<l.ViewState> f106217c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$a$b$a, reason: collision with other inner class name */
                static final class C1551a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106218a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1<l.ViewState> f106219b;

                    C1551a(LocalThemeScope localThemeScope, z1<l.ViewState> z1Var) {
                        this.f106218a = localThemeScope;
                        this.f106219b = z1Var;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-81682065, i10, -1, "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponFilterActivity.kt:132)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        Ci.m.d(this.f106218a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, C13698b.a(a.c(this.f106219b).getLoadingState().getMessage(), composer, AbstractC6392a.f60445b), null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 48);
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
                /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$a$b$b, reason: collision with other inner class name */
                /* synthetic */ class C1552b extends FunctionReferenceImpl implements Function1<Lm.k, Unit> {
                    C1552b(Object obj) {
                        super(1, obj, Lm.l.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/coupons/viewmodel/CouponFilterAction;)V", 0);
                    }

                    public final void a(Lm.k p02) {
                        Intrinsics.j(p02, "p0");
                        ((Lm.l) this.receiver).w(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Lm.k kVar) {
                        a(kVar);
                        return Unit.f143329a;
                    }
                }

                b(LocalThemeScope localThemeScope, CouponFilterActivity couponFilterActivity, z1<l.ViewState> z1Var) {
                    this.f106215a = localThemeScope;
                    this.f106216b = couponFilterActivity;
                    this.f106217c = z1Var;
                }

                public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
                    Composer composer2;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(contentPadding) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-276716740, i10, -1, "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CouponFilterActivity.kt:122)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(J.f(companion, 0.0f, 1, null), contentPadding);
                    LocalThemeScope localThemeScope = this.f106215a;
                    CouponFilterActivity couponFilterActivity = this.f106216b;
                    z1<l.ViewState> z1Var = this.f106217c;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C5806j c5806j = C5806j.f48836a;
                    Pj.a loadingState = a.c(z1Var).getLoadingState();
                    if ((loadingState instanceof a.Loading) || (loadingState instanceof a.Paging)) {
                        composer2 = composer;
                        composer2.startReplaceGroup(57809597);
                        Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-81682065, true, new C1551a(localThemeScope, z1Var), composer2, 54), composer2, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                        composer2.P();
                    } else {
                        if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
                            composer.startReplaceGroup(-690875544);
                            composer.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(58605801);
                        Modifier modifierF = J.f(companion, 0.0f, 1, null);
                        l.ViewState viewStateC = a.c(z1Var);
                        Lm.l lVarG1 = couponFilterActivity.G1();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(lVarG1);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1552b(lVarG1);
                            composer.t(objB);
                        }
                        composer.P();
                        composer2 = composer;
                        Jm.k.t(localThemeScope, modifierF, viewStateC, (Function1) ((KFunction) objB), composer2, LocalThemeScope.f17314g | 48, 0);
                        composer2.P();
                    }
                    composer2.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    a(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C1548a(CouponFilterActivity couponFilterActivity, z1<l.ViewState> z1Var, Qk.c cVar) {
                this.f106203a = couponFilterActivity;
                this.f106204b = z1Var;
                this.f106205c = cVar;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1551699782, i11, -1, "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity.onCreate.<anonymous>.<anonymous> (CouponFilterActivity.kt:99)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), null, ComposableLambdaKt.c(1154258901, true, new C1549a(AdsTheme, this.f106203a, this.f106204b, this.f106205c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-276716740, true, new b(AdsTheme, this.f106203a, this.f106204b), composer, 54), composer, 384, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$onCreate$1$2$1", f = "CouponFilterActivity.kt", l = {159}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106220a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CouponFilterActivity f106221b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CouponFilterActivity couponFilterActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f106221b = couponFilterActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f106221b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLm/l$a;", "effect", "", "<anonymous>", "(LLm/l$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$onCreate$1$2$1$1", f = "CouponFilterActivity.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity$a$b$a, reason: collision with other inner class name */
            static final class C1553a extends SuspendLambda implements Function2<l.a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f106222a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f106223b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CouponFilterActivity f106224c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1553a(CouponFilterActivity couponFilterActivity, Continuation<? super C1553a> continuation) {
                    super(2, continuation);
                    this.f106224c = couponFilterActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1553a c1553a = new C1553a(this.f106224c, continuation);
                    c1553a.f106223b = obj;
                    return c1553a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void l(CouponFilterActivity couponFilterActivity, DialogInterface dialogInterface, int i10) {
                    couponFilterActivity.G1().w(new k.SelectSortOption(i10));
                    dialogInterface.dismiss();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void o(DialogInterface dialogInterface, int i10) {
                    dialogInterface.cancel();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f106222a == 0) {
                        ResultKt.b(obj);
                        l.a aVar = (l.a) this.f106223b;
                        if (aVar instanceof l.a.DisplaySortByDialog) {
                            CouponFilterActivity couponFilterActivity = this.f106224c;
                            l.a.DisplaySortByDialog displaySortByDialog = (l.a.DisplaySortByDialog) aVar;
                            String[] strArr = (String[]) displaySortByDialog.b().toArray(new String[0]);
                            int selectedSortTypeIndex = displaySortByDialog.getSelectedSortTypeIndex();
                            final CouponFilterActivity couponFilterActivity2 = this.f106224c;
                            couponFilterActivity.I1(strArr, selectedSortTypeIndex, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.coupons.j
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    CouponFilterActivity.a.b.C1553a.l(couponFilterActivity2, dialogInterface, i10);
                                }
                            }, Cj.o.f5084r, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.coupons.k
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    CouponFilterActivity.a.b.C1553a.o(dialogInterface, i10);
                                }
                            });
                            return Unit.f143329a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(l.a aVar, Continuation<? super Unit> continuation) {
                    return ((C1553a) create(aVar, continuation)).invokeSuspend(Unit.f143329a);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f106220a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<l.a> interfaceC16553FT = this.f106221b.G1().t();
                    C1553a c1553a = new C1553a(this.f106221b, null);
                    this.f106220a = 1;
                    if (C16563h.k(interfaceC16553FT, c1553a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        a(Qk.c cVar) {
            this.f106202b = cVar;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-74906455, i10, -1, "com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity.onCreate.<anonymous> (CouponFilterActivity.kt:97)");
            }
            K.b(null, ComposableLambdaKt.c(-1551699782, true, new C1548a(CouponFilterActivity.this, S2.a.c(CouponFilterActivity.this.G1().u(), null, null, null, composer, 0, 7), this.f106202b), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(CouponFilterActivity.this);
            CouponFilterActivity couponFilterActivity = CouponFilterActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(couponFilterActivity, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g("CouponFilterActivity", (Function2) objB, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.ViewState c(z1<l.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106225f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f106225f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106225f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106226f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f106226f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106226f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106227f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106228g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106227f = function0;
            this.f106228g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106227f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106228g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Lm.l G1() {
        return (Lm.l) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(CouponFilterActivity couponFilterActivity, F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        couponFilterActivity.finish();
        ck.c.b(couponFilterActivity, 1, M.f99457a, M.f99459c, 0, 8, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(String[] sortByOptions, int selectedIndex, DialogInterface.OnClickListener confirmAction, int negativeButtonText, DialogInterface.OnClickListener negativeButtonAction) {
        new c.a(this, Cj.p.f5107f).setTitle(Cj.o.f5018G0).setSingleChoiceItems(sortByOptions, selectedIndex, confirmAction).setNegativeButton(negativeButtonText, negativeButtonAction).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(List<Category> selectedCategoryList, CouponOptions couponOptions, Qk.c couponPage) {
        Intent intent = new Intent();
        List<Category> list = selectedCategoryList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Category) it.next()).getCategoryName());
        }
        intent.putExtra("com.meijer.intent.extra.EXTRA_COUPON_FILTER_CATEGORIES", CollectionsExtensionsKt.toArrayList(arrayList));
        intent.putExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", couponOptions);
        intent.putExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", couponPage);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Intrinsics.j(outState, "outState");
        Intrinsics.j(outPersistentState, "outPersistentState");
        super.onSaveInstanceState(outState, outPersistentState);
        l.ViewState value = G1().u().getValue();
        outState.putParcelable("coupon_options", value.getCouponOptions());
        outState.putSerializable("coupon_page", value.getActiveCouponPage());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Resources.NotFoundException {
        Object serializable;
        Parcelable parcelable;
        CouponOptions couponOptions;
        Qk.c cVar;
        Object serializableExtra;
        Parcelable parcelable2;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            Intrinsics.i(intent, "getIntent(...)");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Qk.c.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE");
                if (!(serializableExtra2 instanceof Qk.c)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (Qk.c) serializableExtra2;
            }
            cVar = (Qk.c) serializableExtra;
            Intent intent2 = getIntent();
            Intrinsics.i(intent2, "getIntent(...)");
            if (i10 >= 33) {
                parcelable2 = (Parcelable) intent2.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", CouponOptions.class);
            } else {
                Parcelable parcelableExtra = intent2.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS");
                if (!(parcelableExtra instanceof CouponOptions)) {
                    parcelableExtra = null;
                }
                parcelable2 = (CouponOptions) parcelableExtra;
            }
            couponOptions = (CouponOptions) parcelable2;
        } else {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                serializable = savedInstanceState.getSerializable("coupon_page", Qk.c.class);
            } else {
                Object serializable2 = savedInstanceState.getSerializable("coupon_page");
                if (!(serializable2 instanceof Qk.c)) {
                    serializable2 = null;
                }
                serializable = (Qk.c) serializable2;
            }
            Qk.c cVar2 = (Qk.c) serializable;
            if (i11 >= 33) {
                parcelable = (Parcelable) savedInstanceState.getParcelable("coupon_options", CouponOptions.class);
            } else {
                Parcelable parcelable3 = savedInstanceState.getParcelable("coupon_options");
                if (!(parcelable3 instanceof CouponOptions)) {
                    parcelable3 = null;
                }
                parcelable = (CouponOptions) parcelable3;
            }
            couponOptions = (CouponOptions) parcelable;
            cVar = cVar2;
        }
        if (couponOptions != null && cVar != null) {
            Lm.l lVarG1 = G1();
            String[] stringArray = getResources().getStringArray(Nr.b.f22611a);
            Intrinsics.i(stringArray, "getStringArray(...)");
            lVarG1.v(cVar, couponOptions, ArraysKt.h1(stringArray));
            C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-74906455, true, new a(cVar)), 1, null);
            ck.c.b(this, 0, M.f99458b, Bl.m.f3132a, 0, 8, null);
            I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.coupons.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CouponFilterActivity.H1(this.f106287a, (F) obj);
                }
            }, 3, null);
            return;
        }
        qw.a.INSTANCE.d("Error initializing CouponFilterActivity", new Object[0]);
        throw new IllegalStateException("CouponOptions or ActiveCouponPage cannot be null");
    }
}
