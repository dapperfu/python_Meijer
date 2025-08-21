package com.radiusnetworks.flybuy.sdk.data.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;", "", "asString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAsString$core_defaultRelease", "()Ljava/lang/String;", "toString", "TEXT", "NUMBER", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InputType[] $VALUES;
    private final String asString;
    public static final InputType TEXT = new InputType("TEXT", 0, "text");
    public static final InputType NUMBER = new InputType("NUMBER", 1, "number");

    private static final /* synthetic */ InputType[] $values() {
        return new InputType[]{TEXT, NUMBER};
    }

    public static EnumEntries<InputType> getEntries() {
        return $ENTRIES;
    }

    public static InputType valueOf(String str) {
        return (InputType) Enum.valueOf(InputType.class, str);
    }

    public static InputType[] values() {
        return (InputType[]) $VALUES.clone();
    }

    static {
        InputType[] inputTypeArr$values = $values();
        $VALUES = inputTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(inputTypeArr$values);
    }

    /* renamed from: getAsString$core_defaultRelease, reason: from getter */
    public final String getAsString() {
        return this.asString;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.asString;
    }

    private InputType(String str, int i10, String str2) {
        this.asString = str2;
    }
}
