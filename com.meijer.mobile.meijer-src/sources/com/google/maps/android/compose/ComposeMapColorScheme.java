package com.google.maps.android.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/maps/android/compose/ComposeMapColorScheme;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LIGHT", "DARK", "FOLLOW_SYSTEM", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposeMapColorScheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ComposeMapColorScheme[] $VALUES;
    private final int value;
    public static final ComposeMapColorScheme LIGHT = new ComposeMapColorScheme("LIGHT", 0, 0);
    public static final ComposeMapColorScheme DARK = new ComposeMapColorScheme("DARK", 1, 1);
    public static final ComposeMapColorScheme FOLLOW_SYSTEM = new ComposeMapColorScheme("FOLLOW_SYSTEM", 2, 2);

    private static final /* synthetic */ ComposeMapColorScheme[] $values() {
        return new ComposeMapColorScheme[]{LIGHT, DARK, FOLLOW_SYSTEM};
    }

    public static EnumEntries<ComposeMapColorScheme> getEntries() {
        return $ENTRIES;
    }

    public static ComposeMapColorScheme valueOf(String str) {
        return (ComposeMapColorScheme) Enum.valueOf(ComposeMapColorScheme.class, str);
    }

    public static ComposeMapColorScheme[] values() {
        return (ComposeMapColorScheme[]) $VALUES.clone();
    }

    static {
        ComposeMapColorScheme[] composeMapColorSchemeArr$values = $values();
        $VALUES = composeMapColorSchemeArr$values;
        $ENTRIES = EnumEntriesKt.a(composeMapColorSchemeArr$values);
    }

    public final int getValue() {
        return this.value;
    }

    private ComposeMapColorScheme(String str, int i10, int i11) {
        this.value = i11;
    }
}
