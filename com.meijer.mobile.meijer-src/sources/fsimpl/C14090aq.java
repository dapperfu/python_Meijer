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
/* loaded from: classes15.dex */
public class C14090aq {

    /* renamed from: a, reason: collision with root package name */
    private final C14138ck f132936a;

    public C14090aq(C14138ck c14138ck) {
        this.f132936a = c14138ck;
    }

    private static void a(String str, C14181ea c14181ea) {
        a(str, "active", c14181ea.a());
        a(str, "activeWhenConsented", c14181ea.b());
        a(str, "activeWhenNotConsented", c14181ea.c());
    }

    private static void a(String str, String str2, dQ[] dQVarArr) {
        Log.d("Selector name=" + str + "; type=" + str2 + "; length=" + dQVarArr.length);
        for (dQ dQVar : dQVarArr) {
            Log.d("    " + dQVar);
        }
    }

    private C14091ar b(RustInterface rustInterface, ByteBuffer byteBuffer, String str, String str2, boolean z10) {
        C14174du c14174duA = C14175dv.a(byteBuffer).a();
        if (c14174duA == null) {
            Log.d("Invalid server response - no session response");
            return null;
        }
        C14155da c14155daB = c14174duA.b();
        if (c14155daB == null) {
            Log.d("Invalid server response - no session options");
            return null;
        }
        C14091ar c14091ar = new C14091ar(this.f132936a);
        c14091ar.b(str2);
        c14091ar.c(str);
        c14091ar.a(str != null && str.contains("-"));
        c14091ar.a(this.f132936a.l());
        c14091ar.c(c14155daB.a());
        if (c14155daB.b() == 0 || c14155daB.c() == 0 || c14155daB.d() == 0) {
            Log.d("Invalid server response - invalid frame configuration");
            return null;
        }
        String strA = this.f132936a.a(c14174duA.a().a());
        c14091ar.a(new URL(Uri.parse(strA + c14174duA.a().b()).buildUpon().appendQueryParameter("Build", this.f132936a.g()).appendQueryParameter("OrgId", this.f132936a.l()).appendQueryParameter("Platform", "android").toString()));
        c14091ar.b(new URL(Uri.parse(strA + c14174duA.a().c()).buildUpon().appendQueryParameter("OrgId", this.f132936a.l()).toString()));
        if (c14174duA.a().d() != null) {
            c14091ar.c(new URL(Uri.parse(strA + c14174duA.a().d()).buildUpon().appendQueryParameter("mobile", "true").appendQueryParameter("OrgId", this.f132936a.l()).toString()));
        }
        dX dXVarA = dX.a(c14174duA, c14155daB, !this.f132936a.c());
        dXVarA.a(rustInterface, this.f132936a);
        String[] strArrA = dXVarA.a();
        if (strArrA != null && strArrA.length > 0) {
            String string = Arrays.toString(strArrA);
            if (this.f132936a.b()) {
                Log.logAlways("FullStory session stopped due to unmatched selectors: " + string);
            }
            Bootstrap.fail(-32757, "Unmatched selectors: " + string);
            return null;
        }
        c14091ar.h(c14174duA.c());
        if (c14091ar.t() != this.f132936a.O()) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = this.f132936a.O() ? "enabled" : "disabled";
            objArr[1] = c14091ar.t() ? "in" : "not in";
            Log.e(String.format(locale, "Preview mode is %s in configuration, but returned session is %s preview mode", objArr));
        } else if (c14091ar.t()) {
            Log.d("Session is in preview mode.");
        }
        Log.d(c14091ar.u() ? String.format(Locale.US, "Session uses async view scanning with %,d ns slices.", Long.valueOf(c14091ar.v())) : "Session uses synchronous view scanning.");
        c14091ar.a(dXVarA.b());
        c14091ar.b(dXVarA.c());
        c14091ar.c(dXVarA.d());
        c14091ar.d(dXVarA.e());
        c14091ar.e(dXVarA.f());
        c14091ar.f(dXVarA.g());
        if (this.f132936a.o()) {
            a("Omitted", c14091ar.g());
            a("Excluded", c14091ar.h());
            a("Masked", c14091ar.i());
            a("Unmasked", c14091ar.j());
            a("Watched", c14091ar.k());
        }
        c14091ar.b(z10);
        c14091ar.d(c14155daB.e());
        c14091ar.e(c14155daB.g());
        c14091ar.f(c14155daB.i());
        c14091ar.g(!(c14155daB.j() == 2));
        return c14091ar;
    }

    public C14091ar a(RustInterface rustInterface, ByteBuffer byteBuffer, String str, String str2, boolean z10) {
        if (byteBuffer == null || byteBuffer.capacity() == 0) {
            return new C14091ar(this.f132936a);
        }
        try {
            C14091ar c14091arB = b(rustInterface, byteBuffer, str, str2, z10);
            if (c14091arB == null) {
                Log.logAlways("Invalid session response, disabling session");
                return new C14091ar(this.f132936a);
            }
            Log.logAlways(c14091arB.f() ? "FullStory session started" : "FullStory session disabled");
            return c14091arB;
        } catch (Throwable th2) {
            Log.logAlways("Failed to parse session data, disabling session");
            Log.e("Failed to parse session data, disabling session", th2);
            return new C14091ar(this.f132936a);
        }
    }

    public C14091ar a(RustInterface rustInterface, byte[] bArr, String str, String str2, boolean z10) {
        return a(rustInterface, ByteBuffer.wrap(bArr), str, str2, z10);
    }
}
