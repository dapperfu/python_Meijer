package j7;

import W6.a;
import a7.InterfaceC5665b;
import android.graphics.Bitmap;

/* renamed from: j7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14960b implements a.InterfaceC0877a {

    /* renamed from: a, reason: collision with root package name */
    private final a7.d f140143a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5665b f140144b;

    @Override // W6.a.InterfaceC0877a
    public void a(Bitmap bitmap) {
        this.f140143a.c(bitmap);
    }

    @Override // W6.a.InterfaceC0877a
    public byte[] b(int i10) {
        InterfaceC5665b interfaceC5665b = this.f140144b;
        return interfaceC5665b == null ? new byte[i10] : (byte[]) interfaceC5665b.c(i10, byte[].class);
    }

    @Override // W6.a.InterfaceC0877a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f140143a.e(i10, i11, config);
    }

    @Override // W6.a.InterfaceC0877a
    public int[] d(int i10) {
        InterfaceC5665b interfaceC5665b = this.f140144b;
        return interfaceC5665b == null ? new int[i10] : (int[]) interfaceC5665b.c(i10, int[].class);
    }

    @Override // W6.a.InterfaceC0877a
    public void e(byte[] bArr) {
        InterfaceC5665b interfaceC5665b = this.f140144b;
        if (interfaceC5665b == null) {
            return;
        }
        interfaceC5665b.put(bArr);
    }

    @Override // W6.a.InterfaceC0877a
    public void f(int[] iArr) {
        InterfaceC5665b interfaceC5665b = this.f140144b;
        if (interfaceC5665b == null) {
            return;
        }
        interfaceC5665b.put(iArr);
    }

    public C14960b(a7.d dVar, InterfaceC5665b interfaceC5665b) {
        this.f140143a = dVar;
        this.f140144b = interfaceC5665b;
    }
}
