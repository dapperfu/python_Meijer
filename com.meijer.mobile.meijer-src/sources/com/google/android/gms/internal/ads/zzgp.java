package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes6.dex */
public class zzgp extends zzfz {

    /* renamed from: b, reason: collision with root package name */
    public final int f81544b;

    public zzgp(C8155fk0 c8155fk0, int i10, int i11) {
        super(b(2008, 1));
        this.f81544b = 1;
    }

    private static int b(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }

    public zzgp(IOException iOException, C8155fk0 c8155fk0, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f81544b = i11;
    }

    public zzgp(String str, C8155fk0 c8155fk0, int i10, int i11) {
        super(str, b(i10, i11));
        this.f81544b = i11;
    }

    public static zzgp a(IOException iOException, C8155fk0 c8155fk0, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && C8571jf0.a(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new zzgo(iOException, c8155fk0);
        }
        return new zzgp(iOException, c8155fk0, i11, i10);
    }

    public zzgp(String str, IOException iOException, C8155fk0 c8155fk0, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f81544b = i11;
    }
}
