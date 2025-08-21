package Ku;

import av.j;

/* loaded from: classes10.dex */
public final class a {
    public static void b(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static RuntimeException a(Throwable th2) {
        throw j.d(th2);
    }
}
