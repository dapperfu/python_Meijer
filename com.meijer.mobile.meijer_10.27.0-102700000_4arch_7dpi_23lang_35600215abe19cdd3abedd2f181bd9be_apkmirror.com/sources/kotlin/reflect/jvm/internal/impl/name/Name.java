package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes13.dex */
public final class Name implements Comparable<Name> {

    /* renamed from: a, reason: collision with root package name */
    private final String f145689a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f145690b;

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f145690b == name.f145690b && this.f145689a.equals(name.f145689a);
    }

    private Name(String str, boolean z10) {
        if (str == null) {
            a(0);
        }
        this.f145689a = str;
        this.f145690b = z10;
    }

    public static Name m(String str) {
        if (str == null) {
            a(9);
        }
        return str.startsWith("<") ? u(str) : o(str);
    }

    public static Name o(String str) {
        if (str == null) {
            a(5);
        }
        return new Name(str, false);
    }

    public static boolean t(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static Name u(String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String b() {
        String str = this.f145689a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(Name name) {
        return this.f145689a.compareTo(name.f145689a);
    }

    public int hashCode() {
        return (this.f145689a.hashCode() * 31) + (this.f145690b ? 1 : 0);
    }

    public String l() {
        if (this.f145690b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB == null) {
            a(2);
        }
        return strB;
    }

    public boolean p() {
        return this.f145690b;
    }

    public String toString() {
        return this.f145689a;
    }
}
