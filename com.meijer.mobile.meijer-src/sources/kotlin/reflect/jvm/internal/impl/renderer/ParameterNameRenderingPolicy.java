package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class ParameterNameRenderingPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f146989a = new ParameterNameRenderingPolicy("ALL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f146990b = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f146991c = new ParameterNameRenderingPolicy("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ParameterNameRenderingPolicy[] f146992d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146993e;

    private static final /* synthetic */ ParameterNameRenderingPolicy[] a() {
        return new ParameterNameRenderingPolicy[]{f146989a, f146990b, f146991c};
    }

    static {
        ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArrA = a();
        f146992d = parameterNameRenderingPolicyArrA;
        f146993e = EnumEntriesKt.a(parameterNameRenderingPolicyArrA);
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) f146992d.clone();
    }

    private ParameterNameRenderingPolicy(String str, int i10) {
    }
}
