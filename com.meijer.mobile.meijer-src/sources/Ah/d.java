package Ah;

import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
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
import mv.C15819p;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LAh/d;", "LAh/n;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "<init>", "(Lcom/google/firebase/messaging/FirebaseMessaging;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FirebaseMessaging firebaseMessaging;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<TResult> implements InterfaceC5511e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15815n<String> f480a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC15815n<? super String> interfaceC15815n) {
            this.f480a = interfaceC15815n;
        }

        @Override // Vd.InterfaceC5511e
        public final void onComplete(AbstractC5516j<String> task) {
            Intrinsics.j(task, "task");
            if (!task.r() || task.n() == null) {
                InterfaceC15815n<String> interfaceC15815n = this.f480a;
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(ResultKt.a(new FcmTokenFetchException())));
            } else {
                InterfaceC15815n<String> interfaceC15815n2 = this.f480a;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC15815n2.resumeWith(Result.b(task.n()));
            }
        }
    }

    public d(FirebaseMessaging firebaseMessaging) {
        Intrinsics.j(firebaseMessaging, "firebaseMessaging");
        this.firebaseMessaging = firebaseMessaging;
    }

    @Override // Ah.n
    public Object a(Continuation<? super String> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        this.firebaseMessaging.s().c(new a(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }
}
