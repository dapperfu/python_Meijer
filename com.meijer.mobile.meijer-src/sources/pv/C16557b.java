package pv;

import kotlin.AbstractC16772d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ov.EnumC16325a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lpv/b;", "T", "Lpv/d;", "Lkotlin/Function2;", "Lov/t;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILov/a;)V", "scope", "i", "(Lov/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqv/d;", "j", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lqv/d;", "e", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pv.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16557b<T> extends C16559d<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function2<ov.t<? super T>, Continuation<? super Unit>, Object> block;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    /* renamed from: pv.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157502a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C16557b<T> f157504c;

        /* renamed from: d, reason: collision with root package name */
        int f157505d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C16557b<T> c16557b, Continuation<? super a> continuation) {
            super(continuation);
            this.f157504c = c16557b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157503b = obj;
            this.f157505d |= Integer.MIN_VALUE;
            return this.f157504c.i(null, this);
        }
    }

    public /* synthetic */ C16557b(Function2 function2, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? EmptyCoroutineContext.f143553a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC16325a.f155824a : enumC16325a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pv.C16559d, kotlin.AbstractC16772d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object i(ov.t<? super T> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pv.C16557b.a
            if (r0 == 0) goto L13
            r0 = r6
            pv.b$a r0 = (pv.C16557b.a) r0
            int r1 = r0.f157505d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157505d = r1
            goto L18
        L13:
            pv.b$a r0 = new pv.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f157503b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157505d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f157502a
            ov.t r5 = (ov.t) r5
            kotlin.ResultKt.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.f157502a = r5
            r0.f157505d = r3
            java.lang.Object r6 = super.i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.s()
            if (r5 == 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.f143329a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16557b.i(ov.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pv.C16559d, kotlin.AbstractC16772d
    protected AbstractC16772d<T> j(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return new C16557b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16557b(Function2<? super ov.t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        super(function2, coroutineContext, i10, enumC16325a);
        this.block = function2;
    }
}
