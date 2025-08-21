package h8;

import g8.C14338b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z8.f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lh8/b;", "", "LL7/a;", "flowGovernor", "<init>", "(LL7/a;)V", "", "name", "", "e", "(Ljava/lang/String;)V", "h", "()V", "g", "d", "Lh8/a;", "f", "()Lh8/a;", "a", "LL7/a;", "b", "Lh8/a;", "viewContext", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: h8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14488b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final L7.a flowGovernor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile ViewContext viewContext;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.view.ViewContextManager$clearContext$1", f = "ViewContextManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: h8.b$a */
    static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135179a;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C14488b.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f135179a == 0) {
                ResultKt.b(obj);
                C14488b.this.h();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.view.ViewContextManager$storeContext$1", f = "ViewContextManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: h8.b$b, reason: collision with other inner class name */
    static final class C2136b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135181a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f135183c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2136b(String str, Continuation<? super C2136b> continuation) {
            super(1, continuation);
            this.f135183c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C14488b.this.new C2136b(this.f135183c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C2136b) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f135181a == 0) {
                ResultKt.b(obj);
                if (C14488b.this.viewContext != null) {
                    C14488b.this.h();
                }
                C14488b.this.e(this.f135183c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.viewContext = null;
        f.a("dtxViewContext", "view context is cleared");
    }

    public C14488b(L7.a flowGovernor) {
        Intrinsics.j(flowGovernor, "flowGovernor");
        this.flowGovernor = flowGovernor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String name) {
        this.viewContext = new ViewContext(C14338b.a(8), name);
        f.a("dtxViewContext", "view context is created: " + this.viewContext);
    }

    public final void d() {
        this.flowGovernor.b(new a(null));
    }

    public final ViewContext f() {
        f.a("dtxViewContext", "view context is provided: " + this.viewContext);
        return this.viewContext;
    }

    public final void g(String name) {
        Intrinsics.j(name, "name");
        this.flowGovernor.b(new C2136b(name, null));
    }
}
