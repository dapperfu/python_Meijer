package com.google.maps.android.compose;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/maps/android/compose/DragState;", "", "<init>", "(Ljava/lang/String;I)V", "START", "DRAG", "END", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DragState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DragState[] $VALUES;
    public static final DragState START = new DragState("START", 0);
    public static final DragState DRAG = new DragState("DRAG", 1);
    public static final DragState END = new DragState("END", 2);

    private static final /* synthetic */ DragState[] $values() {
        return new DragState[]{START, DRAG, END};
    }

    public static EnumEntries<DragState> getEntries() {
        return $ENTRIES;
    }

    public static DragState valueOf(String str) {
        return (DragState) Enum.valueOf(DragState.class, str);
    }

    public static DragState[] values() {
        return (DragState[]) $VALUES.clone();
    }

    static {
        DragState[] dragStateArr$values = $values();
        $VALUES = dragStateArr$values;
        $ENTRIES = EnumEntriesKt.a(dragStateArr$values);
    }

    private DragState(String str, int i10) {
    }
}
