package Ih;

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

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u000b\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"LIh/y;", "", "<init>", "()V", "", "password", "", "LIh/y$a;", "a", "(Ljava/lang/String;)Ljava/util/List;", "LIh/y$b;", "b", "(Ljava/lang/String;)LIh/y$b;", "", "I", "getEIGHT_TO_FIFTEEN_CHARACTERS_RECOMMENDED", "()I", "EIGHT_TO_FIFTEEN_CHARACTERS_RECOMMENDED", "c", "getATLEAST_ONE_UPPER_CASE_LETTER", "ATLEAST_ONE_UPPER_CASE_LETTER", "d", "getATLEAST_ONE_LOWER_CASE_LETTER", "ATLEAST_ONE_LOWER_CASE_LETTER", "e", "getATLEAST_ONE_NUMBER", "ATLEAST_ONE_NUMBER", "f", "getSPECIAL_CHARACTER_RECOMMENDED", "SPECIAL_CHARACTER_RECOMMENDED", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f14042a = new y();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int EIGHT_TO_FIFTEEN_CHARACTERS_RECOMMENDED = Fh.h.f10529I;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int ATLEAST_ONE_UPPER_CASE_LETTER = Fh.h.f10483B2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int ATLEAST_ONE_LOWER_CASE_LETTER = Fh.h.f10833z2;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int ATLEAST_ONE_NUMBER = Fh.h.f10476A2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final int SPECIAL_CHARACTER_RECOMMENDED = Fh.h.f10611T4;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LIh/y$a;", "", "", "criteria", "", "isMet", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ih.y$a, reason: from toString */
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\u000b\f\tB!\b\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LIh/y$b;", "", "", "label", "description", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "c", "LIh/y$b$a;", "LIh/y$b$b;", "LIh/y$b$c;", "LIh/y$b$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Integer label;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Integer description;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIh/y$b$a;", "LIh/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: c, reason: collision with root package name */
            public static final a f14052c = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(Integer.valueOf(Fh.h.f10799u3), Integer.valueOf(Fh.h.f10806v3), null);
            }

            public String toString() {
                return "Error";
            }

            public int hashCode() {
                return -1715512053;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIh/y$b$b;", "LIh/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ih.y$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0221b extends b {

            /* renamed from: c, reason: collision with root package name */
            public static final C0221b f14053c = new C0221b();

            /* JADX WARN: Multi-variable type inference failed */
            private C0221b() {
                super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0221b);
            }

            public String toString() {
                return "NotValidated";
            }

            public int hashCode() {
                return 500733976;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIh/y$b$c;", "LIh/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: c, reason: collision with root package name */
            public static final c f14054c = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(Integer.valueOf(Fh.h.f10813w3), Integer.valueOf(Fh.h.f10820x3), null);
            }

            public String toString() {
                return "Strong";
            }

            public int hashCode() {
                return -1238610956;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIh/y$b$d;", "LIh/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: c, reason: collision with root package name */
            public static final d f14055c = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(Integer.valueOf(Fh.h.f10827y3), Integer.valueOf(Fh.h.f10834z3), null);
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
        public final Integer getDescription() {
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

    public final b b(String password) {
        Intrinsics.j(password, "password");
        if (StringsKt.r0(password) || !new Regex("[a-zA-Z0-9\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\.]*").j(password)) {
            return b.a.f14052c;
        }
        List listK0 = CollectionsKt.k0(a(password), 1);
        int i10 = 0;
        if (!(listK0 instanceof Collection) || !listK0.isEmpty()) {
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                if (((PasswordCriteria) it.next()).getIsMet() && (i10 = i10 + 1) < 0) {
                    CollectionsKt.v();
                }
            }
        }
        return (i10 == 0 || i10 == 1 || i10 == 2) ? b.a.f14052c : i10 != 3 ? i10 != 4 ? b.a.f14052c : b.c.f14054c : b.d.f14055c;
    }

    private y() {
    }
}
