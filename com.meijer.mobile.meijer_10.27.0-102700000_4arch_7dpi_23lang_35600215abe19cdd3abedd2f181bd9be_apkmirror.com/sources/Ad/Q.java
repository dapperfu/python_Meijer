package Ad;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.medallia.digital.mobilesdk.q2;
import java.util.Arrays;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001eBS\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rBc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J+\u0010)\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010*JC\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b2\u00101J+\u00103\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b4\u00101J\u000f\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b7\u00106J-\u0010:\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\tH\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010=\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\b=\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8GX\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010KR,\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\bM\u0012\b\b?\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00020L8G¢\u0006\u0006\u001a\u0004\bN\u0010OR,\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\bM\u0012\b\b?\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00100L8G¢\u0006\u0006\u001a\u0004\bP\u0010OR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR-\u0010R\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\bM\u0012\b\b?\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00170L8Ç\u0002¢\u0006\u0006\u001a\u0004\bR\u0010OR\u0011\u0010S\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010U\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bU\u0010TR\u0011\u0010V\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010W\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bW\u0010TR\u0011\u0010X\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bX\u0010TR-\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\bM\u0012\b\b?\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00170L8Ç\u0002¢\u0006\u0006\u001a\u0004\bY\u0010OR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bZ\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\b[\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\b]\u0010\u001bR\u0011\u0010_\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\b^\u00106R\u001a\u0010\u0003\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\\\u001a\u0004\b`\u0010\u001bR\u0011\u0010d\u001a\u00020a8G¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity;", "Lkd/a;", "", "uid", "", "packageName", "attributionTag", "listenerId", "", "Lgd/c;", "clientFeatures", "impersonator", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "pid", "clientSdkVersion", "Lcom/google/android/gms/libs/identity/ClientType;", "clientType", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/libs/identity/Impersonator;", "asImpersonator", "(Landroid/content/Context;)Lcom/google/android/gms/libs/identity/Impersonator;", "", "permissions", "checkAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkPermissions", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "enforceAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)V", "enforceFirstParty", "(Landroid/content/Context;)V", "enforcePackageName", "enforcePermissions", "enforceZeroParty", "forAggregation", "()Lcom/google/android/gms/libs/identity/ClientIdentity;", "getImpersonator", "impersonatee", "impersonateeListenerId", "impersonate", "(Landroid/content/Context;Lcom/google/android/gms/libs/identity/ClientIdentity;Ljava/lang/String;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "feature", "supportsFeature", "(Lgd/c;)Z", "name", "", "version", "(Ljava/lang/String;J)Z", "_clientSdkVersion", "Ljava/lang/Integer;", "_clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "Ljava/lang/String;", "getAttributionTag", "Ljava/util/List;", "getClientFeatures", "()Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "getClientSdkVersion", "()Lkotlin/jvm/functions/Function1;", "getClientType", "Lcom/google/android/gms/libs/identity/ClientIdentity;", "isFirstParty", "isImpersonatedIdentity", "()Z", "isMyProcess", "isMyUid", "isMyUser", "isSystemServer", "isZeroParty", "getListenerId", "getPackageName", "I", "getPid", "getRealIdentity", "realIdentity", "getUid", "Landroid/os/UserHandle;", "getUserHandle", "()Landroid/os/UserHandle;", "userHandle", "Companion", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class Q extends AbstractC15136a {

    /* renamed from: a, reason: collision with root package name */
    private final int f214a;

    /* renamed from: b, reason: collision with root package name */
    private final String f215b;

    /* renamed from: c, reason: collision with root package name */
    private final String f216c;

    /* renamed from: d, reason: collision with root package name */
    private final String f217d;

    /* renamed from: e, reason: collision with root package name */
    private final List f218e;

    /* renamed from: f, reason: collision with root package name */
    private final Q f219f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2835y f213g = new C2835y(null);

    @JvmField
    public static final Parcelable.Creator<Q> CREATOR = new s0();

    static {
        Process.myUid();
        Process.myPid();
    }

    @Deprecated
    public Q(int i10, String packageName, String str, String str2, List list, Q q10) {
        Intrinsics.j(packageName, "packageName");
        if (q10 != null && q10.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f214a = i10;
        this.f215b = packageName;
        this.f216c = str;
        this.f217d = str2 == null ? q10 != null ? q10.f217d : null : str2;
        if (list == null) {
            list = q10 != null ? q10.f218e : null;
            if (list == null) {
                list = p0.o();
                Intrinsics.i(list, "of(...)");
            }
        }
        Intrinsics.j(list, "<this>");
        p0 p0VarP = p0.p(list);
        Intrinsics.i(p0VarP, "copyOf(...)");
        this.f218e = p0VarP;
        this.f219f = q10;
    }

    public final boolean equals(Object other) {
        if (other instanceof Q) {
            Q q10 = (Q) other;
            if (this.f214a == q10.f214a && Intrinsics.e(this.f215b, q10.f215b) && Intrinsics.e(this.f216c, q10.f216c) && Intrinsics.e(this.f217d, q10.f217d) && Intrinsics.e(this.f219f, q10.f219f) && Intrinsics.e(this.f218e, q10.f218e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f214a), this.f215b, this.f216c, this.f217d, this.f219f});
    }

    public final String toString() {
        int length = this.f215b.length() + 18;
        String str = this.f216c;
        StringBuilder sb2 = new StringBuilder(length + (str != null ? str.length() : 0));
        sb2.append(this.f214a);
        sb2.append(q2.f92724c);
        sb2.append(this.f215b);
        String str2 = this.f216c;
        if (str2 != null) {
            sb2.append("[");
            if (StringsKt.W(str2, this.f215b, false, 2, null)) {
                sb2.append((CharSequence) str2, this.f215b.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        if (this.f217d != null) {
            sb2.append(q2.f92724c);
            String str3 = this.f217d;
            sb2.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        int i10 = this.f214a;
        int iA = C15137b.a(dest);
        C15137b.n(dest, 1, i10);
        C15137b.w(dest, 3, this.f215b, false);
        C15137b.w(dest, 4, this.f216c, false);
        C15137b.w(dest, 6, this.f217d, false);
        C15137b.u(dest, 7, this.f219f, flags, false);
        C15137b.A(dest, 8, this.f218e, false);
        C15137b.b(dest, iA);
    }

    public final boolean zza() {
        return this.f219f != null;
    }
}
