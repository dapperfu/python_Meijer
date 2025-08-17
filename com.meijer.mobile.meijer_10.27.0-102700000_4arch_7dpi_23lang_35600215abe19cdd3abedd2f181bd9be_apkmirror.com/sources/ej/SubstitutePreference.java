package ej;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B+\b\u0000\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lej/D;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "meijerCode", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "getMeijerCode", "c", "g", "d", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.D, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SubstitutePreference {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final SubstitutePreference f128813e;

    /* renamed from: f, reason: collision with root package name */
    private static final SubstitutePreference f128814f;

    /* renamed from: g, reason: collision with root package name */
    private static final SubstitutePreference f128815g;

    /* renamed from: h, reason: collision with root package name */
    private static final SubstitutePreference f128816h;

    /* renamed from: i, reason: collision with root package name */
    private static final List<SubstitutePreference> f128817i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String meijerCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\fR \u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\fR&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lej/D$a;", "", "<init>", "()V", "", "preferenceName", "Lej/D;", "f", "(Ljava/lang/String;)Lej/D;", "MeijerBrand", "Lej/D;", "b", "()Lej/D;", "getMeijerBrand$annotations", "NationalBrand", "c", "getNationalBrand$annotations", "NoSubstitutions", "d", "getNoSubstitutions$annotations", "AnyBrand", "a", "getAnyBrand$annotations", "", "options", "Ljava/util/List;", "e", "()Ljava/util/List;", "getOptions$annotations", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ej.D$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubstitutePreference a() {
            return SubstitutePreference.f128816h;
        }

        public final SubstitutePreference b() {
            return SubstitutePreference.f128813e;
        }

        public final SubstitutePreference c() {
            return SubstitutePreference.f128814f;
        }

        public final SubstitutePreference d() {
            return SubstitutePreference.f128815g;
        }

        public final List<SubstitutePreference> e() {
            return SubstitutePreference.f128817i;
        }

        public final SubstitutePreference f(String preferenceName) {
            if (Intrinsics.e(preferenceName, b().getName())) {
                return b();
            }
            if (Intrinsics.e(preferenceName, c().getName())) {
                return c();
            }
            if (Intrinsics.e(preferenceName, d().getName())) {
                return d();
            }
            return a();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubstitutePreference)) {
            return false;
        }
        SubstitutePreference substitutePreference = (SubstitutePreference) other;
        return Intrinsics.e(this.code, substitutePreference.code) && Intrinsics.e(this.meijerCode, substitutePreference.meijerCode) && Intrinsics.e(this.name, substitutePreference.name);
    }

    static {
        SubstitutePreference substitutePreference = new SubstitutePreference("MEIJER_BRAND", "0", "Meijer Brand");
        f128813e = substitutePreference;
        SubstitutePreference substitutePreference2 = new SubstitutePreference("NATIONAL_BRAND", "0", "National Brand");
        f128814f = substitutePreference2;
        SubstitutePreference substitutePreference3 = new SubstitutePreference("NO_SUBSTITUTIONS", "0", "No Substitutions");
        f128815g = substitutePreference3;
        SubstitutePreference substitutePreference4 = new SubstitutePreference("ANY_BRAND", "69", "Any Brand");
        f128816h = substitutePreference4;
        f128817i = CollectionsKt.p(substitutePreference, substitutePreference2, substitutePreference3, substitutePreference4);
    }

    public SubstitutePreference(String code, String meijerCode, String str) {
        Intrinsics.j(code, "code");
        Intrinsics.j(meijerCode, "meijerCode");
        this.code = code;
        this.meijerCode = meijerCode;
        this.name = str;
    }

    /* renamed from: f, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.meijerCode.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SubstitutePreference(code=" + this.code + ", meijerCode=" + this.meijerCode + ", name=" + this.name + ')';
    }
}
