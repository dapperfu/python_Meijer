package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import d3.P;
import f3.C13950e;
import f3.InterfaceC13949d;
import f3.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    private static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(InterfaceC13949d interfaceC13949d, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        f3.n nVar = new f3.n(interfaceC13949d);
        f3.g gVarA = new g.b().i(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        f3.g gVarA2 = gVarA;
        while (true) {
            try {
                C13950e c13950e = new C13950e(nVar, gVarA2);
                try {
                    byte[] bArrB = Ge.a.b(c13950e);
                    P.l(c13950e);
                    return bArrB;
                } catch (HttpDataSource$InvalidResponseCodeException e10) {
                    try {
                        String strC = c(e10, i10);
                        if (strC == null) {
                            throw e10;
                        }
                        i10++;
                        gVarA2 = gVarA2.a().i(strC).a();
                        P.l(c13950e);
                    } catch (Throwable th2) {
                        P.l(c13950e);
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(gVarA, nVar.o(), nVar.c(), nVar.n(), e11);
            }
        }
    }

    public static int b(Throwable th2, int i10) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return P.X(P.Y(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (P.f127888a >= 23 && a.a(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || d(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th2 instanceof KeysExpiredException) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = httpDataSource$InvalidResponseCodeException.f55668d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = httpDataSource$InvalidResponseCodeException.f55670f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean d(Throwable th2) {
        return P.f127888a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th2) {
        return P.f127888a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
