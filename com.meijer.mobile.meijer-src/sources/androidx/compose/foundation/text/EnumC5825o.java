package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/o;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5825o {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5825o f49921a = new EnumC5825o("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5825o f49922b = new EnumC5825o("Selection", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5825o f49923c = new EnumC5825o("Cursor", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC5825o[] f49924d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f49925e;

    private static final /* synthetic */ EnumC5825o[] a() {
        return new EnumC5825o[]{f49921a, f49922b, f49923c};
    }

    public static EnumC5825o valueOf(String str) {
        return (EnumC5825o) Enum.valueOf(EnumC5825o.class, str);
    }

    public static EnumC5825o[] values() {
        return (EnumC5825o[]) f49924d.clone();
    }

    static {
        EnumC5825o[] enumC5825oArrA = a();
        f49924d = enumC5825oArrA;
        f49925e = EnumEntriesKt.a(enumC5825oArrA);
    }

    private EnumC5825o(String str, int i10) {
    }
}
