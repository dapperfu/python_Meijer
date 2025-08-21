package kotlin.reflect.jvm.internal.impl.name;

import com.medallia.digital.mobilesdk.q2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CallableId {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f146573f = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Name f146574g;

    /* renamed from: h, reason: collision with root package name */
    private static final FqName f146575h;

    /* renamed from: a, reason: collision with root package name */
    private final FqName f146576a;

    /* renamed from: b, reason: collision with root package name */
    private final FqName f146577b;

    /* renamed from: c, reason: collision with root package name */
    private final Name f146578c;

    /* renamed from: d, reason: collision with root package name */
    private final ClassId f146579d;

    /* renamed from: e, reason: collision with root package name */
    private final FqName f146580e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private CallableId(FqName fqName, FqName fqName2, Name name, ClassId classId, FqName fqName3) {
        this.f146576a = fqName;
        this.f146577b = fqName2;
        this.f146578c = name;
        this.f146579d = classId;
        this.f146580e = fqName3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.e(this.f146576a, callableId.f146576a) && Intrinsics.e(this.f146577b, callableId.f146577b) && Intrinsics.e(this.f146578c, callableId.f146578c);
    }

    static {
        Name name = SpecialNames.f146613m;
        f146574g = name;
        f146575h = FqName.f146585c.a(name);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f146576a.hashCode()) * 31;
        FqName fqName = this.f146577b;
        return ((iHashCode + (fqName != null ? fqName.hashCode() : 0)) * 31) + this.f146578c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringsKt.P(this.f146576a.a(), '.', '/', false, 4, null));
        sb2.append(q2.f93563c);
        FqName fqName = this.f146577b;
        if (fqName != null) {
            sb2.append(fqName);
            sb2.append(".");
        }
        sb2.append(this.f146578c);
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(FqName packageName, Name callableName) {
        this(packageName, null, callableName, null, null);
        Intrinsics.j(packageName, "packageName");
        Intrinsics.j(callableName, "callableName");
    }
}
