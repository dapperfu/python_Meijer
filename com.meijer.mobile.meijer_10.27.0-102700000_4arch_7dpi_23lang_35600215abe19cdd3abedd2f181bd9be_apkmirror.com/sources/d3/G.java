package d3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class G implements InterfaceC13473h {
    @Override // d3.InterfaceC13473h
    public void f() {
    }

    @Override // d3.InterfaceC13473h
    public InterfaceC13479n e(Looper looper, Handler.Callback callback) {
        return new H(new Handler(looper, callback));
    }

    protected G() {
    }

    @Override // d3.InterfaceC13473h
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // d3.InterfaceC13473h
    public long b() {
        return System.nanoTime();
    }

    @Override // d3.InterfaceC13473h
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // d3.InterfaceC13473h
    public long d() {
        return SystemClock.uptimeMillis();
    }
}
