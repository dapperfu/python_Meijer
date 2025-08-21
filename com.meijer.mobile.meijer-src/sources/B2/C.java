package B2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15839z;
import mv.InterfaceC15835x;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"LB2/C;", "", "<init>", "()V", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "c", "Lwv/a;", "Lwv/a;", "runMutex", "Lmv/x;", "Lmv/x;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a runMutex = wv.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15835x<Unit> didRun = C15839z.b(null, 1, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2199a;

        /* renamed from: b, reason: collision with root package name */
        Object f2200b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2201c;

        /* renamed from: e, reason: collision with root package name */
        int f2203e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2201c = obj;
            this.f2203e |= Integer.MIN_VALUE;
            return C.this.c(this);
        }
    }

    protected abstract Object b(Continuation<? super Unit> continuation);

    public final Object a(Continuation<? super Unit> continuation) {
        Object objH = this.didRun.H(continuation);
        return objH == IntrinsicsKt.f() ? objH : Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof B2.C.a
            if (r0 == 0) goto L13
            r0 = r7
            B2.C$a r0 = (B2.C.a) r0
            int r1 = r0.f2203e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2203e = r1
            goto L18
        L13:
            B2.C$a r0 = new B2.C$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2201c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2203e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f2200b
            wv.a r1 = (wv.InterfaceC17929a) r1
            java.lang.Object r0 = r0.f2199a
            B2.C r0 = (B2.C) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f2200b
            wv.a r2 = (wv.InterfaceC17929a) r2
            java.lang.Object r4 = r0.f2199a
            B2.C r4 = (B2.C) r4
            kotlin.ResultKt.b(r7)
            r7 = r2
            goto L6a
        L4c:
            kotlin.ResultKt.b(r7)
            mv.x<kotlin.Unit> r7 = r6.didRun
            boolean r7 = r7.A()
            if (r7 == 0) goto L5a
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        L5a:
            wv.a r7 = r6.runMutex
            r0.f2199a = r6
            r0.f2200b = r7
            r0.f2203e = r4
            java.lang.Object r2 = r7.g(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            mv.x<kotlin.Unit> r2 = r4.didRun     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.A()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            kotlin.Unit r0 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L78
            r7.h(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f2199a = r4     // Catch: java.lang.Throwable -> L78
            r0.f2200b = r7     // Catch: java.lang.Throwable -> L78
            r0.f2203e = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            mv.x<kotlin.Unit> r7 = r0.didRun     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r0 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L35
            r7.b0(r0)     // Catch: java.lang.Throwable -> L35
            r1.h(r5)
            return r0
        L96:
            r1.h(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
