package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/u;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5793u {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5793u f51147a = new EnumC5793u("Width", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5793u f51148b = new EnumC5793u("Height", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC5793u[] f51149c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f51150d;

    private static final /* synthetic */ EnumC5793u[] a() {
        return new EnumC5793u[]{f51147a, f51148b};
    }

    public static EnumC5793u valueOf(String str) {
        return (EnumC5793u) Enum.valueOf(EnumC5793u.class, str);
    }

    public static EnumC5793u[] values() {
        return (EnumC5793u[]) f51149c.clone();
    }

    static {
        EnumC5793u[] enumC5793uArrA = a();
        f51149c = enumC5793uArrA;
        f51150d = EnumEntriesKt.a(enumC5793uArrA);
    }

    private EnumC5793u(String str, int i10) {
    }
}
