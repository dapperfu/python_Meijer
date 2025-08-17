package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class PropertyAccessorRenderingPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f146087a = new PropertyAccessorRenderingPolicy("PRETTY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f146088b = new PropertyAccessorRenderingPolicy("DEBUG", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f146089c = new PropertyAccessorRenderingPolicy("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ PropertyAccessorRenderingPolicy[] f146090d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146091e;

    private static final /* synthetic */ PropertyAccessorRenderingPolicy[] a() {
        return new PropertyAccessorRenderingPolicy[]{f146087a, f146088b, f146089c};
    }

    static {
        PropertyAccessorRenderingPolicy[] propertyAccessorRenderingPolicyArrA = a();
        f146090d = propertyAccessorRenderingPolicyArrA;
        f146091e = EnumEntriesKt.a(propertyAccessorRenderingPolicyArrA);
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) f146090d.clone();
    }

    private PropertyAccessorRenderingPolicy(String str, int i10) {
    }
}
