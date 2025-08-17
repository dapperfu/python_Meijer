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
/* loaded from: classes13.dex */
public final class DescriptorRendererModifier {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f146001b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Set<DescriptorRendererModifier> f146002c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Set<DescriptorRendererModifier> f146003d;

    /* renamed from: e, reason: collision with root package name */
    public static final DescriptorRendererModifier f146004e = new DescriptorRendererModifier("VISIBILITY", 0, true);

    /* renamed from: f, reason: collision with root package name */
    public static final DescriptorRendererModifier f146005f = new DescriptorRendererModifier("MODALITY", 1, true);

    /* renamed from: g, reason: collision with root package name */
    public static final DescriptorRendererModifier f146006g = new DescriptorRendererModifier("OVERRIDE", 2, true);

    /* renamed from: h, reason: collision with root package name */
    public static final DescriptorRendererModifier f146007h = new DescriptorRendererModifier("ANNOTATIONS", 3, false);

    /* renamed from: i, reason: collision with root package name */
    public static final DescriptorRendererModifier f146008i = new DescriptorRendererModifier("INNER", 4, true);

    /* renamed from: j, reason: collision with root package name */
    public static final DescriptorRendererModifier f146009j = new DescriptorRendererModifier("MEMBER_KIND", 5, true);

    /* renamed from: k, reason: collision with root package name */
    public static final DescriptorRendererModifier f146010k = new DescriptorRendererModifier("DATA", 6, true);

    /* renamed from: l, reason: collision with root package name */
    public static final DescriptorRendererModifier f146011l = new DescriptorRendererModifier("INLINE", 7, true);

    /* renamed from: m, reason: collision with root package name */
    public static final DescriptorRendererModifier f146012m = new DescriptorRendererModifier("EXPECT", 8, true);

    /* renamed from: n, reason: collision with root package name */
    public static final DescriptorRendererModifier f146013n = new DescriptorRendererModifier("ACTUAL", 9, true);

    /* renamed from: o, reason: collision with root package name */
    public static final DescriptorRendererModifier f146014o = new DescriptorRendererModifier("CONST", 10, true);

    /* renamed from: p, reason: collision with root package name */
    public static final DescriptorRendererModifier f146015p = new DescriptorRendererModifier("LATEINIT", 11, true);

    /* renamed from: q, reason: collision with root package name */
    public static final DescriptorRendererModifier f146016q = new DescriptorRendererModifier("FUN", 12, true);

    /* renamed from: r, reason: collision with root package name */
    public static final DescriptorRendererModifier f146017r = new DescriptorRendererModifier("VALUE", 13, true);

    /* renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ DescriptorRendererModifier[] f146018s;

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146019t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f146020a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DescriptorRendererModifier[] a() {
        return new DescriptorRendererModifier[]{f146004e, f146005f, f146006g, f146007h, f146008i, f146009j, f146010k, f146011l, f146012m, f146013n, f146014o, f146015p, f146016q, f146017r};
    }

    static {
        DescriptorRendererModifier[] descriptorRendererModifierArrA = a();
        f146018s = descriptorRendererModifierArrA;
        f146019t = EnumEntriesKt.a(descriptorRendererModifierArrA);
        f146001b = new Companion(null);
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.f146020a) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        f146002c = CollectionsKt.o1(arrayList);
        f146003d = ArraysKt.u1(values());
    }

    public static DescriptorRendererModifier valueOf(String str) {
        return (DescriptorRendererModifier) Enum.valueOf(DescriptorRendererModifier.class, str);
    }

    public static DescriptorRendererModifier[] values() {
        return (DescriptorRendererModifier[]) f146018s.clone();
    }

    private DescriptorRendererModifier(String str, int i10, boolean z10) {
        this.f146020a = z10;
    }
}
