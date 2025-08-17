package tv;

import kotlin.AbstractC17336d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sv.EnumC17050a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ltv/b;", "T", "Ltv/d;", "Lkotlin/Function2;", "Lsv/t;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILsv/a;)V", "scope", "i", "(Lsv/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Luv/d;", "j", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Luv/d;", "e", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tv.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C17148b<T> extends C17150d<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function2<sv.t<? super T>, Continuation<? super Unit>, Object> block;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    /* renamed from: tv.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162188a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162189b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17148b<T> f162190c;

        /* renamed from: d, reason: collision with root package name */
        int f162191d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C17148b<T> c17148b, Continuation<? super a> continuation) {
            super(continuation);
            this.f162190c = c17148b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162189b = obj;
            this.f162191d |= Integer.MIN_VALUE;
            return this.f162190c.i(null, this);
        }
    }

    public /* synthetic */ C17148b(Function2 function2, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? EmptyCoroutineContext.f142646a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC17050a.f161240a : enumC17050a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tv.C17150d, kotlin.AbstractC17336d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object i(sv.t<? super T> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tv.C17148b.a
            if (r0 == 0) goto L13
            r0 = r6
            tv.b$a r0 = (tv.C17148b.a) r0
            int r1 = r0.f162191d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162191d = r1
            goto L18
        L13:
            tv.b$a r0 = new tv.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f162189b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162191d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f162188a
            sv.t r5 = (sv.t) r5
            kotlin.ResultKt.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.f162188a = r5
            r0.f162191d = r3
            java.lang.Object r6 = super.i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.s()
            if (r5 == 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17148b.i(sv.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tv.C17150d, kotlin.AbstractC17336d
    protected AbstractC17336d<T> j(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return new C17148b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17148b(Function2<? super sv.t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        super(function2, coroutineContext, i10, enumC17050a);
        this.block = function2;
    }
}
