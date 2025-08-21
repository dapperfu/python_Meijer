package com.radiusnetworks.flybuy.sdk.data.operations;

import O4.C4356d;
import O4.EnumC4353a;
import O4.EnumC4361i;
import O4.EnumC4374w;
import O4.O;
import O4.y;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.analytics.LocalEventsRepository;
import com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsRepository;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.sync.AnalyticsSyncWorker;
import j$.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J?\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015JO\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\b2\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\b0\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/AnalyticsEventOperation;", "", "localEventsRepository", "Lcom/radiusnetworks/flybuy/sdk/data/analytics/LocalEventsRepository;", "remoteEventsRepository", "Lcom/radiusnetworks/flybuy/sdk/data/analytics/RemoteEventsRepository;", "(Lcom/radiusnetworks/flybuy/sdk/data/analytics/LocalEventsRepository;Lcom/radiusnetworks/flybuy/sdk/data/analytics/RemoteEventsRepository;)V", "enqueueAnalyticsWorker", "", "enqueueWorker", "queueEvent", "event", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "sendEvent", "eventName", "", "projectId", "", "orderId", "promotionId", "siteId", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "data", "", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "sendQueuedEvents", "callback", "Lkotlin/Function1;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AnalyticsEventOperation {
    private static final long ANALYTICS_SYNC_BACKOFF_DELAY_SECONDS = 30;
    private static final long ANALYTICS_SYNC_DELAY_SECONDS = 10;
    private static final String ANALYTICS_SYNC_WORK_NAME = "FLYBUY_ANALYTICS_SYNC_WORK";
    private final LocalEventsRepository localEventsRepository;
    private final RemoteEventsRepository remoteEventsRepository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.AnalyticsEventOperation$queueEvent$1", f = "AnalyticsEventOperation.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.AnalyticsEventOperation$queueEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnalyticsEvent analyticsEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = analyticsEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalyticsEventOperation.this.new AnonymousClass1(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                LocalEventsRepository localEventsRepository = AnalyticsEventOperation.this.localEventsRepository;
                AnalyticsEvent analyticsEvent = this.$event;
                this.label = 1;
                if (localEventsRepository.add(analyticsEvent, this) == objF) {
                    return objF;
                }
            }
            AnalyticsEventOperation.this.enqueueAnalyticsWorker();
            return Unit.f143329a;
        }
    }

    private final void enqueueWorker() {
        LogExtensionsKt.logd(this, true, "Notify enqueueing analytics worker...");
        C4356d c4356dA = new C4356d.a().b(EnumC4374w.CONNECTED).a();
        y.a aVar = new y.a(AnalyticsSyncWorker.class);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        O.INSTANCE.a(FlyBuyCore.INSTANCE.getApplicationContext$core_defaultRelease()).f(ANALYTICS_SYNC_WORK_NAME, EnumC4361i.REPLACE, aVar.l(ANALYTICS_SYNC_DELAY_SECONDS, timeUnit).j(c4356dA).i(EnumC4353a.EXPONENTIAL, ANALYTICS_SYNC_BACKOFF_DELAY_SECONDS, timeUnit).a(ANALYTICS_SYNC_WORK_NAME).b());
    }

    private final void sendEvent(String eventName, int projectId, Integer orderId, Integer promotionId, Integer siteId, Map<String, String> data) {
        String string = UUID.randomUUID().toString();
        Intrinsics.i(string, "toString(...)");
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        Intrinsics.i(offsetDateTimeNow, "now(...)");
        queueEvent(new AnalyticsEvent(string, eventName, offsetDateTimeNow, projectId, orderId, promotionId, null, siteId, data, 64, null));
    }

    public AnalyticsEventOperation(LocalEventsRepository localEventsRepository, RemoteEventsRepository remoteEventsRepository) {
        Intrinsics.j(localEventsRepository, "localEventsRepository");
        Intrinsics.j(remoteEventsRepository, "remoteEventsRepository");
        this.localEventsRepository = localEventsRepository;
        this.remoteEventsRepository = remoteEventsRepository;
    }

    public static /* synthetic */ void sendEvent$default(AnalyticsEventOperation analyticsEventOperation, String str, int i10, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            num2 = null;
        }
        if ((i11 & 16) != 0) {
            num3 = null;
        }
        analyticsEventOperation.sendEvent(str, i10, num, num2, num3);
    }

    public final void sendQueuedEvents(final Function1<? super SdkError, Unit> callback) {
        Intrinsics.j(callback, "callback");
        this.remoteEventsRepository.sync(new Function1<SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.operations.AnalyticsEventOperation.sendQueuedEvents.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SdkError sdkError) {
                invoke2(sdkError);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SdkError sdkError) {
                callback.invoke(sdkError);
            }
        });
    }

    private final void queueEvent(AnalyticsEvent event) {
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new AnonymousClass1(event, null), 3, null);
    }

    public final void enqueueAnalyticsWorker() {
        enqueueWorker();
    }

    public final void sendEvent(String eventName, int projectId, Integer orderId, Integer promotionId, Integer siteId) {
        Intrinsics.j(eventName, "eventName");
        sendEvent(eventName, projectId, orderId, promotionId, siteId, MapsKt.g(TuplesKt.a("channel", "app")));
    }
}
