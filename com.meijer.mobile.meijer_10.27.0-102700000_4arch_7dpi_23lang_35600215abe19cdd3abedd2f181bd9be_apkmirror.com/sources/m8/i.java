package m8;

/* loaded from: classes4.dex */
public class i implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f149981a;

    /* renamed from: b, reason: collision with root package name */
    private final int f149982b;

    /* renamed from: c, reason: collision with root package name */
    private final int f149983c;

    /* renamed from: d, reason: collision with root package name */
    private final int f149984d;

    /* renamed from: e, reason: collision with root package name */
    private final int f149985e;

    public i(String str, int i10) {
        this(str, i10, 128000, 1000, 250);
    }

    private String d(String[] strArr) {
        if (strArr.length <= this.f149982b && this.f149981a.length() <= this.f149983c) {
            return this.f149981a;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int length = 0;
        while (i10 < Math.min(strArr.length, this.f149982b)) {
            int i11 = i10 == 0 ? 0 : 1;
            if (strArr[i10].length() + length + i11 > this.f149983c) {
                break;
            }
            if (i11 > 0) {
                sb2.append("\n");
            }
            sb2.append(strArr[i10]);
            length += strArr[i10].length() + i11;
            i10++;
        }
        return sb2.toString();
    }

    i(String str, int i10, int i11, int i12, int i13) {
        this.f149981a = str;
        this.f149982b = i10;
        this.f149983c = i11;
        this.f149984d = i12;
        this.f149985e = i13;
    }

    public static String b(Throwable th2) {
        while (th2 != null) {
            String message = th2.getMessage();
            if (message != null && e(message)) {
                return message;
            }
            th2 = th2.getCause();
        }
        return null;
    }

    private String c(String[] strArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        int iIndexOf = strArr[0].indexOf(" ---> ");
        if (iIndexOf < 0) {
            sb2.append(strArr[0]);
            int i11 = 1;
            while (true) {
                if (i11 < strArr.length && !strArr[i11].startsWith("  at ") && sb2.length() < i10) {
                    sb2.append("\n");
                    int iIndexOf2 = strArr[i11].indexOf(" ---> ");
                    if (iIndexOf2 >= 0) {
                        sb2.append(strArr[i11].substring(0, iIndexOf2));
                        break;
                    }
                    sb2.append(strArr[i11]);
                    i11++;
                } else {
                    break;
                }
            }
        } else {
            sb2.append(strArr[0].substring(0, iIndexOf));
        }
        return sb2.length() > i10 ? sb2.substring(0, i10) : sb2.toString();
    }

    private static boolean e(String str) {
        for (String str2 : str.split("\n")) {
            if (str2.startsWith("  at ")) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.g
    public f a() {
        String[] strArrSplit = this.f149981a.split("\n");
        if (strArrSplit.length < 1) {
            throw new IllegalArgumentException("no lines");
        }
        if (strArrSplit[0].startsWith("  at ")) {
            throw new IllegalArgumentException("no reason message available");
        }
        int iIndexOf = strArrSplit[0].indexOf(":");
        if (iIndexOf >= 0) {
            return new f(x8.f.s(strArrSplit[0].substring(0, iIndexOf), this.f149985e), c(strArrSplit, this.f149984d), d(strArrSplit), d.XAMARIN);
        }
        throw new IllegalArgumentException("no exception name available");
    }
}
