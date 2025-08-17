package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class NoLookupLocation implements LookupLocation {

    /* renamed from: a, reason: collision with root package name */
    public static final NoLookupLocation f144115a = new NoLookupLocation("FROM_IDE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final NoLookupLocation f144116b = new NoLookupLocation("FROM_BACKEND", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final NoLookupLocation f144117c = new NoLookupLocation("FROM_TEST", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final NoLookupLocation f144118d = new NoLookupLocation("FROM_BUILTINS", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final NoLookupLocation f144119e = new NoLookupLocation("WHEN_CHECK_DECLARATION_CONFLICTS", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final NoLookupLocation f144120f = new NoLookupLocation("WHEN_CHECK_OVERRIDES", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final NoLookupLocation f144121g = new NoLookupLocation("FOR_SCRIPT", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final NoLookupLocation f144122h = new NoLookupLocation("FROM_REFLECTION", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final NoLookupLocation f144123i = new NoLookupLocation("WHEN_RESOLVE_DECLARATION", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final NoLookupLocation f144124j = new NoLookupLocation("WHEN_GET_DECLARATION_SCOPE", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final NoLookupLocation f144125k = new NoLookupLocation("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final NoLookupLocation f144126l = new NoLookupLocation("FOR_ALREADY_TRACKED", 11);

    /* renamed from: m, reason: collision with root package name */
    public static final NoLookupLocation f144127m = new NoLookupLocation("WHEN_GET_ALL_DESCRIPTORS", 12);

    /* renamed from: n, reason: collision with root package name */
    public static final NoLookupLocation f144128n = new NoLookupLocation("WHEN_TYPING", 13);

    /* renamed from: o, reason: collision with root package name */
    public static final NoLookupLocation f144129o = new NoLookupLocation("WHEN_GET_SUPER_MEMBERS", 14);

    /* renamed from: p, reason: collision with root package name */
    public static final NoLookupLocation f144130p = new NoLookupLocation("FOR_NON_TRACKED_SCOPE", 15);

    /* renamed from: q, reason: collision with root package name */
    public static final NoLookupLocation f144131q = new NoLookupLocation("FROM_SYNTHETIC_SCOPE", 16);

    /* renamed from: r, reason: collision with root package name */
    public static final NoLookupLocation f144132r = new NoLookupLocation("FROM_DESERIALIZATION", 17);

    /* renamed from: s, reason: collision with root package name */
    public static final NoLookupLocation f144133s = new NoLookupLocation("FROM_JAVA_LOADER", 18);

    /* renamed from: t, reason: collision with root package name */
    public static final NoLookupLocation f144134t = new NoLookupLocation("WHEN_GET_LOCAL_VARIABLE", 19);

    /* renamed from: u, reason: collision with root package name */
    public static final NoLookupLocation f144135u = new NoLookupLocation("WHEN_FIND_BY_FQNAME", 20);

    /* renamed from: v, reason: collision with root package name */
    public static final NoLookupLocation f144136v = new NoLookupLocation("WHEN_GET_COMPANION_OBJECT", 21);

    /* renamed from: w, reason: collision with root package name */
    public static final NoLookupLocation f144137w = new NoLookupLocation("FOR_DEFAULT_IMPORTS", 22);

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ NoLookupLocation[] f144138x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144139y;

    private static final /* synthetic */ NoLookupLocation[] a() {
        return new NoLookupLocation[]{f144115a, f144116b, f144117c, f144118d, f144119e, f144120f, f144121g, f144122h, f144123i, f144124j, f144125k, f144126l, f144127m, f144128n, f144129o, f144130p, f144131q, f144132r, f144133s, f144134t, f144135u, f144136v, f144137w};
    }

    @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation
    public LocationInfo getLocation() {
        return null;
    }

    static {
        NoLookupLocation[] noLookupLocationArrA = a();
        f144138x = noLookupLocationArrA;
        f144139y = EnumEntriesKt.a(noLookupLocationArrA);
    }

    public static NoLookupLocation valueOf(String str) {
        return (NoLookupLocation) Enum.valueOf(NoLookupLocation.class, str);
    }

    public static NoLookupLocation[] values() {
        return (NoLookupLocation[]) f144138x.clone();
    }

    private NoLookupLocation(String str, int i10) {
    }
}
