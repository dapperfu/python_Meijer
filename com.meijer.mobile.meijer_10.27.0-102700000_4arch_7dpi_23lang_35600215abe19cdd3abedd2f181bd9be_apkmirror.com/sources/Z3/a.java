package Z3;

import Ce.L;
import U3.e;
import U3.r;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.l8;
import d3.C13466a;
import d3.D;
import d3.InterfaceC13477l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class a implements r {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f42278d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f42279e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f42280a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f42281b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final D f42282c = new D();

    @Override // U3.r
    public int c() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private c3.C6350a d(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.a.d(android.text.Spanned, java.lang.String):c3.a");
    }

    public static float f(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long g(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * l8.b.f92526c : 0L) + (Long.parseLong((String) C13466a.e(matcher.group(i10 + 2))) * l8.b.f92525b) + (Long.parseLong((String) C13466a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13477l<e> interfaceC13477l) throws NumberFormatException {
        long j10;
        String strT;
        String str;
        this.f42282c.U(bArr, i10 + i11);
        this.f42282c.W(i10);
        Charset charsetE = e(this.f42282c);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f35730a == -9223372036854775807L || !bVar.f35731b) ? null : new ArrayList();
        while (true) {
            String strT2 = this.f42282c.t(charsetE);
            if (strT2 == null) {
                break;
            }
            if (strT2.length() != 0) {
                try {
                    Integer.parseInt(strT2);
                    strT = this.f42282c.t(charsetE);
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    d3.r.i("SubripParser", "Skipping invalid index: " + strT2);
                }
                if (strT == null) {
                    d3.r.i("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f42278d.matcher(strT);
                if (matcher.matches()) {
                    long jG = g(matcher, 1);
                    long jG2 = g(matcher, 6);
                    int i12 = 0;
                    this.f42280a.setLength(0);
                    this.f42281b.clear();
                    String strT3 = this.f42282c.t(charsetE);
                    while (!TextUtils.isEmpty(strT3)) {
                        if (this.f42280a.length() > 0) {
                            this.f42280a.append("<br>");
                        }
                        this.f42280a.append(h(strT3, this.f42281b));
                        strT3 = this.f42282c.t(charsetE);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f42280a.toString());
                    while (true) {
                        if (i12 >= this.f42281b.size()) {
                            str = null;
                            break;
                        }
                        str = this.f42281b.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    j10 = j11;
                    long j12 = bVar.f35730a;
                    if (j12 == j10 || jG >= j12) {
                        interfaceC13477l.accept(new e(L.y(d(spannedFromHtml, str)), jG, jG2 - jG));
                    } else if (arrayList != null) {
                        arrayList.add(new e(L.y(d(spannedFromHtml, str)), jG, jG2 - jG));
                    }
                } else {
                    j10 = j11;
                    d3.r.i("SubripParser", "Skipping invalid timing: " + strT);
                }
                j11 = j10;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC13477l.accept((e) it.next());
            }
        }
    }

    private Charset e(D d10) {
        Charset charsetR = d10.R();
        if (charsetR != null) {
            return charsetR;
        }
        return StandardCharsets.UTF_8;
    }

    private String h(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f42279e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }
}
