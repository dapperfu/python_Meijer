package com.radiusnetworks.flybuy.sdk.data.site;

import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv.C16646j;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/site/LocalSitesDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/site/LocalSitesRepository;", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "db", "<init>", "(Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;)V", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "Landroidx/lifecycle/A;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "getAllLiveData", "()Landroidx/lifecycle/A;", "allLiveData", "getAll", "()Ljava/util/List;", "all", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocalSitesDataStore implements LocalSitesRepository {
    private final AppDatabase db;

    public LocalSitesDataStore(AppDatabase db2) {
        Intrinsics.j(db2, "db");
        this.db = db2;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.site.LocalSitesRepository
    public List<Site> getAll() {
        return (List) C16646j.b(null, new LocalSitesDataStore$all$1(this, null), 1, null);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.site.LocalSitesRepository
    public AbstractC5985A<List<Site>> getAllLiveData() {
        return this.db.siteDao$core_defaultRelease().allLiveData();
    }
}
