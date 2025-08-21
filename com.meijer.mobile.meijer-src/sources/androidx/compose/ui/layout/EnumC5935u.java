package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/u;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5935u {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5935u f51371a = new EnumC5935u("Width", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5935u f51372b = new EnumC5935u("Height", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC5935u[] f51373c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f51374d;

    private static final /* synthetic */ EnumC5935u[] a() {
        return new EnumC5935u[]{f51371a, f51372b};
    }

    public static EnumC5935u valueOf(String str) {
        return (EnumC5935u) Enum.valueOf(EnumC5935u.class, str);
    }

    public static EnumC5935u[] values() {
        return (EnumC5935u[]) f51373c.clone();
    }

    static {
        EnumC5935u[] enumC5935uArrA = a();
        f51373c = enumC5935uArrA;
        f51374d = EnumEntriesKt.a(enumC5935uArrA);
    }

    private EnumC5935u(String str, int i10) {
    }
}
