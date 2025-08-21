package kotlin.reflect.jvm.internal.impl.name;

import com.medallia.digital.mobilesdk.q2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ClassId {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f146581d = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final FqName f146582a;

    /* renamed from: b, reason: collision with root package name */
    private final FqName f146583b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f146584c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ClassId b(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.a(str, z10);
        }

        @JvmStatic
        @JvmOverloads
        public final ClassId a(String string, boolean z10) {
            String strQ;
            String str;
            Intrinsics.j(string, "string");
            int iP0 = StringsKt.p0(string, '`', 0, false, 6, null);
            if (iP0 == -1) {
                iP0 = string.length();
            }
            int iX0 = StringsKt.x0(string, q2.f93563c, iP0, false, 4, null);
            if (iX0 == -1) {
                strQ = StringsKt.Q(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iX0);
                Intrinsics.i(strSubstring, "substring(...)");
                String strP = StringsKt.P(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = string.substring(iX0 + 1);
                Intrinsics.i(strSubstring2, "substring(...)");
                strQ = StringsKt.Q(strSubstring2, "`", "", false, 4, null);
                str = strP;
            }
            return new ClassId(new FqName(str), new FqName(strQ), z10);
        }

        @JvmStatic
        public final ClassId c(FqName topLevelFqName) {
            Intrinsics.j(topLevelFqName, "topLevelFqName");
            return new ClassId(topLevelFqName.d(), topLevelFqName.f());
        }
    }

    public ClassId(FqName packageFqName, FqName relativeClassName, boolean z10) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(relativeClassName, "relativeClassName");
        this.f146582a = packageFqName;
        this.f146583b = relativeClassName;
        this.f146584c = z10;
        relativeClassName.c();
    }

    @JvmStatic
    public static final ClassId k(FqName fqName) {
        return f146581d.c(fqName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.e(this.f146582a, classId.f146582a) && Intrinsics.e(this.f146583b, classId.f146583b) && this.f146584c == classId.f146584c;
    }

    public int hashCode() {
        return (((this.f146582a.hashCode() * 31) + this.f146583b.hashCode()) * 31) + Boolean.hashCode(this.f146584c);
    }

    public final FqName a() {
        if (this.f146582a.c()) {
            return this.f146583b;
        }
        return new FqName(this.f146582a.a() + '.' + this.f146583b.a());
    }

    public final String b() {
        if (this.f146582a.c()) {
            return c(this.f146583b);
        }
        return StringsKt.P(this.f146582a.a(), '.', '/', false, 4, null) + q2.f93563c + c(this.f146583b);
    }

    public final ClassId d(Name name) {
        Intrinsics.j(name, "name");
        return new ClassId(this.f146582a, this.f146583b.b(name), this.f146584c);
    }

    public final ClassId e() {
        FqName fqNameD = this.f146583b.d();
        if (fqNameD.c()) {
            return null;
        }
        return new ClassId(this.f146582a, fqNameD, this.f146584c);
    }

    public final FqName f() {
        return this.f146582a;
    }

    public final FqName g() {
        return this.f146583b;
    }

    public final Name h() {
        return this.f146583b.f();
    }

    public final boolean i() {
        return this.f146584c;
    }

    public final boolean j() {
        return !this.f146583b.d().c();
    }

    public String toString() {
        if (!this.f146582a.c()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(FqName packageFqName, Name topLevelName) {
        this(packageFqName, FqName.f146585c.a(topLevelName), false);
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(topLevelName, "topLevelName");
    }

    private static final String c(FqName fqName) {
        String strA = fqName.a();
        if (StringsKt.c0(strA, '/', false, 2, null)) {
            return '`' + strA + '`';
        }
        return strA;
    }
}
