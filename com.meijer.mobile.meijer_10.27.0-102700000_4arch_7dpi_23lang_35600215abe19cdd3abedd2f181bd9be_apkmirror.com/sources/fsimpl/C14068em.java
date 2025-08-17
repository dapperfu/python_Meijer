package fsimpl;

import java.io.IOException;

/* renamed from: fsimpl.em, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14068em extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public int f132160a;

    public C14068em(int i10, String str) {
        super(str);
        this.f132160a = i10;
    }

    public boolean a() {
        int i10;
        return b() || ((i10 = this.f132160a) != 408 && i10 >= 400 && i10 < 500);
    }

    public boolean b() {
        int i10 = this.f132160a;
        return i10 == 202 || i10 == 206;
    }
}
