package com.scandit.datacapture.core.ui.control;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "", "VERTICAL", "HORIZONTAL", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class LinearControlGroupOrientation {
    public static final LinearControlGroupOrientation HORIZONTAL;
    public static final LinearControlGroupOrientation VERTICAL;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ LinearControlGroupOrientation[] f126994a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f126995b;

    public static EnumEntries<LinearControlGroupOrientation> getEntries() {
        return f126995b;
    }

    public static LinearControlGroupOrientation valueOf(String str) {
        return (LinearControlGroupOrientation) Enum.valueOf(LinearControlGroupOrientation.class, str);
    }

    public static LinearControlGroupOrientation[] values() {
        return (LinearControlGroupOrientation[]) f126994a.clone();
    }

    static {
        LinearControlGroupOrientation linearControlGroupOrientation = new LinearControlGroupOrientation("VERTICAL", 0);
        VERTICAL = linearControlGroupOrientation;
        LinearControlGroupOrientation linearControlGroupOrientation2 = new LinearControlGroupOrientation("HORIZONTAL", 1);
        HORIZONTAL = linearControlGroupOrientation2;
        LinearControlGroupOrientation[] linearControlGroupOrientationArr = {linearControlGroupOrientation, linearControlGroupOrientation2};
        f126994a = linearControlGroupOrientationArr;
        f126995b = EnumEntriesKt.a(linearControlGroupOrientationArr);
    }

    private LinearControlGroupOrientation(String str, int i10) {
    }
}
