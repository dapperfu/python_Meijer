package com.meijer.mobile.reviews.ux.rateandreview;

import Ki.C;
import Ki.LocalThemeScope;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import c5.C6484c;
import com.meijer.mobile.reviews.ux.rateandreview.C12907l;
import com.meijer.mobile.reviews.ux.rateandreview.W;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import java.util.Locale;
import ki.InterfaceC15160b0;
import ki.q1;
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
import l0.InterfaceC15433c;
import m5.C15669h;
import p1.C16338g;
import qi.C16671b;
import r0.C16806i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u009b\u0001\u0010\u0011\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\n0\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0014\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$c;", "cameraPermissionToast", "", "Landroid/net/Uri;", "selectingPhotos", "addedPhotos", "Lkotlin/Function0;", "", "onCancelClicked", "onTakePhotoClicked", "onChooseFromLibraryClicked", "onPermissionSettingsClicked", "Lkotlin/Function1;", "onUploadSelectedClicked", "q", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/reviews/ux/rateandreview/W$c;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onCloseClicked", "n", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "k", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C12907l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$a */
    static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f117296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117297c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$a$a, reason: collision with other inner class name */
        static final class C1878a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117298a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f117299b;

            C1878a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f117298a = localThemeScope;
                this.f117299b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1469641620, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.PhotoGuidelinesBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:422)");
                }
                LocalThemeScope localThemeScope = this.f117298a;
                q1.Label enabledLabel = this.f117299b.getLabels().getEnabledLabel();
                String upperCase = C16338g.c(Cj.o.f5088t, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0) {
            this.f117295a = localThemeScope;
            this.f117296b = modifier;
            this.f117297c = function0;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1755719687, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.PhotoGuidelinesBottomSheet.<anonymous>.<anonymous> (BottomSheetSection.kt:416)");
            }
            LocalThemeScope localThemeScope = this.f117295a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(this.f117296b, 0.0f, 1, null), H1.h.p(16)), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f117297c);
            final Function0<Unit> function0 = this.f117297c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12907l.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1469641620, true, new C1878a(this.f117295a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$b */
    static final class b implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f117301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117302c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$b$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117303a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f117304b;

            a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f117303a = localThemeScope;
                this.f117304b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1744433128, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ReviewGuidelinesBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:353)");
                }
                LocalThemeScope localThemeScope = this.f117303a;
                q1.Label enabledLabel = this.f117304b.getLabels().getEnabledLabel();
                String upperCase = C16338g.c(Cj.o.f5088t, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        b(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0) {
            this.f117300a = localThemeScope;
            this.f117301b = modifier;
            this.f117302c = function0;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1465947643, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.ReviewGuidelinesBottomSheet.<anonymous>.<anonymous> (BottomSheetSection.kt:347)");
            }
            LocalThemeScope localThemeScope = this.f117300a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(this.f117301b, 0.0f, 1, null), H1.h.p(16)), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f117302c);
            final Function0<Unit> function0 = this.f117302c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12907l.b.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1744433128, true, new a(this.f117300a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$c */
    static final class c implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W.CameraPermissionToast f117305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117306b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117307c;

        c(W.CameraPermissionToast cameraPermissionToast, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f117305a = cameraPermissionToast;
            this.f117306b = localThemeScope;
            this.f117307c = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(String str, final Function0 function0, Di.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.F(str, new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12907l.c.e(function0);
                }
            });
            return Unit.f143329a;
        }

        public final void c(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-7926589, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:107)");
            }
            float f10 = 4;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(12), 2, null);
            W.CameraPermissionToast cameraPermissionToast = this.f117305a;
            LocalThemeScope localThemeScope = this.f117306b;
            final Function0<Unit> function0 = this.f117307c;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            final String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(cameraPermissionToast.getActionLabel());
            Intrinsics.i(string, "getString(...)");
            String string2 = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(cameraPermissionToast.getBodyLabel());
            Intrinsics.i(string2, "getString(...)");
            q1.m.Inline inline = Assemble.getToastVariant().getDefault();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(string) | composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12907l.c.d(string, function0, (Di.o) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Di.j.i(localThemeScope, null, string2, null, inline, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 5);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            c(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$d */
    static final class d implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117308a;

        d(LocalThemeScope localThemeScope) {
            this.f117308a = localThemeScope;
        }

        public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1640675760, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:127)");
            }
            float f10 = 4;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(12), 2, null);
            LocalThemeScope localThemeScope = this.f117308a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Lp.c.f19398n0);
            Intrinsics.i(string, "getString(...)");
            Di.j.i(localThemeScope, null, string, null, Assemble.getToastVariant().getDefault(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            a(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$e */
    static final class e implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f117310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC14902f f117311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ki.T f117313e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$e$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117314a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f117315b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ki.j1 f117316c;

            a(LocalThemeScope localThemeScope, boolean z10, ki.j1 j1Var) {
                this.f117314a = localThemeScope;
                this.f117315b = z10;
                this.f117316c = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-99572519, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:172)");
                }
                C16671b.b(this.f117314a, this.f117315b ? this.f117316c.getIcons().getDisabledIcon() : this.f117316c.getIcons().getEnabledIcon(), C.a.C3921g.f16885e, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3) | (C.a.C3921g.f16886f << 6), 4);
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

        e(LocalThemeScope localThemeScope, boolean z10, InterfaceC14902f interfaceC14902f, Function0<Unit> function0, Ki.T t10) {
            this.f117309a = localThemeScope;
            this.f117310b = z10;
            this.f117311c = interfaceC14902f;
            this.f117312d = function0;
            this.f117313e = t10;
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1960366252, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:166)");
            }
            LocalThemeScope localThemeScope = this.f117309a;
            q1.d.StandardButton disabledButton = this.f117310b ? Assemble.getButtons().getDisabledButton() : Assemble.getButtons().getEnabledButton();
            InterfaceC14902f interfaceC14902f = this.f117311c;
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(disabledButton, false, null, null, null, null, null, null, interfaceC14902f.c(companion, P0.e.INSTANCE.g()), false, null, 895, null);
            Function0<Unit> function0 = this.f117312d;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-99572519, true, new a(this.f117309a, this.f117310b, Assemble), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            oi.E0.b(localThemeScope, standardButtonY, function0, composableLambdaC, composer, i11 | 3072 | (q1.d.StandardButton.f142229k << 3));
            si.j.h(this.f117309a, q1.Label.y(this.f117310b ? Assemble.getLabels().getDisabledLabel() : Assemble.getLabels().getEnabledLabel(), null, this.f117313e, null, null, 0, false, 0, this.f117309a.getAdsTypography().getHeadings().getEight(), null, 381, null), C16338g.c(Lp.c.f19348N0, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(16)), composer, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$f */
    static final class f implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f117318b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC14902f f117319c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117320d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ki.T f117321e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$f$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117322a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f117323b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ki.j1 f117324c;

            a(LocalThemeScope localThemeScope, boolean z10, ki.j1 j1Var) {
                this.f117322a = localThemeScope;
                this.f117323b = z10;
                this.f117324c = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-863020976, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:217)");
                }
                C16671b.b(this.f117322a, this.f117323b ? this.f117324c.getIcons().getDisabledIcon() : this.f117324c.getIcons().getEnabledIcon(), C.b.h.l.f17020e, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3) | (C.b.h.l.f17021f << 6), 4);
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

        f(LocalThemeScope localThemeScope, boolean z10, InterfaceC14902f interfaceC14902f, Function0<Unit> function0, Ki.T t10) {
            this.f117317a = localThemeScope;
            this.f117318b = z10;
            this.f117319c = interfaceC14902f;
            this.f117320d = function0;
            this.f117321e = t10;
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1241785501, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:211)");
            }
            LocalThemeScope localThemeScope = this.f117317a;
            q1.d.StandardButton disabledButton = this.f117318b ? Assemble.getButtons().getDisabledButton() : Assemble.getButtons().getEnabledButton();
            InterfaceC14902f interfaceC14902f = this.f117319c;
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(disabledButton, false, null, null, null, null, null, null, interfaceC14902f.c(companion, P0.e.INSTANCE.g()), false, null, 895, null);
            Function0<Unit> function0 = this.f117320d;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-863020976, true, new a(this.f117317a, this.f117318b, Assemble), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            oi.E0.b(localThemeScope, standardButtonY, function0, composableLambdaC, composer, i11 | 3072 | (q1.d.StandardButton.f142229k << 3));
            si.j.h(this.f117317a, q1.Label.y(this.f117318b ? Assemble.getLabels().getDisabledLabel() : Assemble.getLabels().getEnabledLabel(), null, this.f117321e, null, null, 0, false, 0, this.f117317a.getAdsTypography().getHeadings().getEight(), null, 381, null), C16338g.c(Lp.c.f19383g, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(16)), composer, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$g */
    static final class g implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117325a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Uri> f117326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Uri> f117327c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<List<? extends Uri>, Unit> f117328d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$g$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117329a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f117330b;

            a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f117329a = localThemeScope;
                this.f117330b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1789954183, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:267)");
                }
                si.j.h(this.f117329a, this.f117330b.getLabels().getEnabledLabel(), C16338g.c(Lp.c.f19346M0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, List<? extends Uri> list, List<? extends Uri> list2, Function1<? super List<? extends Uri>, Unit> function1) {
            this.f117325a = localThemeScope;
            this.f117326b = list;
            this.f117327c = list2;
            this.f117328d = function1;
        }

        public final void b(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(289921356, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:261)");
            }
            LocalThemeScope localThemeScope = this.f117325a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(!CollectionsKt.P0(this.f117326b, this.f117327c).isEmpty() ? Assemble.getButtons().getEnabledButton() : Assemble.getButtons().getDisabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), false, null, 895, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f117328d) | composer.D(this.f117327c);
            final Function1<List<? extends Uri>, Unit> function1 = this.f117328d;
            final List<Uri> list = this.f117327c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12907l.g.c(function1, list);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1789954183, true, new a(this.f117325a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, List list) {
            function1.invoke(list);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$h */
    static final class h implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117331a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117332b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$h$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f117333a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f117334b;

            a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f117333a = localThemeScope;
                this.f117334b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-255307216, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:282)");
                }
                si.j.h(this.f117333a, this.f117334b.getLabels().getEnabledLabel(), C16338g.c(Cj.o.f5084r, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        h(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f117331a = localThemeScope;
            this.f117332b = function0;
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1345293123, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.TakePhotosBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetSection.kt:277)");
            }
            oi.E0.b(this.f117331a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), false, null, 895, null), this.f117332b, ComposableLambdaKt.c(-255307216, true, new a(this.f117331a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$i */
    public static final class i extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final i f117335f = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Uri uri) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$j */
    public static final class j extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f117336f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f117337g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function1 function1, List list) {
            super(1);
            this.f117336f = function1;
            this.f117337g = list;
        }

        public final Object a(int i10) {
            return this.f117336f.invoke(this.f117337g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.l$k */
    public static final class k extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f117338f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List list) {
            super(4);
            this.f117338f = list;
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
            Uri uri = (Uri) this.f117338f.get(i10);
            composer.startReplaceGroup(-355153785);
            C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(uri).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), T0.e.a(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(72)), C16806i.c(H1.h.p(8))), null, null, null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(Ki.LocalThemeScope r62, androidx.compose.ui.Modifier r63, com.meijer.mobile.reviews.ux.rateandreview.W.CameraPermissionToast r64, java.util.List<? extends android.net.Uri> r65, java.util.List<? extends android.net.Uri> r66, final kotlin.jvm.functions.Function0<kotlin.Unit> r67, final kotlin.jvm.functions.Function0<kotlin.Unit> r68, final kotlin.jvm.functions.Function0<kotlin.Unit> r69, final kotlin.jvm.functions.Function0<kotlin.Unit> r70, final kotlin.jvm.functions.Function1<? super java.util.List<? extends android.net.Uri>, kotlin.Unit> r71, androidx.compose.runtime.Composer r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 2486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.C12907l.q(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.reviews.ux.rateandreview.W$c, java.util.List, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0376 A[LOOP:0: B:96:0x0373->B:98:0x0376, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r47, androidx.compose.ui.Modifier r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.C12907l.k(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        k(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037b A[LOOP:0: B:97:0x0379->B:98:0x037b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r53, androidx.compose.ui.Modifier r54, final kotlin.jvm.functions.Function0<kotlin.Unit> r55, androidx.compose.runtime.Composer r56, final int r57, final int r58) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.C12907l.n(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        n(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(List list, List list2, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List listP0 = CollectionsKt.P0(list, list2);
        LazyRow.i(listP0.size(), null, new j(i.f117335f, listP0), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new k(listP0)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.s0(semantics, Role.INSTANCE.a());
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, Modifier modifier, W.CameraPermissionToast cameraPermissionToast, List list, List list2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, modifier, cameraPermissionToast, list, list2, function0, function02, function03, function04, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
