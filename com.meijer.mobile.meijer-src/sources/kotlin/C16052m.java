package kotlin;

import P0.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import d0.J;
import f1.InterfaceC13938a;
import g0.InterfaceC14293k;
import j0.InterfaceC14882C;
import kotlin.InterfaceC13906N;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aé\u0001\u0010%\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2,\u0010$\u001a(\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aS\u0010/\u001a\u00020\b*\u00020\u001b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b/\u00100\u001a3\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u0002022\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lo0/C;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lj0/C;", "contentPadding", "Lo0/g;", "pageSize", "", "beyondViewportPageCount", "LH1/h;", "pageSpacing", "LP0/e$c;", "verticalAlignment", "Lf0/N;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "key", "Lf1/a;", "pageNestedScrollConnection", "Lg0/k;", "snapPosition", "Ld0/J;", "overscrollEffect", "Lkotlin/Function2;", "Lo0/u;", "page", "", "Lkotlin/ExtensionFunctionType;", "pageContent", "a", "(Lo0/C;Landroidx/compose/ui/Modifier;Lj0/C;Lo0/g;IFLP0/e$c;Lf0/N;ZZLkotlin/jvm/functions/Function1;Lf1/a;Lg0/k;Ld0/J;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "", "currentPageOffsetFraction", "pageCount", "d", "(Lg0/k;IIIIIIFI)I", "isVertical", "Lmv/O;", "scope", "e", "(Landroidx/compose/ui/Modifier;Lo0/C;ZLmv/O;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16052m {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.m$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153470f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f153471g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f153472h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC16046g f153473i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f153474j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f153475k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.c f153476l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC13906N f153477m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f153478n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f153479o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Object> f153480p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC13938a f153481q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC14293k f153482r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ J f153483s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC16060u, Integer, Composer, Integer, Unit> f153484t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f153485u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f153486v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f153487w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC16037C abstractC16037C, Modifier modifier, InterfaceC14882C interfaceC14882C, InterfaceC16046g interfaceC16046g, int i10, float f10, e.c cVar, InterfaceC13906N interfaceC13906N, boolean z10, boolean z11, Function1<? super Integer, ? extends Object> function1, InterfaceC13938a interfaceC13938a, InterfaceC14293k interfaceC14293k, J j10, Function4<? super InterfaceC16060u, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i11, int i12, int i13) {
            super(2);
            this.f153470f = abstractC16037C;
            this.f153471g = modifier;
            this.f153472h = interfaceC14882C;
            this.f153473i = interfaceC16046g;
            this.f153474j = i10;
            this.f153475k = f10;
            this.f153476l = cVar;
            this.f153477m = interfaceC13906N;
            this.f153478n = z10;
            this.f153479o = z11;
            this.f153480p = function1;
            this.f153481q = interfaceC13938a;
            this.f153482r = interfaceC14293k;
            this.f153483s = j10;
            this.f153484t = function4;
            this.f153485u = i11;
            this.f153486v = i12;
            this.f153487w = i13;
        }

        public final void a(Composer composer, int i10) {
            C16052m.a(this.f153470f, this.f153471g, this.f153472h, this.f153473i, this.f153474j, this.f153475k, this.f153476l, this.f153477m, this.f153478n, this.f153479o, this.f153480p, this.f153481q, this.f153482r, this.f153483s, this.f153484t, composer, J0.a(this.f153485u | 1), J0.a(this.f153486v), this.f153487w);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.m$b */
    static final class b extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f153488f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153489g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f153490h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f153491f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f153492g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f153491f = abstractC16037C;
                this.f153492g = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C16052m.f(this.f153491f, this.f153492g));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$b, reason: collision with other inner class name */
        static final class C2374b extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f153493f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f153494g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2374b(AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f153493f = abstractC16037C;
                this.f153494g = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C16052m.g(this.f153493f, this.f153494g));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$c */
        static final class c extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f153495f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f153496g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f153495f = abstractC16037C;
                this.f153496g = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C16052m.f(this.f153495f, this.f153496g));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$d */
        static final class d extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f153497f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f153498g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O) {
                super(0);
                this.f153497f = abstractC16037C;
                this.f153498g = interfaceC15783O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C16052m.g(this.f153497f, this.f153498g));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O) {
            super(1);
            this.f153488f = z10;
            this.f153489g = abstractC16037C;
            this.f153490h = interfaceC15783O;
        }

        public final void a(u uVar) {
            if (this.f153488f) {
                s.Q(uVar, null, new a(this.f153489g, this.f153490h), 1, null);
                s.K(uVar, null, new C2374b(this.f153489g, this.f153490h), 1, null);
            } else {
                s.M(uVar, null, new c(this.f153489g, this.f153490h), 1, null);
                s.O(uVar, null, new d(this.f153489g, this.f153490h), 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {554}, m = "invokeSuspend")
    /* renamed from: o0.m$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f153499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC16037C abstractC16037C, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f153500b = abstractC16037C;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f153500b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f153499a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = this.f153500b;
                this.f153499a = 1;
                if (C16038D.f(abstractC16037C, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {545}, m = "invokeSuspend")
    /* renamed from: o0.m$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f153501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153502b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC16037C abstractC16037C, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f153502b = abstractC16037C;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f153502b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f153501a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = this.f153502b;
                this.f153501a = 1;
                if (C16038D.e(abstractC16037C, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.AbstractC16037C r36, androidx.compose.ui.Modifier r37, j0.InterfaceC14882C r38, kotlin.InterfaceC16046g r39, int r40, float r41, P0.e.c r42, kotlin.InterfaceC13906N r43, boolean r44, boolean r45, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r46, f1.InterfaceC13938a r47, g0.InterfaceC14293k r48, d0.J r49, kotlin.jvm.functions.Function4<? super kotlin.InterfaceC16060u, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C16052m.a(o0.C, androidx.compose.ui.Modifier, j0.C, o0.g, int, float, P0.e$c, f0.N, boolean, boolean, kotlin.jvm.functions.Function1, f1.a, g0.k, d0.J, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final int d(InterfaceC14293k interfaceC14293k, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16) {
        return MathKt.d(interfaceC14293k.a(i10, i11, i13, i14, i15, i16) - (f10 * (i11 + i12)));
    }

    public static final Modifier e(Modifier modifier, AbstractC16037C abstractC16037C, boolean z10, InterfaceC15783O interfaceC15783O, boolean z11) {
        return z11 ? modifier.then(C16819m.d(Modifier.INSTANCE, false, new b(z10, abstractC16037C, interfaceC15783O), 1, null)) : modifier.then(Modifier.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O) {
        if (abstractC16037C.d()) {
            C15809k.d(interfaceC15783O, null, null, new c(abstractC16037C, null), 3, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(AbstractC16037C abstractC16037C, InterfaceC15783O interfaceC15783O) {
        if (abstractC16037C.e()) {
            C15809k.d(interfaceC15783O, null, null, new d(abstractC16037C, null), 3, null);
            return true;
        }
        return false;
    }
}
