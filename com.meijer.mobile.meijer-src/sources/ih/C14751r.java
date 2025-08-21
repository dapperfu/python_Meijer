package ih;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.util.Objects;

/* renamed from: ih.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C14751r {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f137685a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Reader f137686b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f137687c;

    /* renamed from: d, reason: collision with root package name */
    private final String f137688d;

    /* renamed from: e, reason: collision with root package name */
    private final String f137689e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f137690f;

    public C14751r(String str, String str2, String str3, URI uri) {
        this.f137688d = str == null ? "message" : str;
        this.f137685a = str2 == null ? "" : str2;
        this.f137686b = null;
        this.f137687c = new Object();
        this.f137689e = str3;
        this.f137690f = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C14751r c14751r = (C14751r) obj;
            if (Objects.equals(c(), c14751r.c()) && Objects.equals(b(), c14751r.b()) && Objects.equals(d(), c14751r.d()) && Objects.equals(e(), c14751r.e())) {
                return true;
            }
        }
        return false;
    }

    void a() {
        synchronized (this.f137687c) {
            if (this.f137686b != null) {
                try {
                    this.f137686b.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public String b() {
        if (this.f137685a != null) {
            return this.f137685a;
        }
        synchronized (this.f137687c) {
            try {
                if (this.f137685a != null) {
                    return this.f137685a;
                }
                char[] cArr = new char[2000];
                StringBuilder sb2 = new StringBuilder(2000);
                while (true) {
                    try {
                        int i10 = this.f137686b.read(cArr, 0, 2000);
                        if (i10 == -1) {
                            break;
                        }
                        sb2.append(cArr, 0, i10);
                    } catch (IOException unused) {
                    }
                }
                this.f137686b.close();
                this.f137685a = sb2.toString();
                this.f137686b = new StringReader(this.f137685a);
                return this.f137685a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String c() {
        return this.f137688d;
    }

    public String d() {
        return this.f137689e;
    }

    public URI e() {
        return this.f137690f;
    }

    public String toString() {
        String string;
        synchronized (this.f137687c) {
            try {
                StringBuilder sb2 = new StringBuilder("MessageEvent(eventName=");
                sb2.append(this.f137688d);
                sb2.append(",data=");
                sb2.append(this.f137685a == null ? "<streaming>" : this.f137685a);
                if (this.f137689e != null) {
                    sb2.append(",id=");
                    sb2.append(this.f137689e);
                }
                sb2.append(",origin=");
                sb2.append(this.f137690f);
                sb2.append(')');
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public int hashCode() {
        return Objects.hash(c(), b(), d(), e());
    }

    public C14751r(String str, Reader reader, String str2, URI uri) {
        this.f137685a = null;
        this.f137686b = reader;
        this.f137687c = new Object();
        this.f137688d = str == null ? "message" : str;
        this.f137689e = str2;
        this.f137690f = uri;
    }
}
