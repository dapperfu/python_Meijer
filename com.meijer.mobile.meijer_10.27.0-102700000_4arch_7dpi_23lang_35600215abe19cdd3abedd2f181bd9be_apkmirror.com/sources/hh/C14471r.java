package hh;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.util.Objects;

/* renamed from: hh.r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C14471r {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f135045a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Reader f135046b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f135047c;

    /* renamed from: d, reason: collision with root package name */
    private final String f135048d;

    /* renamed from: e, reason: collision with root package name */
    private final String f135049e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f135050f;

    public C14471r(String str, String str2, String str3, URI uri) {
        this.f135048d = str == null ? "message" : str;
        this.f135045a = str2 == null ? "" : str2;
        this.f135046b = null;
        this.f135047c = new Object();
        this.f135049e = str3;
        this.f135050f = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C14471r c14471r = (C14471r) obj;
            if (Objects.equals(c(), c14471r.c()) && Objects.equals(b(), c14471r.b()) && Objects.equals(d(), c14471r.d()) && Objects.equals(e(), c14471r.e())) {
                return true;
            }
        }
        return false;
    }

    void a() {
        synchronized (this.f135047c) {
            if (this.f135046b != null) {
                try {
                    this.f135046b.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public String b() {
        if (this.f135045a != null) {
            return this.f135045a;
        }
        synchronized (this.f135047c) {
            try {
                if (this.f135045a != null) {
                    return this.f135045a;
                }
                char[] cArr = new char[2000];
                StringBuilder sb2 = new StringBuilder(2000);
                while (true) {
                    try {
                        int i10 = this.f135046b.read(cArr, 0, 2000);
                        if (i10 == -1) {
                            break;
                        }
                        sb2.append(cArr, 0, i10);
                    } catch (IOException unused) {
                    }
                }
                this.f135046b.close();
                this.f135045a = sb2.toString();
                this.f135046b = new StringReader(this.f135045a);
                return this.f135045a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String c() {
        return this.f135048d;
    }

    public String d() {
        return this.f135049e;
    }

    public URI e() {
        return this.f135050f;
    }

    public String toString() {
        String string;
        synchronized (this.f135047c) {
            try {
                StringBuilder sb2 = new StringBuilder("MessageEvent(eventName=");
                sb2.append(this.f135048d);
                sb2.append(",data=");
                sb2.append(this.f135045a == null ? "<streaming>" : this.f135045a);
                if (this.f135049e != null) {
                    sb2.append(",id=");
                    sb2.append(this.f135049e);
                }
                sb2.append(",origin=");
                sb2.append(this.f135050f);
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

    public C14471r(String str, Reader reader, String str2, URI uri) {
        this.f135045a = null;
        this.f135046b = reader;
        this.f135047c = new Object();
        this.f135048d = str == null ? "message" : str;
        this.f135049e = str2;
        this.f135050f = uri;
    }
}
