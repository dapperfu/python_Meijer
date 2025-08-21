package fsimpl;

import java.io.IOException;

/* renamed from: fsimpl.em, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14193em extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public int f133410a;

    public C14193em(int i10, String str) {
        super(str);
        this.f133410a = i10;
    }

    public boolean a() {
        int i10;
        return b() || ((i10 = this.f133410a) != 408 && i10 >= 400 && i10 < 500);
    }

    public boolean b() {
        int i10 = this.f133410a;
        return i10 == 202 || i10 == 206;
    }
}
