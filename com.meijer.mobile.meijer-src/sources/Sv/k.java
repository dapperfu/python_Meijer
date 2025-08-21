package Sv;

import Mv.r;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LSv/k;", "", "LMv/r;", "protocol", "", "code", "", "message", "<init>", "(LMv/r;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "LMv/r;", "b", "I", "c", "Ljava/lang/String;", "d", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final r protocol;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final String message;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSv/k$a;", "", "<init>", "()V", "", "statusLine", "LSv/k;", "a", "(Ljava/lang/String;)LSv/k;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Sv.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final k a(String statusLine) throws IOException {
            r rVar;
            int i10;
            String strSubstring;
            Intrinsics.j(statusLine, "statusLine");
            if (StringsKt.W(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    rVar = r.f20500c;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    rVar = r.f20501d;
                }
            } else if (StringsKt.W(statusLine, "ICY ", false, 2, null)) {
                rVar = r.f20500c;
                i10 = 4;
            } else {
                if (!StringsKt.W(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                rVar = r.f20501d;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String strSubstring2 = statusLine.substring(i10, i11);
            Intrinsics.i(strSubstring2, "substring(...)");
            Integer numV = StringsKt.v(strSubstring2);
            if (numV == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int iIntValue = numV.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                strSubstring = statusLine.substring(i10 + 4);
                Intrinsics.i(strSubstring, "substring(...)");
            }
            return new k(rVar, iIntValue, strSubstring);
        }
    }

    public k(r protocol, int i10, String message) {
        Intrinsics.j(protocol, "protocol");
        Intrinsics.j(message, "message");
        this.protocol = protocol;
        this.code = i10;
        this.message = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.protocol == r.f20500c) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.code);
        sb2.append(' ');
        sb2.append(this.message);
        return sb2.toString();
    }
}
