package Rv;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/f;", "", "", "socketEnabledCipherSuites", "c", "(Lokhttp3/f;[Ljava/lang/String;)[Ljava/lang/String;", "Lokhttp3/j;", "Lkotlin/Pair;", "Ljava/nio/charset/Charset;", "b", "(Lokhttp3/j;)Lkotlin/Pair;", "a", "(Lokhttp3/j;)Ljava/nio/charset/Charset;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
/* loaded from: classes13.dex */
public final class a {
    public static final Charset a(okhttp3.j jVar) {
        Charset charsetD;
        return (jVar == null || (charsetD = okhttp3.j.d(jVar, null, 1, null)) == null) ? Charsets.UTF_8 : charsetD;
    }

    public static final Pair<Charset, okhttp3.j> b(okhttp3.j jVar) {
        Charset charset = Charsets.UTF_8;
        if (jVar != null) {
            Charset charsetD = okhttp3.j.d(jVar, null, 1, null);
            if (charsetD == null) {
                jVar = okhttp3.j.INSTANCE.b(jVar + "; charset=utf-8");
            } else {
                charset = charsetD;
            }
        }
        return TuplesKt.a(charset, jVar);
    }

    public static final String[] c(okhttp3.f fVar, String[] socketEnabledCipherSuites) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return fVar.getCipherSuitesAsString() != null ? h.w(fVar.getCipherSuitesAsString(), socketEnabledCipherSuites, okhttp3.e.INSTANCE.c()) : socketEnabledCipherSuites;
    }
}
