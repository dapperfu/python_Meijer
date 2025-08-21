package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class PropertyAccessorRenderingPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f146994a = new PropertyAccessorRenderingPolicy("PRETTY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f146995b = new PropertyAccessorRenderingPolicy("DEBUG", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f146996c = new PropertyAccessorRenderingPolicy("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ PropertyAccessorRenderingPolicy[] f146997d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146998e;

    private static final /* synthetic */ PropertyAccessorRenderingPolicy[] a() {
        return new PropertyAccessorRenderingPolicy[]{f146994a, f146995b, f146996c};
    }

    static {
        PropertyAccessorRenderingPolicy[] propertyAccessorRenderingPolicyArrA = a();
        f146997d = propertyAccessorRenderingPolicyArrA;
        f146998e = EnumEntriesKt.a(propertyAccessorRenderingPolicyArrA);
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) f146997d.clone();
    }

    private PropertyAccessorRenderingPolicy(String str, int i10) {
    }
}
