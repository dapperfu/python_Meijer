package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ButtonBarShowMode;", "", "Never", "WhileExpanded", "Always", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ButtonBarShowMode {
    public static final ButtonBarShowMode Always;
    public static final ButtonBarShowMode Never;
    public static final ButtonBarShowMode WhileExpanded;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ ButtonBarShowMode[] f125564a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f125565b;

    public static EnumEntries<ButtonBarShowMode> getEntries() {
        return f125565b;
    }

    public static ButtonBarShowMode valueOf(String str) {
        return (ButtonBarShowMode) Enum.valueOf(ButtonBarShowMode.class, str);
    }

    public static ButtonBarShowMode[] values() {
        return (ButtonBarShowMode[]) f125564a.clone();
    }

    static {
        ButtonBarShowMode buttonBarShowMode = new ButtonBarShowMode("Never", 0);
        Never = buttonBarShowMode;
        ButtonBarShowMode buttonBarShowMode2 = new ButtonBarShowMode("WhileExpanded", 1);
        WhileExpanded = buttonBarShowMode2;
        ButtonBarShowMode buttonBarShowMode3 = new ButtonBarShowMode("Always", 2);
        Always = buttonBarShowMode3;
        ButtonBarShowMode[] buttonBarShowModeArr = {buttonBarShowMode, buttonBarShowMode2, buttonBarShowMode3};
        f125564a = buttonBarShowModeArr;
        f125565b = EnumEntriesKt.a(buttonBarShowModeArr);
    }

    private ButtonBarShowMode(String str, int i10) {
    }
}
