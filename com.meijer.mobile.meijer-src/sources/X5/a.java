package X5;

import W5.c;
import Y5.d;
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
import j0.InterfaceC14888I;
import kotlin.C18000f;
import kotlin.C18049x;
import kotlin.C6304d;
import kotlin.C6433U;
import kotlin.InterfaceC6305e;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aI\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LY5/d;", "presentationStateManager", "LW5/c;", "alertSettings", "Lkotlin/Function0;", "", "onPositiveResponse", "onNegativeResponse", "onBackPressed", "a", "(LY5/d;LW5/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: X5.a$a, reason: collision with other inner class name */
    static final class C0892a extends Lambda implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f41608f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f41609g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ W5.c f41610h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f41611i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f41612j;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: X5.a$a$a, reason: collision with other inner class name */
        static final class C0893a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f41613f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0893a(Function0<Unit> function0) {
                super(0);
                this.f41613f = function0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f41613f.invoke();
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: X5.a$a$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ W5.c f41614f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f41615g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f41616h;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: X5.a$a$b$a, reason: collision with other inner class name */
            static final class C0894a extends Lambda implements Function0<Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f41617f;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f143329a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0894a(Function0<Unit> function0) {
                    super(0);
                    this.f41617f = function0;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f41617f.invoke();
                }
            }

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: X5.a$a$b$b, reason: collision with other inner class name */
            static final class C0895b extends Lambda implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f41618f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0895b(String str) {
                    super(3);
                    this.f41618f = str;
                }

                public final void a(InterfaceC14888I TextButton, Composer composer, int i10) {
                    Intrinsics.j(TextButton, "$this$TextButton");
                    if ((i10 & 81) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-821678530, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertScreen.kt:63)");
                    }
                    N1.b(this.f41618f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-577311655, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:58)");
                }
                String positiveButtonText = this.f41614f.getPositiveButtonText();
                if (positiveButtonText != null) {
                    Function0<Unit> function0 = this.f41615g;
                    composer.startReplaceableGroup(1157296644);
                    boolean zV = composer.V(function0);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C0894a(function0);
                        composer.t(objB);
                    }
                    composer.U();
                    C18049x.d((Function0) objB, F1.a(Modifier.INSTANCE, "positiveButton"), false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -821678530, true, new C0895b(positiveButtonText)), composer, 805306416, 508);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(W5.c cVar, Function0<Unit> function0, int i10) {
                super(2);
                this.f41614f = cVar;
                this.f41615g = function0;
                this.f41616h = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: X5.a$a$c */
        static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ W5.c f41619f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f41620g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f41621h;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: X5.a$a$c$a, reason: collision with other inner class name */
            static final class C0896a extends Lambda implements Function0<Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f41622f;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f143329a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0896a(Function0<Unit> function0) {
                    super(0);
                    this.f41622f = function0;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f41622f.invoke();
                }
            }

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: X5.a$a$c$b */
            static final class b extends Lambda implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f41623f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str) {
                    super(3);
                    this.f41623f = str;
                }

                public final void a(InterfaceC14888I TextButton, Composer composer, int i10) {
                    Intrinsics.j(TextButton, "$this$TextButton");
                    if ((i10 & 81) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1343354304, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertScreen.kt:73)");
                    }
                    N1.b(this.f41623f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1587721179, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:68)");
                }
                String negativeButtonText = this.f41619f.getNegativeButtonText();
                if (negativeButtonText != null) {
                    Function0<Unit> function0 = this.f41620g;
                    composer.startReplaceableGroup(1157296644);
                    boolean zV = composer.V(function0);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new C0896a(function0);
                        composer.t(objB);
                    }
                    composer.U();
                    C18049x.d((Function0) objB, F1.a(Modifier.INSTANCE, "negativeButton"), false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 1343354304, true, new b(negativeButtonText)), composer, 805306416, 508);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(W5.c cVar, Function0<Unit> function0, int i10) {
                super(2);
                this.f41619f = cVar;
                this.f41620g = function0;
                this.f41621h = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: X5.a$a$d */
        static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ W5.c f41624f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(W5.c cVar) {
                super(2);
                this.f41624f = cVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(522753948, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:46)");
                }
                N1.b(this.f41624f.getTitle(), F1.a(Modifier.INSTANCE, "titleText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 48, 0, 131068);
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
        /* renamed from: X5.a$a$e */
        static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ W5.c f41625f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(W5.c cVar) {
                super(2);
                this.f41625f = cVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-542213283, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:52)");
                }
                N1.b(this.f41625f.getMessage(), F1.a(Modifier.INSTANCE, "messageText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 48, 0, 131068);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0892a(Function0<Unit> function0, int i10, W5.c cVar, Function0<Unit> function02, Function0<Unit> function03) {
            super(3);
            this.f41608f = function0;
            this.f41609g = i10;
            this.f41610h = cVar;
            this.f41611i = function02;
            this.f41612j = function03;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(238366737, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous> (AlertScreen.kt:44)");
            }
            h hVar = new h(true, false, (r) null, 4, (DefaultConstructorMarker) null);
            Function0<Unit> function0 = this.f41608f;
            composer.startReplaceableGroup(1157296644);
            boolean zV = composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C0893a(function0);
                composer.t(objB);
            }
            composer.U();
            C18000f.a((Function0) objB, ComposableLambdaKt.composableLambda(composer, -577311655, true, new b(this.f41610h, this.f41611i, this.f41609g)), null, ComposableLambdaKt.composableLambda(composer, 1587721179, true, new c(this.f41610h, this.f41612j, this.f41609g)), ComposableLambdaKt.composableLambda(composer, 522753948, true, new d(this.f41610h)), ComposableLambdaKt.composableLambda(composer, -542213283, true, new e(this.f41610h)), null, 0L, 0L, hVar, composer, 805530672, 452);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f41626f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f41627g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f41628h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f41629i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f41630j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f41631k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, c cVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i10) {
            super(2);
            this.f41626f = dVar;
            this.f41627g = cVar;
            this.f41628h = function0;
            this.f41629i = function02;
            this.f41630j = function03;
            this.f41631k = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f41626f, this.f41627g, this.f41628h, this.f41629i, this.f41630j, composer, J0.a(this.f41631k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
            C6304d.d(presentationStateManager.b(), null, f.m(null, 0.0f, 3, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 238366737, true, new C0892a(onBackPressed, i11, alertSettings, onPositiveResponse, onNegativeResponse)), composerStartRestartGroup, C6433U.f60755d | 196992, 26);
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
