package com.meijer.mobile.mperks.networking.domain.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ClipSource;", "", "<init>", "(Ljava/lang/String;I)V", "Customer", "SystemAutoClaim", "CallCenterAgent", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ClipSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClipSource[] $VALUES;
    public static final ClipSource Customer = new ClipSource("Customer", 0);
    public static final ClipSource SystemAutoClaim = new ClipSource("SystemAutoClaim", 1);
    public static final ClipSource CallCenterAgent = new ClipSource("CallCenterAgent", 2);

    private static final /* synthetic */ ClipSource[] $values() {
        return new ClipSource[]{Customer, SystemAutoClaim, CallCenterAgent};
    }

    public static EnumEntries<ClipSource> getEntries() {
        return $ENTRIES;
    }

    static {
        ClipSource[] clipSourceArr$values = $values();
        $VALUES = clipSourceArr$values;
        $ENTRIES = EnumEntriesKt.a(clipSourceArr$values);
    }

    public static ClipSource valueOf(String str) {
        return (ClipSource) Enum.valueOf(ClipSource.class, str);
    }

    public static ClipSource[] values() {
        return (ClipSource[]) $VALUES.clone();
    }

    private ClipSource(String str, int i10) {
    }
}
