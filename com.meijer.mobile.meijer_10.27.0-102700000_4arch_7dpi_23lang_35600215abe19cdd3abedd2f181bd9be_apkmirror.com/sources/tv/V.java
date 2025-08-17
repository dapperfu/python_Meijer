package tv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R;\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltv/V;", "T", "Ltv/F;", "sharedFlow", "Lkotlin/Function2;", "Ltv/g;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "<init>", "(Ltv/F;Lkotlin/jvm/functions/Function2;)V", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ltv/F;", "b", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
final class V<T> implements InterfaceC17144F<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<T> sharedFlow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<InterfaceC17153g<? super T>, Continuation<? super Unit>, Object> action;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {HttpResponseStatus.ERROR_PRECONDITION_FAILED}, m = "collect")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f162179a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V<T> f162180b;

        /* renamed from: c, reason: collision with root package name */
        int f162181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V<T> v10, Continuation<? super a> continuation) {
            super(continuation);
            this.f162180b = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162179a = obj;
            this.f162181c |= Integer.MIN_VALUE;
            return this.f162180b.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tv.InterfaceC17144F, tv.InterfaceC17152f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(tv.InterfaceC17153g<? super T> r6, kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tv.V.a
            if (r0 == 0) goto L13
            r0 = r7
            tv.V$a r0 = (tv.V.a) r0
            int r1 = r0.f162181c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162181c = r1
            goto L18
        L13:
            tv.V$a r0 = new tv.V$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f162179a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162181c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.ResultKt.b(r7)
            goto L46
        L31:
            kotlin.ResultKt.b(r7)
            tv.F<T> r7 = r5.sharedFlow
            tv.U r2 = new tv.U
            kotlin.jvm.functions.Function2<tv.g<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r5.action
            r2.<init>(r6, r4)
            r0.f162181c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.V.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V(InterfaceC17144F<? extends T> interfaceC17144F, Function2<? super InterfaceC17153g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.sharedFlow = interfaceC17144F;
        this.action = function2;
    }
}
