package g8;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg8/a;", "", "Lmv/O;", "coroutineScope", "<init>", "(Lmv/O;)V", "", "delay", "Lkotlin/Function0;", "", "task", "Lmv/C0;", "a", "(JLkotlin/jvm/functions/Function0;)Lmv/C0;", "Lmv/O;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14337a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.util.CoroutineHandler$launchWithDelay$1", f = "CoroutineHandler.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: g8.a$a, reason: collision with other inner class name */
    static final class C2119a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f134104a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f134105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f134106c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134107d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2119a(long j10, Function0<Unit> function0, Continuation<? super C2119a> continuation) {
            super(2, continuation);
            this.f134106c = j10;
            this.f134107d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2119a c2119a = new C2119a(this.f134106c, this.f134107d, continuation);
            c2119a.f134105b = obj;
            return c2119a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C2119a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134104a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    if (C15784P.i((InterfaceC15783O) this.f134105b)) {
                        long j10 = this.f134106c;
                        this.f134104a = 1;
                        if (Z.b(j10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
                this.f134107d.invoke();
                return Unit.f143329a;
            } catch (CancellationException unused) {
                return Unit.f143329a;
            }
        }
    }

    public C14337a(InterfaceC15783O coroutineScope) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    public final C0 a(long delay, Function0<Unit> task) {
        Intrinsics.j(task, "task");
        return C15809k.d(this.coroutineScope, null, null, new C2119a(delay, task, null), 3, null);
    }
}
