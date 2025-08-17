package mq;

import Ji.LocalThemeScope;
import Ji.Q;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import com.fullstory.FS;
import eq.Asset;
import eq.C13729d;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import ji.InterfaceC14920X;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mq.J;
import mq.y;
import ni.E0;
import p1.C16193g;
import tv.P;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lmq/y;", "viewModel", "", "g", "(LJi/M;Landroidx/compose/ui/Modifier;Lmq/y;Landroidx/compose/runtime/Composer;II)V", "Lmq/y$c;", "viewState", "Lkotlin/Function1;", "Lmq/y$b;", "sendEvent", "e", "(LJi/M;Landroidx/compose/ui/Modifier;Lmq/y$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "url", "k", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class J {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150369a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.ViewState f150370b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<y.b, Unit> f150371c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super y.b, Unit> function1) {
            this.f150369a = localThemeScope;
            this.f150370b = viewState;
            this.f150371c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(y.b.c.f150495a);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-295438920, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.SupportWebpageContent.<anonymous> (ShopAndScanSupportWebpageScreen.kt:79)");
            }
            LocalThemeScope localThemeScope = this.f150369a;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116977h1, new Object[0]);
            Asset navigationIcon = this.f150370b.getNavigationIcon();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150371c);
            final Function1<y.b, Unit> function1 = this.f150371c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mq.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return J.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13729d.d(localThemeScope, abstractC5607aD, navigationIcon, null, (Function0) objB, null, composer, 196608 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150372a;

        b(LocalThemeScope localThemeScope) {
            this.f150372a = localThemeScope;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1035066353, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.SupportWebpageContent.<anonymous> (ShopAndScanSupportWebpageScreen.kt:88)");
            }
            J.k(this.f150372a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), C16193g.c(com.meijer.mobile.shopandscan.e.f116983j1, composer, 0), composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f150373f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.A a10) {
            super(1);
            this.f150373f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f150373f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f150374f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f150375g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f150376h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f150377i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150378j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f150379k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f150380l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Activity f150381m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.n nVar, int i10, Function0 function0, String str, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, String str2, Activity activity) {
            super(2);
            this.f150375g = nVar;
            this.f150376h = function0;
            this.f150377i = str;
            this.f150378j = localThemeScope;
            this.f150379k = interfaceC5730l0;
            this.f150380l = str2;
            this.f150381m = activity;
            this.f150374f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f150375g.getHelpersHashCode();
            this.f150375g.i();
            L1.n nVar = this.f150375g;
            composer.startReplaceGroup(960750197);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new e(hVarC);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB2 == companion2.a()) {
                objB2 = new f(this.f150379k);
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f150377i);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new g(this.f150377i);
                composer.t(objB3);
            }
            composer.P();
            androidx.compose.ui.viewinterop.e.a(function1, modifierK, (Function1) objB3, composer, 6, 0);
            LocalThemeScope localThemeScope = this.f150378j;
            Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-902837156, true, new h(localThemeScope, nVar, hVarC, this.f150380l, this.f150381m), composer, 54), composer, LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.d.f140293b << 3));
            composer.P();
            if (this.f150375g.getHelpersHashCode() != helpersHashCode) {
                this.f150376h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f150382a;

        e(L1.h hVar) {
            this.f150382a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f150382a.getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<Context, WebView> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f150383a;

        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"mq/J$f$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends WebViewClient {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f150384a;

            a(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f150384a = interfaceC5730l0;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                this.f150384a.setValue(Boolean.FALSE);
            }
        }

        f(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f150383a = interfaceC5730l0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebView invoke(Context context) {
            Intrinsics.j(context, "context");
            WebView webView = new WebView(context);
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f150383a;
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            FS.setWebViewClient(webView, new a(interfaceC5730l0));
            webView.getSettings().setJavaScriptEnabled(true);
            return webView;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<WebView, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f150385a;

        g(String str) {
            this.f150385a = str;
        }

        public final void a(WebView it) {
            Intrinsics.j(it, "it");
            String str = this.f150385a;
            FS.trackWebView(it);
            it.loadUrl(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
            a(webView);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.n f150387b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f150388c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f150389d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Activity f150390e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f150391a = new a();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f150392a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f150393b;

            b(Activity activity, String str) {
                this.f150392a = activity;
                this.f150393b = str;
            }

            public final void a() {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + this.f150393b));
                Activity activity = this.f150392a;
                if (activity != null) {
                    activity.startActivity(intent);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150394a;

            c(LocalThemeScope localThemeScope) {
                this.f150394a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(98331401, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.SupportWebpageView.<anonymous>.<anonymous>.<anonymous> (ShopAndScanSupportWebpageScreen.kt:162)");
                }
                LocalThemeScope localThemeScope = this.f150394a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f150394a.getAdsColors().getAdsColorInverse(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 373, null), C16193g.c(com.meijer.mobile.shopandscan.e.f116980i1, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        h(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, String str, Activity activity) {
            this.f150386a = localThemeScope;
            this.f150387b = nVar;
            this.f150388c = hVar;
            this.f150389d = str;
            this.f150390e = activity;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-902837156, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.SupportWebpageView.<anonymous>.<anonymous> (ShopAndScanSupportWebpageScreen.kt:145)");
            }
            LocalThemeScope localThemeScope = this.f150386a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            L1.n nVar = this.f150387b;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(25)), H1.h.p(60)), 0.0f, 1, null);
            L1.h hVar = this.f150388c;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = a.f150391a;
                composer.t(objB);
            }
            composer.P();
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, nVar.k(modifierH, hVar, (Function1) objB), false, null, 895, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f150389d) | composer.D(this.f150390e);
            Activity activity = this.f150390e;
            String str = this.f150389d;
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new b(activity, str);
                composer.t(objB2);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB2, ComposableLambdaKt.c(98331401, true, new c(this.f150386a), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150395a;

        i(LocalThemeScope localThemeScope) {
            this.f150395a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(161471603, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.SupportWebpageView.<anonymous>.<anonymous> (ShopAndScanSupportWebpageScreen.kt:182)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.m.d(this.f150395a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, Bi.o.f2584a, C16193g.c(com.meijer.mobile.shopandscan.e.f116965d1, composer, 0), null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 48);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final mq.y.ViewState r35, final kotlin.jvm.functions.Function1<? super mq.y.b, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.J.e(Ji.M, androidx.compose.ui.Modifier, mq.y$c, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, y.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void g(LocalThemeScope localThemeScope, Modifier modifier, final y viewModel, Composer composer, final int i10, final int i11) {
        int i12;
        Modifier modifier2;
        final LocalThemeScope localThemeScope2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1691164590);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(viewModel) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            localThemeScope2 = localThemeScope;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(1691164590, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.options.SupportWebpageScreen (ShopAndScanSupportWebpageScreen.kt:57)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = viewModel.y().b();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            y.ViewState viewStateH = h(o1.b((P) objB, null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(viewModel);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: mq.E
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return J.i(viewModel, (y.b) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            e(localThemeScope, modifier2, viewStateH, (Function1) objB2, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (i12 & 112) | (AbstractC5607a.f45514b << 6), 0);
            localThemeScope2 = localThemeScope;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final Modifier modifier3 = modifier2;
            t0L.a(new Function2() { // from class: mq.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return J.j(localThemeScope2, modifier3, viewModel, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(y yVar, y.b event) {
        Intrinsics.j(event, "event");
        yVar.A(event);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, y yVar, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, yVar, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r24, androidx.compose.ui.Modifier r25, final java.lang.String r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.J.k(Ji.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final y.ViewState h(z1<y.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
