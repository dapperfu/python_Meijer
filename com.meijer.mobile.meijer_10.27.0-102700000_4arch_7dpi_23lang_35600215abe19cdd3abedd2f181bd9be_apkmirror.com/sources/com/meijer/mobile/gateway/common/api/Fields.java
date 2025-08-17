package com.meijer.mobile.gateway.common.api;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/gateway/common/api/Fields;", "", "<init>", "(Ljava/lang/String;I)V", "BASIC", "DEFAULT", "FULL", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Fields {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Fields[] $VALUES;

    @g(name = "BASIC")
    public static final Fields BASIC = new Fields("BASIC", 0);

    @g(name = "DEFAULT")
    public static final Fields DEFAULT = new Fields("DEFAULT", 1);

    @g(name = "FULL")
    public static final Fields FULL = new Fields("FULL", 2);

    private static final /* synthetic */ Fields[] a() {
        return new Fields[]{BASIC, DEFAULT, FULL};
    }

    static {
        Fields[] fieldsArrA = a();
        $VALUES = fieldsArrA;
        $ENTRIES = EnumEntriesKt.a(fieldsArrA);
    }

    public static Fields valueOf(String str) {
        return (Fields) Enum.valueOf(Fields.class, str);
    }

    public static Fields[] values() {
        return (Fields[]) $VALUES.clone();
    }

    private Fields(String str, int i10) {
    }
}
