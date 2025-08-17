package androidx.media3.common;

import java.io.IOException;

/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f55326a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55327b;

    public static ParserException a(String str, Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException b(String str, Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    protected ParserException(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f55326a = z10;
        this.f55327b = i10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f55326a);
        sb2.append(", dataType=");
        sb2.append(this.f55327b);
        sb2.append("}");
        return sb2.toString();
    }
}
