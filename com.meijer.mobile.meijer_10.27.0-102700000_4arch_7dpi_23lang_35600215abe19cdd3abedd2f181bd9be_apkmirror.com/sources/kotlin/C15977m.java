package kotlin;

import P0.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import d0.J;
import f1.InterfaceC13828a;
import g0.InterfaceC14164k;
import j0.InterfaceC14794C;
import kotlin.InterfaceC13796N;
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
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aé\u0001\u0010%\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2,\u0010$\u001a(\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aS\u0010/\u001a\u00020\b*\u00020\u001b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b/\u00100\u001a3\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00102\u0006\u00103\u001a\u0002022\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lo0/C;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lj0/C;", "contentPadding", "Lo0/g;", "pageSize", "", "beyondViewportPageCount", "LH1/h;", "pageSpacing", "LP0/e$c;", "verticalAlignment", "Lf0/N;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "key", "Lf1/a;", "pageNestedScrollConnection", "Lg0/k;", "snapPosition", "Ld0/J;", "overscrollEffect", "Lkotlin/Function2;", "Lo0/u;", "page", "", "Lkotlin/ExtensionFunctionType;", "pageContent", "a", "(Lo0/C;Landroidx/compose/ui/Modifier;Lj0/C;Lo0/g;IFLP0/e$c;Lf0/N;ZZLkotlin/jvm/functions/Function1;Lf1/a;Lg0/k;Ld0/J;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "", "currentPageOffsetFraction", "pageCount", "d", "(Lg0/k;IIIIIIFI)I", "isVertical", "Lqv/O;", "scope", "e", "(Landroidx/compose/ui/Modifier;Lo0/C;ZLqv/O;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15977m {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.m$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f153025f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f153026g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f153027h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC15971g f153028i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f153029j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f153030k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.c f153031l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC13796N f153032m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f153033n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f153034o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Object> f153035p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC13828a f153036q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC14164k f153037r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ J f153038s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> f153039t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f153040u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f153041v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f153042w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC15962C abstractC15962C, Modifier modifier, InterfaceC14794C interfaceC14794C, InterfaceC15971g interfaceC15971g, int i10, float f10, e.c cVar, InterfaceC13796N interfaceC13796N, boolean z10, boolean z11, Function1<? super Integer, ? extends Object> function1, InterfaceC13828a interfaceC13828a, InterfaceC14164k interfaceC14164k, J j10, Function4<? super InterfaceC15985u, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i11, int i12, int i13) {
            super(2);
            this.f153025f = abstractC15962C;
            this.f153026g = modifier;
            this.f153027h = interfaceC14794C;
            this.f153028i = interfaceC15971g;
            this.f153029j = i10;
            this.f153030k = f10;
            this.f153031l = cVar;
            this.f153032m = interfaceC13796N;
            this.f153033n = z10;
            this.f153034o = z11;
            this.f153035p = function1;
            this.f153036q = interfaceC13828a;
            this.f153037r = interfaceC14164k;
            this.f153038s = j10;
            this.f153039t = function4;
            this.f153040u = i11;
            this.f153041v = i12;
            this.f153042w = i13;
        }

        public final void a(Composer composer, int i10) {
            C15977m.a(this.f153025f, this.f153026g, this.f153027h, this.f153028i, this.f153029j, this.f153030k, this.f153031l, this.f153032m, this.f153033n, this.f153034o, this.f153035p, this.f153036q, this.f153037r, this.f153038s, this.f153039t, composer, J0.a(this.f153040u | 1), J0.a(this.f153041v), this.f153042w);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.m$b */
    static final class b extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f153043f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f153044g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f153045h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f153046f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f153047g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f153046f = abstractC15962C;
                this.f153047g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C15977m.f(this.f153046f, this.f153047g));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$b, reason: collision with other inner class name */
        static final class C2373b extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f153048f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f153049g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2373b(AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f153048f = abstractC15962C;
                this.f153049g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C15977m.g(this.f153048f, this.f153049g));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$c */
        static final class c extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f153050f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f153051g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f153050f = abstractC15962C;
                this.f153051g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C15977m.f(this.f153050f, this.f153051g));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.m$b$d */
        static final class d extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC15962C f153052f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f153053g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f153052f = abstractC15962C;
                this.f153053g = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C15977m.g(this.f153052f, this.f153053g));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O) {
            super(1);
            this.f153043f = z10;
            this.f153044g = abstractC15962C;
            this.f153045h = interfaceC16622O;
        }

        public final void a(u uVar) {
            if (this.f153043f) {
                s.Q(uVar, null, new a(this.f153044g, this.f153045h), 1, null);
                s.K(uVar, null, new C2373b(this.f153044g, this.f153045h), 1, null);
            } else {
                s.M(uVar, null, new c(this.f153044g, this.f153045h), 1, null);
                s.O(uVar, null, new d(this.f153044g, this.f153045h), 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {554}, m = "invokeSuspend")
    /* renamed from: o0.m$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f153054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f153055b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC15962C abstractC15962C, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f153055b = abstractC15962C;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f153055b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f153054a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = this.f153055b;
                this.f153054a = 1;
                if (C15963D.f(abstractC15962C, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {545}, m = "invokeSuspend")
    /* renamed from: o0.m$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f153056a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f153057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC15962C abstractC15962C, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f153057b = abstractC15962C;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f153057b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f153056a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15962C abstractC15962C = this.f153057b;
                this.f153056a = 1;
                if (C15963D.e(abstractC15962C, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
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
    public static final void a(kotlin.AbstractC15962C r36, androidx.compose.ui.Modifier r37, j0.InterfaceC14794C r38, kotlin.InterfaceC15971g r39, int r40, float r41, P0.e.c r42, kotlin.InterfaceC13796N r43, boolean r44, boolean r45, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r46, f1.InterfaceC13828a r47, g0.InterfaceC14164k r48, d0.J r49, kotlin.jvm.functions.Function4<? super kotlin.InterfaceC15985u, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C15977m.a(o0.C, androidx.compose.ui.Modifier, j0.C, o0.g, int, float, P0.e$c, f0.N, boolean, boolean, kotlin.jvm.functions.Function1, f1.a, g0.k, d0.J, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final int d(InterfaceC14164k interfaceC14164k, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16) {
        return MathKt.d(interfaceC14164k.a(i10, i11, i13, i14, i15, i16) - (f10 * (i11 + i12)));
    }

    public static final Modifier e(Modifier modifier, AbstractC15962C abstractC15962C, boolean z10, InterfaceC16622O interfaceC16622O, boolean z11) {
        return z11 ? modifier.then(C16705m.d(Modifier.INSTANCE, false, new b(z10, abstractC15962C, interfaceC16622O), 1, null)) : modifier.then(Modifier.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O) {
        if (abstractC15962C.d()) {
            C16648k.d(interfaceC16622O, null, null, new c(abstractC15962C, null), 3, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(AbstractC15962C abstractC15962C, InterfaceC16622O interfaceC16622O) {
        if (abstractC15962C.e()) {
            C16648k.d(interfaceC16622O, null, null, new d(abstractC15962C, null), 3, null);
            return true;
        }
        return false;
    }
}
