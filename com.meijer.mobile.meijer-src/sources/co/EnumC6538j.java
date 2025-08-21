package co;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lco/j;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6538j {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6538j f62778a = new EnumC6538j("TO_EARN_REWARDS_TAB", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6538j f62779b = new EnumC6538j("TO_CLAIM_REWARDS_TAB", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6538j f62780c = new EnumC6538j("TO_VIEW_REWARDS_TAB", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6538j[] f62781d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62782e;

    static {
        EnumC6538j[] enumC6538jArrA = a();
        f62781d = enumC6538jArrA;
        f62782e = EnumEntriesKt.a(enumC6538jArrA);
    }

    private static final /* synthetic */ EnumC6538j[] a() {
        return new EnumC6538j[]{f62778a, f62779b, f62780c};
    }

    public static EnumC6538j valueOf(String str) {
        return (EnumC6538j) Enum.valueOf(EnumC6538j.class, str);
    }

    public static EnumC6538j[] values() {
        return (EnumC6538j[]) f62781d.clone();
    }

    private EnumC6538j(String str, int i10) {
    }
}
