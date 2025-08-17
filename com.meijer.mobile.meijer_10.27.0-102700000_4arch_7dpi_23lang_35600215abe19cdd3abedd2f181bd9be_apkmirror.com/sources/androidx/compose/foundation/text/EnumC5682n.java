package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/n;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5682n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5682n f49690a = new EnumC5682n("Cursor", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5682n f49691b = new EnumC5682n("SelectionStart", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5682n f49692c = new EnumC5682n("SelectionEnd", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC5682n[] f49693d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f49694e;

    private static final /* synthetic */ EnumC5682n[] a() {
        return new EnumC5682n[]{f49690a, f49691b, f49692c};
    }

    public static EnumC5682n valueOf(String str) {
        return (EnumC5682n) Enum.valueOf(EnumC5682n.class, str);
    }

    public static EnumC5682n[] values() {
        return (EnumC5682n[]) f49693d.clone();
    }

    static {
        EnumC5682n[] enumC5682nArrA = a();
        f49693d = enumC5682nArrA;
        f49694e = EnumEntriesKt.a(enumC5682nArrA);
    }

    private EnumC5682n(String str, int i10) {
    }
}
