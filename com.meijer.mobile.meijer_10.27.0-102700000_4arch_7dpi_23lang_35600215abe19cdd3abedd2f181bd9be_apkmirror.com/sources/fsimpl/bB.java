package fsimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public class bB implements InterfaceC14001bz {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f131755a = Pattern.compile("^[a-zA-Z_]\\w*");

    /* renamed from: b, reason: collision with root package name */
    private final String f131756b;

    /* renamed from: c, reason: collision with root package name */
    private final String f131757c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f131758d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f131759e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f131760f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f131761g = -1;

    bB(String str) {
        if (str == null || str.isEmpty()) {
            this.f131756b = null;
            this.f131757c = null;
            return;
        }
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length < 2 || strArrSplit.length > 3) {
            throw new IllegalArgumentException("Method info String must be of form <class>#<method_name>[#<flags>]");
        }
        String str2 = strArrSplit[0];
        this.f131756b = str2;
        String str3 = strArrSplit[1];
        this.f131757c = str3;
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
                this.f131758d = true;
            } else {
                if (cCharAt != 'l') {
                    throw new IllegalArgumentException("Unrecognized flag " + cCharAt + " in method info String");
                }
                this.f131759e = true;
            }
        }
    }

    @Override // fsimpl.InterfaceC14001bz
    public String a() {
        return this.f131756b;
    }

    @Override // fsimpl.InterfaceC14001bz
    public String b() {
        String str = this.f131756b;
        if (str == null) {
            return null;
        }
        if (this.f131760f == -1) {
            int iLastIndexOf = str.lastIndexOf(".");
            this.f131760f = iLastIndexOf;
            if (iLastIndexOf == -1) {
                this.f131760f = 0;
            }
        }
        return this.f131756b.substring(0, this.f131760f);
    }

    @Override // fsimpl.InterfaceC14001bz
    public String c() {
        String str = this.f131757c;
        if (str == null) {
            return null;
        }
        if (this.f131761g == -1) {
            Matcher matcher = f131755a.matcher(str);
            if (matcher.find()) {
                this.f131761g = matcher.group().length();
            } else {
                this.f131761g = 0;
            }
        }
        return this.f131757c.substring(0, this.f131761g);
    }

    @Override // fsimpl.InterfaceC14001bz
    public boolean d() {
        return this.f131758d;
    }

    @Override // fsimpl.InterfaceC14001bz
    public boolean e() {
        return this.f131759e;
    }
}
