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
/* loaded from: classes14.dex */
public final class KotlinClassHeader {

    /* renamed from: a, reason: collision with root package name */
    private final Kind f145763a;

    /* renamed from: b, reason: collision with root package name */
    private final MetadataVersion f145764b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f145765c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f145766d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f145767e;

    /* renamed from: f, reason: collision with root package name */
    private final String f145768f;

    /* renamed from: g, reason: collision with root package name */
    private final int f145769g;

    /* renamed from: h, reason: collision with root package name */
    private final String f145770h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f145771i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @SourceDebugExtension
    public static final class Kind {

        /* renamed from: b, reason: collision with root package name */
        public static final Companion f145772b;

        /* renamed from: c, reason: collision with root package name */
        private static final Map<Integer, Kind> f145773c;

        /* renamed from: d, reason: collision with root package name */
        public static final Kind f145774d = new Kind("UNKNOWN", 0, 0);

        /* renamed from: e, reason: collision with root package name */
        public static final Kind f145775e = new Kind("CLASS", 1, 1);

        /* renamed from: f, reason: collision with root package name */
        public static final Kind f145776f = new Kind("FILE_FACADE", 2, 2);

        /* renamed from: g, reason: collision with root package name */
        public static final Kind f145777g = new Kind("SYNTHETIC_CLASS", 3, 3);

        /* renamed from: h, reason: collision with root package name */
        public static final Kind f145778h = new Kind("MULTIFILE_CLASS", 4, 4);

        /* renamed from: i, reason: collision with root package name */
        public static final Kind f145779i = new Kind("MULTIFILE_CLASS_PART", 5, 5);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ Kind[] f145780j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f145781k;

        /* renamed from: a, reason: collision with root package name */
        private final int f145782a;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Kind a(int i10) {
                Kind kind = (Kind) Kind.f145773c.get(Integer.valueOf(i10));
                if (kind == null) {
                    return Kind.f145774d;
                }
                return kind;
            }
        }

        private static final /* synthetic */ Kind[] a() {
            return new Kind[]{f145774d, f145775e, f145776f, f145777g, f145778h, f145779i};
        }

        @JvmStatic
        public static final Kind e(int i10) {
            return f145772b.a(i10);
        }

        static {
            Kind[] kindArrA = a();
            f145780j = kindArrA;
            f145781k = EnumEntriesKt.a(kindArrA);
            f145772b = new Companion(null);
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f145782a), kind);
            }
            f145773c = linkedHashMap;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f145780j.clone();
        }

        private Kind(String str, int i10, int i11) {
            this.f145782a = i11;
        }
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public KotlinClassHeader(Kind kind, MetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(metadataVersion, "metadataVersion");
        this.f145763a = kind;
        this.f145764b = metadataVersion;
        this.f145765c = strArr;
        this.f145766d = strArr2;
        this.f145767e = strArr3;
        this.f145768f = str;
        this.f145769g = i10;
        this.f145770h = str2;
        this.f145771i = bArr;
    }

    public final String[] a() {
        return this.f145765c;
    }

    public final String[] b() {
        return this.f145766d;
    }

    public final Kind c() {
        return this.f145763a;
    }

    public final MetadataVersion d() {
        return this.f145764b;
    }

    public final String e() {
        String str = this.f145768f;
        if (this.f145763a == Kind.f145779i) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        String[] strArr = this.f145765c;
        if (this.f145763a != Kind.f145778h) {
            strArr = null;
        }
        List<String> listG = strArr != null ? ArraysKt.g(strArr) : null;
        return listG == null ? CollectionsKt.m() : listG;
    }

    public final String[] g() {
        return this.f145767e;
    }

    public final boolean i() {
        return h(this.f145769g, 2);
    }

    public final boolean j() {
        return h(this.f145769g, 16) && !h(this.f145769g, 32);
    }

    public String toString() {
        return this.f145763a + " version=" + this.f145764b;
    }
}
