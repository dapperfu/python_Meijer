package Qv;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LQv/r;", "", "", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "i", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    public static final r f31478c = new r("HTTP_1_0", 0, "http/1.0");

    /* renamed from: d, reason: collision with root package name */
    public static final r f31479d = new r("HTTP_1_1", 1, "http/1.1");

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final r f31480e = new r("SPDY_3", 2, "spdy/3.1");

    /* renamed from: f, reason: collision with root package name */
    public static final r f31481f = new r("HTTP_2", 3, "h2");

    /* renamed from: g, reason: collision with root package name */
    public static final r f31482g = new r("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");

    /* renamed from: h, reason: collision with root package name */
    public static final r f31483h = new r("QUIC", 5, "quic");

    /* renamed from: i, reason: collision with root package name */
    public static final r f31484i = new r("HTTP_3", 6, "h3");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ r[] f31485j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f31486k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String protocol;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQv/r$a;", "", "<init>", "()V", "", "protocol", "LQv/r;", "a", "(Ljava/lang/String;)LQv/r;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Qv.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final r a(String protocol) throws IOException {
            Intrinsics.j(protocol, "protocol");
            r rVar = r.f31478c;
            if (Intrinsics.e(protocol, rVar.protocol)) {
                return rVar;
            }
            r rVar2 = r.f31479d;
            if (Intrinsics.e(protocol, rVar2.protocol)) {
                return rVar2;
            }
            r rVar3 = r.f31482g;
            if (Intrinsics.e(protocol, rVar3.protocol)) {
                return rVar3;
            }
            r rVar4 = r.f31481f;
            if (Intrinsics.e(protocol, rVar4.protocol)) {
                return rVar4;
            }
            r rVar5 = r.f31480e;
            if (Intrinsics.e(protocol, rVar5.protocol)) {
                return rVar5;
            }
            r rVar6 = r.f31483h;
            if (Intrinsics.e(protocol, rVar6.protocol)) {
                return rVar6;
            }
            r rVar7 = r.f31484i;
            if (StringsKt.W(protocol, rVar7.protocol, false, 2, null)) {
                return rVar7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }
    }

    static {
        r[] rVarArrA = a();
        f31485j = rVarArrA;
        f31486k = EnumEntriesKt.a(rVarArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f31478c, f31479d, f31480e, f31481f, f31482g, f31483h, f31484i};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f31485j.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    private r(String str, int i10, String str2) {
        this.protocol = str2;
    }
}
