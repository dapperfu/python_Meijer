package com.radiusnetworks.flybuy.sdk.data.error;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/error/CustomerErrorType;", "", "description", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "FAILED_TO_SIGN_OUT", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CustomerErrorType[] $VALUES;
    public static final CustomerErrorType FAILED_TO_SIGN_OUT = new CustomerErrorType("FAILED_TO_SIGN_OUT", 0, "Failure logging out");
    private final String description;

    private static final /* synthetic */ CustomerErrorType[] $values() {
        return new CustomerErrorType[]{FAILED_TO_SIGN_OUT};
    }

    public static EnumEntries<CustomerErrorType> getEntries() {
        return $ENTRIES;
    }

    public static CustomerErrorType valueOf(String str) {
        return (CustomerErrorType) Enum.valueOf(CustomerErrorType.class, str);
    }

    public static CustomerErrorType[] values() {
        return (CustomerErrorType[]) $VALUES.clone();
    }

    static {
        CustomerErrorType[] customerErrorTypeArr$values = $values();
        $VALUES = customerErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(customerErrorTypeArr$values);
    }

    public final String getDescription() {
        return this.description;
    }

    private CustomerErrorType(String str, int i10, String str2) {
        this.description = str2;
    }
}
