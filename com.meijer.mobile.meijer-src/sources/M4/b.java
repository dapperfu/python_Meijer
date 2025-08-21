package M4;

import java.util.Objects;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final c[] f19654a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19655b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f19656c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19657d;

    public b(String str, c[] cVarArr) {
        this.f19655b = str;
        this.f19656c = null;
        this.f19654a = cVarArr;
        this.f19657d = 0;
    }

    public String b() {
        a(0);
        return this.f19655b;
    }

    private void a(int i10) {
        if (i10 == this.f19657d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f19657d) + " expected, but got " + c(i10));
    }

    private String c(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public b(byte[] bArr, c[] cVarArr) {
        Objects.requireNonNull(bArr);
        this.f19656c = bArr;
        this.f19655b = null;
        this.f19654a = cVarArr;
        this.f19657d = 1;
    }
}
