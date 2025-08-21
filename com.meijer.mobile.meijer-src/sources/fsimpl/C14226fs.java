package fsimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fsimpl.fs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14226fs implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f133532e = Pattern.compile("(?<major>\\d+)\\.(?<minor>\\d+)(\\.(?<patch>\\d+))?(-(?<suffix>[^.]+))?");

    /* renamed from: a, reason: collision with root package name */
    public final int f133533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f133534b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133535c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133536d;

    public C14226fs(int i10, int i11, Integer num, String str) {
        this.f133533a = i10;
        this.f133534b = i11;
        this.f133535c = num;
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.f133536d = str;
    }

    public static C14226fs a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f133532e.matcher(str.trim());
        if (matcher.matches()) {
            try {
                int i10 = Integer.parseInt(matcher.group(1));
                int i11 = Integer.parseInt(matcher.group(2));
                String strGroup = matcher.group(4);
                return new C14226fs(i10, i11, strGroup != null ? Integer.valueOf(Integer.parseInt(strGroup)) : null, matcher.group(6));
            } catch (Throwable th2) {
                System.err.println("Error parsing Version:");
                th2.printStackTrace();
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14226fs c14226fs) {
        if (c14226fs == null) {
            throw new NullPointerException();
        }
        int i10 = this.f133533a;
        int i11 = c14226fs.f133533a;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = this.f133534b;
        int i13 = c14226fs.f133534b;
        if (i12 < i13) {
            return -1;
        }
        if (i12 > i13) {
            return 1;
        }
        Integer num = this.f133535c;
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = c14226fs.f133535c;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        if (iIntValue < iIntValue2) {
            return -1;
        }
        return iIntValue > iIntValue2 ? 1 : 0;
    }

    public boolean a(int i10, int i11) {
        return a(i10, i11, 0);
    }

    public boolean a(int i10, int i11, int i12) {
        int i13 = this.f133533a;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f133534b;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        Integer num = this.f133535c;
        return (num == null ? 0 : num.intValue()) >= i12;
    }

    public boolean b(int i10, int i11, int i12) {
        int i13 = this.f133533a;
        if (i13 > i10) {
            return false;
        }
        if (i13 < i10) {
            return true;
        }
        int i14 = this.f133534b;
        if (i14 > i11) {
            return false;
        }
        if (i14 < i11) {
            return true;
        }
        Integer num = this.f133535c;
        return (num == null ? 0 : num.intValue()) < i12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f133533a).append('.').append(this.f133534b);
        if (this.f133535c != null) {
            sb2.append('.').append(this.f133535c);
        }
        if (this.f133536d != null) {
            sb2.append('-').append(this.f133536d);
        }
        return sb2.toString();
    }
}
