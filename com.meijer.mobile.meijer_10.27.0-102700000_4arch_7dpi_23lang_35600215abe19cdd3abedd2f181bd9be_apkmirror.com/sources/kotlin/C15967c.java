package kotlin;

import P0.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.J;
import f1.InterfaceC13828a;
import g0.InterfaceC14164k;
import g1.InterfaceC14171c;
import g1.U;
import j0.InterfaceC14794C;
import kotlin.C13821t;
import kotlin.C15731Q;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13796N;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;
import qv.C16623P;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aã\u0001\u0010)\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152#\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2,\u0010(\u001a(\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b'H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a~\u0010.\u001a\b\u0012\u0004\u0012\u00020-0+2\u0006\u0010\u0003\u001a\u00020\u00022,\u0010(\u001a(\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b'2#\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00172\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0+H\u0003¢\u0006\u0004\b.\u0010/\u001a\u001b\u00100\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lo0/C;", "state", "Lj0/C;", "contentPadding", "", "reverseLayout", "Lf0/z;", "orientation", "Lf0/N;", "flingBehavior", "userScrollEnabled", "Ld0/J;", "overscrollEffect", "", "beyondViewportPageCount", "LH1/h;", "pageSpacing", "Lo0/g;", "pageSize", "Lf1/a;", "pageNestedScrollConnection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "key", "LP0/e$b;", "horizontalAlignment", "LP0/e$c;", "verticalAlignment", "Lg0/k;", "snapPosition", "Lkotlin/Function2;", "Lo0/u;", "page", "", "Lkotlin/ExtensionFunctionType;", "pageContent", "a", "(Landroidx/compose/ui/Modifier;Lo0/C;Lj0/C;ZLf0/z;Lf0/N;ZLd0/J;IFLo0/g;Lf1/a;Lkotlin/jvm/functions/Function1;LP0/e$b;LP0/e$c;Lg0/k;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "pageCount", "Lo0/q;", "c", "(Lo0/C;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "b", "(Landroidx/compose/ui/Modifier;Lo0/C;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15967c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.c$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f152962f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152963g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f152964h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f152965i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC13827z f152966j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC13796N f152967k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f152968l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ J f152969m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f152970n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f152971o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC15971g f152972p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC13828a f152973q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Object> f152974r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ e.b f152975s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ e.c f152976t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC14164k f152977u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> f152978v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f152979w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f152980x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f152981y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, AbstractC15962C abstractC15962C, InterfaceC14794C interfaceC14794C, boolean z10, EnumC13827z enumC13827z, InterfaceC13796N interfaceC13796N, boolean z11, J j10, int i10, float f10, InterfaceC15971g interfaceC15971g, InterfaceC13828a interfaceC13828a, Function1<? super Integer, ? extends Object> function1, e.b bVar, e.c cVar, InterfaceC14164k interfaceC14164k, Function4<? super InterfaceC15985u, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i11, int i12, int i13) {
            super(2);
            this.f152962f = modifier;
            this.f152963g = abstractC15962C;
            this.f152964h = interfaceC14794C;
            this.f152965i = z10;
            this.f152966j = enumC13827z;
            this.f152967k = interfaceC13796N;
            this.f152968l = z11;
            this.f152969m = j10;
            this.f152970n = i10;
            this.f152971o = f10;
            this.f152972p = interfaceC15971g;
            this.f152973q = interfaceC13828a;
            this.f152974r = function1;
            this.f152975s = bVar;
            this.f152976t = cVar;
            this.f152977u = interfaceC14164k;
            this.f152978v = function4;
            this.f152979w = i11;
            this.f152980x = i12;
            this.f152981y = i13;
        }

        public final void a(Composer composer, int i10) {
            C15967c.a(this.f152962f, this.f152963g, this.f152964h, this.f152965i, this.f152966j, this.f152967k, this.f152968l, this.f152969m, this.f152970n, this.f152971o, this.f152972p, this.f152973q, this.f152974r, this.f152975s, this.f152976t, this.f152977u, this.f152978v, composer, J0.a(this.f152979w | 1), J0.a(this.f152980x), this.f152981y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.c$b */
    static final class b extends Lambda implements Function0<Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152982f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC15962C abstractC15962C) {
            super(0);
            this.f152982f = abstractC15962C;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f152982f.H());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.c$c, reason: collision with other inner class name */
    static final class C2371c extends Lambda implements Function0<Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152983f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2371c(AbstractC15962C abstractC15962C) {
            super(0);
            this.f152983f = abstractC15962C;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f152983f.H());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.c$d */
    static final class d implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152984a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {287}, m = "invokeSuspend")
        /* renamed from: o0.c$d$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f152985a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g1.J f152986b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f152987c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN, 293}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: o0.c$d$a$a, reason: collision with other inner class name */
            static final class C2372a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

                /* renamed from: b, reason: collision with root package name */
                Object f152988b;

                /* renamed from: c, reason: collision with root package name */
                Object f152989c;

                /* renamed from: d, reason: collision with root package name */
                int f152990d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f152991e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ AbstractC15962C f152992f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2372a(AbstractC15962C abstractC15962C, Continuation<? super C2372a> continuation) {
                    super(2, continuation);
                    this.f152992f = abstractC15962C;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C2372a c2372a = new C2372a(this.f152992f, continuation);
                    c2372a.f152991e = obj;
                    return c2372a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                    return ((C2372a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
                
                    if (r11 == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
                
                    if (r11 == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r1 = r10.f152990d
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r4) goto L27
                        if (r1 != r2) goto L1f
                        java.lang.Object r1 = r10.f152989c
                        g1.B r1 = (g1.PointerInputChange) r1
                        java.lang.Object r4 = r10.f152988b
                        g1.B r4 = (g1.PointerInputChange) r4
                        java.lang.Object r5 = r10.f152991e
                        g1.c r5 = (g1.InterfaceC14171c) r5
                        kotlin.ResultKt.b(r11)
                        goto L68
                    L1f:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L27:
                        java.lang.Object r1 = r10.f152991e
                        g1.c r1 = (g1.InterfaceC14171c) r1
                        kotlin.ResultKt.b(r11)
                        goto L44
                    L2f:
                        kotlin.ResultKt.b(r11)
                        java.lang.Object r11 = r10.f152991e
                        r1 = r11
                        g1.c r1 = (g1.InterfaceC14171c) r1
                        g1.s r11 = g1.EnumC14186s.f132678a
                        r10.f152991e = r1
                        r10.f152990d = r4
                        java.lang.Object r11 = kotlin.C13794L.e(r1, r3, r11, r10)
                        if (r11 != r0) goto L44
                        goto L67
                    L44:
                        g1.B r11 = (g1.PointerInputChange) r11
                        o0.C r4 = r10.f152992f
                        U0.f$a r5 = U0.f.INSTANCE
                        long r5 = r5.c()
                        r4.l0(r5)
                        r4 = 0
                        r5 = r1
                        r1 = r4
                        r4 = r11
                    L55:
                        if (r1 != 0) goto L94
                        g1.s r11 = g1.EnumC14186s.f132678a
                        r10.f152991e = r5
                        r10.f152988b = r4
                        r10.f152989c = r1
                        r10.f152990d = r2
                        java.lang.Object r11 = r5.K0(r11, r10)
                        if (r11 != r0) goto L68
                    L67:
                        return r0
                    L68:
                        g1.q r11 = (g1.C14185q) r11
                        java.util.List r6 = r11.c()
                        r7 = r6
                        java.util.Collection r7 = (java.util.Collection) r7
                        int r7 = r7.size()
                        r8 = r3
                    L76:
                        if (r8 >= r7) goto L88
                        java.lang.Object r9 = r6.get(r8)
                        g1.B r9 = (g1.PointerInputChange) r9
                        boolean r9 = g1.r.c(r9)
                        if (r9 != 0) goto L85
                        goto L55
                    L85:
                        int r8 = r8 + 1
                        goto L76
                    L88:
                        java.util.List r11 = r11.c()
                        java.lang.Object r11 = r11.get(r3)
                        r1 = r11
                        g1.B r1 = (g1.PointerInputChange) r1
                        goto L55
                    L94:
                        o0.C r11 = r10.f152992f
                        long r0 = r1.getPosition()
                        long r2 = r4.getPosition()
                        long r0 = U0.f.p(r0, r2)
                        r11.l0(r0)
                        kotlin.Unit r11 = kotlin.Unit.f142422a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.C15967c.d.a.C2372a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1.J j10, AbstractC15962C abstractC15962C, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f152986b = j10;
                this.f152987c = abstractC15962C;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f152986b, this.f152987c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f152985a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    g1.J j10 = this.f152986b;
                    C2372a c2372a = new C2372a(this.f152987c, null);
                    this.f152985a = 1;
                    if (C13821t.d(j10, c2372a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        d(AbstractC15962C abstractC15962C) {
            this.f152984a = abstractC15962C;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            Object objG = C16623P.g(new a(j10, this.f152984a, null), continuation);
            return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0/p;", "c", "()Lo0/p;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.c$f */
    static final class f extends Lambda implements Function0<C15980p> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Function4<InterfaceC15985u, Integer, Composer, Integer, Unit>> f152993f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Integer, Object>> f152994g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Integer> f152995h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(z1<? extends Function4<? super InterfaceC15985u, ? super Integer, ? super Composer, ? super Integer, Unit>> z1Var, z1<? extends Function1<? super Integer, ? extends Object>> z1Var2, Function0<Integer> function0) {
            super(0);
            this.f152993f = z1Var;
            this.f152994g = z1Var2;
            this.f152995h = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15980p invoke() {
            return new C15980p(this.f152993f.getValue(), this.f152994g.getValue(), this.f152995h.invoke().intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0/q;", "c", "()Lo0/q;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.c$g */
    static final class g extends Lambda implements Function0<C15981q> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<C15980p> f152996f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f152997g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(z1<C15980p> z1Var, AbstractC15962C abstractC15962C) {
            super(0);
            this.f152996f = z1Var;
            this.f152997g = abstractC15962C;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15981q invoke() {
            C15980p value = this.f152996f.getValue();
            return new C15981q(this.f152997g, value, new C15731Q(this.f152997g.G(), value));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r30, kotlin.AbstractC15962C r31, j0.InterfaceC14794C r32, boolean r33, kotlin.EnumC13827z r34, kotlin.InterfaceC13796N r35, boolean r36, d0.J r37, int r38, float r39, kotlin.InterfaceC15971g r40, f1.InterfaceC13828a r41, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r42, P0.e.b r43, P0.e.c r44, g0.InterfaceC14164k r45, kotlin.jvm.functions.Function4<? super kotlin.InterfaceC15985u, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C15967c.a(androidx.compose.ui.Modifier, o0.C, j0.C, boolean, f0.z, f0.N, boolean, d0.J, int, float, o0.g, f1.a, kotlin.jvm.functions.Function1, P0.e$b, P0.e$c, g0.k, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final Modifier b(Modifier modifier, AbstractC15962C abstractC15962C) {
        return modifier.then(U.c(Modifier.INSTANCE, abstractC15962C, new d(abstractC15962C)));
    }

    private static final Function0<C15981q> c(AbstractC15962C abstractC15962C, Function4<? super InterfaceC15985u, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function1<? super Integer, ? extends Object> function1, Function0<Integer> function0, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-1372505274, i10, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)");
        }
        z1 z1VarP = o1.p(function4, composer, (i10 >> 3) & 14);
        z1 z1VarP2 = o1.p(function1, composer, (i10 >> 6) & 14);
        boolean z11 = false;
        if ((((i10 & 14) ^ 6) > 4 && composer.V(abstractC15962C)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zV = z10 | composer.V(z1VarP) | composer.V(z1VarP2);
        if ((((i10 & 7168) ^ 3072) > 2048 && composer.V(function0)) || (i10 & 3072) == 2048) {
            z11 = true;
        }
        boolean z12 = zV | z11;
        Object objB = composer.B();
        if (z12 || objB == Composer.INSTANCE.a()) {
            objB = new PropertyReference0Impl(o1.d(o1.o(), new g(o1.d(o1.o(), new f(z1VarP, z1VarP2, function0)), abstractC15962C))) { // from class: o0.c.e
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((z1) this.receiver).getValue();
                }
            };
            composer.t(objB);
        }
        KProperty0 kProperty0 = (KProperty0) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return kProperty0;
    }
}
