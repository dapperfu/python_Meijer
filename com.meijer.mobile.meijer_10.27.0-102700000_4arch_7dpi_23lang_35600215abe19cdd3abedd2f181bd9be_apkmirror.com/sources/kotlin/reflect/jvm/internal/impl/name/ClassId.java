package kotlin.reflect.jvm.internal.impl.name;

import com.medallia.digital.mobilesdk.q2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ClassId {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f145674d = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final FqName f145675a;

    /* renamed from: b, reason: collision with root package name */
    private final FqName f145676b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f145677c;

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
            int iO0 = StringsKt.o0(string, '`', 0, false, 6, null);
            if (iO0 == -1) {
                iO0 = string.length();
            }
            int iW0 = StringsKt.w0(string, q2.f92724c, iO0, false, 4, null);
            if (iW0 == -1) {
                strQ = StringsKt.Q(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iW0);
                Intrinsics.i(strSubstring, "substring(...)");
                String strP = StringsKt.P(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = string.substring(iW0 + 1);
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
        this.f145675a = packageFqName;
        this.f145676b = relativeClassName;
        this.f145677c = z10;
        relativeClassName.c();
    }

    @JvmStatic
    public static final ClassId k(FqName fqName) {
        return f145674d.c(fqName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.e(this.f145675a, classId.f145675a) && Intrinsics.e(this.f145676b, classId.f145676b) && this.f145677c == classId.f145677c;
    }

    public int hashCode() {
        return (((this.f145675a.hashCode() * 31) + this.f145676b.hashCode()) * 31) + Boolean.hashCode(this.f145677c);
    }

    public final FqName a() {
        if (this.f145675a.c()) {
            return this.f145676b;
        }
        return new FqName(this.f145675a.a() + '.' + this.f145676b.a());
    }

    public final String b() {
        if (this.f145675a.c()) {
            return c(this.f145676b);
        }
        return StringsKt.P(this.f145675a.a(), '.', '/', false, 4, null) + q2.f92724c + c(this.f145676b);
    }

    public final ClassId d(Name name) {
        Intrinsics.j(name, "name");
        return new ClassId(this.f145675a, this.f145676b.b(name), this.f145677c);
    }

    public final ClassId e() {
        FqName fqNameD = this.f145676b.d();
        if (fqNameD.c()) {
            return null;
        }
        return new ClassId(this.f145675a, fqNameD, this.f145677c);
    }

    public final FqName f() {
        return this.f145675a;
    }

    public final FqName g() {
        return this.f145676b;
    }

    public final Name h() {
        return this.f145676b.f();
    }

    public final boolean i() {
        return this.f145677c;
    }

    public final boolean j() {
        return !this.f145676b.d().c();
    }

    public String toString() {
        if (!this.f145675a.c()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(FqName packageFqName, Name topLevelName) {
        this(packageFqName, FqName.f145678c.a(topLevelName), false);
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(topLevelName, "topLevelName");
    }

    private static final String c(FqName fqName) {
        String strA = fqName.a();
        if (StringsKt.b0(strA, '/', false, 2, null)) {
            return '`' + strA + '`';
        }
        return strA;
    }
}
