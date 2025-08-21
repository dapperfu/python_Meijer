package kotlin;

import H1.o;
import H1.t;
import P0.e;
import V0.D1;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13576j;
import g1.U;
import j0.C14903g;
import j0.InterfaceC14900d;
import j0.InterfaceC14902f;
import kotlin.C13904L;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.n0;
import mv.C15809k;
import mv.InterfaceC15783O;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0089\u0001\u0010\u001a\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001d\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010$\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010%\"\u0014\u0010'\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&\"\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&\"\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&\"\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060²\u0006\f\u0010/\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"Lx0/f0;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Lx0/e0;", "j", "(Lx0/f0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lx0/e0;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "LV0/D1;", "drawerShape", "LH1/h;", "drawerElevation", "LV0/q0;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "a", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx0/e0;ZLV0/D1;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "b", "pos", "i", "(FFF)F", "open", "onClose", "fraction", "color", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "F", "EndDrawerPadding", "DrawerPositionalThreshold", "c", "DrawerVelocityThreshold", "Lc0/n0;", "d", "Lc0/n0;", "AnimationSpec", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17995d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168818a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f168819b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f168820c = H1.h.p(HttpResponseStatus.ERROR_BAD_REQUEST);

    /* renamed from: d, reason: collision with root package name */
    private static final n0<Float> f168821d = new n0<>(256, 0, null, 6, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/d;", "", "a", "(Lj0/d;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.d0$a */
    static final class a extends Lambda implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17998e0 f168822f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f168823g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f168824h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168825i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ D1 f168826j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f168827k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f168828l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f168829m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168830n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168831o;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.d0$a$a, reason: collision with other inner class name */
        static final class C2688a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17998e0 f168832f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ H1.d f168833g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f168834h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ float f168835i;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "Lx0/f0;", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.d0$a$a$a, reason: collision with other inner class name */
            static final class C2689a extends Lambda implements Function1<C17989b0<EnumC18001f0>, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f168836f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ float f168837g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2689a(float f10, float f11) {
                    super(1);
                    this.f168836f = f10;
                    this.f168837g = f11;
                }

                public final void a(C17989b0<EnumC18001f0> c17989b0) {
                    c17989b0.a(EnumC18001f0.f168977a, this.f168836f);
                    c17989b0.a(EnumC18001f0.f168978b, this.f168837g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C17989b0<EnumC18001f0> c17989b0) {
                    a(c17989b0);
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2688a(C17998e0 c17998e0, H1.d dVar, float f10, float f11) {
                super(0);
                this.f168832f = c17998e0;
                this.f168833g = dVar;
                this.f168834h = f10;
                this.f168835i = f11;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f168832f.i(this.f168833g);
                C17997e.J(this.f168832f.c(), androidx.compose.material.a.a(new C2689a(this.f168834h, this.f168835i)), null, 2, null);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.d0$a$b */
        static final class b extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f168838f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17998e0 f168839g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f168840h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
            /* renamed from: x0.d0$a$b$a, reason: collision with other inner class name */
            static final class C2690a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168841a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17998e0 f168842b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2690a(C17998e0 c17998e0, Continuation<? super C2690a> continuation) {
                    super(2, continuation);
                    this.f168842b = c17998e0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2690a(this.f168842b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2690a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168841a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17998e0 c17998e0 = this.f168842b;
                        this.f168841a = 1;
                        if (c17998e0.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z10, C17998e0 c17998e0, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f168838f = z10;
                this.f168839g = c17998e0;
                this.f168840h = interfaceC15783O;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f168838f && this.f168839g.c().r().invoke(EnumC18001f0.f168977a).booleanValue()) {
                    C15809k.d(this.f168840h, null, null, new C2690a(this.f168839g, null), 3, null);
                }
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$a$c */
        static final class c extends Lambda implements Function0<Float> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f168843f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f168844g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C17998e0 f168845h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f10, float f11, C17998e0 c17998e0) {
                super(0);
                this.f168843f = f10;
                this.f168844g = f11;
                this.f168845h = c17998e0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(C17995d0.i(this.f168843f, this.f168844g, this.f168845h.h()));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/d;", "LH1/n;", "a", "(LH1/d;)J"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$a$d */
        static final class d extends Lambda implements Function1<H1.d, H1.n> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17998e0 f168846f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17998e0 c17998e0) {
                super(1);
                this.f168846f = c17998e0;
            }

            public final long a(H1.d dVar) {
                return o.a(MathKt.d(this.f168846f.h()), 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ H1.n invoke(H1.d dVar) {
                return H1.n.c(a(dVar));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$a$e */
        static final class e extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f168847f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17998e0 f168848g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f168849h;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.d0$a$e$a, reason: collision with other inner class name */
            static final class C2691a extends Lambda implements Function0<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17998e0 f168850f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f168851g;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                /* renamed from: x0.d0$a$e$a$a, reason: collision with other inner class name */
                static final class C2692a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f168852a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17998e0 f168853b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2692a(C17998e0 c17998e0, Continuation<? super C2692a> continuation) {
                        super(2, continuation);
                        this.f168853b = c17998e0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C2692a(this.f168853b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C2692a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f168852a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17998e0 c17998e0 = this.f168853b;
                            this.f168852a = 1;
                            if (c17998e0.b(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2691a(C17998e0 c17998e0, InterfaceC15783O interfaceC15783O) {
                    super(0);
                    this.f168850f = c17998e0;
                    this.f168851g = interfaceC15783O;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    if (this.f168850f.c().r().invoke(EnumC18001f0.f168977a).booleanValue()) {
                        C15809k.d(this.f168851g, null, null, new C2692a(this.f168850f, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, C17998e0 c17998e0, InterfaceC15783O interfaceC15783O) {
                super(1);
                this.f168847f = str;
                this.f168848g = c17998e0;
                this.f168849h = interfaceC15783O;
            }

            public final void a(u uVar) {
                s.o0(uVar, this.f168847f);
                if (this.f168848g.e()) {
                    s.n(uVar, null, new C2691a(this.f168848g, this.f168849h), 1, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.d0$a$f */
        static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168854f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f168854f = function3;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1941234439, i10, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:544)");
                }
                Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
                Function3<InterfaceC14902f, Composer, Integer, Unit> function3 = this.f168854f;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                function3.invoke(C14903g.f139698a, composer, 6);
                composer.v();
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
        /* JADX WARN: Multi-variable type inference failed */
        a(C17998e0 c17998e0, boolean z10, InterfaceC15783O interfaceC15783O, long j10, D1 d12, long j11, long j12, float f10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f168822f = c17998e0;
            this.f168823g = z10;
            this.f168824h = interfaceC15783O;
            this.f168825i = j10;
            this.f168826j = d12;
            this.f168827k = j11;
            this.f168828l = j12;
            this.f168829m = f10;
            this.f168830n = function2;
            this.f168831o = function3;
        }

        public final void a(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            InterfaceC14900d interfaceC14900d2;
            int i11;
            if ((i10 & 6) == 0) {
                interfaceC14900d2 = interfaceC14900d;
                i11 = i10 | (composer.V(interfaceC14900d2) ? 4 : 2);
            } else {
                interfaceC14900d2 = interfaceC14900d;
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(816674999, i11, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:468)");
            }
            long jB = interfaceC14900d2.getConstraints();
            if (!H1.b.h(jB)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            float f10 = -H1.b.l(jB);
            H1.d dVar = (H1.d) composer.o(C6034t0.g());
            boolean zV = composer.V(this.f168822f) | composer.V(dVar) | composer.b(f10);
            C17998e0 c17998e0 = this.f168822f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C2688a(c17998e0, dVar, f10, 0.0f);
                composer.t(objB);
            }
            androidx.compose.runtime.J.i((Function0) objB, composer, 0);
            boolean z10 = composer.o(C6034t0.m()) == t.f13339b;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierE = androidx.compose.material.a.e(companion, this.f168822f.c(), EnumC13937z.f131420b, this.f168823g, z10, null, false, 48, null);
            C17998e0 c17998e02 = this.f168822f;
            boolean z11 = this.f168823g;
            InterfaceC15783O interfaceC15783O = this.f168824h;
            long j10 = this.f168825i;
            D1 d12 = this.f168826j;
            long j11 = this.f168827k;
            long j12 = this.f168828l;
            float f11 = this.f168829m;
            Function2<Composer, Integer, Unit> function2 = this.f168830n;
            Function3<InterfaceC14902f, Composer, Integer, Unit> function3 = this.f168831o;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierE);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE2, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE3, companion3.f());
            function2.invoke(composer, 0);
            composer.v();
            boolean zE = c17998e02.e();
            boolean zA = composer.a(z11) | composer.V(c17998e02) | composer.D(interfaceC15783O);
            Object objB2 = composer.B();
            if (zA || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(z11, c17998e02, interfaceC15783O);
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            boolean zB = composer.b(f10) | composer.V(c17998e02);
            Object objB3 = composer.B();
            if (zB || objB3 == Composer.INSTANCE.a()) {
                objB3 = new c(f10, 0.0f, c17998e02);
                composer.t(objB3);
            }
            C17995d0.b(zE, function0, (Function0) objB3, j10, composer, 0);
            String strA = s1.a(C18038r1.INSTANCE.e(), composer, 6);
            H1.d dVar2 = (H1.d) composer.o(C6034t0.g());
            Modifier modifierX = J.x(companion, dVar2.K(H1.b.n(jB)), dVar2.K(H1.b.m(jB)), dVar2.K(H1.b.l(jB)), dVar2.K(H1.b.k(jB)));
            boolean zV2 = composer.V(c17998e02);
            Object objB4 = composer.B();
            if (zV2 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new d(c17998e02);
                composer.t(objB4);
            }
            Modifier modifierM = D.m(A.a(modifierX, (Function1) objB4), 0.0f, 0.0f, C17995d0.f168818a, 0.0f, 11, null);
            boolean zV3 = composer.V(strA) | composer.V(c17998e02) | composer.D(interfaceC15783O);
            Object objB5 = composer.B();
            if (zV3 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new e(strA, c17998e02, interfaceC15783O);
                composer.t(objB5);
            }
            t1.a(C16819m.d(modifierM, false, (Function1) objB5, 1, null), d12, j11, j12, null, f11, ComposableLambdaKt.c(-1941234439, true, new f(function3), composer, 54), composer, 1572864, 16);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            a(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.d0$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168855f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168856g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17998e0 f168857h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f168858i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ D1 f168859j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f168860k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f168861l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f168862m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f168863n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168864o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f168865p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168866q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, C17998e0 c17998e0, boolean z10, D1 d12, float f10, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f168855f = function3;
            this.f168856g = modifier;
            this.f168857h = c17998e0;
            this.f168858i = z10;
            this.f168859j = d12;
            this.f168860k = f10;
            this.f168861l = j10;
            this.f168862m = j11;
            this.f168863n = j12;
            this.f168864o = function2;
            this.f168865p = i10;
            this.f168866q = i11;
        }

        public final void a(Composer composer, int i10) {
            C17995d0.a(this.f168855f, this.f168856g, this.f168857h, this.f168858i, this.f168859j, this.f168860k, this.f168861l, this.f168862m, this.f168863n, this.f168864o, composer, J0.a(this.f168865p | 1), this.f168866q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.d0$c */
    static final class c extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168867f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f168868g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, Function0<Float> function0) {
            super(1);
            this.f168867f = j10;
            this.f168868g = function0;
        }

        public final void a(X0.f fVar) {
            X0.f.i1(fVar, this.f168867f, 0L, 0L, this.f168868g.invoke().floatValue(), null, null, 0, 118, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.d0$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168869f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168870g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f168871h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168872i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168873j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, Function0<Unit> function0, Function0<Float> function02, long j10, int i10) {
            super(2);
            this.f168869f = z10;
            this.f168870g = function0;
            this.f168871h = function02;
            this.f168872i = j10;
            this.f168873j = i10;
        }

        public final void a(Composer composer, int i10) {
            C17995d0.b(this.f168869f, this.f168870g, this.f168871h, this.f168872i, composer, J0.a(this.f168873j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {760}, m = "invokeSuspend")
    /* renamed from: x0.d0$e */
    static final class e extends SuspendLambda implements Function2<g1.J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168874a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f168875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168876c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$e$a */
        static final class a extends Lambda implements Function1<U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168877f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f168877f = function0;
            }

            public final void a(long j10) {
                this.f168877f.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                a(fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Function0<Unit> function0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f168876c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f168876c, continuation);
            eVar.f168875b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            return ((e) create(j10, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168874a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g1.J j10 = (g1.J) this.f168875b;
                a aVar = new a(this.f168876c);
                this.f168874a = 1;
                if (C13904L.m(j10, null, null, null, aVar, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.d0$f */
    static final class f extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f168878f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168879g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$f$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168880f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(0);
                this.f168880f = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f168880f.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Function0<Unit> function0) {
            super(1);
            this.f168878f = str;
            this.f168879g = function0;
        }

        public final void a(u uVar) {
            s.g0(uVar, this.f168878f);
            s.E(uVar, null, new a(this.f168879g), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.d0$g */
    static final class g extends Lambda implements Function1<EnumC18001f0, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f168881f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC18001f0 enumC18001f0) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/e0;", "c", "()Lx0/e0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.d0$h */
    static final class h extends Lambda implements Function0<C17998e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC18001f0 f168882f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC18001f0, Boolean> f168883g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(EnumC18001f0 enumC18001f0, Function1<? super EnumC18001f0, Boolean> function1) {
            super(0);
            this.f168882f = enumC18001f0;
            this.f168883g = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17998e0 invoke() {
            return new C17998e0(this.f168882f, this.f168883g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f10, float f11, float f12) {
        float f13 = (f12 - f10) / (f11 - f10);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            return 1.0f;
        }
        return f13;
    }

    static {
        float f10 = 56;
        f168818a = H1.h.p(f10);
        f168819b = H1.h.p(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.jvm.functions.Function3<? super j0.InterfaceC14902f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, kotlin.C17998e0 r33, boolean r34, V0.D1 r35, float r36, long r37, long r39, long r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17995d0.a(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, x0.e0, boolean, V0.D1, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z10, Function0<Unit> function0, Function0<Float> function02, long j10, Composer composer, int i10) {
        int i11;
        Modifier modifierC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1983403750);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function02) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.e(j10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if (composerStartRestartGroup.p((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:755)");
            }
            String strA = s1.a(C18038r1.INSTANCE.a(), composerStartRestartGroup, 6);
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(487534424);
                Modifier.Companion companion = Modifier.INSTANCE;
                int i12 = i11 & 112;
                boolean z11 = i12 == 32;
                Object objB = composerStartRestartGroup.B();
                if (z11 || objB == Composer.INSTANCE.a()) {
                    objB = new e(function0, null);
                    composerStartRestartGroup.t(objB);
                }
                Modifier modifierThen = companion.then(new SuspendPointerInputElement(function0, null, null, new U.a((Function2) objB), 6, null));
                boolean zV = (i12 == 32) | composerStartRestartGroup.V(strA);
                Object objB2 = composerStartRestartGroup.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new f(strA, function0);
                    composerStartRestartGroup.t(objB2);
                }
                modifierC = C16819m.c(modifierThen, true, (Function1) objB2);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(487858498);
                composerStartRestartGroup.P();
                modifierC = Modifier.INSTANCE;
            }
            Modifier modifierThen2 = J.f(Modifier.INSTANCE, 0.0f, 1, null).then(modifierC);
            boolean z12 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objB3 = composerStartRestartGroup.B();
            if (z12 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new c(j10, function02);
                composerStartRestartGroup.t(objB3);
            }
            C13576j.a(modifierThen2, (Function1) objB3, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new d(z10, function0, function02, j10, i10));
        }
    }

    public static final C17998e0 j(EnumC18001f0 enumC18001f0, Function1<? super EnumC18001f0, Boolean> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            function1 = g.f168881f;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1435874229, i10, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:394)");
        }
        Object[] objArr = new Object[0];
        L0.k<C17998e0, EnumC18001f0> kVarA = C17998e0.INSTANCE.a(function1);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.V(enumC18001f0)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.V(function1)) || (i10 & 48) == 32);
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new h(enumC18001f0, function1);
            composer.t(objB);
        }
        C17998e0 c17998e0 = (C17998e0) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17998e0;
    }
}
