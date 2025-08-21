package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class OverrideRenderingPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final OverrideRenderingPolicy f146984a = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final OverrideRenderingPolicy f146985b = new OverrideRenderingPolicy("RENDER_OPEN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final OverrideRenderingPolicy f146986c = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ OverrideRenderingPolicy[] f146987d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146988e;

    private static final /* synthetic */ OverrideRenderingPolicy[] a() {
        return new OverrideRenderingPolicy[]{f146984a, f146985b, f146986c};
    }

    static {
        OverrideRenderingPolicy[] overrideRenderingPolicyArrA = a();
        f146987d = overrideRenderingPolicyArrA;
        f146988e = EnumEntriesKt.a(overrideRenderingPolicyArrA);
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) f146987d.clone();
    }

    private OverrideRenderingPolicy(String str, int i10) {
    }
}
