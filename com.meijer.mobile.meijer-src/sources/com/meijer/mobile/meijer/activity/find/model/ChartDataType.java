package com.meijer.mobile.meijer.activity.find.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "", "<init>", "(Ljava/lang/String;I)V", "MPERKS", "COUPONS", "SPECIALS", "TEAM_MEMBER", "NONE", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChartDataType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChartDataType[] $VALUES;
    public static final ChartDataType MPERKS = new ChartDataType("MPERKS", 0);
    public static final ChartDataType COUPONS = new ChartDataType("COUPONS", 1);
    public static final ChartDataType SPECIALS = new ChartDataType("SPECIALS", 2);
    public static final ChartDataType TEAM_MEMBER = new ChartDataType("TEAM_MEMBER", 3);
    public static final ChartDataType NONE = new ChartDataType("NONE", 4);

    private static final /* synthetic */ ChartDataType[] $values() {
        return new ChartDataType[]{MPERKS, COUPONS, SPECIALS, TEAM_MEMBER, NONE};
    }

    public static EnumEntries<ChartDataType> getEntries() {
        return $ENTRIES;
    }

    static {
        ChartDataType[] chartDataTypeArr$values = $values();
        $VALUES = chartDataTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(chartDataTypeArr$values);
    }

    public static ChartDataType valueOf(String str) {
        return (ChartDataType) Enum.valueOf(ChartDataType.class, str);
    }

    public static ChartDataType[] values() {
        return (ChartDataType[]) $VALUES.clone();
    }

    private ChartDataType(String str, int i10) {
    }
}
