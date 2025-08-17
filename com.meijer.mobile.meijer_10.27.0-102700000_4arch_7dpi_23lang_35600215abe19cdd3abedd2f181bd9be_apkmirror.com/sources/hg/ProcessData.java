package hg;

import Hv.C3694e0;
import Hv.InterfaceC3718z;
import Hv.n0;
import Hv.r0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001c\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0015¨\u0006!"}, d2 = {"Lhg/v;", "", "", "pid", "", "uuid", "<init>", "(ILjava/lang/String;)V", "seen0", "LHv/n0;", "serializationConstructorMarker", "(IILjava/lang/String;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "c", "(Lhg/v;LGv/d;LFv/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.v, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class ProcessData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/ProcessData.$serializer", "LHv/z;", "Lhg/v;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lhg/v;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lhg/v;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: hg.v$a */
    public /* synthetic */ class a implements InterfaceC3718z<ProcessData> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f134944a;
        private static final Fv.f descriptor;

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            return new Dv.b[]{Hv.E.f13269a, r0.f13359a};
        }

        static {
            a aVar = new a();
            f134944a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.google.firebase.sessions.ProcessData", aVar, 2);
            c3694e0.p("pid", false);
            c3694e0.p("uuid", false);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        public final Fv.f a() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final ProcessData d(Gv.e decoder) {
            int iF;
            String strR;
            int i10;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            n0 n0Var = null;
            if (cVarC.n()) {
                iF = cVarC.F(fVar, 0);
                strR = cVarC.r(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                iF = 0;
                int i11 = 0;
                String strR2 = null;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else if (iV == 0) {
                        iF = cVarC.F(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iV != 1) {
                            throw new UnknownFieldException(iV);
                        }
                        strR2 = cVarC.r(fVar, 1);
                        i11 |= 2;
                    }
                }
                strR = strR2;
                i10 = i11;
            }
            cVarC.a(fVar);
            return new ProcessData(i10, iF, strR, n0Var);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, ProcessData value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            ProcessData.c(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhg/v$b;", "", "<init>", "()V", "LDv/b;", "Lhg/v;", "serializer", "()LDv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: hg.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<ProcessData> serializer() {
            return a.f134944a;
        }
    }

    public /* synthetic */ ProcessData(int i10, int i11, String str, n0 n0Var) {
        if (3 != (i10 & 3)) {
            Hv.Z.a(i10, 3, a.f134944a.a());
        }
        this.pid = i11;
        this.uuid = str;
    }

    @JvmStatic
    public static final /* synthetic */ void c(ProcessData self, Gv.d output, Fv.f serialDesc) {
        output.f(serialDesc, 0, self.pid);
        output.v(serialDesc, 1, self.uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) other;
        return this.pid == processData.pid && Intrinsics.e(this.uuid, processData.uuid);
    }

    public ProcessData(int i10, String uuid) {
        Intrinsics.j(uuid, "uuid");
        this.pid = i10;
        this.uuid = uuid;
    }

    /* renamed from: a, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* renamed from: b, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (Integer.hashCode(this.pid) * 31) + this.uuid.hashCode();
    }

    public String toString() {
        return "ProcessData(pid=" + this.pid + ", uuid=" + this.uuid + ')';
    }
}
