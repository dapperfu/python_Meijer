package com.radiusnetworks.flybuy.sdk.data.links;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/links/LinkType;", "", "(Ljava/lang/String;I)V", "DINE_IN", "REDEMPTION", "OTHER", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LinkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkType[] $VALUES;
    public static final LinkType DINE_IN = new LinkType("DINE_IN", 0);
    public static final LinkType REDEMPTION = new LinkType("REDEMPTION", 1);
    public static final LinkType OTHER = new LinkType("OTHER", 2);

    private static final /* synthetic */ LinkType[] $values() {
        return new LinkType[]{DINE_IN, REDEMPTION, OTHER};
    }

    public static EnumEntries<LinkType> getEntries() {
        return $ENTRIES;
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) $VALUES.clone();
    }

    static {
        LinkType[] linkTypeArr$values = $values();
        $VALUES = linkTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(linkTypeArr$values);
    }

    private LinkType(String str, int i10) {
    }
}
