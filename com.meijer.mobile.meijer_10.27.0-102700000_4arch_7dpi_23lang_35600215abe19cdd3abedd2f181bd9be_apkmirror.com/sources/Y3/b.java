package Y3;

import Be.C2957c;
import U3.e;
import U3.r;
import Y3.c;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c3.C6350a;
import d3.C13466a;
import d3.D;
import d3.InterfaceC13477l;
import d3.P;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class b implements r {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f40072g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40073a;

    /* renamed from: b, reason: collision with root package name */
    private final a f40074b;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, c> f40076d;

    /* renamed from: e, reason: collision with root package name */
    private float f40077e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    private float f40078f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    private final D f40075c = new D();

    private static Layout.Alignment p(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                d3.r.i("SsaParser", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // U3.r
    public int c() {
        return 1;
    }

    private static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static C6350a f(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        C6350a.b bVarO = new C6350a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f40081c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f40081c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f40088j == 3 && cVar.f40082d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f40082d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f40083e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                bVarO.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f40084f;
            if (z10 && cVar.f40085g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f40085g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f40086h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f40087i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f40104a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f40080b : -1;
        }
        bVarO.p(p(i10)).l(o(i10)).i(n(i10));
        PointF pointF = bVar.f40105b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            bVarO.k(e(bVarO.d()));
            bVarO.h(e(bVarO.c()), 0);
        } else {
            bVarO.k(pointF.x / f10);
            bVarO.h(bVar.f40105b.y / f11, 0);
        }
        return bVarO.a();
    }

    private void h(String str, a aVar, List<List<C6350a>> list, List<Long> list2) {
        int i10;
        C13466a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", aVar.f40071e);
        if (strArrSplit.length != aVar.f40071e) {
            d3.r.i("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jM = m(strArrSplit[aVar.f40067a]);
        if (jM == -9223372036854775807L) {
            d3.r.i("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM2 = m(strArrSplit[aVar.f40068b]);
        if (jM2 == -9223372036854775807L || jM2 <= jM) {
            d3.r.i("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f40076d;
        c cVar = (map == null || (i10 = aVar.f40069c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[aVar.f40070d];
        C6350a c6350aF = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f40077e, this.f40078f);
        int iD = d(jM2, list2, list);
        for (int iD2 = d(jM, list2, list); iD2 < iD; iD2++) {
            list.get(iD2).add(c6350aF);
        }
    }

    private void i(D d10, List<List<C6350a>> list, List<Long> list2, Charset charset) {
        a aVarA = this.f40073a ? this.f40074b : null;
        while (true) {
            String strT = d10.t(charset);
            if (strT == null) {
                return;
            }
            if (strT.startsWith("Format:")) {
                aVarA = a.a(strT);
            } else if (strT.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    d3.r.i("SsaParser", "Skipping dialogue line before complete format: " + strT);
                } else {
                    h(strT, aVarA, list, list2);
                }
            }
        }
    }

    private static Map<String, c> l(D d10, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strT = d10.t(charset);
            if (strT == null || (d10.a() != 0 && d10.h(charset) == '[')) {
                break;
            }
            if (strT.startsWith("Format:")) {
                aVarA = c.a.a(strT);
            } else if (strT.startsWith("Style:")) {
                if (aVarA == null) {
                    d3.r.i("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strT);
                } else {
                    c cVarB = c.b(strT, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f40079a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long m(String str) {
        Matcher matcher = f40072g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) P.h(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) P.h(matcher.group(2))) * 60000000) + (Long.parseLong((String) P.h(matcher.group(3))) * 1000000) + (Long.parseLong((String) P.h(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int n(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                d3.r.i("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int o(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                d3.r.i("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13477l<e> interfaceC13477l) {
        long j10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f40075c.U(bArr, i10 + i11);
        this.f40075c.W(i10);
        Charset charsetG = g(this.f40075c);
        if (!this.f40073a) {
            j(this.f40075c, charsetG);
        }
        i(this.f40075c, arrayList, arrayList2, charsetG);
        long j11 = -9223372036854775807L;
        ArrayList arrayList3 = (bVar.f35730a == -9223372036854775807L || !bVar.f35731b) ? null : new ArrayList();
        int i12 = 0;
        while (i12 < arrayList.size()) {
            List<C6350a> list = arrayList.get(i12);
            if (list.isEmpty() && i12 != 0) {
                j10 = j11;
            } else {
                if (i12 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i12).longValue();
                long jLongValue2 = arrayList2.get(i12 + 1).longValue() - arrayList2.get(i12).longValue();
                j10 = j11;
                long j12 = bVar.f35730a;
                if (j12 == j10 || jLongValue >= j12) {
                    interfaceC13477l.accept(new e(list, jLongValue, jLongValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new e(list, jLongValue, jLongValue2));
                }
            }
            i12++;
            j11 = j10;
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                interfaceC13477l.accept((e) it.next());
            }
        }
    }

    public b(List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.f40073a = true;
            String strG = P.G(list.get(0));
            C13466a.a(strG.startsWith("Format:"));
            this.f40074b = (a) C13466a.e(a.a(strG));
            j(new D(list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f40073a = false;
        this.f40074b = null;
    }

    private static int d(long j10, List<Long> list, List<List<C6350a>> list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size >= 0) {
                if (list.get(size).longValue() == j10) {
                    return size;
                }
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    private Charset g(D d10) {
        Charset charsetR = d10.R();
        if (charsetR != null) {
            return charsetR;
        }
        return StandardCharsets.UTF_8;
    }

    private void j(D d10, Charset charset) {
        while (true) {
            String strT = d10.t(charset);
            if (strT != null) {
                if ("[Script Info]".equalsIgnoreCase(strT)) {
                    k(d10, charset);
                } else if ("[V4+ Styles]".equalsIgnoreCase(strT)) {
                    this.f40076d = l(d10, charset);
                } else if ("[V4 Styles]".equalsIgnoreCase(strT)) {
                    d3.r.g("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strT)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void k(D d10, Charset charset) {
        while (true) {
            String strT = d10.t(charset);
            if (strT != null) {
                if (d10.a() == 0 || d10.h(charset) != '[') {
                    String[] strArrSplit = strT.split(":");
                    if (strArrSplit.length == 2) {
                        String strE = C2957c.e(strArrSplit[0].trim());
                        strE.getClass();
                        if (!strE.equals("playresx")) {
                            if (strE.equals("playresy")) {
                                try {
                                    this.f40078f = Float.parseFloat(strArrSplit[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        } else {
                            this.f40077e = Float.parseFloat(strArrSplit[1].trim());
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
