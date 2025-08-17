package kotlin;

import H1.o;
import H1.t;
import P0.e;
import V0.D1;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13443j;
import g1.U;
import j0.C14815g;
import j0.InterfaceC14812d;
import j0.InterfaceC14814f;
import kotlin.C13794L;
import kotlin.EnumC13827z;
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
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0089\u0001\u0010\u001a\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001d\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010$\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010%\"\u0014\u0010'\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&\"\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&\"\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&\"\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060²\u0006\f\u0010/\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"Lx0/f0;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Lx0/e0;", "j", "(Lx0/f0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lx0/e0;", "Lj0/f;", "", "Lkotlin/ExtensionFunctionType;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "LV0/D1;", "drawerShape", "LH1/h;", "drawerElevation", "LV0/q0;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "a", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx0/e0;ZLV0/D1;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "b", "pos", "i", "(FFF)F", "open", "onClose", "fraction", "color", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "F", "EndDrawerPadding", "DrawerPositionalThreshold", "c", "DrawerVelocityThreshold", "Lc0/n0;", "d", "Lc0/n0;", "AnimationSpec", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17929d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f167730a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f167731b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f167732c = H1.h.p(HttpResponseStatus.ERROR_BAD_REQUEST);

    /* renamed from: d, reason: collision with root package name */
    private static final n0<Float> f167733d = new n0<>(256, 0, null, 6, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/d;", "", "a", "(Lj0/d;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.d0$a */
    static final class a extends Lambda implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17932e0 f167734f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f167735g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f167736h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f167737i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ D1 f167738j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f167739k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f167740l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f167741m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167742n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167743o;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.d0$a$a, reason: collision with other inner class name */
        static final class C2664a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17932e0 f167744f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ H1.d f167745g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f167746h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ float f167747i;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/b0;", "Lx0/f0;", "", "a", "(Lx0/b0;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.d0$a$a$a, reason: collision with other inner class name */
            static final class C2665a extends Lambda implements Function1<C17923b0<EnumC17935f0>, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f167748f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ float f167749g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2665a(float f10, float f11) {
                    super(1);
                    this.f167748f = f10;
                    this.f167749g = f11;
                }

                public final void a(C17923b0<EnumC17935f0> c17923b0) {
                    c17923b0.a(EnumC17935f0.f167889a, this.f167748f);
                    c17923b0.a(EnumC17935f0.f167890b, this.f167749g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C17923b0<EnumC17935f0> c17923b0) {
                    a(c17923b0);
                    return Unit.f142422a;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2664a(C17932e0 c17932e0, H1.d dVar, float f10, float f11) {
                super(0);
                this.f167744f = c17932e0;
                this.f167745g = dVar;
                this.f167746h = f10;
                this.f167747i = f11;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f167744f.i(this.f167745g);
                C17931e.J(this.f167744f.c(), androidx.compose.material.a.a(new C2665a(this.f167746h, this.f167747i)), null, 2, null);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.d0$a$b */
        static final class b extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f167750f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17932e0 f167751g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f167752h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
            /* renamed from: x0.d0$a$b$a, reason: collision with other inner class name */
            static final class C2666a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f167753a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17932e0 f167754b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2666a(C17932e0 c17932e0, Continuation<? super C2666a> continuation) {
                    super(2, continuation);
                    this.f167754b = c17932e0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2666a(this.f167754b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2666a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f167753a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17932e0 c17932e0 = this.f167754b;
                        this.f167753a = 1;
                        if (c17932e0.b(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z10, C17932e0 c17932e0, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f167750f = z10;
                this.f167751g = c17932e0;
                this.f167752h = interfaceC16622O;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f167750f && this.f167751g.c().r().invoke(EnumC17935f0.f167889a).booleanValue()) {
                    C16648k.d(this.f167752h, null, null, new C2666a(this.f167751g, null), 3, null);
                }
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$a$c */
        static final class c extends Lambda implements Function0<Float> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f167755f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f167756g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C17932e0 f167757h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f10, float f11, C17932e0 c17932e0) {
                super(0);
                this.f167755f = f10;
                this.f167756g = f11;
                this.f167757h = c17932e0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(C17929d0.i(this.f167755f, this.f167756g, this.f167757h.h()));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/d;", "LH1/n;", "a", "(LH1/d;)J"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$a$d */
        static final class d extends Lambda implements Function1<H1.d, H1.n> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17932e0 f167758f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17932e0 c17932e0) {
                super(1);
                this.f167758f = c17932e0;
            }

            public final long a(H1.d dVar) {
                return o.a(MathKt.d(this.f167758f.h()), 0);
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
            final /* synthetic */ String f167759f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17932e0 f167760g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f167761h;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.d0$a$e$a, reason: collision with other inner class name */
            static final class C2667a extends Lambda implements Function0<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17932e0 f167762f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f167763g;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                /* renamed from: x0.d0$a$e$a$a, reason: collision with other inner class name */
                static final class C2668a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f167764a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17932e0 f167765b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2668a(C17932e0 c17932e0, Continuation<? super C2668a> continuation) {
                        super(2, continuation);
                        this.f167765b = c17932e0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C2668a(this.f167765b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C2668a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f167764a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17932e0 c17932e0 = this.f167765b;
                            this.f167764a = 1;
                            if (c17932e0.b(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2667a(C17932e0 c17932e0, InterfaceC16622O interfaceC16622O) {
                    super(0);
                    this.f167762f = c17932e0;
                    this.f167763g = interfaceC16622O;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    if (this.f167762f.c().r().invoke(EnumC17935f0.f167889a).booleanValue()) {
                        C16648k.d(this.f167763g, null, null, new C2668a(this.f167762f, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, C17932e0 c17932e0, InterfaceC16622O interfaceC16622O) {
                super(1);
                this.f167759f = str;
                this.f167760g = c17932e0;
                this.f167761h = interfaceC16622O;
            }

            public final void a(u uVar) {
                s.o0(uVar, this.f167759f);
                if (this.f167760g.e()) {
                    s.n(uVar, null, new C2667a(this.f167760g, this.f167761h), 1, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.d0$a$f */
        static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167766f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f167766f = function3;
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
                Function3<InterfaceC14814f, Composer, Integer, Unit> function3 = this.f167766f;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                function3.invoke(C14815g.f139108a, composer, 6);
                composer.v();
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
        /* JADX WARN: Multi-variable type inference failed */
        a(C17932e0 c17932e0, boolean z10, InterfaceC16622O interfaceC16622O, long j10, D1 d12, long j11, long j12, float f10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f167734f = c17932e0;
            this.f167735g = z10;
            this.f167736h = interfaceC16622O;
            this.f167737i = j10;
            this.f167738j = d12;
            this.f167739k = j11;
            this.f167740l = j12;
            this.f167741m = f10;
            this.f167742n = function2;
            this.f167743o = function3;
        }

        public final void a(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            InterfaceC14812d interfaceC14812d2;
            int i11;
            if ((i10 & 6) == 0) {
                interfaceC14812d2 = interfaceC14812d;
                i11 = i10 | (composer.V(interfaceC14812d2) ? 4 : 2);
            } else {
                interfaceC14812d2 = interfaceC14812d;
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(816674999, i11, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:468)");
            }
            long jB = interfaceC14812d2.getConstraints();
            if (!H1.b.h(jB)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            float f10 = -H1.b.l(jB);
            H1.d dVar = (H1.d) composer.o(C5892t0.g());
            boolean zV = composer.V(this.f167734f) | composer.V(dVar) | composer.b(f10);
            C17932e0 c17932e0 = this.f167734f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C2664a(c17932e0, dVar, f10, 0.0f);
                composer.t(objB);
            }
            androidx.compose.runtime.J.i((Function0) objB, composer, 0);
            boolean z10 = composer.o(C5892t0.m()) == t.f12007b;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierE = androidx.compose.material.a.e(companion, this.f167734f.c(), EnumC13827z.f130586b, this.f167735g, z10, null, false, 48, null);
            C17932e0 c17932e02 = this.f167734f;
            boolean z11 = this.f167735g;
            InterfaceC16622O interfaceC16622O = this.f167736h;
            long j10 = this.f167737i;
            D1 d12 = this.f167738j;
            long j11 = this.f167739k;
            long j12 = this.f167740l;
            float f11 = this.f167741m;
            Function2<Composer, Integer, Unit> function2 = this.f167742n;
            Function3<InterfaceC14814f, Composer, Integer, Unit> function3 = this.f167743o;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierE);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE2, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE3, companion3.f());
            function2.invoke(composer, 0);
            composer.v();
            boolean zE = c17932e02.e();
            boolean zA = composer.a(z11) | composer.V(c17932e02) | composer.D(interfaceC16622O);
            Object objB2 = composer.B();
            if (zA || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(z11, c17932e02, interfaceC16622O);
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            boolean zB = composer.b(f10) | composer.V(c17932e02);
            Object objB3 = composer.B();
            if (zB || objB3 == Composer.INSTANCE.a()) {
                objB3 = new c(f10, 0.0f, c17932e02);
                composer.t(objB3);
            }
            C17929d0.b(zE, function0, (Function0) objB3, j10, composer, 0);
            String strA = s1.a(C17972r1.INSTANCE.e(), composer, 6);
            H1.d dVar2 = (H1.d) composer.o(C5892t0.g());
            Modifier modifierX = J.x(companion, dVar2.K(H1.b.n(jB)), dVar2.K(H1.b.m(jB)), dVar2.K(H1.b.l(jB)), dVar2.K(H1.b.k(jB)));
            boolean zV2 = composer.V(c17932e02);
            Object objB4 = composer.B();
            if (zV2 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new d(c17932e02);
                composer.t(objB4);
            }
            Modifier modifierM = D.m(A.a(modifierX, (Function1) objB4), 0.0f, 0.0f, C17929d0.f167730a, 0.0f, 11, null);
            boolean zV3 = composer.V(strA) | composer.V(c17932e02) | composer.D(interfaceC16622O);
            Object objB5 = composer.B();
            if (zV3 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new e(strA, c17932e02, interfaceC16622O);
                composer.t(objB5);
            }
            t1.a(C16705m.d(modifierM, false, (Function1) objB5, 1, null), d12, j11, j12, null, f11, ComposableLambdaKt.c(-1941234439, true, new f(function3), composer, 54), composer, 1572864, 16);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            a(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.d0$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167767f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167768g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17932e0 f167769h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f167770i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ D1 f167771j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f167772k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f167773l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f167774m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f167775n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167776o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f167777p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f167778q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, C17932e0 c17932e0, boolean z10, D1 d12, float f10, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f167767f = function3;
            this.f167768g = modifier;
            this.f167769h = c17932e0;
            this.f167770i = z10;
            this.f167771j = d12;
            this.f167772k = f10;
            this.f167773l = j10;
            this.f167774m = j11;
            this.f167775n = j12;
            this.f167776o = function2;
            this.f167777p = i10;
            this.f167778q = i11;
        }

        public final void a(Composer composer, int i10) {
            C17929d0.a(this.f167767f, this.f167768g, this.f167769h, this.f167770i, this.f167771j, this.f167772k, this.f167773l, this.f167774m, this.f167775n, this.f167776o, composer, J0.a(this.f167777p | 1), this.f167778q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.d0$c */
    static final class c extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f167779f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f167780g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, Function0<Float> function0) {
            super(1);
            this.f167779f = j10;
            this.f167780g = function0;
        }

        public final void a(X0.f fVar) {
            X0.f.i1(fVar, this.f167779f, 0L, 0L, this.f167780g.invoke().floatValue(), null, null, 0, 118, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.d0$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f167781f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167782g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f167783h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f167784i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f167785j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, Function0<Unit> function0, Function0<Float> function02, long j10, int i10) {
            super(2);
            this.f167781f = z10;
            this.f167782g = function0;
            this.f167783h = function02;
            this.f167784i = j10;
            this.f167785j = i10;
        }

        public final void a(Composer composer, int i10) {
            C17929d0.b(this.f167781f, this.f167782g, this.f167783h, this.f167784i, composer, J0.a(this.f167785j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {760}, m = "invokeSuspend")
    /* renamed from: x0.d0$e */
    static final class e extends SuspendLambda implements Function2<g1.J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167786a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f167787b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167788c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$e$a */
        static final class a extends Lambda implements Function1<U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f167789f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f167789f = function0;
            }

            public final void a(long j10) {
                this.f167789f.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                a(fVar.getPackedValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Function0<Unit> function0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f167788c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f167788c, continuation);
            eVar.f167787b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            return ((e) create(j10, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167786a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g1.J j10 = (g1.J) this.f167787b;
                a aVar = new a(this.f167788c);
                this.f167786a = 1;
                if (C13794L.m(j10, null, null, null, aVar, this, 7, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.d0$f */
    static final class f extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f167790f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167791g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.d0$f$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f167792f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(0);
                this.f167792f = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f167792f.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Function0<Unit> function0) {
            super(1);
            this.f167790f = str;
            this.f167791g = function0;
        }

        public final void a(u uVar) {
            s.g0(uVar, this.f167790f);
            s.E(uVar, null, new a(this.f167791g), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.d0$g */
    static final class g extends Lambda implements Function1<EnumC17935f0, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f167793f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC17935f0 enumC17935f0) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/e0;", "c", "()Lx0/e0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.d0$h */
    static final class h extends Lambda implements Function0<C17932e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17935f0 f167794f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC17935f0, Boolean> f167795g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(EnumC17935f0 enumC17935f0, Function1<? super EnumC17935f0, Boolean> function1) {
            super(0);
            this.f167794f = enumC17935f0;
            this.f167795g = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17932e0 invoke() {
            return new C17932e0(this.f167794f, this.f167795g);
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
        f167730a = H1.h.p(f10);
        f167731b = H1.h.p(f10);
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
    public static final void a(kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, kotlin.C17932e0 r33, boolean r34, V0.D1 r35, float r36, long r37, long r39, long r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17929d0.a(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, x0.e0, boolean, V0.D1, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
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
            String strA = s1.a(C17972r1.INSTANCE.a(), composerStartRestartGroup, 6);
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
                modifierC = C16705m.c(modifierThen, true, (Function1) objB2);
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
            C13443j.a(modifierThen2, (Function1) objB3, composerStartRestartGroup, 0);
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

    public static final C17932e0 j(EnumC17935f0 enumC17935f0, Function1<? super EnumC17935f0, Boolean> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            function1 = g.f167793f;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1435874229, i10, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:394)");
        }
        Object[] objArr = new Object[0];
        L0.k<C17932e0, EnumC17935f0> kVarA = C17932e0.INSTANCE.a(function1);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.V(enumC17935f0)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.V(function1)) || (i10 & 48) == 32);
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new h(enumC17935f0, function1);
            composer.t(objB);
        }
        C17932e0 c17932e0 = (C17932e0) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17932e0;
    }
}
