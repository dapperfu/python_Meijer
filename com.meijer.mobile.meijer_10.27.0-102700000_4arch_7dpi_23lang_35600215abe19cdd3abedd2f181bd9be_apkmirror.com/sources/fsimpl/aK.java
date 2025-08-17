package fsimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes14.dex */
public class aK {

    /* renamed from: a, reason: collision with root package name */
    public String f131485a;

    /* renamed from: b, reason: collision with root package name */
    public String f131486b;

    /* renamed from: c, reason: collision with root package name */
    public List f131487c;

    /* renamed from: d, reason: collision with root package name */
    public Map f131488d;

    /* renamed from: e, reason: collision with root package name */
    public String f131489e;

    /* renamed from: f, reason: collision with root package name */
    public String f131490f;

    /* renamed from: g, reason: collision with root package name */
    public String f131491g;

    /* renamed from: h, reason: collision with root package name */
    public byte f131492h;

    /* renamed from: i, reason: collision with root package name */
    private byte f131493i;

    private void a(byte b10, boolean z10) {
        int i10;
        if (z10) {
            i10 = b10 | this.f131493i;
        } else {
            i10 = (b10 ^ (-1)) & this.f131493i;
        }
        this.f131493i = (byte) i10;
    }

    private boolean a(byte b10) {
        return (b10 & this.f131493i) != 0;
    }

    public void a() {
        if (this.f131488d == null) {
            this.f131488d = new HashMap();
        }
    }

    public void a(boolean z10) {
        a((byte) 1, z10);
    }

    public void b() {
        if (this.f131487c == null) {
            this.f131487c = new ArrayList();
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
        a(C14045dq.SCREEN, z10);
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
        return a(C14045dq.SCREEN);
    }

    public boolean h() {
        return a((byte) 32);
    }

    public String toString() {
        return String.format(Locale.US, "ViewAttributeEmulation: [tagName=%s; hidden=%b; id=%s; attrViewClass=%s; attrPackage=%s; attrType=%d; attrHref=%s; isTextField=%b; classes=%s; attributes=%s]", this.f131485a, Boolean.valueOf(c()), this.f131486b, this.f131489e, this.f131490f, Byte.valueOf(this.f131492h), this.f131491g, Boolean.valueOf(d()), this.f131487c, this.f131488d);
    }
}
