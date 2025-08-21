package y6;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.InterfaceC16561f;
import z6.C18455d;
import z6.C18456e;
import z6.InterfaceC18449A;
import z6.InterfaceC18449A.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Ly6/a;", "Lz6/A$a;", "D", "", "Ly6/b;", "apolloClient", "Lz6/d$a;", "requestBuilder", "<init>", "(Ly6/b;Lz6/d$a;)V", "Lz6/A;", "operation", "(Ly6/b;Lz6/A;)V", "Lpv/f;", "Lz6/e;", "flow", "c", "(Lpv/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "()Lpv/f;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ly6/b;", "getApolloClient$apollo_runtime_release", "()Ly6/b;", "Lz6/d$a;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18291a<D extends InterfaceC18449A.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18292b apolloClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18455d.a<D> requestBuilder;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.ApolloCall", f = "ApolloCall.kt", l = {HttpResponseStatus.SUCCESS_PARTIAL_CONTENT}, m = "singleSuccessOrException")
    /* renamed from: y6.a$a, reason: collision with other inner class name */
    static final class C2756a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f171228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18291a<D> f171229b;

        /* renamed from: c, reason: collision with root package name */
        int f171230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2756a(C18291a<D> c18291a, Continuation<? super C2756a> continuation) {
            super(continuation);
            this.f171229b = c18291a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171228a = obj;
            this.f171230c |= Integer.MIN_VALUE;
            return this.f171229b.c(null, this);
        }
    }

    public C18291a(C18292b apolloClient, C18455d.a<D> requestBuilder) {
        Intrinsics.j(apolloClient, "apolloClient");
        Intrinsics.j(requestBuilder, "requestBuilder");
        this.apolloClient = apolloClient;
        this.requestBuilder = requestBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(pv.InterfaceC16561f<z6.C18456e<D>> r6, kotlin.coroutines.Continuation<? super z6.C18456e<D>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof y6.C18291a.C2756a
            if (r0 == 0) goto L13
            r0 = r7
            y6.a$a r0 = (y6.C18291a.C2756a) r0
            int r1 = r0.f171230c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171230c = r1
            goto L18
        L13:
            y6.a$a r0 = new y6.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f171228a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f171230c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.ResultKt.b(r7)
            goto L3e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r7)
            r0.f171230c = r4
            java.lang.Object r7 = pv.C16563h.d0(r6, r3, r0, r4, r3)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L50:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r7.next()
            r2 = r1
            z6.e r2 = (z6.C18456e) r2
            com.apollographql.apollo.exception.ApolloException r2 = r2.exception
            if (r2 == 0) goto L65
            r6.add(r1)
            goto L50
        L65:
            r0.add(r1)
            goto L50
        L69:
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r6, r0)
            java.lang.Object r6 = r7.a()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r7.b()
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            r1 = 2
            if (r0 == 0) goto L92
            if (r0 != r4) goto L8a
            java.lang.Object r6 = kotlin.collections.CollectionsKt.s0(r7)
            z6.e r6 = (z6.C18456e) r6
            return r6
        L8a:
            com.apollographql.apollo.exception.DefaultApolloException r6 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r7 = "The operation returned multiple items, use .toFlow() instead of .execute()"
            r6.<init>(r7, r3, r1, r3)
            throw r6
        L92:
            int r7 = r6.size()
            if (r7 == 0) goto Lda
            if (r7 == r4) goto Ld3
            java.lang.Object r7 = kotlin.collections.CollectionsKt.s0(r6)
            z6.e r7 = (z6.C18456e) r7
            z6.e$a r0 = r7.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = kotlin.collections.CollectionsKt.j0(r6, r4)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.apollographql.apollo.exception.ApolloException r7 = r7.exception
            kotlin.jvm.internal.Intrinsics.g(r7)
            java.util.Iterator r6 = r6.iterator()
        Lb5:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r6.next()
            z6.e r1 = (z6.C18456e) r1
            com.apollographql.apollo.exception.ApolloException r1 = r1.exception
            kotlin.jvm.internal.Intrinsics.g(r1)
            kotlin.ExceptionsKt.a(r7, r1)
            goto Lb5
        Lca:
            z6.e$a r6 = r0.e(r7)
            z6.e r6 = r6.b()
            return r6
        Ld3:
            java.lang.Object r6 = kotlin.collections.CollectionsKt.s0(r6)
            z6.e r6 = (z6.C18456e) r6
            return r6
        Lda:
            com.apollographql.apollo.exception.DefaultApolloException r6 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r7 = "The operation did not emit any item, check your interceptor chain"
            r6.<init>(r7, r3, r1, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.C18291a.c(pv.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC16561f<C18456e<D>> d() {
        return this.apolloClient.d(this.requestBuilder.b(), false);
    }

    public final Object b(Continuation<? super C18456e<D>> continuation) {
        return c(d(), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18291a(C18292b apolloClient, InterfaceC18449A<D> operation) {
        this(apolloClient, new C18455d.a(operation));
        Intrinsics.j(apolloClient, "apolloClient");
        Intrinsics.j(operation, "operation");
    }
}
