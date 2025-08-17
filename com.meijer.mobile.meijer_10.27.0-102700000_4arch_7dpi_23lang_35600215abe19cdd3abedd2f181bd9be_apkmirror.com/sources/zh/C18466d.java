package zh;

import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import com.google.firebase.messaging.FirebaseMessaging;
import com.meijer.mobile.accounts.service.models.network.FcmTokenFetchException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lzh/d;", "Lzh/n;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "<init>", "(Lcom/google/firebase/messaging/FirebaseMessaging;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: zh.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18466d implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FirebaseMessaging firebaseMessaging;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zh.d$a */
    static final class a<TResult> implements InterfaceC5227e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<String> f171964a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16654n<? super String> interfaceC16654n) {
            this.f171964a = interfaceC16654n;
        }

        @Override // Td.InterfaceC5227e
        public final void onComplete(AbstractC5232j<String> task) {
            Intrinsics.j(task, "task");
            if (!task.r() || task.n() == null) {
                InterfaceC16654n<String> interfaceC16654n = this.f171964a;
                Result.Companion companion = Result.INSTANCE;
                interfaceC16654n.resumeWith(Result.b(ResultKt.a(new FcmTokenFetchException())));
            } else {
                InterfaceC16654n<String> interfaceC16654n2 = this.f171964a;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC16654n2.resumeWith(Result.b(task.n()));
            }
        }
    }

    public C18466d(FirebaseMessaging firebaseMessaging) {
        Intrinsics.j(firebaseMessaging, "firebaseMessaging");
        this.firebaseMessaging = firebaseMessaging;
    }

    @Override // zh.n
    public Object a(Continuation<? super String> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        this.firebaseMessaging.q().c(new a(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }
}
