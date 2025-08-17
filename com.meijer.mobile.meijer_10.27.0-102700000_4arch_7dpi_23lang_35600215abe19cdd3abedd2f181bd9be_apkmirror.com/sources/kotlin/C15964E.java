package kotlin;

import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13796N;
import kotlin.InterfaceC13820s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo0/E;", "Lf0/s;", "Lf0/N;", "originalFlingBehavior", "Lo0/C;", "pagerState", "<init>", "(Lf0/N;Lo0/C;)V", "Lf0/E;", "", "initialVelocity", "a", "(Lf0/E;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf0/N;", "getOriginalFlingBehavior", "()Lf0/N;", "b", "Lo0/C;", "d", "()Lo0/C;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15964E implements InterfaceC13820s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13796N originalFlingBehavior;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15962C pagerState;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {386}, m = "performFling")
    /* renamed from: o0.E$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152948a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f152949b;

        /* renamed from: d, reason: collision with root package name */
        int f152951d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152949b = obj;
            this.f152951d |= Integer.MIN_VALUE;
            return C15964E.this.a(null, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "remainingScrollOffset", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: o0.E$b */
    static final class b extends Lambda implements Function1<Float, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13787E f152953g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC13787E interfaceC13787E) {
            super(1);
            this.f152953g = interfaceC13787E;
        }

        public final void b(float f10) {
            C15964E.this.getPagerState().o0(this.f152953g, MathKt.d(C15964E.this.getPagerState().J() != 0 ? f10 / C15964E.this.getPagerState().J() : 0.0f) + C15964E.this.getPagerState().v());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
            b(f10.floatValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC13820s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.InterfaceC13787E r6, float r7, kotlin.coroutines.Continuation<? super java.lang.Float> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlin.C15964E.a
            if (r0 == 0) goto L13
            r0 = r8
            o0.E$a r0 = (kotlin.C15964E.a) r0
            int r1 = r0.f152951d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152951d = r1
            goto L18
        L13:
            o0.E$a r0 = new o0.E$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f152949b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f152951d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f152948a
            o0.E r6 = (kotlin.C15964E) r6
            kotlin.ResultKt.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r8)
            f0.N r8 = r5.originalFlingBehavior
            o0.E$b r2 = new o0.E$b
            r2.<init>(r6)
            r0.f152948a = r5
            r0.f152951d = r3
            java.lang.Object r8 = r8.c(r6, r7, r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            o0.C r8 = r6.pagerState
            float r8 = r8.w()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L5d
            goto L7d
        L5d:
            o0.C r8 = r6.pagerState
            float r8 = r8.w()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L7d
            o0.C r6 = r6.pagerState
            int r8 = r6.v()
            r1 = 2
            r2 = 0
            kotlin.AbstractC15962C.a0(r6, r8, r0, r1, r2)
            goto L82
        L7d:
            o0.C r6 = r6.pagerState
            r6.w()
        L82:
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.c(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C15964E.a(f0.E, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC15962C getPagerState() {
        return this.pagerState;
    }

    public C15964E(InterfaceC13796N interfaceC13796N, AbstractC15962C abstractC15962C) {
        this.originalFlingBehavior = interfaceC13796N;
        this.pagerState = abstractC15962C;
    }
}
