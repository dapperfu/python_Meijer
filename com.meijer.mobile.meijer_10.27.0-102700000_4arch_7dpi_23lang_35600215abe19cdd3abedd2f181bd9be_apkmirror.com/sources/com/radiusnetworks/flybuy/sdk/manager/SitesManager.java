package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.Pagination;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.error.ApiError;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.operations.RemoteSitesOperation;
import com.radiusnetworks.flybuy.sdk.data.operations.SitesOperation;
import com.radiusnetworks.flybuy.sdk.data.places.Place;
import com.radiusnetworks.flybuy.sdk.data.places.PlaceLocation;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import com.radiusnetworks.flybuy.sdk.data.site.LocalSitesDataStore;
import com.radiusnetworks.flybuy.sdk.data.site.PaginatedSites;
import com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesDataStore;
import com.radiusnetworks.flybuy.sdk.manager.builder.SiteOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0085\u0001\u0010\u0016\u001a\u00020\r2&\b\u0002\u0010\u000e\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\t2L\u0010\u0015\u001aH\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012)\u0012'\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017Jy\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00182\u0006\u0010\u0012\u001a\u00020\u000f2L\u0010\u0015\u001aH\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012)\u0012'\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\r0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJa\u0010 \u001a\u00020\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2.\b\u0002\u0010\u000e\u001a(\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u001eH\u0007¢\u0006\u0004\b \u0010!J=\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010#2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b%\u0010&J?\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0004\b%\u0010'JC\u0010 \u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010#2\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b \u0010*J]\u0010 \u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0004\b \u0010,JK\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\u0010$\u001a\u0004\u0018\u00010#2\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b1\u00102JM\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2&\b\u0002\u0010\u000e\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0016\u0010'R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R&\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0:8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u00108\u001a\u0004\b;\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/SitesManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/radiusnetworks/flybuy/sdk/data/operations/SitesOperation;", "getSitesOperation", "()Lcom/radiusnetworks/flybuy/sdk/data/operations/SitesOperation;", "Lkotlin/Function2;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "callback", "", "Lkotlin/ParameterName;", "name", "page", "Lcom/radiusnetworks/flybuy/sdk/data/site/PaginatedSites;", "fetchCallback", "fetchMethod", "fetchAll", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Pair;", "blockingFetch", "(ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "query", "operationalStatus", "Lkotlin/Function3;", "Lcom/radiusnetworks/flybuy/sdk/data/common/Pagination;", "fetch", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "partnerIdentifier", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions;", "options", "fetchByPartnerIdentifier", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "region", "(Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;Lcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions;Lkotlin/jvm/functions/Function2;)V", "per", "(Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "place", "", "radius", "fetchNear", "(Lcom/radiusnetworks/flybuy/sdk/data/places/Place;FLcom/radiusnetworks/flybuy/sdk/manager/builder/SiteOptions;Lkotlin/jvm/functions/Function2;)V", "applicationContext", "Landroid/content/Context;", "getAll", "()Ljava/util/List;", "getAll$annotations", "()V", "all", "Landroidx/lifecycle/A;", "getAllLiveData", "()Landroidx/lifecycle/A;", "getAllLiveData$annotations", "allLiveData", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SitesManager {
    public static final String DEFAULT_OPERATIONAL_STATUS = "live";
    private final Context applicationContext;
    private static final ApiError ERROR_SITE_NOT_FOUND = new ApiError(HttpResponseStatus.ERROR_NOT_FOUND, MapsKt.g(new Pair("not_found", CollectionsKt.e("Site not found"))));

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.manager.SitesManager", f = "SitesManager.kt", l = {HttpResponseStatus.REDIRECTION_USE_PROXY}, m = "blockingFetch")
    /* renamed from: com.radiusnetworks.flybuy.sdk.manager.SitesManager$blockingFetch$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SitesManager.this.blockingFetch(0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.manager.SitesManager$fetchAll$2", f = "SitesManager.kt", l = {272}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.radiusnetworks.flybuy.sdk.manager.SitesManager$fetchAll$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<List<Site>, SdkError, Unit> $callback;
        final /* synthetic */ Function2<Integer, Function2<? super PaginatedSites, ? super SdkError, Unit>, Unit> $fetchMethod;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super Integer, ? super Function2<? super PaginatedSites, ? super SdkError, Unit>, Unit> function2, Function2<? super List<Site>, ? super SdkError, Unit> function22, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$fetchMethod = function2;
            this.$callback = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SitesManager.this.new AnonymousClass2(this.$fetchMethod, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:6:0x0028, B:17:0x0075, B:19:0x007e, B:33:0x00c3, B:14:0x005c, B:37:0x00cb, B:38:0x00cf, B:20:0x0088, B:22:0x0090, B:26:0x00ac, B:28:0x00b0, B:29:0x00bb, B:32:0x00c1, B:13:0x0040), top: B:43:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:6:0x0028, B:17:0x0075, B:19:0x007e, B:33:0x00c3, B:14:0x005c, B:37:0x00cb, B:38:0x00cf, B:20:0x0088, B:22:0x0090, B:26:0x00ac, B:28:0x00b0, B:29:0x00bb, B:32:0x00c1, B:13:0x0040), top: B:43:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0072 -> B:17:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.manager.SitesManager.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetch$default(SitesManager sitesManager, String str, Integer num, String str2, Function3 function3, int i10, Object obj) throws Exception {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str2 = "live";
        }
        if ((i10 & 8) != 0) {
            function3 = null;
        }
        sitesManager.fetch(str, num, str2, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAll$default(SitesManager sitesManager, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = "live";
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        sitesManager.fetchAll(str, str2, function2);
    }

    @Deprecated
    public static /* synthetic */ void getAll$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getAllLiveData$annotations() {
    }

    @Deprecated
    public final void fetch(String query, Integer page, String operationalStatus, final Function3<? super List<Site>, ? super Pagination, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(operationalStatus, "operationalStatus");
        try {
            getSitesOperation().fetch(query, page, null, operationalStatus, null, new Function2<PaginatedSites, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.SitesManager$fetch$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PaginatedSites paginatedSites, SdkError sdkError) {
                    invoke2(paginatedSites, sdkError);
                    return Unit.f142422a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public void invoke2(PaginatedSites paginatedSites, SdkError sdkError) {
                    Function3<List<Site>, Pagination, SdkError, Unit> function3 = callback;
                    if (function3 != null) {
                        function3.invoke(paginatedSites != null ? paginatedSites.getSites() : null, paginatedSites != null ? paginatedSites.getPagination() : null, sdkError);
                    }
                }
            });
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    @Deprecated
    public final void fetchAll(final String query, final String operationalStatus, Function2<? super List<Site>, ? super SdkError, Unit> callback) {
        Intrinsics.j(operationalStatus, "operationalStatus");
        fetchAll(callback, new Function2<Integer, Function2<? super PaginatedSites, ? super SdkError, ? extends Unit>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.SitesManager.fetchAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Function2<? super PaginatedSites, ? super SdkError, ? extends Unit> function2) {
                invoke(num.intValue(), (Function2<? super PaginatedSites, ? super SdkError, Unit>) function2);
                return Unit.f142422a;
            }

            public final void invoke(int i10, Function2<? super PaginatedSites, ? super SdkError, Unit> fetchCallback) {
                Intrinsics.j(fetchCallback, "fetchCallback");
                SitesManager.this.getSitesOperation().fetch(query, Integer.valueOf(i10), null, operationalStatus, null, fetchCallback);
            }
        });
    }

    public final void fetchByPartnerIdentifier(final String partnerIdentifier, final SiteOptions options, final Function2<? super Site, ? super SdkError, Unit> callback) {
        Intrinsics.j(partnerIdentifier, "partnerIdentifier");
        Intrinsics.j(callback, "callback");
        try {
            if (StringsKt.r0(partnerIdentifier)) {
                callback.invoke(null, ERROR_SITE_NOT_FOUND);
            }
            fetchAll(new Function2<List<? extends Site>, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.SitesManager$fetchByPartnerIdentifier$1$fetchAllCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Site> list, SdkError sdkError) {
                    invoke2((List<Site>) list, sdkError);
                    return Unit.f142422a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Site> list, SdkError sdkError) {
                    Site site;
                    Object next;
                    if (sdkError != null) {
                        callback.invoke(null, sdkError);
                        return;
                    }
                    if (list != null) {
                        String str = partnerIdentifier;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (Intrinsics.e(((Site) next).getPartnerIdentifier(), str)) {
                                    break;
                                }
                            }
                        }
                        site = (Site) next;
                    } else {
                        site = null;
                    }
                    if (site == null) {
                        callback.invoke(null, SitesManager.ERROR_SITE_NOT_FOUND);
                    } else {
                        callback.invoke(site, null);
                    }
                }
            }, new Function2<Integer, Function2<? super PaginatedSites, ? super SdkError, ? extends Unit>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.SitesManager$fetchByPartnerIdentifier$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Function2<? super PaginatedSites, ? super SdkError, ? extends Unit> function2) {
                    invoke(num.intValue(), (Function2<? super PaginatedSites, ? super SdkError, Unit>) function2);
                    return Unit.f142422a;
                }

                public final void invoke(int i10, Function2<? super PaginatedSites, ? super SdkError, Unit> fetchCallback) {
                    String operationalStatus;
                    Intrinsics.j(fetchCallback, "fetchCallback");
                    SitesOperation sitesOperation = this.this$0.getSitesOperation();
                    String str = partnerIdentifier;
                    Integer numValueOf = Integer.valueOf(i10);
                    SiteOptions siteOptions = options;
                    if (siteOptions == null || (operationalStatus = siteOptions.getOperationalStatus()) == null) {
                        operationalStatus = "live";
                    }
                    sitesOperation.fetch(str, numValueOf, null, operationalStatus, Boolean.TRUE, fetchCallback);
                }
            });
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public SitesManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object blockingFetch(int r5, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.jvm.functions.Function2<? super com.radiusnetworks.flybuy.sdk.data.site.PaginatedSites, ? super com.radiusnetworks.flybuy.sdk.data.common.SdkError, kotlin.Unit>, kotlin.Unit> r6, kotlin.coroutines.Continuation<? super kotlin.Pair<com.radiusnetworks.flybuy.sdk.data.site.PaginatedSites, ? extends com.radiusnetworks.flybuy.sdk.data.common.SdkError>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.radiusnetworks.flybuy.sdk.manager.SitesManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.radiusnetworks.flybuy.sdk.manager.SitesManager$blockingFetch$1 r0 = (com.radiusnetworks.flybuy.sdk.manager.SitesManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.manager.SitesManager$blockingFetch$1 r0 = new com.radiusnetworks.flybuy.sdk.manager.SitesManager$blockingFetch$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            kotlin.ResultKt.b(r7)
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r7)
            r0.L$0 = r6
            r0.I$0 = r5
            r0.label = r3
            kotlin.coroutines.SafeContinuation r7 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r7.<init>(r2)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.d(r5)
            com.radiusnetworks.flybuy.sdk.manager.SitesManager$blockingFetch$pair$1$1 r2 = new com.radiusnetworks.flybuy.sdk.manager.SitesManager$blockingFetch$pair$1$1
            r2.<init>()
            r6.invoke(r5, r2)
            java.lang.Object r7 = r7.b()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r7 != r5) goto L60
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L60:
            if (r7 != r1) goto L63
            return r1
        L63:
            kotlin.Pair r7 = (kotlin.Pair) r7
            if (r7 != 0) goto L6e
            kotlin.Pair r5 = new kotlin.Pair
            r6 = 0
            r5.<init>(r6, r6)
            return r5
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.manager.SitesManager.blockingFetch(int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void fetch$default(SitesManager sitesManager, CircularRegion circularRegion, Integer num, Integer num2, String str, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            str = "live";
        }
        sitesManager.fetch(circularRegion, num, num2, str, function2);
    }

    private final void fetchAll(Function2<? super List<Site>, ? super SdkError, Unit> callback, Function2<? super Integer, ? super Function2<? super PaginatedSites, ? super SdkError, Unit>, Unit> fetchMethod) {
        C16648k.d(C16623P.a(C16639f0.a()), null, null, new AnonymousClass2(fetchMethod, callback, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAll$default(SitesManager sitesManager, Function2 function2, Function2 function22, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function2 = null;
        }
        sitesManager.fetchAll(function2, function22);
    }

    public static /* synthetic */ void fetchByPartnerIdentifier$default(SitesManager sitesManager, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "live";
        }
        sitesManager.fetchByPartnerIdentifier(str, str2, (Function2<? super Site, ? super SdkError, Unit>) function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SitesOperation getSitesOperation() {
        Context context = this.applicationContext;
        Intrinsics.j(context, "context");
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        LocalSitesDataStore localSitesRepository = new LocalSitesDataStore(companion.getInstance(applicationContext));
        Context context2 = this.applicationContext;
        Intrinsics.j(context2, "context");
        Context applicationContext2 = context2.getApplicationContext();
        Intrinsics.i(applicationContext2, "getApplicationContext(...)");
        RemoteSitesDataStore remoteSitesRepository = new RemoteSitesDataStore(applicationContext2);
        Intrinsics.j(localSitesRepository, "localSitesRepository");
        Intrinsics.j(remoteSitesRepository, "remoteSitesRepository");
        return new SitesOperation(localSitesRepository, new RemoteSitesOperation(remoteSitesRepository));
    }

    public final void fetchNear(Place place, final float radius, final SiteOptions options, final Function2<? super List<Site>, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(place, "place");
        Intrinsics.j(callback, "callback");
        try {
            FlyBuyCore.getPlaces().retrieve(place, new Function2<PlaceLocation, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.SitesManager$fetchNear$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PlaceLocation placeLocation, SdkError sdkError) throws Exception {
                    invoke2(placeLocation, sdkError);
                    return Unit.f142422a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PlaceLocation placeLocation, SdkError sdkError) throws Exception {
                    if (sdkError != null || placeLocation == null) {
                        callback.invoke(null, sdkError);
                    } else {
                        this.fetch(new CircularRegion(placeLocation.getLatitude(), placeLocation.getLongitude(), radius), options, callback);
                    }
                }
            });
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final List<Site> getAll() throws Exception {
        try {
            return getSitesOperation().getAll();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final AbstractC5985A<List<Site>> getAllLiveData() throws Exception {
        try {
            return getSitesOperation().getAllLiveData();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void fetch(CircularRegion region, SiteOptions options, final Function2<? super List<Site>, ? super SdkError, Unit> callback) throws Exception {
        String operationalStatus;
        Intrinsics.j(region, "region");
        Intrinsics.j(callback, "callback");
        try {
            SitesOperation sitesOperation = getSitesOperation();
            Integer page = options != null ? options.getPage() : null;
            Integer per = options != null ? options.getPer() : null;
            if (options == null || (operationalStatus = options.getOperationalStatus()) == null) {
                operationalStatus = "live";
            }
            sitesOperation.fetch(region, page, per, operationalStatus, new Function2<PaginatedSites, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.SitesManager$fetch$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PaginatedSites paginatedSites, SdkError sdkError) {
                    invoke2(paginatedSites, sdkError);
                    return Unit.f142422a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public void invoke2(PaginatedSites paginatedSites, SdkError sdkError) {
                    callback.invoke(paginatedSites != null ? paginatedSites.getSites() : null, sdkError);
                }
            });
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    @Deprecated
    public final void fetchByPartnerIdentifier(String partnerIdentifier, String operationalStatus, Function2<? super Site, ? super SdkError, Unit> callback) {
        Intrinsics.j(partnerIdentifier, "partnerIdentifier");
        Intrinsics.j(operationalStatus, "operationalStatus");
        Intrinsics.j(callback, "callback");
        fetchByPartnerIdentifier(partnerIdentifier, new SiteOptions.Builder().setOperationalStatus(operationalStatus).build(), callback);
    }

    @Deprecated
    public final void fetch(CircularRegion region, Integer page, Integer per, String operationalStatus, Function2<? super List<Site>, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(region, "region");
        Intrinsics.j(operationalStatus, "operationalStatus");
        Intrinsics.j(callback, "callback");
        fetch(region, new SiteOptions.Builder().setOperationalStatus(operationalStatus).setPage(page).setPer(per).build(), callback);
    }
}
