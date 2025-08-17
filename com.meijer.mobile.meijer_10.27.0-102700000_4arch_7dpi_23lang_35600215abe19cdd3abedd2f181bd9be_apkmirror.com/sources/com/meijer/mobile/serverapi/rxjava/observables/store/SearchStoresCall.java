package com.meijer.mobile.serverapi.rxjava.observables.store;

import Zq.b;
import com.meijer.mobile.storeinfo.api.model.Store;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ok.i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JZ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006\""}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "", "LZq/b;", "storeInfoRepository", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/GeocoderCall;", "geocoderCall", "<init>", "(LZq/b;Lcom/meijer/mobile/serverapi/rxjava/observables/store/GeocoderCall;)V", "", "searchTerm", "", "searchRadius", "maxRecords", "", "gpsTurnedOn", "runGeocoder", "", "latitude", "longitude", "Lok/i;", "storeSearchType", "", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "searchStores", "(Ljava/lang/String;IIZZDDLok/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storesList", "validateResponse", "(Ljava/util/List;Lok/i;I)Ljava/util/List;", "getObservable", "(Ljava/lang/String;IIZLok/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(DDIILok/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZq/b;", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/GeocoderCall;", "Companion", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SearchStoresCall {
    private static final int FETCH_MULTIPLIER = 2;
    private final GeocoderCall geocoderCall;
    private final b storeInfoRepository;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall", f = "SearchStoresCall.kt", l = {87, HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "searchStores")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f116709a;

        /* renamed from: b, reason: collision with root package name */
        Object f116710b;

        /* renamed from: c, reason: collision with root package name */
        Object f116711c;

        /* renamed from: d, reason: collision with root package name */
        Object f116712d;

        /* renamed from: e, reason: collision with root package name */
        Object f116713e;

        /* renamed from: f, reason: collision with root package name */
        Object f116714f;

        /* renamed from: g, reason: collision with root package name */
        Object f116715g;

        /* renamed from: h, reason: collision with root package name */
        int f116716h;

        /* renamed from: i, reason: collision with root package name */
        int f116717i;

        /* renamed from: j, reason: collision with root package name */
        int f116718j;

        /* renamed from: k, reason: collision with root package name */
        int f116719k;

        /* renamed from: l, reason: collision with root package name */
        int f116720l;

        /* renamed from: m, reason: collision with root package name */
        int f116721m;

        /* renamed from: n, reason: collision with root package name */
        int f116722n;

        /* renamed from: o, reason: collision with root package name */
        boolean f116723o;

        /* renamed from: p, reason: collision with root package name */
        boolean f116724p;

        /* renamed from: q, reason: collision with root package name */
        double f116725q;

        /* renamed from: r, reason: collision with root package name */
        double f116726r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f116727s;

        /* renamed from: u, reason: collision with root package name */
        int f116729u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f116727s = obj;
            this.f116729u |= Integer.MIN_VALUE;
            return SearchStoresCall.this.searchStores(null, 0, 0, false, false, 0.0d, 0.0d, null, this);
        }
    }

    public final Object getObservable(String str, int i10, int i11, boolean z10, i iVar, Continuation<? super List<Store>> continuation) {
        return searchStores(str, i10, i11, z10, true, 0.0d, 0.0d, iVar, continuation);
    }

    public SearchStoresCall(b storeInfoRepository, GeocoderCall geocoderCall) {
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(geocoderCall, "geocoderCall");
        this.storeInfoRepository = storeInfoRepository;
        this.geocoderCall = geocoderCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
    
        if (r6 == r13) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0170, code lost:
    
        if (r6 == r13) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object searchStores(java.lang.String r24, int r25, int r26, boolean r27, boolean r28, double r29, double r31, ok.i r33, kotlin.coroutines.Continuation<? super java.util.List<com.meijer.mobile.storeinfo.api.model.Store>> r34) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall.searchStores(java.lang.String, int, int, boolean, boolean, double, double, ok.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<Store> validateResponse(List<Store> storesList, i storeSearchType, int maxRecords) {
        ArrayList arrayList = new ArrayList();
        Iterator<Store> it = storesList.iterator();
        while (it.hasNext()) {
            Store next = it.next();
            i iVar = i.f153983a;
            if (storeSearchType == iVar || next.H0()) {
                if ((storeSearchType == iVar && (next.getAuxUnitInfo() != null || next.E0())) || storeSearchType != iVar) {
                    arrayList.add(next);
                }
                if (arrayList.size() == maxRecords) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public final Object getObservable(double d10, double d11, int i10, int i11, i iVar, Continuation<? super List<Store>> continuation) {
        return searchStores(null, i10, i11, false, false, d10, d11, iVar, continuation);
    }
}
