package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/o;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5683o {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5683o f49697a = new EnumC5683o("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5683o f49698b = new EnumC5683o("Selection", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5683o f49699c = new EnumC5683o("Cursor", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC5683o[] f49700d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f49701e;

    private static final /* synthetic */ EnumC5683o[] a() {
        return new EnumC5683o[]{f49697a, f49698b, f49699c};
    }

    public static EnumC5683o valueOf(String str) {
        return (EnumC5683o) Enum.valueOf(EnumC5683o.class, str);
    }

    public static EnumC5683o[] values() {
        return (EnumC5683o[]) f49700d.clone();
    }

    static {
        EnumC5683o[] enumC5683oArrA = a();
        f49700d = enumC5683oArrA;
        f49701e = EnumEntriesKt.a(enumC5683oArrA);
    }

    private EnumC5683o(String str, int i10) {
    }
}
