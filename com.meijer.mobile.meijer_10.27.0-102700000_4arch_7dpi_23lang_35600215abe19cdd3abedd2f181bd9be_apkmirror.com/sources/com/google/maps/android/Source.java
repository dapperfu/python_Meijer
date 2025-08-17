package com.google.maps.android;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/maps/android/Source;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "DEFAULT", "OUTDOOR", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Source {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Source[] $VALUES;
    public static final Source DEFAULT = new Source("DEFAULT", 0, "default");
    public static final Source OUTDOOR = new Source("OUTDOOR", 1, "outdoor");
    private String value;

    private static final /* synthetic */ Source[] $values() {
        return new Source[]{DEFAULT, OUTDOOR};
    }

    public static EnumEntries<Source> getEntries() {
        return $ENTRIES;
    }

    static {
        Source[] sourceArr$values = $values();
        $VALUES = sourceArr$values;
        $ENTRIES = EnumEntriesKt.a(sourceArr$values);
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.j(str, "<set-?>");
        this.value = str;
    }

    private Source(String str, int i10, String str2) {
        this.value = str2;
    }
}
