package a9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"La9/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: a9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5671c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5671c f45309a = new EnumC5671c("CONNECTED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5671c f45310b = new EnumC5671c("CONNECTED_MOBILE_DATA", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5671c f45311c = new EnumC5671c("DISCONNECTED", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC5671c[] f45312d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f45313e;

    static {
        EnumC5671c[] enumC5671cArrA = a();
        f45312d = enumC5671cArrA;
        f45313e = EnumEntriesKt.a(enumC5671cArrA);
    }

    private static final /* synthetic */ EnumC5671c[] a() {
        return new EnumC5671c[]{f45309a, f45310b, f45311c};
    }

    public static EnumC5671c valueOf(String str) {
        return (EnumC5671c) Enum.valueOf(EnumC5671c.class, str);
    }

    public static EnumC5671c[] values() {
        return (EnumC5671c[]) f45312d.clone();
    }

    private EnumC5671c(String str, int i10) {
    }
}
