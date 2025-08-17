package ej;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lej/o;", "", "", "partnerName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "b", "d", "e", "f", "g", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, o> f128949c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f128950d = new o("INSTACART", 0, "Instacart");

    /* renamed from: e, reason: collision with root package name */
    public static final o f128951e = new o("SHIPT", 1, "Shipt");

    /* renamed from: f, reason: collision with root package name */
    public static final o f128952f = new o("BUNCHA", 2, "Buncha");

    /* renamed from: g, reason: collision with root package name */
    public static final o f128953g = new o("NONE", 3, "");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ o[] f128954h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f128955i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String partnerName;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lej/o$a;", "", "<init>", "()V", "", "name", "Lej/o;", "a", "(Ljava/lang/String;)Lej/o;", "", "partnerMap", "Ljava/util/Map;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ej.o$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final o a(String name) {
            String lowerCase;
            Map map = o.f128949c;
            if (name != null) {
                lowerCase = name.toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            o oVar = (o) map.get(lowerCase);
            if (oVar == null) {
                return o.f128953g;
            }
            return oVar;
        }
    }

    public static EnumEntries<o> e() {
        return f128955i;
    }

    static {
        o[] oVarArrA = a();
        f128954h = oVarArrA;
        f128955i = EnumEntriesKt.a(oVarArrA);
        INSTANCE = new Companion(null);
        EnumEntries<o> enumEntriesE = e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(enumEntriesE, 10)), 16));
        for (o oVar : enumEntriesE) {
            String lowerCase = oVar.partnerName.toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            linkedHashMap.put(lowerCase, oVar);
        }
        f128949c = linkedHashMap;
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f128950d, f128951e, f128952f, f128953g};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f128954h.clone();
    }

    /* renamed from: l, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    private o(String str, int i10, String str2) {
        this.partnerName = str2;
    }
}
