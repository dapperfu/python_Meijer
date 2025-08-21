package com.radiusnetworks.flybuy.sdk.data.operations;

import android.content.Context;
import com.google.gson.Gson;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.AppInstanceResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiEmptyResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiErrorResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.app.PushServiceType;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt;
import com.radiusnetworks.flybuy.sdk.data.push.AirshipTopicSubscriber;
import com.radiusnetworks.flybuy.sdk.data.push.FirebaseTopicSubscriber;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushTopic;
import com.radiusnetworks.flybuy.sdk.data.push.OneSignalTopicSubscriber;
import com.radiusnetworks.flybuy.sdk.data.push.PushTopicSubscriber;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt;
import j$.time.Clock;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;
import wv.InterfaceC17929a;
import wv.g;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0019\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010%\u001a\u00020\rH\u0000¢\u0006\u0004\b#\u0010$J9\u0010+\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\u001e\u0010(\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\r\u0018\u00010&H\u0000¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010\"R$\u0010=\u001a\u00020\b2\u0006\u00109\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010;\"\u0004\b>\u0010\"R4\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/ConfigOperation;", "", "Landroid/content/Context;", "context", "j$/time/Clock", "clock", "<init>", "(Landroid/content/Context;Lj$/time/Clock;)V", "", "pushToken", "timeZone", "", "rotateAppInstance", "", "updateAppInstance", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushTopic;", "subscribeToPushTopics", "()Ljava/util/Set;", "", "", "subscribedPushTopicIds", "requestUpdateAppInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "force", "Lcom/radiusnetworks/flybuy/api/model/AppInstanceResponse;", "checkAppResponseCacheOrFetch", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndStoreAppResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readStoredAppResponse", "()Lcom/radiusnetworks/flybuy/api/model/AppInstanceResponse;", "updateAppInstance$core_defaultRelease", "(Ljava/lang/String;)V", "rotateAppInstanceId$core_defaultRelease", "()V", "rotateAppInstanceId", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "callback", "getAppResponse$core_defaultRelease", "(ZLkotlin/jvm/functions/Function2;)V", "getAppResponse", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushTopicSubscriber;", "pushTopicSubscriber", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushTopicSubscriber;", "Lwv/a;", "appInstanceMutex", "Lwv/a;", "value", "storedPushToken", "Ljava/lang/String;", "setStoredPushToken", "storedTimeZone", "setStoredTimeZone", "storedSubscribedPushTopics", "Ljava/util/Set;", "setStoredSubscribedPushTopics", "(Ljava/util/Set;)V", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ConfigOperation {
    private static final String SDK_CONFIG_FILENAME = "flybuy_sdk_config.json";
    private final InterfaceC17929a appInstanceMutex;
    private final Context applicationContext;
    private final Clock clock;
    private PushTopicSubscriber pushTopicSubscriber;
    private String storedPushToken;
    private Set<FlybuyPushTopic> storedSubscribedPushTopics;
    private String storedTimeZone;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PushServiceType.values().length];
            try {
                iArr[PushServiceType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PushServiceType.ONE_SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PushServiceType.AIRSHIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation", f = "ConfigOperation.kt", l = {172}, m = "checkAppResponseCacheOrFetch")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$checkAppResponseCacheOrFetch$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigOperation.this.checkAppResponseCacheOrFetch(false, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation", f = "ConfigOperation.kt", l = {183}, m = "fetchAndStoreAppResponse")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C131421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C131421(Continuation<? super C131421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigOperation.this.fetchAndStoreAppResponse(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$1", f = "ConfigOperation.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$1, reason: invalid class name and case insensitive filesystem */
    public static final class C131431 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $pushToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131431(String str, Continuation<? super C131431> continuation) {
            super(2, continuation);
            this.$pushToken = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfigOperation.this.new C131431(this.$pushToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C131431) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                String id2 = TimeZone.getDefault().getID();
                ConfigOperation configOperation = ConfigOperation.this;
                String str = this.$pushToken;
                Intrinsics.g(id2);
                this.label = 1;
                if (configOperation.updateAppInstance(str, id2, false, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation", f = "ConfigOperation.kt", l = {234, 93}, m = "updateAppInstance")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigOperation.this.updateAppInstance(null, null, false, this);
        }
    }

    public ConfigOperation(Context context, Clock clock) {
        Intrinsics.j(context, "context");
        Intrinsics.j(clock, "clock");
        this.clock = clock;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.appInstanceMutex = g.b(false, 1, null);
        this.storedPushToken = PreferenceExtensionKt.getStoredPushToken(applicationContext);
        this.storedTimeZone = PreferenceExtensionKt.getStoredTimeZone(applicationContext);
        this.storedSubscribedPushTopics = PreferenceExtensionKt.getSubscribedPushTopics(applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, com.radiusnetworks.flybuy.api.model.AppInstanceResponse] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.radiusnetworks.flybuy.api.model.AppInstanceResponse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkAppResponseCacheOrFetch(boolean r10, kotlin.coroutines.Continuation<? super com.radiusnetworks.flybuy.api.model.AppInstanceResponse> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$checkAppResponseCacheOrFetch$1 r0 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$checkAppResponseCacheOrFetch$1 r0 = new com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$checkAppResponseCacheOrFetch$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r10 = r0.L$2
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation r10 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation) r10
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r0 = r0.L$0
            r2 = r0
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation r2 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation) r2
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L36
            goto L91
        L36:
            r0 = move-exception
            r10 = r0
            goto La0
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            kotlin.ResultKt.b(r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            com.radiusnetworks.flybuy.api.model.AppInstanceResponse r2 = com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt.getDEFAULT_APP_RESPONSE()
            r11.f143742a = r2
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L7a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L7a
            android.content.Context r4 = r9.applicationContext     // Catch: java.lang.Throwable -> L7a
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = "flybuy_sdk_config.json"
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7a
            long r4 = r2.lastModified()     // Catch: java.lang.Throwable -> L7a
            if (r10 != 0) goto L7d
            boolean r10 = r2.exists()     // Catch: java.lang.Throwable -> L7a
            if (r10 == 0) goto L7d
            android.content.Context r10 = r9.applicationContext     // Catch: java.lang.Throwable -> L7a
            j$.time.Clock r2 = r9.clock     // Catch: java.lang.Throwable -> L7a
            boolean r10 = com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt.shouldRequestConfig(r10, r4, r2)     // Catch: java.lang.Throwable -> L7a
            if (r10 == 0) goto L76
            goto L7d
        L76:
            r10 = r9
            r2 = r10
            r1 = r11
            goto L91
        L7a:
            r0 = move-exception
            r10 = r0
            goto L9e
        L7d:
            java.lang.String r10 = "Sdk config cache file doesn't exist or is stale"
            com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.logd(r9, r3, r10)     // Catch: java.lang.Throwable -> L7a
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L7a
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L7a
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L7a
            r0.label = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r10 = r9.fetchAndStoreAppResponse(r0)     // Catch: java.lang.Throwable -> L7a
            if (r10 != r1) goto L76
            return r1
        L91:
            com.radiusnetworks.flybuy.api.model.AppInstanceResponse r10 = r10.readStoredAppResponse()     // Catch: java.lang.Throwable -> L36
            r1.f143742a = r10     // Catch: java.lang.Throwable -> L36
            kotlin.Unit r10 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L36
            goto Laa
        L9e:
            r2 = r9
            r1 = r11
        La0:
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
        Laa:
            java.lang.Throwable r4 = kotlin.Result.e(r10)
            if (r4 == 0) goto Lba
            r10 = 0
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r7 = 4
            r8 = 0
            r3 = 1
            r5 = 0
            com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.loge$default(r2, r3, r4, r5, r6, r7, r8)
        Lba:
            T r10 = r1.f143742a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.checkAppResponseCacheOrFetch(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object checkAppResponseCacheOrFetch$default(ConfigOperation configOperation, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return configOperation.checkAppResponseCacheOrFetch(z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndStoreAppResponse(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.C131421
            if (r0 == 0) goto L13
            r0 = r12
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1 r0 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.C131421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1 r0 = new com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation r0 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation) r0
            kotlin.ResultKt.b(r12)
            r4 = r0
            goto L50
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L36:
            kotlin.ResultKt.b(r12)
            java.lang.String r12 = "Retrieving sdk config and storing in flybuy_sdk_config.json"
            com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.logd(r11, r3, r12)
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1 r12 = new kotlin.jvm.functions.Function0<com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppInstanceResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1
                static {
                    /*
                        com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1 r0 = new com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1) com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1.INSTANCE com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1.<init>():void");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppInstanceResponse> invoke() {
                    /*
                        r1 = this;
                        com.radiusnetworks.flybuy.api.network.common.ApiResponse r0 = com.radiusnetworks.flybuy.api.FlyBuyApi.getAppData()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1.invoke():com.radiusnetworks.flybuy.api.network.common.ApiResponse");
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppInstanceResponse> invoke() {
                    /*
                        r1 = this;
                        com.radiusnetworks.flybuy.api.network.common.ApiResponse r0 = r1.invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1.invoke():java.lang.Object");
                }
            }
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2 r2 = new kotlin.jvm.functions.Function1<com.radiusnetworks.flybuy.api.model.AppInstanceResponse, com.radiusnetworks.flybuy.api.model.AppInstanceResponse>() { // from class: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2
                static {
                    /*
                        com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2 r0 = new com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2) com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2.INSTANCE com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public final com.radiusnetworks.flybuy.api.model.AppInstanceResponse invoke(com.radiusnetworks.flybuy.api.model.AppInstanceResponse r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.j(r2, r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2.invoke(com.radiusnetworks.flybuy.api.model.AppInstanceResponse):com.radiusnetworks.flybuy.api.model.AppInstanceResponse");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ com.radiusnetworks.flybuy.api.model.AppInstanceResponse invoke(com.radiusnetworks.flybuy.api.model.AppInstanceResponse r1) {
                    /*
                        r0 = this;
                        com.radiusnetworks.flybuy.api.model.AppInstanceResponse r1 = (com.radiusnetworks.flybuy.api.model.AppInstanceResponse) r1
                        com.radiusnetworks.flybuy.api.model.AppInstanceResponse r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3 r4 = new kotlin.jvm.functions.Function1<com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppInstanceResponse>, kotlin.Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3
                static {
                    /*
                        com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3 r0 = new com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3) com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3.INSTANCE com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3.<init>():void");
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppInstanceResponse> r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.j(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3.invoke2(com.radiusnetworks.flybuy.api.network.common.ApiResponse):void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppInstanceResponse> r1) {
                    /*
                        r0 = this;
                        com.radiusnetworks.flybuy.api.network.common.ApiResponse r1 = (com.radiusnetworks.flybuy.api.network.common.ApiResponse) r1
                        r0.invoke2(r1)
                        kotlin.Unit r1 = kotlin.Unit.f143329a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r12 = com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt.invokeApi(r12, r2, r4, r0)
            if (r12 != r1) goto L4f
            return r1
        L4f:
            r4 = r11
        L50:
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r12 = r12.c()
            com.radiusnetworks.flybuy.api.network.common.ApiResponse r12 = (com.radiusnetworks.flybuy.api.network.common.ApiResponse) r12
            if (r12 == 0) goto Lc4
            boolean r0 = r12 instanceof com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse
            if (r0 == 0) goto Lc4
            java.lang.String r0 = "SDK config received. Storing in flybuy_sdk_config.json"
            com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.logd(r4, r3, r0)
            android.content.Context r0 = r4.applicationContext
            r1 = r12
            com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse r1 = (com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse) r1
            java.lang.Object r1 = r1.getBody()
            com.radiusnetworks.flybuy.api.model.AppInstanceResponse r1 = (com.radiusnetworks.flybuy.api.model.AppInstanceResponse) r1
            long r1 = r1.getMinSyncIntervalSeconds()
            com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt.setConfigMinRequestInterval(r0, r1)
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r4.applicationContext
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "flybuy_sdk_config.json"
            r0.<init>(r1, r2)
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> Lae
            r1.<init>()     // Catch: java.lang.Exception -> Lae
            com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse r12 = (com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse) r12     // Catch: java.lang.Exception -> Lae
            java.lang.Object r12 = r12.getBody()     // Catch: java.lang.Exception -> Lae
            java.lang.String r12 = r1.x(r12)     // Catch: java.lang.Exception -> Lae
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lae
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lae
            kotlin.jvm.internal.Intrinsics.g(r12)     // Catch: java.lang.Throwable -> Lb2
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> Lb2
            byte[] r12 = r12.getBytes(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)     // Catch: java.lang.Throwable -> Lb2
            r1.write(r12)     // Catch: java.lang.Throwable -> Lb2
            kotlin.Unit r12 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> Lb2
            r12 = 0
            kotlin.io.CloseableKt.a(r1, r12)     // Catch: java.lang.Exception -> Lae
            goto Lc4
        Lae:
            r0 = move-exception
            r12 = r0
            r6 = r12
            goto Lba
        Lb2:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r1, r12)     // Catch: java.lang.Exception -> Lae
            throw r0     // Catch: java.lang.Exception -> Lae
        Lba:
            r12 = 0
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r9 = 4
            r10 = 0
            r5 = 1
            r7 = 0
            com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.loge$default(r4, r5, r6, r7, r8, r9, r10)
        Lc4:
            kotlin.Unit r12 = kotlin.Unit.f143329a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.fetchAndStoreAppResponse(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void getAppResponse$core_defaultRelease$default(ConfigOperation configOperation, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        configOperation.getAppResponse$core_defaultRelease(z10, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.radiusnetworks.flybuy.api.model.AppInstanceResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.radiusnetworks.flybuy.api.model.AppInstanceResponse] */
    private final AppInstanceResponse readStoredAppResponse() {
        Object objB;
        File file = new File(this.applicationContext.getFilesDir(), SDK_CONFIG_FILENAME);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = SdkDefaultsKt.getDEFAULT_APP_RESPONSE();
        if (file.exists()) {
            LogExtensionsKt.logd(this, true, "Reading sdk config from local storage.");
            try {
                Result.Companion companion = Result.INSTANCE;
                ?? r02 = (AppInstanceResponse) new Gson().m(new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192), AppInstanceResponse.class);
                Intrinsics.i(r02, "let(...)");
                objectRef.f143742a = r02;
                objB = Result.b(Unit.f143329a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                LogExtensionsKt.loge$default(this, true, thE, null, new Object[0], 4, null);
            }
        } else {
            LogExtensionsKt.logd(this, true, "Cached SDK config not found. Using default...");
        }
        return (AppInstanceResponse) objectRef.f143742a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestUpdateAppInstance(String str, String str2, List<Long> list, Continuation<? super Boolean> continuation) {
        boolean z10;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        LogExtensionsKt.logd(this, true, "Push token or timezone changed. Updating app instance.\noldPushToken=" + this.storedPushToken + "\nnewPushToken=" + str + "\noldTimeZone=" + this.storedTimeZone + "\nnewTimeZone=" + str2 + "\npushTopicIds=" + list);
        do {
            ApiResponse<Void> apiResponseUpdateAppInstance = FlyBuyApi.updateAppInstance(str, str2, list);
            z10 = false;
            if (apiResponseUpdateAppInstance instanceof ApiEmptyResponse ? true : apiResponseUpdateAppInstance instanceof ApiSuccessResponse) {
                LogExtensionsKt.logd(this, true, "Saving new push token: " + str);
                PreferenceExtensionKt.setLastAppInstancePatchTime(this.applicationContext, System.currentTimeMillis());
                setStoredPushToken(str);
                setStoredTimeZone(str2);
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.b(Boxing.a(true)));
            } else if (!(apiResponseUpdateAppInstance instanceof ApiErrorResponse)) {
                Result.Companion companion2 = Result.INSTANCE;
                safeContinuation.resumeWith(Result.b(Boxing.a(false)));
            } else if (apiResponseUpdateAppInstance.getCode() == 410) {
                FlyBuyCore.INSTANCE.getAppInstanceManager$core_defaultRelease().rotateAppInstanceID();
                z10 = true;
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                safeContinuation.resumeWith(Result.b(Boxing.a(false)));
            }
        } while (z10);
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }

    private final void setStoredPushToken(String str) {
        this.storedPushToken = str;
        PreferenceExtensionKt.savePushToken(this.applicationContext, str);
    }

    private final void setStoredSubscribedPushTopics(Set<FlybuyPushTopic> set) {
        this.storedSubscribedPushTopics = set;
        PreferenceExtensionKt.setSubscribedPushTopics(this.applicationContext, set);
    }

    private final void setStoredTimeZone(String str) {
        this.storedTimeZone = str;
        PreferenceExtensionKt.saveTimeZone(this.applicationContext, str);
    }

    private final Set<FlybuyPushTopic> subscribeToPushTopics() {
        FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
        PushServiceType pushServiceType = flyBuyCore.getSdkConfig().getPushServiceType();
        if (pushServiceType == null) {
            LogExtensionsKt.logd(this, true, "subscribeToPushTopics: pushServiceType is null");
            return null;
        }
        List<FlybuyPushTopic> pushTopics = flyBuyCore.getSdkConfig().getPushTopics();
        if (pushTopics == null) {
            LogExtensionsKt.logd(this, true, "subscribeToPushTopics: pushTopics is null");
            return null;
        }
        PushTopicSubscriber airshipTopicSubscriber = this.pushTopicSubscriber;
        if (airshipTopicSubscriber == null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[pushServiceType.ordinal()];
            airshipTopicSubscriber = i10 != 1 ? i10 != 2 ? i10 != 3 ? null : new AirshipTopicSubscriber() : new OneSignalTopicSubscriber() : new FirebaseTopicSubscriber();
        }
        this.pushTopicSubscriber = airshipTopicSubscriber;
        if (airshipTopicSubscriber == null) {
            return null;
        }
        Set<FlybuyPushTopic> setO1 = CollectionsKt.o1(pushTopics);
        Set<FlybuyPushTopic> setE = this.storedSubscribedPushTopics;
        if (setE == null) {
            setE = SetsKt.e();
        }
        return airshipTopicSubscriber.subscribeToTopics(setO1, setE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r6.requestUpdateAppInstance(r10, r11, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAppInstance(java.lang.String r10, java.lang.String r11, boolean r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.updateAppInstance(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final void updateAppInstance$core_defaultRelease(String pushToken) {
        Intrinsics.j(pushToken, "pushToken");
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new C131431(pushToken, null), 3, null);
    }

    public final void getAppResponse$core_defaultRelease(boolean force, Function2<? super AppInstanceResponse, ? super SdkError, Unit> callback) {
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new ConfigOperation$getAppResponse$1(this, force, callback, null), 3, null);
    }

    public final void rotateAppInstanceId$core_defaultRelease() {
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new ConfigOperation$rotateAppInstanceId$1(this, null), 3, null);
    }
}
