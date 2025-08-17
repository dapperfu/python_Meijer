package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class OverrideRenderingPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final OverrideRenderingPolicy f146077a = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final OverrideRenderingPolicy f146078b = new OverrideRenderingPolicy("RENDER_OPEN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final OverrideRenderingPolicy f146079c = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ OverrideRenderingPolicy[] f146080d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146081e;

    private static final /* synthetic */ OverrideRenderingPolicy[] a() {
        return new OverrideRenderingPolicy[]{f146077a, f146078b, f146079c};
    }

    static {
        OverrideRenderingPolicy[] overrideRenderingPolicyArrA = a();
        f146080d = overrideRenderingPolicyArrA;
        f146081e = EnumEntriesKt.a(overrideRenderingPolicyArrA);
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) f146080d.clone();
    }

    private OverrideRenderingPolicy(String str, int i10) {
    }
}
