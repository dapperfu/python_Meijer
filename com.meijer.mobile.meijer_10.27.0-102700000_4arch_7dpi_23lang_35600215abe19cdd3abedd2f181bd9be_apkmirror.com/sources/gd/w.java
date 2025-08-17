package gd;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
abstract class w extends u {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference f133336c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f133337b;

    @Override // gd.u
    final byte[] F2() {
        byte[] bArrN3;
        synchronized (this) {
            try {
                bArrN3 = (byte[]) this.f133337b.get();
                if (bArrN3 == null) {
                    bArrN3 = N3();
                    this.f133337b = new WeakReference(bArrN3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrN3;
    }

    protected abstract byte[] N3();

    w(byte[] bArr) {
        super(bArr);
        this.f133337b = f133336c;
    }
}
