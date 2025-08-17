package com.radiusnetworks.flybuy.sdk.data.site;

import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/site/LocalSitesRepository;", "", "Landroidx/lifecycle/A;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "getAllLiveData", "()Landroidx/lifecycle/A;", "allLiveData", "getAll", "()Ljava/util/List;", "all", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface LocalSitesRepository {
    List<Site> getAll();

    AbstractC5985A<List<Site>> getAllLiveData();
}
