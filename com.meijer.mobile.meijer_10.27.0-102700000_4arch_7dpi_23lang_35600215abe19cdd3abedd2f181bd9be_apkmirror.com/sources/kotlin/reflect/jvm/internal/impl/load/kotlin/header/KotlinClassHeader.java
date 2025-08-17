package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class KotlinClassHeader {

    /* renamed from: a, reason: collision with root package name */
    private final Kind f144856a;

    /* renamed from: b, reason: collision with root package name */
    private final MetadataVersion f144857b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f144858c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f144859d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f144860e;

    /* renamed from: f, reason: collision with root package name */
    private final String f144861f;

    /* renamed from: g, reason: collision with root package name */
    private final int f144862g;

    /* renamed from: h, reason: collision with root package name */
    private final String f144863h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f144864i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @SourceDebugExtension
    public static final class Kind {

        /* renamed from: b, reason: collision with root package name */
        public static final Companion f144865b;

        /* renamed from: c, reason: collision with root package name */
        private static final Map<Integer, Kind> f144866c;

        /* renamed from: d, reason: collision with root package name */
        public static final Kind f144867d = new Kind("UNKNOWN", 0, 0);

        /* renamed from: e, reason: collision with root package name */
        public static final Kind f144868e = new Kind("CLASS", 1, 1);

        /* renamed from: f, reason: collision with root package name */
        public static final Kind f144869f = new Kind("FILE_FACADE", 2, 2);

        /* renamed from: g, reason: collision with root package name */
        public static final Kind f144870g = new Kind("SYNTHETIC_CLASS", 3, 3);

        /* renamed from: h, reason: collision with root package name */
        public static final Kind f144871h = new Kind("MULTIFILE_CLASS", 4, 4);

        /* renamed from: i, reason: collision with root package name */
        public static final Kind f144872i = new Kind("MULTIFILE_CLASS_PART", 5, 5);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ Kind[] f144873j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f144874k;

        /* renamed from: a, reason: collision with root package name */
        private final int f144875a;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Kind a(int i10) {
                Kind kind = (Kind) Kind.f144866c.get(Integer.valueOf(i10));
                if (kind == null) {
                    return Kind.f144867d;
                }
                return kind;
            }
        }

        private static final /* synthetic */ Kind[] a() {
            return new Kind[]{f144867d, f144868e, f144869f, f144870g, f144871h, f144872i};
        }

        @JvmStatic
        public static final Kind e(int i10) {
            return f144865b.a(i10);
        }

        static {
            Kind[] kindArrA = a();
            f144873j = kindArrA;
            f144874k = EnumEntriesKt.a(kindArrA);
            f144865b = new Companion(null);
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f144875a), kind);
            }
            f144866c = linkedHashMap;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f144873j.clone();
        }

        private Kind(String str, int i10, int i11) {
            this.f144875a = i11;
        }
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public KotlinClassHeader(Kind kind, MetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(metadataVersion, "metadataVersion");
        this.f144856a = kind;
        this.f144857b = metadataVersion;
        this.f144858c = strArr;
        this.f144859d = strArr2;
        this.f144860e = strArr3;
        this.f144861f = str;
        this.f144862g = i10;
        this.f144863h = str2;
        this.f144864i = bArr;
    }

    public final String[] a() {
        return this.f144858c;
    }

    public final String[] b() {
        return this.f144859d;
    }

    public final Kind c() {
        return this.f144856a;
    }

    public final MetadataVersion d() {
        return this.f144857b;
    }

    public final String e() {
        String str = this.f144861f;
        if (this.f144856a == Kind.f144872i) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        String[] strArr = this.f144858c;
        if (this.f144856a != Kind.f144871h) {
            strArr = null;
        }
        List<String> listG = strArr != null ? ArraysKt.g(strArr) : null;
        return listG == null ? CollectionsKt.m() : listG;
    }

    public final String[] g() {
        return this.f144860e;
    }

    public final boolean i() {
        return h(this.f144862g, 2);
    }

    public final boolean j() {
        return h(this.f144862g, 16) && !h(this.f144862g, 32);
    }

    public String toString() {
        return this.f144856a + " version=" + this.f144857b;
    }
}
