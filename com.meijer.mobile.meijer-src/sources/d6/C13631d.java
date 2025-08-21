package d6;

import V5.m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.i;
import androidx.compose.ui.window.r;
import b6.f;
import c6.C6489b;
import e.C13736d;
import kotlin.C6433U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0014\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LY5/d;", "presentationStateManager", "Lb6/f;", "inAppMessageSettings", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "Lkotlin/Function0;", "onDisposed", "onBackPressed", "Lb6/f$d;", "onGestureDetected", "b", "(LY5/d;Lb6/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lc0/U;", "", "isVisible", "Lb6/b;", "gestureTracker", "a", "(Lc0/U;Lb6/f;Lb6/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: d6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13631d {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.d$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128157f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(0);
            this.f128157f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f128157f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: d6.d$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6433U<Boolean> f128158f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128159g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.b f128160h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f128161i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128162j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128163k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Integer f128164l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C6433U<Boolean> c6433u, b6.f fVar, b6.b bVar, int i10, Function1<? super WebView, Unit> function1, Function0<Unit> function0, Integer num) {
            super(2);
            this.f128158f = c6433u;
            this.f128159g = fVar;
            this.f128160h = bVar;
            this.f128161i = i10;
            this.f128162j = function1;
            this.f128163k = function0;
            this.f128164l = num;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(264536819, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.Message.<anonymous> (Message.kt:123)");
            }
            ViewParent parent = ((View) composer.o(AndroidCompositionLocals_androidKt.k())).getParent();
            i iVar = parent instanceof i ? (i) parent : null;
            Window window = iVar != null ? iVar.getWindow() : null;
            if (window != null) {
                Integer num = this.f128164l;
                window.setDimAmount(0.0f);
                window.setWindowAnimations(-1);
                window.addFlags(Integer.MIN_VALUE);
                window.setLayout(-1, -1);
                if (Build.VERSION.SDK_INT >= 35 && num != null && num.intValue() >= 35) {
                    window.getAttributes().setFitInsetsTypes(0);
                    window.getAttributes().setFitInsetsSides(0);
                }
            }
            C6433U<Boolean> c6433u = this.f128158f;
            b6.f fVar = this.f128159g;
            b6.b bVar = this.f128160h;
            int i11 = C6433U.f60755d;
            C13628a.a(c6433u, fVar, bVar, composer, i11 | 576 | (this.f128161i & 14));
            C6433U<Boolean> c6433u2 = this.f128158f;
            b6.f fVar2 = this.f128159g;
            b6.b bVar2 = this.f128160h;
            Function1<WebView, Unit> function1 = this.f128162j;
            Function0<Unit> function0 = this.f128163k;
            int i12 = this.f128161i;
            C13630c.a(c6433u2, fVar2, bVar2, function1, function0, composer, i11 | 576 | (i12 & 14) | (i12 & 7168) | (i12 & 57344));
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

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.d$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6433U<Boolean> f128165f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128166g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.b f128167h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128168i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128169j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128170k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f128171l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C6433U<Boolean> c6433u, b6.f fVar, b6.b bVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, int i10) {
            super(2);
            this.f128165f = c6433u;
            this.f128166g = fVar;
            this.f128167h = bVar;
            this.f128168i = function1;
            this.f128169j = function0;
            this.f128170k = function02;
            this.f128171l = i10;
        }

        public final void a(Composer composer, int i10) {
            C13631d.a(this.f128165f, this.f128166g, this.f128167h, this.f128168i, this.f128169j, this.f128170k, composer, J0.a(this.f128171l | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.d$d, reason: collision with other inner class name */
    static final class C2014d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128172f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2014d(Function0<Unit> function0) {
            super(0);
            this.f128172f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f128172f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.d$e */
    static final class e extends Lambda implements Function1<WebView, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super WebView, Unit> function1) {
            super(1);
            this.f128173f = function1;
        }

        public final void a(WebView it) {
            Intrinsics.j(it, "it");
            this.f128173f.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
            a(webView);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.d$f */
    static final class f extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128174f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function0<Unit> function0) {
            super(0);
            this.f128174f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f128174f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.d$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y5.d f128175f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128176g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128177h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128178i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128179j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<f.d, Unit> f128180k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f128181l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Y5.d dVar, b6.f fVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super f.d, Unit> function12, int i10) {
            super(2);
            this.f128175f = dVar;
            this.f128176g = fVar;
            this.f128177h = function1;
            this.f128178i = function0;
            this.f128179j = function02;
            this.f128180k = function12;
            this.f128181l = i10;
        }

        public final void a(Composer composer, int i10) {
            C13631d.b(this.f128175f, this.f128176g, this.f128177h, this.f128178i, this.f128179j, this.f128180k, composer, J0.a(this.f128181l | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.d$h */
    static final class h extends Lambda implements Function1<f.d, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<f.d, Unit> f128182f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super f.d, Unit> function1) {
            super(1);
            this.f128182f = function1;
        }

        public final void a(f.d it) {
            Intrinsics.j(it, "it");
            this.f128182f.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f.d dVar) {
            a(dVar);
            return Unit.f143329a;
        }
    }

    public static final void a(C6433U<Boolean> isVisible, b6.f inAppMessageSettings, b6.b gestureTracker, Function1<? super WebView, Unit> onCreated, Function0<Unit> onDisposed, Function0<Unit> onBackPressed, Composer composer, int i10) {
        Composer composer2;
        Intrinsics.j(isVisible, "isVisible");
        Intrinsics.j(inAppMessageSettings, "inAppMessageSettings");
        Intrinsics.j(gestureTracker, "gestureTracker");
        Intrinsics.j(onCreated, "onCreated");
        Intrinsics.j(onDisposed, "onDisposed");
        Intrinsics.j(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-509574427);
        if (ComposerKt.M()) {
            ComposerKt.U(-509574427, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.Message (Message.kt:92)");
        }
        if (inAppMessageSettings.getShouldTakeOverUi()) {
            composerStartRestartGroup.startReplaceableGroup(1613314286);
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = null;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
                    if (applicationInfo != null) {
                        objB = Integer.valueOf(applicationInfo.targetSdkVersion);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            Integer num = (Integer) objB;
            androidx.compose.ui.window.h hVar = new androidx.compose.ui.window.h(true, false, (r) null, 4, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(onBackPressed);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new a(onBackPressed);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            composer2 = composerStartRestartGroup;
            androidx.compose.ui.window.a.a((Function0) objB2, hVar, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 264536819, true, new b(isVisible, inAppMessageSettings, gestureTracker, i10, onCreated, onDisposed, num)), composer2, 432, 0);
            composer2.U();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1613317521);
            C13630c.a(isVisible, inAppMessageSettings, gestureTracker, onCreated, onDisposed, composerStartRestartGroup, C6433U.f60755d | 576 | (i10 & 14) | (i10 & 7168) | (57344 & i10));
            composer2 = composerStartRestartGroup;
            composer2.U();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composer2.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new c(isVisible, inAppMessageSettings, gestureTracker, onCreated, onDisposed, onBackPressed, i10));
    }

    public static final void b(Y5.d presentationStateManager, b6.f inAppMessageSettings, Function1<? super WebView, Unit> onCreated, Function0<Unit> onDisposed, Function0<Unit> onBackPressed, Function1<? super f.d, Unit> onGestureDetected, Composer composer, int i10) {
        Intrinsics.j(presentationStateManager, "presentationStateManager");
        Intrinsics.j(inAppMessageSettings, "inAppMessageSettings");
        Intrinsics.j(onCreated, "onCreated");
        Intrinsics.j(onDisposed, "onDisposed");
        Intrinsics.j(onBackPressed, "onBackPressed");
        Intrinsics.j(onGestureDetected, "onGestureDetected");
        Composer composerStartRestartGroup = composer.startRestartGroup(119985709);
        if (ComposerKt.M()) {
            ComposerKt.U(119985709, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageScreen (Message.kt:46)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB = composerStartRestartGroup.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new b6.b(C6489b.f61415a.b(inAppMessageSettings.getDismissAnimation()), inAppMessageSettings.i().keySet(), new h(onGestureDetected));
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        b6.b bVar = (b6.b) objB;
        boolean z10 = presentationStateManager.a().getValue() == m.a.VISIBLE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV = composerStartRestartGroup.V(onBackPressed);
        Object objB2 = composerStartRestartGroup.B();
        if (zV || objB2 == companion.a()) {
            objB2 = new C2014d(onBackPressed);
            composerStartRestartGroup.t(objB2);
        }
        composerStartRestartGroup.U();
        C13736d.a(z10, (Function0) objB2, composerStartRestartGroup, 0, 0);
        C6433U<Boolean> c6433uB = presentationStateManager.b();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV2 = composerStartRestartGroup.V(onCreated);
        Object objB3 = composerStartRestartGroup.B();
        if (zV2 || objB3 == companion.a()) {
            objB3 = new e(onCreated);
            composerStartRestartGroup.t(objB3);
        }
        composerStartRestartGroup.U();
        Function1 function1 = (Function1) objB3;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV3 = composerStartRestartGroup.V(onDisposed);
        Object objB4 = composerStartRestartGroup.B();
        if (zV3 || objB4 == companion.a()) {
            objB4 = new f(onDisposed);
            composerStartRestartGroup.t(objB4);
        }
        composerStartRestartGroup.U();
        a(c6433uB, inAppMessageSettings, bVar, function1, (Function0) objB4, onBackPressed, composerStartRestartGroup, C6433U.f60755d | 576 | ((i10 << 3) & 458752));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new g(presentationStateManager, inAppMessageSettings, onCreated, onDisposed, onBackPressed, onGestureDetected, i10));
    }
}
