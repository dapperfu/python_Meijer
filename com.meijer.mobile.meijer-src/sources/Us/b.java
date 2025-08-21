package Us;

import Dv.n0;
import Dv.r0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0014\u0019B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"LUs/b;", "", "", "error", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "c", "(LUs/b;LCv/d;LBv/f;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getError$annotations", "()V", "b", "getErrorDescription$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String error;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String errorDescription;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LUs/b$b;", "", "<init>", "()V", "Lzv/b;", "LUs/b;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Us.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<b> serializer() {
            return a.f37705a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @JvmStatic
    public static final /* synthetic */ void c(b self, Cv.d output, Bv.f serialDesc) {
        if (output.z(serialDesc, 0) || self.error != null) {
            output.t(serialDesc, 0, r0.f6781a, self.error);
        }
        if (!output.z(serialDesc, 1) && self.errorDescription == null) {
            return;
        }
        output.t(serialDesc, 1, r0.f6781a, self.errorDescription);
    }

    public /* synthetic */ b(int i10, String str, String str2, n0 n0Var) {
        if ((i10 & 1) == 0) {
            this.error = null;
        } else {
            this.error = str;
        }
        if ((i10 & 2) == 0) {
            this.errorDescription = null;
        } else {
            this.errorDescription = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public b(String str, String str2) {
        this.error = str;
        this.errorDescription = str2;
    }

    public /* synthetic */ b(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
