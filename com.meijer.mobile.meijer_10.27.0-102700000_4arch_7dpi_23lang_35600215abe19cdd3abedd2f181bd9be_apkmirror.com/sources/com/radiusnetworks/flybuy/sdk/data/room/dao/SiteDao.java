package com.radiusnetworks.flybuy.sdk.data.room.dao;

import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\"\u00020\u0004H'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\"\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/dao/SiteDao;", "", "Landroidx/lifecycle/A;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "allLiveData", "()Landroidx/lifecycle/A;", "all", "()Ljava/util/List;", "", "sites", "", "insertAll", "([Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;)V", "updateAll", "deleteAll", "()V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface SiteDao {
    List<Site> all();

    AbstractC5985A<List<Site>> allLiveData();

    void deleteAll();

    void insertAll(Site... sites);

    void updateAll(Site... sites);
}
