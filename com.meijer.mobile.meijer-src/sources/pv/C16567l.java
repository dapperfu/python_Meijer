package pv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lpv/f;", "", "destination", "", "b", "(Lpv/f;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "C", "a", "(Lpv/f;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: pv.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C16567l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT}, m = "toCollection")
    /* renamed from: pv.l$a */
    static final class a<T, C extends Collection<? super T>> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157534a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157535b;

        /* renamed from: c, reason: collision with root package name */
        int f157536c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157535b = obj;
            this.f157536c |= Integer.MIN_VALUE;
            return C16563h.b0(null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pv.l$b */
    static final class b<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        /* JADX INFO: Incorrect field signature: TC; */
        final /* synthetic */ Collection f157537a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        b(Collection collection) {
            this.f157537a = collection;
        }

        @Override // pv.InterfaceC16562g
        public final Object emit(T t10, Continuation<? super Unit> continuation) {
            this.f157537a.add(t10);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(pv.InterfaceC16561f<? extends T> r4, C r5, kotlin.coroutines.Continuation<? super C> r6) {
        /*
            boolean r0 = r6 instanceof pv.C16567l.a
            if (r0 == 0) goto L13
            r0 = r6
            pv.l$a r0 = (pv.C16567l.a) r0
            int r1 = r0.f157536c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157536c = r1
            goto L18
        L13:
            pv.l$a r0 = new pv.l$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f157535b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157536c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f157534a
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.ResultKt.b(r6)
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r6)
            pv.l$b r6 = new pv.l$b
            r6.<init>(r5)
            r0.f157534a = r5
            r0.f157536c = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16567l.a(pv.f, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object b(InterfaceC16561f<? extends T> interfaceC16561f, List<T> list, Continuation<? super List<? extends T>> continuation) {
        return C16563h.b0(interfaceC16561f, list, continuation);
    }

    public static /* synthetic */ Object c(InterfaceC16561f interfaceC16561f, List list, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return C16563h.c0(interfaceC16561f, list, continuation);
    }
}
