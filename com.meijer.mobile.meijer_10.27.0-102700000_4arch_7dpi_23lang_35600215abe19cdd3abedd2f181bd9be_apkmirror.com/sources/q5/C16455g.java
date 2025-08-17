package q5;

import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6029r;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0081@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/l;", "", "a", "(Landroidx/lifecycle/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/r;", "observer", "b", "(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: q5.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16455g {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
    /* renamed from: q5.g$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f156780a;

        /* renamed from: b, reason: collision with root package name */
        Object f156781b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f156782c;

        /* renamed from: d, reason: collision with root package name */
        int f156783d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f156782c = obj;
            this.f156783d |= Integer.MIN_VALUE;
            return C16455g.a(null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"q5/g$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: q5.g$b */
    public static final class b implements InterfaceC6015f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<Unit> f156784a;

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC16654n<? super Unit> interfaceC16654n) {
            this.f156784a = interfaceC16654n;
        }

        @Override // androidx.view.InterfaceC6015f
        public void onStart(InterfaceC6030s owner) {
            InterfaceC16654n<Unit> interfaceC16654n = this.f156784a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(Unit.f142422a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, q5.g$b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.view.AbstractC6023l r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof q5.C16455g.a
            if (r0 == 0) goto L13
            r0 = r7
            q5.g$a r0 = (q5.C16455g.a) r0
            int r1 = r0.f156783d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156783d = r1
            goto L18
        L13:
            q5.g$a r0 = new q5.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f156782c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f156783d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f156781b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r0 = r0.f156780a
            androidx.lifecycle.l r0 = (androidx.view.AbstractC6023l) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L8c
        L31:
            r7 = move-exception
            goto L98
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.b(r7)
            androidx.lifecycle.l$b r7 = r6.getState()
            androidx.lifecycle.l$b r2 = androidx.view.AbstractC6023l.b.f55278d
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L4d
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L4d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.f156780a = r6     // Catch: java.lang.Throwable -> L81
            r0.f156781b = r7     // Catch: java.lang.Throwable -> L81
            r0.f156783d = r3     // Catch: java.lang.Throwable -> L81
            qv.p r2 = new qv.p     // Catch: java.lang.Throwable -> L81
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch: java.lang.Throwable -> L81
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L81
            r2.C()     // Catch: java.lang.Throwable -> L81
            q5.g$b r3 = new q5.g$b     // Catch: java.lang.Throwable -> L81
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L81
            r7.f142835a = r3     // Catch: java.lang.Throwable -> L81
            kotlin.jvm.internal.Intrinsics.g(r3)     // Catch: java.lang.Throwable -> L81
            androidx.lifecycle.r r3 = (androidx.view.InterfaceC6029r) r3     // Catch: java.lang.Throwable -> L81
            r6.a(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.v()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L87
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L98
        L87:
            if (r2 != r1) goto L8a
            return r1
        L8a:
            r0 = r6
            r6 = r7
        L8c:
            T r6 = r6.f142835a
            androidx.lifecycle.r r6 = (androidx.view.InterfaceC6029r) r6
            if (r6 == 0) goto L95
            r0.d(r6)
        L95:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L98:
            T r6 = r6.f142835a
            androidx.lifecycle.r r6 = (androidx.view.InterfaceC6029r) r6
            if (r6 == 0) goto La1
            r0.d(r6)
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C16455g.a(androidx.lifecycle.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(AbstractC6023l abstractC6023l, InterfaceC6029r interfaceC6029r) {
        abstractC6023l.d(interfaceC6029r);
        abstractC6023l.a(interfaceC6029r);
    }
}
