package com.meijer.mobile.accounts.ux.createaccount;

import Ji.LocalThemeScope;
import Lh.J;
import Lh.w0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.meijer.mobile.accounts.ux.createaccount.t;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C14664h;
import kotlin.C14675s;
import kotlin.C6327j;
import kotlin.InterfaceC6163b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li4/s;", "LJi/M;", "localThemeScope", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "e", "(Li4/s;LJi/M;Lkotlin/jvm/functions/Function1;)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f94333a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f94334b;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f94333a = localThemeScope;
            this.f94334b = function1;
        }

        public final void a(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-1890225552, i10, -1, "com.meijer.mobile.accounts.ux.createaccount.createAccountNavGraph.<anonymous>.<anonymous> (CreateAccountNavGraph.kt:42)");
            }
            J.b(this.f94333a, null, this.f94334b, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            a(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function4<InterfaceC6163b, C14664h, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f94335a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f94336b;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f94335a = localThemeScope;
            this.f94336b = function1;
        }

        public final void a(InterfaceC6163b composable, C14664h it, Composer composer, int i10) {
            Intrinsics.j(composable, "$this$composable");
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(165755737, i10, -1, "com.meijer.mobile.accounts.ux.createaccount.createAccountNavGraph.<anonymous>.<anonymous> (CreateAccountNavGraph.kt:53)");
            }
            w0.b(this.f94335a, null, this.f94336b, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6163b interfaceC6163b, C14664h c14664h, Composer composer, Integer num) {
            a(interfaceC6163b, c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10) {
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i10) {
        return i10;
    }

    public static final void e(C14675s c14675s, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> onNavigationRequest) {
        Intrinsics.j(c14675s, "<this>");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(onNavigationRequest, "onNavigationRequest");
        t.a.C1330a c1330a = t.a.C1330a.f94377b;
        C14675s c14675s2 = new C14675s(c14675s.getProvider(), c1330a.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), "CreateAccount");
        j4.i.c(c14675s2, c1330a.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, null, new Function1() { // from class: com.meijer.mobile.accounts.ux.createaccount.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.f((androidx.compose.animation.d) obj);
            }
        }, null, null, ComposableLambdaKt.composableLambdaInstance(-1890225552, true, new a(localThemeScope, onNavigationRequest)), 110, null);
        j4.i.c(c14675s2, t.a.b.f94378b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, null, new Function1() { // from class: com.meijer.mobile.accounts.ux.createaccount.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.h((androidx.compose.animation.d) obj);
            }
        }, null, null, null, ComposableLambdaKt.composableLambdaInstance(165755737, true, new b(localThemeScope, onNavigationRequest)), 118, null);
        c14675s.e(c14675s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j f(androidx.compose.animation.d composable) {
        Intrinsics.j(composable, "$this$composable");
        return androidx.compose.animation.f.B(C6327j.l(HttpResponseStatus.SUCCESS_OK, 0, null, 6, null), new Function1() { // from class: com.meijer.mobile.accounts.ux.createaccount.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(j.g(((Integer) obj).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h h(androidx.compose.animation.d composable) {
        Intrinsics.j(composable, "$this$composable");
        return androidx.compose.animation.f.w(C6327j.l(HttpResponseStatus.SUCCESS_OK, 0, null, 6, null), new Function1() { // from class: com.meijer.mobile.accounts.ux.createaccount.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(j.i(((Integer) obj).intValue()));
            }
        });
    }
}
