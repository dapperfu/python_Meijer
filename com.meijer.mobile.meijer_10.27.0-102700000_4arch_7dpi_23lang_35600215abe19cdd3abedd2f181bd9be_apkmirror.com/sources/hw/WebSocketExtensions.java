package hw;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\rBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, d2 = {"Lhw/i;", "", "", "perMessageDeflate", "", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "clientOriginated", "a", "(Z)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "Ljava/lang/Integer;", "c", "d", "e", "f", "g", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@IgnoreJRERequirement
/* renamed from: hw.i, reason: from toString */
/* loaded from: classes13.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final boolean perMessageDeflate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final Integer clientMaxWindowBits;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final boolean clientNoContextTakeover;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final Integer serverMaxWindowBits;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final boolean serverNoContextTakeover;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final boolean unknownValues;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhw/i$a;", "", "<init>", "()V", "Lokhttp3/Headers;", "responseHeaders", "Lhw/i;", "a", "(Lokhttp3/Headers;)Lhw/i;", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: hw.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WebSocketExtensions a(Headers responseHeaders) throws IOException {
            Intrinsics.j(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer numV = null;
            boolean z11 = false;
            Integer numV2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (StringsKt.H(responseHeaders.h(i10), "Sec-WebSocket-Extensions", true)) {
                    String strP = responseHeaders.p(i10);
                    int i11 = 0;
                    while (i11 < strP.length()) {
                        int i12 = i11;
                        int iL = Rv.h.l(strP, ',', i12, 0, 4, null);
                        int iJ = Rv.h.j(strP, ';', i12, iL);
                        String strE = Rv.h.E(strP, i12, iJ);
                        int i13 = iJ + 1;
                        if (StringsKt.H(strE, "permessage-deflate", true)) {
                            if (!z10) {
                                z13 = true;
                                while (i13 < iL) {
                                    int iJ2 = Rv.h.j(strP, ';', i13, iL);
                                    int iJ3 = Rv.h.j(strP, '=', i13, iJ2);
                                    String strE2 = Rv.h.E(strP, i13, iJ3);
                                    String strM0 = iJ3 < iJ2 ? StringsKt.M0(Rv.h.E(strP, iJ3 + 1, iJ2), "\"") : null;
                                    int i14 = iJ2 + 1;
                                    if (StringsKt.H(strE2, "client_max_window_bits", true)) {
                                        if (numV != null) {
                                            z13 = true;
                                        }
                                        numV = strM0 != null ? StringsKt.v(strM0) : null;
                                        i13 = numV == null ? i14 : i14;
                                    } else if (StringsKt.H(strE2, "client_no_context_takeover", true)) {
                                        if (z11) {
                                            z13 = true;
                                        }
                                        if (strM0 != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z11 = true;
                                    } else if (StringsKt.H(strE2, "server_max_window_bits", true)) {
                                        if (numV2 != null) {
                                            z13 = true;
                                        }
                                        numV2 = strM0 != null ? StringsKt.v(strM0) : null;
                                        if (numV2 == null) {
                                        }
                                    } else if (StringsKt.H(strE2, "server_no_context_takeover", true)) {
                                        if (z12) {
                                            z13 = true;
                                        }
                                        if (strM0 != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z12 = true;
                                    }
                                }
                                i11 = i13;
                                z10 = true;
                            }
                            z13 = true;
                        } else {
                            i11 = i13;
                            z13 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z10, numV, z11, numV2, z12, z13);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.e(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.e(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    public WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.perMessageDeflate = z10;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z11;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z12;
        this.unknownValues = z13;
    }

    public final boolean a(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.perMessageDeflate) * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.clientNoContextTakeover)) * 31;
        Integer num2 = this.serverMaxWindowBits;
        return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.serverNoContextTakeover)) * 31) + Boolean.hashCode(this.unknownValues);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public /* synthetic */ WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }
}
