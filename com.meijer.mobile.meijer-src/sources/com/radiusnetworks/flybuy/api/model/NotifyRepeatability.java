package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyRepeatability;", "", "(Ljava/lang/String;I)V", "daily", "once", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotifyRepeatability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotifyRepeatability[] $VALUES;
    public static final NotifyRepeatability daily = new NotifyRepeatability("daily", 0);
    public static final NotifyRepeatability once = new NotifyRepeatability("once", 1);

    private static final /* synthetic */ NotifyRepeatability[] $values() {
        return new NotifyRepeatability[]{daily, once};
    }

    public static EnumEntries<NotifyRepeatability> getEntries() {
        return $ENTRIES;
    }

    public static NotifyRepeatability valueOf(String str) {
        return (NotifyRepeatability) Enum.valueOf(NotifyRepeatability.class, str);
    }

    public static NotifyRepeatability[] values() {
        return (NotifyRepeatability[]) $VALUES.clone();
    }

    static {
        NotifyRepeatability[] notifyRepeatabilityArr$values = $values();
        $VALUES = notifyRepeatabilityArr$values;
        $ENTRIES = EnumEntriesKt.a(notifyRepeatabilityArr$values);
    }

    private NotifyRepeatability(String str, int i10) {
    }
}
