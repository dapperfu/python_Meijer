package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FqNameUnsafe {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f146589e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Name f146590f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f146591g;

    /* renamed from: a, reason: collision with root package name */
    private final String f146592a;

    /* renamed from: b, reason: collision with root package name */
    private transient FqName f146593b;

    /* renamed from: c, reason: collision with root package name */
    private transient FqNameUnsafe f146594c;

    /* renamed from: d, reason: collision with root package name */
    private transient Name f146595d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FqNameUnsafe a(Name shortName) {
            Intrinsics.j(shortName, "shortName");
            String strB = shortName.b();
            Intrinsics.i(strB, "asString(...)");
            return new FqNameUnsafe(strB, FqName.f146586d.i(), shortName, null);
        }
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && Intrinsics.e(this.f146592a, ((FqNameUnsafe) obj).f146592a);
    }

    static {
        Name nameU = Name.u("<root>");
        Intrinsics.i(nameU, "special(...)");
        f146590f = nameU;
        Pattern patternCompile = Pattern.compile("\\.");
        Intrinsics.i(patternCompile, "compile(...)");
        f146591g = patternCompile;
    }

    public FqNameUnsafe(String fqName, FqName safe) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(safe, "safe");
        this.f146592a = fqName;
        this.f146593b = safe;
    }

    private final void c() {
        int iD = d(this.f146592a);
        if (iD < 0) {
            this.f146595d = Name.m(this.f146592a);
            this.f146594c = FqName.f146586d.i();
            return;
        }
        String strSubstring = this.f146592a.substring(iD + 1);
        Intrinsics.i(strSubstring, "substring(...)");
        this.f146595d = Name.m(strSubstring);
        String strSubstring2 = this.f146592a.substring(0, iD);
        Intrinsics.i(strSubstring2, "substring(...)");
        this.f146594c = new FqNameUnsafe(strSubstring2);
    }

    public final String a() {
        return this.f146592a;
    }

    public final FqNameUnsafe b(Name name) {
        String strB;
        Intrinsics.j(name, "name");
        if (e()) {
            strB = name.b();
        } else {
            strB = this.f146592a + '.' + name.b();
        }
        Intrinsics.g(strB);
        return new FqNameUnsafe(strB, this, name);
    }

    public final boolean e() {
        return this.f146592a.length() == 0;
    }

    public final boolean f() {
        return this.f146593b != null || StringsKt.p0(a(), '<', 0, false, 6, null) < 0;
    }

    public final FqNameUnsafe g() {
        FqNameUnsafe fqNameUnsafe = this.f146594c;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        FqNameUnsafe fqNameUnsafe2 = this.f146594c;
        Intrinsics.g(fqNameUnsafe2);
        return fqNameUnsafe2;
    }

    public int hashCode() {
        return this.f146592a.hashCode();
    }

    public final Name j() {
        Name name = this.f146595d;
        if (name != null) {
            return name;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        Name name2 = this.f146595d;
        Intrinsics.g(name2);
        return name2;
    }

    public final boolean l(Name segment) {
        Intrinsics.j(segment, "segment");
        if (e()) {
            return false;
        }
        int iP0 = StringsKt.p0(this.f146592a, '.', 0, false, 6, null);
        if (iP0 == -1) {
            iP0 = this.f146592a.length();
        }
        int i10 = iP0;
        String strB = segment.b();
        Intrinsics.i(strB, "asString(...)");
        return i10 == strB.length() && StringsKt.L(this.f146592a, 0, strB, 0, i10, false, 16, null);
    }

    public final FqName m() {
        FqName fqName = this.f146593b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f146593b = fqName2;
        return fqName2;
    }

    private final int d(String str) {
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                return length;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List<Name> i(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.e()) {
            return new ArrayList();
        }
        List<Name> listI = i(fqNameUnsafe.g());
        listI.add(fqNameUnsafe.j());
        return listI;
    }

    public final List<Name> h() {
        return i(this);
    }

    public final Name k() {
        if (e()) {
            return f146590f;
        }
        return j();
    }

    public String toString() {
        if (e()) {
            String strB = f146590f.b();
            Intrinsics.i(strB, "asString(...)");
            return strB;
        }
        return this.f146592a;
    }

    public FqNameUnsafe(String fqName) {
        Intrinsics.j(fqName, "fqName");
        this.f146592a = fqName;
    }

    private FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f146592a = str;
        this.f146594c = fqNameUnsafe;
        this.f146595d = name;
    }
}
