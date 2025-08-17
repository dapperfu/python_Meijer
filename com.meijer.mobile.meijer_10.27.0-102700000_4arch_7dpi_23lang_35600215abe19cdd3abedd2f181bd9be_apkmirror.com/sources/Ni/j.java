package Ni;

import H1.r;
import Ji.LocalThemeScope;
import Ni.j;
import P0.e;
import Pi.C4685b0;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13588d;
import ii.C14732c;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C17917Z;
import kotlin.C17952l;
import kotlin.C17955m;
import kotlin.C17988z0;
import kotlin.EnumC17958n;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.C15521g;
import m0.InterfaceC15506C;
import m0.InterfaceC15516b;
import m0.InterfaceC15528n;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import y0.C18106a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "LNi/c;", "showcases", "currentShowcaseToShow", "Lkotlin/Function1;", "", "onClick", "Lkotlin/Function0;", "content", "i", "(LJi/M;Ljava/util/List;LNi/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "isSelected", "", "name", "Landroidx/compose/ui/Modifier;", "modifier", "g", "(ZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "showBottomSheetControls", "l", "(LJi/M;LNi/c;ZLandroidx/compose/runtime/Composer;II)V", "LH1/r;", "screenSize", "q", "(JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21929a;

        a(String str) {
            this.f21929a = str;
        }

        public final void a(InterfaceC14800I Button, Composer composer, int i10) {
            Intrinsics.j(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-964698663, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropButton.<anonymous> (ShowcaseActivity.kt:433)");
            }
            N1.b(this.f21929a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$1$1$1", f = "ShowcaseActivity.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f21930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17955m f21931b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17955m c17955m, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21931b = c17955m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f21931b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f21930a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17955m c17955m = this.f21931b;
                this.f21930a = 1;
                if (c17955m.k(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Ni.c> f21933b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ni.c f21934c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Ni.c, Unit> f21935d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f21936e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17955m f21937f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<Ni.c> f21938g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Ni.c> f21939h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15528n, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21940a;

            a(LocalThemeScope localThemeScope) {
                this.f21940a = localThemeScope;
            }

            public final void a(InterfaceC15528n item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1398543702, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:319)");
                }
                Modifier modifierI = D.i(Modifier.INSTANCE, H1.h.p(16));
                LocalThemeScope localThemeScope = this.f21940a;
                MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                N1.b("Foundations", null, C5346q0.INSTANCE.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 390, 0, 65530);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
                a(interfaceC15528n, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Ni.c, Unit> f21941a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ni.c f21942b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f21943c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17955m f21944d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$2$1$3$1$2$1$1$1", f = "ShowcaseActivity.kt", l = {339}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f21945a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17955m f21946b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17955m c17955m, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f21946b = c17955m;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f21946b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f21945a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17955m c17955m = this.f21946b;
                        this.f21945a = 1;
                        if (c17955m.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super Ni.c, Unit> function1, Ni.c cVar, InterfaceC16622O interfaceC16622O, C17955m c17955m) {
                this.f21941a = function1;
                this.f21942b = cVar;
                this.f21943c = interfaceC16622O;
                this.f21944d = c17955m;
            }

            public final void a() {
                this.f21941a.invoke(this.f21942b);
                C16648k.d(this.f21943c, null, null, new a(this.f21944d, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ni.j$c$c, reason: collision with other inner class name */
        static final class C0352c implements Function3<InterfaceC15528n, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21947a;

            C0352c(LocalThemeScope localThemeScope) {
                this.f21947a = localThemeScope;
            }

            public final void a(InterfaceC15528n item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(191231950, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:351)");
                }
                Modifier modifierI = D.i(Modifier.INSTANCE, H1.h.p(16));
                LocalThemeScope localThemeScope = this.f21947a;
                MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                N1.b("Components", null, C5346q0.INSTANCE.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 390, 0, 65530);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
                a(interfaceC15528n, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Ni.c, Unit> f21948a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ni.c f21949b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f21950c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17955m f21951d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$2$1$3$1$4$1$1$1", f = "ShowcaseActivity.kt", l = {371}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f21952a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17955m f21953b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17955m c17955m, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f21953b = c17955m;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f21953b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f21952a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17955m c17955m = this.f21953b;
                        this.f21952a = 1;
                        if (c17955m.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super Ni.c, Unit> function1, Ni.c cVar, InterfaceC16622O interfaceC16622O, C17955m c17955m) {
                this.f21948a = function1;
                this.f21949b = cVar;
                this.f21950c = interfaceC16622O;
                this.f21951d = c17955m;
            }

            public final void a() {
                this.f21948a.invoke(this.f21949b);
                C16648k.d(this.f21950c, null, null, new a(this.f21951d, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function3<InterfaceC15528n, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21954a;

            e(LocalThemeScope localThemeScope) {
                this.f21954a = localThemeScope;
            }

            public final void a(InterfaceC15528n item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(99921744, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:383)");
                }
                Modifier modifierI = D.i(Modifier.INSTANCE, H1.h.p(16));
                LocalThemeScope localThemeScope = this.f21954a;
                MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                N1.b("Assemblies", null, C5346q0.INSTANCE.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 390, 0, 65530);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Composer composer, Integer num) {
                a(interfaceC15528n, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Ni.c, Unit> f21955a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ni.c f21956b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f21957c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17955m f21958d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$2$1$3$1$6$1$1$1", f = "ShowcaseActivity.kt", l = {403}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f21959a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17955m f21960b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17955m c17955m, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f21960b = c17955m;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f21960b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f21959a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17955m c17955m = this.f21960b;
                        this.f21959a = 1;
                        if (c17955m.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            f(Function1<? super Ni.c, Unit> function1, Ni.c cVar, InterfaceC16622O interfaceC16622O, C17955m c17955m) {
                this.f21955a = function1;
                this.f21956b = cVar;
                this.f21957c = interfaceC16622O;
                this.f21958d = c17955m;
            }

            public final void a() {
                this.f21955a.invoke(this.f21956b);
                C16648k.d(this.f21957c, null, null, new a(this.f21958d, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/n;", "", "it", "", "a", "(Lm0/n;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class g extends Lambda implements Function4<InterfaceC15528n, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f21961f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ni.c f21962g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f21963h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f21964i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C17955m f21965j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(List list, Ni.c cVar, Function1 function1, InterfaceC16622O interfaceC16622O, C17955m c17955m) {
                super(4);
                this.f21961f = list;
                this.f21962g = cVar;
                this.f21963h = function1;
                this.f21964i = interfaceC16622O;
                this.f21965j = c17955m;
            }

            public final void a(InterfaceC15528n interfaceC15528n, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15528n) ? 4 : 2) | i11;
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
                    ComposerKt.U(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                Ni.c cVar = (Ni.c) this.f21961f.get(i10);
                composer.startReplaceGroup(-8130270);
                boolean zE = Intrinsics.e(this.f21962g, cVar);
                String name = cVar.getName();
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f21963h) | composer.D(cVar) | composer.D(this.f21964i) | composer.V(this.f21965j);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new d(this.f21963h, cVar, this.f21964i, this.f21965j);
                    composer.t(objB);
                }
                composer.P();
                j.g(zE, name, null, (Function0) objB, composer, 0, 4);
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Integer num, Composer composer, Integer num2) {
                a(interfaceC15528n, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class h extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final h f21966f = new h();

            public h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Ni.c cVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class i extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f21967f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f21968g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Function1 function1, List list) {
                super(1);
                this.f21967f = function1;
                this.f21968g = list;
            }

            public final Object a(int i10) {
                return this.f21967f.invoke(this.f21968g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/n;", "", "it", "", "a", "(Lm0/n;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        /* renamed from: Ni.j$c$j, reason: collision with other inner class name */
        public static final class C0353j extends Lambda implements Function4<InterfaceC15528n, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f21969f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ni.c f21970g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f21971h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f21972i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C17955m f21973j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0353j(List list, Ni.c cVar, Function1 function1, InterfaceC16622O interfaceC16622O, C17955m c17955m) {
                super(4);
                this.f21969f = list;
                this.f21970g = cVar;
                this.f21971h = function1;
                this.f21972i = interfaceC16622O;
                this.f21973j = c17955m;
            }

            public final void a(InterfaceC15528n interfaceC15528n, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15528n) ? 4 : 2) | i11;
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
                    ComposerKt.U(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                Ni.c cVar = (Ni.c) this.f21969f.get(i10);
                composer.startReplaceGroup(-762155644);
                boolean zE = Intrinsics.e(this.f21970g, cVar);
                String name = cVar.getName();
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f21971h) | composer.D(cVar) | composer.D(this.f21972i) | composer.V(this.f21973j);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new f(this.f21971h, cVar, this.f21972i, this.f21973j);
                    composer.t(objB);
                }
                composer.P();
                j.g(zE, name, null, (Function0) objB, composer, 0, 4);
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Integer num, Composer composer, Integer num2) {
                a(interfaceC15528n, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class k extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final k f21974f = new k();

            public k() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Ni.c cVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class l extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f21975f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f21976g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(Function1 function1, List list) {
                super(1);
                this.f21975f = function1;
                this.f21976g = list;
            }

            public final Object a(int i10) {
                return this.f21975f.invoke(this.f21976g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/n;", "", "it", "", "a", "(Lm0/n;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class m extends Lambda implements Function4<InterfaceC15528n, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f21977f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ni.c f21978g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f21979h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f21980i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C17955m f21981j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(List list, Ni.c cVar, Function1 function1, InterfaceC16622O interfaceC16622O, C17955m c17955m) {
                super(4);
                this.f21977f = list;
                this.f21978g = cVar;
                this.f21979h = function1;
                this.f21980i = interfaceC16622O;
                this.f21981j = c17955m;
            }

            public final void a(InterfaceC15528n interfaceC15528n, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15528n) ? 4 : 2) | i11;
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
                    ComposerKt.U(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                Ni.c cVar = (Ni.c) this.f21977f.get(i10);
                composer.startReplaceGroup(818801974);
                boolean zE = Intrinsics.e(this.f21978g, cVar);
                String name = cVar.getName();
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f21979h) | composer.D(cVar) | composer.D(this.f21980i) | composer.V(this.f21981j);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new b(this.f21979h, cVar, this.f21980i, this.f21981j);
                    composer.t(objB);
                }
                composer.P();
                j.g(zE, name, null, (Function0) objB, composer, 0, 4);
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15528n interfaceC15528n, Integer num, Composer composer, Integer num2) {
                a(interfaceC15528n, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class n extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final n f21982f = new n();

            public n() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Ni.c cVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class o extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f21983f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f21984g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(Function1 function1, List list) {
                super(1);
                this.f21983f = function1;
                this.f21984g = list;
            }

            public final Object a(int i10) {
                return this.f21983f.invoke(this.f21984g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, List<? extends Ni.c> list, Ni.c cVar, Function1<? super Ni.c, Unit> function1, InterfaceC16622O interfaceC16622O, C17955m c17955m, List<? extends Ni.c> list2, List<? extends Ni.c> list3) {
            this.f21932a = localThemeScope;
            this.f21933b = list;
            this.f21934c = cVar;
            this.f21935d = function1;
            this.f21936e = interfaceC16622O;
            this.f21937f = c17955m;
            this.f21938g = list2;
            this.f21939h = list3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(List list, List list2, List list3, LocalThemeScope localThemeScope, Ni.c cVar, Function1 function1, InterfaceC16622O interfaceC16622O, C17955m c17955m, InterfaceC15506C LazyVerticalGrid) {
            int i10;
            Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
            InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(1398543702, true, new a(localThemeScope)), 7, null);
            Ni.a aVar = Ni.a.f21876a;
            InterfaceC15506C.f(LazyVerticalGrid, null, null, null, aVar.a(), 7, null);
            LazyVerticalGrid.h(list.size(), null, null, new l(k.f21974f, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new m(list, cVar, function1, interfaceC16622O, c17955m)));
            if (list.size() % 2 != 0) {
                InterfaceC15506C.f(LazyVerticalGrid, null, null, null, aVar.e(), 7, null);
            }
            InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(191231950, true, new C0352c(localThemeScope)), 7, null);
            InterfaceC15506C.f(LazyVerticalGrid, null, null, null, aVar.b(), 7, null);
            LazyVerticalGrid.h(list2.size(), null, null, new o(n.f21982f, list2), ComposableLambdaKt.composableLambdaInstance(699646206, true, new g(list2, cVar, function1, interfaceC16622O, c17955m)));
            if (list2.size() % 2 != 0) {
                i10 = 699646206;
                InterfaceC15506C.f(LazyVerticalGrid, null, null, null, aVar.d(), 7, null);
            } else {
                i10 = 699646206;
            }
            InterfaceC15506C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(99921744, true, new e(localThemeScope)), 7, null);
            InterfaceC15506C.f(LazyVerticalGrid, null, null, null, aVar.c(), 7, null);
            LazyVerticalGrid.h(list3.size(), null, null, new i(h.f21966f, list3), ComposableLambdaKt.composableLambdaInstance(i10, true, new C0353j(list3, cVar, function1, interfaceC16622O, c17955m)));
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1004781016, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous> (ShowcaseActivity.kt:295)");
            }
            final LocalThemeScope localThemeScope = this.f21932a;
            final List<Ni.c> list = this.f21933b;
            final Ni.c cVar = this.f21934c;
            final Function1<Ni.c, Unit> function1 = this.f21935d;
            final InterfaceC16622O interfaceC16622O = this.f21936e;
            final C17955m c17955m = this.f21937f;
            final List<Ni.c> list2 = this.f21938g;
            final List<Ni.c> list3 = this.f21939h;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierI = D.i(companion, H1.h.p(16));
            MeasurePolicy measurePolicyB = G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            TextStyle style = localThemeScope.getAdsTypography().getHeadings().getFive().getStyle();
            C5346q0.Companion companion4 = C5346q0.INSTANCE;
            N1.b("Showcase", null, companion4.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, composer, 390, 0, 65530);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
            N1.b('v' + C16193g.c(C14732c.f138018a, composer, 0), null, companion4.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 384, 0, 65530);
            composer.v();
            MeasurePolicy measurePolicyB2 = G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            float f10 = 4;
            C17917Z.a(D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null), companion4.k(), 0.0f, 0.0f, composer, 54, 12);
            composer.v();
            InterfaceC15516b.a aVar = new InterfaceC15516b.a(2);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(localThemeScope) | composer.D(list) | composer.D(cVar) | composer.V(function1) | composer.D(interfaceC16622O) | composer.V(c17955m) | composer.D(list2) | composer.D(list3);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Object obj = new Function1() { // from class: Ni.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return j.c.c(list, list2, list3, localThemeScope, cVar, function1, interfaceC16622O, c17955m, (InterfaceC15506C) obj2);
                    }
                };
                composer.t(obj);
                objB = obj;
            }
            composer.P();
            C15521g.a(aVar, null, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 0, 1022);
            composer.v();
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
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ni.c f21985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21987c;

        d(Ni.c cVar, LocalThemeScope localThemeScope, LocalThemeScope localThemeScope2) {
            this.f21985a = cVar;
            this.f21986b = localThemeScope;
            this.f21987c = localThemeScope2;
        }

        public final void a(InterfaceC14814f BottomSheetScaffold, Composer composer, int i10) {
            Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(956036452, i10, -1, "com.meijer.mobile.androidacres.showcase.BottomSheetScaffold.<anonymous> (ShowcaseActivity.kt:467)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, H1.h.p(12));
            Ni.c cVar = this.f21985a;
            LocalThemeScope localThemeScope = this.f21986b;
            LocalThemeScope localThemeScope2 = this.f21987c;
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierH = J.h(J.i(companion, H1.h.p(48)), 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5658d.e(), companion2.l(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            N1.b(cVar.getName() + " Controls", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getEight().getStyle(), composer, 0, 0, 65534);
            C17988z0.b(z0.d.a(C18106a.f170012a.a()), "", null, 0L, composer, 48, 12);
            composer.v();
            Modifier modifierH2 = J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            cVar.c(localThemeScope2, composer, 0);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21988a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<r> f21989b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ni.c f21990c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21991d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ni.c f21992a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f21993b;

            a(Ni.c cVar, LocalThemeScope localThemeScope) {
                this.f21992a = cVar;
                this.f21993b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1842910209, i10, -1, "com.meijer.mobile.androidacres.showcase.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:501)");
                }
                this.f21992a.b(this.f21993b, composer, 0);
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

        e(LocalThemeScope localThemeScope, InterfaceC5730l0<r> interfaceC5730l0, Ni.c cVar, LocalThemeScope localThemeScope2) {
            this.f21988a = localThemeScope;
            this.f21989b = interfaceC5730l0;
            this.f21990c = cVar;
            this.f21991d = localThemeScope2;
        }

        public final void a(InterfaceC14794C innerPadding, Composer composer, int i10) {
            int i11;
            Intrinsics.j(innerPadding, "innerPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(innerPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-82541811, i11, -1, "com.meijer.mobile.androidacres.showcase.BottomSheetScaffold.<anonymous> (ShowcaseActivity.kt:493)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(J.h(J.d(D.h(companion, innerPadding), 0.0f, 1, null), 0.0f, 1, null), this.f21988a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            InterfaceC5730l0<r> interfaceC5730l0 = this.f21989b;
            Ni.c cVar = this.f21990c;
            LocalThemeScope localThemeScope = this.f21991d;
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            j.q(j.m(interfaceC5730l0), J.h(companion, 0.0f, 1, null), ComposableLambdaKt.c(-1842910209, true, new a(cVar, localThemeScope), composer, 54), composer, 432, 0);
            composer.v();
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ni.c f21994a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21995b;

        f(Ni.c cVar, LocalThemeScope localThemeScope) {
            this.f21994a = cVar;
            this.f21995b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1266216568, i10, -1, "com.meijer.mobile.androidacres.showcase.BottomSheetScaffold.<anonymous>.<anonymous> (ShowcaseActivity.kt:513)");
            }
            this.f21994a.b(this.f21995b, composer, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final boolean r17, final java.lang.String r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ni.j.g(boolean, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(boolean z10, String str, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(z10, str, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void i(final LocalThemeScope localThemeScope, final List<? extends Ni.c> showcases, final Ni.c currentShowcaseToShow, final Function1<? super Ni.c, Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        boolean z10;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(showcases, "showcases");
        Intrinsics.j(currentShowcaseToShow, "currentShowcaseToShow");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(147435858);
        int i11 = (i10 & 6) == 0 ? ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(showcases) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(currentShowcaseToShow) : composerStartRestartGroup.D(currentShowcaseToShow) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(147435858, i12, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold (ShowcaseActivity.kt:277)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : showcases) {
                    if (((Ni.c) obj).getType() == m.f22065a) {
                        arrayList.add(obj);
                    }
                }
                composerStartRestartGroup.t(arrayList);
                objB = arrayList;
            }
            List list = (List) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == Composer.INSTANCE.a()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : showcases) {
                    if (((Ni.c) obj2).getType() == m.f22066b) {
                        arrayList2.add(obj2);
                    }
                }
                z10 = true;
                composerStartRestartGroup.t(arrayList2);
                objB2 = arrayList2;
            } else {
                z10 = true;
            }
            List list2 = (List) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == Composer.INSTANCE.a()) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : showcases) {
                    if (((Ni.c) obj3).getType() == m.f22067c ? z10 : false) {
                        arrayList3.add(obj3);
                    }
                }
                composerStartRestartGroup.t(arrayList3);
                objB3 = arrayList3;
            }
            List list3 = (List) objB3;
            composerStartRestartGroup.P();
            final C17955m c17955mP = C17952l.p(EnumC17958n.f168347a, null, null, null, composerStartRestartGroup, 6, 14);
            Object objB4 = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB4 == companion.a()) {
                objB4 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB4);
            }
            final InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB4;
            boolean zH = c17955mP.h();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(interfaceC16622O) | composerStartRestartGroup.V(c17955mP);
            Object objB5 = composerStartRestartGroup.B();
            if (zD || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: Ni.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.j(interfaceC16622O, c17955mP);
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            C13588d.a(zH, (Function0) objB5, composerStartRestartGroup, 0, 0);
            C17952l.c(Ni.a.f21876a.g(), ComposableLambdaKt.c(1004781016, z10, new c(localThemeScope, list, currentShowcaseToShow, onClick, interfaceC16622O, c17955mP, list2, list3), composerStartRestartGroup, 54), content, null, c17955mP, null, !(currentShowcaseToShow instanceof C4685b0), 0.0f, 0.0f, false, false, 0L, 0L, null, 0.0f, 0L, 0L, 0L, composerStartRestartGroup, ((i12 >> 6) & 896) | 54, 0, 262056);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ni.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return j.k(localThemeScope, showcases, currentShowcaseToShow, onClick, content, i10, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(InterfaceC16622O interfaceC16622O, C17955m c17955m) {
        C16648k.d(interfaceC16622O, null, null, new b(c17955m, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, List list, Ni.c cVar, Function1 function1, Function2 function2, int i10, Composer composer, int i11) {
        i(localThemeScope, list, cVar, function1, function2, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ji.LocalThemeScope r30, final Ni.c r31, boolean r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ni.j.l(Ji.M, Ni.c, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Ni.c cVar, boolean z10, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, cVar, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void q(final long j10, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(875439632);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.e(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(875439632, i12, -1, "com.meijer.mobile.androidacres.showcase.ShowcaseCard (ShowcaseActivity.kt:524)");
            }
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            Modifier modifierThen = modifier.then(J.w(Modifier.INSTANCE, dVar.K((int) (j10 >> 32)), dVar.K((int) (4294967295L & j10))));
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ni.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j.r(j10, modifier2, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(long j10, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        q(j10, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(InterfaceC5730l0<r> interfaceC5730l0) {
        return interfaceC5730l0.getValue().getPackedValue();
    }

    private static final void n(InterfaceC5730l0<r> interfaceC5730l0, long j10) {
        interfaceC5730l0.setValue(r.b(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(InterfaceC5730l0 interfaceC5730l0, r rVar) {
        n(interfaceC5730l0, rVar.getPackedValue());
        return Unit.f142422a;
    }
}
