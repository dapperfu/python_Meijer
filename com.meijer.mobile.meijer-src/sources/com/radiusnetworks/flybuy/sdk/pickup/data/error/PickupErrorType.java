package com.radiusnetworks.flybuy.sdk.pickup.data.error;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/data/error/PickupErrorType;", "", "description", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PickupErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PickupErrorType[] $VALUES;
    private final String description;

    private static final /* synthetic */ PickupErrorType[] $values() {
        return new PickupErrorType[0];
    }

    static {
        PickupErrorType[] pickupErrorTypeArr$values = $values();
        $VALUES = pickupErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(pickupErrorTypeArr$values);
    }

    public static EnumEntries<PickupErrorType> getEntries() {
        return $ENTRIES;
    }

    public static PickupErrorType valueOf(String str) {
        return (PickupErrorType) Enum.valueOf(PickupErrorType.class, str);
    }

    public static PickupErrorType[] values() {
        return (PickupErrorType[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    private PickupErrorType(String str, int i10, String str2) {
        this.description = str2;
    }
}
