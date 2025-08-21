package com.okta.authfoundation.client;

import Dv.n0;
import Dv.r0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0013\u0011B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/okta/authfoundation/client/e;", "", "", "atHash", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "b", "(Lcom/okta/authfoundation/client/e;LCv/d;LBv/f;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getAtHash$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String atHash;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/okta/authfoundation/client/e$b;", "", "<init>", "()V", "Lzv/b;", "Lcom/okta/authfoundation/client/e;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.client.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<e> serializer() {
            return a.f120637a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @JvmStatic
    public static final /* synthetic */ void b(e self, Cv.d output, Bv.f serialDesc) {
        if (!output.z(serialDesc, 0) && self.atHash == null) {
            return;
        }
        output.t(serialDesc, 0, r0.f6781a, self.atHash);
    }

    public /* synthetic */ e(int i10, String str, n0 n0Var) {
        if ((i10 & 1) == 0) {
            this.atHash = null;
        } else {
            this.atHash = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getAtHash() {
        return this.atHash;
    }

    public e(String str) {
        this.atHash = str;
    }

    public /* synthetic */ e(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
