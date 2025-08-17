package com.radiusnetworks.flybuy.sdk.data.operations;

import Av.a;
import Av.g;
import android.content.Context;
import com.google.gson.Gson;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.AppResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiEmptyResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiErrorResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt;
import com.radiusnetworks.flybuy.sdk.logging.FlyBuyLogging;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt;
import j$.time.Clock;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
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
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010$\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u001e\u0010!\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\r\u0018\u00010\u001fH\u0000¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R$\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\"\u0004\b2\u0010\u001bR$\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b3\u00101\"\u0004\b4\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/ConfigOperation;", "", "Landroid/content/Context;", "context", "j$/time/Clock", "clock", "<init>", "(Landroid/content/Context;Lj$/time/Clock;)V", "", "pushToken", "timeZone", "", "rotateAppInstance", "", "updateAppInstance", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestUpdateAppInstance", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "force", "Lcom/radiusnetworks/flybuy/api/model/AppResponse;", "checkAppResponseCacheOrFetch", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndStoreAppResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readStoredAppResponse", "()Lcom/radiusnetworks/flybuy/api/model/AppResponse;", "updateAppInstance$core_defaultRelease", "(Ljava/lang/String;)V", "rotateAppInstanceId$core_defaultRelease", "()V", "rotateAppInstanceId", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "callback", "getAppResponse$core_defaultRelease", "(ZLkotlin/jvm/functions/Function2;)V", "getAppResponse", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "LAv/a;", "appInstanceMutex", "LAv/a;", "value", "storedPushToken", "Ljava/lang/String;", "setStoredPushToken", "storedTimeZone", "setStoredTimeZone", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ConfigOperation {
    private static final String SDK_CONFIG_FILENAME = "flybuy_sdk_config.json";
    private final a appInstanceMutex;
    private final Context applicationContext;
    private final Clock clock;
    private String storedPushToken;
    private String storedTimeZone;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation", f = "ConfigOperation.kt", l = {132}, m = "checkAppResponseCacheOrFetch")
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
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation", f = "ConfigOperation.kt", l = {143}, m = "fetchAndStoreAppResponse")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C130091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C130091(Continuation<? super C130091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigOperation.this.fetchAndStoreAppResponse(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$1", f = "ConfigOperation.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$1, reason: invalid class name and case insensitive filesystem */
    public static final class C130101 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $pushToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130101(String str, Continuation<? super C130101> continuation) {
            super(2, continuation);
            this.$pushToken = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfigOperation.this.new C130101(this.$pushToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C130101) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation", f = "ConfigOperation.kt", l = {193, 75}, m = "updateAppInstance")
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, com.radiusnetworks.flybuy.api.model.AppResponse] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.radiusnetworks.flybuy.api.model.AppResponse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkAppResponseCacheOrFetch(boolean r10, kotlin.coroutines.Continuation<? super com.radiusnetworks.flybuy.api.model.AppResponse> r11) {
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
            com.radiusnetworks.flybuy.api.model.AppResponse r2 = com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt.getDEFAULT_APP_RESPONSE()
            r11.f142835a = r2
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
            com.radiusnetworks.flybuy.api.model.AppResponse r10 = r10.readStoredAppResponse()     // Catch: java.lang.Throwable -> L36
            r1.f142835a = r10     // Catch: java.lang.Throwable -> L36
            kotlin.Unit r10 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L36
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
            T r10 = r1.f142835a
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
    public final java.lang.Object fetchAndStoreAppResponse(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.C130091
            if (r0 == 0) goto L13
            r0 = r9
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1 r0 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.C130091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1 r0 = new com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation r0 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation) r0
            kotlin.ResultKt.b(r9)
            r1 = r0
            goto L50
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            kotlin.ResultKt.b(r9)
            java.lang.String r9 = "Retrieving sdk config and storing in flybuy_sdk_config.json"
            com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.logd(r8, r3, r9)
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1 r9 = new kotlin.jvm.functions.Function0<com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1
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
                public final com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppResponse> invoke() {
                    /*
                        r1 = this;
                        com.radiusnetworks.flybuy.api.network.common.ApiResponse r0 = com.radiusnetworks.flybuy.api.FlyBuyApi.getAppData()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1.invoke():com.radiusnetworks.flybuy.api.network.common.ApiResponse");
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppResponse> invoke() {
                    /*
                        r1 = this;
                        com.radiusnetworks.flybuy.api.network.common.ApiResponse r0 = r1.invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$1.invoke():java.lang.Object");
                }
            }
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2 r2 = new kotlin.jvm.functions.Function1<com.radiusnetworks.flybuy.api.model.AppResponse, com.radiusnetworks.flybuy.api.model.AppResponse>() { // from class: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2
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
                public final com.radiusnetworks.flybuy.api.model.AppResponse invoke(com.radiusnetworks.flybuy.api.model.AppResponse r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.j(r2, r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2.invoke(com.radiusnetworks.flybuy.api.model.AppResponse):com.radiusnetworks.flybuy.api.model.AppResponse");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ com.radiusnetworks.flybuy.api.model.AppResponse invoke(com.radiusnetworks.flybuy.api.model.AppResponse r1) {
                    /*
                        r0 = this;
                        com.radiusnetworks.flybuy.api.model.AppResponse r1 = (com.radiusnetworks.flybuy.api.model.AppResponse) r1
                        com.radiusnetworks.flybuy.api.model.AppResponse r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3 r4 = new kotlin.jvm.functions.Function1<com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppResponse>, kotlin.Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3
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
                public final void invoke2(com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppResponse> r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.j(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3.invoke2(com.radiusnetworks.flybuy.api.network.common.ApiResponse):void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.radiusnetworks.flybuy.api.network.common.ApiResponse<com.radiusnetworks.flybuy.api.model.AppResponse> r1) {
                    /*
                        r0 = this;
                        com.radiusnetworks.flybuy.api.network.common.ApiResponse r1 = (com.radiusnetworks.flybuy.api.network.common.ApiResponse) r1
                        r0.invoke2(r1)
                        kotlin.Unit r1 = kotlin.Unit.f142422a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$fetchAndStoreAppResponse$pair$3.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt.invokeApi(r9, r2, r4, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r1 = r8
        L50:
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r9 = r9.c()
            com.radiusnetworks.flybuy.api.network.common.ApiResponse r9 = (com.radiusnetworks.flybuy.api.network.common.ApiResponse) r9
            if (r9 == 0) goto Lbf
            boolean r0 = r9 instanceof com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse
            if (r0 == 0) goto Lbf
            android.content.Context r0 = r1.applicationContext
            r2 = r9
            com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse r2 = (com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse) r2
            java.lang.Object r2 = r2.getBody()
            com.radiusnetworks.flybuy.api.model.AppResponse r2 = (com.radiusnetworks.flybuy.api.model.AppResponse) r2
            long r2 = r2.getMinSyncIntervalSeconds()
            com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt.setConfigMinRequestInterval(r0, r2)
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r1.applicationContext
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "flybuy_sdk_config.json"
            r0.<init>(r2, r3)
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Exception -> La9
            r2.<init>()     // Catch: java.lang.Exception -> La9
            com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse r9 = (com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse) r9     // Catch: java.lang.Exception -> La9
            java.lang.Object r9 = r9.getBody()     // Catch: java.lang.Exception -> La9
            java.lang.String r9 = r2.x(r9)     // Catch: java.lang.Exception -> La9
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> La9
            r2.<init>(r0)     // Catch: java.lang.Exception -> La9
            kotlin.jvm.internal.Intrinsics.g(r9)     // Catch: java.lang.Throwable -> Lad
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> Lad
            byte[] r9 = r9.getBytes(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)     // Catch: java.lang.Throwable -> Lad
            r2.write(r9)     // Catch: java.lang.Throwable -> Lad
            kotlin.Unit r9 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> Lad
            r9 = 0
            kotlin.io.CloseableKt.a(r2, r9)     // Catch: java.lang.Exception -> La9
            goto Lbf
        La9:
            r0 = move-exception
            r9 = r0
            r3 = r9
            goto Lb5
        Lad:
            r0 = move-exception
            r9 = r0
            throw r9     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r2, r9)     // Catch: java.lang.Exception -> La9
            throw r0     // Catch: java.lang.Exception -> La9
        Lb5:
            r9 = 0
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r6 = 4
            r7 = 0
            r2 = 1
            r4 = 0
            com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.loge$default(r1, r2, r3, r4, r5, r6, r7)
        Lbf:
            kotlin.Unit r9 = kotlin.Unit.f142422a
            return r9
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
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.radiusnetworks.flybuy.api.model.AppResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.radiusnetworks.flybuy.api.model.AppResponse] */
    private final AppResponse readStoredAppResponse() {
        Object objB;
        File file = new File(this.applicationContext.getFilesDir(), SDK_CONFIG_FILENAME);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f142835a = SdkDefaultsKt.getDEFAULT_APP_RESPONSE();
        if (file.exists()) {
            LogExtensionsKt.logd(this, true, "Reading sdk config from local storage.");
            try {
                Result.Companion companion = Result.INSTANCE;
                ?? r02 = (AppResponse) new Gson().m(new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192), AppResponse.class);
                Intrinsics.i(r02, "let(...)");
                objectRef.f142835a = r02;
                objB = Result.b(Unit.f142422a);
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
        return (AppResponse) objectRef.f142835a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestUpdateAppInstance(String str, String str2, Continuation<? super Boolean> continuation) {
        boolean z10;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        LogExtensionsKt.logd(FlyBuyLogging.INSTANCE, true, "Push token or timezone changed. Updating app instance.\noldPushToken=" + this.storedPushToken + "\nnewPushToken=" + str + "\noldTimeZone=" + this.storedTimeZone + "\nnewTimeZone=" + str2);
        do {
            ApiResponse<Void> apiResponseUpdateAppInstance = FlyBuyApi.updateAppInstance(str, str2);
            z10 = false;
            if (apiResponseUpdateAppInstance instanceof ApiEmptyResponse ? true : apiResponseUpdateAppInstance instanceof ApiSuccessResponse) {
                LogExtensionsKt.logd(FlyBuyLogging.INSTANCE, true, "Saving new push token: " + str);
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

    private final void setStoredTimeZone(String str) {
        this.storedTimeZone = str;
        PreferenceExtensionKt.saveTimeZone(this.applicationContext, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r4.requestUpdateAppInstance(r7, r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:25:0x006f, B:27:0x0077, B:32:0x0082), top: B:43:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAppInstance(java.lang.String r7, java.lang.String r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r10
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$2 r0 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$2 r0 = new com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation$updateAppInstance$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L54
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$0
            Av.a r7 = (Av.a) r7
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L94
        L31:
            r8 = move-exception
            goto L9c
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$3
            Av.a r7 = (Av.a) r7
            java.lang.Object r8 = r0.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation r4 = (com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation) r4
            kotlin.ResultKt.b(r10)
            r10 = r7
            r7 = r2
            goto L6d
        L54:
            kotlin.ResultKt.b(r10)
            Av.a r10 = r6.appInstanceMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r10
            r0.Z$0 = r9
            r0.label = r4
            java.lang.Object r2 = r10.g(r5, r0)
            if (r2 != r1) goto L6c
            goto L92
        L6c:
            r4 = r6
        L6d:
            if (r9 != 0) goto L82
            java.lang.String r9 = r4.storedPushToken     // Catch: java.lang.Throwable -> L80
            boolean r9 = kotlin.jvm.internal.Intrinsics.e(r7, r9)     // Catch: java.lang.Throwable -> L80
            if (r9 == 0) goto L82
            java.lang.String r9 = r4.storedTimeZone     // Catch: java.lang.Throwable -> L80
            boolean r9 = kotlin.jvm.internal.Intrinsics.e(r8, r9)     // Catch: java.lang.Throwable -> L80
            if (r9 != 0) goto L93
            goto L82
        L80:
            r7 = move-exception
            goto L9e
        L82:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L80
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L80
            r0.L$3 = r5     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r7 = r4.requestUpdateAppInstance(r7, r8, r0)     // Catch: java.lang.Throwable -> L80
            if (r7 != r1) goto L93
        L92:
            return r1
        L93:
            r7 = r10
        L94:
            kotlin.Unit r8 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L31
            r7.h(r5)
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        L9c:
            r10 = r7
            goto L9f
        L9e:
            r8 = r7
        L9f:
            r10.h(r5)
            throw r8
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
        C16648k.d(C16623P.a(C16639f0.b()), null, null, new C130101(pushToken, null), 3, null);
    }

    public final void getAppResponse$core_defaultRelease(boolean force, Function2<? super AppResponse, ? super SdkError, Unit> callback) {
        C16648k.d(C16623P.a(C16639f0.b()), null, null, new ConfigOperation$getAppResponse$1(this, force, callback, null), 3, null);
    }

    public final void rotateAppInstanceId$core_defaultRelease() {
        C16648k.d(C16623P.a(C16639f0.b()), null, null, new ConfigOperation$rotateAppInstanceId$1(this, null), 3, null);
    }
}
