package j$.desugar.sun.nio.fs;

import com.medallia.digital.mobilesdk.q2;
import j$.nio.file.C14858b;
import j$.nio.file.C14859c;
import j$.nio.file.E;
import j$.nio.file.G;
import j$.nio.file.H;
import j$.nio.file.I;
import j$.nio.file.J;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.C14855a;
import j$.nio.file.attribute.FileTime;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.x;
import j$.nio.file.s;
import j$.nio.file.t;
import j$.nio.file.w;
import java.nio.file.CopyOption;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class g {
    public static /* synthetic */ StandardOpenOption d(E e10) {
        if (e10 == null) {
            return null;
        }
        return e10 == E.READ ? StandardOpenOption.READ : e10 == E.WRITE ? StandardOpenOption.WRITE : e10 == E.APPEND ? StandardOpenOption.APPEND : e10 == E.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : e10 == E.CREATE ? StandardOpenOption.CREATE : e10 == E.CREATE_NEW ? StandardOpenOption.CREATE_NEW : e10 == E.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : e10 == E.SPARSE ? StandardOpenOption.SPARSE : e10 == E.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static /* synthetic */ String n(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) q2.f93563c);
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ List o(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Set p(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ LinkOption[] q(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i10 = 0; i10 < length; i10++) {
            linkOptionArr2[i10] = linkOptionArr[i10] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ CopyOption[] t(j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption c14859c;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i10 = 0; i10 < length; i10++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i10];
            if (copyOption == null) {
                c14859c = null;
            } else if (copyOption instanceof C14858b) {
                c14859c = ((C14858b) copyOption).f139233a;
            } else if (copyOption instanceof LinkOption) {
                c14859c = java.nio.file.LinkOption.NOFOLLOW_LINKS;
            } else if (copyOption instanceof StandardCopyOption) {
                StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
                c14859c = standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            } else {
                c14859c = new C14859c(copyOption);
            }
            copyOptionArr2[i10] = c14859c;
        }
        return copyOptionArr2;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] u(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i10 = 0; i10 < length; i10++) {
            linkOptionArr2[i10] = linkOptionArr[i10] == null ? null : java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static FileTime c(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        long millis = fileTime.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new FileTime(millis);
    }

    public static WatchEvent.Kind[] v(J[] jArr) {
        if (jArr == null) {
            return null;
        }
        int length = jArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i10 = 0; i10 < length; i10++) {
            J j10 = jArr[i10];
            kindArr[i10] = j10 == null ? null : j10 == G.f139195b ? StandardWatchEventKinds.ENTRY_CREATE : j10 == G.f139196c ? StandardWatchEventKinds.ENTRY_DELETE : j10 == G.f139197d ? StandardWatchEventKinds.ENTRY_MODIFY : j10 == G.f139194a ? StandardWatchEventKinds.OVERFLOW : j10 instanceof H ? ((H) j10).f139198a : new I(j10);
        }
        return kindArr;
    }

    public static Class h(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return v.class;
        }
        if (cls == v.class) {
            return PosixFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.h.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return j$.nio.file.attribute.h.class;
        }
        j$.util.a.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static java.nio.file.attribute.FileTime e(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return java.nio.file.attribute.FileTime.fromMillis(fileTime.toMillis());
    }

    public static j$.nio.file.attribute.k[] s(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        j$.nio.file.attribute.k[] kVarArr = new j$.nio.file.attribute.k[length];
        for (int i10 = 0; i10 < length; i10++) {
            FileAttribute fileAttribute = fileAttributeArr[i10];
            kVarArr[i10] = fileAttribute == null ? null : m(fileAttribute.value()) ? new h(fileAttribute) : fileAttribute instanceof j$.nio.file.attribute.j ? ((j$.nio.file.attribute.j) fileAttribute).f139219a : new j$.nio.file.attribute.i(fileAttribute);
        }
        return kVarArr;
    }

    public static J[] r(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        J[] jArr = new J[length];
        for (int i10 = 0; i10 < length; i10++) {
            WatchEvent.Kind kind = kindArr[i10];
            jArr[i10] = kind == null ? null : kind == StandardWatchEventKinds.ENTRY_CREATE ? G.f139195b : kind == StandardWatchEventKinds.ENTRY_DELETE ? G.f139196c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? G.f139197d : kind == StandardWatchEventKinds.OVERFLOW ? G.f139194a : kind instanceof I ? ((I) kind).f139199a : new H(kind);
        }
        return jArr;
    }

    public static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return w.C((Path) obj);
        }
        return obj instanceof java.nio.file.Path ? j$.nio.file.v.C((java.nio.file.Path) obj) : obj;
    }

    public static char x(String str, int i10) {
        if (i10 < str.length()) {
            return str.charAt(i10);
        }
        return (char) 0;
    }

    public static Class g(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return j$.nio.file.attribute.d.class;
        }
        if (cls == j$.nio.file.attribute.d.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return u.class;
        }
        if (cls == u.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return r.class;
        }
        if (cls == r.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == j$.nio.file.attribute.g.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return j$.nio.file.attribute.g.class;
        }
        if (cls == x.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return x.class;
        }
        if (cls == C14855a.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return C14855a.class;
        }
        j$.util.a.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static FileAttribute[] w(j$.nio.file.attribute.k[] kVarArr) {
        if (kVarArr == null) {
            return null;
        }
        int length = kVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i10 = 0; i10 < length; i10++) {
            j$.nio.file.attribute.k kVar = kVarArr[i10];
            fileAttributeArr[i10] = kVar == null ? null : m(kVar.value()) ? new j$.nio.file.attribute.l(kVar) : kVar instanceof j$.nio.file.attribute.i ? ((j$.nio.file.attribute.i) kVar).f139218a : new j$.nio.file.attribute.j(kVar);
        }
        return fileAttributeArr;
    }

    public static boolean m(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof j$.nio.file.attribute.w) || (next instanceof PosixFilePermission);
    }

    public static String b(long j10, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j10, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Set k(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof t) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(s.a((t) it.next()));
                } catch (ClassCastException e10) {
                    j$.util.a.a("java.nio.file.OpenOption", e10);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                j$.util.a.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(j$.nio.file.r.a((OpenOption) it2.next()));
                } catch (ClassCastException e11) {
                    j$.util.a.a("java.nio.file.OpenOption", e11);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static String a(long j10, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j10, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Object j(Object obj) {
        if (obj instanceof java.nio.file.attribute.FileTime) {
            try {
                return c((java.nio.file.attribute.FileTime) obj);
            } catch (ClassCastException e10) {
                j$.util.a.a("java.nio.file.attribute.FileTime", e10);
                throw null;
            }
        }
        if (!(obj instanceof FileTime)) {
            return obj;
        }
        try {
            return e((FileTime) obj);
        } catch (ClassCastException e11) {
            j$.util.a.a("java.nio.file.attribute.FileTime", e11);
            throw null;
        }
    }

    public static Map i(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, j(map.get(str)));
        }
        return map2;
    }

    public static Set l(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.w) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.w wVar = (j$.nio.file.attribute.w) it.next();
                    hashSet.add(wVar == null ? null : wVar == j$.nio.file.attribute.w.OWNER_READ ? PosixFilePermission.OWNER_READ : wVar == j$.nio.file.attribute.w.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : wVar == j$.nio.file.attribute.w.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : wVar == j$.nio.file.attribute.w.GROUP_READ ? PosixFilePermission.GROUP_READ : wVar == j$.nio.file.attribute.w.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : wVar == j$.nio.file.attribute.w.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : wVar == j$.nio.file.attribute.w.OTHERS_READ ? PosixFilePermission.OTHERS_READ : wVar == j$.nio.file.attribute.w.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e10) {
                    j$.util.a.a("java.nio.file.attribute.PosixFilePermission", e10);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                j$.util.a.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission = (PosixFilePermission) it2.next();
                    hashSet.add(posixFilePermission == null ? null : posixFilePermission == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.w.OWNER_READ : posixFilePermission == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.w.OWNER_WRITE : posixFilePermission == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.w.OWNER_EXECUTE : posixFilePermission == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.w.GROUP_READ : posixFilePermission == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.w.GROUP_WRITE : posixFilePermission == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.w.GROUP_EXECUTE : posixFilePermission == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.w.OTHERS_READ : posixFilePermission == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.w.OTHERS_WRITE : j$.nio.file.attribute.w.OTHERS_EXECUTE);
                } catch (ClassCastException e11) {
                    j$.util.a.a("java.nio.file.attribute.PosixFilePermission", e11);
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
