package com.meijer.mobile.meijer.service;

import Qn.I;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.S;
import com.google.gson.Gson;
import com.google.gson.f;
import com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService;
import dk.C13530b;
import ei.C13666c;
import ek.NotificationData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.C16648k;
import qv.InterfaceC16622O;
import ru.InterfaceC16835b;
import ru.c;
import wm.C17838h;

@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/meijer/mobile/meijer/service/MeijerFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/S;", "remoteMessage", "", "onMessageReceived", "(Lcom/google/firebase/messaging/S;)V", "", "token", "onNewToken", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/service/MeijerFirebaseMessagingService$a;", "getEntryPoint", "()Lcom/meijer/mobile/meijer/service/MeijerFirebaseMessagingService$a;", "entryPoint", "Lwm/h;", "getMperksNotificationManager", "()Lwm/h;", "mperksNotificationManager", "LQn/I;", "getFlyBuyManager", "()LQn/I;", "flyBuyManager", "Lei/c;", "getAdobeManager", "()Lei/c;", "adobeManager", "LUn/b;", "getEmarsysManager", "()LUn/b;", "emarsysManager", "Lqv/O;", "getApplicationScope", "()Lqv/O;", "applicationScope", "Lqv/K;", "getIoDispatcher", "()Lqv/K;", "ioDispatcher", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MeijerFirebaseMessagingService extends FirebaseMessagingService {
    public static final int $stable = 8;

    @InterfaceC16835b
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/service/MeijerFirebaseMessagingService$a;", "", "Lwm/h;", "l", "()Lwm/h;", "Lei/c;", "p", "()Lei/c;", "LQn/I;", "q", "()LQn/I;", "LUn/b;", "t", "()LUn/b;", "Lqv/O;", "v", "()Lqv/O;", "Lqv/K;", "n", "()Lqv/K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        C17838h l();

        AbstractC16618K n();

        C13666c p();

        I q();

        Un.b t();

        InterfaceC16622O v();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService$onMessageReceived$1", f = "MeijerFirebaseMessagingService.kt", l = {92}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113500a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Bitmap> f113502c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ NotificationData f113503d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService$onMessageReceived$1$1", f = "MeijerFirebaseMessagingService.kt", l = {94}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f113504a;

            /* renamed from: b, reason: collision with root package name */
            int f113505b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Bitmap> f113506c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ MeijerFirebaseMessagingService f113507d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ NotificationData f113508e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f113506c, this.f113507d, this.f113508e, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.ObjectRef<Bitmap> objectRef, MeijerFirebaseMessagingService meijerFirebaseMessagingService, NotificationData notificationData, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f113506c = objectRef;
                this.f113507d = meijerFirebaseMessagingService;
                this.f113508e = notificationData;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Ref.ObjectRef<Bitmap> objectRef;
                T t10;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f113505b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        objectRef = (Ref.ObjectRef) this.f113504a;
                        ResultKt.b(obj);
                        t10 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Ref.ObjectRef<Bitmap> objectRef2 = this.f113506c;
                    Context baseContext = this.f113507d.getBaseContext();
                    Intrinsics.i(baseContext, "getBaseContext(...)");
                    String imageUrl = this.f113508e.getImageUrl();
                    this.f113504a = objectRef2;
                    this.f113505b = 1;
                    Object objG = C13530b.g(baseContext, imageUrl, this);
                    if (objG == objF) {
                        return objF;
                    }
                    objectRef = objectRef2;
                    t10 = objG;
                }
                objectRef.f142835a = t10;
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MeijerFirebaseMessagingService.this.new b(this.f113502c, this.f113503d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef<Bitmap> objectRef, NotificationData notificationData, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f113502c = objectRef;
            this.f113503d = notificationData;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113500a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16618K ioDispatcher = MeijerFirebaseMessagingService.this.getIoDispatcher();
                a aVar = new a(this.f113502c, MeijerFirebaseMessagingService.this, this.f113503d, null);
                this.f113500a = 1;
                if (C16644i.g(ioDispatcher, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onMessageReceived$lambda$0(NotificationData notificationData, MeijerFirebaseMessagingService meijerFirebaseMessagingService, S s10, Ref.ObjectRef objectRef, Throwable th2) {
        if (th2 != null) {
            uw.a.INSTANCE.f(th2, "Coil Error fetching bitmap from URL: " + notificationData.getImageUrl(), new Object[0]);
        }
        if (meijerFirebaseMessagingService.getMperksNotificationManager().g() && !meijerFirebaseMessagingService.getFlyBuyManager().M(s10) && !meijerFirebaseMessagingService.getEmarsysManager().g(meijerFirebaseMessagingService, s10)) {
            C17838h mperksNotificationManager = meijerFirebaseMessagingService.getMperksNotificationManager();
            Intrinsics.g(notificationData);
            C17838h.o(mperksNotificationManager, notificationData, (Bitmap) objectRef.f142835a, false, 4, null);
        }
        return Unit.f142422a;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(final S remoteMessage) {
        Intrinsics.j(remoteMessage, "remoteMessage");
        Map<String, String> mapB = remoteMessage.B();
        Intrinsics.i(mapB, "getData(...)");
        Gson gsonB = new f().i().b();
        final NotificationData notificationData = (NotificationData) gsonB.o(gsonB.x(mapB), NotificationData.class);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C16648k.d(getApplicationScope(), null, null, new b(objectRef, notificationData, null), 3, null).K(new Function1() { // from class: Tn.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeijerFirebaseMessagingService.onMessageReceived$lambda$0(notificationData, this, remoteMessage, objectRef, (Throwable) obj);
            }
        });
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) throws Exception {
        Intrinsics.j(token, "token");
        getFlyBuyManager().Z(token);
        getAdobeManager().d(token);
        getEmarsysManager().m(token);
    }

    private final C13666c getAdobeManager() {
        return getEntryPoint().p();
    }

    private final InterfaceC16622O getApplicationScope() {
        return getEntryPoint().v();
    }

    private final Un.b getEmarsysManager() {
        return getEntryPoint().t();
    }

    private final a getEntryPoint() {
        Object objA = c.a(getApplicationContext(), a.class);
        Intrinsics.i(objA, "get(...)");
        return (a) objA;
    }

    private final I getFlyBuyManager() {
        return getEntryPoint().q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC16618K getIoDispatcher() {
        return getEntryPoint().n();
    }

    private final C17838h getMperksNotificationManager() {
        return getEntryPoint().l();
    }
}
