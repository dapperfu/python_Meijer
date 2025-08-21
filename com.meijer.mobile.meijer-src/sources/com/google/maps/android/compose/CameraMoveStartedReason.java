package com.google.maps.android.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "NO_MOVEMENT_YET", "GESTURE", "API_ANIMATION", "DEVELOPER_ANIMATION", "Companion", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CameraMoveStartedReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraMoveStartedReason[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final CameraMoveStartedReason UNKNOWN = new CameraMoveStartedReason("UNKNOWN", 0, -2);
    public static final CameraMoveStartedReason NO_MOVEMENT_YET = new CameraMoveStartedReason("NO_MOVEMENT_YET", 1, -1);
    public static final CameraMoveStartedReason GESTURE = new CameraMoveStartedReason("GESTURE", 2, 1);
    public static final CameraMoveStartedReason API_ANIMATION = new CameraMoveStartedReason("API_ANIMATION", 3, 2);
    public static final CameraMoveStartedReason DEVELOPER_ANIMATION = new CameraMoveStartedReason("DEVELOPER_ANIMATION", 4, 3);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason$Companion;", "", "<init>", "()V", "fromInt", "Lcom/google/maps/android/compose/CameraMoveStartedReason;", "value", "", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CameraMoveStartedReason fromInt(int value) {
            CameraMoveStartedReason cameraMoveStartedReason;
            CameraMoveStartedReason[] cameraMoveStartedReasonArrValues = CameraMoveStartedReason.values();
            int length = cameraMoveStartedReasonArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    cameraMoveStartedReason = cameraMoveStartedReasonArrValues[i10];
                    if (cameraMoveStartedReason.getValue() == value) {
                        break;
                    }
                    i10++;
                } else {
                    cameraMoveStartedReason = null;
                    break;
                }
            }
            if (cameraMoveStartedReason == null) {
                return CameraMoveStartedReason.UNKNOWN;
            }
            return cameraMoveStartedReason;
        }
    }

    private static final /* synthetic */ CameraMoveStartedReason[] $values() {
        return new CameraMoveStartedReason[]{UNKNOWN, NO_MOVEMENT_YET, GESTURE, API_ANIMATION, DEVELOPER_ANIMATION};
    }

    public static EnumEntries<CameraMoveStartedReason> getEntries() {
        return $ENTRIES;
    }

    public static CameraMoveStartedReason valueOf(String str) {
        return (CameraMoveStartedReason) Enum.valueOf(CameraMoveStartedReason.class, str);
    }

    public static CameraMoveStartedReason[] values() {
        return (CameraMoveStartedReason[]) $VALUES.clone();
    }

    static {
        CameraMoveStartedReason[] cameraMoveStartedReasonArr$values = $values();
        $VALUES = cameraMoveStartedReasonArr$values;
        $ENTRIES = EnumEntriesKt.a(cameraMoveStartedReasonArr$values);
        INSTANCE = new Companion(null);
    }

    public final int getValue() {
        return this.value;
    }

    private CameraMoveStartedReason(String str, int i10, int i11) {
        this.value = i11;
    }
}
