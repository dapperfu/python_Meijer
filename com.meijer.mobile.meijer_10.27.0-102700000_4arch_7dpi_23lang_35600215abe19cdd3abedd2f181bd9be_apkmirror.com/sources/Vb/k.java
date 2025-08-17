package Vb;

import android.bluetooth.BluetoothAdapter;
import cb.C6380a;
import cb.C6381b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class k extends Za.d {

    /* renamed from: i, reason: collision with root package name */
    private static final C6380a f37098i = C6381b.a(k.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private final n f37100f;

    /* renamed from: e, reason: collision with root package name */
    private final Object f37099e = new Object();

    /* renamed from: g, reason: collision with root package name */
    int f37101g = 1000;

    /* renamed from: h, reason: collision with root package name */
    int f37102h = 1000;

    final void a() {
        synchronized (this.f37099e) {
            this.f37099e.notifyAll();
        }
    }

    @Override // Za.d
    public final String e() {
        return k.class.getSimpleName();
    }

    public k(n nVar) {
        this.f37100f = nVar;
    }

    @Override // Za.d
    public final void c(AtomicBoolean atomicBoolean) throws Exception {
        while (!atomicBoolean.get()) {
            synchronized (this.f37099e) {
                try {
                    n nVar = this.f37100f;
                    try {
                        BluetoothAdapter bluetoothAdapterJ = nVar.j();
                        if (bluetoothAdapterJ != null) {
                            nVar.h();
                            bluetoothAdapterJ.startLeScan(nVar);
                        } else {
                            n.f37122k.g("BluetoothAdapter - Adapter is null", new Object[0]);
                        }
                    } catch (Exception e10) {
                        n.f37122k.g("Start Scanning failed", e10);
                    }
                    try {
                        this.f37099e.wait(this.f37101g);
                        this.f37100f.l();
                        this.f37099e.wait(this.f37102h);
                    } finally {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
