package fsimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes15.dex */
public class aK {

    /* renamed from: a, reason: collision with root package name */
    public String f132735a;

    /* renamed from: b, reason: collision with root package name */
    public String f132736b;

    /* renamed from: c, reason: collision with root package name */
    public List f132737c;

    /* renamed from: d, reason: collision with root package name */
    public Map f132738d;

    /* renamed from: e, reason: collision with root package name */
    public String f132739e;

    /* renamed from: f, reason: collision with root package name */
    public String f132740f;

    /* renamed from: g, reason: collision with root package name */
    public String f132741g;

    /* renamed from: h, reason: collision with root package name */
    public byte f132742h;

    /* renamed from: i, reason: collision with root package name */
    private byte f132743i;

    private void a(byte b10, boolean z10) {
        int i10;
        if (z10) {
            i10 = b10 | this.f132743i;
        } else {
            i10 = (b10 ^ (-1)) & this.f132743i;
        }
        this.f132743i = (byte) i10;
    }

    private boolean a(byte b10) {
        return (b10 & this.f132743i) != 0;
    }

    public void a() {
        if (this.f132738d == null) {
            this.f132738d = new HashMap();
        }
    }

    public void a(boolean z10) {
        a((byte) 1, z10);
    }

    public void b() {
        if (this.f132737c == null) {
            this.f132737c = new ArrayList();
        }
    }

    public void b(boolean z10) {
        a((byte) 2, z10);
    }

    public void c(boolean z10) {
        a((byte) 4, z10);
    }

    public boolean c() {
        return a((byte) 1);
    }

    public void d(boolean z10) {
        a((byte) 8, z10);
    }

    public boolean d() {
        return a((byte) 2);
    }

    public void e(boolean z10) {
        a(C14170dq.SCREEN, z10);
    }

    public boolean e() {
        return a((byte) 4);
    }

    public void f(boolean z10) {
        a((byte) 32, z10);
    }

    public boolean f() {
        return a((byte) 8);
    }

    public boolean g() {
        return a(C14170dq.SCREEN);
    }

    public boolean h() {
        return a((byte) 32);
    }

    public String toString() {
        return String.format(Locale.US, "ViewAttributeEmulation: [tagName=%s; hidden=%b; id=%s; attrViewClass=%s; attrPackage=%s; attrType=%d; attrHref=%s; isTextField=%b; classes=%s; attributes=%s]", this.f132735a, Boolean.valueOf(c()), this.f132736b, this.f132739e, this.f132740f, Byte.valueOf(this.f132742h), this.f132741g, Boolean.valueOf(d()), this.f132737c, this.f132738d);
    }
}
