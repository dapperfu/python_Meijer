package o8;

/* loaded from: classes4.dex */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f153748a;

    /* renamed from: b, reason: collision with root package name */
    private final int f153749b;

    /* renamed from: c, reason: collision with root package name */
    private final int f153750c;

    /* renamed from: d, reason: collision with root package name */
    private final int f153751d;

    /* renamed from: e, reason: collision with root package name */
    private final int f153752e;

    public c(Throwable th2, int i10) {
        this(th2, i10, 128000, 1000, 250);
    }

    c(Throwable th2, int i10, int i11, int i12, int i13) {
        this.f153748a = th2;
        this.f153749b = i10;
        this.f153750c = i11;
        this.f153751d = i12;
        this.f153752e = i13;
    }

    private String b() {
        StringBuilder sb2 = new StringBuilder();
        Throwable cause = this.f153748a;
        int length = 0;
        int length2 = 0;
        int i10 = 0;
        while (true) {
            if (cause == null || length >= this.f153749b || length2 > this.f153750c) {
                break;
            }
            if (length > 0) {
                sb2.append("\nCaused by: ");
                length2 += 12;
            }
            String strC = c(cause.toString(), i10, length > 0);
            String[] strArrSplit = strC.split("\n");
            if (strArrSplit.length > this.f153749b - length) {
                int i11 = 0;
                while (length < this.f153749b) {
                    if (i11 > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(strArrSplit[i11]);
                    length2 = sb2.length();
                    length++;
                    i11++;
                }
            } else {
                sb2.append(strC);
                int length3 = sb2.length();
                length += strArrSplit.length;
                int length4 = sb2.length();
                StackTraceElement[] stackTrace = cause.getStackTrace();
                if (stackTrace != null) {
                    int iMin = Math.min(stackTrace.length, this.f153749b - length);
                    i10 = length3;
                    length2 = length4;
                    int i12 = 0;
                    while (i12 < iMin && length2 < this.f153750c) {
                        sb2.append("\n");
                        sb2.append("\tat ");
                        sb2.append(stackTrace[i12]);
                        length++;
                        i12++;
                        i10 = length2;
                        length2 = sb2.length();
                    }
                } else {
                    i10 = length3;
                    length2 = length4;
                }
                cause = cause.getCause();
            }
        }
        return length2 > this.f153750c ? sb2.substring(0, i10).trim() : sb2.toString().trim();
    }

    private String c(String str, int i10, boolean z10) {
        if (str == null) {
            return "";
        }
        int iMin = Math.min(Math.max(0, (this.f153750c - i10) - (z10 ? 12 : 0)), this.f153751d);
        return str.length() > iMin ? str.substring(0, iMin) : str;
    }

    @Override // o8.g
    public f a() {
        return new f(z8.f.s(this.f153748a.getClass().getName(), this.f153752e), z8.f.s(this.f153748a.toString(), this.f153751d), b(), d.JAVA);
    }
}
