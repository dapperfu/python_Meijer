package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FormatStyle {
    public static final FormatStyle FULL;
    public static final FormatStyle LONG;
    public static final FormatStyle MEDIUM;
    public static final FormatStyle SHORT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FormatStyle[] f139419a;

    public static FormatStyle valueOf(String str) {
        return (FormatStyle) Enum.valueOf(FormatStyle.class, str);
    }

    public static FormatStyle[] values() {
        return (FormatStyle[]) f139419a.clone();
    }

    static {
        FormatStyle formatStyle = new FormatStyle("FULL", 0);
        FULL = formatStyle;
        FormatStyle formatStyle2 = new FormatStyle("LONG", 1);
        LONG = formatStyle2;
        FormatStyle formatStyle3 = new FormatStyle("MEDIUM", 2);
        MEDIUM = formatStyle3;
        FormatStyle formatStyle4 = new FormatStyle("SHORT", 3);
        SHORT = formatStyle4;
        f139419a = new FormatStyle[]{formatStyle, formatStyle2, formatStyle3, formatStyle4};
    }
}
