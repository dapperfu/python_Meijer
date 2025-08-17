package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/J1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public static final J1 f51825a = new J1("Shown", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final J1 f51826b = new J1("Hidden", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ J1[] f51827c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f51828d;

    private static final /* synthetic */ J1[] a() {
        return new J1[]{f51825a, f51826b};
    }

    public static J1 valueOf(String str) {
        return (J1) Enum.valueOf(J1.class, str);
    }

    public static J1[] values() {
        return (J1[]) f51827c.clone();
    }

    static {
        J1[] j1ArrA = a();
        f51827c = j1ArrA;
        f51828d = EnumEntriesKt.a(j1ArrA);
    }

    private J1(String str, int i10) {
    }
}
