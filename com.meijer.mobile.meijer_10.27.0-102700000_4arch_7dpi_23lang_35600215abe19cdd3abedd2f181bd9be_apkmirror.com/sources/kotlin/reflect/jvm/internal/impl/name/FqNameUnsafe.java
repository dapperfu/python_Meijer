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
/* loaded from: classes13.dex */
public final class FqNameUnsafe {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f145682e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Name f145683f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f145684g;

    /* renamed from: a, reason: collision with root package name */
    private final String f145685a;

    /* renamed from: b, reason: collision with root package name */
    private transient FqName f145686b;

    /* renamed from: c, reason: collision with root package name */
    private transient FqNameUnsafe f145687c;

    /* renamed from: d, reason: collision with root package name */
    private transient Name f145688d;

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
            return new FqNameUnsafe(strB, FqName.f145679d.i(), shortName, null);
        }
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && Intrinsics.e(this.f145685a, ((FqNameUnsafe) obj).f145685a);
    }

    static {
        Name nameU = Name.u("<root>");
        Intrinsics.i(nameU, "special(...)");
        f145683f = nameU;
        Pattern patternCompile = Pattern.compile("\\.");
        Intrinsics.i(patternCompile, "compile(...)");
        f145684g = patternCompile;
    }

    public FqNameUnsafe(String fqName, FqName safe) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(safe, "safe");
        this.f145685a = fqName;
        this.f145686b = safe;
    }

    private final void c() {
        int iD = d(this.f145685a);
        if (iD < 0) {
            this.f145688d = Name.m(this.f145685a);
            this.f145687c = FqName.f145679d.i();
            return;
        }
        String strSubstring = this.f145685a.substring(iD + 1);
        Intrinsics.i(strSubstring, "substring(...)");
        this.f145688d = Name.m(strSubstring);
        String strSubstring2 = this.f145685a.substring(0, iD);
        Intrinsics.i(strSubstring2, "substring(...)");
        this.f145687c = new FqNameUnsafe(strSubstring2);
    }

    public final String a() {
        return this.f145685a;
    }

    public final FqNameUnsafe b(Name name) {
        String strB;
        Intrinsics.j(name, "name");
        if (e()) {
            strB = name.b();
        } else {
            strB = this.f145685a + '.' + name.b();
        }
        Intrinsics.g(strB);
        return new FqNameUnsafe(strB, this, name);
    }

    public final boolean e() {
        return this.f145685a.length() == 0;
    }

    public final boolean f() {
        return this.f145686b != null || StringsKt.o0(a(), '<', 0, false, 6, null) < 0;
    }

    public final FqNameUnsafe g() {
        FqNameUnsafe fqNameUnsafe = this.f145687c;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        FqNameUnsafe fqNameUnsafe2 = this.f145687c;
        Intrinsics.g(fqNameUnsafe2);
        return fqNameUnsafe2;
    }

    public int hashCode() {
        return this.f145685a.hashCode();
    }

    public final Name j() {
        Name name = this.f145688d;
        if (name != null) {
            return name;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        Name name2 = this.f145688d;
        Intrinsics.g(name2);
        return name2;
    }

    public final boolean l(Name segment) {
        Intrinsics.j(segment, "segment");
        if (e()) {
            return false;
        }
        int iO0 = StringsKt.o0(this.f145685a, '.', 0, false, 6, null);
        if (iO0 == -1) {
            iO0 = this.f145685a.length();
        }
        int i10 = iO0;
        String strB = segment.b();
        Intrinsics.i(strB, "asString(...)");
        return i10 == strB.length() && StringsKt.L(this.f145685a, 0, strB, 0, i10, false, 16, null);
    }

    public final FqName m() {
        FqName fqName = this.f145686b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f145686b = fqName2;
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
            return f145683f;
        }
        return j();
    }

    public String toString() {
        if (e()) {
            String strB = f145683f.b();
            Intrinsics.i(strB, "asString(...)");
            return strB;
        }
        return this.f145685a;
    }

    public FqNameUnsafe(String fqName) {
        Intrinsics.j(fqName, "fqName");
        this.f145685a = fqName;
    }

    private FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f145685a = str;
        this.f145687c = fqNameUnsafe;
        this.f145688d = name;
    }
}
