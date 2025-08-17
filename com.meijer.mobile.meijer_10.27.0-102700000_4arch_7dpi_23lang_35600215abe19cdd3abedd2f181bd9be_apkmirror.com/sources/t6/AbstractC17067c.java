package t6;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;
import kw.z;

/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17067c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f161483g = new String[128];

    /* renamed from: a, reason: collision with root package name */
    int f161484a;

    /* renamed from: b, reason: collision with root package name */
    int[] f161485b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f161486c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f161487d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    boolean f161488e;

    /* renamed from: f, reason: collision with root package name */
    boolean f161489f;

    /* renamed from: t6.c$b */
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

    /* renamed from: t6.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f161490a;

        /* renamed from: b, reason: collision with root package name */
        final z f161491b;

        public static a a(String... strArr) {
            try {
                C15331h[] c15331hArr = new C15331h[strArr.length];
                C15328e c15328e = new C15328e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    AbstractC17067c.p(c15328e, strArr[i10]);
                    c15328e.readByte();
                    c15331hArr[i10] = c15328e.Q2();
                }
                return new a((String[]) strArr.clone(), z.s(c15331hArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        private a(String[] strArr, z zVar) {
            this.f161490a = strArr;
            this.f161491b = zVar;
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f161483g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f161483g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static AbstractC17067c h(InterfaceC15330g interfaceC15330g) {
        return new e(interfaceC15330g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(kw.InterfaceC15329f r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = t6.AbstractC17067c.f161483g
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
            r7.Q0(r8, r4, r3)
        L2e:
            r7.I0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.Q0(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.AbstractC17067c.p(kw.f, java.lang.String):void");
    }

    public final String getPath() {
        return C17068d.a(this.f161484a, this.f161485b, this.f161486c, this.f161487d);
    }

    final void j(int i10) {
        int i11 = this.f161484a;
        int[] iArr = this.f161485b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new C17065a("Nesting too deep at " + getPath());
            }
            this.f161485b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f161486c;
            this.f161486c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f161487d;
            this.f161487d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f161485b;
        int i12 = this.f161484a;
        this.f161484a = i12 + 1;
        iArr3[i12] = i10;
    }

    final C17066b u(String str) throws C17066b {
        throw new C17066b(str + " at path " + getPath());
    }

    AbstractC17067c() {
    }
}
