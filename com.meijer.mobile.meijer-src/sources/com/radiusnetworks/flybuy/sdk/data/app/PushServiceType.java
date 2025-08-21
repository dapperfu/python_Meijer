package com.radiusnetworks.flybuy.sdk.data.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/app/PushServiceType;", "", "typeString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeString$core_defaultRelease", "()Ljava/lang/String;", "setTypeString$core_defaultRelease", "(Ljava/lang/String;)V", "toString", "FCM", "AIRSHIP", "ONE_SIGNAL", "APNS", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushServiceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PushServiceType[] $VALUES;
    private String typeString;
    public static final PushServiceType FCM = new PushServiceType("FCM", 0, "fcm");
    public static final PushServiceType AIRSHIP = new PushServiceType("AIRSHIP", 1, "airship");
    public static final PushServiceType ONE_SIGNAL = new PushServiceType("ONE_SIGNAL", 2, "one_signal");
    public static final PushServiceType APNS = new PushServiceType("APNS", 3, "apns");

    private static final /* synthetic */ PushServiceType[] $values() {
        return new PushServiceType[]{FCM, AIRSHIP, ONE_SIGNAL, APNS};
    }

    public static EnumEntries<PushServiceType> getEntries() {
        return $ENTRIES;
    }

    public static PushServiceType valueOf(String str) {
        return (PushServiceType) Enum.valueOf(PushServiceType.class, str);
    }

    public static PushServiceType[] values() {
        return (PushServiceType[]) $VALUES.clone();
    }

    static {
        PushServiceType[] pushServiceTypeArr$values = $values();
        $VALUES = pushServiceTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(pushServiceTypeArr$values);
    }

    /* renamed from: getTypeString$core_defaultRelease, reason: from getter */
    public final String getTypeString() {
        return this.typeString;
    }

    public final void setTypeString$core_defaultRelease(String str) {
        Intrinsics.j(str, "<set-?>");
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }

    private PushServiceType(String str, int i10, String str2) {
        this.typeString = str2;
    }
}
