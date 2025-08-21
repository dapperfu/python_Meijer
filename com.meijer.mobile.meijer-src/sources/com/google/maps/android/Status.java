package com.google.maps.android;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/maps/android/Status;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "ZERO_RESULTS", "NOT_FOUND", "REQUEST_DENIED", "OVER_QUERY_LIMIT", "INVALID_REQUEST", "UNKNOWN_ERROR", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Status {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status OK = new Status("OK", 0);
    public static final Status ZERO_RESULTS = new Status("ZERO_RESULTS", 1);
    public static final Status NOT_FOUND = new Status("NOT_FOUND", 2);
    public static final Status REQUEST_DENIED = new Status("REQUEST_DENIED", 3);
    public static final Status OVER_QUERY_LIMIT = new Status("OVER_QUERY_LIMIT", 4);
    public static final Status INVALID_REQUEST = new Status("INVALID_REQUEST", 5);
    public static final Status UNKNOWN_ERROR = new Status("UNKNOWN_ERROR", 6);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{OK, ZERO_RESULTS, NOT_FOUND, REQUEST_DENIED, OVER_QUERY_LIMIT, INVALID_REQUEST, UNKNOWN_ERROR};
    }

    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }

    static {
        Status[] statusArr$values = $values();
        $VALUES = statusArr$values;
        $ENTRIES = EnumEntriesKt.a(statusArr$values);
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }

    private Status(String str, int i10) {
    }
}
