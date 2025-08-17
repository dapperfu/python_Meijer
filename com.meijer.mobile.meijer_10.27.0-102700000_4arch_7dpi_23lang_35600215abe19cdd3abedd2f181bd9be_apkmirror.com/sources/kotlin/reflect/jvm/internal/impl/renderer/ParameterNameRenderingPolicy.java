package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ParameterNameRenderingPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f146082a = new ParameterNameRenderingPolicy("ALL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f146083b = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f146084c = new ParameterNameRenderingPolicy("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ParameterNameRenderingPolicy[] f146085d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146086e;

    private static final /* synthetic */ ParameterNameRenderingPolicy[] a() {
        return new ParameterNameRenderingPolicy[]{f146082a, f146083b, f146084c};
    }

    static {
        ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArrA = a();
        f146085d = parameterNameRenderingPolicyArrA;
        f146086e = EnumEntriesKt.a(parameterNameRenderingPolicyArrA);
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) f146085d.clone();
    }

    private ParameterNameRenderingPolicy(String str, int i10) {
    }
}
