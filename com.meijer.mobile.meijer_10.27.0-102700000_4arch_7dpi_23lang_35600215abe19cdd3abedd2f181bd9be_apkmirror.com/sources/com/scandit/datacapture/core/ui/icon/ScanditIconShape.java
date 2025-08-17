package com.scandit.datacapture.core.ui.icon;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIconShape;", "", "CIRCLE", "SQUARE", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ScanditIconShape {
    public static final ScanditIconShape CIRCLE;
    public static final ScanditIconShape SQUARE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ ScanditIconShape[] f126123a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f126124b;

    public static EnumEntries<ScanditIconShape> getEntries() {
        return f126124b;
    }

    public static ScanditIconShape valueOf(String str) {
        return (ScanditIconShape) Enum.valueOf(ScanditIconShape.class, str);
    }

    public static ScanditIconShape[] values() {
        return (ScanditIconShape[]) f126123a.clone();
    }

    static {
        ScanditIconShape scanditIconShape = new ScanditIconShape("CIRCLE", 0);
        CIRCLE = scanditIconShape;
        ScanditIconShape scanditIconShape2 = new ScanditIconShape("SQUARE", 1);
        SQUARE = scanditIconShape2;
        ScanditIconShape[] scanditIconShapeArr = {scanditIconShape, scanditIconShape2};
        f126123a = scanditIconShapeArr;
        f126124b = EnumEntriesKt.a(scanditIconShapeArr);
    }

    private ScanditIconShape(String str, int i10) {
    }
}
