package c6;

import U5.m;
import a6.f;
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
import b6.C6202b;
import e.C13588d;
import kotlin.C6307U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0014\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LX5/d;", "presentationStateManager", "La6/f;", "inAppMessageSettings", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "Lkotlin/Function0;", "onDisposed", "onBackPressed", "La6/f$d;", "onGestureDetected", "b", "(LX5/d;La6/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lc0/U;", "", "isVisible", "La6/b;", "gestureTracker", "a", "(Lc0/U;La6/f;La6/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: c6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6369d {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.d$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61590f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(0);
            this.f61590f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f61590f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c6.d$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6307U<Boolean> f61591f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.f f61592g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a6.b f61593h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f61594i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f61595j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61596k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Integer f61597l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C6307U<Boolean> c6307u, a6.f fVar, a6.b bVar, int i10, Function1<? super WebView, Unit> function1, Function0<Unit> function0, Integer num) {
            super(2);
            this.f61591f = c6307u;
            this.f61592g = fVar;
            this.f61593h = bVar;
            this.f61594i = i10;
            this.f61595j = function1;
            this.f61596k = function0;
            this.f61597l = num;
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
                Integer num = this.f61597l;
                window.setDimAmount(0.0f);
                window.setWindowAnimations(-1);
                window.addFlags(Integer.MIN_VALUE);
                window.setLayout(-1, -1);
                if (Build.VERSION.SDK_INT >= 35 && num != null && num.intValue() >= 35) {
                    window.getAttributes().setFitInsetsTypes(0);
                    window.getAttributes().setFitInsetsSides(0);
                }
            }
            C6307U<Boolean> c6307u = this.f61591f;
            a6.f fVar = this.f61592g;
            a6.b bVar = this.f61593h;
            int i11 = C6307U.f60956d;
            C6366a.a(c6307u, fVar, bVar, composer, i11 | 576 | (this.f61594i & 14));
            C6307U<Boolean> c6307u2 = this.f61591f;
            a6.f fVar2 = this.f61592g;
            a6.b bVar2 = this.f61593h;
            Function1<WebView, Unit> function1 = this.f61595j;
            Function0<Unit> function0 = this.f61596k;
            int i12 = this.f61594i;
            C6368c.a(c6307u2, fVar2, bVar2, function1, function0, composer, i11 | 576 | (i12 & 14) | (i12 & 7168) | (i12 & 57344));
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

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.d$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6307U<Boolean> f61598f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.f f61599g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a6.b f61600h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f61601i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61602j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61603k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f61604l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C6307U<Boolean> c6307u, a6.f fVar, a6.b bVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, int i10) {
            super(2);
            this.f61598f = c6307u;
            this.f61599g = fVar;
            this.f61600h = bVar;
            this.f61601i = function1;
            this.f61602j = function0;
            this.f61603k = function02;
            this.f61604l = i10;
        }

        public final void a(Composer composer, int i10) {
            C6369d.a(this.f61598f, this.f61599g, this.f61600h, this.f61601i, this.f61602j, this.f61603k, composer, J0.a(this.f61604l | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.d$d, reason: collision with other inner class name */
    static final class C1215d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61605f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1215d(Function0<Unit> function0) {
            super(0);
            this.f61605f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f61605f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.d$e */
    static final class e extends Lambda implements Function1<WebView, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f61606f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super WebView, Unit> function1) {
            super(1);
            this.f61606f = function1;
        }

        public final void a(WebView it) {
            Intrinsics.j(it, "it");
            this.f61606f.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
            a(webView);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.d$f */
    static final class f extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61607f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function0<Unit> function0) {
            super(0);
            this.f61607f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f61607f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.d$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X5.d f61608f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.f f61609g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f61610h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61611i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61612j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<f.d, Unit> f61613k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f61614l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(X5.d dVar, a6.f fVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super f.d, Unit> function12, int i10) {
            super(2);
            this.f61608f = dVar;
            this.f61609g = fVar;
            this.f61610h = function1;
            this.f61611i = function0;
            this.f61612j = function02;
            this.f61613k = function12;
            this.f61614l = i10;
        }

        public final void a(Composer composer, int i10) {
            C6369d.b(this.f61608f, this.f61609g, this.f61610h, this.f61611i, this.f61612j, this.f61613k, composer, J0.a(this.f61614l | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.d$h */
    static final class h extends Lambda implements Function1<f.d, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<f.d, Unit> f61615f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super f.d, Unit> function1) {
            super(1);
            this.f61615f = function1;
        }

        public final void a(f.d it) {
            Intrinsics.j(it, "it");
            this.f61615f.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f.d dVar) {
            a(dVar);
            return Unit.f142422a;
        }
    }

    public static final void a(C6307U<Boolean> isVisible, a6.f inAppMessageSettings, a6.b gestureTracker, Function1<? super WebView, Unit> onCreated, Function0<Unit> onDisposed, Function0<Unit> onBackPressed, Composer composer, int i10) {
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
            C6368c.a(isVisible, inAppMessageSettings, gestureTracker, onCreated, onDisposed, composerStartRestartGroup, C6307U.f60956d | 576 | (i10 & 14) | (i10 & 7168) | (57344 & i10));
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

    public static final void b(X5.d presentationStateManager, a6.f inAppMessageSettings, Function1<? super WebView, Unit> onCreated, Function0<Unit> onDisposed, Function0<Unit> onBackPressed, Function1<? super f.d, Unit> onGestureDetected, Composer composer, int i10) {
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
            objB = new a6.b(C6202b.f59928a.b(inAppMessageSettings.getDismissAnimation()), inAppMessageSettings.i().keySet(), new h(onGestureDetected));
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        a6.b bVar = (a6.b) objB;
        boolean z10 = presentationStateManager.a().getValue() == m.a.VISIBLE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV = composerStartRestartGroup.V(onBackPressed);
        Object objB2 = composerStartRestartGroup.B();
        if (zV || objB2 == companion.a()) {
            objB2 = new C1215d(onBackPressed);
            composerStartRestartGroup.t(objB2);
        }
        composerStartRestartGroup.U();
        C13588d.a(z10, (Function0) objB2, composerStartRestartGroup, 0, 0);
        C6307U<Boolean> c6307uB = presentationStateManager.b();
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
        a(c6307uB, inAppMessageSettings, bVar, function1, (Function0) objB4, onBackPressed, composerStartRestartGroup, C6307U.f60956d | 576 | ((i10 << 3) & 458752));
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
