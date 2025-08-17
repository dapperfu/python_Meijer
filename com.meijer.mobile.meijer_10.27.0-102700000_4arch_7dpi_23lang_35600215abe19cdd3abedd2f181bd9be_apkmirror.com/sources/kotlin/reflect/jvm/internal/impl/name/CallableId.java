package kotlin.reflect.jvm.internal.impl.name;

import com.medallia.digital.mobilesdk.q2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CallableId {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f145666f = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Name f145667g;

    /* renamed from: h, reason: collision with root package name */
    private static final FqName f145668h;

    /* renamed from: a, reason: collision with root package name */
    private final FqName f145669a;

    /* renamed from: b, reason: collision with root package name */
    private final FqName f145670b;

    /* renamed from: c, reason: collision with root package name */
    private final Name f145671c;

    /* renamed from: d, reason: collision with root package name */
    private final ClassId f145672d;

    /* renamed from: e, reason: collision with root package name */
    private final FqName f145673e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private CallableId(FqName fqName, FqName fqName2, Name name, ClassId classId, FqName fqName3) {
        this.f145669a = fqName;
        this.f145670b = fqName2;
        this.f145671c = name;
        this.f145672d = classId;
        this.f145673e = fqName3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.e(this.f145669a, callableId.f145669a) && Intrinsics.e(this.f145670b, callableId.f145670b) && Intrinsics.e(this.f145671c, callableId.f145671c);
    }

    static {
        Name name = SpecialNames.f145706m;
        f145667g = name;
        f145668h = FqName.f145678c.a(name);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f145669a.hashCode()) * 31;
        FqName fqName = this.f145670b;
        return ((iHashCode + (fqName != null ? fqName.hashCode() : 0)) * 31) + this.f145671c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringsKt.P(this.f145669a.a(), '.', '/', false, 4, null));
        sb2.append(q2.f92724c);
        FqName fqName = this.f145670b;
        if (fqName != null) {
            sb2.append(fqName);
            sb2.append(".");
        }
        sb2.append(this.f145671c);
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(FqName packageName, Name callableName) {
        this(packageName, null, callableName, null, null);
        Intrinsics.j(packageName, "packageName");
        Intrinsics.j(callableName, "callableName");
    }
}
