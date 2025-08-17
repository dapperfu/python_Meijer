package g9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lg9/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: g9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC14225c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14225c f133208a = new EnumC14225c("BEFORE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14225c f133209b = new EnumC14225c("AFTER", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC14225c[] f133210c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f133211d;

    static {
        EnumC14225c[] enumC14225cArrA = a();
        f133210c = enumC14225cArrA;
        f133211d = EnumEntriesKt.a(enumC14225cArrA);
    }

    private static final /* synthetic */ EnumC14225c[] a() {
        return new EnumC14225c[]{f133208a, f133209b};
    }

    public static EnumC14225c valueOf(String str) {
        return (EnumC14225c) Enum.valueOf(EnumC14225c.class, str);
    }

    public static EnumC14225c[] values() {
        return (EnumC14225c[]) f133210c.clone();
    }

    private EnumC14225c(String str, int i10) {
    }
}
