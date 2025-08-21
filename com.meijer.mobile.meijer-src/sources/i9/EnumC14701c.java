package i9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Li9/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: i9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC14701c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14701c f137424a = new EnumC14701c("BEFORE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14701c f137425b = new EnumC14701c("AFTER", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC14701c[] f137426c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f137427d;

    static {
        EnumC14701c[] enumC14701cArrA = a();
        f137426c = enumC14701cArrA;
        f137427d = EnumEntriesKt.a(enumC14701cArrA);
    }

    private static final /* synthetic */ EnumC14701c[] a() {
        return new EnumC14701c[]{f137424a, f137425b};
    }

    public static EnumC14701c valueOf(String str) {
        return (EnumC14701c) Enum.valueOf(EnumC14701c.class, str);
    }

    public static EnumC14701c[] values() {
        return (EnumC14701c[]) f137426c.clone();
    }

    private EnumC14701c(String str, int i10) {
    }
}
