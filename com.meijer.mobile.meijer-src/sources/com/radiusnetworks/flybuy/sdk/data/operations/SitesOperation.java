package com.radiusnetworks.flybuy.sdk.data.operations;

import androidx.view.AbstractC6127A;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import com.radiusnetworks.flybuy.sdk.data.site.LocalSitesRepository;
import com.radiusnetworks.flybuy.sdk.data.site.PaginatedSites;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J_\u0010\u0015\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001e\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016JS\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u001e\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/SitesOperation;", "", "Lcom/radiusnetworks/flybuy/sdk/data/site/LocalSitesRepository;", "localSitesRepository", "Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteSitesOperation;", "remoteSitesOperation", "<init>", "(Lcom/radiusnetworks/flybuy/sdk/data/site/LocalSitesRepository;Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteSitesOperation;)V", "", "query", "", "page", "per", "operationalStatus", "", "matchPartnerIdentifier", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/site/PaginatedSites;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "callback", "fetch", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "region", "(Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/site/LocalSitesRepository;", "Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteSitesOperation;", "Landroidx/lifecycle/A;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "getAllLiveData", "()Landroidx/lifecycle/A;", "allLiveData", "getAll", "()Ljava/util/List;", "all", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SitesOperation {
    private final LocalSitesRepository localSitesRepository;
    private final RemoteSitesOperation remoteSitesOperation;

    public final void fetch(String query, Integer page, Integer per, String operationalStatus, Boolean matchPartnerIdentifier, Function2<? super PaginatedSites, ? super SdkError, Unit> callback) {
        this.remoteSitesOperation.fetch(query, page, per, operationalStatus, matchPartnerIdentifier, callback);
    }

    public SitesOperation(LocalSitesRepository localSitesRepository, RemoteSitesOperation remoteSitesOperation) {
        Intrinsics.j(localSitesRepository, "localSitesRepository");
        Intrinsics.j(remoteSitesOperation, "remoteSitesOperation");
        this.localSitesRepository = localSitesRepository;
        this.remoteSitesOperation = remoteSitesOperation;
    }

    public final void fetch(CircularRegion region, Integer page, Integer per, String operationalStatus, Function2<? super PaginatedSites, ? super SdkError, Unit> callback) {
        Intrinsics.j(region, "region");
        this.remoteSitesOperation.fetch(region, page, per, operationalStatus, callback);
    }

    public final List<Site> getAll() {
        return this.localSitesRepository.getAll();
    }

    public final AbstractC6127A<List<Site>> getAllLiveData() {
        return this.localSitesRepository.getAllLiveData();
    }
}
