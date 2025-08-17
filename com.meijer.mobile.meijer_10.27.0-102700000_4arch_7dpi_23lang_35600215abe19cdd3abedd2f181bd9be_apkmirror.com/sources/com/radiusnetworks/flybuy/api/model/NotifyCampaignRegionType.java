package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignRegionType;", "", "(Ljava/lang/String;I)V", "geofence", "beacon", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotifyCampaignRegionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotifyCampaignRegionType[] $VALUES;
    public static final NotifyCampaignRegionType geofence = new NotifyCampaignRegionType("geofence", 0);
    public static final NotifyCampaignRegionType beacon = new NotifyCampaignRegionType("beacon", 1);

    private static final /* synthetic */ NotifyCampaignRegionType[] $values() {
        return new NotifyCampaignRegionType[]{geofence, beacon};
    }

    static {
        NotifyCampaignRegionType[] notifyCampaignRegionTypeArr$values = $values();
        $VALUES = notifyCampaignRegionTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(notifyCampaignRegionTypeArr$values);
    }

    private NotifyCampaignRegionType(String str, int i10) {
    }

    public static EnumEntries<NotifyCampaignRegionType> getEntries() {
        return $ENTRIES;
    }

    public static NotifyCampaignRegionType valueOf(String str) {
        return (NotifyCampaignRegionType) Enum.valueOf(NotifyCampaignRegionType.class, str);
    }

    public static NotifyCampaignRegionType[] values() {
        return (NotifyCampaignRegionType[]) $VALUES.clone();
    }
}
