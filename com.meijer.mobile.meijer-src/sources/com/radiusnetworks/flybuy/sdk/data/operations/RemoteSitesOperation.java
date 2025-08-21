package com.radiusnetworks.flybuy.sdk.data.operations;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.site.PaginatedSites;
import com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JU\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012Jc\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteSitesOperation;", "", "remoteSitesRepository", "Lcom/radiusnetworks/flybuy/sdk/data/site/RemoteSitesRepository;", "(Lcom/radiusnetworks/flybuy/sdk/data/site/RemoteSitesRepository;)V", "fetch", "", "region", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "page", "", "per", "operationalStatus", "", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/site/PaginatedSites;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "(Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "query", "matchPartnerIdentifier", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoteSitesOperation {
    private final RemoteSitesRepository remoteSitesRepository;

    public static /* synthetic */ void fetch$default(RemoteSitesOperation remoteSitesOperation, String str, Integer num, Integer num2, String str2, Boolean bool, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        remoteSitesOperation.fetch(str, num, num2, str2, bool, function2);
    }

    public final void fetch(String query, Integer page, Integer per, String operationalStatus, Boolean matchPartnerIdentifier, Function2<? super PaginatedSites, ? super SdkError, Unit> callback) {
        this.remoteSitesRepository.fetch(query, page, per, operationalStatus, matchPartnerIdentifier, callback);
    }

    public RemoteSitesOperation(RemoteSitesRepository remoteSitesRepository) {
        Intrinsics.j(remoteSitesRepository, "remoteSitesRepository");
        this.remoteSitesRepository = remoteSitesRepository;
    }

    public static /* synthetic */ void fetch$default(RemoteSitesOperation remoteSitesOperation, CircularRegion circularRegion, Integer num, Integer num2, String str, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        remoteSitesOperation.fetch(circularRegion, num, num2, str, function2);
    }

    public final void fetch(CircularRegion region, Integer page, Integer per, String operationalStatus, Function2<? super PaginatedSites, ? super SdkError, Unit> callback) {
        Intrinsics.j(region, "region");
        this.remoteSitesRepository.fetch(region, page, per, operationalStatus, callback);
    }
}
