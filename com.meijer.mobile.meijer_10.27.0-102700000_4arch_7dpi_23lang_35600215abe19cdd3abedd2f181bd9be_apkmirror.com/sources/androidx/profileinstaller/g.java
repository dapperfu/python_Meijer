package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f57817a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f57818b = {112, 114, 109, 0};

    private static void L(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String strJ = j(cVar.f57799a, cVar.f57800b, i.f57834e);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f57807i.size());
            d.p(outputStream, cVar.f57806h.length);
            d.q(outputStream, cVar.f57801c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f57807i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
            }
            for (int i10 : cVar.f57806h) {
                d.p(outputStream, i10);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            int size = cVar.f57807i.size() * 4;
            String strJ = j(cVar.f57799a, cVar.f57800b, i.f57833d);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f57806h.length);
            d.q(outputStream, size);
            d.q(outputStream, cVar.f57801c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f57807i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
                d.p(outputStream, 0);
            }
            for (int i10 : cVar.f57806h) {
                d.p(outputStream, i10);
            }
        }
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int iK = 0;
        for (c cVar : cVarArr) {
            iK += d.k(j(cVar.f57799a, cVar.f57800b, bArr)) + 16 + (cVar.f57803e * 2) + cVar.f57804f + k(cVar.f57805g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, i.f57832c)) {
            int length = cVarArr.length;
            while (i10 < length) {
                c cVar2 = cVarArr[i10];
                H(byteArrayOutputStream, cVar2, j(cVar2.f57799a, cVar2.f57800b, bArr));
                G(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                H(byteArrayOutputStream, cVar3, j(cVar3.f57799a, cVar3.f57800b, bArr));
            }
            int length2 = cVarArr.length;
            while (i10 < length2) {
                G(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10].f57800b.equals(strH)) {
                return cVarArr[i10];
            }
        }
        return null;
    }

    private static int m(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw d.c("Unexpected flag: " + i10);
    }

    private static int o(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m(4, i10, i11)) ? i12 | 4 : i12;
    }

    static byte[] p(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, i.f57831b.length);
        }
        throw d.c("Invalid magic");
    }

    private static int z(int i10) {
        return (i10 + 7) & (-8);
    }

    private static void A(byte[] bArr, int i10, int i11, c cVar) {
        int iM = m(i10, i11, cVar.f57805g);
        int i12 = iM / 8;
        bArr[i12] = (byte) ((1 << (iM % 8)) | bArr[i12]);
    }

    static boolean C(OutputStream outputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.f57830a)) {
            P(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f57831b)) {
            O(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f57833d)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f57832c)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, i.f57834e)) {
            return false;
        }
        L(outputStream, cVarArr);
        return true;
    }

    private static void D(OutputStream outputStream, c cVar) throws IOException {
        int[] iArr = cVar.f57806h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            d.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    private static j E(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i10 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f57801c);
                d.q(byteArrayOutputStream, cVar.f57802d);
                d.q(byteArrayOutputStream, cVar.f57805g);
                String strJ = j(cVar.f57799a, cVar.f57800b, i.f57830a);
                int iK = d.k(strJ);
                d.p(byteArrayOutputStream, iK);
                i10 = i10 + 14 + iK;
                d.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                j jVar = new j(e.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return jVar;
            }
            throw d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static void F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f57817a);
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.f57805g)];
        for (Map.Entry<Integer, Integer> entry : cVar.f57807i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                A(bArr, 2, iIntValue, cVar);
            }
            if ((iIntValue2 & 4) != 0) {
                A(bArr, 4, iIntValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(OutputStream outputStream, int i10, c cVar) throws IOException {
        byte[] bArr = new byte[l(i10, cVar.f57805g)];
        for (Map.Entry<Integer, Integer> entry : cVar.f57807i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i10) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (cVar.f57805g * i11) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(OutputStream outputStream, c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.f57807i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.p(outputStream, iIntValue - i10);
                d.p(outputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f57832c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f57831b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void Q(OutputStream outputStream, c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = i.f57830a.length + f57817a.length + 4 + (arrayList.size() * 16);
        d.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j jVar = (j) arrayList.get(i10);
            d.q(outputStream, jVar.f57837a.b());
            d.q(outputStream, length2);
            if (jVar.f57840d) {
                byte[] bArr = jVar.f57839c;
                long length3 = bArr.length;
                byte[] bArrB = d.b(bArr);
                arrayList2.add(bArrB);
                d.q(outputStream, bArrB.length);
                d.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(jVar.f57839c);
                d.q(outputStream, jVar.f57839c.length);
                d.q(outputStream, 0L);
                length = jVar.f57839c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    private static int a(c cVar) {
        Iterator<Map.Entry<Integer, Integer>> it = cVar.f57807i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    private static j c(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            try {
                c cVar = cVarArr[i11];
                d.p(byteArrayOutputStream, i11);
                d.p(byteArrayOutputStream, cVar.f57803e);
                i10 = i10 + 4 + (cVar.f57803e * 2);
                D(byteArrayOutputStream, cVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            j jVar = new j(e.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static j d(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            try {
                c cVar = cVarArr[i11];
                int iA = a(cVar);
                byte[] bArrE = e(iA, cVar);
                byte[] bArrF = f(cVar);
                d.p(byteArrayOutputStream, i11);
                int length = bArrE.length + 2 + bArrF.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i10 = i10 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            j jVar = new j(e.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(int i10, c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i10, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static byte[] f(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static int k(int i10) {
        return z(i10 * 2) / 8;
    }

    private static int l(int i10, int i11) {
        return z(Integer.bitCount(i10 & (-2)) * i11) / 8;
    }

    private static int[] n(InputStream inputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int iH = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iH += d.h(inputStream);
            iArr[i11] = iH;
        }
        return iArr;
    }

    static c[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.f57835f)) {
            if (Arrays.equals(i.f57830a, bArr2)) {
                throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, i.f57836g)) {
            return u(inputStream, bArr2, cVarArr);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] s(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (!Arrays.equals(bArr, i.f57835f)) {
            throw d.c("Unsupported meta version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrT = t(byteArrayInputStream, iJ, cVarArr);
            byteArrayInputStream.close();
            return cVarArrT;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void w(InputStream inputStream, c cVar) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f57805g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = cVar.f57805g;
            if (i10 >= i11) {
                return;
            }
            int iO = o(bitSetValueOf, i10, i11);
            if (iO != 0) {
                Integer num = cVar.f57807i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                cVar.f57807i.put(Integer.valueOf(i10), Integer.valueOf(iO | num.intValue()));
            }
            i10++;
        }
    }

    static c[] x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, i.f57831b)) {
            throw d.c("Unsupported version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrY = y(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return cVarArrY;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static c[] y(InputStream inputStream, String str, int i10) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = d.h(inputStream);
            int iH2 = d.h(inputStream);
            cVarArr[i11] = new c(str, d.f(inputStream, iH), d.i(inputStream), 0L, iH2, (int) d.i(inputStream), (int) d.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            q(inputStream, cVar);
            cVar.f57806h = n(inputStream, cVar.f57803e);
            w(inputStream, cVar);
        }
        return cVarArr;
    }

    private static void B(InputStream inputStream) throws IOException {
        d.h(inputStream);
        int iJ = d.j(inputStream);
        if (iJ != 6 && iJ != 7) {
            while (iJ > 0) {
                d.j(inputStream);
                for (int iJ2 = d.j(inputStream); iJ2 > 0; iJ2--) {
                    d.h(inputStream);
                }
                iJ--;
            }
        }
    }

    private static void G(OutputStream outputStream, c cVar) throws IOException {
        K(outputStream, cVar);
        D(outputStream, cVar);
        I(outputStream, cVar);
    }

    private static void H(OutputStream outputStream, c cVar, String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f57803e);
        d.q(outputStream, cVar.f57804f);
        d.q(outputStream, cVar.f57801c);
        d.q(outputStream, cVar.f57805g);
        d.n(outputStream, str);
    }

    private static void P(OutputStream outputStream, c[] cVarArr) throws IOException {
        Q(outputStream, cVarArr);
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = i.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + i.a(bArr) + str2;
        }
        return g(str2, strA);
    }

    private static void q(InputStream inputStream, c cVar) throws IOException {
        int iAvailable = inputStream.available() - cVar.f57804f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += d.h(inputStream);
            cVar.f57807i.put(Integer.valueOf(iH), 1);
            for (int iH2 = d.h(inputStream); iH2 > 0; iH2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    private static c[] t(InputStream inputStream, int i10, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i10 == cVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int iH = d.h(inputStream);
                iArr[i11] = d.h(inputStream);
                strArr[i11] = d.f(inputStream, iH);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                c cVar = cVarArr[i12];
                if (cVar.f57800b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    cVar.f57803e = i13;
                    cVar.f57806h = n(inputStream, i13);
                } else {
                    throw d.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    static c[] u(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        int iH = d.h(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
            try {
                c[] cVarArrV = v(byteArrayInputStream, bArr, iH, cVarArr);
                byteArrayInputStream.close();
                return cVarArrV;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        throw d.c("Content found after the end of file");
    }

    private static c[] v(InputStream inputStream, byte[] bArr, int i10, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i10 == cVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                d.h(inputStream);
                String strF = d.f(inputStream, d.h(inputStream));
                long jI = d.i(inputStream);
                int iH = d.h(inputStream);
                c cVarI = i(cVarArr, strF);
                if (cVarI != null) {
                    cVarI.f57802d = jI;
                    int[] iArrN = n(inputStream, iH);
                    if (Arrays.equals(bArr, i.f57834e)) {
                        cVarI.f57803e = iH;
                        cVarI.f57806h = iArrN;
                    }
                } else {
                    throw d.c("Missing profile key: " + strF);
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }
}
