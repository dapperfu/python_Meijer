package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FqName {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f145678c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final FqName f145679d = new FqName("");

    /* renamed from: a, reason: collision with root package name */
    private final FqNameUnsafe f145680a;

    /* renamed from: b, reason: collision with root package name */
    private transient FqName f145681b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FqName a(Name shortName) {
            Intrinsics.j(shortName, "shortName");
            return new FqName(FqNameUnsafe.f145682e.a(shortName));
        }
    }

    public FqName(String fqName) {
        Intrinsics.j(fqName, "fqName");
        this.f145680a = new FqNameUnsafe(fqName, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && Intrinsics.e(this.f145680a, ((FqName) obj).f145680a);
    }

    public final String a() {
        return this.f145680a.a();
    }

    public final FqName b(Name name) {
        Intrinsics.j(name, "name");
        return new FqName(this.f145680a.b(name), this);
    }

    public final boolean c() {
        return this.f145680a.e();
    }

    public final FqName d() {
        FqName fqName = this.f145681b;
        if (fqName != null) {
            return fqName;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.f145680a.g());
        this.f145681b = fqName2;
        return fqName2;
    }

    public final List<Name> e() {
        return this.f145680a.h();
    }

    public final Name f() {
        return this.f145680a.j();
    }

    public final Name g() {
        return this.f145680a.k();
    }

    public final boolean h(Name segment) {
        Intrinsics.j(segment, "segment");
        return this.f145680a.l(segment);
    }

    public int hashCode() {
        return this.f145680a.hashCode();
    }

    public final FqNameUnsafe i() {
        return this.f145680a;
    }

    public String toString() {
        return this.f145680a.toString();
    }

    public FqName(FqNameUnsafe fqName) {
        Intrinsics.j(fqName, "fqName");
        this.f145680a = fqName;
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f145680a = fqNameUnsafe;
        this.f145681b = fqName;
    }
}
