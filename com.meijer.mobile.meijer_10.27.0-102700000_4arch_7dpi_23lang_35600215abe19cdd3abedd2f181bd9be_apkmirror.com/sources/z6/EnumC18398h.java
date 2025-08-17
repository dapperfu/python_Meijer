package z6;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lz6/h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC18398h {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18398h f171617a = new EnumC18398h("Get", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18398h f171618b = new EnumC18398h("Post", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC18398h[] f171619c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f171620d;

    static {
        EnumC18398h[] enumC18398hArrA = a();
        f171619c = enumC18398hArrA;
        f171620d = EnumEntriesKt.a(enumC18398hArrA);
    }

    private static final /* synthetic */ EnumC18398h[] a() {
        return new EnumC18398h[]{f171617a, f171618b};
    }

    public static EnumC18398h valueOf(String str) {
        return (EnumC18398h) Enum.valueOf(EnumC18398h.class, str);
    }

    public static EnumC18398h[] values() {
        return (EnumC18398h[]) f171619c.clone();
    }

    private EnumC18398h(String str, int i10) {
    }
}
