package u6;

import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14418g;
import gw.z;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: u6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17353c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f163736g = new String[128];

    /* renamed from: a, reason: collision with root package name */
    int f163737a;

    /* renamed from: b, reason: collision with root package name */
    int[] f163738b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f163739c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f163740d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    boolean f163741e;

    /* renamed from: f, reason: collision with root package name */
    boolean f163742f;

    /* renamed from: u6.c$b */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void g() throws IOException;

    public abstract boolean hasNext() throws IOException;

    public abstract b i() throws IOException;

    public abstract int l(a aVar) throws IOException;

    public abstract void m() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract void skipValue() throws IOException;

    /* renamed from: u6.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f163743a;

        /* renamed from: b, reason: collision with root package name */
        final z f163744b;

        public static a a(String... strArr) {
            try {
                C14419h[] c14419hArr = new C14419h[strArr.length];
                C14416e c14416e = new C14416e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    AbstractC17353c.p(c14416e, strArr[i10]);
                    c14416e.readByte();
                    c14419hArr[i10] = c14416e.P2();
                }
                return new a((String[]) strArr.clone(), z.s(c14419hArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        private a(String[] strArr, z zVar) {
            this.f163743a = strArr;
            this.f163744b = zVar;
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f163736g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f163736g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static AbstractC17353c h(InterfaceC14418g interfaceC14418g) {
        return new C17355e(interfaceC14418g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(gw.InterfaceC14417f r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = u6.AbstractC17353c.f163736g
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.N0(r8, r4, r3)
        L2e:
            r7.G0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.N0(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.AbstractC17353c.p(gw.f, java.lang.String):void");
    }

    public final String getPath() {
        return C17354d.a(this.f163737a, this.f163738b, this.f163739c, this.f163740d);
    }

    final void j(int i10) {
        int i11 = this.f163737a;
        int[] iArr = this.f163738b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new C17351a("Nesting too deep at " + getPath());
            }
            this.f163738b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f163739c;
            this.f163739c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f163740d;
            this.f163740d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f163738b;
        int i12 = this.f163737a;
        this.f163737a = i12 + 1;
        iArr3[i12] = i10;
    }

    final C17352b u(String str) throws C17352b {
        throw new C17352b(str + " at path " + getPath());
    }

    AbstractC17353c() {
    }
}
