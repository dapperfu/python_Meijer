package Oi;

import H1.r;
import Ki.LocalThemeScope;
import Oi.j;
import P0.e;
import Qi.C4769b0;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13736d;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.List;
import ji.C15042c;
import kotlin.C17983Z;
import kotlin.C18018l;
import kotlin.C18021m;
import kotlin.C18054z0;
import kotlin.EnumC18024n;
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
import m0.C15632g;
import m0.InterfaceC15617C;
import m0.InterfaceC15627b;
import m0.InterfaceC15639n;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import y0.C18233a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "LOi/c;", "showcases", "currentShowcaseToShow", "Lkotlin/Function1;", "", "onClick", "Lkotlin/Function0;", "content", "i", "(LKi/M;Ljava/util/List;LOi/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "isSelected", "", "name", "Landroidx/compose/ui/Modifier;", "modifier", "g", "(ZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "showBottomSheetControls", "l", "(LKi/M;LOi/c;ZLandroidx/compose/runtime/Composer;II)V", "LH1/r;", "screenSize", "q", "(JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24174a;

        a(String str) {
            this.f24174a = str;
        }

        public final void a(InterfaceC14888I Button, Composer composer, int i10) {
            Intrinsics.j(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-964698663, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropButton.<anonymous> (ShowcaseActivity.kt:433)");
            }
            N1.b(this.f24174a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$1$1$1", f = "ShowcaseActivity.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24175a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18021m f24176b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C18021m c18021m, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f24176b = c18021m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f24176b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f24175a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18021m c18021m = this.f24176b;
                this.f24175a = 1;
                if (c18021m.k(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24177a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Oi.c> f24178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Oi.c f24179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Oi.c, Unit> f24180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f24181e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18021m f24182f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<Oi.c> f24183g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Oi.c> f24184h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24185a;

            a(LocalThemeScope localThemeScope) {
                this.f24185a = localThemeScope;
            }

            public final void a(InterfaceC15639n item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1398543702, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:319)");
                }
                Modifier modifierI = D.i(Modifier.INSTANCE, H1.h.p(16));
                LocalThemeScope localThemeScope = this.f24185a;
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                N1.b("Foundations", null, C5489q0.INSTANCE.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 390, 0, 65530);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
                a(interfaceC15639n, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Oi.c, Unit> f24186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Oi.c f24187b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f24188c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C18021m f24189d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$2$1$3$1$2$1$1$1", f = "ShowcaseActivity.kt", l = {339}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f24190a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C18021m f24191b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C18021m c18021m, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f24191b = c18021m;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f24191b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f24190a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C18021m c18021m = this.f24191b;
                        this.f24190a = 1;
                        if (c18021m.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super Oi.c, Unit> function1, Oi.c cVar, InterfaceC15783O interfaceC15783O, C18021m c18021m) {
                this.f24186a = function1;
                this.f24187b = cVar;
                this.f24188c = interfaceC15783O;
                this.f24189d = c18021m;
            }

            public final void a() {
                this.f24186a.invoke(this.f24187b);
                C15809k.d(this.f24188c, null, null, new a(this.f24189d, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Oi.j$c$c, reason: collision with other inner class name */
        static final class C0391c implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24192a;

            C0391c(LocalThemeScope localThemeScope) {
                this.f24192a = localThemeScope;
            }

            public final void a(InterfaceC15639n item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(191231950, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:351)");
                }
                Modifier modifierI = D.i(Modifier.INSTANCE, H1.h.p(16));
                LocalThemeScope localThemeScope = this.f24192a;
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                N1.b("Components", null, C5489q0.INSTANCE.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 390, 0, 65530);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
                a(interfaceC15639n, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Oi.c, Unit> f24193a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Oi.c f24194b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f24195c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C18021m f24196d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$2$1$3$1$4$1$1$1", f = "ShowcaseActivity.kt", l = {371}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f24197a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C18021m f24198b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C18021m c18021m, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f24198b = c18021m;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f24198b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f24197a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C18021m c18021m = this.f24198b;
                        this.f24197a = 1;
                        if (c18021m.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super Oi.c, Unit> function1, Oi.c cVar, InterfaceC15783O interfaceC15783O, C18021m c18021m) {
                this.f24193a = function1;
                this.f24194b = cVar;
                this.f24195c = interfaceC15783O;
                this.f24196d = c18021m;
            }

            public final void a() {
                this.f24193a.invoke(this.f24194b);
                C15809k.d(this.f24195c, null, null, new a(this.f24196d, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function3<InterfaceC15639n, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24199a;

            e(LocalThemeScope localThemeScope) {
                this.f24199a = localThemeScope;
            }

            public final void a(InterfaceC15639n item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(99921744, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:383)");
                }
                Modifier modifierI = D.i(Modifier.INSTANCE, H1.h.p(16));
                LocalThemeScope localThemeScope = this.f24199a;
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                N1.b("Assemblies", null, C5489q0.INSTANCE.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 390, 0, 65530);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Composer composer, Integer num) {
                a(interfaceC15639n, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Oi.c, Unit> f24200a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Oi.c f24201b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f24202c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C18021m f24203d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.ShowcaseActivityKt$BackdropScaffold$2$1$3$1$6$1$1$1", f = "ShowcaseActivity.kt", l = {403}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f24204a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C18021m f24205b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C18021m c18021m, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f24205b = c18021m;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f24205b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f24204a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C18021m c18021m = this.f24205b;
                        this.f24204a = 1;
                        if (c18021m.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            f(Function1<? super Oi.c, Unit> function1, Oi.c cVar, InterfaceC15783O interfaceC15783O, C18021m c18021m) {
                this.f24200a = function1;
                this.f24201b = cVar;
                this.f24202c = interfaceC15783O;
                this.f24203d = c18021m;
            }

            public final void a() {
                this.f24200a.invoke(this.f24201b);
                C15809k.d(this.f24202c, null, null, new a(this.f24203d, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/n;", "", "it", "", "a", "(Lm0/n;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class g extends Lambda implements Function4<InterfaceC15639n, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f24206f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Oi.c f24207g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f24208h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f24209i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C18021m f24210j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(List list, Oi.c cVar, Function1 function1, InterfaceC15783O interfaceC15783O, C18021m c18021m) {
                super(4);
                this.f24206f = list;
                this.f24207g = cVar;
                this.f24208h = function1;
                this.f24209i = interfaceC15783O;
                this.f24210j = c18021m;
            }

            public final void a(InterfaceC15639n interfaceC15639n, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15639n) ? 4 : 2) | i11;
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
                Oi.c cVar = (Oi.c) this.f24206f.get(i10);
                composer.startReplaceGroup(-8130270);
                boolean zE = Intrinsics.e(this.f24207g, cVar);
                String name = cVar.getName();
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f24208h) | composer.D(cVar) | composer.D(this.f24209i) | composer.V(this.f24210j);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new d(this.f24208h, cVar, this.f24209i, this.f24210j);
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
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Integer num, Composer composer, Integer num2) {
                a(interfaceC15639n, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class h extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final h f24211f = new h();

            public h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Oi.c cVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class i extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f24212f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f24213g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Function1 function1, List list) {
                super(1);
                this.f24212f = function1;
                this.f24213g = list;
            }

            public final Object a(int i10) {
                return this.f24212f.invoke(this.f24213g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/n;", "", "it", "", "a", "(Lm0/n;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        /* renamed from: Oi.j$c$j, reason: collision with other inner class name */
        public static final class C0392j extends Lambda implements Function4<InterfaceC15639n, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f24214f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Oi.c f24215g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f24216h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f24217i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C18021m f24218j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0392j(List list, Oi.c cVar, Function1 function1, InterfaceC15783O interfaceC15783O, C18021m c18021m) {
                super(4);
                this.f24214f = list;
                this.f24215g = cVar;
                this.f24216h = function1;
                this.f24217i = interfaceC15783O;
                this.f24218j = c18021m;
            }

            public final void a(InterfaceC15639n interfaceC15639n, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15639n) ? 4 : 2) | i11;
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
                Oi.c cVar = (Oi.c) this.f24214f.get(i10);
                composer.startReplaceGroup(-762155644);
                boolean zE = Intrinsics.e(this.f24215g, cVar);
                String name = cVar.getName();
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f24216h) | composer.D(cVar) | composer.D(this.f24217i) | composer.V(this.f24218j);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new f(this.f24216h, cVar, this.f24217i, this.f24218j);
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
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Integer num, Composer composer, Integer num2) {
                a(interfaceC15639n, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class k extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final k f24219f = new k();

            public k() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Oi.c cVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class l extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f24220f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f24221g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(Function1 function1, List list) {
                super(1);
                this.f24220f = function1;
                this.f24221g = list;
            }

            public final Object a(int i10) {
                return this.f24220f.invoke(this.f24221g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/n;", "", "it", "", "a", "(Lm0/n;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class m extends Lambda implements Function4<InterfaceC15639n, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f24222f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Oi.c f24223g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f24224h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f24225i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C18021m f24226j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(List list, Oi.c cVar, Function1 function1, InterfaceC15783O interfaceC15783O, C18021m c18021m) {
                super(4);
                this.f24222f = list;
                this.f24223g = cVar;
                this.f24224h = function1;
                this.f24225i = interfaceC15783O;
                this.f24226j = c18021m;
            }

            public final void a(InterfaceC15639n interfaceC15639n, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15639n) ? 4 : 2) | i11;
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
                Oi.c cVar = (Oi.c) this.f24222f.get(i10);
                composer.startReplaceGroup(818801974);
                boolean zE = Intrinsics.e(this.f24223g, cVar);
                String name = cVar.getName();
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f24224h) | composer.D(cVar) | composer.D(this.f24225i) | composer.V(this.f24226j);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new b(this.f24224h, cVar, this.f24225i, this.f24226j);
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
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15639n interfaceC15639n, Integer num, Composer composer, Integer num2) {
                a(interfaceC15639n, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class n extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final n f24227f = new n();

            public n() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Oi.c cVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class o extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f24228f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f24229g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(Function1 function1, List list) {
                super(1);
                this.f24228f = function1;
                this.f24229g = list;
            }

            public final Object a(int i10) {
                return this.f24228f.invoke(this.f24229g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, List<? extends Oi.c> list, Oi.c cVar, Function1<? super Oi.c, Unit> function1, InterfaceC15783O interfaceC15783O, C18021m c18021m, List<? extends Oi.c> list2, List<? extends Oi.c> list3) {
            this.f24177a = localThemeScope;
            this.f24178b = list;
            this.f24179c = cVar;
            this.f24180d = function1;
            this.f24181e = interfaceC15783O;
            this.f24182f = c18021m;
            this.f24183g = list2;
            this.f24184h = list3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(List list, List list2, List list3, LocalThemeScope localThemeScope, Oi.c cVar, Function1 function1, InterfaceC15783O interfaceC15783O, C18021m c18021m, InterfaceC15617C LazyVerticalGrid) {
            int i10;
            Intrinsics.j(LazyVerticalGrid, "$this$LazyVerticalGrid");
            InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(1398543702, true, new a(localThemeScope)), 7, null);
            Oi.a aVar = Oi.a.f24121a;
            InterfaceC15617C.f(LazyVerticalGrid, null, null, null, aVar.a(), 7, null);
            LazyVerticalGrid.h(list.size(), null, null, new l(k.f24219f, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new m(list, cVar, function1, interfaceC15783O, c18021m)));
            if (list.size() % 2 != 0) {
                InterfaceC15617C.f(LazyVerticalGrid, null, null, null, aVar.e(), 7, null);
            }
            InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(191231950, true, new C0391c(localThemeScope)), 7, null);
            InterfaceC15617C.f(LazyVerticalGrid, null, null, null, aVar.b(), 7, null);
            LazyVerticalGrid.h(list2.size(), null, null, new o(n.f24227f, list2), ComposableLambdaKt.composableLambdaInstance(699646206, true, new g(list2, cVar, function1, interfaceC15783O, c18021m)));
            if (list2.size() % 2 != 0) {
                i10 = 699646206;
                InterfaceC15617C.f(LazyVerticalGrid, null, null, null, aVar.d(), 7, null);
            } else {
                i10 = 699646206;
            }
            InterfaceC15617C.f(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(99921744, true, new e(localThemeScope)), 7, null);
            InterfaceC15617C.f(LazyVerticalGrid, null, null, null, aVar.c(), 7, null);
            LazyVerticalGrid.h(list3.size(), null, null, new i(h.f24211f, list3), ComposableLambdaKt.composableLambdaInstance(i10, true, new C0392j(list3, cVar, function1, interfaceC15783O, c18021m)));
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1004781016, i10, -1, "com.meijer.mobile.androidacres.showcase.BackdropScaffold.<anonymous> (ShowcaseActivity.kt:295)");
            }
            final LocalThemeScope localThemeScope = this.f24177a;
            final List<Oi.c> list = this.f24178b;
            final Oi.c cVar = this.f24179c;
            final Function1<Oi.c, Unit> function1 = this.f24180d;
            final InterfaceC15783O interfaceC15783O = this.f24181e;
            final C18021m c18021m = this.f24182f;
            final List<Oi.c> list2 = this.f24183g;
            final List<Oi.c> list3 = this.f24184h;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierI = D.i(companion, H1.h.p(16));
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            TextStyle style = localThemeScope.getAdsTypography().getHeadings().getFive().getStyle();
            C5489q0.Companion companion4 = C5489q0.INSTANCE;
            N1.b("Showcase", null, companion4.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, style, composer, 390, 0, 65530);
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
            N1.b('v' + C16338g.c(C15042c.f140904a, composer, 0), null, companion4.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSix().getStyle(), composer, 384, 0, 65530);
            composer.v();
            MeasurePolicy measurePolicyB2 = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            float f10 = 4;
            C17983Z.a(D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null), companion4.k(), 0.0f, 0.0f, composer, 54, 12);
            composer.v();
            InterfaceC15627b.a aVar = new InterfaceC15627b.a(2);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(localThemeScope) | composer.D(list) | composer.D(cVar) | composer.V(function1) | composer.D(interfaceC15783O) | composer.V(c18021m) | composer.D(list2) | composer.D(list3);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Object obj = new Function1() { // from class: Oi.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return j.c.c(list, list2, list3, localThemeScope, cVar, function1, interfaceC15783O, c18021m, (InterfaceC15617C) obj2);
                    }
                };
                composer.t(obj);
                objB = obj;
            }
            composer.P();
            C15632g.a(aVar, null, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 0, 1022);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Oi.c f24230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24231b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24232c;

        d(Oi.c cVar, LocalThemeScope localThemeScope, LocalThemeScope localThemeScope2) {
            this.f24230a = cVar;
            this.f24231b = localThemeScope;
            this.f24232c = localThemeScope2;
        }

        public final void a(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
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
            Oi.c cVar = this.f24230a;
            LocalThemeScope localThemeScope = this.f24231b;
            LocalThemeScope localThemeScope2 = this.f24232c;
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = J.h(J.i(companion, H1.h.p(48)), 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.e(), companion2.l(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            N1.b(cVar.getName() + " Controls", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getEight().getStyle(), composer, 0, 0, 65534);
            C18054z0.b(z0.d.a(C18233a.f171038a.a()), "", null, 0L, composer, 48, 12);
            composer.v();
            Modifier modifierH2 = J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            cVar.a(localThemeScope2, composer, 0);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<r> f24234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Oi.c f24235c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24236d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Oi.c f24237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24238b;

            a(Oi.c cVar, LocalThemeScope localThemeScope) {
                this.f24237a = cVar;
                this.f24238b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1842910209, i10, -1, "com.meijer.mobile.androidacres.showcase.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (ShowcaseActivity.kt:501)");
                }
                this.f24237a.e(this.f24238b, composer, 0);
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

        e(LocalThemeScope localThemeScope, InterfaceC5872l0<r> interfaceC5872l0, Oi.c cVar, LocalThemeScope localThemeScope2) {
            this.f24233a = localThemeScope;
            this.f24234b = interfaceC5872l0;
            this.f24235c = cVar;
            this.f24236d = localThemeScope2;
        }

        public final void a(InterfaceC14882C innerPadding, Composer composer, int i10) {
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
            Modifier modifierD = androidx.compose.foundation.b.d(J.h(J.d(D.h(companion, innerPadding), 0.0f, 1, null), 0.0f, 1, null), this.f24233a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            InterfaceC5872l0<r> interfaceC5872l0 = this.f24234b;
            Oi.c cVar = this.f24235c;
            LocalThemeScope localThemeScope = this.f24236d;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            j.q(j.m(interfaceC5872l0), J.h(companion, 0.0f, 1, null), ComposableLambdaKt.c(-1842910209, true, new a(cVar, localThemeScope), composer, 54), composer, 432, 0);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Oi.c f24239a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24240b;

        f(Oi.c cVar, LocalThemeScope localThemeScope) {
            this.f24239a = cVar;
            this.f24240b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1266216568, i10, -1, "com.meijer.mobile.androidacres.showcase.BottomSheetScaffold.<anonymous>.<anonymous> (ShowcaseActivity.kt:513)");
            }
            this.f24239a.e(this.f24240b, composer, 0);
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
        throw new UnsupportedOperationException("Method not decompiled: Oi.j.g(boolean, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(boolean z10, String str, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(z10, str, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void i(final LocalThemeScope localThemeScope, final List<? extends Oi.c> showcases, final Oi.c currentShowcaseToShow, final Function1<? super Oi.c, Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
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
                    if (((Oi.c) obj).getType() == m.f24310a) {
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
                    if (((Oi.c) obj2).getType() == m.f24311b) {
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
                    if (((Oi.c) obj3).getType() == m.f24312c ? z10 : false) {
                        arrayList3.add(obj3);
                    }
                }
                composerStartRestartGroup.t(arrayList3);
                objB3 = arrayList3;
            }
            List list3 = (List) objB3;
            composerStartRestartGroup.P();
            final C18021m c18021mP = C18018l.p(EnumC18024n.f169435a, null, null, null, composerStartRestartGroup, 6, 14);
            Object objB4 = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB4 == companion.a()) {
                objB4 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB4);
            }
            final InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB4;
            boolean zH = c18021mP.h();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(interfaceC15783O) | composerStartRestartGroup.V(c18021mP);
            Object objB5 = composerStartRestartGroup.B();
            if (zD || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: Oi.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.j(interfaceC15783O, c18021mP);
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            C13736d.a(zH, (Function0) objB5, composerStartRestartGroup, 0, 0);
            C18018l.c(Oi.a.f24121a.g(), ComposableLambdaKt.c(1004781016, z10, new c(localThemeScope, list, currentShowcaseToShow, onClick, interfaceC15783O, c18021mP, list2, list3), composerStartRestartGroup, 54), content, null, c18021mP, null, !(currentShowcaseToShow instanceof C4769b0), 0.0f, 0.0f, false, false, 0L, 0L, null, 0.0f, 0L, 0L, 0L, composerStartRestartGroup, ((i12 >> 6) & 896) | 54, 0, 262056);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return j.k(localThemeScope, showcases, currentShowcaseToShow, onClick, content, i10, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(InterfaceC15783O interfaceC15783O, C18021m c18021m) {
        C15809k.d(interfaceC15783O, null, null, new b(c18021m, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, List list, Oi.c cVar, Function1 function1, Function2 function2, int i10, Composer composer, int i11) {
        i(localThemeScope, list, cVar, function1, function2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
    public static final void l(final Ki.LocalThemeScope r30, final Oi.c r31, boolean r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oi.j.l(Ki.M, Oi.c, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Oi.c cVar, boolean z10, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, cVar, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            Modifier modifierThen = modifier.then(J.w(Modifier.INSTANCE, dVar.K((int) (j10 >> 32)), dVar.K((int) (4294967295L & j10))));
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.h
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(InterfaceC5872l0<r> interfaceC5872l0) {
        return interfaceC5872l0.getValue().getPackedValue();
    }

    private static final void n(InterfaceC5872l0<r> interfaceC5872l0, long j10) {
        interfaceC5872l0.setValue(r.b(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(InterfaceC5872l0 interfaceC5872l0, r rVar) {
        n(interfaceC5872l0, rVar.getPackedValue());
        return Unit.f143329a;
    }
}
