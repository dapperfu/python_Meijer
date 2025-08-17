package kw;

import j$.nio.file.Path;
import j$.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010-8G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u00104\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0013\u00106\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b5\u0010%¨\u00067"}, d2 = {"Lkw/B;", "", "Lkw/h;", "bytes", "<init>", "(Lkw/h;)V", "", "child", "u", "(Ljava/lang/String;)Lkw/B;", "", "normalize", "w", "(Lkw/B;Z)Lkw/B;", "other", "t", "(Lkw/B;)Lkw/B;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "j$/nio/file/Path", "B", "()Lj$/nio/file/Path;", "", "a", "(Lkw/B;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkw/h;", "b", "()Lkw/h;", "e", "()Lkw/B;", "root", "", "l", "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", "", "C", "()Ljava/lang/Character;", "volumeLetter", "o", "nameBytes", "m", "name", "p", "parent", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class B implements Comparable<B> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final String f148024c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15331h bytes;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkw/B$a;", "", "<init>", "()V", "", "", "normalize", "Lkw/B;", "b", "(Ljava/lang/String;Z)Lkw/B;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)Lkw/B;", "j$/nio/file/Path", "c", "(Lj$/nio/file/Path;Z)Lkw/B;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kw.B$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ B d(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.a(file, z10);
        }

        public static /* synthetic */ B e(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.b(str, z10);
        }

        public static /* synthetic */ B f(Companion companion, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.c(path, z10);
        }

        @JvmStatic
        @JvmOverloads
        @JvmName
        public final B a(File file, boolean z10) {
            Intrinsics.j(file, "<this>");
            String string = file.toString();
            Intrinsics.i(string, "toString(...)");
            return b(string, z10);
        }

        @JvmStatic
        @JvmOverloads
        @JvmName
        public final B b(String str, boolean z10) {
            Intrinsics.j(str, "<this>");
            return lw.e.k(str, z10);
        }

        @JvmStatic
        @JvmOverloads
        @JvmName
        public final B c(Path path, boolean z10) {
            Intrinsics.j(path, "<this>");
            return b(path.toString(), z10);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.i(separator, "separator");
        f148024c = separator;
    }

    public B(C15331h bytes) {
        Intrinsics.j(bytes, "bytes");
        this.bytes = bytes;
    }

    public static /* synthetic */ B z(B b10, B b11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b10.w(b11, z10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(B other) {
        Intrinsics.j(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    /* renamed from: b, reason: from getter */
    public final C15331h getBytes() {
        return this.bytes;
    }

    public boolean equals(Object other) {
        return (other instanceof B) && Intrinsics.e(((B) other).getBytes(), getBytes());
    }

    public final List<C15331h> l() {
        ArrayList arrayList = new ArrayList();
        int iO = lw.e.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < getBytes().V() && getBytes().u(iO) == 92) {
            iO++;
        }
        int iV = getBytes().V();
        int i10 = iO;
        while (iO < iV) {
            if (getBytes().u(iO) == 47 || getBytes().u(iO) == 92) {
                arrayList.add(getBytes().Y(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < getBytes().V()) {
            arrayList.add(getBytes().Y(i10, getBytes().V()));
        }
        return arrayList;
    }

    public final B t(B other) {
        Intrinsics.j(other, "other");
        if (!Intrinsics.e(e(), other.e())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<C15331h> listL = l();
        List<C15331h> listL2 = other.l();
        int iMin = Math.min(listL.size(), listL2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.e(listL.get(i10), listL2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes().V() == other.getBytes().V()) {
            return Companion.e(INSTANCE, ".", false, 1, null);
        }
        if (listL2.subList(i10, listL2.size()).indexOf(lw.e.f149451e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.e(other.getBytes(), lw.e.f149450d)) {
            return this;
        }
        C15328e c15328e = new C15328e();
        C15331h c15331hM = lw.e.m(other);
        if (c15331hM == null && (c15331hM = lw.e.m(this)) == null) {
            c15331hM = lw.e.s(f148024c);
        }
        int size = listL2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c15328e.Z2(lw.e.f149451e);
            c15328e.Z2(c15331hM);
        }
        int size2 = listL.size();
        while (i10 < size2) {
            c15328e.Z2(listL.get(i10));
            c15328e.Z2(c15331hM);
            i10++;
        }
        return lw.e.q(c15328e, false);
    }

    public final File toFile() {
        return new File(toString());
    }

    @JvmName
    public final B u(String child) {
        Intrinsics.j(child, "child");
        return lw.e.j(this, lw.e.q(new C15328e().I0(child), false), false);
    }

    public final B w(B child, boolean normalize) {
        Intrinsics.j(child, "child");
        return lw.e.j(this, child, normalize);
    }

    public final Path B() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.i(path, "get(...)");
        return path;
    }

    @JvmName
    public final Character C() {
        if (C15331h.H(getBytes(), lw.e.f149447a, 0, 2, null) != -1 || getBytes().V() < 2 || getBytes().u(1) != 58) {
            return null;
        }
        char cU = (char) getBytes().u(0);
        if (('a' > cU || cU >= '{') && ('A' > cU || cU >= '[')) {
            return null;
        }
        return Character.valueOf(cU);
    }

    public final B e() {
        int iO = lw.e.o(this);
        if (iO == -1) {
            return null;
        }
        return new B(getBytes().Y(0, iO));
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        if (lw.e.o(this) != -1) {
            return true;
        }
        return false;
    }

    @JvmName
    public final String m() {
        return o().c0();
    }

    @JvmName
    public final C15331h o() {
        int iL = lw.e.l(this);
        if (iL != -1) {
            return C15331h.Z(getBytes(), iL + 1, 0, 2, null);
        }
        if (C() != null && getBytes().V() == 2) {
            return C15331h.f148095e;
        }
        return getBytes();
    }

    @JvmName
    public final B p() {
        if (!Intrinsics.e(getBytes(), lw.e.f149450d) && !Intrinsics.e(getBytes(), lw.e.f149447a) && !Intrinsics.e(getBytes(), lw.e.f149448b) && !lw.e.n(this)) {
            int iL = lw.e.l(this);
            if (iL == 2 && C() != null) {
                if (getBytes().V() == 3) {
                    return null;
                }
                return new B(C15331h.Z(getBytes(), 0, 3, 1, null));
            }
            if (iL == 1 && getBytes().W(lw.e.f149448b)) {
                return null;
            }
            if (iL == -1 && C() != null) {
                if (getBytes().V() == 2) {
                    return null;
                }
                return new B(C15331h.Z(getBytes(), 0, 2, 1, null));
            }
            if (iL == -1) {
                return new B(lw.e.f149450d);
            }
            if (iL == 0) {
                return new B(C15331h.Z(getBytes(), 0, 1, 1, null));
            }
            return new B(C15331h.Z(getBytes(), 0, iL, 1, null));
        }
        return null;
    }

    public String toString() {
        return getBytes().c0();
    }
}
