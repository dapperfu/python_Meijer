package qc;

import H1.y;
import H1.z;
import P0.e;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.InterfaceC14882C;
import kotlin.InterfaceC13930s;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import l0.InterfaceC15433c;
import l0.InterfaceC15439i;
import l0.w;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000p\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¿\u0001\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00062,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aÁ\u0001\u0010!\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u001f2,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a&\u0010&\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a&\u0010)\u001a\u00020(*\u00020(2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"", "count", "Landroidx/compose/ui/Modifier;", "modifier", "Lqc/g;", "state", "", "reverseLayout", "LH1/h;", "itemSpacing", "Lj0/C;", "contentPadding", "LP0/e$c;", "verticalAlignment", "Lf0/s;", "flingBehavior", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "page", "", "key", "userScrollEnabled", "Lkotlin/Function2;", "Lqc/e;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(ILandroidx/compose/ui/Modifier;Lqc/g;ZFLj0/C;LP0/e$c;Lf0/s;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "isVertical", "LP0/e$b;", "horizontalAlignment", "b", "(ILandroidx/compose/ui/Modifier;Lqc/g;ZFZLf0/s;Lkotlin/jvm/functions/Function1;Lj0/C;ZLP0/e$c;LP0/e$b;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "LU0/f;", "consumeHorizontal", "consumeVertical", "e", "(JZZ)J", "LH1/y;", "f", "pager_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: qc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16621b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qc.b$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f158091f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f158092g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PagerState f158093h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f158094i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f158095j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f158096k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.c f158097l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f158098m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Object> f158099n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f158100o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f158101p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f158102q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f158103r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f158104s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, Modifier modifier, PagerState pagerState, boolean z10, float f10, InterfaceC14882C interfaceC14882C, e.c cVar, InterfaceC13930s interfaceC13930s, Function1<? super Integer, ? extends Object> function1, boolean z11, Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i11, int i12, int i13) {
            super(2);
            this.f158091f = i10;
            this.f158092g = modifier;
            this.f158093h = pagerState;
            this.f158094i = z10;
            this.f158095j = f10;
            this.f158096k = interfaceC14882C;
            this.f158097l = cVar;
            this.f158098m = interfaceC13930s;
            this.f158099n = function1;
            this.f158100o = z11;
            this.f158101p = function4;
            this.f158102q = i11;
            this.f158103r = i12;
            this.f158104s = i13;
        }

        public final void a(Composer composer, int i10) {
            C16621b.a(this.f158091f, this.f158092g, this.f158093h, this.f158094i, this.f158095j, this.f158096k, this.f158097l, this.f158098m, this.f158099n, this.f158100o, this.f158101p, composer, J0.a(this.f158102q | 1), J0.a(this.f158103r), this.f158104s);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qc.b$b, reason: collision with other inner class name */
    static final class C2455b extends Lambda implements Function0<Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f158105f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2455b(InterfaceC13930s interfaceC13930s) {
            super(0);
            this.f158105f = interfaceC13930s;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            InterfaceC13930s interfaceC13930s = this.f158105f;
            yu.e eVar = interfaceC13930s instanceof yu.e ? (yu.e) interfaceC13930s : null;
            if (eVar != null) {
                return eVar.m();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$3$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qc.b$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f158106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f158107b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f158108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PagerState pagerState, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f158107b = pagerState;
            this.f158108c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f158107b, this.f158108c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f158106a == 0) {
                ResultKt.b(obj);
                PagerState pagerState = this.f158107b;
                pagerState.y(RangesKt.f(Math.min(this.f158108c - 1, pagerState.k()), 0));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$4$1", f = "Pager.kt", l = {HttpResponseStatus.ERROR_UNAUTHORIZED}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: qc.b$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f158109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f158110b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: qc.b$d$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PagerState f158111f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PagerState pagerState) {
                super(0);
                this.f158111f = pagerState;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f158111f.b());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: qc.b$d$b, reason: collision with other inner class name */
        static final class C2456b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PagerState f158112a;

            C2456b(PagerState pagerState) {
                this.f158112a = pagerState;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                this.f158112a.s();
                return Unit.f143329a;
            }

            @Override // pv.InterfaceC16562g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: qc.b$d$c */
        public static final class c implements InterfaceC16561f<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f f158113a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: qc.b$d$c$a */
            public static final class a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16562g f158114a;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2", f = "Pager.kt", l = {223}, m = "emit")
                @SourceDebugExtension
                /* renamed from: qc.b$d$c$a$a, reason: collision with other inner class name */
                public static final class C2457a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f158115a;

                    /* renamed from: b, reason: collision with root package name */
                    int f158116b;

                    public C2457a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f158115a = obj;
                        this.f158116b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC16562g interfaceC16562g) {
                    this.f158114a = interfaceC16562g;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof qc.C16621b.d.c.a.C2457a
                        if (r0 == 0) goto L13
                        r0 = r6
                        qc.b$d$c$a$a r0 = (qc.C16621b.d.c.a.C2457a) r0
                        int r1 = r0.f158116b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f158116b = r1
                        goto L18
                    L13:
                        qc.b$d$c$a$a r0 = new qc.b$d$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f158115a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f158116b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.ResultKt.b(r6)
                        pv.g r6 = r4.f158114a
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 != 0) goto L48
                        r0.f158116b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.Unit r5 = kotlin.Unit.f143329a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: qc.C16621b.d.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(InterfaceC16561f interfaceC16561f) {
                this.f158113a = interfaceC16561f;
            }

            @Override // pv.InterfaceC16561f
            public Object collect(InterfaceC16562g<? super Boolean> interfaceC16562g, Continuation continuation) {
                Object objCollect = this.f158113a.collect(new a(interfaceC16562g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PagerState pagerState, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f158110b = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f158110b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f158109a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fU = C16563h.u(new c(o1.q(new a(this.f158110b))), 1);
                C2456b c2456b = new C2456b(this.f158110b);
                this.f158109a = 1;
                if (interfaceC16561fU.collect(c2456b, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$5$1", f = "Pager.kt", l = {HttpResponseStatus.ERROR_NOT_ACCEPTABLE}, m = "invokeSuspend")
    /* renamed from: qc.b$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f158118a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f158119b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: qc.b$e$a */
        static final class a extends Lambda implements Function0<Integer> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PagerState f158120f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PagerState pagerState) {
                super(0);
                this.f158120f = pagerState;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                InterfaceC15439i interfaceC15439iP = this.f158120f.p();
                if (interfaceC15439iP != null) {
                    return Integer.valueOf(interfaceC15439iP.getIndex());
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: qc.b$e$b, reason: collision with other inner class name */
        static final class C2458b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PagerState f158121a;

            C2458b(PagerState pagerState) {
                this.f158121a = pagerState;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                this.f158121a.C();
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(PagerState pagerState, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f158119b = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f158119b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f158118a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fR = C16563h.r(o1.q(new a(this.f158119b)));
                C2458b c2458b = new C2458b(this.f158119b);
                this.f158118a = 1;
                if (interfaceC16561fR.collect(c2458b, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$6$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: qc.b$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f158122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H1.d f158123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagerState f158124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f158125d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(H1.d dVar, PagerState pagerState, float f10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f158123b = dVar;
            this.f158124c = pagerState;
            this.f158125d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f158123b, this.f158124c, this.f158125d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f158122a == 0) {
                ResultKt.b(obj);
                this.f158124c.A(this.f158123b.E0(this.f158125d));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/w;", "", "a", "(Ll0/w;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qc.b$g */
    static final class g extends Lambda implements Function1<w, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f158126f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Object> f158127g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C16620a f158128h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f158129i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C16625f f158130j;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll0/c;", "", "page", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: qc.b$g$a */
        static final class a extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C16620a f158131f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f158132g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C16625f f158133h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C16620a c16620a, Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> function4, C16625f c16625f) {
                super(4);
                this.f158131f = c16620a;
                this.f158132g = function4;
                this.f158133h = c16625f;
            }

            public final void a(InterfaceC15433c items, int i10, Composer composer, int i11) {
                int i12;
                Intrinsics.j(items, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (composer.V(items) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1889356237, i12, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:439)");
                }
                Modifier modifierF = J.F(InterfaceC15433c.c(items, androidx.compose.ui.input.nestedscroll.a.b(Modifier.INSTANCE, this.f158131f, null, 2, null), 0.0f, 1, null), null, false, 3, null);
                Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> function4 = this.f158132g;
                C16625f c16625f = this.f158133h;
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyG, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C5806j c5806j = C5806j.f48836a;
                function4.invoke(c16625f, Integer.valueOf(i10), composer, Integer.valueOf(i12 & 112));
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15433c, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(int i10, Function1<? super Integer, ? extends Object> function1, C16620a c16620a, Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> function4, C16625f c16625f) {
            super(1);
            this.f158126f = i10;
            this.f158127g = function1;
            this.f158128h = c16620a;
            this.f158129i = function4;
            this.f158130j = c16625f;
        }

        public final void a(w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            w.b(LazyColumn, this.f158126f, this.f158127g, null, ComposableLambdaKt.composableLambdaInstance(1889356237, true, new a(this.f158128h, this.f158129i, this.f158130j)), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(w wVar) {
            a(wVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/w;", "", "a", "(Ll0/w;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qc.b$h */
    static final class h extends Lambda implements Function1<w, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f158134f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Object> f158135g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C16620a f158136h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f158137i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C16625f f158138j;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll0/c;", "", "page", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: qc.b$h$a */
        static final class a extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C16620a f158139f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f158140g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C16625f f158141h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C16620a c16620a, Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> function4, C16625f c16625f) {
                super(4);
                this.f158139f = c16620a;
                this.f158140g = function4;
                this.f158141h = c16625f;
            }

            public final void a(InterfaceC15433c items, int i10, Composer composer, int i11) {
                int i12;
                Intrinsics.j(items, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = (composer.V(items) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-70560628, i12, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:468)");
                }
                Modifier modifierF = J.F(InterfaceC15433c.b(items, androidx.compose.ui.input.nestedscroll.a.b(Modifier.INSTANCE, this.f158139f, null, 2, null), 0.0f, 1, null), null, false, 3, null);
                Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> function4 = this.f158140g;
                C16625f c16625f = this.f158141h;
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyG, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C5806j c5806j = C5806j.f48836a;
                function4.invoke(c16625f, Integer.valueOf(i10), composer, Integer.valueOf(i12 & 112));
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15433c, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(int i10, Function1<? super Integer, ? extends Object> function1, C16620a c16620a, Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> function4, C16625f c16625f) {
            super(1);
            this.f158134f = i10;
            this.f158135g = function1;
            this.f158136h = c16620a;
            this.f158137i = function4;
            this.f158138j = c16625f;
        }

        public final void a(w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            w.b(LazyRow, this.f158134f, this.f158135g, null, ComposableLambdaKt.composableLambdaInstance(-70560628, true, new a(this.f158136h, this.f158137i, this.f158138j)), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(w wVar) {
            a(wVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qc.b$i */
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f158142f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f158143g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PagerState f158144h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f158145i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f158146j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f158147k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f158148l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Object> f158149m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f158150n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f158151o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ e.c f158152p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e.b f158153q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> f158154r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f158155s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f158156t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f158157u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(int i10, Modifier modifier, PagerState pagerState, boolean z10, float f10, boolean z11, InterfaceC13930s interfaceC13930s, Function1<? super Integer, ? extends Object> function1, InterfaceC14882C interfaceC14882C, boolean z12, e.c cVar, e.b bVar, Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i11, int i12, int i13) {
            super(2);
            this.f158142f = i10;
            this.f158143g = modifier;
            this.f158144h = pagerState;
            this.f158145i = z10;
            this.f158146j = f10;
            this.f158147k = z11;
            this.f158148l = interfaceC13930s;
            this.f158149m = function1;
            this.f158150n = interfaceC14882C;
            this.f158151o = z12;
            this.f158152p = cVar;
            this.f158153q = bVar;
            this.f158154r = function4;
            this.f158155s = i11;
            this.f158156t = i12;
            this.f158157u = i13;
        }

        public final void a(Composer composer, int i10) {
            C16621b.b(this.f158142f, this.f158143g, this.f158144h, this.f158145i, this.f158146j, this.f158147k, this.f158148l, this.f158149m, this.f158150n, this.f158151o, this.f158152p, this.f158153q, this.f158154r, composer, J0.a(this.f158155s | 1), J0.a(this.f158156t), this.f158157u);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r29, androidx.compose.ui.Modifier r30, qc.PagerState r31, boolean r32, float r33, j0.InterfaceC14882C r34, P0.e.c r35, kotlin.InterfaceC13930s r36, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r37, boolean r38, kotlin.jvm.functions.Function4<? super qc.InterfaceC16624e, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.C16621b.a(int, androidx.compose.ui.Modifier, qc.g, boolean, float, j0.C, P0.e$c, f0.s, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r28, androidx.compose.ui.Modifier r29, qc.PagerState r30, boolean r31, float r32, boolean r33, kotlin.InterfaceC13930s r34, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r35, j0.InterfaceC14882C r36, boolean r37, P0.e.c r38, P0.e.b r39, kotlin.jvm.functions.Function4<? super qc.InterfaceC16624e, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.C16621b.b(int, androidx.compose.ui.Modifier, qc.g, boolean, float, boolean, f0.s, kotlin.jvm.functions.Function1, j0.C, boolean, P0.e$c, P0.e$b, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j10, boolean z10, boolean z11) {
        return U0.g.a(z10 ? U0.f.m(j10) : 0.0f, z11 ? U0.f.n(j10) : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j10, boolean z10, boolean z11) {
        return z.a(z10 ? y.h(j10) : 0.0f, z11 ? y.i(j10) : 0.0f);
    }
}
