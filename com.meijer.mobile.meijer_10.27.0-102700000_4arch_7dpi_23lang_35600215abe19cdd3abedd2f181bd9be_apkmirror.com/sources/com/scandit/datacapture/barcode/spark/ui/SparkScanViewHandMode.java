package com.scandit.datacapture.barcode.spark.ui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "", "RIGHT", "LEFT", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanViewHandMode {
    public static final SparkScanViewHandMode LEFT;
    public static final SparkScanViewHandMode RIGHT;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ SparkScanViewHandMode[] f123967a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f123968b;

    public static EnumEntries<SparkScanViewHandMode> getEntries() {
        return f123968b;
    }

    public static SparkScanViewHandMode valueOf(String str) {
        return (SparkScanViewHandMode) Enum.valueOf(SparkScanViewHandMode.class, str);
    }

    public static SparkScanViewHandMode[] values() {
        return (SparkScanViewHandMode[]) f123967a.clone();
    }

    static {
        SparkScanViewHandMode sparkScanViewHandMode = new SparkScanViewHandMode("RIGHT", 0);
        RIGHT = sparkScanViewHandMode;
        SparkScanViewHandMode sparkScanViewHandMode2 = new SparkScanViewHandMode("LEFT", 1);
        LEFT = sparkScanViewHandMode2;
        SparkScanViewHandMode[] sparkScanViewHandModeArr = {sparkScanViewHandMode, sparkScanViewHandMode2};
        f123967a = sparkScanViewHandModeArr;
        f123968b = EnumEntriesKt.a(sparkScanViewHandModeArr);
    }

    private SparkScanViewHandMode(String str, int i10) {
    }
}
