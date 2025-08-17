package f8;

import e8.C13634b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x8.f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lf8/b;", "", "LJ7/a;", "flowGovernor", "<init>", "(LJ7/a;)V", "", "name", "", "e", "(Ljava/lang/String;)V", "h", "()V", "g", "d", "Lf8/a;", "f", "()Lf8/a;", "a", "LJ7/a;", "b", "Lf8/a;", "viewContext", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13858b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final J7.a flowGovernor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile ViewContext viewContext;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.view.ViewContextManager$clearContext$1", f = "ViewContextManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f8.b$a */
    static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130833a;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C13858b.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130833a == 0) {
                ResultKt.b(obj);
                C13858b.this.h();
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.view.ViewContextManager$storeContext$1", f = "ViewContextManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f8.b$b, reason: collision with other inner class name */
    static final class C2079b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130835a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f130837c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2079b(String str, Continuation<? super C2079b> continuation) {
            super(1, continuation);
            this.f130837c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C13858b.this.new C2079b(this.f130837c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C2079b) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130835a == 0) {
                ResultKt.b(obj);
                if (C13858b.this.viewContext != null) {
                    C13858b.this.h();
                }
                C13858b.this.e(this.f130837c);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.viewContext = null;
        f.a("dtxViewContext", "view context is cleared");
    }

    public C13858b(J7.a flowGovernor) {
        Intrinsics.j(flowGovernor, "flowGovernor");
        this.flowGovernor = flowGovernor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String name) {
        this.viewContext = new ViewContext(C13634b.a(8), name);
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
        this.flowGovernor.b(new C2079b(name, null));
    }
}
