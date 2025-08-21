package Xb;

import android.bluetooth.BluetoothAdapter;
import eb.C13784a;
import eb.C13785b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class k extends bb.d {

    /* renamed from: i, reason: collision with root package name */
    private static final C13784a f41810i = C13785b.a(k.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private final n f41812f;

    /* renamed from: e, reason: collision with root package name */
    private final Object f41811e = new Object();

    /* renamed from: g, reason: collision with root package name */
    int f41813g = 1000;

    /* renamed from: h, reason: collision with root package name */
    int f41814h = 1000;

    final void a() {
        synchronized (this.f41811e) {
            this.f41811e.notifyAll();
        }
    }

    @Override // bb.d
    public final String e() {
        return k.class.getSimpleName();
    }

    public k(n nVar) {
        this.f41812f = nVar;
    }

    @Override // bb.d
    public final void c(AtomicBoolean atomicBoolean) throws Exception {
        while (!atomicBoolean.get()) {
            synchronized (this.f41811e) {
                try {
                    n nVar = this.f41812f;
                    try {
                        BluetoothAdapter bluetoothAdapterJ = nVar.j();
                        if (bluetoothAdapterJ != null) {
                            nVar.h();
                            bluetoothAdapterJ.startLeScan(nVar);
                        } else {
                            n.f41834k.g("BluetoothAdapter - Adapter is null", new Object[0]);
                        }
                    } catch (Exception e10) {
                        n.f41834k.g("Start Scanning failed", e10);
                    }
                    try {
                        this.f41811e.wait(this.f41813g);
                        this.f41812f.l();
                        this.f41811e.wait(this.f41814h);
                    } finally {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
