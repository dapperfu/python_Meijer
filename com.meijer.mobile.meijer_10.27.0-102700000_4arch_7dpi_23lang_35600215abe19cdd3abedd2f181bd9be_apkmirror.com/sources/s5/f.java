package s5;

import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.C6445d;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import f6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Ls5/f;", "", "<init>", "()V", "", "mobileCoreVersion", "analyticsVersion", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "versionString", "c", "(Ljava/lang/String;)Ljava/lang/String;", "coreExtensionVersion", "analyticsExtensionVersion", "a", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f160206a = new f();

    public static /* synthetic */ String b(f fVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = B.g();
            Intrinsics.i(str, "extensionVersion()");
        }
        if ((i10 & 2) != 0) {
            str2 = C6445d.a();
            Intrinsics.i(str2, "extensionVersion()");
        }
        return fVar.a(str, str2);
    }

    private final String c(String versionString) {
        String str;
        String str2;
        String str3;
        String[] strArr = (String[]) StringsKt.a1(versionString, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
        if (strArr.length != 3) {
            return "000000";
        }
        if (strArr[0].length() == 1) {
            str = '0' + strArr[0];
        } else {
            str = strArr[0];
        }
        if (strArr[1].length() == 1) {
            str2 = '0' + strArr[1];
        } else {
            str2 = strArr[1];
        }
        if (strArr[2].length() == 1) {
            str3 = '0' + strArr[2];
        } else {
            str3 = strArr[2];
        }
        return str + str2 + str3;
    }

    private final String d(String mobileCoreVersion, String analyticsVersion) {
        String str;
        String str2;
        String[] strArr = (String[]) StringsKt.a1(mobileCoreVersion, new String[]{"-"}, false, 0, 6, null).toArray(new String[0]);
        if (strArr.length == 2) {
            String str3 = strArr[0];
            str = strArr[1];
            str2 = str3;
        } else {
            str = "N";
            str2 = mobileCoreVersion;
        }
        String strC = c(str2);
        return "AND" + str + c(analyticsVersion) + strC;
    }

    public final String a(String coreExtensionVersion, String analyticsExtensionVersion) {
        Intrinsics.j(coreExtensionVersion, "coreExtensionVersion");
        Intrinsics.j(analyticsExtensionVersion, "analyticsExtensionVersion");
        String strD = d(coreExtensionVersion, analyticsExtensionVersion);
        return !i.a(strD) ? strD : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    private f() {
    }
}
