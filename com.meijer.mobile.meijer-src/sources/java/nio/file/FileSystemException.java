package java.nio.file;

import java.io.IOException;

/* loaded from: classes3.dex */
public class FileSystemException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final String f140235a;

    /* renamed from: b, reason: collision with root package name */
    private final String f140236b;

    public FileSystemException(String str) {
        super((String) null);
        this.f140235a = str;
        this.f140236b = null;
    }

    public FileSystemException(String str, String str2, String str3) {
        super(str3);
        this.f140235a = str;
        this.f140236b = str2;
    }

    public String getFile() {
        return this.f140235a;
    }

    public String getOtherFile() {
        return this.f140236b;
    }

    public String getReason() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f140235a == null && this.f140236b == null) {
            return getReason();
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f140235a != null) {
            sb2.append(this.f140235a);
        }
        if (this.f140236b != null) {
            sb2.append(" -> ");
            sb2.append(this.f140236b);
        }
        if (getReason() != null) {
            sb2.append(": ");
            sb2.append(getReason());
        }
        return sb2.toString();
    }
}
