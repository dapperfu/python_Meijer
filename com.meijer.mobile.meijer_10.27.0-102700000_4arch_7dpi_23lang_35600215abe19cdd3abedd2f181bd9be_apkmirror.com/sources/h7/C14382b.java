package h7;

import U6.a;
import android.graphics.Bitmap;

/* renamed from: h7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14382b implements a.InterfaceC0784a {

    /* renamed from: a, reason: collision with root package name */
    private final Y6.d f134456a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.b f134457b;

    @Override // U6.a.InterfaceC0784a
    public void a(Bitmap bitmap) {
        this.f134456a.c(bitmap);
    }

    @Override // U6.a.InterfaceC0784a
    public byte[] b(int i10) {
        Y6.b bVar = this.f134457b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // U6.a.InterfaceC0784a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f134456a.e(i10, i11, config);
    }

    @Override // U6.a.InterfaceC0784a
    public int[] d(int i10) {
        Y6.b bVar = this.f134457b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // U6.a.InterfaceC0784a
    public void e(byte[] bArr) {
        Y6.b bVar = this.f134457b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // U6.a.InterfaceC0784a
    public void f(int[] iArr) {
        Y6.b bVar = this.f134457b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public C14382b(Y6.d dVar, Y6.b bVar) {
        this.f134456a = dVar;
        this.f134457b = bVar;
    }
}
