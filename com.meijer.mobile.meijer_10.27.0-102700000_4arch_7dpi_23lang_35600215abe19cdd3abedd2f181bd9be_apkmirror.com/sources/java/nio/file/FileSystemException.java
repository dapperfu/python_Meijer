package java.nio.file;

import java.io.IOException;

/* loaded from: classes3.dex */
public class FileSystemException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final String f139539a;

    /* renamed from: b, reason: collision with root package name */
    private final String f139540b;

    public FileSystemException(String str) {
        super((String) null);
        this.f139539a = str;
        this.f139540b = null;
    }

    public FileSystemException(String str, String str2, String str3) {
        super(str3);
        this.f139539a = str;
        this.f139540b = str2;
    }

    public String getFile() {
        return this.f139539a;
    }

    public String getOtherFile() {
        return this.f139540b;
    }

    public String getReason() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f139539a == null && this.f139540b == null) {
            return getReason();
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f139539a != null) {
            sb2.append(this.f139539a);
        }
        if (this.f139540b != null) {
            sb2.append(" -> ");
            sb2.append(this.f139540b);
        }
        if (getReason() != null) {
            sb2.append(": ");
            sb2.append(getReason());
        }
        return sb2.toString();
    }
}
