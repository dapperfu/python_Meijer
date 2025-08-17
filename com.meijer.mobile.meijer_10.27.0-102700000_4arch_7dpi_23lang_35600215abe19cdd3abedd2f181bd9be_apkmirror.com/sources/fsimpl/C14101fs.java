package fsimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fsimpl.fs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14101fs implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f132282e = Pattern.compile("(?<major>\\d+)\\.(?<minor>\\d+)(\\.(?<patch>\\d+))?(-(?<suffix>[^.]+))?");

    /* renamed from: a, reason: collision with root package name */
    public final int f132283a;

    /* renamed from: b, reason: collision with root package name */
    public final int f132284b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132285c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132286d;

    public C14101fs(int i10, int i11, Integer num, String str) {
        this.f132283a = i10;
        this.f132284b = i11;
        this.f132285c = num;
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.f132286d = str;
    }

    public static C14101fs a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f132282e.matcher(str.trim());
        if (matcher.matches()) {
            try {
                int i10 = Integer.parseInt(matcher.group(1));
                int i11 = Integer.parseInt(matcher.group(2));
                String strGroup = matcher.group(4);
                return new C14101fs(i10, i11, strGroup != null ? Integer.valueOf(Integer.parseInt(strGroup)) : null, matcher.group(6));
            } catch (Throwable th2) {
                System.err.println("Error parsing Version:");
                th2.printStackTrace();
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14101fs c14101fs) {
        if (c14101fs == null) {
            throw new NullPointerException();
        }
        int i10 = this.f132283a;
        int i11 = c14101fs.f132283a;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = this.f132284b;
        int i13 = c14101fs.f132284b;
        if (i12 < i13) {
            return -1;
        }
        if (i12 > i13) {
            return 1;
        }
        Integer num = this.f132285c;
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = c14101fs.f132285c;
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
        int i13 = this.f132283a;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f132284b;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        Integer num = this.f132285c;
        return (num == null ? 0 : num.intValue()) >= i12;
    }

    public boolean b(int i10, int i11, int i12) {
        int i13 = this.f132283a;
        if (i13 > i10) {
            return false;
        }
        if (i13 < i10) {
            return true;
        }
        int i14 = this.f132284b;
        if (i14 > i11) {
            return false;
        }
        if (i14 < i11) {
            return true;
        }
        Integer num = this.f132285c;
        return (num == null ? 0 : num.intValue()) < i12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f132283a).append('.').append(this.f132284b);
        if (this.f132285c != null) {
            sb2.append('.').append(this.f132285c);
        }
        if (this.f132286d != null) {
            sb2.append('-').append(this.f132286d);
        }
        return sb2.toString();
    }
}
