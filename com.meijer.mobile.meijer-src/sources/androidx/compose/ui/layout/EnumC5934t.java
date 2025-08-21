package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/t;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5934t {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5934t f51367a = new EnumC5934t("Min", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5934t f51368b = new EnumC5934t("Max", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC5934t[] f51369c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f51370d;

    private static final /* synthetic */ EnumC5934t[] a() {
        return new EnumC5934t[]{f51367a, f51368b};
    }

    public static EnumC5934t valueOf(String str) {
        return (EnumC5934t) Enum.valueOf(EnumC5934t.class, str);
    }

    public static EnumC5934t[] values() {
        return (EnumC5934t[]) f51369c.clone();
    }

    static {
        EnumC5934t[] enumC5934tArrA = a();
        f51369c = enumC5934tArrA;
        f51370d = EnumEntriesKt.a(enumC5934tArrA);
    }

    private EnumC5934t(String str, int i10) {
    }
}
