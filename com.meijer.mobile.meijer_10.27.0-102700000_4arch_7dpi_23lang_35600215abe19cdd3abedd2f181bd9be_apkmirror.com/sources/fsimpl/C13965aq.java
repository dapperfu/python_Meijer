package fsimpl;

import android.net.Uri;
import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: fsimpl.aq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13965aq {

    /* renamed from: a, reason: collision with root package name */
    private final C14013ck f131686a;

    public C13965aq(C14013ck c14013ck) {
        this.f131686a = c14013ck;
    }

    private static void a(String str, C14056ea c14056ea) {
        a(str, "active", c14056ea.a());
        a(str, "activeWhenConsented", c14056ea.b());
        a(str, "activeWhenNotConsented", c14056ea.c());
    }

    private static void a(String str, String str2, dQ[] dQVarArr) {
        Log.d("Selector name=" + str + "; type=" + str2 + "; length=" + dQVarArr.length);
        for (dQ dQVar : dQVarArr) {
            Log.d("    " + dQVar);
        }
    }

    private C13966ar b(RustInterface rustInterface, ByteBuffer byteBuffer, String str, String str2, boolean z10) {
        C14049du c14049duA = C14050dv.a(byteBuffer).a();
        if (c14049duA == null) {
            Log.d("Invalid server response - no session response");
            return null;
        }
        C14030da c14030daB = c14049duA.b();
        if (c14030daB == null) {
            Log.d("Invalid server response - no session options");
            return null;
        }
        C13966ar c13966ar = new C13966ar(this.f131686a);
        c13966ar.b(str2);
        c13966ar.c(str);
        c13966ar.a(str != null && str.contains("-"));
        c13966ar.a(this.f131686a.l());
        c13966ar.c(c14030daB.a());
        if (c14030daB.b() == 0 || c14030daB.c() == 0 || c14030daB.d() == 0) {
            Log.d("Invalid server response - invalid frame configuration");
            return null;
        }
        String strA = this.f131686a.a(c14049duA.a().a());
        c13966ar.a(new URL(Uri.parse(strA + c14049duA.a().b()).buildUpon().appendQueryParameter("Build", this.f131686a.g()).appendQueryParameter("OrgId", this.f131686a.l()).appendQueryParameter("Platform", "android").toString()));
        c13966ar.b(new URL(Uri.parse(strA + c14049duA.a().c()).buildUpon().appendQueryParameter("OrgId", this.f131686a.l()).toString()));
        if (c14049duA.a().d() != null) {
            c13966ar.c(new URL(Uri.parse(strA + c14049duA.a().d()).buildUpon().appendQueryParameter("mobile", "true").appendQueryParameter("OrgId", this.f131686a.l()).toString()));
        }
        dX dXVarA = dX.a(c14049duA, c14030daB, !this.f131686a.c());
        dXVarA.a(rustInterface, this.f131686a);
        String[] strArrA = dXVarA.a();
        if (strArrA != null && strArrA.length > 0) {
            String string = Arrays.toString(strArrA);
            if (this.f131686a.b()) {
                Log.logAlways("FullStory session stopped due to unmatched selectors: " + string);
            }
            Bootstrap.fail(-32757, "Unmatched selectors: " + string);
            return null;
        }
        c13966ar.h(c14049duA.c());
        if (c13966ar.t() != this.f131686a.O()) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = this.f131686a.O() ? "enabled" : "disabled";
            objArr[1] = c13966ar.t() ? "in" : "not in";
            Log.e(String.format(locale, "Preview mode is %s in configuration, but returned session is %s preview mode", objArr));
        } else if (c13966ar.t()) {
            Log.d("Session is in preview mode.");
        }
        Log.d(c13966ar.u() ? String.format(Locale.US, "Session uses async view scanning with %,d ns slices.", Long.valueOf(c13966ar.v())) : "Session uses synchronous view scanning.");
        c13966ar.a(dXVarA.b());
        c13966ar.b(dXVarA.c());
        c13966ar.c(dXVarA.d());
        c13966ar.d(dXVarA.e());
        c13966ar.e(dXVarA.f());
        c13966ar.f(dXVarA.g());
        if (this.f131686a.o()) {
            a("Omitted", c13966ar.g());
            a("Excluded", c13966ar.h());
            a("Masked", c13966ar.i());
            a("Unmasked", c13966ar.j());
            a("Watched", c13966ar.k());
        }
        c13966ar.b(z10);
        c13966ar.d(c14030daB.e());
        c13966ar.e(c14030daB.g());
        c13966ar.f(c14030daB.i());
        c13966ar.g(!(c14030daB.j() == 2));
        return c13966ar;
    }

    public C13966ar a(RustInterface rustInterface, ByteBuffer byteBuffer, String str, String str2, boolean z10) {
        if (byteBuffer == null || byteBuffer.capacity() == 0) {
            return new C13966ar(this.f131686a);
        }
        try {
            C13966ar c13966arB = b(rustInterface, byteBuffer, str, str2, z10);
            if (c13966arB == null) {
                Log.logAlways("Invalid session response, disabling session");
                return new C13966ar(this.f131686a);
            }
            Log.logAlways(c13966arB.f() ? "FullStory session started" : "FullStory session disabled");
            return c13966arB;
        } catch (Throwable th2) {
            Log.logAlways("Failed to parse session data, disabling session");
            Log.e("Failed to parse session data, disabling session", th2);
            return new C13966ar(this.f131686a);
        }
    }

    public C13966ar a(RustInterface rustInterface, byte[] bArr, String str, String str2, boolean z10) {
        return a(rustInterface, ByteBuffer.wrap(bArr), str, str2, z10);
    }
}
