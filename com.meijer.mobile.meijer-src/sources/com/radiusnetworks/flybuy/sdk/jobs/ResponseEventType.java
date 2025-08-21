package com.radiusnetworks.flybuy.sdk.jobs;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;", "", "(Ljava/lang/String;I)V", "FAILED", "SUCCESS", "NO_CONNECTION", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResponseEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseEventType[] $VALUES;
    public static final ResponseEventType FAILED = new ResponseEventType("FAILED", 0);
    public static final ResponseEventType SUCCESS = new ResponseEventType("SUCCESS", 1);
    public static final ResponseEventType NO_CONNECTION = new ResponseEventType("NO_CONNECTION", 2);

    private static final /* synthetic */ ResponseEventType[] $values() {
        return new ResponseEventType[]{FAILED, SUCCESS, NO_CONNECTION};
    }

    public static EnumEntries<ResponseEventType> getEntries() {
        return $ENTRIES;
    }

    public static ResponseEventType valueOf(String str) {
        return (ResponseEventType) Enum.valueOf(ResponseEventType.class, str);
    }

    public static ResponseEventType[] values() {
        return (ResponseEventType[]) $VALUES.clone();
    }

    static {
        ResponseEventType[] responseEventTypeArr$values = $values();
        $VALUES = responseEventTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(responseEventTypeArr$values);
    }

    private ResponseEventType(String str, int i10) {
    }
}
