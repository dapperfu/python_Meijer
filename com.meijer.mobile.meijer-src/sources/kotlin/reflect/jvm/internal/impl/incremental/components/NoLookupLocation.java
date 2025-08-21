package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class NoLookupLocation implements LookupLocation {

    /* renamed from: a, reason: collision with root package name */
    public static final NoLookupLocation f145022a = new NoLookupLocation("FROM_IDE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final NoLookupLocation f145023b = new NoLookupLocation("FROM_BACKEND", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final NoLookupLocation f145024c = new NoLookupLocation("FROM_TEST", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final NoLookupLocation f145025d = new NoLookupLocation("FROM_BUILTINS", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final NoLookupLocation f145026e = new NoLookupLocation("WHEN_CHECK_DECLARATION_CONFLICTS", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final NoLookupLocation f145027f = new NoLookupLocation("WHEN_CHECK_OVERRIDES", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final NoLookupLocation f145028g = new NoLookupLocation("FOR_SCRIPT", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final NoLookupLocation f145029h = new NoLookupLocation("FROM_REFLECTION", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final NoLookupLocation f145030i = new NoLookupLocation("WHEN_RESOLVE_DECLARATION", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final NoLookupLocation f145031j = new NoLookupLocation("WHEN_GET_DECLARATION_SCOPE", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final NoLookupLocation f145032k = new NoLookupLocation("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final NoLookupLocation f145033l = new NoLookupLocation("FOR_ALREADY_TRACKED", 11);

    /* renamed from: m, reason: collision with root package name */
    public static final NoLookupLocation f145034m = new NoLookupLocation("WHEN_GET_ALL_DESCRIPTORS", 12);

    /* renamed from: n, reason: collision with root package name */
    public static final NoLookupLocation f145035n = new NoLookupLocation("WHEN_TYPING", 13);

    /* renamed from: o, reason: collision with root package name */
    public static final NoLookupLocation f145036o = new NoLookupLocation("WHEN_GET_SUPER_MEMBERS", 14);

    /* renamed from: p, reason: collision with root package name */
    public static final NoLookupLocation f145037p = new NoLookupLocation("FOR_NON_TRACKED_SCOPE", 15);

    /* renamed from: q, reason: collision with root package name */
    public static final NoLookupLocation f145038q = new NoLookupLocation("FROM_SYNTHETIC_SCOPE", 16);

    /* renamed from: r, reason: collision with root package name */
    public static final NoLookupLocation f145039r = new NoLookupLocation("FROM_DESERIALIZATION", 17);

    /* renamed from: s, reason: collision with root package name */
    public static final NoLookupLocation f145040s = new NoLookupLocation("FROM_JAVA_LOADER", 18);

    /* renamed from: t, reason: collision with root package name */
    public static final NoLookupLocation f145041t = new NoLookupLocation("WHEN_GET_LOCAL_VARIABLE", 19);

    /* renamed from: u, reason: collision with root package name */
    public static final NoLookupLocation f145042u = new NoLookupLocation("WHEN_FIND_BY_FQNAME", 20);

    /* renamed from: v, reason: collision with root package name */
    public static final NoLookupLocation f145043v = new NoLookupLocation("WHEN_GET_COMPANION_OBJECT", 21);

    /* renamed from: w, reason: collision with root package name */
    public static final NoLookupLocation f145044w = new NoLookupLocation("FOR_DEFAULT_IMPORTS", 22);

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ NoLookupLocation[] f145045x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145046y;

    private static final /* synthetic */ NoLookupLocation[] a() {
        return new NoLookupLocation[]{f145022a, f145023b, f145024c, f145025d, f145026e, f145027f, f145028g, f145029h, f145030i, f145031j, f145032k, f145033l, f145034m, f145035n, f145036o, f145037p, f145038q, f145039r, f145040s, f145041t, f145042u, f145043v, f145044w};
    }

    @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation
    public LocationInfo getLocation() {
        return null;
    }

    static {
        NoLookupLocation[] noLookupLocationArrA = a();
        f145045x = noLookupLocationArrA;
        f145046y = EnumEntriesKt.a(noLookupLocationArrA);
    }

    public static NoLookupLocation valueOf(String str) {
        return (NoLookupLocation) Enum.valueOf(NoLookupLocation.class, str);
    }

    public static NoLookupLocation[] values() {
        return (NoLookupLocation[]) f145045x.clone();
    }

    private NoLookupLocation(String str, int i10) {
    }
}
