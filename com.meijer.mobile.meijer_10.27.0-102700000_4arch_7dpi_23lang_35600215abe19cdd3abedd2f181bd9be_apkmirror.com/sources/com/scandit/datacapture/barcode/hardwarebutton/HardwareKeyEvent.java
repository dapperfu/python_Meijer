package com.scandit.datacapture.barcode.hardwarebutton;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareKeyEvent;", "", "CLICK", "LONG_PRESS_START", "LONG_PRESS_END", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class HardwareKeyEvent {
    public static final HardwareKeyEvent CLICK;
    public static final HardwareKeyEvent LONG_PRESS_END;
    public static final HardwareKeyEvent LONG_PRESS_START;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ HardwareKeyEvent[] f121046a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f121047b;

    public static EnumEntries<HardwareKeyEvent> getEntries() {
        return f121047b;
    }

    public static HardwareKeyEvent valueOf(String str) {
        return (HardwareKeyEvent) Enum.valueOf(HardwareKeyEvent.class, str);
    }

    public static HardwareKeyEvent[] values() {
        return (HardwareKeyEvent[]) f121046a.clone();
    }

    static {
        HardwareKeyEvent hardwareKeyEvent = new HardwareKeyEvent("CLICK", 0);
        CLICK = hardwareKeyEvent;
        HardwareKeyEvent hardwareKeyEvent2 = new HardwareKeyEvent("LONG_PRESS_START", 1);
        LONG_PRESS_START = hardwareKeyEvent2;
        HardwareKeyEvent hardwareKeyEvent3 = new HardwareKeyEvent("LONG_PRESS_END", 2);
        LONG_PRESS_END = hardwareKeyEvent3;
        HardwareKeyEvent[] hardwareKeyEventArr = {hardwareKeyEvent, hardwareKeyEvent2, hardwareKeyEvent3};
        f121046a = hardwareKeyEventArr;
        f121047b = EnumEntriesKt.a(hardwareKeyEventArr);
    }

    private HardwareKeyEvent(String str, int i10) {
    }
}
