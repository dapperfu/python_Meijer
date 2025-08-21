package qf;

import java.io.File;
import tf.AbstractC17251F;

/* renamed from: qf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C16642b extends C {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17251F f158341a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158342b;

    /* renamed from: c, reason: collision with root package name */
    private final File f158343c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c10 = (C) obj;
            if (this.f158341a.equals(c10.b()) && this.f158342b.equals(c10.d()) && this.f158343c.equals(c10.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // qf.C
    public AbstractC17251F b() {
        return this.f158341a;
    }

    @Override // qf.C
    public File c() {
        return this.f158343c;
    }

    @Override // qf.C
    public String d() {
        return this.f158342b;
    }

    public int hashCode() {
        return ((((this.f158341a.hashCode() ^ 1000003) * 1000003) ^ this.f158342b.hashCode()) * 1000003) ^ this.f158343c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f158341a + ", sessionId=" + this.f158342b + ", reportFile=" + this.f158343c + "}";
    }

    C16642b(AbstractC17251F abstractC17251F, String str, File file) {
        if (abstractC17251F != null) {
            this.f158341a = abstractC17251F;
            if (str != null) {
                this.f158342b = str;
                if (file != null) {
                    this.f158343c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }
}
