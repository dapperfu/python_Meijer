package Jh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"LJh/y;", "", "<init>", "()V", "", "", "d", "(Ljava/lang/String;)Z", "password", "", "LJh/y$a;", "a", "(Ljava/lang/String;)Ljava/util/List;", "LJh/y$b;", "b", "(Ljava/lang/String;)LJh/y$b;", "c", "", "I", "getEIGHT_TO_FIFTEEN_CHARACTERS_RECOMMENDED", "()I", "EIGHT_TO_FIFTEEN_CHARACTERS_RECOMMENDED", "getATLEAST_ONE_UPPER_CASE_LETTER", "ATLEAST_ONE_UPPER_CASE_LETTER", "getATLEAST_ONE_LOWER_CASE_LETTER", "ATLEAST_ONE_LOWER_CASE_LETTER", "e", "getATLEAST_ONE_NUMBER", "ATLEAST_ONE_NUMBER", "f", "getSPECIAL_CHARACTER_RECOMMENDED", "SPECIAL_CHARACTER_RECOMMENDED", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f15874a = new y();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int EIGHT_TO_FIFTEEN_CHARACTERS_RECOMMENDED = Gh.h.f12720I;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int ATLEAST_ONE_UPPER_CASE_LETTER = Gh.h.f12674B2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int ATLEAST_ONE_LOWER_CASE_LETTER = Gh.h.f13024z2;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int ATLEAST_ONE_NUMBER = Gh.h.f12667A2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final int SPECIAL_CHARACTER_RECOMMENDED = Gh.h.f12802T4;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LJh/y$a;", "", "", "criteria", "", "isMet", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jh.y$a, reason: from toString */
    public static final /* data */ class PasswordCriteria {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int criteria;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMet;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PasswordCriteria)) {
                return false;
            }
            PasswordCriteria passwordCriteria = (PasswordCriteria) other;
            return this.criteria == passwordCriteria.criteria && this.isMet == passwordCriteria.isMet;
        }

        /* renamed from: a, reason: from getter */
        public final int getCriteria() {
            return this.criteria;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsMet() {
            return this.isMet;
        }

        public int hashCode() {
            return (Integer.hashCode(this.criteria) * 31) + Boolean.hashCode(this.isMet);
        }

        public String toString() {
            return "PasswordCriteria(criteria=" + this.criteria + ", isMet=" + this.isMet + ')';
        }

        public PasswordCriteria(int i10, boolean z10) {
            this.criteria = i10;
            this.isMet = z10;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\u000b\f\tB!\b\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LJh/y$b;", "", "", "label", "description", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "c", "LJh/y$b$a;", "LJh/y$b$b;", "LJh/y$b$c;", "LJh/y$b$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Integer label;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Integer description;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJh/y$b$a;", "LJh/y$b;", "", "description", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jh.y$b$a, reason: from toString */
        public static final /* data */ class Error extends b {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer description;

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.e(this.description, ((Error) other).description);
            }

            public /* synthetic */ Error(Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? Integer.valueOf(Gh.h.f12990u3) : num);
            }

            @Override // Jh.y.b
            /* renamed from: a, reason: from getter */
            public Integer getDescription() {
                return this.description;
            }

            public int hashCode() {
                Integer num = this.description;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public String toString() {
                return "Error(description=" + this.description + ')';
            }

            public Error(Integer num) {
                super(Integer.valueOf(Gh.h.f13004w3), num, null);
                this.description = num;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJh/y$b$b;", "LJh/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jh.y$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0261b extends b {

            /* renamed from: c, reason: collision with root package name */
            public static final C0261b f15885c = new C0261b();

            /* JADX WARN: Multi-variable type inference failed */
            private C0261b() {
                super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0261b);
            }

            public String toString() {
                return "NotValidated";
            }

            public int hashCode() {
                return 500733976;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJh/y$b$c;", "LJh/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: c, reason: collision with root package name */
            public static final c f15886c = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(Integer.valueOf(Gh.h.f13011x3), Integer.valueOf(Gh.h.f13018y3), null);
            }

            public String toString() {
                return "Strong";
            }

            public int hashCode() {
                return -1238610956;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJh/y$b$d;", "LJh/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: c, reason: collision with root package name */
            public static final d f15887c = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(Integer.valueOf(Gh.h.f13025z3), Integer.valueOf(Gh.h.f12668A3), null);
            }

            public String toString() {
                return "Weak";
            }

            public int hashCode() {
                return 1192110101;
            }
        }

        public /* synthetic */ b(Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2);
        }

        private b(Integer num, Integer num2) {
            this.label = num;
            this.description = num2;
        }

        /* renamed from: a, reason: from getter */
        public Integer getDescription() {
            return this.description;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getLabel() {
            return this.label;
        }
    }

    public final List<PasswordCriteria> a(String password) {
        boolean z10;
        boolean z11;
        Intrinsics.j(password, "password");
        int i10 = EIGHT_TO_FIFTEEN_CHARACTERS_RECOMMENDED;
        int length = password.length();
        boolean z12 = true;
        PasswordCriteria passwordCriteria = new PasswordCriteria(i10, 8 <= length && length < 16);
        int i11 = ATLEAST_ONE_UPPER_CASE_LETTER;
        int i12 = 0;
        while (true) {
            if (i12 >= password.length()) {
                z10 = false;
                break;
            }
            if (Character.isUpperCase(password.charAt(i12))) {
                z10 = true;
                break;
            }
            i12++;
        }
        PasswordCriteria passwordCriteria2 = new PasswordCriteria(i11, z10);
        int i13 = ATLEAST_ONE_LOWER_CASE_LETTER;
        int i14 = 0;
        while (true) {
            if (i14 >= password.length()) {
                z11 = false;
                break;
            }
            if (Character.isLowerCase(password.charAt(i14))) {
                z11 = true;
                break;
            }
            i14++;
        }
        PasswordCriteria passwordCriteria3 = new PasswordCriteria(i13, z11);
        int i15 = ATLEAST_ONE_NUMBER;
        int i16 = 0;
        while (true) {
            if (i16 >= password.length()) {
                z12 = false;
                break;
            }
            if (Character.isDigit(password.charAt(i16))) {
                break;
            }
            i16++;
        }
        return CollectionsKt.p(passwordCriteria, passwordCriteria2, passwordCriteria3, new PasswordCriteria(i15, z12), new PasswordCriteria(SPECIAL_CHARACTER_RECOMMENDED, new Regex(".*[!@#$%^&*()].*").b(password)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b b(String password) {
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.j(password, "password");
        int i10 = 1;
        if (StringsKt.s0(password) || !new Regex("[a-zA-Z0-9\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\.]*").j(password)) {
            return new b.Error(null, i10, 0 == true ? 1 : 0);
        }
        List<PasswordCriteria> listA = a(password);
        List<PasswordCriteria> list = listA;
        int i11 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            objArr = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((PasswordCriteria) it.next()).getIsMet()) {
                    objArr = false;
                    break;
                }
            }
            objArr = true;
        }
        List listK0 = CollectionsKt.k0(listA, 1);
        if ((listK0 instanceof Collection) && listK0.isEmpty()) {
            objArr2 = true;
        } else {
            Iterator it2 = listK0.iterator();
            while (it2.hasNext()) {
                if (!((PasswordCriteria) it2.next()).getIsMet()) {
                    objArr2 = false;
                    break;
                }
            }
            objArr2 = true;
        }
        boolean isMet = ((PasswordCriteria) CollectionsKt.D0(listA)).getIsMet();
        List listK02 = CollectionsKt.k0(listA, 1);
        if (!(listK02 instanceof Collection) || !listK02.isEmpty()) {
            Iterator it3 = listK02.iterator();
            while (it3.hasNext()) {
                if (((PasswordCriteria) it3.next()).getIsMet() && (i11 = i11 + 1) < 0) {
                    CollectionsKt.v();
                }
            }
        }
        if (objArr == true && d(password)) {
            return b.c.f15886c;
        }
        if (objArr2 == true && !isMet) {
            return b.d.f15887c;
        }
        if (!objArr == true || d(password)) {
            return new b.Error(Integer.valueOf(i11 == 3 ? Gh.h.f12997v3 : Gh.h.f12990u3));
        }
        return b.d.f15887c;
    }

    public final boolean c(String str) {
        Intrinsics.j(str, "<this>");
        return str.length() <= 15;
    }

    private y() {
    }

    private final boolean d(String str) {
        if (str.length() >= 12) {
            return true;
        }
        return false;
    }
}
