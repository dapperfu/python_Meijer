package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FqName {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f146585c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final FqName f146586d = new FqName("");

    /* renamed from: a, reason: collision with root package name */
    private final FqNameUnsafe f146587a;

    /* renamed from: b, reason: collision with root package name */
    private transient FqName f146588b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FqName a(Name shortName) {
            Intrinsics.j(shortName, "shortName");
            return new FqName(FqNameUnsafe.f146589e.a(shortName));
        }
    }

    public FqName(String fqName) {
        Intrinsics.j(fqName, "fqName");
        this.f146587a = new FqNameUnsafe(fqName, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && Intrinsics.e(this.f146587a, ((FqName) obj).f146587a);
    }

    public final String a() {
        return this.f146587a.a();
    }

    public final FqName b(Name name) {
        Intrinsics.j(name, "name");
        return new FqName(this.f146587a.b(name), this);
    }

    public final boolean c() {
        return this.f146587a.e();
    }

    public final FqName d() {
        FqName fqName = this.f146588b;
        if (fqName != null) {
            return fqName;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.f146587a.g());
        this.f146588b = fqName2;
        return fqName2;
    }

    public final List<Name> e() {
        return this.f146587a.h();
    }

    public final Name f() {
        return this.f146587a.j();
    }

    public final Name g() {
        return this.f146587a.k();
    }

    public final boolean h(Name segment) {
        Intrinsics.j(segment, "segment");
        return this.f146587a.l(segment);
    }

    public int hashCode() {
        return this.f146587a.hashCode();
    }

    public final FqNameUnsafe i() {
        return this.f146587a;
    }

    public String toString() {
        return this.f146587a.toString();
    }

    public FqName(FqNameUnsafe fqName) {
        Intrinsics.j(fqName, "fqName");
        this.f146587a = fqName;
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f146587a = fqNameUnsafe;
        this.f146588b = fqName;
    }
}
