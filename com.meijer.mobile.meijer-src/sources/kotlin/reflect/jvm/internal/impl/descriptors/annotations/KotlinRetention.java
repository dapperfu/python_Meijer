package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class KotlinRetention {

    /* renamed from: a, reason: collision with root package name */
    public static final KotlinRetention f144609a = new KotlinRetention("RUNTIME", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final KotlinRetention f144610b = new KotlinRetention("BINARY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final KotlinRetention f144611c = new KotlinRetention("SOURCE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ KotlinRetention[] f144612d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144613e;

    private static final /* synthetic */ KotlinRetention[] a() {
        return new KotlinRetention[]{f144609a, f144610b, f144611c};
    }

    static {
        KotlinRetention[] kotlinRetentionArrA = a();
        f144612d = kotlinRetentionArrA;
        f144613e = EnumEntriesKt.a(kotlinRetentionArrA);
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) f144612d.clone();
    }

    private KotlinRetention(String str, int i10) {
    }
}
