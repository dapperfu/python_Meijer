package com.radiusnetworks.flybuy.sdk.data.error;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/error/CommonErrorType;", "", "description", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "NO_CONNECTION", "UNKNOWN_ERROR", "EXCEPTION", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommonErrorType[] $VALUES;
    private String description;
    public static final CommonErrorType NO_CONNECTION = new CommonErrorType("NO_CONNECTION", 0, "No connection");
    public static final CommonErrorType UNKNOWN_ERROR = new CommonErrorType("UNKNOWN_ERROR", 1, "Unknown error");
    public static final CommonErrorType EXCEPTION = new CommonErrorType("EXCEPTION", 2, "");

    private static final /* synthetic */ CommonErrorType[] $values() {
        return new CommonErrorType[]{NO_CONNECTION, UNKNOWN_ERROR, EXCEPTION};
    }

    static {
        CommonErrorType[] commonErrorTypeArr$values = $values();
        $VALUES = commonErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(commonErrorTypeArr$values);
    }

    private CommonErrorType(String str, int i10, String str2) {
        this.description = str2;
    }

    public static EnumEntries<CommonErrorType> getEntries() {
        return $ENTRIES;
    }

    public static CommonErrorType valueOf(String str) {
        return (CommonErrorType) Enum.valueOf(CommonErrorType.class, str);
    }

    public static CommonErrorType[] values() {
        return (CommonErrorType[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        Intrinsics.j(str, "<set-?>");
        this.description = str;
    }
}
