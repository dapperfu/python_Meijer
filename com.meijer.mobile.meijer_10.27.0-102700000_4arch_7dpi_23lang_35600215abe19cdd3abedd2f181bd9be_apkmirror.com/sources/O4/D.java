package O4;

import N4.AbstractC4333v;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16622O;
import qv.Z;
import tv.C17154h;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqv/O;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "", "c", "(Lqv/O;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23097a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f23098b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "", "", "throwable", "", "attempt", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function4<InterfaceC17153g<? super Boolean>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f23099a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23100b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f23101c;

        a(Continuation<? super a> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC17153g<? super Boolean> interfaceC17153g, Throwable th2, Long l10, Continuation<? super Boolean> continuation) {
            return d(interfaceC17153g, th2, l10.longValue(), continuation);
        }

        public final Object d(InterfaceC17153g<? super Boolean> interfaceC17153g, Throwable th2, long j10, Continuation<? super Boolean> continuation) {
            a aVar = new a(continuation);
            aVar.f23100b = th2;
            aVar.f23101c = j10;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f23099a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Throwable th2 = (Throwable) this.f23100b;
                long j10 = this.f23101c;
                AbstractC4333v.e().d(D.f23097a, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j10 * 30000, D.f23098b);
                this.f23099a = 1;
                if (Z.b(jMin, this) == objF) {
                    return objF;
                }
            }
            return Boxing.a(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f23102a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f23103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f23104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f23104c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f23104c, continuation);
            bVar.f23103b = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return d(bool.booleanValue(), continuation);
        }

        public final Object d(boolean z10, Continuation<? super Unit> continuation) {
            return ((b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f23102a == 0) {
                ResultKt.b(obj);
                W4.A.c(this.f23104c, RescheduleReceiver.class, this.f23103b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        String strI = AbstractC4333v.i("UnfinishedWorkListener");
        Intrinsics.i(strI, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f23097a = strI;
        f23098b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(InterfaceC16622O interfaceC16622O, Context appContext, androidx.work.a configuration, WorkDatabase db2) {
        Intrinsics.j(interfaceC16622O, "<this>");
        Intrinsics.j(appContext, "appContext");
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(db2, "db");
        if (W4.C.b(appContext, configuration)) {
            C17154h.J(C17154h.O(C17154h.r(C17154h.o(C17154h.U(db2.l().s(), new a(null)))), new b(appContext, null)), interfaceC16622O);
        }
    }
}
