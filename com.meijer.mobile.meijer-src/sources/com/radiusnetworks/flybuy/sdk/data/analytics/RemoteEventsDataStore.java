package com.radiusnetworks.flybuy.sdk.data.analytics;

import android.content.Context;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.AnalyticsEventsData;
import com.radiusnetworks.flybuy.api.network.common.ApiEmptyResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEvent;
import com.radiusnetworks.flybuy.sdk.data.room.domain.AnalyticsEventKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15800f0;
import mv.C15807j;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0016J \u0010\r\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/analytics/RemoteEventsDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/analytics/RemoteEventsRepository;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sendEvents", "", "events", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "callback", "Lkotlin/Function1;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "sync", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RemoteEventsDataStore implements RemoteEventsRepository {
    private static final int MAX_NUMBER_OF_EVENTS_TO_SEND = 20;
    private final Context applicationContext;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sendEvents$1", f = "RemoteEventsDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sendEvents$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEventsData $analyticsEventsData;
        final /* synthetic */ Function1<SdkError, Unit> $callback;
        final /* synthetic */ List<AnalyticsEvent> $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AnalyticsEventsData analyticsEventsData, List<AnalyticsEvent> list, Function1<? super SdkError, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$analyticsEventsData = analyticsEventsData;
            this.$events = list;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RemoteEventsDataStore.this.new AnonymousClass1(this.$analyticsEventsData, this.$events, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                Context context = RemoteEventsDataStore.this.applicationContext;
                final AnalyticsEventsData analyticsEventsData = this.$analyticsEventsData;
                Function0<ApiResponse<Void>> function0 = new Function0<ApiResponse<Void>>() { // from class: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.sendEvents.1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ApiResponse<Void> invoke() {
                        return FlyBuyApi.analyticsEvents(analyticsEventsData);
                    }
                };
                AnonymousClass2 anonymousClass2 = new Function1<Void, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.sendEvents.1.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Void it) {
                        Intrinsics.j(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
                        invoke2(r12);
                        return Unit.f143329a;
                    }
                };
                final RemoteEventsDataStore remoteEventsDataStore = RemoteEventsDataStore.this;
                final List<AnalyticsEvent> list = this.$events;
                Function1<ApiResponse<Unit>, Unit> function1 = new Function1<ApiResponse<Unit>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.sendEvents.1.3

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sendEvents$1$3$1", f = "RemoteEventsDataStore.kt", l = {}, m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sendEvents$1$3$1, reason: invalid class name and collision with other inner class name */
                    public static final class C19821 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
                        final /* synthetic */ List<AnalyticsEvent> $events;
                        int label;
                        final /* synthetic */ RemoteEventsDataStore this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C19821(RemoteEventsDataStore remoteEventsDataStore, List<AnalyticsEvent> list, Continuation<? super C19821> continuation) {
                            super(2, continuation);
                            this.this$0 = remoteEventsDataStore;
                            this.$events = list;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C19821(this.this$0, this.$events, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C19821) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.label == 0) {
                                ResultKt.b(obj);
                                AnalyticsEventsDao analyticsEventsDaoAnalyticsEventsDao$core_defaultRelease = AppDatabase.INSTANCE.getInstance(this.this$0.applicationContext).analyticsEventsDao$core_defaultRelease();
                                Iterator<T> it = this.$events.iterator();
                                while (it.hasNext()) {
                                    analyticsEventsDaoAnalyticsEventsDao$core_defaultRelease.deleteById(((AnalyticsEvent) it.next()).getGuid());
                                }
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Unit> apiResponse) throws InterruptedException {
                        invoke2(apiResponse);
                        return Unit.f143329a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ApiResponse<Unit> response) throws InterruptedException {
                        Intrinsics.j(response, "response");
                        if ((response instanceof ApiSuccessResponse) || (response instanceof ApiEmptyResponse)) {
                            C15807j.b(null, new C19821(remoteEventsDataStore, list, null), 1, null);
                        }
                    }
                };
                final Function1<SdkError, Unit> function12 = this.$callback;
                ApiExtensionsKt.executeApi(context, function0, anonymousClass2, function1, new Function2<Unit, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.sendEvents.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Unit unit, SdkError sdkError) {
                        invoke2(unit, sdkError);
                        return Unit.f143329a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Unit unit, SdkError sdkError) {
                        Function1<SdkError, Unit> function13 = function12;
                        if (function13 != null) {
                            function13.invoke(sdkError);
                        }
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sync$1", f = "RemoteEventsDataStore.kt", l = {l3.f93325e}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C131211 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<SdkError, Unit> $callback;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131211(Function1<? super SdkError, Unit> function1, Continuation<? super C131211> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131211 c131211 = RemoteEventsDataStore.this.new C131211(this.$callback, continuation);
            c131211.L$0 = obj;
            return c131211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C131211) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
        
            if (r9 != r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0068 A[PHI: r1 r3 r4 r5
          0x0068: PHI (r1v7 java.util.Iterator) = (r1v6 java.util.Iterator), (r1v8 java.util.Iterator) binds: [B:8:0x0030, B:17:0x00a5] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r3v2 com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore) = 
          (r3v1 com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore)
          (r3v3 com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore)
         binds: [B:8:0x0030, B:17:0x00a5] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r4v2 kotlin.jvm.functions.Function1) = (r4v1 kotlin.jvm.functions.Function1), (r4v3 kotlin.jvm.functions.Function1) binds: [B:8:0x0030, B:17:0x00a5] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r5v2 kotlin.jvm.internal.Ref$ObjectRef) = (r5v1 kotlin.jvm.internal.Ref$ObjectRef), (r5v3 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:8:0x0030, B:17:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r9v16, types: [T, com.radiusnetworks.flybuy.sdk.data.common.SdkError] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L30
                if (r1 != r2) goto L28
                java.lang.Object r1 = r8.L$5
                com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sync$1 r1 = (com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.C131211) r1
                java.lang.Object r1 = r8.L$4
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r8.L$3
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r8.L$2
                com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore r3 = (com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore) r3
                java.lang.Object r4 = r8.L$1
                kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                java.lang.Object r5 = r8.L$0
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
                kotlin.ResultKt.b(r9)
                goto La3
            L28:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L30:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.L$0
                mv.O r9 = (mv.InterfaceC15783O) r9
                java.lang.String r1 = "Sending analytics events..."
                com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt.logd(r9, r2, r1)
                com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase$Companion r9 = com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase.INSTANCE
                com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore r1 = com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.this
                android.content.Context r1 = com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.access$getApplicationContext$p(r1)
                com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase r9 = r9.getInstance(r1)
                com.radiusnetworks.flybuy.sdk.data.room.dao.AnalyticsEventsDao r9 = r9.analyticsEventsDao$core_defaultRelease()
                java.util.List r9 = r9.getEvents()
                r1 = 20
                java.util.List r9 = kotlin.collections.CollectionsKt.g0(r9, r1)
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                kotlin.jvm.functions.Function1<com.radiusnetworks.flybuy.sdk.data.common.SdkError, kotlin.Unit> r3 = r8.$callback
                com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore r4 = com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.this
                java.util.Iterator r9 = r9.iterator()
                r5 = r4
                r4 = r3
                r3 = r5
                r5 = r1
                r1 = r9
            L68:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto Laa
                java.lang.Object r9 = r1.next()
                java.util.List r9 = (java.util.List) r9
                r8.L$0 = r5
                r8.L$1 = r4
                r8.L$2 = r3
                r8.L$3 = r1
                r8.L$4 = r9
                r8.L$5 = r8
                r8.label = r2
                kotlin.coroutines.SafeContinuation r6 = new kotlin.coroutines.SafeContinuation
                kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r8)
                r6.<init>(r7)
                com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sync$1$1$1$error$1$1 r7 = new com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore$sync$1$1$1$error$1$1
                r7.<init>()
                r3.sendEvents(r9, r7)
                java.lang.Object r9 = r6.b()
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                if (r9 != r6) goto La0
                kotlin.coroutines.jvm.internal.DebugProbesKt.c(r8)
            La0:
                if (r9 != r0) goto La3
                return r0
            La3:
                com.radiusnetworks.flybuy.sdk.data.common.SdkError r9 = (com.radiusnetworks.flybuy.sdk.data.common.SdkError) r9
                if (r9 == 0) goto L68
                r5.f143742a = r9
                goto Lb1
            Laa:
                if (r4 == 0) goto Lb1
                T r9 = r5.f143742a
                r4.invoke(r9)
            Lb1:
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore.C131211.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public RemoteEventsDataStore(Context applicationContext) {
        Intrinsics.j(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsRepository
    public void sendEvents(List<AnalyticsEvent> events, Function1<? super SdkError, Unit> callback) {
        Intrinsics.j(events, "events");
        String string = FlyBuyCore.getAppInstanceID().toString();
        Intrinsics.i(string, "toString(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(events, 10));
        Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            arrayList.add(AnalyticsEventKt.toApiAnalyticsEvent((AnalyticsEvent) it.next()));
        }
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new AnonymousClass1(new AnalyticsEventsData(string, arrayList), events, callback, null), 3, null);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsRepository
    public void sync(Function1<? super SdkError, Unit> callback) {
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new C131211(callback, null), 3, null);
    }
}
