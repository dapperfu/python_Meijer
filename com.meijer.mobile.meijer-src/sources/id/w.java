package id;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
abstract class w extends u {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference f137552c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f137553b;

    @Override // id.u
    final byte[] I2() {
        byte[] bArrZ3;
        synchronized (this) {
            try {
                bArrZ3 = (byte[]) this.f137553b.get();
                if (bArrZ3 == null) {
                    bArrZ3 = Z3();
                    this.f137553b = new WeakReference(bArrZ3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrZ3;
    }

    protected abstract byte[] Z3();

    w(byte[] bArr) {
        super(bArr);
        this.f137553b = f137552c;
    }
}
