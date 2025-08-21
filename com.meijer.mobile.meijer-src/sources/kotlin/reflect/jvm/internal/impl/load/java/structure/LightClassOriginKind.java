package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class LightClassOriginKind {

    /* renamed from: a, reason: collision with root package name */
    public static final LightClassOriginKind f145518a = new LightClassOriginKind("SOURCE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final LightClassOriginKind f145519b = new LightClassOriginKind("BINARY", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ LightClassOriginKind[] f145520c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145521d;

    private static final /* synthetic */ LightClassOriginKind[] a() {
        return new LightClassOriginKind[]{f145518a, f145519b};
    }

    static {
        LightClassOriginKind[] lightClassOriginKindArrA = a();
        f145520c = lightClassOriginKindArrA;
        f145521d = EnumEntriesKt.a(lightClassOriginKindArrA);
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) f145520c.clone();
    }

    private LightClassOriginKind(String str, int i10) {
    }
}
