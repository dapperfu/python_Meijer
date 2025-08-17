package L4;

import java.util.Objects;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final c[] f17871a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17872b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f17873c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17874d;

    public b(String str, c[] cVarArr) {
        this.f17872b = str;
        this.f17873c = null;
        this.f17871a = cVarArr;
        this.f17874d = 0;
    }

    public String b() {
        a(0);
        return this.f17872b;
    }

    private void a(int i10) {
        if (i10 == this.f17874d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f17874d) + " expected, but got " + c(i10));
    }

    private String c(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public b(byte[] bArr, c[] cVarArr) {
        Objects.requireNonNull(bArr);
        this.f17873c = bArr;
        this.f17872b = null;
        this.f17871a = cVarArr;
        this.f17874d = 1;
    }
}
