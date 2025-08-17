package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class LightClassOriginKind {

    /* renamed from: a, reason: collision with root package name */
    public static final LightClassOriginKind f144611a = new LightClassOriginKind("SOURCE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final LightClassOriginKind f144612b = new LightClassOriginKind("BINARY", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ LightClassOriginKind[] f144613c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144614d;

    private static final /* synthetic */ LightClassOriginKind[] a() {
        return new LightClassOriginKind[]{f144611a, f144612b};
    }

    static {
        LightClassOriginKind[] lightClassOriginKindArrA = a();
        f144613c = lightClassOriginKindArrA;
        f144614d = EnumEntriesKt.a(lightClassOriginKindArrA);
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) f144613c.clone();
    }

    private LightClassOriginKind(String str, int i10) {
    }
}
