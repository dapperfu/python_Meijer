package fsimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes15.dex */
public class bB implements InterfaceC14126bz {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f133005a = Pattern.compile("^[a-zA-Z_]\\w*");

    /* renamed from: b, reason: collision with root package name */
    private final String f133006b;

    /* renamed from: c, reason: collision with root package name */
    private final String f133007c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f133008d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f133009e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f133010f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f133011g = -1;

    bB(String str) {
        if (str == null || str.isEmpty()) {
            this.f133006b = null;
            this.f133007c = null;
            return;
        }
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length < 2 || strArrSplit.length > 3) {
            throw new IllegalArgumentException("Method info String must be of form <class>#<method_name>[#<flags>]");
        }
        String str2 = strArrSplit[0];
        this.f133006b = str2;
        String str3 = strArrSplit[1];
        this.f133007c = str3;
        if (strArrSplit.length == 3) {
            a(strArrSplit[2]);
        }
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Class name is missing from method info String");
        }
        if (str3.isEmpty()) {
            throw new IllegalArgumentException("Method name is missing from method info String");
        }
    }

    private void a(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == 'i') {
                this.f133008d = true;
            } else {
                if (cCharAt != 'l') {
                    throw new IllegalArgumentException("Unrecognized flag " + cCharAt + " in method info String");
                }
                this.f133009e = true;
            }
        }
    }

    @Override // fsimpl.InterfaceC14126bz
    public String a() {
        return this.f133006b;
    }

    @Override // fsimpl.InterfaceC14126bz
    public String b() {
        String str = this.f133006b;
        if (str == null) {
            return null;
        }
        if (this.f133010f == -1) {
            int iLastIndexOf = str.lastIndexOf(".");
            this.f133010f = iLastIndexOf;
            if (iLastIndexOf == -1) {
                this.f133010f = 0;
            }
        }
        return this.f133006b.substring(0, this.f133010f);
    }

    @Override // fsimpl.InterfaceC14126bz
    public String c() {
        String str = this.f133007c;
        if (str == null) {
            return null;
        }
        if (this.f133011g == -1) {
            Matcher matcher = f133005a.matcher(str);
            if (matcher.find()) {
                this.f133011g = matcher.group().length();
            } else {
                this.f133011g = 0;
            }
        }
        return this.f133007c.substring(0, this.f133011g);
    }

    @Override // fsimpl.InterfaceC14126bz
    public boolean d() {
        return this.f133008d;
    }

    @Override // fsimpl.InterfaceC14126bz
    public boolean e() {
        return this.f133009e;
    }
}
