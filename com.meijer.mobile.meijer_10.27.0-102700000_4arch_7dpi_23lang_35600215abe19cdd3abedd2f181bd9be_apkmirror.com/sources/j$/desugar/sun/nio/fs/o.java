package j$.desugar.sun.nio.fs;

import com.medallia.digital.mobilesdk.q2;
import j$.nio.file.AbstractC14776h;
import j$.nio.file.EnumC14766a;
import j$.nio.file.J;
import j$.nio.file.K;
import j$.nio.file.L;
import j$.nio.file.LinkOption;
import j$.nio.file.M;
import j$.nio.file.Path;
import j$.nio.file.u;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class o implements Path {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f138581h = Pattern.compile("/+");

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC14776h f138582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f138583b;

    /* renamed from: c, reason: collision with root package name */
    public final List f138584c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138585d;

    /* renamed from: e, reason: collision with root package name */
    public final String f138586e;

    /* renamed from: f, reason: collision with root package name */
    public final String f138587f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f138588g;

    public o(AbstractC14776h abstractC14776h, String str, String str2, String str3) {
        this(abstractC14776h, str.startsWith(q2.f92724c), str.isEmpty() ? Collections.singletonList("") : (List) Arrays.stream(f138581h.split(str)).filter(new n()).collect(new j$.util.stream.e(new j$.util.stream.a(), new j$.util.stream.b(), new j$.util.stream.c(), new j$.util.stream.d(), j$.util.stream.f.f139016a)), str2, str3);
    }

    public o(AbstractC14776h abstractC14776h, boolean z10, List list, String str, String str2) {
        this.f138582a = abstractC14776h;
        this.f138585d = z10;
        this.f138584c = list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? q2.f92724c : "");
        sb2.append(g.n(list));
        this.f138583b = sb2.toString();
        this.f138586e = str;
        this.f138587f = str2;
    }

    @Override // j$.nio.file.Path
    public final AbstractC14776h getFileSystem() {
        return this.f138582a;
    }

    @Override // j$.nio.file.Path
    public final Path s(LinkOption[] linkOptionArr) {
        this.f138582a.i().a(this, EnumC14766a.READ);
        if (Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new o(this.f138582a, toFile().getCanonicalPath(), this.f138586e, this.f138587f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.f138585d) {
            return this;
        }
        AbstractC14776h abstractC14776h = this.f138582a;
        String str = this.f138586e;
        return new o(abstractC14776h, str, str, this.f138587f).r(this);
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.f138585d) {
            return null;
        }
        AbstractC14776h abstractC14776h = this.f138582a;
        String str = this.f138587f;
        return new o(abstractC14776h, str, this.f138586e, str);
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.f138585d;
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        if (this.f138584c.isEmpty()) {
            if (this.f138585d) {
                return null;
            }
            return this;
        }
        return new o(this.f138582a, (String) this.f138584c.get(r2.size() - 1), this.f138586e, this.f138587f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final o getName(int i10) {
        if (i10 < 0 || i10 >= this.f138584c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i10), this));
        }
        return new o(this.f138582a, (String) this.f138584c.get(i10), this.f138586e, this.f138587f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        int size = this.f138584c.size();
        if (size == 0) {
            return null;
        }
        if (size == 1 && !this.f138585d) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f138585d) {
            sb2.append(q2.f92724c);
        }
        sb2.append(g.n(this.f138584c.subList(0, size - 1)));
        return new o(this.f138582a, sb2.toString(), this.f138586e, this.f138587f);
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.f138584c.size();
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i10, int i11) {
        return new o(this.f138582a, g.n(this.f138584c.subList(i10, i11)), this.f138586e, this.f138587f);
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return w(new o(this.f138582a, str, this.f138586e, this.f138587f));
    }

    @Override // j$.nio.file.Path
    public final boolean w(Path path) {
        int nameCount;
        Objects.requireNonNull(path);
        if (!(path instanceof o) || this.f138585d != path.isAbsolute() || this.f138584c.size() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i10 = 0; i10 < nameCount; i10++) {
            if (!getName(i10).equals(path.getName(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return z(new o(this.f138582a, str, this.f138586e, this.f138587f));
    }

    @Override // j$.nio.file.Path
    public final boolean z(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        if (this.f138584c.size() < nameCount) {
            return false;
        }
        int size = this.f138584c.size();
        for (int i10 = nameCount - 1; i10 >= 0; i10--) {
            if (!getName((i10 - nameCount) + size).equals(path.getName(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    public final int hashCode() {
        return this.f138583b.hashCode();
    }

    @Override // j$.nio.file.Path, java.lang.Comparable
    /* renamed from: u */
    public final int compareTo(Path path) {
        return this.f138583b.compareTo(((o) path).f138583b);
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.f138584c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        AbstractC14776h abstractC14776h = this.f138582a;
        boolean z10 = this.f138585d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? q2.f92724c : "");
        sb2.append(g.n(arrayDeque));
        return new o(abstractC14776h, sb2.toString(), this.f138586e, this.f138587f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final o r(Path path) {
        if (path instanceof o) {
            if (((o) path).f138585d) {
                return (o) path;
            }
            return new o(this.f138582a, this.f138583b + q2.f92724c + path, this.f138586e, this.f138587f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final o B(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o parent = getParent();
        return parent == null ? (o) path : parent.r(path);
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return B(new o(this.f138582a, str, this.f138586e, this.f138587f));
    }

    @Override // j$.nio.file.Path
    public final Path J(Path path) {
        if (path instanceof o) {
            if (this.f138585d != ((o) path).f138585d) {
                throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
            }
            List list = ((o) path).f138584c;
            int size = this.f138584c.size();
            int size2 = list.size();
            int i10 = 0;
            while (i10 < size && i10 < size2 && ((String) this.f138584c.get(i10)).equals(list.get(i10))) {
                i10++;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = i10; i11 < size; i11++) {
                arrayList.add("..");
            }
            while (i10 < size2) {
                arrayList.add((String) list.get(i10));
                i10++;
            }
            return new o(this.f138582a, false, arrayList, this.f138586e, this.f138587f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.f138583b);
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = p.f138591c;
        o absolutePath = toAbsolutePath();
        if (absolutePath.f138588g == null) {
            absolutePath.f138588g = absolutePath.f138583b.getBytes(q.f138592a);
        }
        byte[] bArr = absolutePath.f138588g;
        StringBuilder sb2 = new StringBuilder("file:///");
        for (int i10 = 1; i10 < bArr.length; i10++) {
            char c10 = (char) (bArr[i10] & 255);
            long j10 = p.f138589a;
            long j11 = p.f138590b;
            if (c10 >= '@' ? !(c10 >= 128 || ((1 << (c10 - '@')) & j11) == 0) : (j10 & (1 << c10)) != 0) {
                sb2.append(c10);
            } else {
                sb2.append('%');
                char[] cArr2 = p.f138591c;
                sb2.append(cArr2[(c10 >> 4) & 15]);
                sb2.append(cArr2[c10 & 15]);
            }
        }
        if (sb2.charAt(sb2.length() - 1) != '/' && toFile().isDirectory()) {
            sb2.append('/');
        }
        try {
            return new URI(sb2.toString());
        } catch (URISyntaxException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.f138583b;
    }

    @Override // j$.nio.file.Path
    public final L p(M m10, J[] jArr, K... kArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }
}
