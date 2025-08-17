package W5;

import V5.c;
import X5.d;
import androidx.compose.animation.f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.window.h;
import androidx.compose.ui.window.r;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14800I;
import kotlin.C17934f;
import kotlin.C17983x;
import kotlin.C6165d;
import kotlin.C6307U;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aI\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LX5/d;", "presentationStateManager", "LV5/c;", "alertSettings", "Lkotlin/Function0;", "", "onPositiveResponse", "onNegativeResponse", "onBackPressed", "a", "(LX5/d;LV5/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: W5.a$a, reason: collision with other inner class name */
    static final class C0825a extends Lambda implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f38538f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38539g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ V5.c f38540h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f38541i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f38542j;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: W5.a$a$a, reason: collision with other inner class name */
        static final class C0826a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f38543f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0826a(Function0<Unit> function0) {
                super(0);
                this.f38543f = function0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f38543f.invoke();
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: W5.a$a$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ V5.c f38544f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f38545g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f38546h;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: W5.a$a$b$a, reason: collision with other inner class name */
            static final class C0827a extends Lambda implements Function0<Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f38547f;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f142422a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0827a(Function0<Unit> function0) {
                    super(0);
                    this.f38547f = function0;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f38547f.invoke();
                }
            }

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: W5.a$a$b$b, reason: collision with other inner class name */
            static final class C0828b extends Lambda implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f38548f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0828b(String str) {
                    super(3);
                    this.f38548f = str;
                }

                public final void a(InterfaceC14800I TextButton, Composer composer, int i10) {
                    Intrinsics.j(TextButton, "$this$TextButton");
                    if ((i10 & 81) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-821678530, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertScreen.kt:63)");
                    }
                    N1.b(this.f38548f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-577311655, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:58)");
                }
                String positiveButtonText = this.f38544f.getPositiveButtonText();
                if (positiveButtonText != null) {
                    Function0<Unit> function0 = this.f38545g;
                    composer.startReplaceableGroup(1157296644);
                    boolean zV = composer.V(function0);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C0827a(function0);
                        composer.t(objB);
                    }
                    composer.U();
                    C17983x.d((Function0) objB, F1.a(Modifier.INSTANCE, "positiveButton"), false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -821678530, true, new C0828b(positiveButtonText)), composer, 805306416, 508);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(V5.c cVar, Function0<Unit> function0, int i10) {
                super(2);
                this.f38544f = cVar;
                this.f38545g = function0;
                this.f38546h = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: W5.a$a$c */
        static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ V5.c f38549f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f38550g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f38551h;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: W5.a$a$c$a, reason: collision with other inner class name */
            static final class C0829a extends Lambda implements Function0<Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f38552f;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f142422a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0829a(Function0<Unit> function0) {
                    super(0);
                    this.f38552f = function0;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f38552f.invoke();
                }
            }

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: W5.a$a$c$b */
            static final class b extends Lambda implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f38553f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str) {
                    super(3);
                    this.f38553f = str;
                }

                public final void a(InterfaceC14800I TextButton, Composer composer, int i10) {
                    Intrinsics.j(TextButton, "$this$TextButton");
                    if ((i10 & 81) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1343354304, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertScreen.kt:73)");
                    }
                    N1.b(this.f38553f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1587721179, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:68)");
                }
                String negativeButtonText = this.f38549f.getNegativeButtonText();
                if (negativeButtonText != null) {
                    Function0<Unit> function0 = this.f38550g;
                    composer.startReplaceableGroup(1157296644);
                    boolean zV = composer.V(function0);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C0829a(function0);
                        composer.t(objB);
                    }
                    composer.U();
                    C17983x.d((Function0) objB, F1.a(Modifier.INSTANCE, "negativeButton"), false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 1343354304, true, new b(negativeButtonText)), composer, 805306416, 508);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(V5.c cVar, Function0<Unit> function0, int i10) {
                super(2);
                this.f38549f = cVar;
                this.f38550g = function0;
                this.f38551h = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: W5.a$a$d */
        static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ V5.c f38554f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(V5.c cVar) {
                super(2);
                this.f38554f = cVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(522753948, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:46)");
                }
                N1.b(this.f38554f.getTitle(), F1.a(Modifier.INSTANCE, "titleText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 48, 0, 131068);
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
        /* renamed from: W5.a$a$e */
        static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ V5.c f38555f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(V5.c cVar) {
                super(2);
                this.f38555f = cVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-542213283, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:52)");
                }
                N1.b(this.f38555f.getMessage(), F1.a(Modifier.INSTANCE, "messageText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 48, 0, 131068);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0825a(Function0<Unit> function0, int i10, V5.c cVar, Function0<Unit> function02, Function0<Unit> function03) {
            super(3);
            this.f38538f = function0;
            this.f38539g = i10;
            this.f38540h = cVar;
            this.f38541i = function02;
            this.f38542j = function03;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(238366737, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous> (AlertScreen.kt:44)");
            }
            h hVar = new h(true, false, (r) null, 4, (DefaultConstructorMarker) null);
            Function0<Unit> function0 = this.f38538f;
            composer.startReplaceableGroup(1157296644);
            boolean zV = composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C0826a(function0);
                composer.t(objB);
            }
            composer.U();
            C17934f.a((Function0) objB, ComposableLambdaKt.composableLambda(composer, -577311655, true, new b(this.f38540h, this.f38541i, this.f38539g)), null, ComposableLambdaKt.composableLambda(composer, 1587721179, true, new c(this.f38540h, this.f38542j, this.f38539g)), ComposableLambdaKt.composableLambda(composer, 522753948, true, new d(this.f38540h)), ComposableLambdaKt.composableLambda(composer, -542213283, true, new e(this.f38540h)), null, 0L, 0L, hVar, composer, 805530672, 452);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f38556f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f38557g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f38558h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f38559i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f38560j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f38561k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, c cVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i10) {
            super(2);
            this.f38556f = dVar;
            this.f38557g = cVar;
            this.f38558h = function0;
            this.f38559i = function02;
            this.f38560j = function03;
            this.f38561k = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f38556f, this.f38557g, this.f38558h, this.f38559i, this.f38560j, composer, J0.a(this.f38561k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(d presentationStateManager, c alertSettings, Function0<Unit> onPositiveResponse, Function0<Unit> onNegativeResponse, Function0<Unit> onBackPressed, Composer composer, int i10) {
        int i11;
        Intrinsics.j(presentationStateManager, "presentationStateManager");
        Intrinsics.j(alertSettings, "alertSettings");
        Intrinsics.j(onPositiveResponse, "onPositiveResponse");
        Intrinsics.j(onNegativeResponse, "onNegativeResponse");
        Intrinsics.j(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-628276247);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(presentationStateManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.V(alertSettings) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.D(onPositiveResponse) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.D(onNegativeResponse) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onBackPressed) ? 16384 : 8192;
        }
        if ((46811 & i11) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-628276247, i11, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen (AlertScreen.kt:34)");
            }
            C6165d.d(presentationStateManager.b(), null, f.m(null, 0.0f, 3, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 238366737, true, new C0825a(onBackPressed, i11, alertSettings, onPositiveResponse, onNegativeResponse)), composerStartRestartGroup, C6307U.f60956d | 196992, 26);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new b(presentationStateManager, alertSettings, onPositiveResponse, onNegativeResponse, onBackPressed, i10));
    }
}
