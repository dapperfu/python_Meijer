package com.meijer.mobile.serverapi.rxjava.observables.reward;

import Zq.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pk.GasStationAmenity;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/observables/reward/FetchGasStationAndRewardsCall;", "", "LZq/b;", "storeInfoRepository", "<init>", "(LZq/b;)V", "", "storeId", "Lcom/meijer/mobile/serverapi/response/gasstation/GasStationAndRewardsResponse;", "call", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZq/b;", "Companion", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FetchGasStationAndRewardsCall {
    private final b storeInfoRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<GasStationAmenity> gasStationAmenities = CollectionsKt.p(new GasStationAmenity("Propane"), new GasStationAmenity("Ice"), new GasStationAmenity("Tobacco Products"), new GasStationAmenity("WEX Fleet Cards"), new GasStationAmenity("Public Restrooms"), new GasStationAmenity("ATM"), new GasStationAmenity("Lotto"), new GasStationAmenity("Gift Cards"));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/observables/reward/FetchGasStationAndRewardsCall$Companion;", "", "<init>", "()V", "", "Lpk/d;", "gasStationAmenities", "Ljava/util/List;", "getGasStationAmenities", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<GasStationAmenity> getGasStationAmenities() {
            return FetchGasStationAndRewardsCall.gasStationAmenities;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall", f = "FetchGasStationAndRewardsCall.kt", l = {18}, m = "call")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f117650a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f117651b;

        /* renamed from: d, reason: collision with root package name */
        int f117653d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f117651b = obj;
            this.f117653d |= Integer.MIN_VALUE;
            return FetchGasStationAndRewardsCall.this.call(0, this);
        }
    }

    public FetchGasStationAndRewardsCall(b storeInfoRepository) {
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        this.storeInfoRepository = storeInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(int r5, kotlin.coroutines.Continuation<? super com.meijer.mobile.serverapi.response.gasstation.GasStationAndRewardsResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall.a
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall$a r0 = (com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall.a) r0
            int r1 = r0.f117653d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117653d = r1
            goto L18
        L13:
            com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall$a r0 = new com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f117651b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f117653d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            Zq.b r6 = r4.storeInfoRepository
            r0.f117650a = r5
            r0.f117653d = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.meijer.mobile.storeinfo.api.model.StoreInfo r6 = (com.meijer.mobile.storeinfo.api.model.StoreInfo) r6
            com.meijer.mobile.serverapi.response.gasstation.GasStationAmenitiesResponse r5 = new com.meijer.mobile.serverapi.response.gasstation.GasStationAmenitiesResponse
            java.util.List<pk.d> r0 = com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall.gasStationAmenities
            r5.<init>(r0)
            com.meijer.mobile.serverapi.response.gasstation.GasStationAndRewardsResponse r0 = new com.meijer.mobile.serverapi.response.gasstation.GasStationAndRewardsResponse
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall.call(int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
