package Gg;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private static final List<CharsetEncoder> f11432c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private final CharsetEncoder[] f11433a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11434b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strArr[i10];
            if (d.b(str) != null) {
                try {
                    f11432c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public boolean a(char c10, int i10) {
        return this.f11433a[i10].canEncode("" + c10);
    }

    public byte[] b(char c10, int i10) {
        return ("" + c10).getBytes(this.f11433a[i10].charset());
    }

    public byte[] c(String str, int i10) {
        return str.getBytes(this.f11433a[i10].charset());
    }

    public Charset d(int i10) {
        return this.f11433a[i10].charset();
    }

    public int e(int i10) {
        return d.a(this.f11433a[i10].charset()).m();
    }

    public int f() {
        return this.f11434b;
    }

    public int g() {
        return this.f11433a.length;
    }

    public h(String str, Charset charset, int i10) {
        boolean z10;
        boolean z11;
        ArrayList<CharsetEncoder> arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i11 = 0;
        if (charset != null && charset.name().startsWith("UTF")) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i12 = 0; i12 < str.length(); i12++) {
            for (CharsetEncoder charsetEncoder : arrayList) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == i10 || charsetEncoder.canEncode(cCharAt)) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!z11) {
                Iterator<CharsetEncoder> it = f11432c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CharsetEncoder next = it.next();
                    if (next.canEncode(str.charAt(i12))) {
                        arrayList.add(next);
                        z11 = true;
                        break;
                    }
                }
            }
            if (!z11) {
                z10 = true;
            }
        }
        if (arrayList.size() == 1 && !z10) {
            this.f11433a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        } else {
            this.f11433a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                this.f11433a[i13] = (CharsetEncoder) it2.next();
                i13++;
            }
            this.f11433a[i13] = StandardCharsets.UTF_8.newEncoder();
            this.f11433a[i13 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f11433a;
                if (i11 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i11] != null && charset.name().equals(this.f11433a[i11].charset().name())) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            i11 = -1;
        }
        this.f11434b = i11;
    }
}
