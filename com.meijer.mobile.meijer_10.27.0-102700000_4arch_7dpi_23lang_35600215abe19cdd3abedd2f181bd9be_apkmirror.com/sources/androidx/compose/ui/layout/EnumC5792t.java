package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/t;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5792t {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5792t f51143a = new EnumC5792t("Min", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5792t f51144b = new EnumC5792t("Max", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC5792t[] f51145c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f51146d;

    private static final /* synthetic */ EnumC5792t[] a() {
        return new EnumC5792t[]{f51143a, f51144b};
    }

    public static EnumC5792t valueOf(String str) {
        return (EnumC5792t) Enum.valueOf(EnumC5792t.class, str);
    }

    public static EnumC5792t[] values() {
        return (EnumC5792t[]) f51145c.clone();
    }

    static {
        EnumC5792t[] enumC5792tArrA = a();
        f51145c = enumC5792tArrA;
        f51146d = EnumEntriesKt.a(enumC5792tArrA);
    }

    private EnumC5792t(String str, int i10) {
    }
}
