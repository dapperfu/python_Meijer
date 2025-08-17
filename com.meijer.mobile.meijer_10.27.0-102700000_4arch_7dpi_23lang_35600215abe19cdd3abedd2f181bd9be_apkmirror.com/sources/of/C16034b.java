package of;

import java.io.File;
import rf.AbstractC16777F;

/* renamed from: of.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16034b extends C {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16777F f153489a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153490b;

    /* renamed from: c, reason: collision with root package name */
    private final File f153491c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c10 = (C) obj;
            if (this.f153489a.equals(c10.b()) && this.f153490b.equals(c10.d()) && this.f153491c.equals(c10.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // of.C
    public AbstractC16777F b() {
        return this.f153489a;
    }

    @Override // of.C
    public File c() {
        return this.f153491c;
    }

    @Override // of.C
    public String d() {
        return this.f153490b;
    }

    public int hashCode() {
        return ((((this.f153489a.hashCode() ^ 1000003) * 1000003) ^ this.f153490b.hashCode()) * 1000003) ^ this.f153491c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f153489a + ", sessionId=" + this.f153490b + ", reportFile=" + this.f153491c + "}";
    }

    C16034b(AbstractC16777F abstractC16777F, String str, File file) {
        if (abstractC16777F != null) {
            this.f153489a = abstractC16777F;
            if (str != null) {
                this.f153490b = str;
                if (file != null) {
                    this.f153491c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }
}
