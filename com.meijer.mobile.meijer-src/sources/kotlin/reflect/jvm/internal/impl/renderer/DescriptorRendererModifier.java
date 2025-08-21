package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DescriptorRendererModifier {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f146908b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Set<DescriptorRendererModifier> f146909c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Set<DescriptorRendererModifier> f146910d;

    /* renamed from: e, reason: collision with root package name */
    public static final DescriptorRendererModifier f146911e = new DescriptorRendererModifier("VISIBILITY", 0, true);

    /* renamed from: f, reason: collision with root package name */
    public static final DescriptorRendererModifier f146912f = new DescriptorRendererModifier("MODALITY", 1, true);

    /* renamed from: g, reason: collision with root package name */
    public static final DescriptorRendererModifier f146913g = new DescriptorRendererModifier("OVERRIDE", 2, true);

    /* renamed from: h, reason: collision with root package name */
    public static final DescriptorRendererModifier f146914h = new DescriptorRendererModifier("ANNOTATIONS", 3, false);

    /* renamed from: i, reason: collision with root package name */
    public static final DescriptorRendererModifier f146915i = new DescriptorRendererModifier("INNER", 4, true);

    /* renamed from: j, reason: collision with root package name */
    public static final DescriptorRendererModifier f146916j = new DescriptorRendererModifier("MEMBER_KIND", 5, true);

    /* renamed from: k, reason: collision with root package name */
    public static final DescriptorRendererModifier f146917k = new DescriptorRendererModifier("DATA", 6, true);

    /* renamed from: l, reason: collision with root package name */
    public static final DescriptorRendererModifier f146918l = new DescriptorRendererModifier("INLINE", 7, true);

    /* renamed from: m, reason: collision with root package name */
    public static final DescriptorRendererModifier f146919m = new DescriptorRendererModifier("EXPECT", 8, true);

    /* renamed from: n, reason: collision with root package name */
    public static final DescriptorRendererModifier f146920n = new DescriptorRendererModifier("ACTUAL", 9, true);

    /* renamed from: o, reason: collision with root package name */
    public static final DescriptorRendererModifier f146921o = new DescriptorRendererModifier("CONST", 10, true);

    /* renamed from: p, reason: collision with root package name */
    public static final DescriptorRendererModifier f146922p = new DescriptorRendererModifier("LATEINIT", 11, true);

    /* renamed from: q, reason: collision with root package name */
    public static final DescriptorRendererModifier f146923q = new DescriptorRendererModifier("FUN", 12, true);

    /* renamed from: r, reason: collision with root package name */
    public static final DescriptorRendererModifier f146924r = new DescriptorRendererModifier("VALUE", 13, true);

    /* renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ DescriptorRendererModifier[] f146925s;

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146926t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f146927a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DescriptorRendererModifier[] a() {
        return new DescriptorRendererModifier[]{f146911e, f146912f, f146913g, f146914h, f146915i, f146916j, f146917k, f146918l, f146919m, f146920n, f146921o, f146922p, f146923q, f146924r};
    }

    static {
        DescriptorRendererModifier[] descriptorRendererModifierArrA = a();
        f146925s = descriptorRendererModifierArrA;
        f146926t = EnumEntriesKt.a(descriptorRendererModifierArrA);
        f146908b = new Companion(null);
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.f146927a) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        f146909c = CollectionsKt.o1(arrayList);
        f146910d = ArraysKt.t1(values());
    }

    public static DescriptorRendererModifier valueOf(String str) {
        return (DescriptorRendererModifier) Enum.valueOf(DescriptorRendererModifier.class, str);
    }

    public static DescriptorRendererModifier[] values() {
        return (DescriptorRendererModifier[]) f146925s.clone();
    }

    private DescriptorRendererModifier(String str, int i10, boolean z10) {
        this.f146927a = z10;
    }
}
